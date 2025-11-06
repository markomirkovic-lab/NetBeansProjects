package trisminimax;

import java.util.Scanner;
import static trisminimax.Minimax.chooseBestMove;


/**
 * L'algoritmo Minimax utilizzato in questo progetto è stato elaborato sulla base del seguente codice
 * 
 * https://github.com/DavidHurst/MiniMax-TicTacToe-Java/blob/master/TicTacToe/src/ai/MiniMax.java
 * 
 * Adattato e modificato per renderlo idoneo al percorso scolastico SSSE.
 * 
 * La soluzione ha unicamente fini didattici e NON è ottimizzata nelle performances.
 * 
 * 
 * @author gisi
 */
public class Fase_99_Finito_v5 
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
        
        for(int r=0; r<tris.length; r++)
        {
            for(int c=0; c<tris[r].length; c++)
            {
                int larg= 1;
                out+= String.format("%4d[%-" + larg + "c]%s", (r*tris.length+c)+1, tris[r][c], "     ");
                //System.out.print( (r*tris.length+c)+1 + "[" + tris[r][c] + "]\t");          //Notare come calcolo le celle: come tutti i numeri in base 10, ma usando la base 3! Aggiungo 1 per non partire da 0
            }
            out+="\n";
        }    
        
        return out;
    }
    
    
    
    public static void askCoord(Scanner in, char[][] tris, final char PLAYER, final char EMPTY)
    {
        System.out.println("-----------------------------------------------------------");
        
        int r, c, cella;
        do
        {                
            do
            {
                System.out.print("Giocatore '" + PLAYER + "' cella [1.." + (tris.length*tris.length) + "]: ");

                while(!in.hasNextInt())
                {
                    in.nextLine();
                    System.out.print("Giocatore '" + PLAYER + "' cella [1.." + (tris.length*tris.length) + "]: ");
                }
                cella= in.nextInt();
                in.nextLine();
            }while(cella<1 || cella>tris.length*tris.length);

            cella--;        //Calcolo riga e colonna.
            r= cella/tris.length;     //Come se fossimo in base 10, ma ragione in base 3
            c= cella%tris.length;                
        }while(tris[r][c]!=EMPTY);    
        
        tris[r][c]= PLAYER;
                
        System.out.println( printBoard(tris) );        
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
    
    
    
    
    
    public static void machineThinking(Scanner in, char[][] tris, final char PLAYER, final char AI, final char EMPTY, int maxDepth, boolean debug)
    {
        System.out.println("-----------------------------------------------------------");
        System.out.print(AI + " thinking... ");        
        long t= System.currentTimeMillis();
        
        long hmt= chooseBestMove(tris, PLAYER, AI, EMPTY, maxDepth, debug);
                
        System.out.printf(" in %,d msec and %,d recurse calls.\n", (System.currentTimeMillis()-t), hmt);        
        
        System.out.println( printBoard(tris) );        
    }    
    
    
    
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);           
        
        /*
        makeBestMove(new char[][]{ {'o',' ','$'},
                                   {' ','x','x'},
                                   {'$','$','$'}}, 
                     'x','o',' ',6,true);
        
        
        
        System.out.println("---------------"); in.nextLine();
        */
        
        
        

        
        
        //Due giocatori
        final char G1= 'x';   //Potrei anche farlo iniziare chiedendo il simbolo al giocatore
        final char G2= 'o';
        final char EMPTY= ' ';
        
        
        
        
        //Quando finisce?
        boolean parità=false;
        boolean vittoria= false;
        
        
        
        //Dimensione di gioco
        int size=3;
        System.out.println("\n\n\n\n\n\n-----------------------------------------------------------");
        System.out.print("Dimensione scacchiera (da 3 a 9. Default 3) ---> ");
        size= (in.nextLine().trim() + " ").charAt(0)-'0';
        if(size<3 || size>10) size=3;
        System.out.println("\tDimensione impostata a: " + size);

        char[][] tris= getTris(size, EMPTY);
        
        
        
        
        
        //Scelgo con quale simbolo gioca il PC
        System.out.println("\n\n\n\n\n\n-----------------------------------------------------------");
        int scelta;
        System.out.println("1. Umano gioca con '" + G1 + "' e inizia.");
        System.out.println("2. Macchina gioca con '" + G1 + "' e inizia.");
        System.out.println("3. Umano contro umano.");
        System.out.println("4. Macchina gioca contro se stessa. DEFAULT.");
        System.out.print("---> ");
        scelta= (in.nextLine().trim() + " ").charAt(0)-'0';            
        if(scelta<1 || scelta>4) scelta=4;
        
        
        
        System.out.println("\n\n\n\n\n\n-----------------------------------------------------------");
        int maxDepth=6;
        boolean debug=false;        
        if(scelta!=3)
        {            
            System.out.print("Livello di previsione per l'AI (da 1 a 9. Default 6)? ");            
            maxDepth= (in.nextLine().trim() + " ").charAt(0)-'0';
            if(maxDepth<1 || maxDepth>9) maxDepth=6;
            System.out.println("\tPrevisione AI, livello: " + maxDepth);
            System.out.println("\n\n\n\n");
            
            System.out.print("Vuoi che ti mostri l'albero di decisione ad ogni turno (s/N)? ");            
            if((in.nextLine().trim().toLowerCase() + " ").charAt(0)=='s') debug=true;
            else debug=false;                        
            System.out.println("\tMostrare albero decisione: " + (debug ? "Si" : "No"));
            System.out.println("\n\n\n\n");
        }
        
        

        
        //------------------------------------------------------------------
        //Stampo
        System.out.println("INIZIO:");
        System.out.println( printBoard(tris) );
        System.out.println("\n\n");

        
        char simbolo= EMPTY;   
        do
        {
            //------------------------------------------------------------------
            //Cambio giocatore
            if(simbolo==G1) simbolo=G2;
            else simbolo=G1;
            
            
            


            //------------------------------------------------------------------
            //Gioca l'AI o il giocatore umano            
            if(scelta==1 && simbolo==G2) machineThinking(in, tris, G1, G2, EMPTY, maxDepth, debug);
            else if(scelta==2 && simbolo==G1) machineThinking(in, tris, G2, G1, EMPTY, maxDepth, debug);
            else if(scelta==4 && simbolo==G1) machineThinking(in, tris, G2, G1, EMPTY, maxDepth, debug);
            else if(scelta==4 && simbolo==G2) machineThinking(in, tris, G1, G2, EMPTY, maxDepth, debug);
            else askCoord(in, tris, simbolo, EMPTY);
            
            if(scelta==4)
            {
                System.out.print("Premi RETURN per continuare. ");
                char go= (in.nextLine().trim() + " ").charAt(0);
            }


            
            

            //------------------------------------------------------------------
            //Vittoria?
            vittoria= hasWinner(tris, simbolo);
            
            
    
            
            //------------------------------------------------------------------
            //Parità?
            parità= !anyMovesAvailable(tris, EMPTY);
        } while(!parità && !vittoria);
        
        
        
        System.out.println("\n\n\n\n\n\n-----------------------------------------------------------");        
        if(vittoria)
        {
            if(scelta==1 && simbolo==G1 || scelta==2 && simbolo==G2) System.out.println("Vittoria per l'umano '" + simbolo + "'");
            else if(scelta==1 && simbolo==G2 || scelta==2 && simbolo==G1) System.out.println("Vittoria per la macchina '" + simbolo + "'");
            else System.out.println("Vittoria per '" + simbolo + "'");
        }
        else if(parità) System.out.println("Parità");        
        
        
        //------------------------------------------------------------------
        //Stampo
        System.out.println( printBoard(tris) );
    }    
}
