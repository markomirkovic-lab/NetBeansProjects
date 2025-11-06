
package ialpesercizi;

import java.util.Scanner;

/**
 * Array (Soluzioni) Es. 11. 3 con Boolean
 * @author marko.mirkovic
 * @version
 */
public class Es_11_3_FioriBooleanSoluzione
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        String[] nome=new String[3];
        double[] costo=new double[3];
        String fiore;
        double prezzo;
        boolean find;//New variable
        
        nome[0]="Rose"; costo[0]=10;
        nome[1]="Margherite"; costo[1]=7;
        nome[2]="Tulipani"; costo[2]=12;
        
        do
        {
            System.out.println("\n\n--------------");
            System.out.println("Gestione fiori");
            System.out.print("Che fiore vuoi acquistare? ");
            fiore=in.next();
            find=false;
            for(int i=0; i<nome.length; i++)
            {
                if(nome[i].equals(fiore))
                {
                    System.out.println(fiore + " costa " + costo[i] +
                    " al mazzo.");
                    find=true;
                    //break;
                }
            }
            if(!find)
            {
                System.out.println("Fiore non trovato");
            }
            System.out.println("\n\nAltro fiore? [s/n]");
        }while(in.next().charAt(0)=='s');
    }
}
