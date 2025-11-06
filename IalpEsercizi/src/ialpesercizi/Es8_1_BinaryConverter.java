/**
 * IALP Esercizio BinaryConverter
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;

import java.util.Scanner;

public class Es8_1_BinaryConverter
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        int nro;
        byte b;
        int r=63;
        
        System.out.print("Inserisci un numero rappresentabile in un Byte: ");
        nro=input.nextInt();
        //------------------------------------------------------------
        //Prima soluzione
        //------------------------------------------------------------
        b=(byte)nro;
        System.out.print("\n\nQuesto sistema ha un difetto: il "
        + " risultato va letto da destra a sinistra: ");
        System.out.print((b%2));
        //Devo usare il casting perchè l'operatore % restituisce un int a causa del 2!
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.print((b%2));
        b=(byte)(b/2);
        System.out.println("");
        
        //------------------------------------------------------------
        //Seconda soluzione
        //------------------------------------------------------------
        b=(byte)nro;
        System.out.print("\n\nQuesto sistema è perfetto: ");
        System.out.print((b/2/2/2/2/2/2/2)%2);
        System.out.print((b/2/2/2/2/2/2)%2);
        System.out.print((b/2/2/2/2/2)%2);
        System.out.print((b/2/2/2/2)%2);
        System.out.print((b/2/2/2)%2);
        System.out.print((b/2/2)%2);
        System.out.print((b/2)%2);
        System.out.print(b%2);
        System.out.println("");
        
        //------------------------------------------------------------
        //Terza soluzione
        //------------------------------------------------------------
        b=(byte)nro;
        String conversione="";
        //Uso la stringa per memorizzare il risultato,
        //inserendo davanti, in testa, i resti del modulo
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        conversione=(b%2) + conversione;
        b=(byte)(b/2);
        System.out.println("\n\nAnche questo sistema è perfetto: " + conversione);
        System.out.println("");
        //------------------------------------------------------------
        //Quarta soluzione, usando gli operatori sui bit
        //------------------------------------------------------------
        b=(byte)nro;
        String conversione2="";
        //Uso l’and sui bit per esaminare se il bit più significativo
        //è a 1
        //Es: Se il numero da convertire è 0b10110011
        // & 0b10000000
        // da come risultato 0b10000000
        // Se lo shifto a sinistra di 7 posizioni ottengo 0b00000001
        //Lavorando sul bit più significativo
        System.out.print((r & 128)>>7); //Ottengo 0 oppure 1
        r=(byte)(r<<1); //Tolgo il bit appena esaminato
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.print((r & 128)>>7);
        r=(byte)(r<<1);
        System.out.println("");
        //Oppure, lavorando sul bit meno significativo
        
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.print((r>>7) & 1);
        r=(byte)(r<<1);
        System.out.println("");
        
        
    }
}
