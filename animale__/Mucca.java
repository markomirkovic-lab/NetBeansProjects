package animale__;

/**
 *
 * @author Neil Otupacca
 */
public class Mucca extends Animale implements IErbivoro {

    public Mucca(String nome, String specie, double peso) {
        // Inoltra alla super-classe i valori degli argomenti.
        super(nome, specie, "Muggito", peso);
    }

    @Override
    public void mangiaErba() {
        // Implementazione dell'azione "mangia erba" ....
    }
}
