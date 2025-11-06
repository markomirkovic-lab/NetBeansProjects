/**
 * IALP Esercizio Conversione gradi C e F
 * @author Marko Mirkovic
 * @version 12.12.2021
 */

package ialpesercizi;


public class Es6_2_ConversioneGradiCeF
{
    public static void main(String[] args)
    {
        //Dichiaro
        float gradiF;
        float gradiC;
        //Inizializzo
        //gradiF=50.7F;
        
        //Calcolo
        for(int k=0;k<101;k++) //k = k + 1;
        {
        gradiF = k;
        gradiC=(gradiF-32F)*5F/9F; //Notate che i numeri li esprimo in float
        //gradiC=(k-32F)*5F/9F;
        //Stampo
        System.out.print(gradiF);
        System.out.print(" gradi F corrispondono a ");
        System.out.print(gradiC);
        System.out.println(" gradi C.");
        }
        
    }
}
