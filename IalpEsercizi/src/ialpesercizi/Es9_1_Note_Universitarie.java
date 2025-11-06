

package ialpesercizi;

import java.util.Scanner;

public class Es9_1_Note_Universitarie
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        char nota;
        double notaDec=0;
        
        System.out.print("Inserisci la nota che hai preso: ");
        nota=input.next().charAt(0); //Questo me lo avevate chiesto.
        
        switch(nota)
        {
            case 'A':
            case 'a':
                notaDec=6;
                break;
            case 'B':
            case 'b':
                notaDec=5.5;
                break;
            case 'C':
            case 'c':
                notaDec=5;
                break;
            case 'D':
            case 'd':
                notaDec=4.5;
                break;
            case 'E':
            case 'e':
                notaDec=4;
                break;
            case 'F':
            case 'f':
                notaDec=3;
                break;
            default:
            //Fornisco un valore fuori range, così posso tracciare l'errore.
                notaDec=0;
        }
        if(notaDec==0)
        {
            System.out.println("Hai inserito un valore errato (" +
            nota + ") invece di A, B, C, D, E, F.");  
        }else
        {
            System.out.println(nota + " diventa: " + notaDec);
        }
        
    }
}
