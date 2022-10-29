package src;

//this method can be used to create a new table if deemed necessary
import java.sql.SQLException;
import java.sql.Statement;

public class addTable extends updateDB {

    public addTable(String s) {

        try {
            Statement statement = conn.createStatement();
            statement.addBatch("CREATE TABLE " + s + "(random INT)");
            
            updateDB(statement);
        } catch (SQLException ex) {
            System.out.println("SQLException, addTable ");
        }
    }
}
