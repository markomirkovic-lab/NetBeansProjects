package array;

/**
 * Eserciziario MinMax
 * 
 * https://gitalb.github.io/eserciziario2.0/array/2017/03/21/minmax.html
 * 
 * Scrivi il programma MinMax che:
 * Crea una matrice di interi di dimensioni 8 x 8
 * Riempie la matrice con 64 valori casuali compresi nell’intervallo [0; 100]
 * Stampa il contenuto della matrice
 * Trova il valore massimo contenuto nella matrice
 * Trova il valore minimo contenuto nella matrice
 * Stampa a terminale il massimo e minimo
 * 
 * @author Marko Mirkovic
 * @version 24.01.2022
 */

public class MinMax
{
    public static void main(String[] args)
    {
        int matrice[][] = new int[8][8];
        
        for(int indice1 = 0; indice1 < matrice.length; indice1++)
        {
            for(int indice2 = 0; indice2 < matrice[indice1].length; indice2++)
            {
                matrice[indice1][indice2] = (int) (Math.random() * 101);
            }
        }
        
        
        for(int indice1 = 0; indice1 < matrice.length; indice1++)
        {
            for(int indice2 = 0; indice2 < matrice[indice1].length; indice2++)
            {
                System.out.print((matrice[indice1][indice2]) + "\t");
            }
            System.out.println("");
        }
        
        int valoreMassimo = matrice[0][0];
        for(int indice1 = 0; indice1 < matrice.length; indice1++)
        {
            for(int indice2 = 0; indice2 < matrice[indice1].length; indice2++)
            {
                if(matrice[indice1][indice2] > valoreMassimo)
                {
                    valoreMassimo = matrice[indice1][indice2];
                }
                
            }
        }
        
        System.out.println("Valore massimo = " + valoreMassimo);
        
        int valoreMinimo = matrice[0][0];
        for(int indice1 = 0; indice1 < matrice.length; indice1++)
        {
            for(int indice2 = 0; indice2 < matrice[indice1].length; indice2++)
            {
                if(matrice[indice1][indice2] < valoreMinimo)
                {
                    valoreMinimo = matrice[indice1][indice2];
                }
                
            }
        }
        
        System.out.println("Valore minimo = " + valoreMinimo);
        
        /*
        run-single:
        67	36	87	70	88	83	32	4	
        38	88	80	82	12	86	15	16	
        14	11	45	44	98	91	0	21	
        43	62	42	41	34	85	2	17	
        61	52	29	28	84	100	24	43	
        69	93	48	98	2	21	44	32	
        5	61	80	29	18	76	18	86	
        30	24	63	41	78	2	74	1	
        Valore massimo = 100
        Valore minimo = 0
        */
        
    }
}
