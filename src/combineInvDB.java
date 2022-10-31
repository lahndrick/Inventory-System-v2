//takes the elements from inventory class and adds them to database
package src;

public class combineInvDB extends Inventory {

    public String barcode;
    public String location;
    public String skuCode;
    public int quantity;
    private Item[] itemList;

    public combineInvDB() {
        queueItems();
        add();
    }

    private void queueItems() {
        itemList = new Item[inventory.size()];

        for (int x = 0; x < inventory.size(); x++) {
            barcode = inventory.get(x).getBarcode();
            location = inventory.get(x).getLocation();
            skuCode = inventory.get(x).getSkuCode();
            quantity = inventory.get(x).getQuantity();

            itemList[x] = new Item(skuCode, barcode, location, quantity);
        }
    }

    public void add() {

        int size = itemList.length;
        addItem addItem;

        Item[] addList = new Item[size];

        for (int x = 0; x < size; x++) {
            addList[x] = new Item(itemList[x].getSkuCode(), itemList[x].getBarcode(), itemList[x].getLocation(), itemList[x].getQuantity());
            addItem = new addItem(itemList[x]);
            addItem.update();
        }
    }
}
