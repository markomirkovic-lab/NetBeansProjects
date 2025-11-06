package ialpesercizi;

import java.util.Scanner;

/**
 * Esercizio 11.6 - Strettamente Crescente
 * 
 * Scrivete un programma che chiede all’utente di inserire dei numeri interi
 * e li inserisce in un array. C’è però una condizione, il numero immesso
 * deve essere sempre maggiore dei numeri immessi in precedenza.
 * 
 * @author Marko Mirkovic
 * @version 23.01.2022
 */



public class Es_11_6_StrettameneCrescente
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int numeroInserimenti;
        int numeroTastiera;
        
        System.out.println("Scrivi il numero di inserimenti dei numero:");
        numeroInserimenti = tastiera.nextInt();
        
        int numeroTastieraArray[] = new int[numeroInserimenti];
        
        System.out.println("Inserisci i numeri:");
        for(int indice = 0; indice<numeroInserimenti; indice++)
        {
            numeroTastieraArray[indice] = tastiera.nextInt();
        }
        
        System.out.println("Hai inserito i numeri:");
        for(int indice = 0; indice<numeroInserimenti; indice++)
        {
            System.out.print(numeroTastieraArray[indice] + ", ");
        }
        System.out.println("\u0008\u0008");
        System.out.println("");
       
        /*
        run:
        Scrivi il numero di inserimenti dei numero:
        3
        Inserisci i numeri:
        1
        2
        3
        Hai inserito i numeri:
        1, 2, 3
        
        */
        
    }
}
