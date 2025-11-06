

package ialpesercizi;

import java.util.Scanner;

public class Testing
{
    public static void main(String[] args)
    {
        
        /*
        int a = 7;
        
                                        //risultati in int:
        System.out.println(7/2);        //3
        System.out.println(a/2/2);      //1.75 = int = 1
        System.out.println((a/2/2)%2);  //7:2:2 -> 7/2 = 3 : 2 = 1 % 2 = 0 + resto di 1
        System.out.println((a/2)%2);    //7:2 -> 3 % 2 = 1 + resto di 1
        System.out.println(a%2);        //7:2 = 3 + resto di 1
        */
        
        Scanner in=new Scanner(System.in);
        int lato;
        System.out.print("Immetti la dimensione del quadrato: ");
        lato=in.nextInt();
        //La prima riga è completa
        for(int colonna=1; colonna<=lato; colonna++)
        System.out.print("*") ;
        System.out.println();
        //Le righe in mezzo (dalla 2 alla lato-1) non sono complete
        for(int riga=2; riga<=lato-1; riga++)
        {
        for(int colonna=1; colonna<=lato; colonna++)
        {
        if(colonna==1 || colonna==lato)
        System.out.print("*");
        else
        System.out.print(" ");
        }
        System.out.println(); //Vado a capo dopo ogni riga
        }
        //L'ultima riga è completa, ma solo se lato>1
        if(lato>1)
        {
        for(int colonna=1; colonna<=lato; colonna++)
        System.out.print("*") ;
        System.out.println();
        }
        
        
    }
}
