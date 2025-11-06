package ialpesercizi;

import java.util.Scanner;

/**
 * Esercizio 11.3 - Fiori
 *
 * Scrivete un programma che memorizza in un array i nomi di alcuni fiori
 * e in un secondo array il costo di ogni mazzo di fiori.
 * L’utente può immettere il nome del fiore e il programma restituirà il
 * prezzo al mazzo di quel fiore.
 * 
 * @author Marko Mirkovic
 * @version 23.01.2022
 */




public class Es_11_3_Fiori
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int numeroDiFiori;
        
        System.out.println("Scrivi il numero dei tipi di fiori:");
        numeroDiFiori = tastiera.nextInt();
        
        //Abbiamo bisogno di 2 array
        
        //Array nome
        String nomeFiore [] = new String[numeroDiFiori];
        
        //Array stipendi
        double prezzoAlMazzo [] = new double[numeroDiFiori];
        
        System.out.println("Inserisci i nomi dei fiori:");
        for(int indice = 0; indice<numeroDiFiori; indice++)
        {
            nomeFiore[indice] = tastiera.next();
        }
        
        System.out.println("Inserisci i prezzi al mazzo dei fiori:");
        for(int indice = 0; indice<numeroDiFiori; indice++)
        {
            prezzoAlMazzo[indice] = tastiera.nextDouble();
        }
        
        
        System.out.println("Imettere il nome del fiore di ricerca:");
        String nomeFioreRicerca = tastiera.next().trim();
        
        
        System.out.println("I stipendi inferiori al stipendio di ricerca sono:");
        for(int indice = 0; indice<numeroDiFiori; indice++)
        {
            if(nomeFioreRicerca.equals(nomeFiore[indice]))
            {
                System.out.println("Nome fiore: " + nomeFiore[indice] +
                               ", prezzo al mazzo: " + prezzoAlMazzo[indice]);
            }    
            
        }            
        
        
        /*
        run:
        Scrivi il numero dei tipi di fiori:
        3
        Inserisci i nomi dei fiori:
        Rose
        Tulipani
        Malva
        Inserisci i prezzi al mazzo dei fiori:
        32
        18
        9
        Imettere il nome del fiore di ricerca:
        Tulipani
        I stipendi inferiori al stipendio di ricerca sono:
        Nome fiore: Tulipani, prezzo al mazzo: 18.0
        */
        
        
        
    }
}
