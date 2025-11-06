package alprclasse;

/**
 *
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class ZZZ_Day 
{
    public static void main(String[] args)
    {
        
        //Ogni valore definito in un enum e' accesabile come costante statica
        Day d1 = Day.MONDAY;
        Day d2 = Day.TUESDAY;
        
        
        //Tutti i valori di enum sono accessibili tramite metodo values()
        //che ritona un array
        Day [] daysOfWeek = Day.values();
        
        for(int i = 0; i < daysOfWeek.length; i++)
        {
            System.out.println("daysOfWeek[i] " + daysOfWeek[i]);
        }
        
        //oppure
        for(Day day : Day.values())
        {
            System.out.println("(day) " + (day));
        }
                
        //metodo valueOf converte una stringa nel corripondente valore costante
        Day day1 = Day.valueOf("MONDAY");
        Day day2 = Day.valueOf("WEDNESDAY");
        
        System.out.println("day1 " + day1);
        System.out.println("day2 " + day2);
        
        
        //Ogni valore costante di un enum è un oggetto ed esporta una serie
        //di metodi utili.
        
        //Confronto di valori enumerati
        //== o equals
        
        Day day = Day.MONDAY;
        if(day == Day.SATURDAY || day == Day.SUNDAY)
        {
            System.out.println(":)");
        }
        else if(day.equals(Day.MONDAY))
        {
            System.out.println(":(");
        }
        else
        {
            System.out.println(":|");
        }
        
        //E' possiblile utilizzare i valori enum per i casi del costrutto switch:
        
        switch (day) 
        { 
            case SUNDAY: 
                System.out.println("CLOSED"); 
                break; 
            case MONDAY: 
                System.out.println("12:00-18:30"); 
                break; 
            case THURSDAY: 
                System.out.println("08:00-21:00"); 
                break; 
            case TUESDAY: 
            case WEDNESDAY: 
            case FRIDAY: 
                System.out.println("08:00-18:30"); 
                break; 
            case SATURDAY: 
                System.out.println("08:00-17:00"); 
                break; 
        }

        //Ordinale di un valore enum 
        //Il numero ordinale di un valore, ossia l’indice che esso occupa
        //nell’elenco dei valori definiti in un enum, è accessibile tramite
        //il metodo ordinal(). 
        
        
        //Array index
        //  0       1       2         3         4          5       6
        //SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        
        //Day day1 = Day.valueOf("MONDAY");
        //Day day2 = Day.WEDNESDAY;
        System.out.println( "day1.ordinal() " + day1.ordinal() );
        System.out.println( "day2.ordinal() " + day2.ordinal() );
        
        System.out.println( "Day.MONDAY.toString() " + Day.MONDAY.toString() );
        
              
        /*
        run-single:
        daysOfWeek[i] MONDAY
        daysOfWeek[i] TUESDAY
        daysOfWeek[i] WEDNESDAY
        daysOfWeek[i] THURSDAY
        daysOfWeek[i] FRIDAY
        daysOfWeek[i] SATURDAY
        (day) MONDAY
        (day) TUESDAY
        (day) WEDNESDAY
        (day) THURSDAY
        (day) FRIDAY
        (day) SATURDAY
        day1 MONDAY
        day2 WEDNESDAY
        :(
        12:00-18:30
        day1.ordinal() 1
        day2.ordinal() 3
        Day.MONDAY.toString() Monday
        */
    }
}
