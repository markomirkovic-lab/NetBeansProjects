/**
 * 7.1 -> Scanner 6.8
 * Stringe
 * @author marko.mirkovic
 * Version 17.10.2021
 */

package es7e1bis6e8;

import java.util.Scanner;


public class Es7e1Bis6e8
{

    
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        String nome = "";
        String cognome = "";
        int giornoNascita = 0;
        int meseNascita = 0;
        int annoNascita = 0;
        
        System.out.print("Inserici il tuo nome: ");
        nome=input.next();
        
        System.out.print("Inserici il tuo cognome: ");
        cognome=input.next();
        
        System.out.print("Inserici il tuo giorno di nascita: ");
        giornoNascita=input.nextInt();
        
        System.out.print("Inserici il tuo mese di nascita: ");
        meseNascita=input.nextInt();
        
        System.out.print("Inserici il tuo anno di nascita: ");
        annoNascita=input.nextInt();
        
              
        System.out.print("Il tuo nome è " + nome + ", il tuo cognome è " +
                        cognome + ", sei nato il " + giornoNascita + "." +
                        meseNascita + "." + annoNascita + "\n");
        
        
        /*
        run:
        Inserici il tuo nome: Pinco
        Inserici il tuo cognome: Pallo
        Inserici il tuo giorno di nascita: 1
        Inserici il tuo mese di nascita: 1
        Inserici il tuo anno di nascita: 2001
        Il tuo nome è Pinco, il tuo cognome è Pallo, sei nato il 1.1.2001
        BUILD SUCCESSFUL (total time: 12 seconds)
        */
        
        
    }
    
}
