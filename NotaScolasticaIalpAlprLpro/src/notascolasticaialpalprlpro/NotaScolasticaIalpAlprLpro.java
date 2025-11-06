/**
 * Testing es. 3.6 Decodifica
 * 3.6 Calcolo delle note scolastiche
 * L'algoritmo per il calcolo della nota dei moduli IALP+ALPR+LPRO
 * 
 * @author marko.mirkovic
 * Version 26.09.2021
 */
package notascolasticaialpalprlpro;

import java.util.Scanner;

public class NotaScolasticaIalpAlprLpro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float notaIalp, notaAlpr, notaLpro;
       
       Scanner scan = new Scanner(System.in);
       System.out.print("Scrivere la nota IALP: ");
       notaIalp = scan.nextFloat();
       System.out.print("Scrivere la nota ALPR: ");
       notaAlpr = scan.nextFloat();
       System.out.print("Scrivere la nota LPRO: ");
       notaLpro = scan.nextFloat();
       
       System.out.println("Media note IALP ALPR LPRO = " + (notaIalp + notaAlpr + notaLpro)/3);
       
       
    }
    
}
