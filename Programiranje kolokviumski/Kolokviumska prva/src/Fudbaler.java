public class Fudbaler extends Sportist{
    String pol; 
    
   public Fudbaler (String name, String lastName, int yearOfBirth, double salary, String pol) {
        super(name, lastName, yearOfBirth, salary);
        this.pol = pol;
    }

    void taxesOfFootballer () {
        double taxes = salary * 0.05;
        salary = salary - taxes;
    }
}
