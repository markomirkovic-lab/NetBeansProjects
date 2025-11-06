/**
 * IALP Esercizio Calcolo Note Scolastiche
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;


public class Es6_3_CalcoloNoteScolastiche
{
    public static void main(String[] args)
    {
        /*
        //Questa versione vi darà 4.8500004
        float ialp, lpro, alpr, media;
        ialp=4.5F;
        lpro=5.3F;
        SG-RO-AA – SSSE-SIG 2019/20 IALP – Introduzione all’algoritmica e alla programmazione Cap. 6—4 di 7
        alpr=4.8F;
        
        //Questa versione vi darà 4.8500001430511475
        double ialp, lpro, alpr, media;
        ialp=4.5F;
        lpro=5.3F;
        alpr=4.8F;
        */
        
        //Questa versione vi darà 4.85
        double ialp, lpro, alpr, media;
        ialp=4.5;
        lpro=5.3;
        alpr=4.8;
        media=(ialp+lpro+alpr*2)/4;
        System.out.print("IALP: ");
        System.out.println(ialp);
        System.out.print("LPRO: ");
        System.out.println(lpro);
        System.out.print("ALPR: ");
        System.out.println(alpr);
        System.out.print("\nMedia: ");
        System.out.println(media);
    }
}
