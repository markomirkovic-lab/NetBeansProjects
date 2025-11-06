
package cap9Oggetti;

/**
 *
 * @author marko.mirkovic
 * @version 29.05.2022
 */
public class Matita 
{
    public int lunghezza;
    public String colore;
    public String durezza;
    
    //costruttore (un metodo)
    //si chiama come la classe ed e' un metodo che non ha tipo di ritorno
    public Matita(int lunghezza, String colore, String durezza)
    {
        //this e' il riferimento all'oggetto e ci consente di non confondere
        //l'argomento lugnhezza con l'attributo lunghezza
        
        //all'attributo lunghezza dichiarato (riga 5) assegnamo il contenuto
        //dell'argomento lunghezza
        
        this.lunghezza = lunghezza;
        this.colore = colore;
        this.durezza = durezza;
    }
    
    //mettiamo la lunghezza standard di 150mm
    //scriviamo un secondo costruttore che forza a 150 la lunghezza
    public Matita(String colore, String durezza)
    {
        this(150, colore, durezza);
    }
    
    //prevediamo gia' cosa stampare e in quale formato
    //Override indica a Java che si sta sovrascrivendo un metodo presente
    //nella classe madre (il metodo toString() originale non sara' piu' utilizzabile
    //l'uso di this si riferisce sempre agli attributi della classe
    @Override
    public String toString()
    {
        return(this.colore + " - " + this.durezza + " - " + this.lunghezza + " mm");
    }
    
    public boolean tempera()
    {
        if(this.lunghezza >= 35)
        {
            this.lunghezza-= 5;//tempero
            return (true);
        }
        else
        {
            return(false);
        }
    }
}
            
