/*
 * ScannerTesting3
 * @author Marko Mirkovic
 * @version 17.10.2021
 */
package scannertesting3;




public class ScannerTesting3 {

    
    public static void main(String[] args)
    {
        short s=0; int i=0; long l=0;
        
        //Creiamo un oggetto di tipo Scanner
        Scanner input = new Scanner(System.in);
        
        //Leggiamo alcuni valori
        System.out.print("Inserisci uno short, un int, un long: ");
        s=input.nextShort(); //Leggiamo uno short
        i=input.nextInt(); //Leggiamo un int 
        l=input.nextLong(); //Leggiamo un long
        
        //Stampiamo i risultati 
        System.out.println("Hai inserito: " + s + " " + i + " " + l);
        
        /*
        run:
        Inserisci uno short, un int, un long: 1
        1
        1
        Hai inserito: 1 1 1
        BUILD SUCCESSFUL (total time: 7 seconds)
        */
    }
    
}
