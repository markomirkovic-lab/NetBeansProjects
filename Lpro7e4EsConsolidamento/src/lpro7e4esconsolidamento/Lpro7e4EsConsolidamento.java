/*
 * LPRO Es. 7.4 Es. di consolidamento
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package lpro7e4esconsolidamento;

import java.util.Scanner;


public class Lpro7e4EsConsolidamento {


    public static void main(String[] args) {
        
        //1. Dichiarate e istanziate l’oggetto in di tipo Scanner
        Scanner in = new Scanner(System.in);
        
        String nome, cognome, completo;
        
        //2. Stampate a schermo “Inserisci il tuo nome e il
        //   cognome: “ senza andare a capo
        System.out.print("Inserisci il nome e cognome: ");
        
        //3. Leggete e memorizzate in una variabile ciò che ha
        //   immesso l’utente
        nome = in.next();//Legge Marko
        cognome = in.next();//Legge Mirkovic
        in.nextLine();//Svuota il buffer
        
        //5. Stampate a schermo il nome, andate a capo, stampate il cognome.
        System.out.print("Inserici il nome e cognome: ");
        
        
        completo = in.nextLine();//legge tutta la stringa fino alla
                                 //pressione del RETURN
        
        //System.out.println("Nome: " + nome + ", Cognome: " + cognome);
        
        //4-----------------------------------------------------------
        
        
        System.out.println("Nome e cognome: " + completo);
        
        //5-----------------------------------------------------------
        
        
    }
    
}
