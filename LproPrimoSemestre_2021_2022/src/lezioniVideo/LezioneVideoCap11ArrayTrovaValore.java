
package lezioniVideo;

import java.util.Arrays;

/**
 * Lezione Video Cap 11 Array - Trova valore
 * @author Marko Mirkovic
 * @version 26.01.2022
 */

public class LezioneVideoCap11ArrayTrovaValore
{
    public static void main(String[] args)
    {
        //ricerca di un valore
        
        String g [] = { "Lun", "Mar", "Mer", "Gio", "Ven", "Sab", "Dom"};
        
        String trova = "Gio";
        
        int indiceTrovato = -1;//-1 perche' e' un indice non valido
        
        for(int i = 0; i < g.length; i++)
        {
            if(g[i].equals(trova))
            {
                indiceTrovato = i;  //Memorizza l'indice i
                break;              //Interrompe il ciclo
            }
        }
        
        System.out.println("Array: " + Arrays.toString(g));
        
        if(indiceTrovato == -1)
        {
            System.out.println("Valore " + trova + " non trovato!");
        }
        else
        {
            System.out.println("Valore \"" + trova + "\" trovato all'indice: " +
                               indiceTrovato);
        }
        
        System.out.println(g[indiceTrovato]);
        
        /*
        run:
        Array: [Lun, Mar, Mer, Gio, Ven, Sab, Dom]
        Valore "Gio" trovato all'indice: 3
        Gio
        */
    }
}
