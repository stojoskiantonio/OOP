import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class Main {
    public static void main(String[] args) {
        Lek lek = new Lek("Augmentin", new String[]{"Glavobolka, Kaslica"}, 1200);
        String filename = "lekovi.xml";
        try {
            XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
            XMLStreamWriter writer = outputFactory.createXMLStreamWriter(new FileWriter(filename));

            writer.writeStartDocument();
            writer.writeStartElement("Lekovi");
            writer.writeStartElement("Lek");
            writer.writeStartElement("Ime");
            writer.writeCharacters(lek.getIme());
            writer.writeEndElement();
            writer.writeStartElement("Nesakani dejstva");
            for (String nd : lek.getNesakaniDejstva()) {
                writer.writeStartElement("nd");
                writer.writeCharacters(nd);
                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeStartElement("Cena");
            writer.writeCharacters(String.valueOf(lek.getCena()));
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndDocument();

        }

        catch (IOException | XMLStreamException e) {
            System.out.println("Greska");
        }
    }
}