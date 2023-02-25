package oodms.admin;

import java.awt.Font;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import oodms.oop.AddNewItem;
import oodms.oop.CheckSimilarity;
import oodms.oop.CountChildren;
import oodms.oop.Create3DArray;
import oodms.oop.DeleteSelected;
import oodms.oop.FlushAndWrite;
import oodms.oop.SaveSelected;
import oodms.oop.SearchFileData;

public class ItemMgmtDisplay extends javax.swing.JFrame {

    /**
     * Creates new form ItemMgmtDisplay
     */
    public ItemMgmtDisplay() {
        initComponents();
        
        // Setup category for filter category and item category
        String[][] getCategoryAvailable = new CountChildren().getCountChildren("/oodms/database/category.txt", 0);
        
        // Include a default no category
        inputFilterCat.addItem("");
        inputItemCategory.addItem("");
        
        for(String[] getCategory : getCategoryAvailable) {
            inputFilterCat.addItem(getCategory[0]);
            inputItemCategory.addItem(getCategory[0]);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemMgmtPanel = new javax.swing.JPanel();
        itemMgmtLabel = new javax.swing.JLabel();
        searchItemLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchItemIDLabel = new javax.swing.JLabel();
        inputSearchItem = new javax.swing.JTextField();
        searchItemBtn = new javax.swing.JButton();
        filterCatLabel = new javax.swing.JLabel();
        inputFilterCat = new javax.swing.JComboBox<>();
        detailLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        itemNameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        inputItemName = new javax.swing.JTextField();
        inputPrice = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        itemCategoryLabel = new javax.swing.JLabel();
        inputItemCategory = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        listItemLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayItemTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        itemMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        itemMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        itemMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        itemMgmtLabel.setText("Item Management");

        searchItemLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        searchItemLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchItemLabel.setText("Search");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        searchItemIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchItemIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchItemIDLabel.setText("Enter Item:");

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

        filterCatLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        filterCatLabel.setForeground(new java.awt.Color(76, 43, 24));
        filterCatLabel.setText("Filter Category:");

        inputFilterCat.setBackground(new java.awt.Color(184, 145, 104));
        inputFilterCat.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputFilterCat.setForeground(new java.awt.Color(76, 43, 24));

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(filterCatLabel)
                        .addGap(18, 18, 18)
                        .addComponent(inputFilterCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(searchItemIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(inputSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchItemBtn)
                        .addGap(16, 16, 16))))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchItemIDLabel)
                    .addComponent(inputSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchItemBtn))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterCatLabel)
                    .addComponent(inputFilterCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        detailLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(76, 43, 24));
        detailLabel.setText("Details");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

        itemNameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        itemNameLabel.setForeground(new java.awt.Color(76, 43, 24));
        itemNameLabel.setText("Item Name:");

        priceLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(76, 43, 24));
        priceLabel.setText("Price (RM):");

        descriptionLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(76, 43, 24));
        descriptionLabel.setText("Description:");

        inputDescription.setEditable(false);
        inputDescription.setBackground(new java.awt.Color(184, 145, 104));
        inputDescription.setColumns(20);
        inputDescription.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputDescription.setForeground(new java.awt.Color(76, 43, 24));
        inputDescription.setLineWrap(true);
        inputDescription.setRows(5);
        jScrollPane1.setViewportView(inputDescription);

        inputItemName.setEditable(false);
        inputItemName.setBackground(new java.awt.Color(184, 145, 104));
        inputItemName.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputItemName.setForeground(new java.awt.Color(76, 43, 24));

        inputPrice.setEditable(false);
        inputPrice.setBackground(new java.awt.Color(184, 145, 104));
        inputPrice.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputPrice.setForeground(new java.awt.Color(76, 43, 24));
        inputPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputPriceFocusLost(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(184, 145, 104));
        addBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(76, 43, 24));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

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

        itemCategoryLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        itemCategoryLabel.setForeground(new java.awt.Color(76, 43, 24));
        itemCategoryLabel.setText("Category:");

        inputItemCategory.setBackground(new java.awt.Color(184, 145, 104));
        inputItemCategory.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputItemCategory.setForeground(new java.awt.Color(76, 43, 24));
        inputItemCategory.setEnabled(false);

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn))
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(itemCategoryLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(inputItemName)
                            .addComponent(inputItemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemNameLabel)
                    .addComponent(inputItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(inputPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemCategoryLabel)
                    .addComponent(inputItemCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn))
                .addGap(14, 14, 14))
        );

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");

        listItemLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listItemLabel.setForeground(new java.awt.Color(76, 43, 24));
        listItemLabel.setText("List");

        displayItemTable.setBackground(new java.awt.Color(230, 207, 201));
        displayItemTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayItemTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayItemTable.setForeground(new java.awt.Color(76, 43, 24));
        displayItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Category", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        displayItemTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayItemTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayItemTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayItemTable.setShowVerticalLines(true);
        displayItemTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayItemTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(displayItemTable);
        // Change Table Header Font
        displayItemTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayItemTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(75);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(275);

        javax.swing.GroupLayout itemMgmtPanelLayout = new javax.swing.GroupLayout(itemMgmtPanel);
        itemMgmtPanel.setLayout(itemMgmtPanelLayout);
        itemMgmtPanelLayout.setHorizontalGroup(
            itemMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemMgmtPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(itemMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemMgmtLabel)
                    .addComponent(searchItemLabel)
                    .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailLabel)
                    .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(itemMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listItemLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        itemMgmtPanelLayout.setVerticalGroup(
            itemMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemMgmtPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(itemMgmtLabel)
                .addGap(14, 14, 14)
                .addGroup(itemMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchItemLabel)
                    .addComponent(listItemLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(itemMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(itemMgmtPanelLayout.createSequentialGroup()
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // Unselect Row
        displayItemTable.clearSelection();

        // Get value from user
        inputItemName.setEditable(true);
        inputPrice.setEditable(true);
        inputItemCategory.setEnabled(true);
        inputDescription.setEditable(true);
        
        String getItemName = inputItemName.getText();
        String getPrice = inputPrice.getText();
        String getItemCategory = inputItemCategory.getSelectedItem().toString();
        String getDescription = inputDescription.getText();
        
        boolean checkItem = new CheckSimilarity().itemChecker(getItemName);
        
        if((!getItemName.equals("")) && (!getPrice.equals("")) && (!getDescription.equals(""))) {
            if(!checkItem) {
                AddNewItem item = new AddNewItem(getItemName, getPrice, getItemCategory, getDescription);

                JOptionPane.showMessageDialog(null, "New item added.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Item exists.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill up the empty fields.", "Empty fields", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // Enable text fields
        inputItemName.setEditable(true);
        inputPrice.setEditable(true);
        inputItemCategory.setEnabled(true);
        inputDescription.setEditable(true);

        // Enable button
        saveBtn.setEnabled(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String getOldItemName = (String) displayItemTable.getValueAt(displayItemTable.getSelectedRow(), 0);
        
        String getItemName = inputItemName.getText();
        String getPrice = inputPrice.getText();
        String getItemCategory = inputItemCategory.getSelectedItem().toString();
        String getDescription = inputDescription.getText();
        
        String[] newChangesArr = new String[] {getItemName, getPrice, getItemCategory, getDescription};
        
        boolean itemChecker = new CheckSimilarity().itemChecker(getItemName);
        
        if((!getItemName.equals("")) && (!getPrice.equals("")) && (!getDescription.equals(""))) {
            if(!itemChecker) {
                SaveSelected ss = new SaveSelected();
                String[][] newChangesArrToSave = ss.saveItem(newChangesArr, getOldItemName);

                new FlushAndWrite().flushAndWrite(newChangesArrToSave, "src/oodms/database/item.txt");

                JOptionPane.showMessageDialog(null, "Content saved. Please refresh the table again.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to save. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill up the empty fields.", "Empty fields", JOptionPane.ERROR_MESSAGE);
        }
        
        // Reset text field and button
        inputSearchItem.setText("");
        
        inputItemName.setText("");
        inputPrice.setText("");
        inputItemCategory.setSelectedIndex(0);
        inputDescription.setText("");
        
        inputItemName.setEditable(false);
        inputPrice.setEditable(false);
        inputItemCategory.setEnabled(false);
        inputDescription.setEditable(false);
        
        // Disable button
        editBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        // Clear table
        DefaultTableModel itemTable = (DefaultTableModel) displayItemTable.getModel();
        itemTable.setRowCount(0);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = displayItemTable.getSelectedRow();
        
        String selectedRowItem = (String) displayItemTable.getValueAt(selectedRow, 0);
        
        int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure to delete this item? This action can't be undone.", "Confirm delete?", JOptionPane.YES_NO_OPTION);
        
        if(confirmDelete == JOptionPane.YES_OPTION) {
            String[][] ds = new DeleteSelected().deleteSelected(selectedRowItem, "/oodms/database/item.txt");
        
            FlushAndWrite faw = new FlushAndWrite();
            faw.flushAndWrite(ds, "src/oodms/database/item.txt");
            
            JOptionPane.showMessageDialog(null, "Item deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Do nothing.");
        }
        
        // Reset text field and button
        inputSearchItem.setText("");
        
        inputItemName.setText("");
        inputPrice.setText("");
        inputItemCategory.setSelectedIndex(0);
        inputDescription.setText("");
        
        inputItemName.setEditable(false);
        inputPrice.setEditable(false);
        inputItemCategory.setEnabled(false);
        inputDescription.setEditable(false);
        
        // Disable button
        editBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        // Clear table
        DefaultTableModel itemTable = (DefaultTableModel) displayItemTable.getModel();
        itemTable.setRowCount(0);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void displayItemTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayItemTableMouseClicked
        // Enable buttons
        editBtn.setEnabled(true);
        deleteBtn.setEnabled(true);
        
        // Disable buttons
        saveBtn.setEnabled(false);
        
        // Disable text field
        inputItemName.setEditable(false);
        inputPrice.setEditable(false);
        inputItemCategory.setEnabled(false);
        inputDescription.setEditable(false);
        
        // Get the selected row number
        int selectedRow = displayItemTable.getSelectedRow();
        
        inputItemName.setText((String) displayItemTable.getValueAt(selectedRow, 0));
        inputPrice.setText((String) displayItemTable.getValueAt(selectedRow, 1));
        inputItemCategory.setSelectedItem((String) displayItemTable.getValueAt(selectedRow, 2));
        inputDescription.setText((String) displayItemTable.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_displayItemTableMouseClicked

    private void searchItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemBtnActionPerformed
        // Disable text field
        inputItemName.setEditable(false);
        inputPrice.setEditable(false);
        inputItemCategory.setEnabled(false);
        inputDescription.setEditable(false);
        
        // Disable button
        editBtn.setEnabled(false);
        saveBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        
        // Reset text field
        inputItemName.setText("");
        inputPrice.setText("");
        inputItemCategory.setSelectedIndex(0);
        inputDescription.setText("");
        
        // Clear Table
        DefaultTableModel itemTable = (DefaultTableModel) displayItemTable.getModel();
        itemTable.setRowCount(0);
        
        // Get search keyword
        String getSearchItem = inputSearchItem.getText();
        String getSearchCategory = inputFilterCat.getSelectedItem().toString();
        
        // Search with category
        if((getSearchItem.isBlank()) && (!getSearchCategory.equals(""))) {
            String[][] getSearchAllCategoryArr = new SearchFileData().searchData(getSearchCategory, 2, "/oodms/database/item.txt");
            
            for(String[] getSearchAllCategoryData : getSearchAllCategoryArr) {
                itemTable.addRow(getSearchAllCategoryData);
            } 
            
        // Search with name
        } else if((!getSearchItem.isBlank()) && (getSearchCategory.equals(""))) {
            String[][] getSearchAllItemArr = new SearchFileData().searchData(getSearchItem, 0, "/oodms/database/item.txt");
            
            for(String[] getSearchAllItemData : getSearchAllItemArr) {
                itemTable.addRow(getSearchAllItemData);
            }
        
        // Search with both name and category
        } else if((!getSearchItem.isBlank()) && (!getSearchCategory.equals(""))) {
            String[][] getSearchBothItemArr = new SearchFileData().searchData(getSearchItem, 0, "/oodms/database/item.txt");
            String[][] getSearchBothCatArr = new SearchFileData().searchData(getSearchCategory, 2, "/oodms/database/item.txt");
            
            int newArrCount = 0;
            
            // Count the number of similar array into both array
            for(int i = 0; i < getSearchBothItemArr.length; i++) {
                for(int j = 0; j < getSearchBothCatArr.length; j++) {
                    if(Arrays.equals(getSearchBothItemArr[i], getSearchBothCatArr[j])) {
                        newArrCount++;
                    }
                }
            }
            
            // Write the similar array into a new array
            String[][] getSearchBothArr = new String[newArrCount][getSearchBothItemArr[0].length];
            
            int newArrIndex = 0;
            
            for(int i = 0; i < getSearchBothItemArr.length; i++) {
                for(int j = 0; j < getSearchBothCatArr.length; j++) {
                    if(Arrays.equals(getSearchBothItemArr[i], getSearchBothCatArr[j])) {
                        getSearchBothArr[newArrIndex++] = getSearchBothItemArr[i];
                    }
                }
            }
            
            for(String[] getSearchBothData : getSearchBothArr) {
                itemTable.addRow(getSearchBothData);
            }
            
        // Search all
        } else if((getSearchItem.isBlank()) && (getSearchCategory.equals(""))) {
            String[][] getAllItemArr = new Create3DArray().create3D("/oodms/database/item.txt");
            
            for(String[] getAllItemData : getAllItemArr) {
                itemTable.addRow(getAllItemData);
            }
        }
    }//GEN-LAST:event_searchItemBtnActionPerformed

    private void inputPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputPriceFocusLost
        ((AbstractDocument)inputPrice.getDocument()).setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                // Only allow the insertion of numeric characters
                if (string.matches("\\d+")) {
                    super.insertString(fb, offset, string, attr);
                }
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                // Only allow the replacement of text with numeric characters
                if (text.matches("\\d+")) {
                    super.replace(fb, offset, length, text, attrs);
                }
            }
        });
    }//GEN-LAST:event_inputPriceFocusLost

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
            java.util.logging.Logger.getLogger(ItemMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemMgmtDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTable displayItemTable;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel filterCatLabel;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JComboBox<String> inputFilterCat;
    private javax.swing.JComboBox<String> inputItemCategory;
    private javax.swing.JTextField inputItemName;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JTextField inputSearchItem;
    private javax.swing.JLabel itemCategoryLabel;
    private javax.swing.JLabel itemMgmtLabel;
    private javax.swing.JPanel itemMgmtPanel;
    private javax.swing.JLabel itemNameLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listItemLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchItemBtn;
    private javax.swing.JLabel searchItemIDLabel;
    private javax.swing.JLabel searchItemLabel;
    // End of variables declaration//GEN-END:variables
}
