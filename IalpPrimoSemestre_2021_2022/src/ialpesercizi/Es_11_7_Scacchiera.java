
package ialpesercizi;

import java.util.Scanner;

/**
 * Esercizio 11.6 - Strettamente Crescente Bis
 * 
 * Scrivete un programma che, dopo aver letto da tastiera il numero di celle,
 * riempia un array come se fosse una scacchiera, usando lo spazio e il *.
 * Es: se l’utente immette 5 l’array sarà 
 * 
 *   * * *
 *    * *
 *   * * *
 *    * *
 *   * * *
 * 
 * @author Marko Mirkovic
 * @version 23.01.2022
 */


public class Es_11_7_Scacchiera
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
       
        int numeroDimensione;
        
        System.out.println("Scrivi il numero intero della dimensione:");
        numeroDimensione = tastiera.nextInt();
        
        int numeroArray[][] = new int[numeroDimensione][numeroDimensione];
        
        for(int indice1 = 0; indice1<numeroArray.length; indice1++)
        {
            for(int indice2 = 0; indice2<numeroArray[indice1].length; indice2++)
            {
                numeroArray[indice1][indice2] = (indice1 + indice2)%2;
                //with numeroDimensione = 5
                //0 + 0 % 2 = 0
                //0 + 1 % 2 = 1
                //0 + 2 % 2 = 0
                //0 + 3 % 2 = 1
                //0 + 4 % 2 = 0
                //0 + 5 % 2 = 1
            }
        }
                       
        for(int indice1 = 0; indice1<numeroArray.length; indice1++)
        {
            for(int indice2 = 0; indice2<numeroArray[indice1].length; indice2++)
            {
                if((indice1 + indice2)%2 == 0)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                    //System.out.println("");
                }
            }
            System.out.println("");
        }
        
        System.out.println("");
       
        /*
        run:
        Scrivi il numero intero della dimensione:
        5
        * * *
         * * 
        * * *
         * * 
        * * *
        
        run:
        Scrivi il numero intero della dimensione:
        8
        * * * * 
         * * * *
        * * * * 
         * * * *
        * * * * 
         * * * *
        * * * * 
         * * * *
        */
        
        //NON FUNZIONA BENE CON NUMERI PARI
        
    }
}
