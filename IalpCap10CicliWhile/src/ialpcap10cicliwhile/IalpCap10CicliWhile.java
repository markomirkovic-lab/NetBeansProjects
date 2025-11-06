/**
 * IALP cap. 10 ciclo while
 * 
 * 
 * @author marko.mirkovic
 * Version 22.11.2021
 */
package ialpcap10cicliwhile;

import java.util.Scanner;

public class IalpCap10CicliWhile
{


    public static void main(String[] args)
    {
        
        /*
        while (condizioneBooleana)
            istruzione_o_blocco
        */
                
        boolean notaValida=false;
        double nota=0;
        
        
        Scanner tastiera = new Scanner(System.in);
        
        notaValida=false;
        //All'inizio del ciclo la nota è sempre non valida 
        while(!notaValida)  //Oppure notaValida==false
        {
            System.out.print("Inserire una nota fra 1 e 6: ");
            nota=tastiera.nextDouble();
            notaValida= (nota>=1.0) && (nota<=6.0);
        }
        System.out.println(nota);
        
    }
    
}
