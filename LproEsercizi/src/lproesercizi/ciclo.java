package lproesercizi;

import java.util.Scanner;

/**
 * Cicli
 * @author marko.mirkovic
 * @version 02.12.2021
 * 
 */
public class ciclo
{
    public static void main(String[] args)
    {
        int i, ii, iii;
        
        i=0;
        while(i<5)
        {
            System.out.println(i);
            i++;
        }
        
        ii = 0;
        do
        {
            System.out.println(ii);
            i++;
        } while (i<5);
        
        
        for(iii=0;i<5;i++)
        {
            System.out.print(iii);
        }
        
        System.out.println("");
        
        //---------------------------------
        
        String nome = "simone";
        
        for(int j=0; j<nome.length();j++) //variabili contattore ijklmnop 
        {
            System.out.println(nome.charAt(j));
        }
        
        for (int k = 1; k <= 10; k++) //for + tab
        {
           
            if(k==5) continue; //meglio sostituire continue con booleano o espressione if
            System.out.println("3*" + k + "=" + (3*k));
        }
               for(int j=0; j<nome.length();j++) //variabili contattore ijklmnop 
        {
            System.out.println(nome.charAt(j));
        }
        
        for (int kk = 1; kk <= 10; kk++) //for + tab
        {
           
            if(kk==5) break; //ferma il ciclo
            System.out.println("3*" + kk + "=" + (3*kk));
        }
    
        for (int kk = 1; kk <= 10; kk++) //for + tab
        {
           
            if(kk!=5) //ferma il ciclo e ricomincia a 6
            {
            System.out.println("3*" + kk + "=" + (3*kk));
            }
        }
        
        //usare tuttoOK con booleani
        
        Scanner input = new Scanner(System.in);
        int nro;
        boolean tuttoOK; 
        
        do
        {
            tuttoOK=false; //flag
            
            System.out.println("Dammi un numero da 1 a 5: ");
            if(input.hasNextInt())
            {
                nro = input.nextInt();
                if(nro<1 || nro>5)
                    
                {
                    tuttoOK=true;
                }
            }
            
            else
            {
                   tuttoOK=true; //oppure tuttoOK=false;
            }
            input.nextLine();
        } while(tuttoOK); //oppure while(!tuttoOK o tuttoOk==false)

        
        //allineare una stringa a destra
        
        String nome2 = "SSSE";
        
        for(int k=0; k<10 - nome2.length();k++)
        {
            System.out.print("-");
        }
        System.out.println(nome2);
        
        //i = 0; i<500 e' meglio di i=1; i<=500
    
        
    }
}
