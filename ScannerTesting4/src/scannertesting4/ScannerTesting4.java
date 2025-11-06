/*
 * ScannerTesting4
 * @author Marko Mirkovic
 * @version 17.10.2021
 */
package scannertesting4;

import java.util.Scanner;

public class ScannerTesting4 {

    
    public static void main(String[] args)
    {
        short s=0;
        int i=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserisci uno short: ");
        s=input.nextShort();
        
        System.out.println("Hai inserito: " + s);
        
        System.out.print("Inserisci un int: ");
        i=input.nextInt();
        
        System.out.println("Hai inserito: " + i);
        
        /*
        run:
        Inserisci uno short: 1
        Hai inserito: 1
        Inserisci un int: 1
        Hai inserito: 1
        BUILD SUCCESSFUL (total time: 7 seconds)
        */
        
    }
    
}
