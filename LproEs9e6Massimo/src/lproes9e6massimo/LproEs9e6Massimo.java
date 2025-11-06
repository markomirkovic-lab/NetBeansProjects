/*
 * Esercizio 9.6 Massimo
 * 
 *
 * @author marko.mirkovic
 * Version 18.11.2021
 */
package lproes9e6massimo;

import java.util.Scanner;

public class LproEs9e6Massimo {


    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int numero3;
        int massimo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserire il primo numero: ");
        numero1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Inserire il primo numero: ");
        numero2 = input.nextInt();
        input.nextLine();
        
        System.out.print("Inserire il primo numero: ");
        numero3 = input.nextInt();
        input.nextLine();
        
        if( (numero1 < numero2) && (numero1 < numero3) ){
            
            }else if (numero2 < numero3){
                massimo = numero3;
                System.out.println("Numero massimo: " + massimo);
            } else{
                massimo = numero2;
                System.out.println("Numero massimo: " + massimo);
                
        }
        
        input.close();
    }
    
}
