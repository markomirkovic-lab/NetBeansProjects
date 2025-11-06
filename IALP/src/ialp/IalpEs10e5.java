/**
 * Esercizio 10.5 Quadrato
 * @author marko.mirkovic
 * @version 06.12.2021
 */

 /**
  * Scrivete un programma che chiede all’utente di immettere un numero e
  * poi stampi a schermo un quadrato con la dimensione specificata.
  * Es: se il numero è 5 sullo schermo apparirà
  ***** *   * *   * *   * *****
*/
package ialp;


public class IalpEs10e5
{
    public static void main(String[] args)
    {
        
        //Quadrato pieno
        int righe = 3;
        int colonne = 3;

        for(int i = 0; i<righe; i++)
        {
                for(int j = 0; j<colonne; j++)
                {
                System.out.print("*");
                }
                System.out.print("\n");
        } 
        
        /*
        run-single:
        ***
        ***
        ***
        */
        
        //Quadrato vuoto
        
        

    }
}
