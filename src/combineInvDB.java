//takes the elements from inventory class and adds them to database

package src;

public class combineInvDB extends Inventory {

    private String[] parseString;
    public String barcode;
    public String location;
    public String skuCode;
    public int quantity;

    public combineInvDB() {
        for (int x = 0; x < inventory.size(); x++) {
            barcode = inventory.get(x).getBarcode();
            location = inventory.get(x).getLocation();
            skuCode = inventory.get(x).getSkuCode();
            quantity = inventory.get(x).getQuantity();

            Item addedItem = new Item(skuCode,barcode,location,quantity);
            new addItem(addedItem);
        }
    }
}