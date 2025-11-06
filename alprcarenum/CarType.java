package alprcarenum;

/**
 *
 * @author marko.mirkovic
 * @version 18 October 2022
 */

public enum CarType 
{
    CABRIO, PICKUP, SEDAN, CARAVAN;
    
    @Override
    public String toString()
    {
        return name();
    }
}
