public class Jabolko implements IComparable{
    private String boja;
    private String golemina;
    private String sorta;

    // prv konstruktor
    public Jabolko(String boja, String golemina, String sorta) {
        this.boja = boja;
        this.golemina = golemina;
        this.sorta = sorta;
    }
   // vtor konstruktor
    public Jabolko(String golemina, String sorta) {
        boja = "Crvena";
        this.golemina = golemina;
        this.sorta = sorta;
    }

    void setBoja() {
        this.boja = boja;
    }

    String getBoja() {
        return boja;
    }

    void setGolemina() {
        this.golemina = golemina;
    }

    String getGolemina() {
        return golemina;
    }

    void setSorta() {
        this.sorta = sorta;
    }

    String getSorta() {
        return sorta;
    }

    @Override
    public int compareTo(Jabolko other) {
        if (this.golemina.equals(other.getGolemina())) {
            return 0;
        }

        else if (this.golemina.equals("Mala")|| (this.golemina.equals("Sredno")) && (this.golemina.equals("Golemo"))) {
            return -1;
        }

        else {
            return 1;
        }
    }

    public String toString() {
        return "Boja: " + boja + " Golemina: " + golemina + " Sorta: " + sorta;
    }

   public int hashCode() {
        int result = 0;
        result = boja.hashCode() + golemina.hashCode() + sorta.hashCode();
        return result;
    }



}
