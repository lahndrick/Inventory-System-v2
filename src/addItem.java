package src;

//This method adds an item object to the inventory database by getting all the relevant information from the object and using it in a mysql statement
import java.sql.SQLException;
import java.sql.Statement;

public class addItem extends updateDB {

    Statement statement = null;

    public addItem(Item item) {
        try {
            String skuCode = item.getSkuCode();
            String location = item.getLocation();
            int quantity = item.getQuantity();
            String barcode = item.getBarcode();

            statement = conn.createStatement();
            statement.addBatch("INSERT INTO APP.ITEM (barcode,location,skucode,quantity)"
                    + "VALUES (" + skuCode + ", " + location + ", " + quantity + ", " + barcode + ")");

            update();

        } catch (SQLException ex) {
            System.out.println("SQLException" + ex);
        }
    }

    public void update() {
        init(statement);
    }

/* FOR TESTING
    public static void main(String[] args) {
        Item item = new Item("sku15", "bar15", "loc15", 15);
        
        addItem addItem = new addItem(item);
        addItem.update();
    }
*/
}
