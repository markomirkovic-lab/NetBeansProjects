package test;

import java.util.Arrays;

public class ZZZZZZZZZZZ 
{
    public static double[] getSum(String[][] m)
    {
        double[] ret= new double[m.length];
        
        for(int r=0; r<m.length; r++)
        {                
            ret[r]= 0.0;
            for(int c=0; c<m[r].length; c++)
            {
                ret[r] = ret[r] + Double.parseDouble(m[r][c]);
            }
        }
        
        return ret;
    }
    
    
    public static void main(String[] args) 
    {
        String [][] matriceString = {
                                        {"3.14", "-1.0", "7.58"},           // <--r
                                        {"12.11", "0.0", "9.32"},
                                        {"5.0", "2.71", "-11.0"}, 
                                        {"5.0", "2.71", "3"}
                                    };        
        
        double[] x= getSum(matriceString);
        
        System.out.println( Arrays.toString(x) );
        
    }
}
