public class App {
    public static void main(String[] args) throws Exception {
        Triagolnik t = new Triagolnik(6, 12, 5);
        System.out.println(t.Perimetar());
        System.out.println(t.Plostina());
        t.zgolemiA();
        t.zgolemiA(13);
    }
}
