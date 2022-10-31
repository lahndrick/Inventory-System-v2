package src;

//this method can be used to create a new table if deemed necessary
import java.sql.SQLException;
import java.sql.Statement;

public class addTable extends updateDB {

    Statement statement = null;

    public addTable(String s) {

        try {
            statement = conn.createStatement();
            statement.addBatch("CREATE TABLE " + s + "(tableNum INT)");

            updateDB(statement);
        } catch (SQLException ex) {
            System.out.println("SQLException, addTable ");
        }
    }

    public void update() {
        updateDB(statement);
    }

    /* FOR TESTING
    public static void main(String[] args) {
        addTable addTable = new addTable("ITEM");
        addTable.update();
    }
     */
}
