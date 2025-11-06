package ialpesercizi;

import java.util.Scanner;

/**
 * Esercizio 11.2 - Stipendi parte due
 * 
 * Scrivete un programma che chiede all’utente di inserire il numero di
 * dipendenti della suaditta.
 * Verrà poi richiesto il nome di ogni dipendente e lo stipendio mensile.
 * Al termine viene stampato il nome affiancato allo stipendio.
 * Di quanti array avete bisogno?
 * 
 * Aggiungete la seguente funzionalità: dopo l’inserimento dei dati,
 * l’utente immette uno stipendio e il programma stampa unicamente
 * quelli che hanno uno stipendio inferiore a quanto immesso.
 * 
 * Sapreste fare tutto tramite un menu con due opzioni? Una per inserire
 * e l’altra per ricercare gli stipendi al di sotto di un limite.
 * 
 * @author Marko.Mirkovic
 * @version 23.01.2022
 */



public class Es_11_2_StipendiParteDue
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int numeroDipendenti = 0;
        
        boolean intero = true;
        //boolean stringa = true;
        //boolean numeroVirgolaMobile = true;
        
       
        System.out.println("Scrivi il numero dei dipendenti:");
        numeroDipendenti = tastiera.nextInt();
        tastiera.nextLine();
                
                
        //Abbiamo bisogno di 2 array
        
        //Array nome
        String nome [] = new String[numeroDipendenti];
        
        //Array stipendi
        double stipendio [] = new double[numeroDipendenti];
        
        
        System.out.println("Inserisci i nomi dei dipendenti:");
        for(int indice = 0; indice<numeroDipendenti; indice++)
        {
            nome[indice] = tastiera.next();
        }
        
        System.out.println("Inserisci i stipendi dei dipendenti:");
        for(int indice = 0; indice<numeroDipendenti; indice++)
        {
            stipendio[indice] = tastiera.nextDouble();
        }
        
        
        System.out.println("Imettere il limite di stipendio massimo di ricerca:");
        double stipendioInferiore = tastiera.nextDouble();
        
        
        System.out.println("I stipendi inferiori al stipendio di ricerca sono:");
        for(int indice = 0; indice<numeroDipendenti; indice++)
        {
            if(stipendio[indice]<stipendioInferiore)
            {
                System.out.println("Dipendente nome: " + nome[indice] +
                               "\t, \tstipendio: " + stipendio[indice]);
            }    
            
        }            
        
        
        /*
        run:
        Scrivi il numero dei dipendenti:
        3
        Inserisci i nomi dei dipendenti:
        Pinco
        Pallo
        Mario
        Inserisci i stipendi dei dipendenti:
        5500
        6000
        7000
        Imettere il limite di stipendio massimo di ricerca:
        6500
        I stipendi inferiori al stipendio di ricerca sono:
        Dipendente nome: Pinco, 	stipendio: 5500.0
        Dipendente nome: Pallo, 	stipendio: 6000.0
        */
        
        
        
    }
}
