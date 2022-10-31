package src;

//this method can be used to remove a table if deemed necessary
import java.sql.SQLException;
import java.sql.Statement;

public class removeTable extends updateDB {

    Statement statement = null;
    
    public removeTable(String s) {
        try {
            statement = conn.createStatement();
            statement.addBatch("DROP TABLE " + s);
        } catch (SQLException ex) {
            System.out.println("SQLException removeTable " + ex);
        }
    }

    public void update() {
        updateDB(statement);
    }

    /* FOR TESTING
    public static void main(String[] args) {
        removeTable removeTable = new removeTable("ITEM");
        removeTable.update();
    }
*/
}
