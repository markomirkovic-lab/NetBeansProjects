package figurageometrica__;

import java.awt.Point;

/**
 *
 * @author marko.mirkovic
 * @version 19 September 2022
 */
public abstract class FiguraGeometrica //abstract
{
    private int x, y;//setting point
    private double dimensione;
    
    //Costruttore
    public FiguraGeometrica(int x, int y, double dimensione)
    {
        //Invoca i metodi privati di inizializzazione.
        //L'invocazione da cotruttore di un metodo publico genera un
        //warning perche' su quest'utimo potrebbe essere effettuato
        //l'override.
        this._setCoordinate(x, y);
        //this.setCoordinate(x, y); andrebbe a chiamare il metodo del cerchio
        this._setDimensione(dimensione);
    }
          
    // Setter privato per le coordinate del centro della figura.
    // Una sotto-classe NON puo effettuare l'ovveride di questo setter
    // Cerchio non vede questo
    private void _setCoordinate(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    // Setter pubblico per le coordinate del centro della figura.
    // Una sotto-clase può effettuare l'override di questo setter.
    public void setCoordinate(int x, int y)
    {
        this._setCoordinate(x, y);
    }
    
    //Getter pubblico per la coordinata X del centro.
    public int getCoordinataX()
    {
        return(this.x);
    }
    
    
    
    
    //Getter pubblico per la coordinata Y del centro.
    public int getCoordinataY()
    {
        return(this.y);
    }
    
    //getter ritorna solo un value
    //per piu' value si puo' usare array di due o piu' elementi (2 o piu' dati insieme)
    //o ritornare un point
    
    public Point getCoordinataXY()//import java.awt.Point; classe gia' fatta x, y,
    {
        // Point p = new Point(this.x, this.x);
        // try p. per vedere metodi
        
        return new Point(this.x, this.y);
    }
    
    
    
    // Setter privato per la dimensione della figura geometrica
    private void _setDimensione(double dimensione)
    {
        this.dimensione = dimensione;
    }
    
    private void setDimensione(double dimensione)
    {
        this._setDimensione(dimensione);
    }
    
    // Prototipo del metodo getPerimetro() (astratto)
    // Deve essere implementato delle sotto classi concrete.
    
    // Attenzione per ora e' un metodo astratto
    // non c'e' un implementazione
    // non sa cosa e' un perimetro per una figura geometrica
    public abstract double getPerimetro();
    
    
    //metodo:
    //select text + convert into method
    //1. abbiamo codice ridondante
    //2. quando richiamiamo metodo publico dal costrutore
    
    
    
    
    
    
    
    
    
    
    
    
    
            
}
