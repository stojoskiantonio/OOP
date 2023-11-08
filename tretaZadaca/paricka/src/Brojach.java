public class Brojach {
    private int brojNaPati;
    private int brojNaGlava;
    private int brojNaPetka;

    public void ZgolemiBrojach() {
        this.brojNaPati++;
    }

    public void ResetirajBrojaci() {
        this.brojNaPati = 0;
        this.brojNaGlava = 0;
        this.brojNaPetka = 0;
    }

    public void ZgolemiBrojachGlava() {
        this.brojNaGlava++;
    }

    public void ZgolemiBrojachPetka() {
        this.brojNaPetka++;
    }
}
