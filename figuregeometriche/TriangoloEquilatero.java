package figuregeometriche;

/**
 *
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class TriangoloEquilatero extends FiguraGeometricaRegolare
{
    public TriangoloEquilatero(double x, double y, double lato)
    {
        super(x, y, lato); //lato === dimensione
    }
    
    public void setLato(double lato)
    {
        super.setDimensione(lato);
    }
    
    public double getLato()
    {
        return(this.getDimensione());
    }
    
    @Override
    public double perimetro()
    {
        return(this.getDimensione()*3);
    }
    
    @Override
    public String toString()
    {
        return("Triangolo equilatero. " + super.toString());
    }

}
