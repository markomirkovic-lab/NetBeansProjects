package trisminimaxenhanced;

import log.Log;
import static log.Log.*;
import static trisminimaxenhanced.Fase_99_Finito_v6.anyMovesAvailable;
import static trisminimaxenhanced.Fase_99_Finito_v6.hasWinner;


public class MinimaxEnhanced
{
    /**
     * Parte essenziale del Minimax.
     * 
     * Se vince il player1 daremo peso PLAYER1WEIGHT (di solito 10)
     * Se vince il player2 daremo peso PLAYER2WEIGHT (di solito -10)
     * Altrimenti peso 0
     * 
     * La modifica rispetto al minimax standard è data dall'aggiunta della profondità al valore, di fatto la profondità rappresenta il numero di mosse per quel ramo dell'albero.
     * Non c'è una vera miglioria nelle performances ma otteniamo un'informazione in più
     * 
     */
    public static int hasWinnerWeight(char[][] tris, int depth, final char PLAYER1, final int PLAYER1WEIGHT, final char PLAYER2, final int PLAYER2WEIGHT)
    {
        int weight= 0;
        
        if( hasWinner(tris, PLAYER1) )
        {
            weight= PLAYER1WEIGHT + depth;          //ggg: Aggiungo la profondità, in questo modo questo ramo dell'albero avrà più peso
        }
        else if( hasWinner(tris, PLAYER2) )
        {
            weight= PLAYER2WEIGHT - depth;         //ggg: Aggiungo la profondità, in questo modo questo ramo dell'albero avrà più peso
        }
        else
        {
            weight= 0;
        }
        
        return weight;
    }
    
    
    
    /**
     * Partendo da una situazione nota
     *      1. Cerco tutte le mosse possibili che il giocatore può fare
     *      2. di ognuna valuto un punteggio
     *      3. memorizzo il punteggio massimo chde potrà fare il giocatore umano
     *          3.1 ad ogni mossa rispondo in tutti i modi possibili
     *          3.2 di ogni mossa valuto un punteggio
     *          3.3 memorizzo il punteggio minimo che potrà fare l'AI
     * 
     *      4. in questo modo sceglierò la mossa che risponderà al meglio a quelle potenziali che potrà fare l'avversario
     * 
     */
    public static int miniMax(char[][] tris, char turn, final char PLAYER, final int PLAYERWEIGHT, final char AI, final int AIWEIGHT, final char EMPTY, final int MAXDEPTH, int depth, int alpha, int beta, boolean debug) 
    {
        int weight = hasWinnerWeight(tris, depth, PLAYER, PLAYERWEIGHT, AI, AIWEIGHT);

        //C'è una vittoria (del giocatore o mia) oppure sono al massimo della profondità oppure non ci sono più mnosse possibili?
        if (weight!=0 || depth == 0 || !anyMovesAvailable(tris, EMPTY)) 
        {
            return weight;
        }
        
        //Provo tutte le combinazioni possibili del player e cerco quella che da il punteggio massimo
        if(turn==PLAYER)    //Se sta giocando il giocatore, allora devo cercare il punteggio massimo
        {
            //Siccome cerco il massimo, imposto il valore al minimo numero possibile
            int highestVal = Integer.MIN_VALUE;
            
            //Provo tutte le combinazioni possibili
            for (int r=0; r < tris.length; r++) 
            {
                for (int c=0; c<tris[r].length; c++) 
                {
                    if (tris[r][c]==EMPTY)      //Cella vuota?
                    {
                        int t= ++Log.howManyTimes;
                        
                        tris[r][c]=PLAYER;      //Simulo la mossa                        
                        
                        //Eseguo l'algoritmo, però questa volta gli dico di trovare il minimo, perché sarà il turno dell'avversario
                        int m= miniMax(tris, AI, PLAYER, PLAYERWEIGHT, AI, AIWEIGHT, EMPTY, MAXDEPTH, depth - 1, alpha, beta, debug);
                        
                        highestVal= Math.max(highestVal, m);
                        if(highestVal>alpha) alpha= highestVal;     //Aggiorno alpha con il valore massimo                        
                        
                        if(debug) Log.logging(t, String.format("'%c'. r: %d. c: %d. %s. MiniMax: %d. alpha: %d. beta: %d.%s", turn, r, c, "HIGHEST " + highestVal, m, alpha, beta, (alpha>=beta ? " STOP." : "")), tris, EMPTY, MAXDEPTH-depth+1);                                                                        
                        
                        //Tolgo la mossa fatta
                        tris[r][c]=EMPTY;
                        
                        if(alpha>=beta) return highestVal;          //Quando alpha supera beta significa che quel ramo dell'albero deve essere potato, al massimo porterà ad un pari                        
                    }
                }
            }
            
            return highestVal;            
        } 
        else    //if(turn==AI)  Sta giocando l'AI, quindi dovrò trovare il minimo
        {
            //Siccome cerco il minimo, imposto il valore al massimo numero possibile
            int lowestVal = Integer.MAX_VALUE;
            
            //Provo tutte le combinazioni possibili
            for (int r = 0; r < tris.length; r++) 
            {
                for (int c = 0; c < tris[r].length; c++) 
                {
                    if (tris[r][c]==EMPTY) 
                    {
                        int t= ++Log.howManyTimes;                   
                        
                        tris[r][c]=AI;      //Simulo la mossa dell'AI                        
                        
                        //Cerco il minimo
                        int m= miniMax(tris, PLAYER, PLAYER, PLAYERWEIGHT, AI, AIWEIGHT, EMPTY, MAXDEPTH, depth - 1, alpha, beta, debug);
                        
                        lowestVal = Math.min(lowestVal, m);
                        beta= Math.min(beta, lowestVal);        //Aggiorno beta con il valore minimo                        
                        
                        if(debug) Log.logging(t, String.format("'%c'. r: %d. c: %d. %s. MiniMax: %d. alpha: %d. beta: %d.%s", turn, r, c, "LOWEST " + lowestVal, m, alpha, beta, (beta<=alpha ? " STOP." : "")), tris, EMPTY, MAXDEPTH-depth+1);                                                                        
                        
                        //Tolgo la mossa effettuata
                        tris[r][c]=EMPTY;
                        
                        if(beta<=alpha) return lowestVal;       //Quando beta è inferiore ad alpha significa che quel ramo dell'albero deve essere potato, al massimo porterà ad un pari                        
                    }
                }
            }
            
            return lowestVal;
        }
    }

    
    
    /**
     * Valuta tutte le mosse e applica quella migliore.
     * 
     * Grazie al peso alpha e beta, rispettivamente la capacità di vittoria del primo giocatore e del secondo,
     * se un ramo dell'albero non porta ad una vittora, viene abbandonato in favore di strade più possibiliste
     * 
     */
    public static long chooseBestMove(char[][] tris, final char PLAYER, final char AI, final char EMPTY, final int MAXDEPTH, boolean debug) 
    {        
        resetLog();
        
        
        final int PLAYERWEIGHT= 10;
        final int AIWEIGHT= -10;
        
        int rr=-1, cc=-1;
        int bestValue = Integer.MAX_VALUE;
        
        for (int r = 0; r < tris.length; r++) 
        {
            for (int c = 0; c < tris[r].length; c++) 
            {
                if (tris[r][c]==EMPTY) 
                {
                    tris[r][c]= AI;
                    
                    int t= ++Log.howManyTimes;
                                        
                    int moveValue = miniMax(tris, PLAYER, PLAYER, PLAYERWEIGHT, AI, AIWEIGHT, EMPTY, MAXDEPTH, MAXDEPTH, Integer.MIN_VALUE, Integer.MAX_VALUE, debug);
                    
                    if(debug) Log.logging(t, String.format("'%c'. r: %d. c: %d. %s. MiniMax: %d. alpha: %d. beta: %d.", AI, r, c, "TOPLEVEL", moveValue, Integer.MIN_VALUE, Integer.MAX_VALUE), tris, EMPTY, 0);                    
                    
                    tris[r][c]=EMPTY;
                    
                    if (moveValue < bestValue) 
                    {
                        rr = r;
                        cc = c;
                        bestValue = moveValue;
                    }
                }
            }
        }
        
        tris[rr][cc]= AI;
        
        if(debug) 
        {            
            Log.logging(0, String.format("'%c'. r: %d. c: %d. %s. MiniMax: %d. ", AI, rr, cc, "MAKEBESTMOVE in " + howManyTimes + " calls", bestValue), tris, EMPTY, 0);                    
            Log.printLog();
        }
        
        return Log.howManyTimes;
    }    
    
    
    public static void main(String[] args)
    {
        char[][] t= { {'x', 'o', 'x'} ,
                      {'o', 'o', ' '} ,
                      {' ', 'x', ' '} };

        //Gioca la x
        chooseBestMove(t, 'o', 'x', ' ', 6, true);
    }    
}
