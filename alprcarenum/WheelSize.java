package alprcarenum;

/**
 *
 * @author marko.mirkovic
 * @version 18 October 2022
 */


public enum WheelSize 
{
    SMALL, BIG;
    
    @Override
    public String toString()
    {
        return name();
    }
}
