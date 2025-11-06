package testconnection;

/**
 * Test Connection
 * @author marko.mirkovic
 * @version 21 November 2022
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestConnection {

    public static void main(String[] args) {
        try {
            Class.forName("org.sqlite.JDBC");
            try ( Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db")) {

            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }
}
