
package test;

/**
 * Esercizio 1 - ALPR
 * @author Marko Mirkovic
 * @version 04.04.2022
 */
public class AnagramGrid
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
        int ret=0;
        for(int c=0; c<m[row].length; c++)
        {
            if(m[row][c]==value) ret++;
        }
        
        return ret;
    }
    
    /**
     * Conta quante volte il carattere value è presente nella colonna col della matrice m
     * @param m nome matrice
     * @param col numero colonna
     * @param value valore che si cerca
     * @return numero volte il carattere value è presente nelal colonna col della matrice m
     */
    public static int countInColumn(char[][] m, int col, char value)
    {
        int ret=0;
        for(int r=0; r<m.length; r++)
        {
            if(m[r][col]==value) ret++;
        }
        
        return ret;
    }
    
    /**
     * Ritorna true se la matrice m è quadrata, ossia se possiede lo stesso numero di rige e di colonne (su ogni riga)
     * @param m nome matrice
     * @return ritorna true o false
     */
    public static boolean isSquared(char[][] m)
    {
        for(int r=0; r<m.length; r++)        
        {
            if( m[r].length != m.length) return false;
        }
        
        return true;
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
        if( !isSquared(m) ) return false;
        
        for(int c=0; c<m[0].length; c++)
        {
            char l= m[0][c];
            
            for(int r=1; r<m.length; r++)
            {
                if( countInRow(m, r, l) != 1) return false;
            }            
        }
        
        return true;
    }
    
    /**
     * Prints double without going to next line
     * @param a double parameter
     */
    public static void println(double a)
    {
        System.out.println(a);
    }
    /**
     * Prints string by going to next line
     * @param a string parameter
     */
    public static void println(String a)
    {
        System.out.println(a);
    }
    /**
     * Prints boolean (true or false) by going to next line
     * @param a boolean parameter
     */
    public static void println(boolean a)
    {
        System.out.println(a);
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
        
        
        for(int r = 0; r<matrixA.length; r++)
        {
            for(int c = 0; c<matrixA[r].length; c++)
            {
                if((matrixA[r][c]) == (matrixA[0][c]))
                {
                    charRiga++;
                }
            }
        }
        
        System.out.println("charRiga: " + charRiga);
        
        
        for(int r = 0; r<matrixA.length; r++)
        {
            for(int c = 0; c<matrixA[r].length; c++)
            {
                if((matrixA[r][c]) == (matrixA[r][0]))
                {
                    charColonna++;
                }
            }
        }
        
        System.out.println("charcolonna: " + charColonna);
        
        int row = 0;
        int column = 0;
        for(int r = 0; r<matrixA.length; r++)
        {
            for(int c = 0; c<matrixA[r].length; c++)
            {
                row++;
                column++;
                
                if(row == column)
                {
                    quadrataMatrixA = true;
                }
            }
        }
        
        row = 0;
        column = 0;
        for(int r = 0; r<matrixB.length; r++)
        {
            for(int c = 0; c<matrixB[r].length; c++)
            {
                row++;
                column++;
                
                if(row == column)
                {
                    quadrataMatrixB = true;
                }
            }
        }
        
        if(quadrataMatrixA == true || quadrataMatrixB == true)
        {
            quadrataMatrixAB = true;
        }
        
        
        //boolean quadrataMatrixB = false;
        //boolean quadrataMatrixAB = false;

        //System.out.println("q".equalsIgnoreCase("q"));
        println("quadrataMatrixA: " + quadrataMatrixA);
        println("quadrataMatrixB: " + quadrataMatrixB);
        println("quadrataMatrixAB: " + quadrataMatrixAB);
        
    }
}
