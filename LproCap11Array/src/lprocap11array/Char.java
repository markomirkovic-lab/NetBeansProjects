/**
 *
 * @author marko.mirkovic
 * @version 24.12.2021
 */

package lprocap11array;

//import java.io.FileNotFoundException;
import java.util.Scanner;


public class Char
{
    public static void main(String[] args)
    {
        //char [] lettere = {'w', 'a', 'h', 't', 'k', 'l'};
        //oppure:
        
        //tipo  variable
        char [] lettere;//dicharazione arrary
        lettere = new char[6];//instanziamento array
        
        //assegnamento variabili array
        lettere[0] = 'w';
        lettere[1] = 'a';
        lettere[2] = 'h';
        lettere[3] = 't';
        lettere[4] = 'k';
        lettere[5] = 'l';
        
        //System.out.print(lettere[4]);
        
        for(int colonna = 1; colonna<lettere.length; colonna++)
        {
            if(lettere[colonna] == 'k')
            {
                System.out.println("lettere[4]: " + lettere[4] + " Indice: " + colonna);
            }
        }
        
        System.out.println("Length: " + (lettere.length));
        
        lettere[5] = 'm';
        System.out.println(lettere[5]);
        
        /*
        run:
        lettere[4]: k Indice: 4
        Length: 6
        m
        */
        
        
        //--------------------------------
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("---");
        System.out.println("Immetti sei lettere: ");
        char[] valore = new char[6];
        valore[0] = input.nextLine().trim().charAt(0);
        valore[1] = input.nextLine().trim().charAt(0);
        valore[2] = input.nextLine().trim().charAt(0);
        valore[3] = input.nextLine().trim().charAt(0);
        valore[4] = input.nextLine().trim().charAt(0);
        valore[5] = input.nextLine().trim().charAt(0);
        
        System.out.print("Le lettere sono: ");
        
        for(int colonna = 0; colonna<valore.length; colonna++)
        {
            System.out.print((valore[colonna]) + ", ");
        }
        
        //char backspace = '\u0008'; //(char) 8;
        //System.out.print(backspace);
        //System.out.print(backspace);
        //oppure:
        System.out.print('\u0008');//per cancellare ultima ", "
        System.out.print('\u0008');//per cancellare ultima ", "
        System.out.println(" ");
        
        /*
        Immetti sei lettere: 
        a
        b
        c
        d
        e
        f
        Le lettere sono: a, b, c, d, e, f 
        */
        
     
      
        
    }
}
