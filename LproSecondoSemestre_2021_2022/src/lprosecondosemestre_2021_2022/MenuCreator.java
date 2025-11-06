package lprosecondosemestre_2021_2022;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marko.mirkovic
 */
public class MenuCreator 
{
    public static void main(String[] args)
    {
        int scelta;
        
        Scanner in = new Scanner(System.in);
        
        //Arrary richiede la classe wrapper Integer Double String etc.
        ArrayList<Food> menu = new ArrayList();
        
        
        do
        {
            System.out.println("[1 Aggiungi pietanza | 2 Esci] Scelta: ");
            while(!in.hasNextInt())
            {
                in.nextLine();
            }
            
            if(scelta == 1)
            {
                System.out.println("Aggiungi pietanza");
                System.out.println("-------------------");
                System.out.println("Nome pietanza");
                String nome = in.nextLine();
                
                System.out.println("Prezzo pietanza: ");
                double prezzo = in.nextDouble();
                
                
                
                //in.nextLine();//puliamo il buffer
                
                try
                {
                    Food pietanza = new Food(nome, prezzo);
                    System.out.println("Aggiunto " + pietanza.getNome()
                                   + ", CHF " + pietanza.getPrezzo());
                }
                catch
                {
                    
                }
                
                try
                {
                    
                }

            }
            
        } while(scelta!=2);
        
    }
}
