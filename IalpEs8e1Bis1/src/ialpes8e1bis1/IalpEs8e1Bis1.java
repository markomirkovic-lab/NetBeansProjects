/**
 * Esercizio 8.1 BinaryConverter Bis 1
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package ialpes8e1bis1;


public class IalpEs8e1Bis1 {

    
    public static void main(String[] args) {
        
        byte a = 7;
        
        String result = "";
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
        
        System.out.println(result); //00000111
        // Stringa 0 + 0 + 0 + 0 + 0 + 1 + 1 + 1
        
        
    }
    
}
