/**
 * LPRO Indovina il numero (esercizio finale)
 *
 * 
 * @author marko.mirkovic
 * Version 30.11.2021
 */
package lproindovinailnumero;

import java.util.Scanner;


public class LproIndovinaIlNumero
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        int min = 1;
        int max = 100;
        int nroUtente;
        int nro;
        double piu5;
        double meno5;
        double piu10;
        double meno10;
        int tentativo = 0;
        
        nro = (int)(Math.random() * (max-min+1)) + min;

        piu5 =  (nro + ((max-min+1) * (5.0 / 100.0)));
        meno5 = (nro - ((max-min+1) * (5.0 / 100.0)));
                
        piu10 =  (nro + ((max-min+1) * (10.0 / 100.0)));
        meno10 = (nro - ((max-min+1) * (10.0 / 100.0)));
        
              
        
        /*
        //System.out.println(nroUtente);
        System.out.println(nro);
        //System.out.println(min);
        //System.out.println(max);
        System.out.println(piu5);
        System.out.println(meno5);
        System.out.println(piu10);
        System.out.println(meno10);
        */
        //System.out.println(nro);        
        do
        {
            System.out.print("Inserici un numero intero tra 0 e 100: ");
            nroUtente = input.nextInt();
            input.nextLine();
            
            if(nroUtente == nro)
            {
                System.out.println("Bravo,hai vinto!");
            } 
            else if(nroUtente >= meno5 && nroUtente <= piu5)
            {
                System.out.println("Fuoco");
            } 
            else if(nroUtente >= meno10 && nroUtente <= piu10)
            {
                System.out.println("Fuochino");
            } 
            else
            {
                System.out.println("Acqua");
            }
            ++tentativo;
            System.out.println("tenativo:" + tentativo);
                    
        } while (nroUtente != nro);
        
    }
    
}
