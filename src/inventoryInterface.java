package src;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class inventoryInterface extends javax.swing.JFrame {

    // Variables declaration
    public invShow invshow;
    public String invAll;

    private JTextField barcodeTextField;
    private JTextField locationTextField;
    private JTextField quantityTextField;
    private JTextField searchItemTextField;
    private JTextField skuCodeTextField;
    private JTextField tableNameTextField;
    private JTextField allItemsTextfield;

    private JButton addItemButton;
    private JButton addTableButton;
    private JButton removeItemButton;
    private JButton removeTableButton;
    private JButton searchItemButton;

    private JScrollPane allItemsScrollPane;
    private JScrollPane foundItemsScrollPane;

    private Item[] itemList;

    public inventoryInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //initialisations
        //test fields
        skuCodeTextField = new javax.swing.JTextField();
        barcodeTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        tableNameTextField = new javax.swing.JTextField();
        searchItemTextField = new javax.swing.JTextField();
        //scroll panes
        allItemsScrollPane = new javax.swing.JScrollPane();
        foundItemsScrollPane = new javax.swing.JScrollPane();
        //item buttons
        addItemButton = new javax.swing.JButton();
        addTableButton = new javax.swing.JButton();
        removeTableButton = new javax.swing.JButton();
        searchItemButton = new javax.swing.JButton();
        removeItemButton = new javax.swing.JButton();

        //text sets
        skuCodeTextField.setText("sku code");
        barcodeTextField.setText("barcode");
        locationTextField.setText("location");
        quantityTextField.setText("quantity");
        addItemButton.setText("add item");
        tableNameTextField.setText("table name");
        addTableButton.setText("add table");
        removeTableButton.setText("remove table");
        searchItemButton.setText("Search item");
        searchItemTextField.setText("search Item");
        removeItemButton.setText("remove item");

        for (int i = 0; i < invshow.inventory.size(); i++) {
            allItemsTextfield.setText(invAll);
        }

        //adding components to layout
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(skuCodeTextField)
                                        .addComponent(locationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(barcodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(quantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                        .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(allItemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(removeItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tableNameTextField)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(addTableButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                                                .addComponent(removeTableButton))
                                        .addComponent(foundItemsScrollPane)
                                        .addComponent(searchItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(searchItemTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(skuCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(barcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(22, 22, 22)
                                                .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(allItemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(tableNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addTableButton)
                                                        .addComponent(removeTableButton))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(foundItemsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(searchItemTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(addItemButton)
                                                .addComponent(removeItemButton))
                                        .addComponent(searchItemButton))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    //main
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            //catching exceptions
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventoryInterface().setVisible(true);
            }
        });
    }
}
