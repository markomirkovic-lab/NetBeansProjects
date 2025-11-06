/**
 * Esercizio 13.2 Quadrato magico 3
 * @author marko.mirkovic
 */

package magicscquare;


public class MagicScquare3
{
    public static boolean isMagic(int [][] toCheck)
        {
            //if(Double.isNaN(getMagic(toCheck) ) ) return false;
            //else return true;
            try
            {
                getMagic(toCheck);
                return true;
            }
            catch(Exception e)
            {
                return false;//false -> quadrato non e' magico
            }
        }
    
    public static double getMagic(int [][] toCheck) throws Exception
    {
        
        
        
        //Calcolo la somma della prima diagonale
        double magic = 0;
        for(int d=0; d<toCheck.length; d++)
        {
            magic+=toCheck[d][d];
        }
        
        //Verifico se la seconda diagonale ha lo stesso numero
        
        double sum = 0;
        for(int d=0; d<toCheck.length; d++)
        {
            sum+=toCheck[d][toCheck.length-1-d];
        }
        
        if(sum!=magic) throw new Exception("NON e' un quadrato magico alla riga: ");
        
        //Verifico le righe
        for(int r = 0; r<toCheck.length; r++)
        {
            sum = 0; //somma parte sempre da zero
            
            for(int c = 0; c<toCheck[r].length; c++)
            {
                sum+=toCheck[r][c];
                
            }
            if(sum!=magic) throw new Exception("NON e' un quadrato magico alla riga: " + r);
            
            return magic;
        }
        
        //Verfico le colonne
        for(int c = 0; c<toCheck.length; c++)
        {
            sum = 0; //somma parte sempre da zero
            
            for(int r = 0; r<toCheck[c].length; r++)
            {
                sum+=toCheck[r][c];
                
            }
            if(sum!=magic) throw new Exception("NON e' un quadrato magico alla riga: " +c);
        }
        
        return magic;
        
    }
    public static void main(String[] args)
    {
        
        
        try
        {
                    int [][] qm = {
                        {2, 7, 6},
                        {9, 5, 1},
                        {4, 3, 3}
                      };
                    //System.out.println(getMagic(qm));
                    System.out.println(isMagic(qm));
        
        
                
                    getMagic(qm);//getMatgic puo' sollevare un eccezzione
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

               
        
        
                
    }
    
}
