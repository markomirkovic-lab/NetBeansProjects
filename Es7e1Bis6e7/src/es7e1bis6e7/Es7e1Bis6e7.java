/**
 * 7.1 -> Scanner 6.7
 * Conversione del tempo
 * @author marko.mirkovic
 * Version 17.10.2021
 */

package es7e1bis6e7;

import java.util.Scanner;


public class Es7e1Bis6e7
{

   
    public static void main(String[] args)
    {
        int giorni = 0;
        final int ORE_GIORNI = 24;
        final int MIN_GIORNI = 1444;
        final int SEC_GIORNI = 86400;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserici il numero dei giorni: ");
        giorni=input.nextInt();
        
        
        System.out.println("Giorni  " + giorni + " è ugugale a: ");
        System.out.println("Ore     " + giorni * ORE_GIORNI);
        System.out.println("Minuti  " + giorni * MIN_GIORNI);
        System.out.println("Secondi " + giorni * SEC_GIORNI);
        
        /*
        run:
        Inserici il numero dei giorni: 2
        Giorni  2 è ugugale a: 
        Ore     48
        Minuti  2888
        Secondi 172800
        BUILD SUCCESSFUL (total time: 2 seconds)
        */
        
    }
    
}
