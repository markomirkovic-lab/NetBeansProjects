/*
 * LPRO Lezione a distanza - Scanner 1
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package lprolezdistscanner1;


import java.util.Scanner;


public class LproLezDistScanner1 {


    public static void main(String[] args) {
        
        
        Scanner in = new Scanner(System.in);
        
        
        int i;
        double d;
        short s;
        
        System.out.print("Inserisci un intero, un double e uno short ");
        
        i = in.nextInt();//viene prelevato il primo valore e letto come int
        d = in.nextDouble();//viene prelevato il secondo valore e letto come double
        s = in.nextShort();//viene prelevato il terzo valore e letto come short
        
        //metodi disponibili:
        //  nextByte()          Legge una stringa che espire un valore byte
        //  nextShort()         Legge una stringa che espire un valore short
        //  next Int()          Legge una stringa che espire un valore int
        //  nextLong()          Legge una stringa che espire un valore long
        //  nextBoolean()       Legge una stringa che espire un valore Boolean
        //  nextFloat()         Legge una stringa che espire un valore float
        //  nextDouble()        Legge una stringa che espire un valore double
        //  next()              Legge una stringa che espire un valore string
        //                      fermandosi al primo spazio
        //  nextLine()          Legge una stringa che espire un valore string
        //                      fino al ritorno a capo (tutta la riga)
        //  next().charAt(0)    Legge il primo char della stringa
        
        //int, double e short verrano convertiti in String:
        System.out.println("Hai inserito " + i + ", " + d + ", " + s);
        
        
    }
    
}
