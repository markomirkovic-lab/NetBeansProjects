/**
 * IALP Esercizio Area
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;

import java.util.Scanner;

public class Es7_2_Area
{
    public static void main(String[] args)
    {
        Scanner tastiera=new Scanner(System.in);
        float raggio;
        int area;
        final double PI=3.14;
        System.out.print("Inserire il raggio: ");
        raggio=tastiera.nextFloat();
        //Prima soluzione, casto ogni variabile
        area=(int)raggio*(int)raggio*(int)PI; // 12, soluzione errata
        System.out.println("Usando il casting su ogni variabile ottengo: " + area);
        //Seconda soluzione, Java applica il casting implicito ai
        //float e poi castiamo a int il risultato
        area=(int)(raggio*raggio*PI); //soluzione corretta base casting su int
        System.out.println("Usando il casting sul risultato ottengo: " + area);
        //System.out.println((int)(2.5*2.5*PI));
    }
}
