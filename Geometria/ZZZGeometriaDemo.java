package Geometria;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marko.mirkovic
 * @version 26 September 2022
 */
public class ZZZGeometriaDemo 
{
    public static void stampa(FiguraGeometrica tmp)
    {
        System.out.println(tmp);
    }
    
    public static void main(String[] args)
    {
        FiguraGeometrica fg = new FiguraGeometrica(2,3);
        
        System.out.println(fg);
        
        Cerchio c = new Cerchio(5,7, 2.5);
        System.out.println(c);
        
        /*
        Senza to string:
        Geometria.FiguraGeometrica@372f7a8d
        Geometria.Cerchio@28a418fc
        */
        
        ArrayList<Integer> a = new ArrayList();
        List<Integer> a1;
        //a1 = new List();  can not be instanced
        
        new FiguraGeometrica(2.3, 4.7)
        {
            
        };
        
//        new FiguraGeometrica(2.0, 4.0)
//        {
//            @Override
//            public void setX(double x)
//            {
//
//            }
//        };
        
        //creando al volo una figura geometrica
        //classe annonima, non ha nome
        //eccezione di comportamento per questo punto
        stampa( 
                new FiguraGeometrica(2.3, 4.7)
        {
            public String toString()
            {
                return(super.toString() + "ecchetenefrega");
            }
        }
        );
        
    }
}
