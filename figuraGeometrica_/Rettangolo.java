package figuraGeometrica_;

/**
 *
 * @author Neil Otupacca
 * @version 19 September 2022
 */
public class Rettangolo extends FiguraGeometrica {

    private double altezza;

    public Rettangolo(int x, int y, double base, double altezza) {
        super(x, y, base);
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.setDimensione(base);
    }

    public double getBase() {
        return this.getDimensione();
    }

    public void setAltezza(double altezza) {
        this.setAltezza(altezza);
    }

    public double getAltezza() {
        return this.altezza;
    }

    @Override
    public double getPerimetro() {
        return (this.getDimensione() + this.altezza) * 2;
    }
}
