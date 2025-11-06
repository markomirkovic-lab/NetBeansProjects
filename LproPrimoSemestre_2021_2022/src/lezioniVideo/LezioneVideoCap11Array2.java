/**
 * Lezione video capitolo 11 - Array - 2
 * @author marko.mirkovic
 * @version 19.01.2022
 */

package lezioniVideo;

import java.util.Scanner;

public class LezioneVideoCap11Array2
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int valori;
        System.out.println("Vuoi calcolare la media di quanti valori? ");
        while(!tastiera.hasNextInt())
        {
            tastiera.nextLine();
        }
        valori = tastiera.nextInt();
        tastiera.nextLine();
        
        double[] valore;             //Dichiarazione tipo e nome array
        valore = new double[valori]; //Allocazione della memoria
                 //(istanziamento array)
             
        
        
        /*
        for(int riga = 0; riga<valori; riga++)
        {
            for(int colonna = 0; colonna<valori; colonna++)
            {
                
            }
        }
        */
        
        
        
        
    }
}
