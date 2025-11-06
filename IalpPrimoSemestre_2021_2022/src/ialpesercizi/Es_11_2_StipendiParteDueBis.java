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
 * @author Marko Mirkovic
 * @version 25.01.2022
 */



public class Es_11_2_StipendiParteDueBis
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int numeroDipendenti = 0;
        double stipendioInferiore = 0;
        
        
        boolean numeroInteroDeiDipendenti = false;
        boolean nomiDipendenti = false;
        boolean numeroVirgolaMobile = false;
        boolean stipendioRicerca = false;
        
        
        //Numero dipendenti
        do
        {
            System.out.println("Scrivi il numero dei dipendenti:");
            if(tastiera.hasNextInt())
            {
                numeroDipendenti = tastiera.nextInt();
                tastiera.nextLine();
                numeroInteroDeiDipendenti = true;
            }
            else
            {
                tastiera.nextLine();//Scartare il valore tatiera (buffer)
                System.out.println("Errore: si prega di specificare il " +
                                   "numero dei dipendenti con un numero " +
                                   "intero positivo (es. da 1 a n dipendenti).");
            }
        } while (numeroInteroDeiDipendenti == false);
        

        
        
        //Abbiamo bisogno di 2 array
        
        //Array nome
        String nome [] = new String[numeroDipendenti];
        
        //Array stipendi
        double stipendio [] = new double[numeroDipendenti];
        
        
        //Nomni dei dipendenti
        do
        {
            System.out.println("Scrivi i nomi dei dipendenti:");
            if( tastiera.hasNextLine()
                && (!tastiera.hasNextInt() || !tastiera.hasNextDouble()) )
            {
                for(int indice = 0; indice<numeroDipendenti; indice++)
                {
                    nome[indice] = tastiera.nextLine();
                    nomiDipendenti = true;
                }
            }
            else
            {
                tastiera.nextLine();//Scartare il valore tatiera (buffer)
                System.out.println("Errore: si prega di specificare i" +
                                   "nomi dei dipendenti con le lettere " +
                                   "(es. nome o nome cognome).");
            }
        } while (nomiDipendenti == false);
        
        
        //Stipendi dei dipendenti
        do
        {
            System.out.println("Inserisci i stipendi dei dipendenti:");
            if(tastiera.hasNextDouble() || tastiera.hasNextInt())
            {
                for(int indice = 0; indice<numeroDipendenti; indice++)
                {
                    stipendio[indice] = tastiera.nextDouble();
                    tastiera.nextLine();
                    numeroVirgolaMobile = true;
                }
            }
            else
            {
                tastiera.nextLine();//Scartare il valore tatiera (buffer)
                System.out.println("Errore: si prega di specificare il" +
                                   "lo stipendio mensile dei dipendenti " +
                                   "(es. 7000 o 11500.50).");
            }
            
        } while (numeroVirgolaMobile == false);
        
        
      
        
        //Ricerca stipendio
        do
        {
            System.out.println("Imettere il limite di stipendio mensile " +
                               "massimo di ricerca:");
            if(tastiera.hasNextDouble() || tastiera.hasNextInt())
            {
                stipendioInferiore = tastiera.nextDouble();
                tastiera.nextLine();
                stipendioRicerca = true;
            }
            else
            {
                tastiera.nextLine();//Scartare il valore tatiera (buffer)
                System.out.println("Errore: si prega di specificare il" +
                                   "lo stipendio dei dipendenti " +
                                   "(es. 7000 o 11500.50).");
            }
        } while (stipendioRicerca == false);
        
        
        
        System.out.println("Il numero dei dipendenti e': " + numeroDipendenti);
        System.out.println("I stipendi inferiori al stipendio di ricerca sono:");
        for(int indice = 0; indice<numeroDipendenti; indice++)
        {
            
                if(stipendio[indice]<stipendioInferiore)
                {
                    System.out.println("Dipendente nome: " + nome[indice] +
                                   "\t, \tstipendio: CHF \t" + stipendio[indice]);
                }    
            
        }            
        
        
        /*
        run:
        Scrivi il numero dei dipendenti:
        3
        Scrivi i nomi dei dipendenti:
        Carlo Magno
        Luigi Zappa
        Pinco Pallo
        Inserisci i stipendi dei dipendenti:
        7800
        9300
        3500
        Imettere il limite di stipendio mensile massimo di ricerca:
        8000
        Il numero dei dipendenti e': 3
        I stipendi inferiori al stipendio di ricerca sono:
        Dipendente nome: Carlo Magno	, 	stipendio: CHF 7800.0
        Dipendente nome: Pinco Pallo	, 	stipendio: CHF 3500.0
        */
        
        
    }
}
