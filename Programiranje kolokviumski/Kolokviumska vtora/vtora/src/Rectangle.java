import java.lang.Math;
public class Rectangle {
    private float b;
    private float a;

    public Rectangle (float a, float b) {
        this.a = a;
        this.b = b;
    }

    void findDiagonal() {
        float csquare = (a*a) + (b*b);
        float c = (float) Math.sqrt(csquare);
        System.out.println("Diagonal is " + c);
    }
}
