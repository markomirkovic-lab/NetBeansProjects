/*
 * LPRO Lezione a distanza - Scanner 2
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package lprolezdistscanner2;

import java.util.Scanner;


public class LproLezDistScanner2 {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int i;
        double d;
        
        /*
        System.out.print("Inserisci un intero: ");
        i = in.nextInt();
        
        System.out.print("Inserici un double: ");
        d = in.nextDouble();
        */
        
        /*
        run:
        Inserisci un intero: 23 7
        Inserici un double: Ha inserito 23, 7.0     Sequenza errata
        BUILD SUCCESSFUL (total time: 2 seconds)
        */
        
        ///*
        System.out.print("Inserisci un intero: ");
        i = in.nextInt(); // la letto 23
        in.nextLine(); //svuota il buffer
        
        System.out.print("Inserici un double: ");
        d = in.nextDouble(); //ha letto 3.14 e non il 7 (7 è stato ignorato)
        in.nextLine(); //svuota il buffer
        //*/
        
        /*
        run:
        Inserisci un intero: 23 7
        Inserici un double: 3.14    Procedura corretta
        Ha inserito 23, 3.14        Risultato corretto
        BUILD SUCCESSFUL (total time: 6 seconds)
        */
        
        System.out.println("Ha inserito " + i + ", " + d);
        
        
        
    }
    
}
