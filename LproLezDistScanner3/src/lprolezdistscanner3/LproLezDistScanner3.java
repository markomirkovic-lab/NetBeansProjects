/*
 * LPRO Lezione a distanza - Scanner 3
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package lprolezdistscanner3;

import java.util.Scanner;
 
public class LproLezDistScanner3 {


    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String nome, cognome, completo;
        
        System.out.print("Inserisci il nome e cognome: ");
        nome = in.next();//Legge Marko
        cognome = in.next();//Legge Mirkovic
        in.nextLine();//Svuota il buffer
        
        System.out.print("Inserici il nome e cognome: ");
        completo = in.nextLine();//legge tutta la stringa fino alla
                                 //pressione del RETURN
        
        System.out.println("Nome: " + nome + ", Cognome: " + cognome);
        System.out.println("Nome e cognome: " + completo);
        
        /*
        run:
        Inserisci il nome e cognome: Marko Mirkovic
        Inserici il nome e cognome: Marko Mirkovic
        Nome: Marko, Cognome: Mirkovic
        Nome e cognome: Marko Mirkovic
        BUILD SUCCESSFUL (total time: 35 seconds)
        
        run:
        Inserisci il nome e cognome:      Marko
        Mirkovic
        Inserici il nome e cognome: Marko      Mirkovic
        Nome: Marko, Cognome: Mirkovic
        Nome e cognome: Marko      Mirkovic
        BUILD SUCCESSFUL (total time: 22 seconds)
        */
        
    }
    
}
