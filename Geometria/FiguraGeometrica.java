package Geometria;

/**
 *
 * @author marko.mirkovic
 * @version 26 September 2022
 */
public class FiguraGeometrica 
{
    private double x;
    private double y;
    
    public FiguraGeometrica(double x, double y)
    {
        this.setX(x);//chima la setX dell'oggetto che stai trattando
        this.setY(y);
    }
    
    final public void setX(double x)
    {
        this.x = x;
    }
    
    final public void setY(double y)
    {
        this.y = y;
    }
    
    final public double getX()
    {
        return(this.x);
    }
    
    final public double getY()
    {
        return(this.y);
    }
    
    @Override
    public String toString()
    {
        return "x: " + this.getX() + ". y: " + this.getY();
    }
    

    
    
    //
    

}
