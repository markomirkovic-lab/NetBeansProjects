package figuraGeometrica;

/**
 *
 * @author Neil Otupacca
 */
public class Quadrato extends Rettangolo {

    public Quadrato(int x, int y, double lato) {
        // Inoltra alla super-classe i valori degli argomenti.
        // Dato che un quadrato è un caso particolare di rettangolo, impostiamo
        // entrambi i valori della super-classe Rettangolo (base e altezza) con
        // lo stesso valore del lato del quadrato.
        super(x, y, lato, lato);
    }

    // Setter pubblico per il lato del quadrato.
    public void setLato(double lato) {
        // Imposta la variabile base e altezza della super-classe.
        // Nota: per rimanere un quadrato, base e altezza della super-classe
        //       Rettangolo devono rimanere identici.
        this.setBase(lato);
        this.setAltezza(lato);
    }

    // Getter pubblico per il lato del quadrato.
    public double getLato() {
        // Richiedi il valore della variabile 'dimensione' della super-classe.
        return this.getBase();
    }


    ////////////////////////////////////////////////////////////////////////////
    // Nota: non serve implementare il metodo getPerimetro() per il quadrato,
    //       lo stesso metodo ereditato dalla super-classe Rettangolo esegue
    //       già il calcolo corretto (base e altezza sono identici).
    ////////////////////////////////////////////////////////////////////////////


    @Override
    public String toString() {
        // Specializzazione di toString() per il quadrato.
        return "Quadrato con lato " + this.getLato();
    }
}
