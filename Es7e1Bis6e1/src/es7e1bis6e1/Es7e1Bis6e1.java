/**
 * 7.1 -> Scanner 6.1 Calcolo conversione da Fahrenheit a Celsius
 * 
 * @author marko.mirkovic
 * Version 17.10.2021
 */
package es7e1bis6e1;

import java.util.Scanner;


public class Es7e1Bis6e1 {

   
    public static void main(String[] args)
    {
    
        float gradiF = 0.0F;
        float gradiC = 0.0F;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserici gradi Fahrenheit: ");
        gradiF=input.nextFloat();
        
        gradiC = (gradiF - 32.0F) * 5.0F / 9.0F;
        
        System.out.print(gradiF + " °F valgono ");
        System.out.println(gradiC + "°C");
        
        /*
        run:
        Inserici gradi Fahrenheit: 50
        50.0 °F valgono 10.0°C
        BUILD SUCCESSFUL (total time: 3 seconds)
        */
        
    }
    
}
