package figurageometrica__;

/**
 *
 * @author marko.mirkovic
 * @version 19 September 2022
 */
public class ZZZMain 
{
    public static void main(String[] args)
    {
        //abstract, can not be istantiated
        //per poter instanziare una classe 
        //FiguraGeometrica fg = new FiguraGeometrica(0,0,0);
        

//debugging
        //andiamo nel costruttore quadrato
        //step over
        //Figura geometrica
        //object
        //private
        Quadrato q = new Quadrato(9, -5, 15.5);
        
        q.setLato(16.2);
        
        double d = q.getLato();
        
        
    }
}
