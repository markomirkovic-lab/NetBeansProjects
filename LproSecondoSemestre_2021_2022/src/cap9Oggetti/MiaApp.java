
package cap9Oggetti;

import java.util.ArrayList;

/**
 *
 * @author marko.mirkovic
 * @version 29.05.2022
 */
public class MiaApp 
{
    public static void main(String[] args)
    {
        //in una sola variable possiamo memorizzare gli attributi di una matita
        
        /*
        //costruiamo una nuova matita
        Matita rossaHB = new Matita();
        //e le diamo un colore, una durezza e una lunghezza
        rossaHB.colore="rosso";
        rossaHB.durezza="HB";
        rossaHB.lunghezza=150;
        
        //costruiamo una seconda matita
        Matita blu2H = new Matita();
        rossaHB.colore = "Blu";
        rossaHB.durezza = "2H";
        rossaHB.lunghezza = 150;
    
        
        //per simulare il comportamento di un database possiamo usare un
        //ArrayList che conterra' tutte le nostre matite.
        ArrayList<Matita> astuccio = new ArrayList();
        
        //variable generica tmp
        Matita tmp;
        
        //ogni volta ne creiamo una nuova (new) e la inseriamo nell'astuccio (add)
        
        //nuova matita
        tmp = new Matita();
        tmp.colore = "rosso";
        tmp.durezza = "HB";
        tmp.lunghezza = 150;
        astuccio.add(tmp);//aggiungiamo la nuova matita all'astuccio
        
        //la matita di sopra non la stiamo perdendo perche' l'abbiamo gia'
        //aggiunta all'ArrayList
        
        tmp = new Matita();
        tmp.colore = "blu";
        tmp.durezza = "2H";
        tmp.lunghezza = 150;
        astuccio.add(tmp);
        */
        
        
        /*
        //dopo l'ultima modifica bisogna usare il costruttore
        //l'istruzione
        //tmp = new Matita();
        //non e' piu vaida
        
        //per simulare il comportamento di un database possiamo usare un
        //ArrayList che conterra' tutte le nostre matite.
        ArrayList<Matita> astuccio = new ArrayList();
        
        //variable generica tmp
        Matita tmp;
        
        tmp = new Matita(150, "rosso", "HB");
        astuccio.add(tmp);
        
        tmp = new Matita(150, "blu", "2H");
        astuccio.add(tmp);
        */
        
        //codice ottimizzato:
        ArrayList<Matita> astuccio = new ArrayList();
        
        
        /*
        astuccio.add(new Matita(150, "rosso", "HB"));
        astuccio.add(new Matita(150, "bluu", "HB"));
        */
        
        
        //invocazione secondo costruttore
        astuccio.add( new Matita("rosso", "HB") );
        astuccio.add( new Matita("Blu", "2H") );
        
        //invocazione primo costruttore
        astuccio.add( new Matita(223, "verde", "3F") );
        
        
        Matita m = new Matita(150, "rosso", "HB");
        
       
        
        //System.out.println(m.colore + " - " + m.durezza + " - " + m.lunghezza + "mm");
        
        //
        System.out.println(m);
        
        m.tempera();
        System.out.println(m);
        
    }
}
