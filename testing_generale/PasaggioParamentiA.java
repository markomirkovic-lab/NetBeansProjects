package testing_generale;

import java.util.Arrays;

/**
 *
 * @author marko.mirkovic
 * @version 23 October 2022
 */
public class PasaggioParamentiA 
{
    public static void reverse(int [] a)
    {
        int dum;
        //                 4 / 2 = 2
        for(int i = 0; i < a.length / 2 ; i++)
        {
            dum = a[i];//dum = {1,2,3,4}
            a[i] = a[a.length - 1 - i];
            //4 - 1 - 0 = 3 -> a[3] = 4
            //4 - 1 - 1 = 2 -> a[2] = 3
            //a[0] = 4
            //a[1] = 3
            //a = [4,3]
            //stop
            
            //(
            //4 - 1 - 2 = 1 -> a[1] = 2
            //4 - 1 - 3 = 0 -> a[0] = 1
            //)
            System.out.println(a[a.length-1 - i]);
            a[a.length - 1 - i] = dum;
            //a[3] = 4  =  dum[3] = 4
            //a[2] = 3  =  dum[2] = 3
            //dum = {1,2 3,4}
            
            
        }
    }
    
    public static void scambia(int [] array)
    {
        int dum = array[0];
        array[0] = array[1];
        array[1] = dum;
                
    }
            
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(arr));
        scambia(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("---");
        int[] mioArray = {1, 2, 3 , 4, 5};
        System.out.println("---");
        System.out.println(Arrays.toString(mioArray));
        reverse(mioArray);
        System.out.println(Arrays.toString(mioArray));
                
    }
}
