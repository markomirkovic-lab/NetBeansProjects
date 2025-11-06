package alprcarenum;

/**
 *
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class Car 
{
    private CarType type;
    private WheelSize size;

    
    public Car(CarType type, WheelSize size)
    {
        this.type = type;
        this.size = size;
    }

       
    public Car(CarType type)
    {
        this.type = type;
    }

    public void setType(CarType type)
    {
        this.type = type;
    }

    public Car(WheelSize size)
    {
        this.size = size;
    }

    public void setSize(WheelSize size)
    {
        this.size = size;
    }
    
    @Override
    public String toString()
    {
        return type + " " + size;
    }
    
   
}
