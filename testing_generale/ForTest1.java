package testing_generale;

import java.lang.reflect.Array;
import java.io.*;
import java.util.Arrays;
//import BreezyGUI.*;
import java.util.Random;

/**
 *
 * @author marko.mirkovic
 * @version 22 October 2022
 */
public class ForTest1 
{
    public static void main(String[] args)
    {

        System.out.println("1");

        //Array [][] array = new Array [4][3];
        int [][] array = { {1,2,3},{4,5,6},{7,8,9},{10,11,12} };

        System.out.println("array.length " + array.length + " " +
                           "array[4-1].length " + array[4-1].length );
        
        for(int riga = 0; riga < array.length; riga++)
        {
            for(int colonna = 0; colonna < array[riga].length; colonna++)
            {
                //array[riga][colonna]= array[riga][colonna];
                System.out.print(array[riga][colonna] + "\t ");
            }
            System.out.println();
            
        }
        
        
        System.out.println("---");
        System.out.println("2");
        
        
        
        int [][] array2 = new int [4][3];

        int i = 0;
        int j = 0;
        int h = 1;
        for(int riga = 0; riga < array2.length; ++riga)
        {
            //i++;
            for(int colonna = 0; colonna < array2[riga].length; ++colonna)
            {
                //j++;
                
                array2[riga][colonna]= h++;
                System.out.print(array2[riga][colonna] + "\t ");
            }
            System.out.println();
            
        }
        System.out.println("---");
        System.out.println("Arrays.toString(array2)");
        System.out.println(Arrays.toString(array2));
        
        
        
        System.out.println("---");
        System.out.println("3");
        
        i = 1;
        Random ran=new Random();
        int [] array3 = new int [3];
        System.out.println("array3.length " + array3.length);
        
        for(int riga = 0; riga < array3.length; riga++)
        {   
            //i++;
            array3[riga] = i++;
            System.out.print(array3[riga] + " \t ");
        }
        System.out.println("");
        
        System.out.println("---");
        
        int [][] matrix = new int[3][3];
            
        for(int r = 0; r<matrix.length;r++)
        {
            for(int c = 0; c<matrix[r].length; c++)
            {
                matrix[r][c]=matrix[r][c];
                System.out.print(matrix[r][c] + " \t");
            }
            System.out.println();
        }
        System.out.println("---");
        System.out.println("Arrays.toString(matrix)");
        System.out.println(Arrays.toString(matrix));
        
        System.out.println("---");
        System.out.println("4");
        
         Random r=new Random();
            int[][] a=new int[4][4];
            for( i=0;i<4;i++)
            {
                for( j=0;j<4;j++)
                {
                   a[i][j]=r.nextInt(3);
                   System.out.print(a[i][j]+"\t");
                }

               System.out.print("\n");
            }
            
            
            System.out.println("---");
            int [] aa = {1,2};
            System.out.println("Arrays.toString(aa)");
            System.out.println(Arrays.toString(aa));
  
        
        
    }
}

