package alprleclassi;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Esempio Classe (Main)
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class EsempioClasse 
{
    public static void main(String[] args)
    {
        //Istanziamo un oggetto di classe Persona
        Persona io = new Persona();
        
        io.nome = "MioNome";
        io.cognome = "MioCognome";
        io.gg = 15;
        io.mm = 4;
        io.anno = 2003;
        
        System.out.println("io.anno " + io.anno);//io.anno 2003
        
        System.out.println("---");
        //--------------------------------------
        
        //Chiama il costruttore che riceve in argomento due String
        Persona altro = new Persona("Pallino", "Pinco");
        
        //Chiama il costrutture che riceve in argomento tre interi
        Persona sconosciuto = new Persona(15, 7, 1958);
        
        System.out.println("io.anno: " + io.anno);
        System.out.println("altro.nome: " + altro.nome);
        System.out.println("sconosciuto.mm: " + sconosciuto.mm);
        
        
        altro.finalize();
        
        /*
        io.anno: 2003
        altro.nome: Pallino
        sconosciuto.mm: 7
        */
        
        System.out.println("---");
        //--------------------------------------
   
        //Istanziamo un array per contenere 10 persone (10 oggetti persona)
        //Operazione non necessaria per tipi Wrapper e String
        Persona [] noi = new Persona[10];
        
        //Istanziamo tutte le celle dell'array
        for(int i = 0; i<noi.length; i++)
        {
            noi[i] = new Persona();
            System.out.println("noi[i]" + noi[i]);
        }
        
        System.out.println("---");
        
        //Nel caso di array list
        
        ArrayList<Persona> aList = new ArrayList(10);
        
        //Istanziamo tutte le celle della LinkedList
        for(int i = 0; i < 10; i++)
        {
            Persona tmp = new Persona();
            tmp.nome = "Persona " + i;
            aList.add(tmp);
            System.out.println("tmp " + tmp);
        }
        
        
        
        System.out.println("---");
        
        //Nel caso dilinkedList
        
        LinkedList<Persona> lList = new LinkedList();
        
        //Istanziamo tutte le celle della LinkedList
        for(int i = 0; i < 10; i++)
        {
            Persona tmp = new Persona();
            tmp.nome = "Persona " + i;
            lList.add(tmp);
            System.out.println("tmp " + tmp);
        }
        
        //Garbage collector
        System.gc();
        System.exit(0);
        
        System.out.println("-gc-");
        System.out.println("io.anno: " + io.anno);
        System.out.println("altro.nome: " + altro.nome);
        System.out.println("sconosciuto.mm: " + sconosciuto.mm);
        
        /*
        run-single:
        io.anno 2003
        ---
        io.anno: 2003
        altro.nome: Pallino
        sconosciuto.mm: 7
        ---
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        noi[i]null
        ---
        tmp Persona 0
        tmp Persona 1
        tmp Persona 2
        tmp Persona 3
        tmp Persona 4
        tmp Persona 5
        tmp Persona 6
        tmp Persona 7
        tmp Persona 8
        tmp Persona 9
        ---
        tmp Persona 0
        tmp Persona 1
        tmp Persona 2
        tmp Persona 3
        tmp Persona 4
        tmp Persona 5
        tmp Persona 6
        tmp Persona 7
        tmp Persona 8
        tmp Persona 9
        */
       
        
    }
}
