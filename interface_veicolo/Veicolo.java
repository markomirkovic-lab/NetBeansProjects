
package interface_veicolo;

/**
 *
 * @author marko.mirkovic
 * @version
 */
public interface Veicolo 
{
    //Classi vuote, senza variabili
    //con dichiarazione dei metodi pubblici che dovranno essere contenuti
    //Scopo: definire un protocollo di comportamento che deve essere fornito
    //       da una qualsiasi chlase che implementa una data interfaccia
    public void accelera(int velocita);
    public void frena(int velocita);
    public boolean sterza(int direzione, int gradi);
}

