/**
 * IALP FOR cycles
 *
 * 
 * @author marko.mirkovic
 * Version 29.11.2021
 */
package ialpfor29112021;


public class IalpFor29112021
{

    public static void main(String[] args)
    {
        //Succesione 0,1,2,3,4,5,6,7,8,9,10
        
        for(int i = 0; i<11; i++)
        {
            System.out.println(i);
        }
        
        System.out.println("");
        
        for(int i = 0; i<11; i = i + 1)
        {
            System.out.println(i);
        }
        
        System.out.println("");
        
        //Successione 5,4,3,2,1
        
        for(int i = 5; i>= 0; i--)
        {
            System.out.println(i);
        }
        
        System.out.println("");
        
        //Successione 1,2,4,8,16,32
        
        for(int i = 1; i<33; i = i*2)
        {
            System.out.println(i);
        }
        
        System.out.println("");
        
        for(int i = 1; i<33; i = i*2)
        {
            System.out.print(i + " ");
        }
        
        System.out.println("");
        
        //Anni bissestili 1600, 1601, 1602,..., 3000
        /*
        Un anno è bisestile se il suo numero è divisibile per 4,
        con l'eccezione degli anni secolari (quelli divisibili per 100)
        che sono bisestili solo se divisibili per 400. 
        */
        for(int i = 1600; i<=3000; i++)
        {
            if(i%4 == 0 || (i%100 == 0 && i%400 == 0))
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        //if condizione sbagliata
        for(int i = 1600; i<=3000; i++)
        {
            if(i%100 == 0 && i%4 == 0 || i%100 == 0 && i%400 == 0)
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        for(int i = 1600; i<=3000; i++)
        {
            if(i%100 != 0 && i%4 == 0 || i%400 == 0)
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        for(int i = 1600; i<=3000; i+=4) //i = i + 4
        {
            if(i%100 != 0 || i%400 == 0)
            {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        
        int ii = 1600;
        while(ii < 3001)
        {
            if(ii%100 != 0 || ii%400 == 0)
            {
                System.out.print(ii + " ");
            }
            ii+=4;
        }
        
         System.out.println("");
        
    }
    
}
