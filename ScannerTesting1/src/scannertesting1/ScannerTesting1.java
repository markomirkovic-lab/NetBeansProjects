/*
 * ScannerTesting1
 * @author Marko Mirkovic
 * @version 17.10.2021
 */
package scannertesting1;

/**
 *
 * @author marko.mirkovic
 */
public class ScannerTesting1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        double raggio;
        final double PI=3.14;
        double area;
        
        raggio = 7.23;
        area = raggio*raggio*PI;
        
        /*        
        System.out.print("Raggio: ");
        System.out.println(raggio);
        System.out.print("Area: ");
        System.out.println(area);
        */
        
        /*
        run:
        Raggio: 7.23
        Area: 164.13690600000004
        */
        
        System.out.println("Raggio: " + raggio + "\nArea: " + area);

        /*
        run:
        Raggio: 7.23
        Area: 164.13690600000004
        */
        
        /*
        Java nota che stiamo mischiando delle stringhe con dei double,
        sceglie il valore più grande (String) e converte automaticamente
        raggio e area in String, poi elabora l’operatore + concatenando
        le stringhe fra loro.
        */
        
             
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
}
