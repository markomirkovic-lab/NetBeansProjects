/**
 * IALP cap. 10 ciclo do-while
 * 
 * 
 * @author marko.mirkovic
 * Version 22.11.2021
 */
package ialpcap10ciclidowhile;

import java.util.Scanner;

public class IalpCap10CicliDoWhile
{

    
    public static void main(String[] args)
    {
        
        double nota=0;
        
        
        Scanner tastiera = new Scanner(System.in);
        
        do
        {   System.out.print("Inserire una nota fra 1 e 6: ");
            nota=tastiera.nextDouble(); 
        } while(nota<1.0 || nota>6.0);
            System.out.println(nota);
        
        
    }
    
}
