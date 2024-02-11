public class Lek {
    private String ime;
    private String[] nesakaniDejstva;
    private int cena;

    public Lek(String ime, String[] nesakaniDejstva, int cena) {
        this.ime = ime;
        this.nesakaniDejstva = nesakaniDejstva;
        this.cena = cena;
    }

    public String getIme () {
        return ime;
    }

    public String[] getNesakaniDejstva() {
        return nesakaniDejstva;
    }

    public int getCena() {
        return cena;
    }
}
