/**
 *
 * @author marko.mirkovic
 * @version 24.12.2021
 */

package lprocap11array;

import java.util.Scanner;

public class StringFor
{
    public static void main(String[] args)
    {
        String  scuola = "Scuola Specializzata Superiore di Economia";
        //                01234567890123456789012345678901234567890123456789
        char quartaLettera = scuola.charAt(3);
        System.out.println("Stampa quarta lettera: " + quartaLettera);
        System.out.println("---");
        System.out.println("Stampa esempio input: ");
        System.out.println("Scuola Specializzata Superiore di Economia\n" +
                           "01234567890123456789012345678901234567890123456789\n");
        System.out.println("---");
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserici la frase completa: ");
        //String fraseCompleta = input.nextLine();
        String fraseCompleta = input.nextLine().trim();
        //input.nextLine(); //non seve quando abbiamo prima nextLine()
        System.out.println("---");
        System.out.println("fraseCompleta.length: " + fraseCompleta.length());
        System.out.println("---");
        System.out.println("Stampa lettera per lettera senza spazi e il suo indice");
        
        for(int lettera = 0; lettera<fraseCompleta.length(); lettera++)
        {
            //if(fraseCompleta.charAt(lettera) != (char) 32 )
            if(fraseCompleta.charAt(lettera) != ' ' )// char compartativo bool con char
            {
                System.out.println(fraseCompleta.charAt(lettera) + " index: " + (lettera));
            }
        }
        System.out.println("---");
        System.out.println((char) 32);//stampa uno spazio vuoto " "
        System.out.println("---");
        
        System.out.println("Stampa lettera per lettera con i spazi e il suo indice");
        
        for(int lettera = 0; lettera<fraseCompleta.length(); lettera++)
        {
            System.out.println(fraseCompleta.charAt(lettera) + " index: " + (lettera));
        }
        
        /*
        run:
        Stampa quarta lettera: o
        ---
        Stampa esempio input: 
        Scuola Specializzata Superiore di Economia
        01234567890123456789012345678901234567890123456789

        ---
        Inserici la frase completa: 
        Scuola Specializzata Superiore di Economia
        ---
        fraseCompleta.length: 42
        ---
        Stampa lettera per lettera senza spazi e il suo indice
        S index: 0
        c index: 1
        u index: 2
        o index: 3
        l index: 4
        a index: 5
        S index: 7
        p index: 8
        e index: 9
        c index: 10
        i index: 11
        a index: 12
        l index: 13
        i index: 14
        z index: 15
        z index: 16
        a index: 17
        t index: 18
        a index: 19
        S index: 21
        u index: 22
        p index: 23
        e index: 24
        r index: 25
        i index: 26
        o index: 27
        r index: 28
        e index: 29
        d index: 31
        i index: 32
        E index: 34
        c index: 35
        o index: 36
        n index: 37
        o index: 38
        m index: 39
        i index: 40
        a index: 41
        ---

        ---
        Stampa lettera per lettera con i spazi e il suo indice
        S index: 0
        c index: 1
        u index: 2
        o index: 3
        l index: 4
        a index: 5
          index: 6
        S index: 7
        p index: 8
        e index: 9
        c index: 10
        i index: 11
        a index: 12
        l index: 13
        i index: 14
        z index: 15
        z index: 16
        a index: 17
        t index: 18
        a index: 19
          index: 20
        S index: 21
        u index: 22
        p index: 23
        e index: 24
        r index: 25
        i index: 26
        o index: 27
        r index: 28
        e index: 29
          index: 30
        d index: 31
        i index: 32
          index: 33
        E index: 34
        c index: 35
        o index: 36
        n index: 37
        o index: 38
        m index: 39
        i index: 40
        a index: 41
        BUILD SUCCESSFUL (total time: 13 seconds)
        */
        
    }
}
