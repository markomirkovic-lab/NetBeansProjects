package figuraGeometrica_;

import java.awt.Point;

/**
 *
 * @author Neil Otupacca
 */
public abstract class FiguraGeometrica {

    // Coordinate del centro e dimensione della figura geometrica.
    private int x, y;
    private double dimensione;

    // Costruttore.
    public FiguraGeometrica(int x, int y, double dimensione) {
        // Invoca i metodi privati di inizializzazione.
        // L'invocazione da costruttore di un metodo pubblico genera un
        // warning perché su quest'ultimo potrebbe essere effettuato l'override.
        this._setCoordinate(x, y);
        this._setDimensione(dimensione);
    }

    // Setter privato per le coordinate del centro della figura.
    // Una sotto-classe NON può effettuare l'override di questo setter.
    private void _setCoordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Setter pubblico per le coordinate del centro della figura.
    // Una sotto-classe può effettuare l'override di questo setter.
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
    private void _setDimensione(double dimensione) {
        this.dimensione = dimensione;
    }

    // Setter pubblico per la dimensione della figura geometrica.
    public void setDimensione(double dimensione) {
        this._setDimensione(dimensione);
    }

    // Getter pubblico per la dimensione della figura.
    public double getDimensione() {
        return this.dimensione;
    }

    // Prototipo del metodo getPerimetro() (astratto).
    // Deve essere implementato dalle sotto classi concrete.
    public abstract double getPerimetro();
}
