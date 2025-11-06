
package cap2eserciziclassi1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laurent Bonvin
 */
public class GestoreAuto {
    public static void main(String[] args) {
        List<Automobile> a=new ArrayList<>();
        a.add(new Automobile("BMV","M3",TipoAuto.GT));
        a.add(new Automobile("Porsche","Cayenne",TipoAuto.SUV));
        a.add(new Automobile("Dodge","Ram",TipoAuto.PICKUP));
        a.add(new Automobile("Smart","EQ fortwo",TipoAuto.CITYCAR));
        a.add(new Automobile("Mercedes-Benz","Limousine",TipoAuto.LIMOUSINE));
        a.add(new Automobile("Lexus","NX Hybrid",TipoAuto.BERLINA));
        a.add(new Automobile("Porsche","Carrera Cabriolet",TipoAuto.CABRIO));
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
            
        }
    }
    
}
