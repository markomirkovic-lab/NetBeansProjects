package figuregeometriche;

/**
 *
 * @author marko.mirkovic
 * @version 18 September 2022
 */
public class ZZZMain 
{
    public static void main(String[] args)
    {
        FiguraGeometricaRegolare fgm=new FiguraGeometricaRegolare(100,100,23);
        Cerchio c = new Cerchio(150,150,12.7);
        Quadrato q = new Quadrato(134, 123, 3);
        TriangoloEquilatero t = new TriangoloEquilatero(200, 200, 4.78);
        
        System.out.println("fgm: " + fgm);
        
        System.out.println(c);
        System.out.println(c.getRaggio() + ". " + c.perimetro());
        
        System.out.println(q);
        System.out.println(q.getLato() + ". " + q.perimetro());
        
        System.out.println(t);
        System.out.println(t.getLato() + ". " + t.perimetro());
        
        /*
        run-single:
        fgm: Dimensione: 23.0 e centro [100.0;100.0]
        Cerchio. Dimensione: 12.7 e centro [150.0;150.0]
        12.7. 506.7074790974977
        Quadrato. Dimensione: 3.0 e centro [134.0;123.0]
        3.0. 12.0
        Triangolo equilatero. Dimensione: 4.78 e centro [200.0;200.0]
        4.78. 14.34
        */
        
    }
}
