package figuraGeometrica;

import java.awt.Point;

/**
 *
 * @author Neil Otupacca
 */
public abstract class FiguraGeometrica {
    // ========

    // Coordinate del centro e dimensione della figura geometrica.
    // Il valore della variabile di istanza 'dimensione', a dipendenza della
    // sottoclasse che eredita da FiguraGeometrica, conterrà il raggio (Cerchio),
    // la base (Rettangolo), il lato (Quadrato) e il lato (TriangoloEquilatero).
    private int x, y;
    private double dimensione;

    // Costruttore.
    public FiguraGeometrica(int x, int y, double dimensione) {
        // Invoca i metodi privati di inizializzazione.
        // L'invocazione da costruttore di un metodo pubblico genera un warning
        // perché, per quest'ultimo, potrebbe essere effettuato un override che
        // modificherebbe la corretta inizializzazione della classe a cui
        // appartiene il costruttore (durante la "catena" dei costruttori).
        // Nota: abbiamo visto in aula la "catena" di esecuzione dei costruttori
        //       che, dal costruttore della sottoclasse effettivamente istanziata,
        //       risale fino al costruttore di Object (meccanismo dovuto agli
        //       statement super, sia espliciti che impliciti).
        //       In seguito, tutte le implementazioni della "catena" di costruttori
        //       vengono eseguite da Object fino al costruttore della classe
        //       istanziata.
        //       Per tutta la durata dell'esecuzione in cascata dei costruttori,
        //       la reference di this è sempre un oggetto della classe istanziata.
        this._setCoordinate(x, y);
        this._setDimensione(dimensione);
    }

    // Setter privato per le coordinate del centro della figura.
    // Una sottoclasse NON può effettuare l'override di questo setter.
    private void _setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setter pubblico per le coordinate del centro della figura.
    // Una sottoclasse può effettuare l'override di questo setter.
    public void setCoordinate(int x, int y) {
        this._setCoordinate(x, y);
    }

    // Getter pubblico per la coordinata X del centro.
    public int getCoordinataX() {
        return this.x;
    }

    // Getter pubblico per la coordinata Y del centro.
    public int getCoordinataY() {
        return this.y;
    }

    public Point getCoordinataXY() {
        return new Point(this.x ,this.y);
    }

    // Setter privato per la dimensione della figura geometrica.
    // Una sottoclasse NON può effettuare l'override di questo setter.
    private void _setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    // Setter pubblico per la dimensione della figura geometrica.
    // Una sottoclasse può effettuare l'override di questo setter.
    public void setDimensione(double dimensione) {
        this._setDimensione(dimensione);
    }

    // Getter pubblico per la dimensione della figura.
    public double getDimensione() {
        return this.dimensione;
    }

    // Prototipo del metodo getPerimetro() (astratto).
    // Deve essere implementato dalle sottoclassi concrete o da una classe
    // anonima.
    public abstract double getPerimetro();
}
