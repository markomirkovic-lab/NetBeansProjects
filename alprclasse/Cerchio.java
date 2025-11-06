package alprclasse;

/**
 *
 * @author marko.mirkovic
 * @version 17 October 2022
 */
public class Cerchio 
{
    static final double PI = 3.141592653589793;
    private double raggio;
    
    
    //Metodi statici
    
    public static double getCirconferenza(double raggio)
    {
        return 2.0 * PI * raggio;
    }
    
    public static double getArea(double raggio)
    {
        return PI * raggio * raggio;
    }
    
    
    //Metodi di istanza
    
    public Cerchio(double raggio)
    {
        this.raggio = raggio;
    }
    
    public double getCirconferenza()
    {
        return 2 * PI * this.raggio;
    }
    
    public double getArea()
    {
        return PI * this.raggio * this.raggio;
    }
    
}
