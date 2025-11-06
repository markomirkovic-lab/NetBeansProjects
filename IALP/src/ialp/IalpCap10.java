/**
 * General testing
 * IALP capitolo 10
 * Cicli
 * @author marko.mirkovic
 * @version
 */

package ialp;

import java.util.Scanner;

public class IalpCap10
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int b = 2;
        int i = 10;
        int e = i;
        int p = 1;
        
        System.out.println(b+" elevato "+i+" = ");
        System.out.println("-------------------");
        while(i-- >0)
        {
            p = p * b;
            //System.out.println("-------------------");
            //System.out.println(b+" elevato "+(i)+" = "+p);
            System.out.println(p);
            
        }
        System.out.println("-------------------");
        System.out.println(" = "+p);
        
        /*
        run:
        2 elevato 10 = 
        -------------------
        2
        4
        8
        16
        32
        64
        128
        256
        512
        1024
        -------------------
         = 1024
        
        */
        
        //------------------------------------------------
        
        //Ciclo while
        
        int n;
        boolean dispari = true;
        
        while(dispari)
        {
            System.out.println("Inserici un numero pari: ");
            n = input.nextInt();
            dispari = n%2 !=0;
            if(dispari)
            {
                System.out.println("ERRORE " + n + " non è un numero pari");
            }
        }
        System.out.println("BRAVO!!!");
        
        //-------------------------------------------------
        /*
        run:
        Inserici un numero pari:
        3
        ERRORE3 non è un numero pari
        Inserici un numero pari:
        9
        ERRORE9 non è un numero pari
        Inserici un numero pari:
        11
        ERRORE11 non è un numero pari
        Inserici un numero pari:
        10
        BRAVO!!!
        */
        
        //Ciclo do while
        
        int nn;
        
        do
        {
            System.out.println("Inserici un numero pari: ");
            nn = input.nextInt();
            if(nn%2 != 0)
            {
                System.out.println("ERRORE " + nn + " non è un numero pari");
            }
            else
            {
                System.out.println("BRAVO!!!");
            }
        } while(nn%2 != 0);
        
        //----------------------------------------------------
        
        //Cicli infiniti
        
        
        //Ciclo infinito while
        
        /*
        while(true)
        {
            System.out.println("Hello");
        }
        */
        
        //Ciclo infinito do-while
                
        /*
        do
        {
            System.out.println("Hello");
        } while(true);
        */
        
        //----------------------------------------------------
        
        //Ciclo for
        
        for(int j= 0; j<10; j++)
        {
            System.out.println(j);
        }
        
        /*
        run:
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
        */
        
        //Ciclo while (come for)
        
        int jj = 0;
        while(jj<10)
        {
            System.out.println(jj);
            jj++;// <=> jj = jj + 1;
        }
        /*
        run:
        0
        1
        2
        3
        4
        5
        6
        7
        8
        9
        */
      
        //stampa: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        for (int k = 0; k < 11; k++)
        {
        System.out.print(k + ", ");
        }
        
        System.out.println("");
        
        //stampa: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0,
        for (int k = 10; k >= 0; k--)
        {
        System.out.print(k + ", ");
        }
        
        System.out.println("");
        
        //stampa: 0, 2, 4, 6, 8,
        for (int k = 0; k < 10; k += 2)
        {
            System.out.print(k + ", ");
        }
        
        System.out.println("");
        //stampa: 1, 2, 4, 8, 16, 32, 64,
        for (int k = 1; k < 65; k *= 2)
        {
            System.out.print(k + ", ");
        }
        System.out.println("");
        
        /*
        run:
        0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
        10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 
        0, 2, 4, 6, 8, 
        1, 2, 4, 8, 16, 32, 64, 
        */
        //------------------------------------------------------------
        
        //for con stringe
        
        //cerca l'indice del carattere char '@'
        
        String s = "ciao@miao.bau";
        //          0123456789012
        int cnt = 0;
        
        for(int k = 0; k<s.length();k++)
        {
            char c = s.charAt(k);
            if(c == '@')
            {
                cnt++;
                System.out.println(k);
            }
            //System.out.println(k);//0,...,12
        }
        //run:
        //4

        //Percorro da coda a testa e concateno a destra
        
        String ss = "ciao";
        //           0123
        //Percorro da coda a testa e concateno a destra
        String accu = "";
        for(int k = ss.length()-1; k >= 0;k--)
        {
            accu += ss.charAt(k) ;
            System.out.println("ss.length()   " + (ss.length()));//length = 4
            System.out.println("ss.length()-1 " + (ss.length()-1));//last char pos = 3
            System.out.println("accu          " + (accu));//inverse word
            System.out.println("k             " + (k));//counter number
        }
        System.out.println("");
        System.out.println("accu          " + (accu));//inverse word
        System.out.println("");
        /*
        ss.length()   4
        ss.length()-1 3
        accu          o
        k             3
        ss.length()   4
        ss.length()-1 3
        accu          oa
        k             2
        ss.length()   4
        ss.length()-1 3
        accu          oai
        k             1
        ss.length()   4
        ss.length()-1 3
        accu          oaic // inverse word final outcome
        k             0
        */
        
        //OPPURE Percorro da testa a coda e concateno a sinistra
        //String ss = "ciao";
        //             0123
        String accu2 = "";
        for(int k = 0; k < ss.length();k++)//parte da c poi i poi a poi o 
        {
            accu2 = ss.charAt(k) + accu2;//nuovo valore k + valore k precedente
            System.out.println(accu2);
        }
        System.out.println("");
        System.out.println(accu2);
        System.out.println("");
        /*
        run:
        c
        ic
        aic
        oaic

        oaic
        */
        
        //OPPURE Percorro da coda a testa e concateno a destra
        //String ss = "ciao";
        //             0123
        String accu3 = "";
        for(int k = 0; k < ss.length();k++)
        {
            accu3 += ss.charAt(ss.length()-1-k);//accu3 = accu3 + ...
            System.out.println("ss.charAt(ss.length()-1-k) "
                              +(ss.charAt(ss.length()-1-k)));
            System.out.println(accu3);
        }
        System.out.println("");
        System.out.println(accu3);
        System.out.println("");
        /*
        ss.charAt(ss.length()-1-k) o
        o
        ss.charAt(ss.length()-1-k) a
        oa
        ss.charAt(ss.length()-1-k) i
        oai
        ss.charAt(ss.length()-1-k) c
        oaic

        oaic
        */
        
        //----------------------------------------------------------
        
        //Break nel ciclo
        

        //ciclo for, 10 ripetizioni
        for (int k = 0; k < 10; k++)
        {
        if (k == 5)
        {
        break; // se i vale 5 interrompo il ciclo
        }
        System.out.print(k + ", ");
        }
        System.out.println("");
        /*
        run:
        0, 1, 2, 3, 4, 
        */
        
        
        //Continue nel ciclo
        //ciclo for, 10 ripetizioni
        for (int k = 0; k < 10; k++) {
        if (k == 5) {
        continue; // se i vale 5 salto il ciclo corrente
        }
        System.out.print(k + ", ");
        }
        System.out.println("");
        /*
        run:
        0, 1, 2, 3, 4, 6, 7, 8, 9, 
        */
        
    }
}
