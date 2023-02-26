package oodms.customer;

import java.awt.Font;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oodms.oop.Create3DArray;
import oodms.oop.DeleteSelected;
import oodms.oop.FlushAndWrite;
import oodms.oop.SaveSelected;
import oodms.oop.SearchFileData;
import oodms.oop.UpdatePurchasedItemInDelivery;
import oodms.oop.UpdatePurchasedItemInOrder;
import oodms.oop.UpdatePurchasedItemInPayment;

public class CartMgmtDisplay extends javax.swing.JFrame {

    // Accept customer username
    private static String acceptUsername;
    
    /**
     * Creates new form UserMgmtDisplayPage
     * @param acceptUsername
     */
    public CartMgmtDisplay(String acceptUsername) {
        initComponents();
        
        CartMgmtDisplay.acceptUsername = acceptUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cartMgmtPanel = new javax.swing.JPanel();
        cartMgmtLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchItemLabel = new javax.swing.JLabel();
        inputSearchItem = new javax.swing.JTextField();
        searchItemBtn = new javax.swing.JButton();
        detailLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        inputPrice = new javax.swing.JTextField();
        inputTotalPrice = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        quantityLabel = new javax.swing.JLabel();
        inputQuantity = new javax.swing.JSpinner();
        itemNameLabel = new javax.swing.JLabel();
        inputItemName = new javax.swing.JTextField();
        cartIDLabel = new javax.swing.JLabel();
        inputCartID = new javax.swing.JTextField();
        listLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayCartTable = new javax.swing.JTable();
        purchaseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cartMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        cartMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        cartMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        cartMgmtLabel.setText("Cart Management");

        searchLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchLabel.setText("Search");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        searchItemLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchItemLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchItemLabel.setText("Enter Name:");

        inputSearchItem.setBackground(new java.awt.Color(184, 145, 104));
        inputSearchItem.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputSearchItem.setForeground(new java.awt.Color(76, 43, 24));

        searchItemBtn.setBackground(new java.awt.Color(184, 145, 104));
        searchItemBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        searchItemBtn.setForeground(new java.awt.Color(76, 43, 24));
        searchItemBtn.setText("Search");
        searchItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchItemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchItemBtn)
                .addGap(16, 16, 16))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchItemLabel)
                    .addComponent(inputSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchItemBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        detailLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(76, 43, 24));
        detailLabel.setText("Details");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

        priceLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(76, 43, 24));
        priceLabel.setText("Price (RM):");

        totalPriceLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        totalPriceLabel.setForeground(new java.awt.Color(76, 43, 24));
        totalPriceLabel.setText("Total Price (RM):");

        inputPrice.setEditable(false);
        inputPrice.setBackground(new java.awt.Color(184, 145, 104));
        inputPrice.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputPrice.setForeground(new java.awt.Color(76, 43, 24));

        inputTotalPrice.setEditable(false);
        inputTotalPrice.setBackground(new java.awt.Color(184, 145, 104));
        inputTotalPrice.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputTotalPrice.setForeground(new java.awt.Color(76, 43, 24));

        editBtn.setBackground(new java.awt.Color(184, 145, 104));
        editBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(76, 43, 24));
        editBtn.setText("Edit");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(184, 145, 104));
        saveBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(76, 43, 24));
        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(184, 145, 104));
        deleteBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(76, 43, 24));
        deleteBtn.setText("Delete");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(76, 43, 24));
        quantityLabel.setText("Quantity:");

        inputQuantity.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputQuantity.setModel(new javax.swing.SpinnerNumberModel());
        inputQuantity.setEnabled(false);

        itemNameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        itemNameLabel.setForeground(new java.awt.Color(76, 43, 24));
        itemNameLabel.setText("Item Name:");

        inputItemName.setEditable(false);
        inputItemName.setBackground(new java.awt.Color(184, 145, 104));
        inputItemName.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputItemName.setForeground(new java.awt.Color(76, 43, 24));

        cartIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        cartIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        cartIDLabel.setText("Cart ID:");

        inputCartID.setEditable(false);
        inputCartID.setBackground(new java.awt.Color(184, 145, 104));
        inputCartID.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputCartID.setForeground(new java.awt.Color(76, 43, 24));

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addComponent(cartIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputCartID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(quantityLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemNameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTotalPrice)
                            .addComponent(inputQuantity)
                            .addComponent(inputItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartIDLabel)
                    .addComponent(inputCartID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameLabel)
                    .addComponent(inputItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(inputPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(inputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(inputTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn))
                .addGap(14, 14, 14))
        );

        listLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listLabel.setForeground(new java.awt.Color(76, 43, 24));
        listLabel.setText("List");

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        displayCartTable.setBackground(new java.awt.Color(230, 207, 201));
        displayCartTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayCartTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayCartTable.setForeground(new java.awt.Color(76, 43, 24));
        displayCartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cart ID", "Item Name", "Price (RM)", "Quantity", "Total Price (RM)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayCartTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayCartTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayCartTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayCartTable.setShowVerticalLines(true);
        displayCartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayCartTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(displayCartTable);
        // Change Table Header Font
        displayCartTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayCartTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(125);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(125);
        columnModel.getColumn(4).setPreferredWidth(250);

        purchaseBtn.setBackground(new java.awt.Color(184, 145, 104));
        purchaseBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        purchaseBtn.setForeground(new java.awt.Color(76, 43, 24));
        purchaseBtn.setText("Purchase Selected Item");
        purchaseBtn.setEnabled(false);
        purchaseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cartMgmtPanelLayout = new javax.swing.GroupLayout(cartMgmtPanel);
        cartMgmtPanel.setLayout(cartMgmtPanelLayout);
        cartMgmtPanelLayout.setHorizontalGroup(
            cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartMgmtPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(detailLabel)
                        .addComponent(searchLabel)
                        .addComponent(cartMgmtLabel)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(backBtn))
                .addGap(39, 39, 39)
                .addGroup(cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        cartMgmtPanelLayout.setVerticalGroup(
            cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cartMgmtPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(cartMgmtLabel)
                .addGap(18, 18, 18)
                .addGroup(cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(listLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cartMgmtPanelLayout.createSequentialGroup()
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(detailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(cartMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(purchaseBtn))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cartMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cartMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemBtnActionPerformed
        editBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        purchaseBtn.setEnabled(false);
        
        DefaultTableModel cartTable = (DefaultTableModel) displayCartTable.getModel();
        cartTable.setRowCount(0);
        
        String getSearchItem = inputSearchItem.getText();
        
        if(getSearchItem.isBlank()) {
            String[][] allCartArr = new Create3DArray().create3D("/oodms/database/cart.txt");
            
            for(String[] allCartData : allCartArr) {
                if(allCartData[1].equals(acceptUsername)) {
                    String[] theUserCartData = new String[] {allCartData[0], allCartData[2], allCartData[3], allCartData[4], allCartData[5]};
                    cartTable.addRow(theUserCartData);
                }
            }
        } else {
            String[][] searchAllCartArr = new SearchFileData().searchData(getSearchItem, 1, "/oodms/database/cart.txt");
            
            for(String[] searchAllCartData : searchAllCartArr) {
                if(searchAllCartData[1].equals(acceptUsername)) {
                    String[] theUserCartData = new String[] {searchAllCartData[0], searchAllCartData[2], searchAllCartData[3], searchAllCartData[4], searchAllCartData[5]};
                    cartTable.addRow(theUserCartData);
                }
            }
        }
    }//GEN-LAST:event_searchItemBtnActionPerformed

    private void displayCartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayCartTableMouseClicked
        editBtn.setEnabled(true);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(true);
        inputQuantity.setEnabled(false);
        
        purchaseBtn.setEnabled(true);
        
        int selectedRow = displayCartTable.getSelectedRow();
        
        inputCartID.setText((String) displayCartTable.getValueAt(selectedRow, 0));
        inputItemName.setText((String) displayCartTable.getValueAt(selectedRow, 1));
        inputPrice.setText((String) displayCartTable.getValueAt(selectedRow, 2));
        inputQuantity.setValue(Integer.valueOf((String) displayCartTable.getValueAt(selectedRow, 3)));
        inputTotalPrice.setText((String) displayCartTable.getValueAt(selectedRow, 4));
    }//GEN-LAST:event_displayCartTableMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        saveBtn.setEnabled(true);
        inputQuantity.setEnabled(true);
        
        purchaseBtn.setEnabled(false);
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String getCartID = inputCartID.getText();
        String getItemName = inputItemName.getText();
        String getPrice = inputPrice.getText();
        String getQuantity = inputQuantity.getValue().toString();
        
        double countPrice = Double.parseDouble(getPrice);
        double countQuantity = Double.parseDouble(getQuantity);
        double countTotalPrice = countPrice * countQuantity;
            
        String getTotalPrice = String.format("%.2f", countTotalPrice);
        
        String[] newChangesArr = new String[] {getCartID, acceptUsername, getItemName, getPrice, getQuantity, getTotalPrice};
        
        SaveSelected ss = new SaveSelected();
        String[][] newChangesArrToSave = ss.saveCart(newChangesArr, getCartID, getItemName);
        
        FlushAndWrite faw = new FlushAndWrite();
        faw.flushAndWrite(newChangesArrToSave, "src/oodms/database/cart.txt");
        
        JOptionPane.showMessageDialog(null, "Changes has been saved.", "Success", JOptionPane.INFORMATION_MESSAGE);
        
        // Reset Search and Details fields
        inputSearchItem.setText("");
        
        inputItemName.setText("");
        inputPrice.setText("");
        inputQuantity.setValue(0);
        inputTotalPrice.setText("");

        // Disable editing
        inputQuantity.setEnabled(false);

        // Disable buttons
        editBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        purchaseBtn.setEnabled(false);

        // Clear table
        DefaultTableModel userTable = (DefaultTableModel) displayCartTable.getModel();
        userTable.setRowCount(0);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // Get the selected row
        int selectedRowIndex = displayCartTable.getSelectedRow();

        String selectedRowCart = (String) displayCartTable.getValueAt(selectedRowIndex, 0);

        int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure to delete this order? This action can't be undone.", "Confirm delete?", JOptionPane.YES_NO_OPTION);

        if(confirmDelete == JOptionPane.YES_OPTION) {
            // Return a multidimensional of excluded selected row
            String[][] ds = new DeleteSelected().deleteSelected(selectedRowCart, "/oodms/database/cart.txt");

            // Flush and Write
            FlushAndWrite faw = new FlushAndWrite();
            faw.flushAndWrite(ds, "src/oodms/database/cart.txt");
            
            JOptionPane.showMessageDialog(null, "Your order has been deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Do nothing");
        }
        
        // Reset Search and Details fields
        inputSearchItem.setText("");
        
        inputItemName.setText("");
        inputPrice.setText("");
        inputQuantity.setValue(0);
        inputTotalPrice.setText("");

        // Disable editing
        inputQuantity.setEnabled(false);

        // Disable buttons
        editBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        purchaseBtn.setEnabled(false);

        // Clear table
        DefaultTableModel userTable = (DefaultTableModel) displayCartTable.getModel();
        userTable.setRowCount(0);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void purchaseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBtnActionPerformed
        int selectedRow = displayCartTable.getSelectedRow();
        
        int confirmPurchase = JOptionPane.showConfirmDialog(null, "Are you sure to place order?", "Confirm order?", JOptionPane.YES_NO_OPTION);
        
        if(confirmPurchase == JOptionPane.YES_OPTION) {
                /**
             * Get the item data that is purchased before deleting from cart text file
             */
            String[] getItemToPurchaseData = new String[] {
               (String) displayCartTable.getValueAt(selectedRow, 0),
                acceptUsername,
               (String) displayCartTable.getValueAt(selectedRow, 1),
               (String) displayCartTable.getValueAt(selectedRow, 2),
               (String) displayCartTable.getValueAt(selectedRow, 3),
               (String) displayCartTable.getValueAt(selectedRow, 4),
            };

            // Delete item that is purchased from cart text file
            String selectedRowCart = (String) displayCartTable.getValueAt(selectedRow, 0);

            // Return a multidimensional of excluded selected row
            String[][] ds = new DeleteSelected().deleteSelected(selectedRowCart, "/oodms/database/cart.txt");

            // Flush and Write
            FlushAndWrite faw = new FlushAndWrite();
            faw.flushAndWrite(ds, "src/oodms/database/cart.txt");

            /**
             * Write into order, payment, delivery text file
             */
            // Random generate an order ID
            Random random = new Random();
            int getOrderID = random.nextInt(1000000) + 15000000;
            String randomOrderID = String.valueOf(getOrderID);

            // To Order text file
            UpdatePurchasedItemInOrder upiio = new UpdatePurchasedItemInOrder();
            upiio.updatePurchasedItemData(getItemToPurchaseData, randomOrderID);

            // To Delivery text file
            UpdatePurchasedItemInDelivery upiid = new UpdatePurchasedItemInDelivery();
            upiid.updatePurchasedItemData(getItemToPurchaseData, randomOrderID);

            // To Payment text file
            UpdatePurchasedItemInPayment upiip = new UpdatePurchasedItemInPayment();
            upiip.updatePurchasedItemData(getItemToPurchaseData, randomOrderID);
            
            JOptionPane.showMessageDialog(null, "Order has been placed. Please view your purchase detail in payment history.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Do nothing");
        }
    }//GEN-LAST:event_purchaseBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new CustomerDashboard(acceptUsername).setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CartMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CartMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CartMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CartMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CartMgmtDisplay(acceptUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JLabel cartIDLabel;
    private javax.swing.JLabel cartMgmtLabel;
    private javax.swing.JPanel cartMgmtPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTable displayCartTable;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField inputCartID;
    private javax.swing.JTextField inputItemName;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JSpinner inputQuantity;
    private javax.swing.JTextField inputSearchItem;
    private javax.swing.JTextField inputTotalPrice;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchItemBtn;
    private javax.swing.JLabel searchItemLabel;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
