package src;

import java.sql.SQLException;
import java.sql.Statement;

public class addColumn extends updateDB {

    Statement statement = null;

    //standard constructor that will be used
    public addColumn(String tableName, String columnName) {
        try {
            statement = conn.createStatement();
            statement.addBatch("ALTER TABLE " + tableName + " ADD " + columnName + " VARCHAR(50)");

        } catch (SQLException ex) {
            System.out.println("SQLException, addTable ");
        }
    }

    //similar to standard constructor but used for columns that store integers
    public addColumn(String tableName, String columnName, String intColumn) {
        try {
            statement = conn.createStatement();
            statement.addBatch("ALTER TABLE " + tableName + " ADD " + columnName + " INT");

        } catch (SQLException ex) {
            System.out.println("SQLException, addTable ");
        }
    }

    public void update() {
        updateDB(statement);
    }

    /* FOR TESTING
    public static void main(String[] args) {
        addColumn addColumn;    
        
        addColumn = new addColumn("ITEM", "barcode");
        addColumn.update();

        addColumn = new addColumn("ITEM", "location");
        addColumn.update();

        addColumn = new addColumn("ITEM", "skucode");
        addColumn.update();

        addColumn = new addColumn("ITEM", "quantity", "int");
        addColumn.update();
    }
    */
}
