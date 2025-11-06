/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ialpesercizi;

import java.util.Scanner;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public class Es_11_3_FioriBooleanSoluzione2
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        String[] nome={"Rose", "Margherite", "Tulipani"};
        double[] costo={10   ,            7,        12};
        String fiore;
        double prezzo;
        boolean find;
        
        
        do
        {
            System.out.println("\n\n--------------");
            System.out.println("Gestione fiori");
            System.out.print("Che fiore vuoi acquistare? ");
            fiore=in.next();
            find=false;
                for(int i=0; i<nome.length; i++)
                {
                    if(nome[i].equals(fiore))
                    {
                    System.out.println(fiore + " costa " + costo[i]
                    + " al mazzo.");
                    find=true;
                    //break;
                    }
                }
            if(!find)
            {
                System.out.println("Fiore non trovato");
            }
        System.out.println("\n\nAltro fiore? [s/n]");
        }while(in.next().charAt(0)=='s');
    }
}
