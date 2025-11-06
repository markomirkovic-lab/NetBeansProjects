package figurageometrica__;

/**
 *
 * @author marko.mirkovic
 * @version 19 September 2022
 */
public class Rettangolo
{
    private double altezza; //2 lato 
    
    public Rettangolo(int x, int y, double base, double lato)
    {
        super(x, y, lato, lato);
        //this.altezza = altezza;
    }
    
    
    
    
    // Setter pubblico per la base del rettangolo.
    public void setLato(double lato)
    {
        //Imposta la variable 'dimensione' della super-classe
        
        
        this.setBase(lato); // this.setDimensione(lato);
        this.setAltezza(lato);
    }
    
    // Getter pubblico per la base del rettangolo
    public double getBase()
    {
        // Richiedi il valore della variable 'dimensione' della super-classe
        return this.getDimensione();
    }
    
    // Setter pubblico per l'altezza del triangolo
    public void setAltezza(double altezza)
    {
        this.altezza = altezza;
    }

    // Getter pubblico per l'altezza del rettangolo
    public double getAltezza()
    {
        return this.altezza;
    }

   
    // Perimentro del rettangolo
    // @Override
    public double getPerimetro()
    {
        // Specializzazione del calcolo del perimetro
        return ( this.getBase() + this.getAltezza() ) * 2;
        
    }
    
    @Override
    public String toString()
    {
        
    }
    
    // 
    
    
    
    
}
