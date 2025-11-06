package figuregeometriche;

/**
 *
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class Cerchio extends FiguraGeometricaRegolare
{
    public Cerchio(double x, double y, double raggio)
    {
        super(x, y, raggio);//raggio === dimensione
    }
    
    public void setRaggio(double raggio)
    {
        super.setDimensione(raggio);
    }
    
    public double getRaggio()
    {
        return(this.getDimensione());
    }
    
    @Override
    public double perimetro()
    {
        return(this.getDimensione()*this.getDimensione()*Math.PI);
    }
    
    @Override
    public String toString()
    {
        return("Cerchio. " + super.toString());
    }
    
}
