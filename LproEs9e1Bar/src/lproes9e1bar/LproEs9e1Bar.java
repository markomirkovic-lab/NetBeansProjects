/*
 * Esercizio 9.1 Bar
 * 
 *
 * @author marko.mirkovic
 * Version 18.11.2021
 */
package lproes9e1bar;


import java.util.Scanner;


public class LproEs9e1Bar {

    
    public static void main(String[] args) {
        
        int ETÀ;
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Immeti la tua età: ");
        ETÀ = input.nextInt();
        input.nextLine();
        
        if (ETÀ < 18){
            System.out.println("Troppo giovane per bere alcolici");
        } else if (ETÀ >= 18 && ETÀ <65){
            System.out.println("Puoi bere moderatamente");
        } else {
            System.out.println("Hai diritto ad uno sconto");
        }
        
        input.close();
        
        
    }
    
}
