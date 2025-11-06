/*
 * LPRO Es. 7.3 data ISO anno mese giorno
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package lpro7e3dataiso;

import java.util.Scanner;


public class Lpro7e3DataISO {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        long dataIso;
        String anno, mese, giorno;
        
        String dataIsoString;
        
        System.out.print("Inserici data AAAAMMGG: ");
        //                              012345678
        //dataIso = in.nextLong();
        dataIsoString = in.nextLine();
        
               
        anno = dataIsoString.substring(0,4);
        mese = dataIsoString.substring(4,6);
        giorno = dataIsoString.substring(6,8);
        
        /*
        System.out.print("La data è: " + dataIsoString.charAt().substring(0, 3) +
                          ", " + dataIsoString.charAt().substring(5, 7) + ", " +
                          dataIsoString.cartAt().substring(6, 8));
        */
        
        System.out.println("La data è: " + anno + ", " + mese + ", " + giorno);
        
        /*
        run:
        Inserici data AAAAMMGG: 20140923
        La data è: 2014, 09, 23
        */
    }
    
}
