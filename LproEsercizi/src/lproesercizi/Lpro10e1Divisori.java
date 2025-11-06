/**
 * Esercizi serie 10 Circli
 * Esercizio 10.1 Divisori
 * @author marko.mirkovic
 * @version
 */

/*
10.1 Divisori
Scrivete un programma che:
• Chiede all’utente di inserire un numero, che chiameremo max
  Chiede all’utente di inserire un secondo numero, che chiameremo div
  Inserisci max: 100
  Inserisci div: 25
• Per tutti i numeri da 1 a max, divisibili per div, verrà stampato
  25 divisore di  25
  25 divisore di  50
  25 divisore di  75
  25 divisore di 100
• Al termine il programma stamperà
  Trovati 4 numeri divisibili per 25
• Chiederà all’utente se vuole proseguire o uscire (premendo 'q' oppure 'Q')
  premi q o Q per uscire
  se l’utente preme qualsiasi altro tasto il programma ricomincia.

*/


package lproesercizi;

import java.util.Scanner;


public class Lpro10e1Divisori
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int max;
        int div;
        int ris = 0;
        //int cntr = 0;
        int ii = 0;
        String uscire;
        boolean terminate = false;
        
        
        do
        {
            
        
        
            //sout + tab
            System.out.print("Inserici max: ");
            max = input.nextInt();
            input.nextLine();

            System.out.print("Inserisci div: ");
            div = input.nextInt();
            input.nextLine();


            for(int i=1; i<=max; i++)
            {

                ris = i%div;
                //cntr = i;
                //System.out.println(i);
                //System.out.println(ris);
                //System.out.println(cntr);

            if(ris==0)
            {
                System.out.println((div) + " divisore di " + (i));
                ++ii;
            }

            }


            System.out.println("Trovati " + (ii) + " divisibili per " + (div));
            System.out.println("");
            System.out.println("Vuole proseguire? Per uscire premere Q");
            uscire = input.next().trim().toUpperCase();
            //System.out.println(uscire);
            input.nextLine();
        
            if(uscire.equals("Q"))
            {
                terminate=true;
                input.close();
                System.out.println("------------------------");
                System.out.println("Il programma è terminato");
            }
            //System.out.println(terminate);
                    
        } while (!terminate);
        
    }
}
