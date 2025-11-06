
package test1;


public class Test1 {

    
    public static void main(String[] args) {
        
        double a = 3.0;
        short b = 14;
        
        System.out.println(a * b/100); //3.0 -> risultato del test!
        
        System.out.println(a * (b/100)); //0.0
        
        System.out.println(a + ((double)b/100)); // 3.14
        
        //----------------------------------------------
                
        int c = 1234567;
        
        System.out.println((short)c);// -10617
        
        long d = 1234567;
        
        System.out.println((short)d);// -10617
        
        //-----------------------------------
        
        String e = "a + b";
        
        int f = 2;
        
        int g = 3;
        
        System.out.println(" a + b " + 2 + 3);  //a + b 23
        System.out.println(e + 2 + 3);          //2 + b 23
        System.out.println(2 + 3 + "=" + e);    //5=a + b
        
    }
    
}
