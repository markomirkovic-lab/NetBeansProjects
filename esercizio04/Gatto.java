
package esercizio04;

/**
 *
 * @author marko.mirkovic
 * @version
 */

public class Gatto extends Animale implements Carnivoro
{

    public Gatto(String nome, String specie, String verso, int peso)
    {
        super(nome, specie, verso, peso);
    }
    
    
    @Override
    public void mangiaAnimale(Animale a) throws Exception
    {
        if(a instanceof Erbivoro)
        {
            System.out.println("Mangio");
        }
        else
        {
         throw new Exception("Non mangio");        
        }
        
        
    }
}
