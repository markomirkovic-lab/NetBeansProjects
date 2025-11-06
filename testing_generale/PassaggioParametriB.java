package testing_generale;

import java.util.Arrays;

/**
 *
 * @author marko.mirkovic
 * @version 23 October 2022
 */
public class PassaggioParametriB 
{
    
    /**
     * Ritorna una copia di array con gli elementi ribaltati.
     * L'array originale non viene modificato.
     * @param array l'array da copiare ribaltare
     * @return una copia di array con gli elementi ribaltati
     */
    public static int [] getReversedCopy(int [] array)
    {
        int i;
        int [] copia = array.clone();
        int dum;
        for( i = 0; i < copia.length / 2; i++)
        {
            dum = copia[i];
            copia[i] = copia[copia.length - 1 - i];
            copia[copia.length - 1 - i] = dum;
            //System.out.println(i);
            System.out.println("dum " + dum);

        }
        return copia;
        
    }
    
    public static void main(String[] args)
    {
        int[] mioArray = {1,2,3,4};
        
        System.out.println(Arrays.toString(mioArray));
        System.out.println(Arrays.toString(getReversedCopy(mioArray)));
        System.out.println(Arrays.toString(mioArray));

    }
}
