
package test;

/**
 * Esercizio 1 - LPRO
 * @author Marko Mirkovic
 * @version 04.04.2022
 */
public class Sgt1B
{
    /**
     * Conversion form string matrix to double matrix
     * @param s string matrix
     * @param d double matrix
     * @return converted from string to double matrix
     */
    public static double strToDouble(String [][] s, Double [][] d)
    {
        return 0;//pro-forma
    }
    /**
     * Sum of the matrix rows and inserting the sum in an array row
     * @param array array where the sum goes
     * @param matrix matrix with data 
     * @return 
     */
    
    public static double sumArray(double[] array, double[][] matrix)
    {
        /*
        double matriceDouble [][];
        double arraySum [];
        for(int r = 0; r<matriceDouble.length; r++)
        {
            for(int c = 0; c<matriceDouble[r].length; c++)
            {
                if(r==0)
                {
                    arraySum[r] = arraySum[r] + matriceDouble[r][c];
                }
                
                if(r==1)
                {
                    arraySum[r] = arraySum[r] + matriceDouble[r][c];
                }
                
                if(r==2)
                {
                    arraySum[r] = arraySum[r] + matriceDouble[r][c];
                }
                
            }
            return
            
        }
        */
        return 0;//pro-forma
    }
    /**
     * Prints double without going to next line
     * @param a double parameter
     */
    public static void println(double a)
    {
        System.out.println(a);
    }
    /**
     * Prints string by going to next line
     * @param a string parameter
     */
    public static void println(String a)
    {
        System.out.println(a);
    }
    public static void main(String[] args)
    {
        
        String [][] matriceString = {
                                        {"3.14", "-1.0", "7.58"},
                                        {"12.11", "0.0", "9.32"},
                                        {"5.0", "2.71", "-11.0"}
                                    };
        
        double [][] matriceDouble = new double [matriceString.length][matriceString.length];
        
        double [] arraySum = new double [matriceString.length];
        
        //System.out.println(matrice.length);
        
        System.out.println("");
        for(int r = 0; r<matriceString.length; r++)
        {
            for(int c = 0; c<matriceString[r].length; c++)
            {
                //System.out.println(matriceString[r][c]);
                matriceDouble[r][c] = Double.parseDouble(matriceString[r][c]);
            }
        }
        
        
        
        for(int r = 0; r<matriceString.length; r++)
        {
            for(int c = 0; c<matriceString[r].length; c++)
            {
                println(matriceDouble[r][c]);
            }
            println("");
        }
        
        
       
                
        for(int r = 0; r<matriceDouble.length; r++)
        {
            for(int c = 0; c<matriceDouble[r].length; c++)
            {
                arraySum[r] = arraySum[r] + matriceDouble[r][c];                
            }
        }
        
        System.out.println("Array sums print: ");
        for(int r = 0; r<arraySum.length; r++)
        {
            System.out.println(arraySum[r]);
        }
        
        /*
        //arraySum[r] = Integer.parseInt(matriceString[r][c]);
        System.out.println("---");
        System.out.println(arraySum[0]);
        System.out.println(arraySum[1]);
        System.out.println(arraySum[2]);
        */
        
        /*
        
        */
        
    }
}
