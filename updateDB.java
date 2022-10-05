
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class updateDB extends connectionManager {

    /*
    * this method is used to update the database with the supplied string
    * not to be confused with a query to the database which will return a ResultSet
     */
    public void updateDB(String sql) {

        Connection connection = this.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();
            statement.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
