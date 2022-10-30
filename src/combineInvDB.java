//takes the elements from inventory class and adds them to database
package src;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class combineInvDB extends Inventory {

    private String[] parseString;
    public String barcode;
    public String location;
    public String skuCode;
    public int quantity;
    private Object[] itemList;
    private connectionManager cm;
    private addItem addItem;

    public combineInvDB() {
        itemList = new Object[inventory.size()];
        
        for (int x = 0; x < inventory.size(); x++) {
            barcode = inventory.get(x).getBarcode();
            location = inventory.get(x).getLocation();
            skuCode = inventory.get(x).getSkuCode();
            quantity = inventory.get(x).getQuantity();
            
            //create the parseString info here that will be used for update(String[] s) method
        }
    }

    //use the parseString variable here to add into database
    public void update(String[] s) {
        for(int x = 0; x < inventory.size();x++) {
            new updateDB(new Item(barcode,location,skuCode,quantity));
        }
    }
}
