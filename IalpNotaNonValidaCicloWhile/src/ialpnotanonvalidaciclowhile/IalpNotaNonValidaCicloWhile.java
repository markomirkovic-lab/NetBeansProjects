/**
 * Teoria (Nota non valida con ciclo while)
 *
 * CICLO WHILE PRE-CONDIZIONALE
 * 
 * @author marko.mirkovic
 * Version 29.11.2021
 */
package ialpnotanonvalidaciclowhile;

import java.util.Scanner;

public class IalpNotaNonValidaCicloWhile
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        boolean notaValida=false;
        double nota=0; 
        
        /*
        while(condizioneBooleana)
        istruzione_o_blocco
        */
 
        notaValida=false;   //All'inizio del ciclo la nota è sempre non valida
        while(!notaValida)  //Oppure notaValida==false
        {
        System.out.print("Inserire una nota fra 1 e 6: ");
        nota=input.nextDouble();
        notaValida= (nota>=1.0) && (nota<=6.0);
        }
        System.out.println(nota);
    }
    
}
