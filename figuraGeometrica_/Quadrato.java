package figuraGeometrica_;

/**
 *
 * @author Neil Otupacca
 */

//  Quadrato IS A rettangolo
public class Quadrato extends Rettangolo {

    public Quadrato(int x, int y, double lato) {
        // Inoltra alla super-classe i valori degli argomenti.
        super(x, y, lato, lato);// x, y, base, aletezza del rettangolo
    }

    // Setter pubblico per il lato del quadrato.
    public void setLato(double lato) {
        // Imposta la variabile 'dimensione' e altezza della super-classe.
        this.setBase(lato);
        this.setAltezza(lato);
    }

    // Getter pubblico per il lato del quadrato.
    public double getLato() {
        // Richiedi il valore della variabile 'dimensione' della super-classe.
        return this.getBase();
    }

    @Override
    public String toString() {
        // Specializzazione di toString() per il quadrato.
        return "Quadrato con lato " + this.getLato();
    }
}
