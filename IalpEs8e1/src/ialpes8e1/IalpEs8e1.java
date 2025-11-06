/**
 * Esercizio 8.1 BinaryConverter
 *
 * @author marko.mirkovic
 * Version 07.11.2021
 */
package ialpes8e1;

//import java.util.Scanner;

public class IalpEs8e1 {

    public static void main(String[] args) {
        
        //Scanner input = new Scanner(System.in);
        
        
        byte a = 7;
        
        /*
        7 : 2 = 3 con resto di 1
        3 : 2 = 1 con resto di 1
        1 : 2 = 0 con resto di 1
        
        7 = 111 binario = 00000111
        */
        
        //int nota;
        
        //System.out.print("Inserici un numero: ");
        //nota=input.nextInt();
        
        
       //byte b =0;
        
        int b, c, d, e, f, g, h, i;
        
        //c=e=f=h=i=j=k=b;
        
        byte b0 = (byte) (a%2); // 7 / 2 = 3 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // a = 3
        //System.out.println(a);
        byte b1 = (byte) (a%2); // 3 / 2 = 1 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // a = 1
        //System.out.println(a);
        byte b2 = (byte) (a%2); // 1 / 2 = 0 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // 0 / 0 = 0
        //System.out.println(a);
        byte b3 = (byte) (a%2); // 0 / 2 = 0 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // 0 / 0 = 0
        //System.out.println(a);
        byte b4 = (byte) (a%2); // 0 / 2 = 0 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // 0 / 0 = 0
        //System.out.println(a);
        byte b5 = (byte) (a%2); // 0 / 2 = 0 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // 0 / 0 = 0
        //System.out.println(a);
        byte b6 = (byte) (a%2); // 0 / 2 = 0 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // 0 / 0 = 0
        //System.out.println(a);
        byte b7 = (byte) (a%2); // 0 / 2 = 0 -> Resto 1, a%2 stampa il resto 1
        a /= 2; // 0 / 0 = 0
        //System.out.println(a);
        
        System.out.println("" + b7 + b6 + b5 + b4 + b3 + b2 + b1 + b0 +
                           " numero binario");
        
        
        //System.out.println((int)Math.pow(2,2));
        //System.out.println((2)^2);
        
        
        /*
        b=a%2; //(2*2*2*2*2*2*2*2);
        c=a%2; //(2*2*2*2*2*2*2);
        d=a%2; //(2*2*2*2*2*2);
        e=a%2; //(2*2*2*2*2);
        f=a%2; //(2*2*2*2);
        g=a%2; //(2*2*2);
        h=b%2; //(2*2);
        i=c%2;  //(2*1);
        */
        
        //System.out.println(b + " " +c+ " " +d+ " " +e+ " " +f+ " " +g+ " " +h+ " " + i);
        
        //System.out.println(a%10-7);
        
    }
    
}
