package figuraGeometrica;

/**
 *
 * @author Neil Otupacca
 * @version 19 September 2022
 */
public class Rettangolo extends FiguraGeometrica {

    private double altezza;

    public Rettangolo(int x, int y, double base, double altezza) {
        super(x, y, base);

        // FiguraGeometrica implementa solo la variabile 'dimensione' nella
        // quale abbiamo assegnato la misura della base del rettangolo (vedi
        // statement super precedente).
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.setDimensione(base);
    }

    public double getBase() {
        return this.getDimensione();
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getAltezza() {
        return this.altezza;
    }

    @Override
    public double getPerimetro() {
        // Specializzazione per il calcolo del perimetro del rettangolo.
        // Nota: se i dati si riferiscono ad un quadrato, allora base e altezza
        //       sono identici.
        return (this.getBase() + this.getAltezza()) * 2;
    }

    @Override
    public String toString() {
        // Specializzazione di toString() per il rettangolo.
        return "Rettangolo con base " + this.getBase() + " e altezza " +
               this.getAltezza();
    }
}
