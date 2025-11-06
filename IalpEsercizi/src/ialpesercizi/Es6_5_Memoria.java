/**
 * IALP Esercizio Memoria
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;


public class Es6_5_Memoria
{
    public static void main(String[] args)
    {
        String saluti;
        int i; //32bit
        double f; //64bit
        saluti="Benvenuti in Java"; //16bit per ogni lettera
        //      01234567890123456   //saluti.length() = 17
        for(int j=0; j<saluti.length(); j++) //32bit
        {
            System.out.println(saluti.charAt(j));
            long t=saluti.length(); //64bit
            //System.out.println(t);
        }

        //Totale 32+64+16*17+32+64=464bit
        
        /*
        run:
        B
        e
        n
        v
        e
        n
        u
        t
        i

        i
        n

        J
        a
        v
        a
        BUILD SUCCESSFUL (total time: 0 seconds)
        */
        
    }
}
