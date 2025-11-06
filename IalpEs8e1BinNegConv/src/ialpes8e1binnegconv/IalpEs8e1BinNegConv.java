/**
 * Esercizio 8.1 BinaryConverter from positive to negative
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package ialpes8e1binnegconv;


public class IalpEs8e1BinNegConv {

   
    public static void main(String[] args) {
        
        byte b = -128;
        
        System.out.print((b & 0x80) == 0 ? 0 : 1);
        System.out.print((b & 0x40) == 0 ? 0 : 1);
        System.out.print((b & 0x20) == 0 ? 0 : 1);
        System.out.print((b & 0x10) == 0 ? 0 : 1);
        System.out.print((b & 0x08) == 0 ? 0 : 1);
        System.out.print((b & 0x04) == 0 ? 0 : 1);
        System.out.print((b & 0x02) == 0 ? 0 : 1);
        System.out.println((b & 0x01) == 0 ? 0 : 1);
        
        
        System.out.print((b >> 7) & 1);
        System.out.print((b >> 6) & 1);
        System.out.print((b >> 5) & 1);
        System.out.print((b >> 4) & 1);
        System.out.print((b >> 3) & 1);
        System.out.print((b >> 2) & 1);
        System.out.print((b >> 1) & 1);
        System.out.println(b & 1);
        
        
    }
    
}
