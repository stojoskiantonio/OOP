public class App {
    public static void main(String[] args) throws Exception {
        Brojach b = new Brojach();
        Paricka p = new Paricka();

        String rez = p.FrliParicka();
        for (int i = 0; i < 100; i++) {
        if (p.FrliParicka() == "glava") {
            b.ZgolemiBrojachGlava();
        }

        else {
            b.ZgolemiBrojachPetka();
        }
    }
    }
}
