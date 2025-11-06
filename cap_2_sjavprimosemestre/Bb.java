package cap_2_sjavprimosemestre;

/**
 *
 * @author marko.mirkovic
 */
public class Bb {
    
    private String name;
    
    public Bb(String name)
    {
        this.name = name; 
        //this  e' necessario per differenziare tra nome name del parametro
        //e' dell'istanza
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
        //sempre this e' necessaro perche' il nome e' uguale
    }
}
