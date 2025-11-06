package ialpesercizi;

import java.util.Scanner;

/**
 * Esercizio 11.1 - Stipendi SOLUZIONE
 * 
 * Scrivete un programma che chiede all’utente di inserire il numero di
 * dipendenti della suaditta.
 * Verrà poi richiesto il nome di ogni dipendente e lo stipendio mensile.
 * Al termine viene stampato il nome affiancato allo stipendio.
 * Di quanti array avete bisogno?
 * 
 * @author Marko.Mirkovic
 * @version 23.01.2022
 */



public class Es_11_1_StipendiSolution
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int numeroDipendenti;
        
        System.out.println("Scrivi il numero dei dipendenti:");
        numeroDipendenti = tastiera.nextInt();
        
        //Abbiamo bisogno di 2 array
        
        //Array nome
        String nome [] = new String[numeroDipendenti];
        
        //Array stipendi
        double stipendio [] = new double[numeroDipendenti];
        
        
        for(int indice = 0; indice<numeroDipendenti; indice++)
        {
            System.out.println("Inserisci i nomi dei dipendenti:");
            nome[indice] = tastiera.next();
            
            System.out.println("Inserisci i stipendi dei dipendenti:");
            stipendio[indice] = tastiera.nextDouble();
        }
        
        
               
        System.out.println("Hai inserito i dipendenti e i nomi:");
        for(int indice = 0; indice<numeroDipendenti; indice++)
        {
            System.out.println("Dipendente nome: " + nome[indice] + 
                               "\t, \tstipendio: " + stipendio[indice]);
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
        Hai inserito i dipendenti e i nomi:
        Dipendente nome: Pinco, stipendio: 5500.0
        Dipendente nome: Pallo, stipendio: 6000.0
        Dipendente nome: Mario, stipendio: 7000.0
        */
        
        
        
    }
}
