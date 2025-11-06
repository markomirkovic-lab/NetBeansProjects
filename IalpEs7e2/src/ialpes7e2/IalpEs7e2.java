/*
 * IALP Es. 7.2 Area
 * @author Marko Mirkovic
 * @version 21.10.2021
 */
package ialpes7e2;

import java.util.Scanner;

public class IalpEs7e2 {


    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        float raggio;
        //float area;
        int area;
        
        final double PI=3.14;
        
        System.out.print("Inserire il raggio: ");
        raggio = in.nextFloat();
        
        area = (int)(raggio * raggio * PI);
        
        System.out.println("L'area del cerchio è: " + area);
        
        /*
        run:
        Inserire il raggio: 8.55
        L'area del cerchio è: 229
        BUILD SUCCESSFUL (total time: 4 seconds)
        */
        
    }
    
}
