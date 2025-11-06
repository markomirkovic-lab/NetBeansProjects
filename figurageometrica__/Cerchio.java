package figurageometrica__;

/**
 *
 * @author marko.mirkovic
 * @version 19 September 2022
 */
public class Cerchio extends FiguraGeometrica
{
    //
    public Cerchio(int x, int y, double raggio)
    {
        //inoltra alla super-clase i valori degli argomenti
        super(x, y, raggio); //raggio === dimensione
    }
    
    //Setter pubblico per il raggio del cerchio
    public void setRaggio(double raggio)
    {
        //Imposta la variable 'dimensione' della super-classe.
        this.setDimensione(raggio);
        
    }
    
    //Getter pubblico
    
    // Getter pubblico per il raggio del cerchio
    public double getRaggio()
    {
        // Richiedi il valore della variabile 'dimensione'' della super-class
        return this.getDimensione;
    }

    
    // Perimetro del cerchio.
    @Override
    public double getPerimetro()
    {
        // Specializzazione per il calcolo del perimetro del cerchio.
        return this.getRaggio() * 2 * Math.PI;
    }
    
    //@Override
    
    
    
    /*
    @Override
    public double getPerimetro()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */
    
    
    
    
    

}
