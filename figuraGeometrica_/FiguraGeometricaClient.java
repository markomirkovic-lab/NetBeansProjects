package figuraGeometrica_;

/**
 *
 * @author Neil Otupacca
 */
public class FiguraGeometricaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cerchio c = new Cerchio(10, 20, 2.6);
        System.out.println("Perimetro del cerchio: " + c.getPerimetro());

        Quadrato q = new Quadrato(15, -7, 4.52);
        System.out.println("Perimetro quadrato: " + q.getPerimetro());
        
        Rettangolo r = new Rettangolo(0,0,0,0);
        System.out.println("Perimetro rettangolo: " + r.getPerimetro());
        

        TriangoloEquilatero t = new TriangoloEquilatero(-2, 24, 3.35);
        System.out.println("Perimetro triangolo: " + t.getPerimetro());
        
        System.out.println("");
        printPerimetro(c);//va nel getPerimetro del cerchio
        printPerimetro(q);//va nel getPerimetro del rettangolo
        printPerimetro(r);//va nel getPerimetro del rettangolo
        printPerimetro(t);//va nel getPerimetro del triangolo equilatero
        
        //Aa aa = new Aa(); non posso istanziare
        
        //tasto destro
        //implement all abstract methods
        Aa aa = new Aa() {
            @Override
            public void m1(int i)
            {
                //questo va sostiuito con il vero codice
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public double m2()
            {
                //questo va sostiuito con il vero codice
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void m3(boolean b)
            {
                //questo va sostiuito con il vero codice
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
    }
    
    //(dati di reflection, chi sono io, whoami, )
    //usando la superclase possiamo vedere qualsiasi oggetto delle superclasse
    //vedendo anche le sotto-classi
    //getPerimetro() nella classe figura geometrica è astratto
    //casi particolari if(_ instanceOf()) .... 
    //case
    public static void printPerimetro(FiguraGeometrica fg)
        {
//            System.out.println("Perimetro: " + fg.getPerimetro()) ;
//            System.out.println("Classe: " + fg.getClass());
//            System.out.println("");
            // + "Classe: " + instanceOf(fg)
            System.out.println("Perimetro di " + fg.getClass().getSimpleName()
                    + ": " + fg.getPerimetro());
            
            
        }
}
