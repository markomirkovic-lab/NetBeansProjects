package figurageometrica__;

/**
 *
 * @author marko.mirkovic
 * @version 19 September 2022
 */
public class Quadrato extends Rettangolo
{
    
    private double altezza;
    
    public Rettangolo(int x, int y, double base, double altezza)
    {
        super(x, y, base);
        this.alteza = altezza;
    }
    
    
    
    
    // Setter pubblico per la base del rettangolo
    public void setBase(double base)
    {
        //Imposta la variable 'dimensione' della super-classe
        this.setDimensione();
    }
    
    
    // Getter pubblico per la base del rettangolo
    public double getBase()
    {
        //Richiedi il valore della variable 'dimensione' della super-classe
        return this.getDimensione();
    }

    //Setter pubblico per la base del rettangolo.
    public void setAltezza(double altezza)
    {
        this.altezza = altezza;
    }
    
    // Getter pubblico per la base del rettangolo.
    public double getLato()
    {
        return this.lato;
    }
    
    @Override
    public String toString()
    {
        // Specializzaizione di toString() per il quadrato.
        return "Quadrato con lato  " + this.getLato();
        
    }
    
}
