package testConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Neil Otupacca
 */
public class TestConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Carica la classe "org.sqlite.JDBC" che implementa il driver SQLite.
            // La classe si trova nella libreria .jar aggiunta al progetto.
            Class.forName("org.sqlite.JDBC");

            // Apri il database contenuto nel file 'test.db' (nella root del
            // project), se 'test.db' non esiste, viene creato (vuoto).
            try (Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db")) {
                // Istanzia uno statement per la query di creazione della tabella
                // 'drinks', la tabella verrà creata solo se non esiste già.
                // Vedi condizione "IF NOT EXISTS" dello statement SQL.
                try (Statement stmt = conn.createStatement()) {
                    String sql = "CREATE TABLE IF NOT EXISTS `drinks` (" +
                                 " `id` INTEGER," +
                                 " `name` TEXT," +
                                 " `capacity` REAL," +
                                 " `price` REAL," +
                                 " PRIMARY KEY(`id`));";

                    // Esegue la query "CREATE TABLE IF NOT EXISTS".
                    stmt.executeUpdate(sql);
                }

                // Gestione del DB tramite interfaccia a linea di comando.
                // Al ritorno del metodo, quando l'utente inserisce il comando
                // "Exit", la connessione (conn) viene automaticamente chiusa.$
                // Passa l'istanza della connessione corrente al metodo.
                dbManager(conn);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Test Connection Error" + ex.getMessage());

            // Chiudi l'applicazione programmaticamente.
            System.exit(0);
        }
    }

    private static void dbManager(Connection conn) {
        // Istanzia lo scanner per l'acquisizione dei dati tramite tastiera.
        Scanner sc = new Scanner(System.in);

        boolean bLoop = true;

        while (bLoop) {
            // Visualizza il menu delle operazioni supportate.
            System.out.println();
            System.out.println("*************");
            System.out.println("* 1. SELECT *");
            System.out.println("* 2. INSERT *");
            System.out.println("* 3. UPDATE *");
            System.out.println("* 4. DELETE *");
            System.out.println("* 0. Exit   *\n");

            // Statement 'switch' per la scelta dell'utente.
            System.out.print("Select an operation: ");
            switch (sc.nextLine()) {
                case "0":
                    // Termina il programma.
                    bLoop = false;
                    break;

                case "1":  // SELECT.
                    doSelect(conn, sc);
                    break;

                case "2":  // INSERT.
                    doInsert(conn, sc);
                    break;

                case "3":  // UPDATE.
                    doUpdate(conn, sc);
                    break;

                case "4":  // DELETE.
                    doDelete(conn, sc);
                    break;

                default:
                    System.out.println("Unknown command.");
                    break;
            }
        }
    }

    private static void doSelect(Connection conn, Scanner sc) {
        System.out.println("\nExecute a SELECT statement.");

        // Inserisci l'eventuale condizione WHERE, se vuota, la clausola
        // WHERE non sarà inclusa nella query.
        System.out.print("Type your WHERE clause (or an empty string): ");
        String where = sc.nextLine().trim();

        // Query di SELECT (inizialmente: tutti i field e tutte le rows).
        String sql = "SELECT * FROM `drinks`";

        // Concatena l'eventuale clausola WHERE.
        // ATTENZIONE: il concatenamento non è sicuro e ci espone ad errori
        //             di sintassi e al SQL-Injection.
        //             In caso di applicazione reale (non didattica), si
        //             dovrà implementare un sistema più sicuro.
        if (where.length() > 0) sql += " WHERE " + where;

        try (Statement stmt = conn.createStatement()) {
            // Visualizza l'header con il nome dei field (colonne).
            System.out.println("\nid    name        cap     price");
            System.out.println("--------------------------------");

            // Esegui la query SELECT.
            try (ResultSet rs = stmt.executeQuery(sql)) {
                // Itera tutte le rows ritornate dalla query SELECT.
                // Il metodo next() ritorna false quando non ci sono più rows.
                while (rs.next()) {
                    // Visualizza i valori (colonne) delle rows.
                    System.out.println(String.format("%-4d  %-10s  %-6.2f  %-6.2f",
                                                     rs.getInt("id"),
                                                     rs.getString("name"),
                                                     rs.getDouble("capacity"),
                                                     rs.getDouble("price")));
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void doInsert(Connection conn, Scanner sc) {
        System.out.println("\nExecute an INSERT statement.");

        // Richiedi i valori dei field 'id', 'name', 'capacity' e 'price'
        // per la nuova row che si sta per creare.
        int id = getInteger(sc, "Type the `id` field value: ");

        System.out.print("Type the `name` field value: ");
        String name = sc.nextLine();

        double capacity = getDouble(sc, "Type the `capacity` field value: ");
        double price = getDouble(sc, "Type the `price` field value: ");

        // Statement di INSERT con 4 place-holder ('?'), vedi VALUES.
        String sql = "INSERT INTO `drinks` (`id`, `name`, `capacity`, `price`)" +
                     " VALUES (?, ?, ?, ?)";

        try (PreparedStatement pcmd = conn.prepareStatement(sql)) {
            // Imposta i valori dei 4 place-holder.
            // Il metodo setString() inserirà automaticamente i single-quote
            // che racchiudono la stringa SQL, inoltre eseguirà l'escaping
            // degli eventuali caratteri speciali (come il single-quote)
            // precedendoli con un back-slash (\).
            pcmd.setInt(1, id);
            pcmd.setString(2, name);
            pcmd.setDouble(3, capacity);
            pcmd.setDouble(4, price);

            // Esegui la query INSERT, la variabile 'inserted' sarà
            // impostata con il valore di ritorno del metodo executeUpdate()
            // corrispondente al numero di rows effettivamente inserite.
            // Trattandosi di un INSERT singolo, il valore di 'inserted'
            // sarà 1, in caso di violazione di una PK (o altro errore),
            // verrà lanciata una exception (vedi catch successivo).
            int inserted = pcmd.executeUpdate();
            System.out.println("Inserted rows: " + inserted);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void doUpdate(Connection conn, Scanner sc) {
        System.out.println("\nExecute an UPDATE statement.");

        // Richiedi i nuovi valori per i field 'name', 'capacity' e 'price'.
        // Richiedi inoltre il valore 'id' della row da modificare.
        int id = getInteger(sc, "Type the `id` field value to update (WHERE): ");

        System.out.print("Type the `name` field value: ");
        String name = sc.nextLine();

        double capacity = getDouble(sc, "Type the `capacity` field value: ");
        double price = getDouble(sc, "Type the `price` field value: ");

        // Statement di UPDATE con 4 place-holder ('?').
        String sql = "UPDATE `drinks` SET `name` = ?, `capacity` = ?, `price` = ?" +
                     " WHERE `id` = ?";

        try (PreparedStatement pcmd = conn.prepareStatement(sql)) {
            // Imposta i valori dei 4 place-holder.
            // Il metodo setString() inserirà automaticamente i single-quote
            // che racchiudono la stringa SQL, inoltre eseguirà l'escaping
            // degli eventuali caratteri speciali (come il single-quote)
            // precedendoli con un back-slash (\).
            pcmd.setInt(4, id);
            pcmd.setString(1, name);
            pcmd.setDouble(2, capacity);
            pcmd.setDouble(3, price);

            // Esegui la query UPDATE, la variabile 'updated' sarà
            // impostata con il valore di ritorno del metodo executeUpdate()
            // corrispondente al numero di rows effettivamente aggiornate.
            // Dato che la clausola WHERE specifica la condizione di uguaglianza
            // con il campo `id` (la PK), 'updated' potrà assumere solo il valore
            // 1 (row modificata) oppure 0 (nessuna row esistente con il valore
            // di `id` specificato.
            int updated = pcmd.executeUpdate();
            System.out.println("Updated rows: " + updated);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void doDelete(Connection conn, Scanner sc) {
        System.out.println("Execute a DELETE statement.");

        // Richiedi l'inserimento del valore 'id' della row da eliminare.
        int id = getInteger(sc, "Type the `id` field value to delete (WHERE): ");

        String sql = "DELETE FROM `drinks` WHERE `id` = ?";

        try (PreparedStatement pcmd = conn.prepareStatement(sql)) {
            // Imposta il valore del primo e unico place-holder ('?').
            pcmd.setInt(1, id);

            // Esegui la query DELETE, la variabile 'deleted' sarà
            // impostata con il valore di ritorno del metodo executeUpdate()
            // corrispondente al numero di rows effettivamente eliminate.
            int deleted = pcmd.executeUpdate();
            System.out.println("Deleted rows: " + deleted);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int getInteger(Scanner sc, String msg) {
        // Acquisisci un valore intero, continua a richiedere un valore
        // corretto in caso di exception (InputMismatchException).
        int val = 0;

        while (true) {
            try {
                System.out.print(msg);
                val = sc.nextInt();
                sc.nextLine();  // Svuota il buffer.
                break;  // Esci da while(true).
            }
            catch (InputMismatchException ex) {
                sc.nextLine();  // Svuota il buffer.
                System.out.println("Please type an integer value !!!");
            }
        }

        return val;
    }

    private static double getDouble(Scanner sc, String msg) {
        // Acquisisci un valore double, continua a richiedere un valore
        // corretto in caso di exception (InputMismatchException).
        double val = 0.0;

        while (true) {
            try {
                System.out.print(msg);
                val = sc.nextDouble();
                sc.nextLine();  // Svuota il buffer.
                break;  // Esci da while(true).
            }
            catch (InputMismatchException ex) {
                sc.nextLine();  // Svuota il buffer.
                System.out.println("Please type a double value !!!");
            }
        }

        return val;
    }
}
