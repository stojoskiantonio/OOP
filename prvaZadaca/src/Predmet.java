public class Predmet {
    public String imeNaPredmet;
    public String profesor;
    public int krediti;
    public int semestar;

    public Predmet() {
    }

    //vtoriot dinamicen konstruktor
    public Predmet(String imeNaPredmet) {
        this.imeNaPredmet = "Nema ime";
    }

    public Predmet (String imeNaPredmet, String profesor, int krediti) {
        this.imeNaPredmet = imeNaPredmet;
        this.profesor = profesor;
        this.krediti = krediti;
    }
}
