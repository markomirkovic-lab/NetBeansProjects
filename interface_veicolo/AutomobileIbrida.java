
package interface_veicolo;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public class AutomobileIbrida implements VeicoloBenzina, VeicoloElettrico
{
    @Override
    public void accelera (int velocita) {}
    
    @Override
    public void frena(int velocita) {}
    
    @Override
    public boolean sterza(int direzione, int gradi) {
        return false;
    }
    
    @Override
    public void failIlPieno(int litri) {}
    
    @Override
    public void attaccaLaSpina(int ampere) {}
            
}
