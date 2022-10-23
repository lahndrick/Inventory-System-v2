package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionManager {

    private static final String URL = "jdbc:derby:inventoryDB;create=true";
    Connection conn;

    //default constructor
    public connectionManager() {
        establishConnection();
    }

    //returns the connection
    public Connection getDBConnection() {
        try {
            return conn.getMetaData().getConnection();
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
        
        return null;
    }

    //establishes a connection to the database
    public final void establishConnection() {
        try {
            conn = DriverManager.getConnection(URL);
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    public void closeConnection() {
        try {
            DriverManager.getConnection("jdbc:derby:inventoryDB;shutdown=true");
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }
}
