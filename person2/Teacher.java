package person2;

/**
 *
 * @author Neil Otupacca
 * @version 16 September 2022
 */
public class Teacher extends Person {

    private double salary;

    public Teacher(String firstName, String lastName,
                  int birthDay, int birthMonth, int birthYear,
                  double salary) {
        super(firstName, lastName, birthDay, birthMonth, birthYear);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
