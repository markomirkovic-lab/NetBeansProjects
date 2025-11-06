/**
 * 7.1 -> Scanner 6.3
 * Calcolo delle note scolastiche
 * L'algoritmo per il calcolo della nota dei moduli IALP+ALPR+LPRO
 * @author marko.mirkovic
 * Version 08.11.2021
 */
package es7e1bis6e3soluzione;

import java.util.Scanner;

public class Es7e1Bis6e3Soluzione {

    
    public static void main(String[] args) {
        
        Scanner tastiera=new Scanner(System.in); 
         double ialp, lpro, alpr, media; 
         System.out.print("Inserisci la nota di IALP: ");
         ialp=tastiera.nextDouble(); 
         System.out.print("Inserisci la nota di LPRO: ");
         lpro=tastiera.nextDouble(); 
         System.out.print("Inserisci la nota di ALPR: ");
         alpr=tastiera.nextDouble(); 
         
         media=(ialp+lpro+alpr*2)/4;
         
         
         
         System.out.println("IALP: " + ialp);
         System.out.println("LPRO: " + lpro);
         System.out.println("ALPR: " + alpr);
         System.out.println("\nMedia: " + media);
        
        
    }
    
}
