package Car;

/**
 * Car class
 * @author marko.mirkovic
 * @version 05.09.2022
 */
public class Car
{

    private int cc;
    private String modello;

    public Car(int cc, String modello) throws IllegalArgumentException
    {
        if ( cc >= 500 && cc <= 3000 )
        {
            this.cc = cc;
        } 
        else
        {
            throw new IllegalArgumentException("Cilindrata errata");
            
        }
        
        if( modello == null || modello.isBlank() )
        {
            throw new IllegalArgumentException("Modello errato");
        }
        else
        {
            this.modello = modello;
        }
        
        
    }

    public int getCilindrata()
    {
        return cc;
    }
    
    public String getModello()
    {
        return modello;
    }

    public void setCilindrata(int cc) throws IllegalArgumentException
    {
        if (cc >= 500 && cc <= 3000)
        {
            this.cc = cc;
        } 
        else
        {
            throw new IllegalArgumentException();
        }
    }
    
    public void setModello(String modello) throws IllegalArgumentException
    {
        if ( modello == null || modello.isBlank() )
        {
            throw new IllegalArgumentException();
        } 
        else
        {
            this.modello = modello;
        }
    }
}

//prima di instanziare un oggetto fare controllo sul valore
//le stringle vanno controllate che non sono vuote o null
