package src;

//this method can be used to remove a table if deemed necessary
import java.sql.SQLException;
import java.sql.Statement;

public class removeTable extends updateDB {

    public removeTable(String s) {
        Statement statement = null;
        try {
            statement = conn.createStatement();
            statement.addBatch("DROP TABLE " + s);
        } catch (SQLException ex) {
            System.out.println("SQLException removeTable " + ex);
        }

        updateDB(statement);
    }
}
