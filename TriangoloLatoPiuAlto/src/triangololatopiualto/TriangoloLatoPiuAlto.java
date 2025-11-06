/*
 * Lpro Primo Test - Triangolo lato più alto
 *
 * @author marko.mirkovic
 * Version 17.11.2021
 */
package triangololatopiualto;

import java.util.Scanner;

public class TriangoloLatoPiuAlto {

    
    public static void main(String[] args) {
        
        Float b;//base
        Float h;//altezza
        Float a;//area
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserire base: ");
        b = input.nextFloat();
        input.nextLine();
        
        System.out.print("Inserire altezza: ");
        h = input.nextFloat();
        input.nextLine();
        
        a = (b*h)/2;//area triangolo = (base * altezza) / 2
        
        System.out.println("L'area è: " + a);
        
        if(b>h){
            System.out.println("Triangolo più largo che alto");
        }
        else{
            System.out.println("Triangolo più alto che largo");
        }
        
        
        input.close();
        
    }
    
}
