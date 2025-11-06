package test;

/**
 * IsSquaredClass
 * @author marko.mirkovic
 */


public class IsSquaredClass
{
    /**
     * Ritorna true se la matrice m e' quadrata, false altrimenti
     * @param m la matrice da controllare
     * @return true se m e' quadrata, flase altrimenti
     */
    public static boolean isSquared(char[][] m)
    {
        //casi possibli
        //quadrata, rettangolare, irregolare, vuota, null
        // [N][N]
        // [N][0]
        // [0][0]
        // [Null][Null]
        // irregolare [][] (jagged)
        // [N][M]
        
        //controllo prima riga che e' lunga quanto la matrice
        
        if(m == null)
        {
            return false;
        }
        else
        {
            for(int i = 0; i < m.length; i++)
            {
                if(m.length != m[i].length)
                {
                    return false;
                }
            }
        
        return true;
        }
 
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
        
        
        
        System.out.println(isSquared(matrixA));
    }
}
