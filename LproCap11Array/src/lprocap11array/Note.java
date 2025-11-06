
/**
 *
 * @author marko.mirkovic
 */


package lprocap11array;

import java.util.Scanner;

public class Note
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        double valore1;
        System.out.println("1. Inserici un valore double: ");
        while(!input.hasNextDouble()) input.nextLine();
        valore1 = input.nextDouble();
        input.nextLine();
        
        double valore2;
        System.out.println("2. Inserici un valore double: ");
        while(!input.hasNextDouble()) input.nextLine();
        valore2 = input.nextDouble();
        input.nextLine();
        
        double valore3;
        System.out.println("3. Inserici un valore double: ");
        while(!input.hasNextDouble()) input.nextLine();
        valore3 = input.nextDouble();
        input.nextLine();
        
                
        double media = (valore1 + valore2 + valore3)/3.0;
        System.out.println("Media: " + media);
        
        System.out.println("");
        System.out.println("---------------------------------");
        
        int valori;
        System.out.println("Vuoi calcolare la media di quanti valori? ");
        while(!input.hasNextInt()) input.nextLine();
        valori = input.nextInt();
        input.nextLine();
        
        double media2 = (valore1 + valore2 + valore3)/valori;
        System.out.println("Media: " + media2);
        
    }
}
