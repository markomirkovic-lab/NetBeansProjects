/*
 * ScannerTesting2
 * @author Marko Mirkovic
 * @version 17.10.2021
 */
package scannertesting2;

import java.util.Scanner; //importiamo solo lo scanner da import java.util;


public class ScannerTesting2 {


       
    public static void main(String[] args)
    {
        boolean bb = false;
        byte    b = 0;
        short   s = 0;
        int     i = 0;
        long    l = 0;
        float   f = 0.0F;
        double  d = 0.0;
        String ss ="";
        
        //Oggetto di scanner (input = variable)
        //Con l’istruzione new creiamo il nostro oggetto di tipo Scanner.
        //Questo significa che possiamo avere più di un oggetto Scanner
        //attivo allo stesso momento.
        Scanner input = new Scanner(System.in);
        
        //metodo nextTipo per ogni tipo primitivo, oltre che per il tipo String
        
        //Leggiamo alcuni valori 
        System.out.print("Inserisci un boolean: ");
        bb=input.nextBoolean(); //Leggiamo un boolean
        
        System.out.print("Inserisci un byte: ");
        b=input.nextByte(); //Leggiamo un byte
        
        System.out.print("Inserisci uno short: ");
        s=input.nextShort(); //Leggiamo uno short 
        
        System.out.print("Inserisci un int: ");
        i=input.nextInt(); //Leggiamo un int 
        
        System.out.print("Inserisci un long: ");
        l=input.nextLong(); //Leggiamo un long 
        
        System.out.print("Inserisci un float: "); 
        f=input.nextFloat(); //Leggiamo un float
        
        System.out.print("Inserisci un double: ");
        d=input.nextDouble(); //Leggiamo un double 
        
        System.out.print("Inserisci una stringa: ");
        ss=input.next(); //Leggo la stringa
        
        //Stampiamo i risultati
        System.out.println("Hai inserito: " + bb + " " + b + " " + s
                            + " " + i + " " + l + " " + f + " " + d
                            + " " + ss);
        
        /*
        run:
        Inserisci un boolean: True
        Inserisci un byte: 1
        Inserisci uno short: 1
        Inserisci un int: 1
        Inserisci un long: 1
        Inserisci un float: 1
        Inserisci un double: 1
        Inserisci una stringa: 1
        Hai inserito: true 1 1 1 1 1.0 1.0 1
        */
        
    }
    
}
