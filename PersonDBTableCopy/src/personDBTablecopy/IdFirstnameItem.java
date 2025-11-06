package personDBTablecopy;

/**
 *
 * @author Neil Otupacca
 * @version 27 November 2021
 */
public class IdFirstnameItem {

    private int id;
    private String name;

    public IdFirstnameItem(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Stringa utilizzata dalla JTable per la visualizzazione il testo
     * della cella.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.name;
    }
}
