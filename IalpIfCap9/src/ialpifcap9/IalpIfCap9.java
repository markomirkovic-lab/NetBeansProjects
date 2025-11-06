/**
 * Operatore if - I
 *
 * @author marko.mirkovic
 * Version 14.11.2021
 */
package ialpifcap9;

import java.util.Scanner;

public class IalpIfCap9 {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota;
        
        System.out.print("Inserisci una nota: ");
        nota=input.nextDouble();
        
        
        /*
        if(nota<1.0 || nota>6.0) //Oppure if(!(nota>=1.0 && nota<=6.0))
            System.out.println("Nota errata!");
        else
            System.out.println("Nota corretta: " + nota);
        */
        
        
        
        if(nota<1.0 || nota>6.0) //Oppure if(!(nota>=1.0 && nota<=6.0))
        {
            System.out.println("Nota errata!");
        }
        else
        {
            System.out.println("Nota corretta: " + nota);
        }
          
        
    }
    
}
