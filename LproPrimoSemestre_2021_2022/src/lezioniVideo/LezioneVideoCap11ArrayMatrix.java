
package lezioniVideo;

import java.util.Arrays;

/**
 * Lezione Video Cap 11 Array Matrix
 * @author Marko Mirkovic
 * @version 26.01.2022
 */

public class LezioneVideoCap11ArrayMatrix
{
    public static void main(String[] args)
    {
        double a [] = {23.4, -7.3, 8.55};
        
        for(int cella = 0; cella < a.length; cella++)
        {
            System.out.println("[" + a[cella] + "] ");
        }
        System.out.println("");
        
        
        /*
        run:
        [23.4] 
        [-7.3] 
        [8.55]
        */
      
        System.out.println("");
        
        //--
        
        double matrice [][] = {
                                  { 2.78, 12.58, -23.5, 98.76}, //Prima riga
                                  {12.34,  0.02, 78.11, -5.78}, //Seconda riga
                                  {-3.76,  7.34,  4.44,  1.23}     //Terza riga
                              };

        System.out.println("Array: " + Arrays.toString(matrice));
        System.out.println("");
        
        for(int riga = 0; riga < matrice.length; riga++)
        {
            for(int colonna = 0; colonna < matrice[riga].length; colonna++)
            {
                System.out.print(matrice[riga][colonna] + "\t");
            }
            System.out.println("");//va a capo
            //Println (""); viene eseguito quando colonna = matrice[riga].length
            //              ovvero ogni volta quando il ciclo termina
        }
        
        
        /*
        I due cicli for innestati garantiscono di generare tutte le
        combinazioni di riga e colonna
        
        for riga  x 3
          for colonna  x 4
        
        3 x 4 = 12 cicli di esecuzione
        
        I loro valori saranno seguenti:
        
        for     for
        riga    colonna
        0       0
        0       1
        0       2
        0       3
        1       0
        1       1
        1       2
        1       3
        2       0
        2       1
        2       2
        2       3
        
                
        [0][0]  [0][1]  [0][2]  [0][3]
        [1][0]  [1][1]  [1][2]  [1][3]
        [2][0]  [2][1]  [2][2]  [2][3]
        */
        
        /*
        run:
        2.78	12.58	-23.5	98.76	
        12.34	0.02	78.11	-5.78	
        -3.76	7.34	4.44	1.23	
        */
        
    }
}
