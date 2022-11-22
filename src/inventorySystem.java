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
        frame.getContentPane().add(addItemButton);
        frame.getContentPane().add(removeItemButton);
        frame.getContentPane().add(searchItemButton);
        frame.getContentPane().add(tableNameTextField);
        frame.getContentPane().add(removeTableButton);
        frame.getContentPane().add(addTableButton);
        frame.getContentPane().add(allItemsScrollPane);
        frame.getContentPane().add(allItemsTextField);
        frame.getContentPane().add(foundItemsScrollPane);
        frame.getContentPane().add(foundItemsTextField);
        frame.getContentPane().add(searchItemTextField);

        //TODO update sizes for each component
        skuCodeTextField.setSize(120,40);
        barcodeTextField.setSize(120,40);
        locationTextField.setSize(120,40);
        quantityTextField.setSize(120,40);
        addItemButton.setSize(120,40);

        removeItemButton.setSize(50,50);
        searchItemButton.setSize(50,50);
        tableNameTextField.setSize(50,50);
        removeTableButton.setSize(50,50);
        addTableButton.setSize(50,50);
        allItemsScrollPane.setSize(500,190);
        allItemsTextField.setSize(50,50);
        foundItemsScrollPane.setSize(50,50);
        foundItemsTextField.setSize(50,50);
        searchItemTextField.setSize(50,50);

        //TODO update locations to appropriate places
        skuCodeTextField.setLocation(0,0);
        barcodeTextField.setLocation(0,50);
        locationTextField.setLocation(0,100);
        quantityTextField.setLocation(0,150);
        addItemButton.setLocation(0,200);
        allItemsScrollPane.setLocation(130,0);
        allItemsScrollPane.add(allItemsTextField);
/* 
        removeItemButton.setLocation(300,0);
        searchItemButton.setLocation(360,0);
        tableNameTextField.setLocation(420,0);
        removeTableButton.setLocation(480,0);
        addTableButton.setLocation(540,0);
        foundItemsScrollPane.setLocation(720,0);
        foundItemsTextField.setLocation(780,0);
        searchItemTextField.setLocation(840,0);
*/
        barcodeTextField.setToolTipText("barcode");
        skuCodeTextField.setToolTipText("sku code");
        locationTextField.setToolTipText("location");
        quantityTextField.setToolTipText("quantity");
        addItemButton.setText("Add item");

        frame.setSize(800, 500);
        frame.setTitle("Inventory System");
        frame.setLocation(100, 100);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new inventorySystem();
    }
}