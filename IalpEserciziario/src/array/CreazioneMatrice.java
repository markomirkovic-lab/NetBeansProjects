

package array;


/**
 * Matrice generata con numeri random
 * 
 * @version 25.01.2022
 * @author Tommaso Zanini
 */

import java.util.Scanner;

public class CreazioneMatrice {

    public static void main(String[] args) {

        //Scanner
        Scanner sc = new Scanner(System.in);

        // Definisci il range per creazione numeri casuali da inserire nella matrice
        //Numero massimo
        System.out.println("Definisci numero massimo");
        int max = sc.nextInt();
        //Numero minimo
        System.out.println("Definisci numero minimo");
        int min = sc.nextInt();
        int casuale;
        //Calcolo range
        int range = max - min + 1;

        System.out.println("Inserisci numero righe");

        int r = sc.nextInt();

        System.out.println("Inserisci numero colonne");

        int c = sc.nextInt();

        //Con dati scanner definisco colonne e righe
        int[][] m = new int[r][c];

        //RIEMPIMENTO matrice con numeri RANDOM RIGA dopo RIGA
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                //Generazione numeri casuali
                casuale = (int) (Math.random() * range) + min;
                m[i][j] = casuale;
            }
        }

        //Inserimento dati tramite scanner
//        Scanner per inserire dati nella matrice
//        System.out.println("Inserisce RIGA per RIGA");
//        System.out.println("Inserisci dati matrice ");
//
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                m[i][j] = sc.nextInt();
//            }
//        }
        //Stampo la mia matrice
        System.out.println("La tua matrice é : ");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                // Usato "\t" nel caso si usino numeri grandi
                System.out.print(m[i][j] + "\t");
            }

            //Al termine della riga cursore va a capo
            System.out.println();
        }
    }
}