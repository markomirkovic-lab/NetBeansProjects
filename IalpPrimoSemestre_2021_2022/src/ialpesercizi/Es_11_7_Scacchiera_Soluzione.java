/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ialpesercizi;

import java.util.Scanner;

/**
 * Array (Soluzioni) Es. 11. 7 - Scacchiera
 * @author marko.mirkovic
 * @version 03.04.2022
 */
public class Es_11_7_Scacchiera_Soluzione
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        int dimensione, max;
        char[][] scacchiera;
        
        System.out.print("Dimensione scacchiera: ");
        dimensione=in.nextInt();
        
        scacchiera=new char[dimensione][dimensione];
        
        //Riempiamo la griglia
        for(int r=0; r<scacchiera.length; r++)
        {
            for(int c=0; c<scacchiera[r].length; c++)
            {
                if(( r%2==0 && c%2==0) //Se riga pari e colonna pari
                || //oppure
                (r%2!=0 && c%2!=0)) //riga dispari e colonna dispari
                /*
                    
                    0   1   2   3   4   5
                0   PP      PP      PP
                1       DD      DD      DD
                2   PP      PP      PP
                3       DD      DD      DD
                4   PP      PP      PP
                5       DD      DD      DD
                */    
                {
                    scacchiera[r][c]='*';
                }
                else
                {
                    scacchiera[r][c]=' ';
                }
            }
        }  
        
        //Stampiamo la griglia
        for(int r=0; r<scacchiera.length; r++)
        {
            for(int c=0; c<scacchiera[r].length; c++)
            {
                System.out.print(scacchiera[r][c]);
            }
        System.out.println();
        }
        
        /*
        run:
        Dimensione scacchiera: 5
        * * *
         * * 
        * * *
         * * 
        * * *
        */
    }
}
