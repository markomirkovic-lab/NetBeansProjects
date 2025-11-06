package figuraGeometrica;

/**
 *
 * @author Neil Otupacca
 */
public class Cerchio extends FiguraGeometrica {

    public Cerchio(int x, int y, double raggio) {
        // Inoltra alla super-classe i valori degli argomenti.
        // Il raggio del cerchio viene memorizzato nella variabile 'dimensione'
        // della classe FiguraGeometrica (super-classe).
        super(x, y, raggio);
    }

    // Setter pubblico per il raggio del cerchio.
    public void setRaggio(double raggio) {
        // Imposta la variabile 'dimensione' della super-classe.
        this.setDimensione(raggio);
    }

    // Getter pubblico per il raggio del cerchio.
    public double getRaggio() {
        // Richiedi il valore della variabile 'dimensione' dalla super-classe.
        return this.getDimensione();
    }

    @Override
    public double getPerimetro() {
        // Specializzazione per il calcolo del perimetro del cerchio.
        return this.getRaggio() * 2 * Math.PI;
    }

    @Override
    public String toString() {
        // Specializzazione di toString() per il cerchio.
        return "Cerchio con raggio " + this.getRaggio();
    }
}
