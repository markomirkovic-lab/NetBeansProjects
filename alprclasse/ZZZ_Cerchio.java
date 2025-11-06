package alprclasse;

/**
 * Main della classe Cerchio
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class ZZZ_Cerchio 
{
    public static void main(String[] args)
    {
        //Uso metodi statici
        System.out.printf("Un cerchio di raggio %f ha una circonferenza"
                + " pari a %f\n", 10.0, Cerchio.getCirconferenza(10.0));
        
        System.out.printf("Un cerchio di raggio %f ha un area"
                + " pari a %f\n", 10.0, Cerchio.getArea(10.0));
        
        System.out.println("---");
        
        //Uso metodi di istanza
        //Istanzio un cerchio di raggio 10 e ne stampo la circonferenza e l'area
        Cerchio cerchio = new Cerchio(10.0);
        
        System.out.printf("Un cerchio di raggio %f ha una circonferenza"
                + " pari a %f\n", 10.0, cerchio.getCirconferenza());
        
        System.out.printf("Un cerchio di raggio %f ha un area"
                + " pari a %f\n", 10.0, cerchio.getArea());
        
        /*
        run-single:
        Un cerchio di raggio 10.000000 ha una circonferenza pari a 62.831853
        Un cerchio di raggio 10.000000 ha un area pari a 314.159265
        ---
        Un cerchio di raggio 10.000000 ha una circonferenza pari a 62.831853
        Un cerchio di raggio 10.000000 ha un area pari a 314.159265
        */
    }
}
