
package ialpesercizi;

import java.util.Scanner;

/**
 * Array (Soluzioni) Es. 11. 4
 * @author marko.mirkovic
 * @version
 */
public class Es_11_4_Divisori
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        long n, d;
        long[] divisore;
        boolean find;
        
        do
        {
        System.out.print("Inserisci un numero: ");
        n=in.nextLong();
        //Dimensiono l'array per memorizzare i divisori.
        //Nel caso PEGGIORE possiamo trovare un numero sempre
        //divisibile per 2, come il 1024
        //Quanti divisori potrà avere? 2^x=1024 quindi
        //x=log2(1024)
        //Questa finezza ci permette di limitare l'occupazione
        //della memoria.
        //Ovviamente non me l’aspetto come soluzione, potreste
        //limitarvi a dimensionare un array grande la metà
        divisore=new long[ (int)(Math.log10(n)/Math.log10(2))+1 ];
        //Inizializzo tutte le celle a 0
            for(int i=0; i<divisore.length; i++)
            {
                divisore[i]=0;
            }
            for(d=2; d<=n/2; d++)
                {
                    if(n%d==0)
                        {
                            //Lo inserisco nell'array, se non c'è già
                            //Prima lo cerco
                            find=false;
                            for(int i=0; i<divisore.length; i++)
                            {
                                if(divisore[i]==d)
                                {
                                    find=true; //Trovato!
                                    break;
                                }
                            }
                            if(!find)
                            {
                                //Non avendolo trovato devo inserirlo
                                //Cerco una cella libera, che contiene 0
                                for(int i=0; i<divisore.length; i++)
                                {
                                if(divisore[i]==0)
                                    {
                                        divisore[i]=d;
                                        break;
                                    }
                                }
                            }
                            n=n/d;
                            //d=1;
                        }
                    }
        
                    //L'ultimo numero è divisore,
                    //Applico lo stesso algoritmo di qualche riga sopra
                    find=false;
                    for(int i=0; i<divisore.length; i++)
                    {
                        if(divisore[i]==n)
                        {
                            find=true; //Trovato!
                            break;
                        }
                    }

                    if(!find)
                    {
                        //Non avendolo trovato devo inserirlo
                        //Cerco una cella libera, che contiene 0
                        for(int i=0; i<divisore.length; i++)
                        {
                            if(divisore[i]==0)
                            {
                                divisore[i]=n;
                                break;
                            }
                        }
                     }
                    
            //Stampiamo i divisori
            for(int i=0; i<divisore.length; i++)
                {
                if(divisore[i]!=0)
                    {
                        System.out.print(divisore[i] + " ");
                    }
                }
            System.out.print("\n\nAltro numero? [s/n]");
        }while(in.next().charAt(0)=='s');
        
        
        
        
    }
}
