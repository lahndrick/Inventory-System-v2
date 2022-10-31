package src;

//this class is an extension of inventory, dealing with all string output
public class invShow extends Inventory {
    
    public String showAll() {
        String output = null;
        
        for(int x = 0; x < inventory.size();x++) {
            output = inventory.get(x).toString() + "\n";
        }
        
        return output;
    }
}
