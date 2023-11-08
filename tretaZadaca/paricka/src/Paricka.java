import java.util.Random;


public class Paricka {
    public String FrliParicka() {
        Random random = new Random();
        int x = random.nextInt(100);

        if (x < 50) {
            return "glava";
        }
        else return "petka";
    }
}
