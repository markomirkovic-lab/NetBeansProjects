package cap_2_sjavprimosemestre;

/**
 *
 * @author marko.mirkovic
 */
public class PersonApp 
{
    
    public static void main(String[] args)
    {
        Person p = new Person("Franco", "Califano", 15, 4, 1999, 'M');
        System.out.println(p);//scrivere p o p.toString() e' uguale
        //Person{firstName=Franco, lastName=null, day=15, month=4, year=1999, gender=M}
        System.out.println();
        
        Student st = new Student("Pippo", "Baudo", 23, 8, 1935, 'M', "SSIG", 5.3);
        System.out.println(st);
        
        //Teacher tc = new Teacher("Minie", "Moon", 13, 2, 1969, "F", 100000, 5.3, "SSIG");
        //Teacher tc2 = new Teacher(0, shoolName, firstName, lastName, 0, 0, 0, 0)
    }
}
