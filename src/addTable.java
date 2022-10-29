package src;

//this method can be used to create a new table if deemed necessary
import java.sql.SQLException;
import java.sql.Statement;

public class addTable extends updateDB {

    int tableNum = 0;
    
    public addTable(String s) {

        try {
            
            Statement statement = conn.createStatement();
            statement.addBatch("CREATE TABLE " + s + "(key " + tableNum + ")");
            tableNum++;
            
            updateDB(statement);
        } catch (SQLException ex) {
            System.out.println("SQLException, addTable ");
        }
    }
}
