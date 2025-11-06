/*
 * Lpro Primo Test - Sottostinga valore consentito
 *
 * @author marko.mirkovic
 * Version 17.11.2021
 */
package sottostringavaloreconsentito;

import java.util.Scanner;

public class SottostringaValoreConsentito {


    public static void main(String[] args) {
        
        String f = "Valore è consentito";
        
        int b;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserici da quale posizione partire: ");
        
        b = input.nextInt();
            input.nextLine();
            
        if (b>=0){
            System.out.println(f.substring(b).toUpperCase());
        } else {
            System.out.println("Valore non consentito\n");
            //System.out.println("\n");        
            System.out.println("Inserici da quale posizione partire: ");
            b = input.nextInt();
            input.nextLine();
        }     
        
        
        
        input.close();
        
    }
    
}
