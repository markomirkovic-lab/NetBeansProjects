package personDBTable;

/**
 *
 * @author Neil Otupacca
 * @version 27 November 2021
 */
public class IdFirstnameItem {

    private int id;
    private String firstname;

    public IdFirstnameItem(int id, String firstname) {
        this.id = id;
        this.firstname = firstname;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /** Stringa utilizzata dalla JTable per la visualizzazione il testo
     * della cella.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.firstname;
    }
}
