/**
 * Esercizio 10.6 Genere
 * @author marko.mirkovic
 * @version 02.12.2021
 */

/*
Scrivete un software che legga il vostro nome e determina se è maschile o
femminile. Se termina per a sarà femminile, altrimenti maschile.
Se il nome è Andrea il programma risponde Sia maschile che femminile.
Il programma ripete le operazioni fino a che l’utente inserisce il nome QUIT.
*/

package lproesercizi;

import java.util.Scanner;

public class Lpro10e6Genere
{
    public static void main(String[] args)
    {
        char nome;
        char feminile = 'A';
        //char maschile != 'a';
        int ultimo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Scrivere il nome: ");
        nome = input.next().trim().toUpperCase().charAt(note);
        input.nextLine();
        
        /*
        
        //            0   4     10     17  21 String frase="Tre tigri contro tre tigri!";          //Prima lettera: stamperà ‘T’ System.out.println( frase.charAt(0) ); 
 
//Ultima lettera della frase: stamperà ‘!’ System.out.println( frase.charAt( frase.length()-1 ) );      
 
//Stampa tutto in minuscolo         System.out.println( frase.toLowerCase() ); 
 
//Stampa tutto in maiuscolo  System.out.println( frase.toUpperCase() );                   
 
//Stamperà “contro”         System.out.println( frase.substring(10, 16) );  
 
//Cercare la posizione di partenza di una lettera o parola nella frase //stamperà 4 System.out.println( frase.indexOf("tigri") ); 
 
//Cercare la posizione di partenza dell’ultima occorrenza di una  //lettera o parola nella frase. Stamperà 21 System.out.println( frase.lastIndexOf("tigri") )
        */
        
        /*
        ultimo = lastIndexOf(nome);
        
        ultimo = lastIndexOf("ciao");
        
                //charAt(0);
        
        System.out.println(ultimo);
        */
        
    }
}
