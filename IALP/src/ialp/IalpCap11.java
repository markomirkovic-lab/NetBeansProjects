/**
 * IALP Cap 11 Array
 * @author marko.mirkovic
 * @version 06.12.2021
 */

package ialp;

import java.util.Scanner;

public class IalpCap11
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int giorni;
        double[] temperatura;//Array
        double somma, media; 
 
        System.out.println("Di quanti giorni vuoi tenere traccia della temperatura? ");
        giorni=input.nextInt(); 

        temperatura=new double[giorni]; //Alloco la memoria ???
        
        //Conviene all'utente indicare l'indice +1 per non confonderlo con lo 0
        somma=0.0;
        
        for(int i=0; i<temperatura.length; i++)//???
        {              
            System.out.print("Inserisci il giorno " + (i+1) + ": ");
            temperatura[i]=input.nextDouble(); 
            somma+=temperatura[i];
        }
        
        media=somma/temperatura.length;
        System.out.print("La temperatura media è: " + media); 
 
        for(int i=0; i<temperatura.length; i++)
        {
            if(temperatura[i]>media)
            {
                System.out.println("è stata superata il giorno " + (i+1) + ": "                             + temperatura[i]);
            } 
        }
        
        /*
        run-single:
        Di quanti giorni vuoi tenere traccia della temperatura? 
        7
        Inserisci il giorno 1: 7
        Inserisci il giorno 2: 4
        Inserisci il giorno 3: 5
        Inserisci il giorno 4: 7
        Inserisci il giorno 5: 8
        Inserisci il giorno 6: 3
        Inserisci il giorno 7: 4
        La temperatura media è: 5.428571428571429è stata superata il giorno 1: 7.0
        è stata superata il giorno 4: 7.0
        è stata superata il giorno 5: 8.0
        BUILD SUCCESSFUL (total time: 29 seconds)
        */
        
        //---------------------------------------------------------------
        
        double[] temp={25.7, 23.8, 27.8};//inizializzare un Array
        
        /*
        equivale a scrivere:
        double[] temp=new double[3];
        temp[0]=25.7;
        temp[1]=23.8;
        temp[2]=27.8;
        */
        
        //In pratica crea l’array e inserisce i valori negli elementi.
        //Per esempio è possibile memorizzare i giorni dei mesi dell’anno
        int[] mese={31,28,31,30,31,30,31,31,30,31,30,31};
        
        //Se volete fare una copia identica di un array potete usare il metodo clone().
        int a[]={0,1,2,3,4};
        int b[]=a.clone(); 
        b[2]=77; System.out.println(a[2] + " " + b[2]);
        
        //Che di fatto sostituisce il codice seguente
        int aa[]={0,1,2,3,4};
        int bb[]=new int[aa.length];//??? [aa.length]
        for(int i=0; i<aa.length; i++)
        {
            bb[i]=aa[i]; 
        }
        bb[2]=77;
        System.out.println(aa[2] + " " + bb[2]); 
        
        //---------------------------------------------------------------
        
        int[] dati = {9, 18, 27, 36, 45, 54}; 
        
        int[] tmp=new int[ dati.length+1 ]; 
        
        for(int i=0; i<dati.length; i++) //Scorriamo tutti gli elementi
        {
            tmp[i+1] = dati[i];//Copio elaborando la nuova posizione
        }          
        tmp[0]= 99;//Inseriamo ora il nostro nuovo elemento, nella posizione 0:
        dati = tmp;//sovrascriviamo il nostro array iniziale, con quello nuovo 
        System.out.println(dati[0] + " " + tmp[0]);
        System.out.println(dati);
    }
}
