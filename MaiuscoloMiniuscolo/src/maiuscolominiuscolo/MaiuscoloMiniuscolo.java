
package maiuscolominiuscolo;

/**
 *
 * @author marko.mirkovic
 */
public class MaiuscoloMiniuscolo
{
    public static String changeCase(String s , char outCase)
    {
        if(outCase=='M')
        {
            return s.trim().toUpperCase();
        }
        else if(outCase=='m')
        {
            return s.trim().toLowerCase();
        }
        else
        {
            return s;
        }
    }
    
    public static void main(String[] args)
    {
        String s = changeCase("Ciao", 'm');
        
        System.out.println("s " + s);
    }
    
}
