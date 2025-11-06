/**
 * IALP Esercizio Arrotondamenti
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;

import java.util.Scanner;

public class Es7_3_Arrotondamenti
{
    public static void main(String[] args)
    {
        Scanner tastiera=new Scanner(System.in);
        double nro;
        double arrotondato, arrotondato2, arrotondato3;
        System.out.print("Inserire un numero con la virgola: ");
        nro=tastiera.nextDouble();
        //Arrotondiamo a tre cifre dopo la virgola
        //arrotondato=((int)(nro*1000))/1000.0;     //3.141
        arrotondato=((int)(nro*100))/100.0;         //3.14
        arrotondato2=((int)(nro*100))/100F;         //3.140000104904175
        arrotondato3=((int)(nro*100))/100D;         //3.14
        //È importante che sia 1000.0 e non 1000
        System.out.println("Arrotondato " + arrotondato);
        System.out.println("Arrotondato " + arrotondato2);
        System.out.println("Arrotondato " + arrotondato3);
    }
}
