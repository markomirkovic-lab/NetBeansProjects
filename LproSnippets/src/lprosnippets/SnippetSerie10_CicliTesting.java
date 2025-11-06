/**
 *
 * 
 * @author marko.mirkovic
 * @version
 */

package lprosnippets;



import java.util.Scanner;

public class SnippetSerie10_CicliTesting
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        
        
        //variante do while + (secondo) while
        int valore;
        do
        {
            System.out.print("Inserisci un valore minore o uguale a 10: ");
            valore=in.nextInt();
            in.nextLine();
        } while(valore>10);
        
        while(valore>=0)
        {
                System.out.println(valore);
                valore--;
        }
        
        
        //-------variante do while + for
        
        int numero;
        int i = 0;
        do
        {
            System.out.print("Inserisci un numero minore o uguale a 10: ");
            numero=in.nextInt();
            in.nextLine();
        } while(numero>10);
        
        for(;numero>=0;numero--)
        {
            System.out.println((numero-(numero + i++))*-1);   
        }
        
        //-------variante 2 do while + for
        
        int numero2;
        int iii = 0;
        do
        {
            System.out.print("Inserisci un numero minore o uguale a 10: ");
            numero2=in.nextInt();
            in.nextLine();
        } while(numero2>10);
        
        for(int ii=numero2;ii>=0;ii--)
        {
            System.out.println((numero2-(numero2 + iii++))*-1);   
        }        
        
        
    }
}
