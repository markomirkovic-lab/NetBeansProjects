/**
 * LPRO Cap 8 Operatori video lezione - Accesso alla SSSE-SIG
 *
 * @author marko.mirkovic
 * Version 28.11.2021
 */
package lproaccessossse_sig;

import java.util.Scanner;

public class LproAccessoSSSE_SIG
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        boolean afcCommercio;
        boolean afcInformatico;
        boolean afcMediamatico;
        boolean maturità;
        double anniEsperienza;
        
        //Come valorizzare le variabili:
        System.out.print("Hai un AFC di commercio? (Rispondi si o no): ");
        afcCommercio = in.nextLine().toLowerCase().trim().charAt(0) == 's'
                       ? true
                       : false;
        //in.nextLine(); NON SERVE QUANDO in.nextLine() è già attivo
        
        System.out.print("Hai un AFC di informatico? (Rispondi si o no): ");
        afcInformatico = in.nextLine().toLowerCase().trim().charAt(0) == 's'
                         ? true
                         : false;
        //in.nextLine(); NON SERVE QUANDO in.nextLine() è già attivo
        
        System.out.print("Hai un AFC di mediamatico? (Rispondi si o no): ");
        afcMediamatico = in.nextLine().toLowerCase().trim().charAt(0) == 's'
                         ? true
                         : false;
        //in.nextLine(); NON SERVE QUANDO in.nextLine() è già attivo
        
        System.out.print("Hai un diploma di maturità? (Rispondi si o no): ");
        maturità = in.nextLine().toLowerCase().trim().charAt(0) == 's'
                   ? true
                   : false;
        //in.nextLine(); NON SERVE QUANDO in.nextLine() è già attivo
                
        System.out.print("Quanti anni di esperienza? (Rispondi con un numero): ");
        anniEsperienza = in.nextDouble();
        in.nextLine();//dopo ogni next che non sia una nextLine()
                      //eseguiamo una nextLine() per svuottare il scanner buffer
                      
        boolean accesso = afcCommercio || afcInformatico || afcMediamatico
                          || (maturità && anniEsperienza>=3.0);
        // Le parentesi non sono necessarie in quanto && ha precedenza su OR ||
        
        
        System.out.println("In base ai tuoi diplommi l'accesso è "
                           + (accesso ? "consentito" : "rifiutato"));
        
    }
    
}
