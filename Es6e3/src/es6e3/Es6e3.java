/**
 * Testing es. 6.3
 * Calcolo delle note scolastiche
 * L'algoritmo per il calcolo della nota dei moduli IALP+ALPR+LPRO
 * 
 * @author marko.mirkovic
 * Version 30.10.2021
 */
package es6e3;

public class Es6e3 {

   
    public static void main(String[] args) {
        float notaIalp = 5.80F;
        float notaAlpr = 5.50F;
        float notaLpro = 5.10F;
        float mediaNote;
        
        mediaNote = (notaIalp + notaAlpr + notaLpro) / 3F;
        System.out.println("La media note IALP, ALPR e LPRO = " + mediaNote);
    }
    
}
