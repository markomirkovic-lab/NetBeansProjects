/**
 * Esercizio 13.2 Quadrato magico
 * @author marko.mirkovic
 */

package magicscquare;


public class MagicScquare
{
    public static boolean isMagic(int [][] toCheck)
    {
        
        
        //Calcolo la somma della prima diagonale
        int magic = 0;
        for(int d=0; d<toCheck.length; d++)
        {
            magic+=toCheck[d][d];
        }
        
        //Verifico se la seconda diagonale ha lo stesso numero
        
        int sum = 0;
        for(int d=0; d<toCheck.length; d++)
        {
            sum+=toCheck[d][toCheck.length-1-d];
        }
        
        if(sum!=magic) return false;
        
        //Verifico le righe
        for(int r = 0; r<toCheck.length; r++)
        {
            sum = 0; //somma parte sempre da zero
            
            for(int c = 0; c<toCheck[r].length; c++)
            {
                sum+=toCheck[r][c];
                
            }
            if(sum!=magic) return false;
        }
        
        //Verfico le colonne
        for(int c = 0; c<toCheck.length; c++)
        {
            sum = 0; //somma parte sempre da zero
            
            for(int r = 0; r<toCheck[c].length; r++)
            {
                sum+=toCheck[r][c];
                
            }
            if(sum!=magic) return false;
        }
        
        return true;
        
    }
    public static void main(String[] args)
    {
        int [][] qm = {
                        {2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 8}
                      };
        System.out.println(isMagic(qm));
        
                
    }
    
}
