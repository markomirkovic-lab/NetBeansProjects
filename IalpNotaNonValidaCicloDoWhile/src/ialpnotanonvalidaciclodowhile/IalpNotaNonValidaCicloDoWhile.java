/**
 * Teoria (Nota non valida con ciclo do-while)
 *
 * CICLO DO-WHILE POST-CONDIZIONALE
 * 
 * @author marko.mirkovic
 * Version 29.11.2021
 */
package ialpnotanonvalidaciclodowhile;

import java.util.Scanner;

public class IalpNotaNonValidaCicloDoWhile
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double nota=0;
        
        do
        {
        System.out.print("Inserire una nota fra 1 e 6: ");
        nota= input.nextDouble();
        }
        while(nota<1.0 || nota>6.0);
        System.out.println(nota); 
        
        
    }
    
}
