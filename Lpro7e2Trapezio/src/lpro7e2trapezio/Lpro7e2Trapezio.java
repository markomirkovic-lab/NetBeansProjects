/*
 * LPRO Es. 7.2 Trapezio
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package lpro7e2trapezio;

import java.util.Scanner;

public class Lpro7e2Trapezio {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float baseMaggiore;
        float baseMinore;
        float altezza;
        float areaTrapezio;
        
        System.out.print("Inserisci lunghezza base maggiore: ");
        baseMaggiore = in.nextFloat();
        in.nextLine();
        
        System.out.print("Inserisci lunghezza base minore: ");
        baseMinore = in.nextFloat();
        in.nextLine();
        
        System.out.print("Inserisci lunghezza altezza: ");
        altezza = in.nextFloat();
        in.nextLine();
        
        areaTrapezio = (baseMaggiore + baseMinore)*altezza/2;
        
        System.out.println("Area trapezio: " + areaTrapezio);
        
        
    }
    
}
