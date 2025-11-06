package esempioclasse;

import java.util.LinkedList;

/**
 * Esempio classe
 *
 * @author Marko Mirkovic
 * @version 18 September 2022
 */
public class EsempioClasse
{

    public static void main(String[] args)
    {
        
        
        
        //Instanziamo un oggetto di classe Persona
        Persona io = new Persona();
        io.nome = "MioNome";
        io.cognome = "MioCognome";
        io.gg = 15;
        io.mm = 4;
        io.anno = 2003;
        
        //L’operatore new serve quindi a riservare in memoria lo
        //spazio per gli attributi dell’oggetto.
        
        
        //Ora instanziamo un array per contenere 10 persone
        Persona [] noi = new Persona [10];
        
        //Ora istanziamo tutte le celle dell'array
        for(int i = 0; i<noi.length; i++)
        {
            noi[i] = new Persona();
        }
        
        //Stesso ragionamento va fatto anche nel caso che si usi un ArrayList
        //o una LinkedList
//        LinkedList<Persona> ll=new LinkedList();          
//        for(int i=0; i<10; i++) 
//        {    
//            Persona tmp=new Persona();    
//            tmp.nome="Persona " + i;              
//            ll.add(tmp); 
//        }
        
        System.out.println("io.anno: " + io.anno);
        
        //Chiama il costruttore che riceve in argomento due String         
        Persona altro=new Persona("Pallino", "Pinco");                  

        //Chiama il costruttore che riceve in arogmento tre interi         
        Persona sconosciuto=new Persona(15,7,1958);                          
        
        System.out.println(io.anno);           //Stamperà 2003        
        System.out.println(altro.nome);        //Stamperà Pallino         
        System.out.println(sconosciuto.mm);    //Stamperà 7 
        
        
        
    }
}
