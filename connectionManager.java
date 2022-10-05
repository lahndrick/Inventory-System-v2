
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionManager {

    private static final String USER_NAME = "pdc";
    private static final String PASSWORD = "pdc";
    private static final String URL = "INSERT DATABASE URL HERE";
    Connection conn;

    //default constructor
    public connectionManager() {
        establishConnection();
    }

    //returns the connection
    public Connection getConnection() {
        return this.conn;
    }

    //establishes a connection to the database
    public final void establishConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
        } catch (SQLException ex) {
            System.err.println("SQLException: " + ex.getMessage());
        }
    }

    //closes the connection to a database if there is one
    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
