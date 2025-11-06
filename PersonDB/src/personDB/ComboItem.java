package personDB;

/** Classe per gli oggetti inseriti in un comboBox.
 *  La classe contiene nome e cognome della Person.
 *
 * @author Neil Otupacca
 * @version 15 November 2021
 */
@SuppressWarnings("EqualsAndHashcode")
public class ComboItem {

    private final String firstname, lastname;

    public ComboItem(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    /** Stringa utilizzata dal comboBox per la visualizzazione delle sue entries.
     * 
     * @return 
     */
    @Override
    public String toString() {
        return this.lastname + "; " + this.firstname;
    }

    /** Il metodo equals() viene utilizzato per il confronto quando si invoca
     *  il metodo setSelectedItem() del comboBox.
     *
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        // Se obj non è un'istanza della classe ComboItem, ritorna false (not equals).
        if (!(obj instanceof ComboItem)) return false;

        // Confronta nome e cognome di this e obj.
        ComboItem ci = (ComboItem) obj;
        return this.firstname.equals(ci.firstname) &&
               this.lastname.equals(ci.lastname);
    }
}
