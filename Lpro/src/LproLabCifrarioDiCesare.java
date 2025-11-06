/**
 *
 * @author marko.mirkovic
 */

import java.util.Scanner;

public class LproLabCifrarioDiCesare
{
    public static void main(String[] args)
    {
        String frase;
        String fraseCifrata;
        int numero;
        int fraseCifrataNumero;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Scrive una frase da cifrare: ");
        frase = input.nextLine();
        
        
        System.out.print("Scrivi un numero: ");
        numero = input.nextInt();
        input.nextLine();
        
        //fraseCifrata = frase >> 5;
        String ris = "";
        for(int i = 0; i<frase.length(); i++)
        {
            //System.out.println(i);// es "XXXX" = 0123
            
            int ch = frase.charAt(i);
            //System.out.println(ch);
            //System.out.println(ch+numero);
            fraseCifrataNumero = ch+numero;
            //System.out.print((char)fraseCifrataNumero);
            ris = ris+(char)fraseCifrataNumero;
            //System.out.println((char)ch+numero);
            
        }
        System.out.println(ris);
        
    }
}
