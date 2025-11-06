package Geometria;

/**
 *
 * @author marko.mirkovic
 * @version 26 September 2022
 */
public class Cerchio extends FiguraGeometrica
{
    private double raggio;
    
    public Cerchio(double raggio)
    {
        super(0, 0);
        
        this.setRaggio(raggio);
    }
    
    //              or value  or value
    public Cerchio(double x, double y, double raggio)
    {
        super(x, y);
        
        this.setRaggio(raggio);
    }
    
    public void setRaggio(double r)
    {
        this.raggio = r;
    }
    
    public double getRaggio()
    {
        return(this.raggio);
    }
    
    public double perimetro()
    {
        return(this.getRaggio()*2*Math.PI);
    }
    
    @Override
    public String toString()
    {
        return super.toString() + ". r: " + this.getRaggio();
    }
    
    //
//    @Override
//    public void setX(double x)
//    {
//        super.setX(2*x);
//    }
}
