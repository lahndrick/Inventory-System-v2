package src;

import java.sql.*;

public class updateDB extends connectionManager {

    connectionManager cm;

    public void init(Statement statement) {
        try {
            cm = new connectionManager();
            cm.establishConnection();
            statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
