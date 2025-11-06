/*
 * IALP Casting testing 1
 * @author Marko Mirkovic
 * @version 25.10.2021
 */
package ialpcastingtesting1;


public class IalpCastingTesting1 {

  
    public static void main(String[] args) {
        
        int a = 0x7FFFFFFF; //2147483647
        System.out.println(a); //2147483647
        System.out.println((short)a); //-1
        
        float f = a; //2.14748365E9 = 2147483647
        System.out.println(f);
        
        float g = 1.111111111111111111F;
        System.out.println(g);
        
        double h = 1.111111111111111111D;
        System.out.println(h);
        
        int i = 256;
        byte ii = (byte)i;
        System.out.println("ii: " + ii);
        short stipendioShort = 0b00000000100000000;
        System.out.println("stipendioShort: " + stipendioShort);
        byte stipendioByte = (byte)stipendioShort;
        System.out.println("stipendioByte: " + stipendioByte);
        
        short s = 0x00FF;
        System.out.println("s: " + s);
        byte b = (byte)s;
        System.out.println("b: " + b);
        
        /*
        run:
        2147483647
        2.14748365E9
        BUILD SUCCESSFUL (total time: 1 second)
        */
        
        
        
    }
    
}
