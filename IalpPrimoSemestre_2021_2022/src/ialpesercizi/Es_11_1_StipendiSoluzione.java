
package ialpesercizi;

import java.util.Scanner;

/**
 * Array (soluzioni) - Es. 11. 1
 * @author marko.mirkovic
 * @version
 */
public class Es_11_1_StipendiSoluzione
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int dipendenti;
        String[] nome;
        double[] stipendio;
        
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
            for(int n=0; n<nome.length; n++)
            System.out.println(nome[n] + ": " + stipendio[n]);
    }
}
