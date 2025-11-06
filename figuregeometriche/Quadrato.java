package figuregeometriche;

/**
 * Quadrato
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class Quadrato extends FiguraGeometricaRegolare
{
    public Quadrato(double x, double y, double lato)
    {
        super(x, y, lato);  //lato===dimensione
    }
    
    //Solo per il quadrato definisco due metodi specifici per il lato
    public void setLato(double lato)
    {
        super.setDimensione(lato);
    }
    
    public double getLato()
    {
        return this.getDimensione();
    }
    
    @Override
    public double perimetro()
    {
        return(this.getDimensione()*4);
    }
    
    @Override
    public String toString()
    {
        return("Quadrato. " + super.toString());
    }
}
