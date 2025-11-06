/**
 * Esercizio 8.1 BinaryConverter from positive to negative
 * including validation
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package ialpes8e1scannervalidazione;

import java.util.Scanner;


public class IalpEs8e1ScannerValidazione {

    
    public static void main(String[] args) {
        
        byte a;
        String result = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insert a numeric value: ");
        if(input.hasNextInt())
        {
            a = input.nextByte();
            //String result = "";
            result = "" + (a%2); //1
            
            a /=2;
            result = (a%2) + result; //1
            a /=2;
            result = (a%2) + result; //1
            a /=2;
            result = (a%2) + result; //0
            a /=2;
            result = (a%2) + result; //0
            a /=2;
            result = (a%2) + result; //0
            a /=2;
            result = (a%2) + result; //0
            a /=2;
            result = (a%2) + result; //0
            a /=2;
            result = (a%2) + result; //0
            a /=2;
            
            System.out.println(result);
        } else
            {
                System.out.println("Errore: numero inserito non e' intero");
            }
        
    }
    
}
