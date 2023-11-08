public class App {
    public static void main(String[] args) throws Exception {
        Predmet p1 = new Predmet();
        Predmet p2 = new Predmet("OOP", "Ilija Jolevski", 6);
        Predmet p3 = new Predmet("Web Design");

        System.out.println(p1.imeNaPredmet);
        System.out.println(p2.profesor);
        System.out.println(p3.imeNaPredmet);
    }
}
