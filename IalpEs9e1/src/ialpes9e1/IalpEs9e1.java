/**
 * Es. 9.1 Note universitarie
 *
 * @author marko.mirkovic
 * Version 14.11.2021
 */
package ialpes9e1;

import java.util.Scanner;


public class IalpEs9e1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double nota;
        
        System.out.println("Inserisci nota: ");
        nota = input.nextDouble();
        
        /*
        if(nota<1)
            System.out.println("Nota troppo bassa!");
        else if(nota>10)
            System.out.println("Nota troppo alta!");
        else
            System.out.println("Nota: " + nota);
        */
        
        if(nota<1)//1 if (iniziale)
        {
            System.out.println("Nota troppo bassa!");
        }
        else if(nota>10)//+ else if
        {
            System.out.println("Nota troppo alta!");
        }
        else// 1 else (finale)
        {
            System.out.println("Nota: " + nota);
        }
    }
    
}
