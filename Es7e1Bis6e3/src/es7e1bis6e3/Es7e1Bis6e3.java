/**
 * 7.1 -> Scanner 6.3
 * Calcolo delle note scolastiche
 * L'algoritmo per il calcolo della nota dei moduli IALP+ALPR+LPRO
 * @author marko.mirkovic
 * Version 17.10.2021
 */

package es7e1bis6e3;

import java.util.Scanner;


public class Es7e1Bis6e3 {

    
    public static void main(String[] args)
    {
        final byte pesoIalp = 2;
        final byte pesoAlpr = 2;
        final byte pesoLpro = 1;
        float nMaterie = pesoIalp + pesoAlpr + pesoLpro;
        
        float notaIalp = 0.0F;
        float notaAlpr = 0.0F;
        float notaLpro = 0.0F;
        float mediaNote;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserici nota IALP: ");
        notaIalp=input.nextFloat();
 
        System.out.print("Inserisci nota ALPR: ");
        //input.nextLine(); //mode nextLine()
        notaAlpr=input.nextFloat();
        
        System.out.print("Inserici nota LPRO: ");
        //input.nextLine(); //mode nextLine()
        notaLpro=input.nextFloat();
        
        mediaNote = ((int)( 0.5F + ((pesoIalp*notaIalp) + (pesoAlpr*notaAlpr) +
                    (pesoLpro*notaLpro)) * 1.0F ) / nMaterie) / 1.0F;
        System.out.println("La media note IALP, ALPR e LPRO = " + mediaNote);
        
        /*
        run:
        Inserici nota IALP: 5.7
        Inserisci nota ALPR: 5.8
        Inserici nota LPRO: 5.9
        La media note IALP, ALPR e LPRO = 5.8
        BUILD SUCCESSFUL (total time: 5 seconds)
        */
    }
    
}
