package src;

//this class sends a query to the database, then uses the resulting ResultSet to create a new array containing all the items
import java.sql.*;

public class loadInv extends Inventory {

    private String query;
    private ResultSet rs;
    private queryDB qDB;

    public loadInv() {
        query = "SELECT * FROM ITEM";
        rs = null;
        inventory = null;
        qDB = new queryDB();
    }

    public void update() {
        try {
            rs = qDB.init(query);
            
            if(inventory != null) inventory.clear();

            while (rs.next()) {
                rs.getRow();
                String location = rs.getString("Location");
                String barcode = rs.getString("barcode");
                String skuCode = rs.getString("skucode");
                int quantity = rs.getInt("barcode");
                
                inventory.add(new Item(skuCode,barcode,location,quantity));
            }

        } catch (SQLException ex) {
            System.out.println("SQLException loadInv " + ex);
        }
    }
}
