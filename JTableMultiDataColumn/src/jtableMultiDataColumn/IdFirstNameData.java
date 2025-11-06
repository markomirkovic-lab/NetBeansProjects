package jtableMultiDataColumn;

/**
 *
 * @author Neil Otupacca
 * @version 21 November 2022
 */
public class IdFirstNameData {

    private final int id;
    private final String firstName;

    public IdFirstNameData(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    /** Stringa utilizzata dalla JTable per visualizzare il contenuto delle
     *  celle della prima colonna.
     * 
     * @return 
     */
    @Override
    public String toString() {
        // L'id non viene visualizzato, solo il firstName.
        return this.firstName;
    }
}
