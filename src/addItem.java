package src;

//This method adds an item object to the inventory database by getting all the relevant information from the object and using it in a mysql statement

public class addItem extends updateDB {

    int id = 0;

    public addItem(Item item) {
        String skuCode = item.getSkuCode();
        String location = item.getLocation();
        int quantity = item.getQuantity();
        String barcode = item.getBarcode();

        String statement = "INSERT INTO ITEM (\'sku code\',\'location\',\'quantity\',\'barcode\',\'id\')"
                + " VALUES (\'" + skuCode + "\',\'" + location + "\',\'" + quantity
                + "\',\'" + barcode + "\',\'" + id + ");";
        id++;
        updateDB(statement);
    }

/*    
    
    to test if insert works:
    
    public static void main(String[] args){
        Item item = new Item();
        item.setBarcode("15652");
        item.setLocation("loc15");
        item.setQuantity(15);
        item.setSkuCode("165");
        
        new addItem(item);
    }
*/
}
