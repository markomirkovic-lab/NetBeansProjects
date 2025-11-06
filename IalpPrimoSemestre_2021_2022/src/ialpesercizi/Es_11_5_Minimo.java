package ialpesercizi;

/**
 * Esercizio 11.5 - Minimo
 * 
 * Scrivete un codice che trovi il numero minimo presente in un array di interi.
 * 
 * @author Marko Mirkovic
 * @version 23.01.2022
 */




public class Es_11_5_Minimo
{
    public static void main(String[] args)
    {
        int numero[] = {30, 11, 23, 42, 3, 9, 88, 81, 49};
        
        int numeroMinimo = 0;
        
        numeroMinimo = numero[0];
        
        for(int indice = 0; indice<numero.length; indice++)
        {
            if(numero[indice]<numeroMinimo)
            {
                numeroMinimo = numero[indice];
            }
            
        }
        
        System.out.println("Il numero minimo e': " + numeroMinimo);
        
        /*
        run:
        Il numero minimo e': 3
        */
        
    }
}
