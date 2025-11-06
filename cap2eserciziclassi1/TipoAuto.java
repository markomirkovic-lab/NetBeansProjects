
package cap2eserciziclassi1;

/**
 *
 * @author Laurent Bonvin
 * @version 05.09.2022
 */
public enum TipoAuto {
    CABRIO, BERLINA, PICKUP, SUV, LIMOUSINE, GT, CITYCAR;
    
    @Override
    public String toString(){
        return name().charAt(0)+name().substring(1).toLowerCase();
    }
}
