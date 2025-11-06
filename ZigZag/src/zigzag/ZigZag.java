/**
 * Esercizio ZigZag
 * 
 *
 * Scrivi la classe Java ZigZag. Tale classe deve utilizzare il carattere
 * ‘/’ (slash) e il carattere ‘' (back-slash) per disegnare un tratteggio
 * verticale infinito. Il disegno deve essere realizzato esattamente come
 * illustrato nell’esempio seguente:
 * 
 * 
 * \
 *  \
 *   \
 *    \
 *    /
 *   /
 *  /
 * /
 * \
 * ...
 * 
 * @author marko.mirkovic
 * Version 22.11.2021
 */

package zigzag;


public class ZigZag
{

   
    public static void main(String[] args)
    {
        while (true) {
            System.out.print(
                    "\\\n"
                    + " \\\n"
                    + "  \\\n"
                    + "   \\\n"
                    + "   /\n"
                    + "  /\n"
                    + " /\n"
                    + "/\n"
            );
    }
    
        
        
    }
}
