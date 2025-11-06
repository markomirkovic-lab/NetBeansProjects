package alprcarenum;

/**
 *
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class ZzzCar 
{
    public static void main(String[] args)
    {
        //Car myCar = new Car("CABRIO", "BIG");
        
        //Car myCar = new Car;
        
        Car myCar = new Car(CarType.CABRIO, WheelSize.BIG);
        
        myCar.setType(CarType.CABRIO);
        
                
        System.out.println("myCar " + myCar);
        //System.out.println("myCar.type() " + myCar.type());
        
        System.out.println("myCar.toString() " + myCar.toString());
        
        System.out.println("myCar.toString() " + myCar);
        
    }
}
