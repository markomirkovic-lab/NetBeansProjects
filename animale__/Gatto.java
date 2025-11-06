package animale__;

/**
 *
 * @author Neil Otupacca
 */
public class Gatto extends Animale implements ICarnivoro {

    public Gatto(String nome, String specie, double peso) {
        // Inoltra alla super-classe i valori degli argomenti.
        super(nome, specie, "Miagolio", peso);
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
