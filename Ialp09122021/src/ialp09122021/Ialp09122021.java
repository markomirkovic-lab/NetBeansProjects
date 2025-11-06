/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ialp09122021;

/**
 *
 * @author marko.mirkovic
 */
public class Ialp09122021
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        -------SSE
        ---SIG ---
        --- SIG---
        */
        
        //CICLI IMBRICATI
        
        //RIGHE
        //COLONNE
        
        //DA SINISTRA A DESTRA + DA ALTO IN BASSO (2 FOR)
        //RIGHE X COLONNE
        
        
        
        for(int r=0; r<5; r++)//x 
        {
            //System.out.print(r + ": ");
            
            for(int c=0; c<5; c++)//y
            {
                //System.out.print(c);
                
                /*
                r==0 && c==0 ||
                   r==0 && c==4 ||
                   r==4 && c==0 ||
                   r==4 %% c==4)
                */
                
                /*
                
                (r==0 ||
                   r==0 ||
                   r==4 ||
                   r==4 )
                */
                
                
                
                if(r==0 ||
                   r==4 ||
                   c==0 ||
                   r+c==4)
                    
                    
                {
                    System.out.println("#");
                }
                
            }
            System.out.println("");
        }
        
        
        
    }
    
}
