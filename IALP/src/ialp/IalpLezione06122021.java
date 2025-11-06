/**
 *
 * @author marko.mirkovic
 * @version 06.12.2021
 */

package ialp;


public class IalpLezione06122021
{
    public static void main(String[] args)
    {
        //10.2 Somma dispari
        
        int c = 0;
        int n = 3;
        int somma = 0;
        
        for(int i = 1; i<n; i++)
        {
            somma +=i;
            i+=2;
        }
        System.out.println(somma);
        
        //3: 1,3,5
        //4: 1,3,5,7
        //7: 1,3,5,7,9,11,13
        //max = n * 2 - 1;
        
        int c2 = 0;
        int n2 = 3;
        int somma2 = 0;

        for (int i = 1; i < n; i++)
        {
            somma2 += i;
            i += 2;
        }
        System.out.println(somma);
        
        
        //----------------------------------------------------------------
        
        /*
        10.3 Mail 
        Mail Scrivete un programma che consente di determinare se l’email
        inserito dall’utente è valido, seguendo le regole seguenti:
        - Deve contenere una sola @
        - Non può contenere spazi
        - Dopo la @ deve esserci almeno un punto.
        
        */
        
        /*
        int atCounter = 0;
        int spaceCounter = 0;
        int dotAfterAtCounter = 0;
        int atIndex = 0;
        String s = "pippo.hoho@miao.wow";
        
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '@')
            {
                atCounter++;
                //atIndex = i;//memoriazzare la posizione
                /*
                if(s.charAt(i+1)=='.')
                {
                    
                }
                */
        
        /*
            }
            else if(s.charAt(i) == ' ')
            {
                spaceCounter++;
            }
            else if(s.charAt(i)==' ')
                
            {
                spaceCounter++;
            }
            else if(s.charAt(i)== '.')
                
                    {
                        spaceCounter++;
                    }
        
        
        if (atCounter == 1
                && spaceCounter == 0
                && dotAfterAtCounter>=1) // && atIndex<s.length() && s.charAt(atIndex)=='.'
            {
                System.out.println("OK");
                //System.out.println("Errore");
                //for(int k = 0; k<s.length();k++)
                
                
            } else
        {
                
        }
      
        
        
        
    }   
        */
        
        /*
        10.5 Quadrato Scrivete un programma che chiede all’utente di immettere
        un numero e poi stampi a schermo un quadrato con la dimensione
        specificata. Es: se il numero è 5 sullo schermo apparirà
        *****
        *   * 
        *   *
        *   *
        *****
        Java si cita prima la riga poi la colonna
        0 1 2 3
        0
        1
        2
        3
        
        per 3 righe
            stampa 3 asterischi e vai a capo
        
        per 3 righe
        {
            per 3 volte
            {
             stampa un asterisco
            }
            vai a capo
        }
        
        dobbiamo sapere quanto e' alta e quanto e' larga
        */
        
        int height = 3;
        int width = 3;
        
        
        for(int k = 0; k<height;k++)
        {
            //righe
            for(int j = 0; j < width; j++)
            {
                System.out.print("*");
                //print(i+ " " + j);
                /*
                i j
                0 0 *
                0 1 *
                0 2 * ciclo finisce i diventa 1
                1 0 *
                1 1
                1 2 * ciclo finisce i diventa 2
                2 0 *
                2 1 *
                2 2 *
                
                se la figura avesse la proporzione diversa:
                ****
                ****
                 for(int k = 0; k<2;k++)
                    {
                        //righe
                        for(int j = 0; j < 4; j++)
                        {
                            System.out.print("*");
                
                
                
                figura piena print("*")
                usare if se stampare asterisco o spazio (+ println)
                
                quadrato vuoto
                
                 for(int k = 0; k<height;k++)
                    {
                        //righe
                        for(int j = 0; j < width; j++)
                        {
                        if(i==0 || i == 2)
                {
                print("*");
                }
                
                
                
              
                
                */
            } System.out.print("\n");
        }
        
        
        
        
        
    }
}
