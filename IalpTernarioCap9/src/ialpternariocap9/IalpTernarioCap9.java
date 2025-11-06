/**
 * Operatore ternario 
 *
 * @author marko.mirkovic
 * Version 14.11.2021
 */
package ialpternariocap9;


public class IalpTernarioCap9 {

    
    public static void main(String[] args) {
        
        double livello = 5.50;
        
        System.out.println( (livello >= 11.9999 && livello <= 12.0001) ?
                "Livello coretto" : "Livello errato");
        
    }
    
}
