/**
 * Esercizio 10.4 Inversione
 * @author marko.mirkovic
 * @version 02.12.2021
 */

/*
Scrivete un programma che chiede l’immissione di un numero intero e
ne stampi uno con le cifre invertite, non potete utlizzare la String.
Es: se immetto 123 otterrò a video 321. 
*/

package lproesercizi;

import java.util.Scanner;

public class Lpro10e4Inversione
{
    public static void main(String[] args)
    {
        int numero;
        int sommaI = 0;
        int numeroInvertito;
               
        
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Immetti un numero e premi enter: ");
        numero = input.nextInt();
        input.nextLine();
        
        int mille = numero%1000;
        int cento = numero%100;
        int deci = numero%10;
        int uno = numero%1;
        
        int modulo = 1;
        //int cntr = i;
        
        
        for(int i=1;i<=numero;i++)
        {
            //System.out.println(i);
            //System.out.println(numero%i);
            //sommaI = i;
            //modulo = numero%(i*cntr*10);
            
            
            
        }
        //System.out.println(sommaI);
        System.out.println(modulo);
    }
}
