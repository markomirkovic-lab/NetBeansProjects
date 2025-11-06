package inutile;

/**
 * Classe inutile
 * @author marko.mirkovic
 * @version 18 October 2022
 */
public class Inutile 
{
    //variable non statica
    public int x;   //Attributo dell'oggetto (attributi o varabili di istanza)
                    //Esistono solo nell'istanza della classe creata (oggetto)
    //variable statica
    static int sx;  //Attributo della classe (varabili di classe)
                    //Esistono indeipendentemetne dagli oggetti creati
                    //Sono come variabili globali
    
    //Metodo dell'oggeto, puo' accedere agli attributi
    public void m(int valore)
    {
        this.x = valore;
        //x = valore*2;
        sx = valore*2;
    }
    //Ogni volta che si altera il valore di sx questo si riflette
    //sia nella classe sia nei due oggetti creati
    
    //Metodo static non ha ccesso agli attributi non static
    public static void sx(int valore)
    {
        //NON funziona perche' non esiste l'oggetto
        //NON esiste this
        //this.sx = valore;
        sx = valore*3;
    }

}
