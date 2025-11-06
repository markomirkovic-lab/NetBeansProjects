package interface_veicolo;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public class Automobile implements VeicoloBenzina
{
    //dovremmo scrivere tutti i metodi imposti dall'interfaccia
    
    @Override
    public void accelera(int velocita) {}
    
    @Override
    public void frena(int velocita) {}
    
    @Override
    public boolean sterza(int direzione, int gradi) {
        return false;
    }
    
    @Override
    public void failIlPieno(int litri) {}
}
