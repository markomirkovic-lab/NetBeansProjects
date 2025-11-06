
package ialpesercizi;

import java.util.Scanner;

/**
 * Array (Solutions) Es. 11. 2
 * @author marko.mirkovic
 * @version
 */
public class Es_11_2_StipendiSolution
{
    public static void main(String[] args)
    {
        
        Scanner in=new Scanner(System.in);
        
        int dipendenti;
        String[] nome;
        double[] stipendio;
        double limite;
        
        System.out.print("Quanti dipendenti devi gestire? ");
        dipendenti=in.nextInt();
        in.nextLine();
        
        //Ora che conosco la dimensione posso riservare lo spazio in memoria dell'array
        nome=new String[dipendenti];
        stipendio=new double[dipendenti];
        
        for(int n=0; n<nome.length; n++)
        {
            System.out.print("Nome del dipendente numero "
            + (n+1) + ": ");
            nome[n]=in.nextLine();
            
            System.out.print("Stipendio del dipendente numero "
            + (n+1) + ": ");
            stipendio[n]=in.nextDouble();
            in.nextLine();
        }
        
        System.out.print("Inserisci il limite: ");
        limite=in.nextDouble();
        
        for(int n=0; n<nome.length; n++)
        {
            if(stipendio[n]<limite)
            System.out.println(nome[n] + ": " + stipendio[n]); 
        }

        
    }
}
