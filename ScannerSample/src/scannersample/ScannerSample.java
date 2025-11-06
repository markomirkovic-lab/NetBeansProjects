/**
 * IALP Scanner Sample
 * 
 * @author marko.mirkovic
 * Version 11.10.2021
 */
package scannersample;

import java.util.Scanner;


public class ScannerSample {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Insert your name: ");
        System.out.println("Hello " + in.next());
    }
    
}
