/*
 * ScannerTesting4
 * @author Marko Mirkovic
 * @version 17.10.2021
 */
package scannertesting5;

import java.util.Scanner;

public class ScannerTesting5 {

   
    public static void main(String[] args)
    {
        short s=0;
        int i=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci uno short: ");
        s=input.nextShort();
        System.out.println("Hai inserito: " + s);
        
        System.out.print("Inserisci un int: ");
        input.nextLine(); //mode nextLine()
        i=input.nextInt();
        System.out.println("Hai inserito: " + i);
        
        
        /*
        In questo modo se l’utente avesse inserito per sbaglio qualche altra
        informazione, verrà ignorata.
        nextLine viene anche impiegata per leggere un testo che contiene
        spazi come ad esempio una frase intera.
        */
        
        /*
        run:
        Inserisci uno short: 7 11
        Hai inserito: 7
        Inserisci un int: 11
        Hai inserito: 11
        BUILD SUCCESSFUL (total time: 11 seconds)
        */
    }
    
}
