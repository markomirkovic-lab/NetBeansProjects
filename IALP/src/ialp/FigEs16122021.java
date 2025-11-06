package ialp;

/**
 *
 * @author marko.mirkovic
 */
import java.util.Scanner;

public class FigEs16122021
{
    public static void main(String[] args)
    {
        int size = 7;
        int prima = 0;
        int ultima = size-1;
        
        for(int r = 0; r<size; r++)
        {
            for(int c = 0; c<size; c++)
            {
                if(r==prima && c == prima ||
                   r==prima && c == ultima ||
                   r==ultima && c== prima ||
                   r==ultima && c== ultima)
                {
                    System.out.println("+");
                }
                else if(r == prima && c>prima && c<ultima ||
                        r== ultima)
                {
                    System.out.println("-");
                }
                else if(r==prima ||
                        r== ultima)
                {
                    System.out.println("-");
                }
                else if(c==prima &&
                        c==ultima)
                {
                    System.out.println("|");
                }
                else if(r>=prima+2 && r>=ultima-2)
                        
                {
                    System.out.println(".");
                }
                else
                {
                    System.out.println(" ");
                }
                
                
                
                
                
                
                
                
                
                
            }
        System.out.println(" ");  
        }
    }
}
