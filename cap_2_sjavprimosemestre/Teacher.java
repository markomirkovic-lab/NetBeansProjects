package cap_2_sjavprimosemestre;

/**
 * Classe Teacher - sottoclasse della superclasse Person
 * @author marko.mirkovic
 * @version 12.09.2022
 */

//se non si estende la classe si estende l'object (che ha il nullary contructor
//
public class Teacher extends Person
{
    private double salary;
    private String schoolName;

    public Teacher(double salary, String shoolName, String firstName,
                   String lastName, int day, int month, int year, char gender)
    {
        super(firstName, lastName, day, month, year, gender);
        this.salary = salary;
        this.schoolName = shoolName;
    }

    
//    public Teacher(double salary, String schoolName)
//    {
//        this.salary = salary;
//        this.schoolName = schoolName;
//    }

    public double getSalary()
    {
        return this.salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public String getSchoolName()
    {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName)
    {
        this.schoolName = schoolName;
    }

//    @Override
//    public String toString()
//    {
//        return super.toString() +
//                    "Teacher{" + "salary=" + salary + ", schoolName=" +
//                    schoolName + '}';
//                
//    }
    
    //una classe di utilita puo' essere utilizzata in altri contesti e non
    //deve contenere un print
    @Override
    public String toString()
    {
        return super.toString() +
                    "\nTeacher{" + "salary=" + salary + 
                    ", schoolName=" + schoolName + '}';
                
    }
    
    
    
}
