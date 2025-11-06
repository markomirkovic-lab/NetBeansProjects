package InClass2012;

import java.util.Scanner;

/**
 *
 * @author marko.mirkovic
 */
public class InClass20122021
{
    public static void main(String[] args)
    {
        //dichiario e creo dell'array
        String[] giorni = {"lu", "ma", "me", "gio", "ve", "sa", "do"};
        
        //percorro l'array dal primo [0], all'ultimo [6] elemento
        for(int i = 0; i<giorni.length;i++)
        {
            System.out.println(giorni[i]);
        }
        
        //---------------------------------------------------------------
        System.out.println("---");
        
        for(int i = giorni.length; i<=giorni.length-1;i--)
        {
            System.out.println(giorni[i]);
        }
        
        System.out.println("---");
        
        /*
        
        Scanner input = new Scanner(System.in);
        
        giorno[] = giorno.clone();
        
        for(int i = 0; i<giorni.length;i++)
        {
            System.out.println("Nome giorno " + i + ": ");
            giorno[i] = input.next();
        }
        
        */
        
        
        
        //String[] giorni2 = giorni.clone();
        
        
        String[] source = {"lu", "ma", "me", "gio", "ve", "sa", "do"};
        
        String[] dest = new String[source.length];
        for(int i = 0; i<dest.length;i++)
        {
            dest[i] = source[i];
        }
        
        for(int i = 0; i<dest.length;i++)
        {
            System.out.println(dest[i]);
        }
        
        System.out.println("---");
        
        
        int[] sourceInt = {1, 2, 3};
        int[] destInt = new int[sourceInt.length];
        
        // int[] sourceDest = {3, 2, 1};
        
        for(int i = source.length; i<sourceInt.length;i--)
        {
            destInt[i]=sourceInt[i];
        }
        
        for(int i =0; i<destInt.length;i++)
        {
            System.out.println(destInt[i]);
        }
        
        System.out.println("---");
        
        
        int[] sorgente = {1, 2, 3};
        int[] destinazione = new int[sorgente.length];
        
        for(int i = 0; i<sorgente.length;i++)
        {
            //destinazione[???]=sorgente[???]
            destinazione[i]=sorgente[sorgente.length - 1 - i];
        }
        
        for(int i =0;i<destinazione.length;i++)
        {
            System.out.println(destinazione[i]);
        }
        
        //aggiungo un nuovo elemento array in coda
        
        
        //int2Day
        
        //char '1' = "lunedì";
        
        Scanner inputGiorno = new Scanner(System.in);
        
        int inputGiornoTastiera =0;
        
        String[] giornoDellaSettimana = {"lunedì", "martedì", "mercoledì", "giovedì", "sabato", "domenica"};
        
        System.out.println("Scrivi il numero del giorno: ");
        inputGiornoTastiera = inputGiorno.nextInt();
        
        System.out.println(giornoDellaSettimana[inputGiornoTastiera-1]);
        
        /*
        for(int i = 0; i<giornoDellaSettimana+1; i++)
        {
            System.out.println(giornoDellaSettimana[inputGiornoTastiera];
        }
        */
            
        
    }
}
