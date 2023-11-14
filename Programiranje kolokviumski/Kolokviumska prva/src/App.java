public class App {
    public static void main(String[] args) throws Exception {
        Sportist sport = new Sportist("Antonio", "Stojoski", 2002, 196520);
        Fudbaler fudbaler = new Fudbaler("Irina", "Jovanoska", 2005, 295401, "Zenski");
        Rakometar rakometar = new Rakometar("Dacoski", "Daco", 2004, 219052, 650);

        rakometar.taxesOfHandballer();
        fudbaler.taxesOfFootballer();

        System.out.println("Fudbaler: " + fudbaler.name + " " + fudbaler.lastName + " " + fudbaler.yearOfBirth + " " + fudbaler.salary);
    }
}
