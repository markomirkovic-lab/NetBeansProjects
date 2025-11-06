/**
 * Triangolo -> Scanner
 *
 * @author marko.mirkovic
 * Version 17.10.2021
 */
package triangolo1;

import java.util.Scanner;


public class Triangolo1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int baseTriangolo = 0;
        int altezzaTriangolo = 0;
        boolean triangoloLungo = false;
        boolean triangoloAlto = false;
        
        System.out.println("Scrivere la misura della base del triangolo: ");
        baseTriangolo = input.nextInt();
        
        System.out.println("Scrivere la misura della altezza del triangolo: ");
        altezzaTriangolo = input.nextInt();
        
        triangoloLungo = baseTriangolo > altezzaTriangolo;
        System.out.println("Triangolo più lungo che alto: " + triangoloLungo);
        
        triangoloAlto = baseTriangolo < altezzaTriangolo;
        System.out.println("Triangolo più alto che lungo: " + triangoloAlto);
        
              
        
        
    }
    
}
