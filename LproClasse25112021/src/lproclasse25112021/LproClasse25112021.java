/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lproclasse25112021;

import java.util.Scanner;

public class LproClasse25112021
{


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int nro;
        
        do
        {
             do
            {
                System.out.print("Dammi un valore fra 1 e 100: ");
                while(!in.hasNextInt())
                {
                    System.out.print("Ohh grullo! Ti ho chiesto  un numero da 1 a 100! ");
                    in.nextLine();
                }
                nro = in.nextInt();
                in.nextLine();
            } while(nro<1 || nro>100);
        }while(true);
        
       //alt shift F
           
    }
    
}
