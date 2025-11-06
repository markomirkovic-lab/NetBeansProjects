package lprosecondosemestre_2021_2022;

/**
 *
 * @author marko.mirkovic
 */
public class ContaParole 
{
    public static boolean isSeparator(char c)
    {
        
        //Soluzione ottimale
        //if(Character.isLetterOrDigit(c)) return false;
        //else return true;
        
        //or
        
        /*
        char[] sep= {' ', '\n', '\t', '.'};
        for(int i=0; i<sep.length; i++)
            if(c==sep[i]) return true;
        return false;
        */
        
        /*
        String sep2= " ,-!\n\t.r";
        for(int i=0; i<sep2.length(); i++)
            if(c==sep2.charAt(i)) return true;
        return false;
        */
        
        
        //Soluzione artigianale
        //switch(c)
        
        //Aggiungo un carattere separatore alla fine, per garantire di contare l'ultima
        
        testo+=".";
        
        int w=0;
        for(int i=0; i<testo.length()-1; i++)
        {
            if( !isSeparator(testo.charAt(i)) && isSeparator(testo.charAt(i+1)) )
            {
                w++;
            }
            
        }
        
        return w;
        
        
    }
    
    
    public static void main(String[] args)
    {
        
    }
}
