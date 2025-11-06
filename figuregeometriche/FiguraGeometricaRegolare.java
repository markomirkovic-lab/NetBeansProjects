package figuregeometriche;

/**
 * Figure geometriche
 * E' una classe astratta, da sola non ha molto senso, ha senso quando
 * e' sottoclassata. Bisogna fare in modo che diventi astrata di modo
 * da non poter fare piu' new della FigureGeometriche (non si puo' piu'
 * istanziare la classe).
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class FiguraGeometricaRegolare 
{
    private double x;
    private double y;
    private double dimensione;
    
    
    public FiguraGeometricaRegolare(double x, double y, double dimensione)
    {
        this.__setX(x);
        this.__setY(y);
        this.__setDimensione(dimensione);
    }

    

    public double getX()
    {
        return(this.x);
    }
    
    private void __setX(double x)
    {
        this.x = x;
    }

    public void setX(double x)
    {
        this.__setX(x);
    }

    public double getY()
    {
        return(this.y);
    }
    
    private void __setY(double y)
    {
        this.y = y;
    }

    public void setY(double y)
    {
        this.__setY(y);
    }

    public double getDimensione()
    {
        return (this.dimensione);
    }
    
    private void __setDimensione(double dimensione)
    {
        this.dimensione = dimensione;
    }

    public void setDimensione(double dimensione)
    {
        this.__setDimensione(dimensione);
    }
    
    public double perimetro() throws Exception
    {
        throw new Exception("Figura indefinita");
    }
    
    @Override
    public String toString()
    {
        return("Dimensione: " + this.getDimensione() + " e centro [" + 
                this.getX() + ";" + this.getY() + "]");
    }
    
    

}
