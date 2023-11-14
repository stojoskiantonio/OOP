public class Rakometar extends Sportist{
    int numOfGames;

    public Rakometar (String name, String lastName, int yearOfBirth, double salary, int numOfGames) {
        super(name, lastName, yearOfBirth, salary);
        this.numOfGames = numOfGames;
    }

    void taxesOfHandballer () {
        if (numOfGames > 20) {
            double taxes = salary * 0.11;
            salary = salary - taxes;
        }

        double taxes = salary * 0.07;
        salary = salary - taxes;
    }
}
