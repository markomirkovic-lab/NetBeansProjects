
package ialpesercizi;

import java.util.Scanner;

/**
 * Array (Soluzioni) Es. 11. 5 Minimo
 * @author marko.mirkovic
 * @version 03.04.2022
 */
public class Es_11_5_Minimo_Soluzione
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        long min, max;
        long[] numero={1, 3, -7, 12, 57, -6 , 546, 2};
        //Oppure
        //numero=new long[8];
        //numero[0]=1; numero[1]=3; numero[2]=-7; numero[3]=12;
        //numero[4]=57; numero[5]=-6; numero[6]=546; numero[7]=2;
        min=max=numero[0]; //minimo e massimo sono la prima cella
        
        for(int i=1; i<numero.length; i++)
        {
            if(numero[i]<min)
            {
                min=numero[i];
            }
            else if(numero[i]>max)
            {
                max=numero[i];
            }
            
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
        
        /*
        run:
        min: -7
        max: 546
        */
    }
}
