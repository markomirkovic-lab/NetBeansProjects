/*
 * Lpro Primo Test - Stampa inizali
 *
 * @author marko.mirkovic
 * Version 17.11.2021
 */
package stampainiziali;

import java.util.Scanner;

public class StampaIniziali {

  
    public static void main(String[] args) {
                
        String n;
        String c;
        String sigla;
        String e = "EXIT";
        String e2 = "exit";
        String e3 = "Exit";
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Inserici il nome:");
        n = input.next();
        input.nextLine();
        
        System.out.print("Inserici il cognome: ");
        c = input.next();
        input.nextLine();
        
        if ((n == e || n == e2) || (c == e || c == e2)) //non funziona???
            {
            input.close();
            } else if ( ( (n.indexOf("Exit")) >= 0 ||
                    (n.indexOf("exit")) >= 0 ) ||
                  ( (c.indexOf("Exit")) >= 0 ||
                    (c.indexOf("exit")) >=0  ) )
            {
            input.close();
            } else
            {
            sigla = "" + n.charAt(0) + c.charAt(0);
            System.out.println(sigla.toUpperCase());
            }
        
        //System.out.println(n + " " + c);
        
        input.close();
        
    }
    
}
