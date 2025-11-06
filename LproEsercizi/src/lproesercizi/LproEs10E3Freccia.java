/**
 * LPRO Es. 10.2 DateDiff
 * 
 * @author marko.mirkovic
 * @version 09.12.2021
 */


package lproesercizi;


import java.util.Scanner;


public class LproEs10E3Freccia
{
    public static void main(String[] args)
    {
        int base = 0;
        int pari = 0;
        int dispari = 0;
        
        
        
               
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserici la dimensione della base: ");
        base = input.nextInt();
        input.nextLine();
        
        
        
        for(int i=0;i<base;i++)
        {
            for(int k=0;k<base;k++)
            {
                if(k==0)
                {
                    //System.out.println("*");
                }
                
                if(k==1)
                {
                    //System.out.println("**");
                }
                
                if(i==2)
                {
                    //System.out.println("***");
                }
                
                if(i==3)
                {
                    //System.out.println("****");
                }
                System.out.println(i + " " + k );
                
            }
        //System.out.println("*");
        } 
        
    }
}
