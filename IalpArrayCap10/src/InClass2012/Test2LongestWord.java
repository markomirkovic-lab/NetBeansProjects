/**
 * 
 * @author marko.mirkovic
 * @version 17.01.2022
 */

package InClass2012;

import java.util.Scanner;

public class Test2LongestWord
{
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        //tanto va la gatta al lardo quit
        //spazzi, tabulatori, vai a capo
        //7 token
        String testo = "tanto va la\t \t\nlardo quit";
        
        String longest = "";
        String word = "";
        String longestWords = "";
        int maxLen = 0;
        boolean done = false;
        
        do
        {
                 
            word = tastiera.next();
            //lungezzaCorrente = maxLen;
            
            if(!word.equalsIgnoreCase("quit"))
            {
                if(word.length() > maxLen)
                {
                    maxLen = word.length();
                    longest = word;

                }
                else if(word.length() == maxLen)
                {
                    longest += ", " + word;
                }
            }
            else
            {
                done = true;
            }
            
            System.out.println(word + "--->" + longest);
            
        } while(!done);
        
        
        
        System.out.println("longestWords lunghezzaMassima " + longest + " " + maxLen);
        
    }
}
