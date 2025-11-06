package trisMetodi;

import java.util.Scanner;


public class Fase_99_Finito_v4 
{
    public static char[][] getTris(int size, final char EMPTY)
    {
        char[][] tris= new char[size][size];
        
        //Inizializzo tutte le celle a VUOTA
        for(int r=0; r<tris.length; r++)
        {
            for(int c=0; c<tris[r].length; c++)
            {
                tris[r][c]= EMPTY;
            }
        }        
        
        return tris;
    }
    
    
    public static String printBoard(char[][] tris)
    {
        String out="";
        int larg= 1;
        
        for(int r=0; r<tris.length; r++)
        {
            for(int c=0; c<tris[r].length; c++)
            {                
                out+= String.format("%4d[%-" + larg + "c]%s", (r*tris.length+c)+1, tris[r][c], "     ");
                //System.out.print( (r*tris.length+c)+1 + "[" + tris[r][c] + "]\t");          //Notare come calcolo le celle: come tutti i numeri in base 10, ma usando la base 3! Aggiungo 1 per non partire da 0
            }
            out+="\n";
        }    
        
        return out;
    }
    
    
    
    public static void askCoord(Scanner in, char[][] tris, final char PLAYER, final char EMPTY)
    {
        int r, c, cella;
        do
        {                
            do
            {
                System.out.print("Giocatore '" + PLAYER + "' cella [1..9]: ");

                while(!in.hasNextInt())
                {
                    in.nextLine();
                    System.out.print("Giocatore '" + PLAYER + "' cella [1..9]: ");
                }
                cella= in.nextInt();
                in.nextLine();
            }while(cella<1 || cella>tris.length*tris.length);

            cella--;        //Calcolo riga e colonna.
            r= cella/tris.length;     //Come se fossimo in base 10, ma ragione in base 3
            c= cella%tris.length;                
        }while(tris[r][c]!=EMPTY);    
        
        System.out.println("\n\n");        
        
        tris[r][c]= PLAYER;
    }
    
    
    public static boolean hasHorizontalWinner(char[][] tris, final char PLAYER)
    {
        for(int r=0; r<tris.length; r++)
        {
            int sameSymbol=0;
            
            for(int c=0; c<tris[r].length; c++)
            {
                if( tris[r][c]==PLAYER )
                {
                    sameSymbol++;
                }
            }
            
            if(sameSymbol==tris.length)
            {
                return true;
            }
        }        
        
        return false;
    }
    
    
    public static boolean hasVerticalWinner(char[][] tris, final char PLAYER)
    {        
        for(int c=0; c<tris[0].length; c++)            
        {
            int sameSymbol=0;
            
            for(int r=0; r<tris.length; r++)            
            {
                if( tris[r][c]==PLAYER )
                {
                    sameSymbol++;
                }
            }
            
            if(sameSymbol==tris.length)
            {
                return true;
            }
        }        
        
        return false;
    }
    
    
    public static boolean hasDiagonalWinner(char[][] tris, final char PLAYER)
    {
        //Non ha vinto sulle colonne, controllo le diagonali
        int sameSymbol=0, sameSymbol2=0;
        for(int d=0; d<tris.length; d++)
        {
            if( tris[d][d]== PLAYER )
            {
                sameSymbol++;
            }
            if( tris[d][tris.length-1-d]== PLAYER )            
            {
                sameSymbol2++;
            }
        }
        
        if(sameSymbol==tris.length || sameSymbol2==tris.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    
    public static boolean hasWinner(char[][] tris, final char PLAYER)
    {
        //Devo avere tutti i simboli uguali sulla stessa riga.
        //Uguali fra loro ma diversi da VUOTA
        //
        //          0   1   2
        //        +---+---+---+
        //      0 | O | X |   |         Qui non vince nessuno
        //        +---+---+---+
        //      1 | X | X | X |         Qui vince X sulla riga 1
        //        +---+---+---+
        //      2 |   | O | O |         Qui non controllo nemmeno perché la prima cella è vuota!
        //        +---+---+---+
        //

        //Versione completamente automatica, che si adatta alle dimensioni della scacchiera
        boolean winner= hasHorizontalWinner(tris, PLAYER);
        
        if(!winner) winner= hasVerticalWinner(tris, PLAYER);
        
        if(!winner) winner= hasDiagonalWinner(tris, PLAYER);
        
        return winner;
    }
    
    
    
    public static boolean anyMovesAvailable(char[][] tris, final char EMPTY)
    {
        for(int r=0; r<tris.length; r++)
        {
            for(int c=0; c<tris[r].length; c++)
            {
                if( tris[r][c]== EMPTY ) return true;
            }
        }
        
        return false;
    }
    
    
    
    
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);        
        
        
        //Due giocatori
        final char G1= 'x';   //Potrei anche farlo iniziare chiedendo il simbolo al giocatore
        final char G2= 'o';
        final char EMPTY= ' ';
        
        
        
        
        //Tabella di gioco
        final int SIZE=3;
        char[][] tris= getTris(SIZE, EMPTY);
        
        
        
        //Quando finisce?
        boolean parità=false;
        boolean vittoria= false;
        
        
        
        
        
        char simbolo= G2;   //Simulo che il gioco inizi con il simbolo G2, tanto verrà subito cambiato n G1        
        do
        {
            //------------------------------------------------------------------
            //Cambio giocatore
            if(simbolo==G1) simbolo=G2;
            else simbolo=G1;
            
            
            //------------------------------------------------------------------
            //Stampo
            System.out.println( printBoard(tris) );

            
            
            //-----------------------------------------------------------------
            //Chiedo al giocatore di inserire le coordinate            
            askCoord(in, tris, simbolo, EMPTY);
            

            //------------------------------------------------------------------
            //Vittoria?
            vittoria= hasWinner(tris, simbolo);
            
            
    
            
            //------------------------------------------------------------------
            //Parità?
            parità= !anyMovesAvailable(tris, EMPTY);
        } while(!parità && !vittoria);
        
        if(vittoria) System.out.println("Vinto giocatore '" + simbolo + "'");
        else if(parità) System.out.println("Pari");
        
        
        
        //------------------------------------------------------------------
        //Stampo
        System.out.println( printBoard(tris) );
    }    
}
