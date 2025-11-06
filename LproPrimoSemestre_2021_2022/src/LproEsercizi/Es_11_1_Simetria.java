
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
 * @author Marko Mirkovic&
 * @version 29.01.2022
 */

public class Es_11_1_Simetria
{
    public static void main(String[] args)
    {
        int matriceA [][] = {
                                {1},
                                {2, 1},
                                {3, 2, 1},
                                {4, 3, 2, 1}
                          };
        
        //System.out.println(matriceA.length);//4
        
        System.out.println("--");
        System.out.println("Print matriceA[0]-[3], 4 righe length:");
        System.out.println(matriceA[0].length);
        System.out.println(matriceA[1].length);
        System.out.println(matriceA[2].length);
        System.out.println(matriceA[3].length);
        System.out.println("--");
        System.out.println("Print matriceA:");
        for(int riga = 0; riga < matriceA.length; riga++)
        {
            for(int colonna = 0; colonna < matriceA[riga].length; colonna++)
            {
                System.out.print(matriceA[riga][colonna]);
            }
            System.out.println("");
        }
        System.out.println("--");
        
        //int matriceB [][] = new int[4][4];
        
        /*
        int matriceB [][] = {
                                {},
                                {},
                                {},
                                {}
                            };
        */
        
        
        //int matriceB [][] = {{},{},{},{}};
        
        int matriceB [][];
        
        
        //System.out.println(matriceB.length);//4
        
        int r1 = 0;//Inizzializzare a 0 per poter utilizzare il
                   //valore variabile fuori dal cliclo for
        int c1 = 0;//Inizzializzare a 0 per poter utilizzare il
                   //valore variabile fuori dal cliclo for
        
        
        
        
        for(int riga = 0; riga < matriceA.length ; riga++)
        {
            for(int colonna = 0; colonna < matriceA[riga].length ; colonna++)
            {
                r1 = riga;
                c1 = colonna;
            }
        
        }
        System.out.println("r1 , c1:");
        System.out.println(r1 + " , " + c1);
        System.out.println("--");
         
        matriceB = new int [r1 + 1][c1 + 1 ];
        System.out.println("matriceB.length , matricB[r1].length:");
        System.out.println(matriceB.length + " , " + matriceB[r1].length);
        //System.out.println();
        System.out.println("--");
        
        //innumerevoli tentativi...
        
        /*
        for(int riga = matriceA.length-1; riga >= 0 ; riga--)
        {
            for(int colonna = matriceA[riga].length-1; colonna >= 0 ; colonna--)
            {
                //for(int i = 0; i < matriceA.length; i++)
                  //      {
                            matriceB [riga][colonna] = matriceA [riga][colonna];
                    //    }
                //System.out.print(matriceA [riga][colonna]);
            }
            //System.out.println("");
        }
        */
        
        /*
        for(int rigaMatriceA = matriceA.length-1; rigaMatriceA >= 0; rigaMatriceA--)
        {
            for(int colonnaMatriceA = 0; colonnaMatriceA < matriceA[rigaMatriceA].length ; colonnaMatriceA++)
            {
                for(int rigaMatriceB = 0; rigaMatriceB < matriceA.length; rigaMatriceB++)
                {
                    for(int colonnaMatriceB = 0; colonnaMatriceB < matriceA[rigaMatriceA].length; colonnaMatriceB++)
                    {
                        
                            matriceB [rigaMatriceB][colonnaMatriceB] = matriceA [rigaMatriceA][colonnaMatriceA];
                        
                    }
                }

                ////System.out.print(matriceA [riga][colonna]);
            }
            System.out.println("");
        }
        */
        
        /*        //                     4-1 = 3            3>0                3--
        for(int rigaMatriceA = matriceA.length-1; rigaMatriceA >= 0; rigaMatriceA--)
        {
            //                        4-1 = 3                          3 > 0                 3--
            for(int colonnaMatriceA = matriceA[rigaMatriceA].length-1; colonnaMatriceA > 0 ; colonnaMatriceA--)
            {
                //
                for(int rigaMatriceB = 0; rigaMatriceB < matriceA.length; rigaMatriceB++)
                {
                    //
                    for(int colonnaMatriceB = 0; colonnaMatriceB < matriceA[rigaMatriceA].length; colonnaMatriceB++)
                    {
                        
                        //matriceB = new int [rigaMatriceB][colonnaMatriceB];     
                        matriceB [rigaMatriceB][colonnaMatriceB] = matriceA [rigaMatriceA][colonnaMatriceA];
                        
                    }
                }

                ////System.out.print(matriceA [riga][colonna]);
            }
            //System.out.println("");
        }
        */
        
        /*
        
                //                     4-1 = 3            3>0                3--
                //                           2            2>0                2--
        for(int rigaMatriceA = matriceA.length-1; rigaMatriceA >= 0; rigaMatriceA--)
        {
            //int counterRiga = 0;
            //counterRiga++;
            //                        4-1 = 3                          3 > 0                 3--
            //                              2                          2 > 0                 2--
            for(int colonnaMatriceA = matriceA[rigaMatriceA].length-1; colonnaMatriceA >= 0 ; colonnaMatriceA--)
            {
                //int counterColonna = 0;
                //counterColonna++;
                        
                //                     0  0 < 4                           0++
                //                     1  1 < 4                           1++
                //for(int rigaMatriceB = 0; rigaMatriceB < matriceA.length; rigaMatriceB++)
                //{
                    //                        0  0 < 4             4                              0++
                    //                        1  1 < 3             3                              1++
                    //for(int colonnaMatriceB = 0; colonnaMatriceB < matriceA[rigaMatriceA].length; colonnaMatriceB++)
                    //{
                  
                        
                        
                        //matriceB = new int [rigaMatriceB][colonnaMatriceB];
                        //        0             0                            3             3
                        //        0             1                            3             2
                        //        0             2                            3             1
                        //        0             3                            3             0
                        //        1             0                            2             2            
                        //        1             1                            2             1
                        //        1             2                            2             0
                        //
                        matriceB [rigaMatriceA-matriceA.length-1][colonnaMatriceA-matriceA.length-1] = matriceA [rigaMatriceA][colonnaMatriceA];
                        
                    //}
                //}

                ////System.out.print(matriceA [riga][colonna]);
            }
            //System.out.println("");
        }
        
        */
        
        /*
        , rigaMatriceB < matriceA.length
        , int rigaMatriceB = 0
        , rigaMatriceB++
        , int rigaMatriceB = 0
        */
        
        //---------------------------------------------------------------------
        //cicli for finali per create la matrice B
        for(int rigaMatriceA = matriceA.length-1; rigaMatriceA >= 0; rigaMatriceA--)
        {
            for(int colonnaMatriceA = matriceA[rigaMatriceA].length-1; colonnaMatriceA >= 0 ; colonnaMatriceA--)
            {
                matriceB [colonnaMatriceA][rigaMatriceA] = matriceA [rigaMatriceA][colonnaMatriceA];
            }
        }
        //---------------------------------------------------------------------
        
        
        //Print matriceB
        System.out.println("Print matriceB:");
        for(int riga = 0; riga < matriceB.length; riga++)
        {
            for(int colonna = 0; colonna < matriceB[riga].length; colonna++)
            {
                System.out.print(matriceB[riga][colonna]);
            }
            System.out.println("");
        }
        
        
        /*
        //Print matricB bis
        System.out.println("Print matricB bis:");
        for(int riga = matriceA.length-1; riga >= 0 ; riga--)
        {
            for(int colonna = matriceA[riga].length-1; colonna >= 0 ; colonna--)
            {
                System.out.print(matriceB [riga][colonna]);
            }
            System.out.println("");
        }
        */
        
        System.out.println("--");
         //Print matriceB tris
        System.out.println("Print matriceB print manipolato:");
        System.out.println("*********");
        for(int riga = 0; riga < matriceB.length; riga++)
        {
            for(int colonna = 0; colonna < matriceB[riga].length; colonna++)
            {
                if(matriceB[riga][colonna]==0)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(matriceB[riga][colonna]);
                }
            }
            System.out.println("");
        }
        System.out.println("*********");
        
        
        System.out.println("-last-");
        System.out.println(matriceB.length);
        System.out.println("--");
        System.out.println("Print matrice B manuale");
        //System.out.print(matriceB.length);
        System.out.print(matriceB[0][0]);
        System.out.print(matriceB[0][1]);
        System.out.print(matriceB[0][2]);
        System.out.println(matriceB[0][3]);
        System.out.print(matriceB[1][0]);
        System.out.print(matriceB[1][1]);
        System.out.print(matriceB[1][2]);
        System.out.println(matriceB[1][3]);
        System.out.print(matriceB[2][0]);
        System.out.print(matriceB[2][1]);
        System.out.print(matriceB[2][2]);
        System.out.println(matriceB[2][3]);
        System.out.print(matriceB[3][0]);
        System.out.print(matriceB[3][1]);
        System.out.print(matriceB[3][2]);
        System.out.print(matriceB[3][3]);
        System.out.println("");
        System.out.println("--");
        
        /*
        run:
        --
        Print matriceA[0]-[3], 4 righe length:
        1
        2
        3
        4
        --
        Print matriceA:
        1
        21
        321
        4321
        --
        r1 , c1:
        3 , 3
        --
        matriceB.length , matricB[r1].length:
        4 , 4
        --
        Print matriceB:
        1234
        0123
        0012
        0001
        --
        Print matriceB print manipolato:
        *********
        1234
         123
          12
           1
        *********
        -last-
        4
        --
        Print matrice B manuale
        1234
        0123
        0012
        0001
        --
        */
    }
}
