/**
 * Lezione video capitolo 11 - Array - 1
 * @author marko.mirkovic
 * @version 19.01.2022
 */

package lezioniVideo;

import java.util.Scanner;

public class LezioneVideoCap11Array1
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
        
        double media = valori/valori;
        System.out.println("valori " + valori);
        System.out.println("media " + media);
        
        /*
        run:
        Vuoi calcolare la media di quanti valori? 
        3
        valori 3
        media 1.0
        */
    }    
}
