package src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class queryDB extends connectionManager {

    /*
    * this method is used to send a query to the database and get a ResultSet back
    * not to be confused with an update of the database which does not return anything
    */
    public ResultSet queryDB(String sql) {

        Connection connection = this.getDBConnection();
        Statement statement;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultSet;
    }
}
