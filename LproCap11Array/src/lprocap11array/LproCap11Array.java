/**
 * LPRO Capitolo 11 Array
 * 
 * @author marko.mirkovic
 * @version 23.12.2021
 * 
 */
package lprocap11array;

import java.util.Scanner;
import java.util.Arrays;


public class LproCap11Array
{


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        char[] valore = new char[6];
        
        /*
        valore[0] = input.nextLine().trim().charAt(0);
        valore[1] = input.nextLine().trim().charAt(0);
        valore[2] = input.nextLine().trim().charAt(0);
        valore[3] = input.nextLine().trim().charAt(0);
        valore[4] = input.nextLine().trim().charAt(0);
        valore[5] = input.nextLine().trim().charAt(0);
        
        System.out.print(valore[0]);
        System.out.print(", ");
        System.out.print(valore[1]);
        System.out.print(", ");
        System.out.print(valore[2]);
        System.out.print(", ");
        System.out.print(valore[3]);
        System.out.print(", ");
        System.out.print(valore[4]);
        System.out.print(", ");
        System.out.print(valore[5]);
        System.out.print(", ");
                
        System.out.println("");
        
        /*
        run-single:
        w
        a
        h
        t
        k
        m
        w, a, h, t, k, m, 
        BUILD SUCCESSFUL (total time: 31 seconds)
        */

        /*
        for(int i=0; i<valore.length; i++)
        {
            valore[i] = input.nextLine().trim().charAt(0);
        }
        System.out.print(valore[0]);
        System.out.print(", ");
        System.out.print(valore[1]);
        System.out.print(", ");
        System.out.print(valore[2]);
        System.out.print(", ");
        System.out.print(valore[3]);
        System.out.print(", ");
        System.out.print(valore[4]);
        System.out.print(", ");
        System.out.print(valore[5]);
        System.out.print(", ");
                
        System.out.println("");
        */
        
        //---------------------------------------------
        
        /*
        double[] a = {23.4, -7.3, 8.55};
        
        for(int cella = 0; cella<a.length; cella++)
        {
            System.out.print("[" + a[cella] + "] ");
        }
        System.out.println("");
        */
        
        /*
        run-single:
        [23.4] [-7.3] [8.55]
        */
        
        //int riga = 0;
        //int colonna = 0;
        
        double [][] matrice =
        { //1 col     2 col   3 col  4 col
            {  2.78,  12.58, -23.5,  98.76},//1 riga
            { 12.34,   0.02,  78.11, -5.78},//2 riga
            { -3.76,   7.34,  44.44,  1.23} //3 riga
        };
        
        for(int riga = 0; riga <matrice.length; riga++)
        {
            for(int colonna = 0; colonna<matrice[riga].length; colonna++)
            {
                System.out.print(matrice[riga][colonna] + "\t");
                System.out.println(" ");
            }
            
            System.out.println("");
            //System.out.println("matrice.length: " + matrice.length);
            //System.out.println("matrice[riga].length: " + matrice[riga].length);
        }
        
        /*
        run-single:
        2.78	 
        12.58	 
        -23.5	 
        98.76	 

        matrice.length: 3
        matrice[riga].length: 4
        12.34	 
        0.02	 
        78.11	 
        -5.78	 

        matrice.length: 3
        matrice[riga].length: 4
        -3.76	 
        7.34	 
        44.44	 
        1.23	 

        matrice.length: 3
        matrice[riga].length: 4
        */
        
        System.out.println("");
        
        //-------------------------------------------------------------
               
        String[] g = {"Lun", "Mar", "Mer", "Gio", "Ven", "Sab", "Dom"};
        
        String trova = "Gio";
        
        int indiceTrovato = -1;// indice non valido
        
        for(int i=0;i<g.length;i++)
        {
            if(g[i].equals(trova))
            {
                indiceTrovato=i;
                break;
            }
        }
        System.out.println("Array: " + Arrays.toString(g));
        if(indiceTrovato==-1)
        {
            System.out.println("Valore " + trova + "non trovato!");
        }
        else
        {
            System.out.println("Valore \"" + trova + "\" trovato all'indice: " +
                               indiceTrovato);
        }
        System.out.println(g[indiceTrovato]);
    }
    
}
