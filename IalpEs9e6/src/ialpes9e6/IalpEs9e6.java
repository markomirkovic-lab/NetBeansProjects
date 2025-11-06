/**
 * Es. 9.6 Numero
 *
 * @author marko.mirkovic
 * Version 14.11.2021
 */
package ialpes9e6;

import java.util.Scanner;


public class IalpEs9e6 {

    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int X;
        
        System.out.print("Declare variable X: ");
        X = input.nextInt();
        
        if(X%2 == 0)
        {
            X = X / 2;
            System.out.println("X = " + X);
        }
        else
        {
            X = (X * 3) - 1;
            System.out.println("X = " + X);
        }
        
    
    }
    
}
