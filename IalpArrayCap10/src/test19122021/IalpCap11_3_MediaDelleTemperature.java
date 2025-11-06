/**
 * Capitolo 11 Array
 * 11.3 Media delle temperature
 * @author marko.mirkovic
 * @version 19.12.2021
 */

package test19122021;

import java.util.Scanner;


public class IalpCap11_3_MediaDelleTemperature
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int giorni; double[] temperatura;
        double somma, media;
        System.out.println("Di quanti giorni vuoi tenere traccia della temperatura? ");
        
        giorni=input.nextInt();//# giorni totali da considerare per la media
        temperatura=new double[giorni]; //Alloco la memoria 
        //array temperatura [grandezza array = # giorni]
        
        System.out.println("temperatura: " + temperatura); //NON STAMPA NULLA
        
        somma=0.0;//inizializzazione variable doubble somma a 0.0
        
        
        for(int i=0; i<temperatura.length; i++)//ciclo for di i per temperatura[giorni]
        { //Conviene all'utente indicare l'indice +1 per non confonderlo con lo 0 
            System.out.print("Inserisci il giorno " + (i+1) + ": ");
            
            //input tastiera -> array di temperatura:
            temperatura[i]=input.nextDouble();
            
            //somma= somma + temperatura indice i:
            somma+=temperatura[i];
            
            System.out.println(i); //NON STAMPA NULLA
            System.out.println("temperatura[i]: " + (temperatura[i]));
            //NON STAMPA NULLA
            System.out.println(somma);//NON STAMPA NULLA
            System.out.println(temperatura);
            //array instance printed on PrintStream?
        }
        
        
        System.out.println("temperatura: " + temperatura);//NON STAMPA NULLA
        //Array concatenated with String
        
        
        media=somma/temperatura.length;
        System.out.println(temperatura.length);//NON STAMPA NULLA
        System.out.println("La temperatura media è: " + media);
        System.out.println(" ");
        
        
        //ciclo for per controllare le temperature vs. la media
        for(int i=0; i<temperatura.length; i++)
        {
            if(temperatura[i]>media)
            {
                //System.out.print(" ");
                System.out.print(" è stata superata il giorno " + (i+1) + ": " + temperatura[i]);
                System.out.println(i);//NON STAMPA NULLA
                System.out.println(temperatura[i]);//NON STAMPA NULLA
            }
        }

        
        System.out.println("");        
        System.out.println("-----------------");
        System.out.println(temperatura[0]);//NON STAMPA NULLA
        System.out.println(temperatura[1]);//NON STAMPA NULLA
        System.out.println("temperatura: " + temperatura); //NON STAMPA NULLA
        
        /*
        run:
        Di quanti giorni vuoi tenere traccia della temperatura? 
        7
        Inserisci il giorno 1: 1
        Inserisci il giorno 2: 3
        Inserisci il giorno 3: 4
        Inserisci il giorno 4: 9
        Inserisci il giorno 5: 3
        Inserisci il giorno 6: 2
        Inserisci il giorno 7: 4
        La temperatura media è: 3.7142857142857144è stata superata il giorno 3: 4.0
        è stata superata il giorno 4: 9.0
        è stata superata il giorno 7: 4.0
        */
        
        /*
        Di quanti giorni vuoi tenere traccia della temperatura? 
        7
        temperatura: [D@5dfcfece
        Inserisci il giorno 1: 3
        0
        temperatura[i]: 3.0
        3.0
        [D@5dfcfece
        Inserisci il giorno 2: 2
        1
        temperatura[i]: 2.0
        5.0
        [D@5dfcfece
        Inserisci il giorno 3: 1
        2
        temperatura[i]: 1.0
        6.0
        [D@5dfcfece
        Inserisci il giorno 4: 3
        3
        temperatura[i]: 3.0
        9.0
        [D@5dfcfece
        Inserisci il giorno 5: 9
        4
        temperatura[i]: 9.0
        18.0
        [D@5dfcfece
        Inserisci il giorno 6: 9
        5
        temperatura[i]: 9.0
        27.0
        [D@5dfcfece
        Inserisci il giorno 7: 11
        6
        temperatura[i]: 11.0
        38.0
        [D@5dfcfece
        temperatura: [D@5dfcfece
        7
        La temperatura media è: 5.428571428571429

         è stata superata il giorno 5: 9.04
        9.0
         è stata superata il giorno 6: 9.05
        9.0
         è stata superata il giorno 7: 11.06
        11.0
        3.0
        2.0
        temperatura: [D@5dfcfece
        BUILD SUCCESSFUL (total time: 15 seconds)
        
        */
    }

}
