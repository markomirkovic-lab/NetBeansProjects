package cap_2_sjavprimosemestre;

/**
 *
 * @author marko.mirkovic
 */
public class MiaApplicazione 
{
    public static void main(String[] args)
    {
        //Vengono instanziati due oggetti di classe SjavDispense. Ognuno avrà i propri
        //attributi, diversi per ogni oggetto! 
        SjavDispense uno=new SjavDispense("primo oggetto");    //Istanziamento primo oggetto
        SjavDispense due=new SjavDispense("secondo oggetto");  //Istanziamento secondo oggetto
                                                //ogni uno con propri attributi
        
        //La classe invece contiene, e mette a disposizione, le variabili e
        //i metodi di classe, non visibili negli oggetti
        //uno. -> apre il menu che espone metodi e attributi dell'oggetto
        //Sjav. -> cosa espone la classe
        
        System.out.println( uno.getNome() );         
        System.out.println( due.getNome() );         
        System.out.println( SjavDispense.VERSION  );                        
        //System.out.println( SjavDispense.getVersion() ); //Errore print(print)
        SjavDispense.getVersion();
        //Sjav.getIniziale();
        
        System.out.println( uno.getIniziale() );
        System.out.println( due.getIniziale() );
    }
}
