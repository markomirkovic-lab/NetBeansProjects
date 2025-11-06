/**
 * IALP es. TroncaDouble
 * 
 * @author marko.mirkovic
 * Version 10.10.2021
 */
package troncadouble;


public class TroncaDouble {

    
    public static void main(String[] args) {
        /*Scrivi il programma TroncaDouble che, data la variabile double n,
        ne stampa a terminale il valore troncato a 3 cifre decimali.
        Ad esempio per n = 1.23456789:*/
        
        double n = 1.23456789;
        
        double nTroncato;
        
        nTroncato = ((int)(n * 1000.0))/1000.0; //(int)(var*1000.00)
        
        System.out.println(nTroncato);
        
    }
    
}
