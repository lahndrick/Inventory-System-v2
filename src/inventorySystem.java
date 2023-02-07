package src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class inventorySystem {

    private JFrame frame;
    private JButton addItemButton;
    private JButton addTableButton;
    private JScrollPane allItemsScrollPane;
    private JScrollPane foundItemsScrollPane;
    private JTextField allItemsTextField;
    private JTextField barcodeTextField;
    private JTextField searchItemTextField;
    private JTextField skuCodeTextField;
    private JTextField tableNameTextField;
    private JTextField foundItemsTextField;
    private JTextField locationTextField;
    private JTextField quantityTextField;
    private JButton removeItemButton;
    private JButton removeTableButton;
    private JButton searchItemButton;

    public inventorySystem() {
        initComponents();
    }

    public void initComponents() {
        frame = new JFrame("Inventory System");
        skuCodeTextField = new JTextField();
        barcodeTextField = new JTextField();
        locationTextField = new JTextField();
        quantityTextField = new JTextField();
        addItemButton = new JButton();
        removeItemButton = new JButton();
        searchItemButton = new JButton();
        tableNameTextField = new JTextField();
        removeTableButton = new JButton();
        addTableButton = new JButton();
        allItemsScrollPane = new JScrollPane();
        allItemsTextField = new JTextField();
        foundItemsScrollPane = new JScrollPane();
        foundItemsTextField = new JTextField();
        searchItemTextField = new JTextField();

        frame.getContentPane().add(skuCodeTextField);
        frame.getContentPane().add(barcodeTextField);
        frame.getContentPane().add(locationTextField);
        frame.getContentPane().add(quantityTextField);
        frame.getContentPane().add(searchItemTextField);
        frame.getContentPane().add(foundItemsTextField);
        frame.getContentPane().add(tableNameTextField);
        frame.getContentPane().add(allItemsTextField);
        frame.getContentPane().add(addItemButton);
        frame.getContentPane().add(removeItemButton);
        frame.getContentPane().add(searchItemButton);
        frame.getContentPane().add(removeTableButton);
        frame.getContentPane().add(addTableButton);
        frame.getContentPane().add(allItemsScrollPane);
        frame.getContentPane().add(foundItemsScrollPane);

<<<<<<< HEAD
        int textSize[] = {120,40};
        skuCodeTextField.setSize(textSize[0],textSize[1]);
        barcodeTextField.setSize(textSize[0],textSize[1]);
        locationTextField.setSize(textSize[0],textSize[1]);
        quantityTextField.setSize(textSize[0],textSize[1]);
        tableNameTextField.setSize(textSize[0],textSize[1]);
        allItemsTextField.setSize(textSize[0],textSize[1]);
        foundItemsTextField.setSize(textSize[0],textSize[1]);
        searchItemTextField.setSize(textSize[0],textSize[1]);
        int buttonSize[] = {120,40};
        addItemButton.setSize(buttonSize[0],buttonSize[1]);
        removeItemButton.setSize(buttonSize[0],buttonSize[1]);
        addTableButton.setSize(buttonSize[0],buttonSize[1]);
        searchItemButton.setSize(buttonSize[0],buttonSize[1]);
        removeTableButton.setSize(buttonSize[0],buttonSize[1]);
        allItemsScrollPane.setSize(300,190);
=======
        skuCodeTextField.setSize(120,40);
        barcodeTextField.setSize(120,40);
        locationTextField.setSize(120,40);
        quantityTextField.setSize(120,40);
        addItemButton.setSize(120,50);
        removeItemButton.setSize(120,50);
        searchItemButton.setSize(50,50);
        tableNameTextField.setSize(50,50);
        removeTableButton.setSize(50,50);
        addTableButton.setSize(50,50);
        allItemsScrollPane.setSize(500,190);
        allItemsTextField.setSize(50,50);
>>>>>>> 9783642f3ab98a3c68bf4ccb40e3b8d0dc026cab
        foundItemsScrollPane.setSize(50,50);



        //TODO update locations to appropriate places
        allItemsScrollPane.add(allItemsTextField);
        
        skuCodeTextField.setLocation(0,0);
        barcodeTextField.setLocation(0,50);
        locationTextField.setLocation(0,100);
        quantityTextField.setLocation(0,150);

        allItemsScrollPane.setLocation(130,0);
<<<<<<< HEAD
        allItemsScrollPane.add(allItemsTextField);
        removeItemButton.setLocation(addItemButton.getX() + addItemButton.getWidth() + 10,addItemButton.getY());
        searchItemTextField.setLocation(allItemsScrollPane.getWidth() + allItemsScrollPane.getX() + 10,0);
        searchItemButton.setLocation(searchItemTextField.getX(),searchItemTextField.getY() + searchItemTextField.getHeight());
        //TODO not set yet below
        tableNameTextField.setLocation(420,0);
        removeTableButton.setLocation(480,0);
        addTableButton.setLocation(540,0);
        foundItemsScrollPane.setLocation(720,0);
        foundItemsTextField.setLocation(780,0);
        //not set yet above
=======
        foundItemsScrollPane.setLocation(720,200);

        addItemButton.setLocation(0,200);
        removeItemButton.setLocation(addItemButton.getX() + addItemButton.getWidth() + 10,200);
        searchItemButton.setLocation(360,200);
        removeTableButton.setLocation(480,200);
        addTableButton.setLocation(540,200);

        foundItemsTextField.setLocation(780,200);
        searchItemTextField.setLocation(840,200);
        tableNameTextField.setLocation(420,200);
        
>>>>>>> 9783642f3ab98a3c68bf4ccb40e3b8d0dc026cab
        barcodeTextField.setToolTipText("barcode");
        skuCodeTextField.setToolTipText("sku code");
        locationTextField.setToolTipText("location");
        quantityTextField.setToolTipText("quantity");
        
        addItemButton.setText("Add item");
<<<<<<< HEAD
        removeItemButton.setText("Remove item");
        searchItemButton.setText("search item");
        searchItemTextField.setToolTipText("search item");
=======
        removeItemButton.setText("remove item");
        searchItemButton.setText("search item");
        removeTableButton.setText("remove table");
        addTableButton.setText("add table");
>>>>>>> 9783642f3ab98a3c68bf4ccb40e3b8d0dc026cab

        frame.setSize(600, 500);
        frame.setTitle("Inventory System");
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new inventorySystem();
    }
}