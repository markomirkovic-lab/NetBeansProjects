package TEST;

/**
 *
 * @author Tommaso
 */
public class IdNameItem {

    private int id;
    private String nome;

    public IdNameItem(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    /** Stringa utilizzata dalla JTable per la visualizzazione il testo
     * della cella.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.nome;
    }
}

