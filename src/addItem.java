package src;

//This method adds an item object to the inventory database by getting all the relevant information from the object and using it in a mysql statement

import java.sql.SQLException;
import java.sql.Statement;

public class addItem extends updateDB {

    public addItem(Item item) {
        try {
            String skuCode = item.getSkuCode();
            String location = item.getLocation();
            int quantity = item.getQuantity();
            String barcode = item.getBarcode();
            
            Statement statement = conn.createStatement();
            statement.addBatch("INSERT INTO ITEM (skucode, location, quantity, barcode)");
            statement.addBatch("VALUES (" + skuCode + ", " + location + ", " + quantity + ", " + barcode + ");");
            
            updateDB(statement);
            
        } catch (SQLException ex) {
            System.out.println("SQLException" + ex);
        }
    }

/* for testing:
    public static void main(String[] args) {
        Item item = new Item();
        item.setBarcode("15652");
        item.setLocation("Loc15");
        item.setQuantity(15);
        item.setSkuCode("165");

        new addItem(item);
    }
*/
}
