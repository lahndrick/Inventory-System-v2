package src;

/**
 *
 * @author Lahndrick Hendricks
 */
public class GUI extends javax.swing.JFrame {

    Inventory inv;
    invShow invShow;
    String invString;
    
    public GUI() {
        initComponents();
        invString = new invShow().showAll();
        new loadInv().update();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        removeTableButton = new javax.swing.JButton();
        addTableButton = new javax.swing.JButton();
        viewTablesButton = new javax.swing.JButton();
        updateInventoryButton = new javax.swing.JButton();
        tableNameTextField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        list1 = new java.awt.List();
        removeItemButton = new javax.swing.JButton();
        locationTextField = new javax.swing.JTextField();
        barcodeTextField = new javax.swing.JTextField();
        skuCodeTextField = new javax.swing.JTextField();
        quantityTextField = new javax.swing.JTextField();
        addItemButton1 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jButton1.setText("jButton1");

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        removeTableButton.setText("remove table");
        removeTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTableButtonActionPerformed(evt);
            }
        });

        addTableButton.setText("add table");
        addTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTableButtonActionPerformed(evt);
            }
        });

        viewTablesButton.setText("view tables");
        viewTablesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTablesButtonActionPerformed(evt);
            }
        });

        updateInventoryButton.setText("update inventory");
        updateInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryButtonActionPerformed(evt);
            }
        });

        tableNameTextField.setText("table name");

        jScrollPane3.setViewportView(list1);

        removeItemButton.setText("remove item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(viewTablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(removeItemButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(removeTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tableNameTextField))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(tableNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewTablesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        locationTextField.setText("location");

        barcodeTextField.setText("barcode");
        barcodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeTextFieldActionPerformed(evt);
            }
        });

        skuCodeTextField.setText("sku code");
        skuCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skuCodeTextFieldActionPerformed(evt);
            }
        });

        quantityTextField.setText("quantity");

        addItemButton1.setText("add item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(locationTextField)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(barcodeTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(skuCodeTextField, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addComponent(addItemButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(825, 825, 825)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(barcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(skuCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(291, Short.MAX_VALUE)
                    .addComponent(addItemButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(240, 240, 240)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void removeTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeTableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeTableButtonActionPerformed

    private void addTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTableButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTableButtonActionPerformed

    private void viewTablesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTablesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTablesButtonActionPerformed

    private void updateInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInventoryButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateInventoryButtonActionPerformed

    private void skuCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skuCodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_skuCodeTextFieldActionPerformed

    private void barcodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barcodeTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton1;
    private javax.swing.JButton addTableButton;
    private javax.swing.JTextField barcodeTextField;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.List list1;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton removeItemButton;
    private javax.swing.JButton removeTableButton;
    private javax.swing.JTextField skuCodeTextField;
    private javax.swing.JTextField tableNameTextField;
    private javax.swing.JButton updateInventoryButton;
    private javax.swing.JButton viewTablesButton;
    // End of variables declaration//GEN-END:variables
}
