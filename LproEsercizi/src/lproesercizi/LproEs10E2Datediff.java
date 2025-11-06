/**
 * LPRO Es. 10.2 DateDiff
 * 
 * @author marko.mirkovic
 * @version 09.12.2021
 */


/*
Scrivete un programma che:
• Chiede all’utente di inserire una data di partenza nel formato ISO (YYYYMMDD) 
Chiede all’utente di inserire una data di arrivo nel formato ISO 
• Se la data di arrivo è superiore alla data di partenza il programma calcolerà
  e stamperà il numero di giorni che intercorrono fra le due date 
Differenza tra 20120632 e 20110901: 296 giorni
• Se la data di arrivo è inferiore alla data di partenza il programma stamperà 
Inserisci la data di partenza: 20110101
Inserisci la data di arrivo: 19990101
Data di arrivo inferiore alla data di partenza!

Il programma non considera gli anni bisestili, febbraio avrà quindi sempre 28 giorni.


https://stackabuse.com/how-to-convert-a-string-to-date-in-java/

*/

package lproesercizi;


import java.util.Scanner;


public class LproEs10E2Datediff
{
    public static void main(String[] args)
    {
        
        int dataPartenza = 0;
        int dataArrivo = 0;
        int dataDifferenza = 0;
        
        
        
               
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inserici la data di partenza (AAAAMMGG): ");
        dataPartenza = input.nextInt();
        input.nextLine();
        
        System.out.println("Inserici la data di arrivo (AAAAMMGG)");
        dataArrivo = input.nextInt();
        input.nextLine();
        
        
        
        
        System.out.println("Differenza fra" + dataPartenza + " e "
                          + dataArrivo + ":" + (dataDifferenza));
        
        
        
        
        System.out.println("Inserici la data di partenza (AAAAMMGG): " + dataPartenza);
        System.out.println("Inserici la data di arrivo (AAAAMMGG): " + dataArrivo);
        System.out.println("Data di arrivo inferiore alla data di parenza ");
        
        
        
        
        
        
    }
}
