/**
 * IALP Palindromo
 *
 * 
 * @author marko.mirkovic
 * Version 29.11.2021
 */
package ialppalindromo;

import java.util.Scanner;

public class IalpPalindromo
{

    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String accu = "";
        String parola = "";
        //parola = parola;
        
        System.out.print("Inserici una parola: ");
        parola = input.nextLine().trim(); //toUpperCase(); //o ignore case
        //input.nextLine();
        
        
        for(int i = 0; i < parola.length(); i++ )
        {
            accu += parola.charAt(parola.length()-1-i);
        }
        
        if(parola.equalsIgnoreCase(accu))
        {
            System.out.println("PALINDROMO");
        }
        
        else
        {
            System.out.println("NON PALINDROMO");
        }
        
        System.out.println(parola);
        System.out.println(accu);
        
    }
    
}
