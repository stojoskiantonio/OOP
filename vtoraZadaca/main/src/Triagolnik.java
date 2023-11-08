public class Triagolnik {
    private long a;
    public long getA() {
        return a;
    }
    public void setA(long a) {
        this.a = a;
    }
    private long b;
    public long getB() {
        return b;
    }
    public void setB(long b) {
        this.b = b;
    }
    private long c;
    public void setC(long c) {
        this.c = c;
    }
    public long getC() {
        return c;
    }

     public Triagolnik(long a, long b, long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public long Plostina () {
        return a * b / c;
    }

    public long Perimetar() {
        return a + b + c;
    }

    public void zgolemiA() {
        this.a = a + 3;
    }

    public void zgolemiA(int zaKolku) {
        this.a = a + zaKolku;
    }
}
