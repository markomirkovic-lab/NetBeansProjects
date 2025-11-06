package alprclasse;

/**
 *
 * @author marko.mirkovic
 * @version 17 October 2022
 */

public enum Day 
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    
    @Override
    public String toString()
    {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}
