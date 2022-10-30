package src;

public class inventoryInterface extends javax.swing.JFrame {

    public invShow invshow;
    
    public inventoryInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        //initialisations
        skuCodeTextField = new javax.swing.JTextField();
        barcodeTextField = new javax.swing.JTextField();
        locationTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        allItemsScrollPane = new javax.swing.JScrollPane();
        allItemsScrollPane.add(allItemsTextfield);
        tableNameTextField = new javax.swing.JTextField();
        addTableButton = new javax.swing.JButton();
        removeTableButton = new javax.swing.JButton();
        foundItemsScrollPane = new javax.swing.JScrollPane();
        searchItemButton = new javax.swing.JButton();
        searchItemTextField = new javax.swing.JTextField();
        removeItemButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inventoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventoryInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventoryInterface().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton addItemButton;
    private javax.swing.JButton addTableButton;
    private javax.swing.JScrollPane allItemsScrollPane;
    private javax.swing.JTextField barcodeTextField;
    private javax.swing.JScrollPane foundItemsScrollPane;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JButton removeTableButton;
    private javax.swing.JButton searchItemButton;
    private javax.swing.JTextField searchItemTextField;
    private javax.swing.JTextField skuCodeTextField;
    private javax.swing.JTextField tableNameTextField;
    private javax.swing.JTextField allItemsTextfield;
}
