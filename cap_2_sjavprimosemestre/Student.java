package cap_2_sjavprimosemestre;

/**
 * Classe Student - sottoclasse della superclasse Person
 * @author marko.mirkovic
 * @version 12.09.2022
 */
public class Student extends Person//extends estente la Student
{
    private String schoolClass;
    private double averageGrade;

    //
    //ctrl + spazio
    public Student(String firstName, String lastName,
                   int day, int month, int year, char gender,
                   String schoolClass, double averageGrade)
    {
        //super chiama il costruttore della superclasse per poter passare i dati
        super(firstName, lastName, day, month, year, gender);//Prendi dalla superclasse
        this.schoolClass = schoolClass;
        this.averageGrade = averageGrade;
        
        //se non mettiamo il super
        //super implicto esiste ma e' vuoto
        //usa:
            //nullary constructor della classe Person
        //    public Person()
        //    {
        //        
        //    }
    }
     
    // Questa produce errore:
    //    public Student(String schoolClass, double averageGrade)
    //    {
    //        this.schoolClass = schoolClass;
    //        this.averageGrade = averageGrade;
    //    }

    public String getSchoolClass()
    {
        return this.schoolClass;
    }

    public void setSchoolClass(String schoolClass)
    {
        this.schoolClass = schoolClass;
    }

    public double getAverageGrade()
    {
        return this.averageGrade;
    }

    public void setAverageGrade(double averageGrade)
    {
        this.averageGrade = averageGrade;
    }
//
//    @Override
//    public String toString()
//    {
//        return "Student{" + "schoolClass=" + schoolClass + ", averageGrade=" + averageGrade + '}';
//    }
    
    
    @Override
    public String toString()
    {
        return super.toString() +
                "Student{" + "schoolClass=" + schoolClass + ", averageGrade=" +
                averageGrade + '}';
    }
    
    
    
    
}
