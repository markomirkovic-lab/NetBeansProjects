/**
 * Es. 9.1 Nota (Nota non valida)
 *
 * @author marko.mirkovic
 * Version 14.11.2021
 */
package ialpes9e1notanonvalida;

import java.util.Scanner;

/**
 *
 * @author marko.mirkovic
 */
public class IalpEs9e1NotaNonValida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Inserisci nota: ");
        nota = input.nextDouble();
        
         if(nota<1.0 || nota>10.0) //Oppure if(!(nota>=1.0 && nota<=6.0))
        {
            System.out.println("Nota non valida!");
        }
        else
        {
            System.out.println("Nota valida: " + nota);
        }
          
    }
    
}
