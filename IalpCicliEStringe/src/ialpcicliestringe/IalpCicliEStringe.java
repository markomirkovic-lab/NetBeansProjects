/**
 * Teoria Cicli e stringe
 *
 * 
 * @author marko.mirkovic
 * Version 29.11.2021
 */
package ialpcicliestringe;

import java.util.Scanner;

public class IalpCicliEStringe
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        String nome; 
 
        System.out.println("Immetti il tuo nome: ");
        nome=input.next();
        for(int i=0; i<nome.length(); i++)
        {     
            System.out.println(nome.charAt(i));
            //break;
        }
    }
    
}
