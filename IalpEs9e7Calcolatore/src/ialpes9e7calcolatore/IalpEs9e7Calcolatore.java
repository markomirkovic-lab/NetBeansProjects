/**
 * Esercizio 9.7 Calcolatore
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package ialpes9e7calcolatore;

import java.util.Scanner;

public class IalpEs9e7Calcolatore
{


    public static void main(String[] args)
    {
        char operatore;
        
        //int a = 2;
        //int b = 5;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first operand: ");
        //input.hasNextInt();
        int operand1 = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter first operand: ");
        //input.hasNextInt();
        int operand2 = input.nextInt();
        input.nextLine();
        
        System.out.print("Enter operator: ");
        operatore = input.next().trim().charAt(0);
        input.nextLine();
                
        
        
        //char operatore1 = '+';
        //char operatore2 = '-';
        //char operatore3 = '*';
        //char operatore4 = '/';
        
        
        
        /*
        input.hasNextInt()) {
        int operand 1 = input.nextInt();
        
        
        


        */
        
        
        
   
        
        switch(operatore)
        {
            case '+':
                //operatore=operatore1;
                System.out.println(operand1 + operand2);
                //reulst = ;
                break;
            case '-':
                //operatore=operatore2;
                System.out.println(operand1 - operand2);
                break;
            case '*':
                //operatore=operatore3;
                System.out.println(operand1 * operand2);
                break;
            case '/':
                //operatore=operatore4;
                System.out.println(operand1 / operand2);
                break;
            case '%':
                //operatore=operatore4;
                System.out.println(operand1 / operand2);
                break;
        }
    }
    
}
