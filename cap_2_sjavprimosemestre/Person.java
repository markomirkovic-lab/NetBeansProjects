package cap_2_sjavprimosemestre;

/**
 * (Tools -> Templates -> Java -> Java Main Class / Class)
 * @author marko.mirkovic
 * @version 12.09.2022
 */
public class Person 
{
    private String firstName, lastName;
    private int day, month, year;
    private char gender;

    public Person(String firstName, String lastname, int day, int month,
                  int year, char gender)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
        //this.gender = gender;
        //ternario
        //condizione se gender e' diverso da M o F, allora mette 'U'
        //true ritorna la prima espressione altrimenti la seconda espressione
        this.gender = (gender != 'M' && gender != 'F') ? 'U' : gender;
    }
    
    //nullary constructor
//    public Person()
//    {
//        
//    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastname()
    {
        return this.lastName;
    }

    public void setLastname(String lastname)
    {
        this.lastName = lastName;
    }

    public int getDay()
    {
        return this.day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getYear()
    {
        return this.year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public char getGender()
    {
        //return this.gender;
        return this.gender = (gender != 'M' && gender != 'F') ? 'U' : gender;
    }

    public void setGender(char gender)
    {
        this.gender = gender;
    }
    
    public String getFullName()
    {
        return this.firstName + " " + this.lastName;
    }
    
    
    //sovracrive object
    @Override
    public String toString()
    {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName +
                ", day=" + day + ", month=" + month + ", year=" + year +
                ", gender=" + gender + '}';
    }
    
    //aggiugiamo toString
    

    //public int getAge
    
    //isBlanc
    //isEmpty


}
