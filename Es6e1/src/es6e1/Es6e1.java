/**
 * 6.1 Calcolo conversione da Fahrenheit a Celsius
  * 
 * @author marko.mirkovic
 * Version 26.09.2021
 */
package es6e1;


public class Es6e1 {

   
    public static void main(String[] args) {
        float gradiF = 10.5F;
        float gradiC = (gradiF - 32.0F) * 5.0F / 9.0F;
        System.out.print(gradiF + "F valgono ");
        System.out.println(gradiC + "°C");
        
    }
    
}
