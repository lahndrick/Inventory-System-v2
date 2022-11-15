package src;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class inventoryInterface extends JFrame {

    public inventoryInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

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

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBorder(javax.swing.BorderFactory.createEmptyBorder()););

        skuCodeTextField.setText("sku code");
        getContentPane().add(skuCodeTextField, AbsoluteConstraints(0, 0, 120, 30));

        barcodeTextField.setText("barcode");
        getContentPane().add(barcodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 120, 30));

        locationTextField.setText("location");
        getContentPane().add(locationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, 30));

        quantityTextField.setText("quantity");
        getContentPane().add(quantityTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 120, 30));

        addItemButton.setText("add item");
        getContentPane().add(addItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 120, 36));

        removeItemButton.setText("remove item");
        getContentPane().add(removeItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 205, 150, 36));

        searchItemButton.setText("search item");
        getContentPane().add(searchItemButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 126, 36));

        tableNameTextField.setText("table name");
        getContentPane().add(tableNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 160, 30));

        removeTableButton.setText("remove");
        getContentPane().add(removeTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 80, -1));

        addTableButton.setText("add");
        getContentPane().add(addTableButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 80, -1));

        allItemsTextField.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                allItemsTextFieldComponentAdded(evt);
            }
        });
        allItemsScrollPane.setViewportView(allItemsTextField);

        getContentPane().add(allItemsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 140, 200));

        foundItemsScrollPane.setViewportView(foundItemsTextField);

        getContentPane().add(foundItemsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 160, 70));

        searchItemTextField.setText("search item");
        getContentPane().add(searchItemTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 130, -1));

        pack();
    }

    private void allItemsTextFieldComponentAdded(java.awt.event.ContainerEvent evt) {
        // TODO add your handling code here:
    }

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (InstantiationException ex) {
            System.out.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
            System.out.println(ex.getMessage());
        } catch (UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inventoryInterface().setVisible(true);
            }
        });
    }

    // Variables declaration              
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
}
