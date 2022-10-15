
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class updateDB extends connectionManager {

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
