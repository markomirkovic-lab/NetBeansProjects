
package lproclasse26012022tris;

import java.util.Scanner;

/**
 *
 * @author marko.mirkovic
 * @version 02.02.2022
 */

/*

1. Il gioco del tris è basato su due giocatori a turno
2. Inizia la 'x'
   2.1 Potremmo anche chiederlo al giocatore

3. Stampo la scacchiera
4. Chiedo la cella
   4.1 Cella valida?
   4.2 Cella vuota?

5. Hai vinto?
   5.1 Righe
   5.2 Colonne
   5.3 Diagonali

6. Ha pareggiato?

7. Stampo la scacchiera

8. Cambio il turno
*/




public class Tris
{


    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        //Giocatori
        final char G1 = 'x';
        final char G2 = 'o';
        final char VUOTA = ' ';
                
        
        //Condizioni di fine
        boolean vittoria = false;
        boolean parita = false;
        
        boolean partita = true;
        boolean next = false;
        
        //Scacchiera
        char tris [][] = new char[3][3];
        char dum [] = new char [0];
        
        //Input string
        String inputTastiera = "";
        int rigaTastiera = 0;
        int colonnaTastiera = 0;
        
        int riga = 0;
        int colonna = 0;
        
        /*
        char [][] tirsDemo = { {,,},
                               {,,},
                               {,,} };
        */
        
        //for(int i = 0; i > tris.length * tris[0], i++))
        
        //Algoritmo di cambio turno e fine partita
        int turno = 'x';
        
        do
        {
            
            //...
            
            if(turno == G1)
            {
                turno = G2;
            }
            else
            {
                turno = G1;//else if(turno == g2) turno == G1;
            }
            //...
            
        } while(!vittoria && !parita);
        
        
        //Algoritmo statico della vittoria
        //vittoria = false;
        
        /*
            1 riga:                       x             x           x
        
            2 riga:                       x             x           x
        
            3 riga:                       x             x           x
        
        
        if(    tris[0][0] != VUOTA && tris[0][0] == tris[0][1] && tris[0][0] == tris[0][2]
            || tris[1][0] != VUOTA && tris[1][0] == tris[1][1] && tris[1][0] == tris[1][2]
            || tris[2][0] != VUOTA && tris[2][0] == tris[2][1] && tris[2][0] == tris[2][2] )
        {
            vittoria = true;
        }
        */
        
        //Algoritmo semi-automatico della vittoria
        //vittoria = false;
        
        for(riga = 0; riga < tris.length; riga++)
        {
            if( tris[riga][0] != VUOTA && tris[riga][0] == tris[riga][1] && tris[riga][0] == tris[riga][2] )
                    {
                        vittoria = true;
                    }
        }
        
        
        //Algoritmo automatico della vittoria
        //vittoria = false;
        
        for(riga = 0; riga < tris.length; riga++)
        {
            vittoria = true;
            if( tris[riga][0] != VUOTA )
            {
                for( colonna=1; colonna < tris[riga].length; colonna++)
                {
                    if( tris[riga][colonna] != tris[riga][colonna] )
                    {
                        vittoria = false;
                        break;
                    }
                }
            }
        }
        
        
        
        
        
        
        System.out.println("---");
        //------------------------------------------------
        
        System.out.println("Benvenuti a al gioco Tris");
        System.out.println("");
        System.out.print(" | | \n" +
                         "-----\n" +
                         " | | \n" +
                         "-----\n" +
                         " | | \n");
        
        do
        {
            System.out.println("Giocatore gioca:");
            System.out.println("Scegli la posizione riga e colonna:");
            rigaTastiera = tastiera.nextInt();
            tastiera.nextLine();
            colonnaTastiera = tastiera.nextInt();
            tastiera.nextLine();
            
            tris [rigaTastiera][rigaTastiera] = 'x';
            
            partita = false;
            
            //inputTastiera = tastiera.next().toUpperCase().trim();
            //dum [0] = inputTastiera.charAt(0);
            
            
            
        }while (partita == true);
        
        
        
        
        
        
        for(riga = 0; riga < tris.length; riga++)
        {
            for(colonna = 0; colonna < tris[riga].length; colonna++)
            {
                System.out.print(tris[riga][colonna] + "\t");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
