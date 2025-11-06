package cap_2_sjavprimosemestre;

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
            Car aA = new Car(600, "");
            System.out.println("aA cc : " + aA.getCilindrata());
            System.out.println("aA modello : " + aA.getModello());

        } catch (IllegalArgumentException e)
        {
            System.out.println("Dati inseriti sono sbaglati: " + e.getMessage());
        }

        try
        {
            Car bB = new Car(600, "Audi");
            System.out.println("bB cc : " + bB.getCilindrata());
            System.out.println("bB modello : " + bB.getModello() );

        } catch (IllegalArgumentException e)
        {
            System.out.println("Dati inseriti sono sbaglati: " + e.getMessage());
        }

    }

}
        