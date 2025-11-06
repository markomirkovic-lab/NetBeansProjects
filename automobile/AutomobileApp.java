package automobile;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Neil Otupacca
 */
public class AutomobileApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Alloca lo scanner per l'acquisizione dei dati.
        Scanner sc = new Scanner(System.in);

        // Array di oggetti di tipo Automobile (inizialmente tutti null).
        // Nota: anziché impostare un numero di elementi fisso (4), è possibile
        //       richiedere all'utente (tramite lo Scanner) il numero di elementi
        //       desiderato.
        Automobile[] autoArray = new Automobile[4];

        // Itera tutti gli elementi dell'array e alloca un nuovo oggetto di
        // tipo Automobile per ognuno di essi.
        // Nota: utilizzare il limite autoArray.length in modo che si adatti al
        //       numero effettivo di elementi (se allocato dinamicamente).
        for (int i = 0; i < autoArray.length; i++) {

            // Loop, la condizione di uscita è costituita dal break, questo
            // viene eseguito solo se l'intero blocco try non genera una exception.
            while (true) {
                try {
                    // Feedback per l'utente.
                    System.out.print("Inserisci la marca dell'auto " +
                                     (i + 1) + "      : ");

                    // Acquisisci un valore stringa (marca) dallo standard input.
                    String marca = sc.nextLine();

                    // Feedback per l'utente.
                    System.out.print("Inserisci il modello per l'auto " +
                                     (i + 1) + "   : ");

                    // Acquisisci un valore stringa (modello) dallo standard input.
                    String modello = sc.nextLine();

                    // Feedback per l'utente.
                    System.out.print("Inserisci la cilindrata per l'auto " +
                                     (i + 1) + ": ");

                    // Acquisisci un valore intero (cilindrata) dallo standard input.
                    // Nota: se l'utente inserisce una stringa non parsabile in
                    //       un valore intero, viene generata l'exception
                    //       InputMismatchException.
                    int cil = sc.nextInt();

                    sc.nextLine();  // Svuota il buffer (dopo .nextInt()).

                    // Alloca un oggetto Automobile con marca, modello e
                    // cilindrata richiesta.
                    autoArray[i] = new Automobile(marca, modello ,cil);

                    // Valori della marca, modello e cilindrata accettati,
                    // termina il loop.
                    System.out.println();  // Linea vuota di separazione.
                    break;
                } catch (InputMismatchException ex) {
                    // Svuota il buffer, notifica l'errore (la stringa immessa
                    // non è convertibile in un intero).
                    sc.nextLine();
                    System.out.println("Immissione errata\n");
                } catch (Exception ex) {
                    // Valore della marca, modello o cilindrata non valido.
                    System.out.println(ex.getMessage() + "\n");
                }
            }
        }

        // Itera tutti gli oggetti Automobile dell'array e visualizza i dati.
        for (int i = 0; i < autoArray.length; i++) {
            System.out.println("Dati dell'auto n. " + (i + 1) +
                               ": " + autoArray[i]);
        }
    }
}
