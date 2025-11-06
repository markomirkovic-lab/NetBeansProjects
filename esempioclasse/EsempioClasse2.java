package esempioclasse;

/**
 *
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class EsempioClasse2 
{
    
    public static void distruttore()
    {
        Persona x = new Persona("Simone", "Giudice");
    }
        
    public static void main(String[] args)
    {
        distruttore();
        System.gc();
    }
}
