/**
 * IALP Esercizio Conversione gradi C e F
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;


public class Es6_1_ConversioneGradiCeF
{
    public static void main(String[] args)
    {
        //Dichiaro
        float gradiF;
        float gradiC;
        //Inizializzo
        gradiF=50.7F;
        //Calcolo
        gradiC=(gradiF-32F)*5F/9F; //Notate che i numeri li esprimo in float
        //Stampo
        System.out.print(gradiF);
        System.out.print(" gradi F corrispondono a ");
        System.out.print(gradiC);
        System.out.println(" gradi C.");
    }
}
