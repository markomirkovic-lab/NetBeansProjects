
package test;

/**
 * Esercizio 1 - ALPR
 * @author Marko Mirkovic
 * @version 04.04.2022
 */
public class AnagramGridCorrection
{
    /**
     * Conta qante volte il carattere value è presente nella riga row della matrice m
     * @param m nome matrice
     * @param row numero riga
     * @param value valore che si cerca
     * @return numero volte il carattere value è presente nella riga row della matrice m
     */
    public static int countInRow(char[][] m, int row, char value)
    {
        int charRiga = 0;
        for(int c = 0; c<m[row].length; c++)
        {
            if(m[row][c]==value)
            {
                charRiga++;
            }
        }
        return (charRiga);
    }
    /**
     * Conta quante volte il carattere value è presente nella colonna col della matrice m
     * @param m nome matrice
     * @param col numero colonna
     * @param value valore che si cerca
     * @return numero volte il carattere value è presente nella colonna col della matrice m
     */
    public static int countInColumn(char[][] m, int col, char value)
    {
        int charColonna = 0;
        for(int r = 0; r<m[col].length; r++)
        {
            if((m[col][r]) == value)
            {
                charColonna++;
            }
        }
                
        return (charColonna);
        
    }
    
    /**
     * Ritorna true se la matrice m è quadrata, ossia se possiede lo stesso numero di rige e di colonne (su ogni riga)
     * @param m nome matrice
     * @return ritorna true o false
     */
    public static boolean isSquared(char[][] m)
    {
        int row = 0;
        int column = 0;
        boolean quadrataMatrixA = false;
        for(int r = 0; r<m.length; r++)
        {
            for(int c = 0; c<m[r].length; c++)
            {
                row++;
                column++;
                
                if(row == column)
                {
                    quadrataMatrixA = true;
                }
            }
        }
        
 
   
        
        return (quadrataMatrixA);
    }
    
    
    
    
    /**
     * Ritorna true se la matrice m è un anagramma in griglia, false altrimenti.
     * La matrice deve rispettare le seguenti regole:
     * - deve essere quadrata (NxN)
     * - tutte le righe e tutte le colonne devono essere ogniuna anagramma dell'altra
     * @param grid nome matrice
     * @return ritorna true o false
     */
    public boolean isAnagram(char[][] m)
    {
        
        
        return true;
    }
    
    
    public static boolean isAnagramGrid(char[][] grid)
    {
        
        
        return true;
        

    }
    
    public static void main(String[] args)
    {
        char [][] matrixA = {
                                {'a','n','n','a'},
                                {'a','a','n','n'},
                                {'n','n','a','a'}
                            };
       
        
        char [][] matrixB = {
                                {'n','n','a','a'},
                                {'a','a','n','n'},
                                {'a','n','n','a'}
                            };    
        
        
        
        boolean quadrataMatrixA = false;
        boolean quadrataMatrixB = false;
        boolean quadrataMatrixAB = false;
        int charRiga = 0;
        int charColonna = 0;
        
        
        //countInRow(char[][] m, int row, char value)
        
        
        
        
        
        
    }
}
