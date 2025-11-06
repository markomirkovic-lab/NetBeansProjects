/**
 * Note 8
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package note8;

public class Note8 {

    public static void main(String[] args) {
        
       int a = +1; // a vale 1
       int b = -a; //b vale -1 
       System.out.println(b); //-1
       
       
       /*
       
       byte b0 = (byte) (b % 2);
       b /= 2;
       
       byte b1 = (byte) (b % 2);
       b /= 2;
       
       byte b2 = (byte) (b % 2);
       b /= 2;
             
       byte b3 = (byte) (b % 2);
       b /= 2;
       
       byte b4 = (byte) (b % 2);
       b /= 2;
       
       byte b5 = (byte) (b % 2);
       b /= 2;
       
       byte b6 = (byte) (b % 2);
       b /= 2;
       byte b7 = (byte) (b % 2);
       
       System.out.println("" + b7 + b6 + b5 + b4 + b3 + b2 + b1 + b0);
       //Oppure con una sola variabile di tipo stringa:
       String result = "";
       result = "" + (b % 2);
       b /= 2;
       result = (b % 2) + result;
       b /= 2;
       
       result = (b % 2) + result;
       b /= 2;
       System.out.println(result);
       // Questo approccio può essere scritto in modo più compatto grazie alla notazione compatta:
       //String result = "";
       result = "" + (b % 2);
       result = ((b /= 2) % 2) + result;
       
       result = ((b /= 2) % 2) + result;
       System.out.println(result);

       */
        
    }
    
}
