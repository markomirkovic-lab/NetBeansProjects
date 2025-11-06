/**
 * Merc -> Scanner
 *
 * @author marko.mirkovic
 * Version 17.10.2021
 */
package merct1;

import java.util.Scanner;


public class MercT1 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int terrestrialYears = 0;
        int terrestrialDays = 0;
        double yearConversion = 4.147727;
        double dayConversion = 0.011363;
        double mercurianTime = 0.0;
        double mercurianTimeTruncated = 0.0;
        
        System.out.println("Write terrestrial years: ");
        terrestrialYears = input.nextInt();
        
        System.out.println("Write terrestrial days: ");
        terrestrialDays = input.nextInt();
        
        /*
        mercurianTime = (( (int) ( ((terrestrialYears * yearConversion)) +
                        (terrestrialDays * dayConversion)) * 10.0F) / 10.0F);
        */
        
        /*
        mercurianTime = ((((int)(terrestrialYears * yearConversion)) * 10) / 10)
                      + ((((int) (terrestrialDays * dayConversion)) * 10) / 10);
        */
        
        mercurianTime = ((terrestrialYears * yearConversion)) +
                        ((terrestrialDays * dayConversion));
        
        mercurianTimeTruncated = (  (int) (mercurianTime * 10) ) / 10.0;
        
        //System.out.println(terrestrialYears * yearConversion);
        //System.out.println(terrestrialDays * dayConversion);
        //System.out.println(mercurianTime);        
        
        /*
        mercurianTime = (( ((int)((terrestrialYears * yearConversion)) * 10) +
                        ((int)terrestrialDays * dayConversion) * 10) ) / 10;
        */
        
        /*
        mercurianTime = ( ( (int)((terrestrialYears * yearConversion)) +
                        ((int)terrestrialDays * dayConversion) ) * 10 ) / 10;
        */
        
        System.out.println("Mercurian Time is " + mercurianTimeTruncated + " years");
        
    }
    
}
