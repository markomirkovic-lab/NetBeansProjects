
package LproEsercizi;


/**
 * Esercizio 11.1 - Simmetira
 * 
 * Scrivete un software che sia in grado di copiare i valori dalla diagonale
 * inferiore alla diagonale superiore di una matrice.
 * 
 * Matrice:
 * 1
 * 21
 * 321
 * 4321
 * 
 * Ottenere:
 * 1234
 *  123
 *   12
 *    1
 * 
 * @author Marko Mirkovic
 * @version 29.01.2022
 */

public class Es_11_1_Simetria_Testing
{
    public static void main(String[] args)
    {
        int matriceA [][] = {
                            {1},
                            {2, 1},
                            {3, 2, 1},
                            {4, 3, 2, 1}
                          };
        
        int r1 = 0;//Inizzializzare a 0 per poter utilizzare il
                   //valore variabile fuori dal cliclo for
        int c1 = 0;//Inizzializzare a 0 per poter utilizzare il
                   //valore variabile fuori dal cliclo for
        
        System.out.println("--");
        System.out.print(matriceA.length);//4
        System.out.println("");
        /*
        run:
        4
        */
                
        System.out.println("--");
        System.out.println(matriceA[0].length);
        System.out.println(matriceA[1].length);
        System.out.println(matriceA[2].length);
        System.out.println(matriceA[3].length);
        /*
        run:
        1
        2
        3
        4
        */
        System.out.println("--");
        
        
        //int matriceB [][] = new int[][];//[4][4]
                            //NON ACCETTA RICHIEDE LA DIMENSIONE
        int matriceB [][];//[4][4]
        
            
        
        for(int riga = 0; riga < matriceA.length; riga++)
        {

            for(int colonna = 0; colonna < matriceA[riga].length; colonna++)
            {
                r1 = riga;
                c1 = colonna;
 
                //System.out.print(matriceB.length);
            }
            //System.out.println("");
            /*
            run:
            0
            11
            222
            3333
            */
            
            
        }

        System.out.println(r1 + " , " + c1);//3 , 3
        System.out.println("--");
        
        
        matriceB = new int[r1+1][c1+1];
        
        System.out.println(matriceB.length);//4
        
        System.out.println("--");
        
        System.out.println(matriceB[0].length);//4
        System.out.println(matriceB[1].length);//4
        System.out.println(matriceB[2].length);//4
        System.out.println(matriceB[3].length);//4
        
        
        
        //System.out.print("test " + matriceB[r1 - 1].length);
        //System.out.print(matriceB[r1 - 1][c1 - 1].length);
        //System.out.println(matriceA.length);
        
        
        
        
        
        /*
        for(int riga = 0; riga < matriceA.length; riga++)
        {
            for(int colonna = 0; colonna < matriceA[riga].length; colonna++)
            {
                
            }
        }
        */
        
        
        int at [][] = {{20, 30}, {100, 200}};
        
        int at2 [][] = new int [2][2];
        
        at2[0][0] = at[1][0];
        
        System.out.println(at2[0][0]);//100
        
        
        
        
        
    }
    
    
    
}
