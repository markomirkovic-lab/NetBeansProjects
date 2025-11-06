lproclasse26012022tris;

import java.util.Scanner;
import java.util.InputMismatchException;
//Importa tutti i java.util
import java.util.*;

import java.util.Scanner;



/**
 * Gioco del tris.
 *
 * Non funziona: Pareggio: Soluzione con contatore non valida, altra soluzione
 *
 * Inserimento lettera come input causa loop infinito
 *
 * @version 01.02.2022
 * @author Tommaso Zanini
 */
public class TommasoTriss {

    public static void main(String[] args) {
        //Scanner
        Scanner in = new Scanner(System.in);
        //Array che fa da tabella per il gioco
        String[] tabella = new String[9];
        //Gestione turno
        String turno = "X";
        //Usata solo per loop infinito
        String vincitore = null;
        System.out.println("Giocatori divertitevi." + "\n");

        //Riempimento tabella di gioco
        for (int a = 0; a < 9; a++) {
            tabella[a] = String.valueOf(a + 1);
        }
        //Stampo tabella di gioco
        System.out.println("|---|---|---|");
        System.out.println("| " + tabella[0] + " | " + tabella[1] + " | " + tabella[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabella[3] + " | " + tabella[4] + " | " + tabella[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + tabella[6] + " | " + tabella[7] + " | " + tabella[8] + " |");
        System.out.println("|---|---|---|" + "\n");
        
        for (int a = 0; a < 9; a++) {
            tabella[a] = String.valueOf(a + 1);
        }
        System.out.println("X inizia a giocare." + "\n" + "Inserisci il numero dello slot per piazzare X:");
        while (vincitore == null) {
            int numInput;
            // ECCEZIONI, input accettati sono solo numeri da 1 a 9
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
//                if (numInput < 0 && numInput >= 9 && in.hasNextInt()) {
                    System.out.println(
                            "Input non valido; Inserisci un numero valido:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println(
                        "Input non valido; Inserisci un numero valido:");
                continue;
            }
            //Contatore per determinare pareggio
            // Di sequito la logica per scandire i turni ta X e O e sapere se posso inserire dato nello spazio selezionato
            if (tabella[numInput - 1].equals(String.valueOf(numInput))) {
                tabella[numInput - 1] = turno;
                System.out.println("turno: " + turno);
                if (turno.equals("X")) {
                    turno = "O";
                } else {
                    turno = "X";
                }
                //Tabella 
                System.out.println();
                System.out.println("|---|---|---|");
                System.out.println("| " + tabella[0] + " | " + tabella[1] + " | " + tabella[2] + " |");
                System.out.println("|-----------|");
                System.out.println("| " + tabella[3] + " | " + tabella[4] + " | " + tabella[5] + " |");
                System.out.println("|-----------|");
                System.out.println("| " + tabella[6] + " | " + tabella[7] + " | " + tabella[8] + " |");
                System.out.println("|---|---|---|");

                //Controlla vincitore
                for (int a = 0; a < 10; a++) {
                    String line = null;

                    switch (a) {
                        //Prima riga orizzontale
                        case 0:
                            line = tabella[0] + tabella[1] + tabella[2];
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Seconda riga orizzontale
                        case 1:
                            line = tabella[3] + tabella[4] + tabella[5];
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Terza riga orizzontale
                        case 2:
                            line = tabella[6] + tabella[7] + tabella[8];
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Prima colonna verticale
                        case 3:
                            line = tabella[0] + tabella[3] + tabella[6];
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Seconda colonna verticale
                        case 4:
                            line = tabella[1] + tabella[4] + tabella[7];
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Terza colonna verticale
                        case 5:
                            line = tabella[2] + tabella[5] + tabella[8];
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Diagonale da destra a sinistra
                        case 6:
                            line = tabella[0] + tabella[4] + tabella[8];
                            // Line.trim() serve solo per poter eseguire il controllo sulle diagonali
                            line.trim();
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                        //Diagonale da sinistra a destra
                        case 7:
                            line = tabella[2] + tabella[4] + tabella[6];
                            // Line.trim() serve solo per poter eseguire il controllo sulle diagonali
                            line.trim();
                            if (line.equalsIgnoreCase("XXX")) {
                                System.out.println("\n" + "BEN FATTO X! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else if (line.equalsIgnoreCase("OOO")) {
                                System.out.println("\n" + "BEN FATTO O! HAI VINTO!" + "\n" + "Grazie per aver giocato.");
                                System.exit(0);
                            } else {
                                break;
                            }
                    }
                }

                // Inserire X o O a dipendenza del turno
                System.out.println("È il turno di " + turno + ";" + "\n" + "Inserisci il numero dello slot per piazzare il simbolo " + turno + ":");
            } else {
                System.out.println("Lo slot è già occupato; inserisci il numero di uno slot libero");
            }
        }
    }
}

// Pareggio con contatore non funziona
//        //Contatore per il pareggio
//        int count = 0;
//                    //Pareggio
//                    if (count == 9) {
//                        System.out.println("PAREGGIO");
//                        System.exit(0);
//                    } else {
//                        break;
//                    }