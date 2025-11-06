
package ialpesercizi;

import java.util.Scanner;

/**
 * Array (Soluzioni) Es. 11. 6 - Strettamente crescente
 * @author marko.mirkovic
 * @version 03.04.2022
 */
public class Es_11_6_StrettamenteCresecenteSoluzione
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        boolean maggiore;
        long n, max;
        long[] numero=new long[10];
        
        for(int i=0; i<numero.length; i++)
        {
            do
            {
                System.out.print("Inserisci un numero intero: ");
                n=in.nextLong();
                numero[i]=n;
                if(i==0)
                //È il primo numero, sarà sempre il maggiore
                //finora inserito
                {
                    maggiore=true;
                }
                else
                {
                    //Devo controllare che sia maggiore di quello
                    // precedente
                    if(n>numero[i-1])
                    {
                        maggiore=true;
                    }
                    else
                    {
                        maggiore=false;
                        System.out.print("Errato, riprova. ");
                    }
                }
            }while(!maggiore);
        }
        for(int i=0; i<numero.length; i++)
        {
            System.out.println(numero[i]);
        }
        
        /*
        run:
        Inserisci un numero intero: 1
        Inserisci un numero intero: 2
        Inserisci un numero intero: 3
        Inserisci un numero intero: 4
        Inserisci un numero intero: 5
        Inserisci un numero intero: 6
        Inserisci un numero intero: 7
        Inserisci un numero intero: 8
        Inserisci un numero intero: 9
        Inserisci un numero intero: 10
        1
        2
        3
        4
        5
        6
        7
        8
        9
        10
        */
        
    }
}
