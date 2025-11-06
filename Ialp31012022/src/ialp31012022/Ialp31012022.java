
package ialp31012022;

import java.util.Scanner;

/**
 * In classe
 * @author Marko Mirkoivc
 * @versin 31.01.2022
 */
public class Ialp31012022
{

    public static void main(String[] args)
    {
        //Scanner tastiera = new Scanner(System.in);
        //limiatare tra un min e un max
        //limitare v [0;100]
        
        //int v = tastiera.nextInt();
        //if
        
        System.out.println(Math.floor(1.5));//1.0
        System.out.println(Math.round(1.5));//2
        System.out.println(Math.round(1.4));//1
        
        System.out.println(Math.nextDown(1.0));//0.9999999999999999
        System.out.println(Math.nextUp(1.0));  //1.0000000000000002
        System.out.println("--");
        
        /*
        1.0
        2
        1
        0.9999999999999999
        1.0000000000000002
        */
        
        System.out.println("--");
        
        double n = 1.0;
        for(int i = 0; i < 10; i++)
        {
            System.out.println(n);
            n = Math.nextUp(n);
        }
        
        /*
        1.0
        1.0000000000000002
        1.0000000000000004
        1.0000000000000007
        1.0000000000000009
        1.000000000000001
        1.0000000000000013
        1.0000000000000016
        1.0000000000000018
        1.000000000000002
        */
        
    }
    
}
