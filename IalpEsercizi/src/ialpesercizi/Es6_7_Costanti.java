/**
 * IALP Esercizio Costanti
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;


public class Es6_7_Costanti
{
    public static void main(String[] args)
    {
        final int ORE=24;
        final int MINUTI=60*ORE;
        final int SECONDI=60*MINUTI;
        int giorni, ore, minuti, secondi;
        
        giorni=1;
        
        ore=giorni*ORE;
        minuti=giorni*MINUTI;
        secondi=giorni*SECONDI;
        
        System.out.print(giorni);
        System.out.println(" giorni, corrispondono a:");
        System.out.print(ore);
        System.out.println("h");
        System.out.print(minuti);
        System.out.println("\'");
        System.out.print(secondi);
        System.out.println("\"");
    }
}
