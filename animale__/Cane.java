package animale__;

/**
 *
 * @author Neil Otupacca
 */
public class Cane extends Animale implements IErbivoro, ICarnivoro {

    public Cane(String nome, String specie, double peso) {
        // Inoltra alla super-classe i valori degli argomenti.
        super(nome, specie, "Ringhia", peso);
    }

    @Override
    public void mangiaErba() {
        // Implementazione dell'azione "mangia erba" ....
    }

    @Override
    public void mangiaAnimale(Animale a) throws Exception {
        // Il parametro 'a' deve essere un'istanza di una classe che implementa
        // l'interfaccia IErbivoro, altrimenti viene lanciata un'eccezione.
        if (!(a instanceof IErbivoro)) {
            throw new Exception("Puoi mangiare solo animali erbivori");
        }

        // Implementazione dell'azione "mangia animale" ....
    }
}
