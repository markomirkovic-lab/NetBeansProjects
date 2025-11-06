/*
 * Esercizio 9.5 Negativo?
 * 
 *
 * @author marko.mirkovic
 * Version 18.11.2021
 */
package lproes9e5negativo;

import java.util.Scanner;


public class LproEs9e5Negativo {


    public static void main(String[] args) {
        
        int numero;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Iserisci un numero positivo o negativo: ");
        
        //input.nextLine();
        
        if(input.hasNextInt()){
            numero = input.nextInt();
            if(numero > 0){
            System.out.println("Il numero è positivo: " + numero);
            } else if(numero<0){
                System.out.println("Il numero è negativo: " + numero);
            } else if(numero == 0) {
            System.out.println("Il numero è zero: " + numero);
            } 
            } else {
            System.out.println("Non è stato inserito un numero");
        }
        input.close();
    
    
    }
    
}
