/**
 * IALP es. 7.3
 * 
 * @author marko.mirkovic
 * Version 10.10.2021
 */
package ialpes7e3;


public class IalpEs7e3 {

    public static void main(String[] args) {
        
        double pi = 3.141592654;
        
        double primoPi;        
        double secondoPi;
        double terzoPi;
        
        primoPi = ((int)(pi * 100.00))/100.00;
        
        System.out.println("primo Pi = " + primoPi);
        
        secondoPi = ((int)(pi * 100.000))/100.000;
        
        System.out.println("secondo Pi = " + secondoPi);
        
        terzoPi = ((int)(pi * 1000.000))/1000.000;
        
        System.out.println("terzo Pi = " + terzoPi);
        
        
    }
    
}

