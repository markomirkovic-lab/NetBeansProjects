package sjav;

/**
 *
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class MiaApplicazione 
{
    public static void main(String[] args)
    {
        Sjav uno = new Sjav("primo oggetto");
        Sjav due = new Sjav("secondo oggetto");
        
        
        
        System.out.println("uno.getNome(): " + uno.getNome());
        System.out.println("due.getNome(): " + due.getNome());
        System.out.println("Sjav.VERSION: " + Sjav.VERSION);
        System.out.print("Sjav.getVersion() :");
        Sjav.getVersion();
        System.out.println("---");
        System.out.println("uno.getClass(): " + uno.getClass());
        //String x = uno instanceof;
        System.out.println("uno.getIniziale(): " + uno.getIniziale());

        System.out.println("Sjav.class.getClasses(): " + Sjav.class.getClasses());
        
        /*
        run-single:
        uno.getNome(): primo oggetto
        due.getNome(): secondo oggetto
        Sjav.VERSION: 1
        Sjav.getVersion() :1
        ---
        uno.getClass(): class sjav.Sjav
        uno.getIniziale(): p
        Sjav.class.getClasses(): [Ljava.lang.Class;@87aac27
        */
    }
}
