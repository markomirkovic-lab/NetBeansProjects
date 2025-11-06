/*
 * Esercizio 9.3 Romani
 * 
 *
 * @author marko.mirkovic
 * Version 18.11.2021
 */
package lproes9e3romani;

import java.util.Scanner;

public class LproEs9e3Romani {

    
    public static void main(String[] args) {
        
        
        char cifraRomana; // = "";
        
        String I = "I";//   1
        String V = "V";//   5
        String X = "X";//  10
        String L = "L";//  50
        String C = "C";// 100
        String D = "D";// 500
        String M = "M";//1000
        
        int conversioneCifreRomane;
        
        int i = 1;
        int v = 5;
        int x = 10;
        int l = 50;
        int c = 100;
        int d = 500;
        int m = 1000;
        
        Scanner input = new Scanner(System.in);
       
        
        System.out.print("Immetti la cifra romana: ");
         cifraRomana = input.next().charAt(0);
        //input.nextLine();
        
        //if(input.hasNext()){
            //cifraRomana = input.next().trim();
        
        if(cifraRomana == I){
                conversioneCifreRomane = i;
                System.out.println(i);
            } else if(cifraRomana == V){
                conversioneCifreRomane = v;
                System.out.println(v);
            } else if(cifraRomana == X){
                conversioneCifreRomane = x;
                System.out.println(x);
            } else if(cifraRomana == L){
                conversioneCifreRomane = l;
                System.out.println(l);
            } else if(cifraRomana == C){
                conversioneCifreRomane = c;
                System.out.println(c);
            } else if(cifraRomana == D){
                conversioneCifreRomane = d;
                System.out.println(d);
            } else if(cifraRomana == M){
                conversioneCifreRomane = m;
                System.out.println(m);
            }
        
          else{
            System.out.println("Non hai messo le lettere romane giuste");
        }
        
        input.close();
        
        
        
    }
    
}
