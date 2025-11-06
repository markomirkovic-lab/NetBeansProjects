package Car;

/**
 *
 * @author marko.mirkovic
 */
public class MainCar
{

    public static void main(String[] args)
    {



        try
        {
//            cap_2_sjavprimosemestre.Car aA = new cap_2_sjavprimosemestre.Car(600, "");
//            System.out.println("aA cc : " + aA.getCilindrata());
//            System.out.println("aA modello : " + aA.getModello());
            Car aA = new Car(600, "Mercedes");
            System.out.println("aA cc : " + aA.getCilindrata());
            System.out.println("aA modello : " + aA.getModello());
            Car aB = new Car(500, "BMW");
            System.out.println("aB cc : " + aB.getCilindrata());
            System.out.println("aB modello : " + aB.getModello());
            

        } catch (IllegalArgumentException e)
        {
            System.out.println("Dati inseriti sono sbaglati: " + e.getMessage());
        }

        try
        {
//            cap_2_sjavprimosemestre.Car bB = new cap_2_sjavprimosemestre.Car(600, "Audi");
            Car bB = new Car(600, "Audi");
            System.out.println("bB cc : " + bB.getCilindrata());
            System.out.println("bB modello : " + bB.getModello() );

        } catch (IllegalArgumentException e)
        {
            System.out.println("Dati inseriti sono sbaglati: " + e.getMessage());
        }

    }

}
        