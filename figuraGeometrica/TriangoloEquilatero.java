package figuraGeometrica;

/**
 *
 * @author Neil Otupacca
 */
public class TriangoloEquilatero extends FiguraGeometrica {

    public TriangoloEquilatero(int x, int y, double lato) {
        // Inoltra alla super-classe i valori degli argomenti.
        // Il lato del triangolo viene memorizzato nella variabile 'dimensione'
        // della classe FiguraGeometrica (super-classe).
        super(x, y, lato);
    }

    // Setter pubblico per il lato del triangolo.
    public void setLato(double lato) {
        // Imposta la variabile 'dimensione' della super-classe.
        this.setDimensione(lato);
    }

    // Getter pubblico per il lato del triangolo.
    public double getLato() {
        // Richiedi il valore della variabile 'dimensione' della super-classe.
        return this.getDimensione();
    }

    @Override
    public double getPerimetro() {
        // Specializzazione per il calcolo del perimetro del triangolo equilatero.
        return this.getLato() * 3;
    }

    @Override
    public String toString() {
        // Specializzazione di toString() per il triangolo equilatero.
        return "Triangolo con lato " + this.getLato();
    }
}
