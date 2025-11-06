/**
 * LPRO Indovina il numero (esercizio iniziale)
 *
 * 
 * @author marko.mirkovic
 * Version 30.11.2021
 */
package lproindovinailnumeroinizo;

import java.util.Scanner;


public class LproIndovinaIlNumeroInizo
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        int min = 8;
        int max = 10;
        int nroUtente;
        int nro;
        double Piu5;
        double Meno5;
        double Piu10;
        double Meno10;
        int tentativo = 0;
        
        nro = (int)(Math.random() * (max-min+1)) + min;

        Piu5 =  (nro + (nro * (5.0 / 100.0)));
        Meno5 = (nro - (nro * (5.0 / 100.0)));
                
        Piu10 =  (nro + (nro * (10.0 / 100.0)));
        Meno10 = (nro - (nro * (10.0 / 100.0)));
        
              
        System.out.print("Inserici un numero intero tra 0 e 100: ");
        nroUtente = input.nextInt();
        input.nextLine();
        
        System.out.println(nroUtente);
        System.out.println(nro);
        //System.out.println(min);
        //System.out.println(max);
        System.out.println(Piu5);
        System.out.println(Meno5);
        System.out.println(Piu10);
        System.out.println(Meno10);
        
        
        
        if(nroUtente >= Meno5 && nroUtente <= Piu5)
        {
            System.out.println("Fuoco");
        } else if(nroUtente >= Meno10 && nroUtente <= Piu10)
                {
                    System.out.println("Fuochino");
                } else
        {
            System.out.println("Acqua");
        }
        ++tentativo;
        System.out.println("tenativo:" + tentativo);
        
        
    }
    
}
