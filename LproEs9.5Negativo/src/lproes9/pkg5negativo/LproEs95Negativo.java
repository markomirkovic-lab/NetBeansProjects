/*
 * Esercizio 9.5 Negativo?
 * 
 *
 * @author marko.mirkovic
 * Version 18.11.2021
 */
package lproes9.pkg5negativo;

import java.util.Scanner;

public class LproEs95Negativo {

    
    public static void main(String[] args) {
        
        int numero;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Iserici un numero positivo o negativo: ");
        numero = input.nextInt();
        input.nextLine();
        
        if(numero > 0){
            System.out.println("Il numero è positivo: " + numero);
        } else if(numero>0){
            System.out.println("Il numero è negativo: " + numero);
        } else {
            System.out.println("Il numero è zero: " + numero);
        }
        
        input.close();
        
        
        
    }
    
}
