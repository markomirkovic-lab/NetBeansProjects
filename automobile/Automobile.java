package automobile;

/**
 *
 * @author Neil Otupacca
 */
public class Automobile {

    private String marca, modello;
    private int cilindrata;

    ////////////////////////////////////////////////////////////////////////////
    // Eccezionalmente, utilizzo l'italiano per i nomi dei metodi, delle
    // variabili e della classe.

    public Automobile(String marca, String modello, int cilindrata)
            throws Exception {
        // Delega ai metodi _setMarca(), _setModello() e _setCilindrata()
        // il controllo dei valori passati al costruttore e l'eventuale
        // generazione di una exception.
        _setMarca(marca);
        _setModello(modello);
        _setCilindrata(cilindrata);
    }

    public String getMarca() {
        return this.marca;
    }

    // Questo metodo non può essere sovrascritto (override) perché è privato,
    // quindi può essere richiamato dal costruttore senza "pericoli".
    // Il carattere underscore '_' non ha nessun significato particolare,
    // è un carattere valido come qualsiasi altro e serve solo a differenziare
    // il nome rispetto all'omonimo metodo di istanza pubblico (senza underscore).
    // Nota: se un metodo dovesse essere forzatamente pubblico, può essere reso
    //       non sovrascrivibile tramite la keyword final.
    private void _setMarca(String marca) throws Exception {
        if (marca == null || marca.isBlank()) {
            throw new Exception("Marca invalida");
        }

        this.marca = marca;
    }

    // Delega al metodo _setMarca() il controllo del valore passato e
    // l'eventuale generazione di una exception.
    // Questo metodo può essere sovrascitto senza problemi.
    public void setMarca(String marca) throws Exception {
        _setMarca(marca);
    }

    public String getModello() {
        return this.modello;
    }

    private void _setModello(String modello) throws Exception {
        if (modello == null || modello.isBlank()) {
            throw new Exception("Modello invalido");
        }

        this.modello = modello;
    }

    // Delega al metodo _setModello() il controllo del valore passato e
    // l'eventuale generazione di una exception.
    // Questo metodo può essere sovrascitto senza problemi.
    public void setModello(String modello) throws Exception {
        _setModello(modello);
    }

    public int getCilindrata() {
        return this.cilindrata;
    }

    private void _setCilindrata(int cilindrata) throws Exception {
        if (cilindrata < 500 || cilindrata > 3000) {
            throw new Exception("Cilindrata non supportata");
        }

        this.cilindrata = cilindrata;
    }

    // Delega al metodo _setCilindrata() il controllo del valore passato e
    // l'eventuale generazione di una exception.
    // Questo metodo può essere sovrascitto senza problemi.
    public void setCilindrata(int cilindrata) throws Exception {
        _setCilindrata(cilindrata);
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", modello: " + modello +
               ", cilindrata: " + cilindrata + ".";
    }
}
