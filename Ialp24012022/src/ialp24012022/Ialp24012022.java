
package ialp24012022;

/**
 * In classe
 * @author Marko Mirkovic
 * @version 31.01.2022
 */

public class Ialp24012022
{

    public static void main(String[] args)
    {
        int m [][] = new int [5][6];
        System.out.println("m.length: " + m.length);
        System.out.println("---");
        
        for(int riga = 0; riga < m.length; riga++)
        {
            for(int colonna = 0; colonna < m[riga].length; colonna++)
            {
                //[0]    [0]
                //[0]    [1]
                //[0]    [2]
                //[0]    [3]
                //[0]    [4]
                //[0]    [5]
                //        -> 0 1 2 3 4 5
                //[1]    [0]
                //[1]    [1]
                //[1]    [2]
                //[1]    [3]
                //[1]    [4]
                //[1]    [5]
                //        -> 0 1 2 3 4 5
                m[riga][colonna] = colonna;
            }
        }
        
        for(int riga = 0; riga < m.length; riga++)
        {
            for(int colonna = 0; colonna < m[riga].length; colonna++)
            {
                System.out.print(m[riga][colonna] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---");
        
        /*
        run:
        012345
        012345
        012345
        012345
        012345
        */
        
        //-------------------------------------------------------------------
        
        int m2 [][] = new int [5][5];
        System.out.println("m.length: " + m.length);//5
        System.out.println("---");
        
        for(int riga = 0; riga < m2.length; riga++)
        {
            for(int colonna = 0; colonna < m2[riga].length; colonna++)
            {
                // r      c
                //[0]    [0]
                //[0]    [1]
                //[0]    [2]
                //[0]    [3]
                //[0]    [4]
                //            c + r * m2[riga].length
                //----------> 0 + 0 * 5 = 0
                //----------> 1 + 0 * 5 = 1
                //----------> 2 + 0 * 5 = 2
                //----------> 3 + 0 * 5 = 3
                //----------> 4 + 0 * 5 = 4
                //---------->                0 1 2 3 4
                // r      c
                //[1]    [0]
                //[1]    [1]
                //[1]    [2]
                //[1]    [3]
                //[1]    [4]
                //            c + r * m2[riga].length
                //----------> 0 + 1 * 5 = 5
                //----------> 1 + 1 * 5 = 6
                //----------> 2 + 1 * 5 = 7
                //----------> 3 + 1 * 5 = 8
                //----------> 4 + 1 * 5 = 9
                //-------------------------> 5 6 7 8 9
                // r      c
                //[2]    [0]
                //[2]    [1]
                //[2]    [2]
                //[2]    [3]
                //[2]    [4]
                //            c + r * m2[riga].length
                //----------> 0 + 2 * 5 = 10
                //----------> 1 + 2 * 5 = 11
                //----------> 2 + 2 * 5 = 12
                //----------> 3 + 2 * 5 = 13
                //----------> 4 + 2 * 5 = 14
                //--------------------------> 10 11 12 13 14 15
                // r      c
                //[3]    [0]
                //[3]    [1]
                //[3]    [2]
                //[3]    [3]
                //[3]    [4]
                //            c + r * m2[riga].length
                //----------> 0 + 3 * 5 = 15
                //----------> 1 + 3 * 5 = 16
                //----------> 2 + 3 * 5 = 17
                //----------> 3 + 3 * 5 = 18
                //----------> 4 + 3 * 5 = 19 
                //--------------------------> 15 16 17 18 19
                // r      c
                //[4]    [0]
                //[4]    [1]
                //[4]    [2]
                //[4]    [3]
                //[4]    [4]
                //
                //            c + r * m2[riga].length
                //----------> 0 + 4 * 5 = 20
                //----------> 1 + 4 * 5 = 21
                //----------> 2 + 4 * 5 = 22
                //----------> 3 + 4 * 5 = 23
                //----------> 4 + 4 * 5 = 24
                //--------------------------> 20 21 22 23 24
                //...
                m2[riga][colonna] = colonna + riga * m2[riga].length;
            }
        }
        
        for(int riga = 0; riga < m2.length; riga++)
        {
            for(int colonna = 0; colonna < m2[riga].length; colonna++)
            {
                System.out.print(m2[riga][colonna] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---");
        
        /*
        m.length: 5
        ---
        0 1 2 3 4 5 
        6 7 8 9 10 11 
        12 13 14 15 16 17 
        18 19 20 21 22 23 
        24 25 26 27 28 29 
        */
        
        //-------------------------------------------------------------------
        
        /*
        int m2 [][] = new int [5][5];
        System.out.println("m.length: " + m.length);//5
        System.out.println("---");
        */
        
        for(int riga = 0; riga < m2.length; riga++)
        {
            for(int colonna = 0; colonna < m2[riga].length; colonna++)
            {
                //[0]    [0]
                //[0]    [1]
                //[0]    [2]
                //[0]    [3]
                //[0]    [4]
                //       [5]
                //
                //[1]    [0]
                //[1]    [1]
                //[1]    [2]
                //[1]    [3]
                //[1]    [4]
                //       [5]
                m2[riga][colonna] = colonna + riga * m2[riga].length;
            }
        }
        
        for(int riga = 0; riga < m2.length; riga++)
        {
            for(int colonna = 0; colonna < m2[riga].length; colonna++)
            {
                m2[riga][colonna] = colonna + riga * m2[colonna].length;
            }
            System.out.println("");
        }
        
        System.out.println("---");
        
        for(int riga = 0; riga < m2.length; riga++)
        {
            for(int colonna = 0; colonna < m2[riga].length; colonna++)
            {
                System.out.print(m2[riga][colonna] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("---");
        
        //-------------------------------------------------------------------
        
        
        //-------------------------------------------------------------------
        
        
        //-------------------------------------------------------------------
        
        
        
    }
}
