/**
 * Esercizio Bisestili 2
 * 
 * Scrivi il programma Bisestili che stampa tutti gli anni bisestili
 * (wiki) tra il 1600 e il 3000. Esempio:
 * 
 * 1600, 1604, 1608, 1612, 1616, 1620, ... 2976, 2980, 2984, 2988, 2992, 2996.
 * 
 * @author marko.mirkovic
 * Version 22.11.2021
 */
package ialpbisestili2;

//import java.util.Scanner;

public class IalpBisestili2
{

    
    public static void main(String[] args)
    {
        int annoInput = 1600;
        int var = 4;
        int annoBisestile;
        System.out.println(annoInput);
        
        //Scanner tastiera = new Scanner(System.in);
        
        do
        {/*System.out.print("Inserire anno di 4 cifre AAAA: ");*/
            //annoInput=tastiera.nextInt();
            annoBisestile = annoInput + var;
            System.out.println(annoBisestile + ", ");
            annoInput = annoBisestile ;
        } 
        while (annoBisestile <=3000);
       
   
        
        
        
    }
    
}
