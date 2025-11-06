package alprgrado;

/**
 * Esempio classe
 * Testing classe Grado
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class EsempioClasse 
{
    public static void main(String[] args)
    {
        Grado t = new Grado(20.3);
        Grado t2 = new Grado(20.3);
        Grado t3 = new Grado(35.2);
        
        
        //t.getCelsius non necessita di argomenti in quanto l'oggetto t
        //conosce gia' la sua temperature (attributo t)
        System.out.println( "t.getCelsius " + t.getCelsius() );         //20.3
        System.out.println( "t.getFahrenheit " + t.getFahrenheit() );   //68.5
        System.out.println("---");
        //I metodi statici invece non sono legati ad un oggetto e quindi
        //dobbiamo fornirgli in argomento la temperature da convertire (34) (78)
        System.out.println( "Grado.C2F(34) " + Grado.C2F(34) );           //93.2
        System.out.println( "Grado.F2C(78)" + Grado.F2C(78) );           //25.5
        System.out.println("---");
        System.out.println("t " + t);
        System.out.println("t2 " + t2);
        System.out.println("t3 " + t3);
        System.out.println("---");
        System.out.println("t.equals(t2) " + t.equals(t2));
        System.out.println("t2.equals(t3) " + t2.equals(t3));
        System.out.println("---");
        System.out.println("(t instanceof Grado) " + (t instanceof Grado) );
        System.out.println("t.getClass() " + t.getClass() );
        
        //N.B. Grado e' di default Celsius nell'costruttore:
        /*
        public Grado(double temperatura)
        {
            this.temperatura = temperatura;
            //aggiunto this.setCelsius(); per impostare a tipo a Celsius
            this.setCelsius();
        }
        */
        
        /*
        run-single:
        t.getCelsius 20.3
        t.getFahrenheit 68.53999999999999
        ---
        Grado.C2F(34) 93.2
        Grado.F2C(78)25.555555555555554
        ---
        t 20.3°c
        t2 20.3°c
        t3 35.2°c
        ---
        t.equals(t2) true
        t2.equals(t3) false
        ---
        (t instanceof Grado) true
        t.getClass() class alprgrado.Grado
                */
    }
}
