/**
 * Es. 9.5 Espressioni bolleane
 *
 * @author marko.mirkovic
 * Version 14.11.2021
 */
package ialpes9e5;


public class IalpEs9e5 {

    
    public static void main(String[] args) {
        
        int x = 5;
        int y = 10;
        int z = 15;
        
        System.out.println((x<5) && y>x);
        System.out.println((x<5) || y>x);
        System.out.println((x>3) || y<10 && z==15);
        System.out.println(!(x>3) && x!=z || x+y==z);
        
    }
    
}
