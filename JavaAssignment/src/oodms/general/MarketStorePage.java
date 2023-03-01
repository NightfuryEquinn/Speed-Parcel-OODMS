package oodms.general;

import java.awt.Font;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oodms.customer.CustomerDashboard;
import oodms.oop.AddNewItemToCart;
import oodms.oop.CountChildren;
import oodms.oop.Create3DArray;
import oodms.oop.SearchFileData;


public class MarketStorePage extends javax.swing.JFrame {

    // Accept customer username
    private static String acceptCustomerUsername;
    
    /**
     * Creates new form FeedbackMgmtDisplay
     * @param acceptCustomerUsername
     */
    public MarketStorePage(String acceptCustomerUsername) {
        initComponents();
        
        MarketStorePage.acceptCustomerUsername = acceptCustomerUsername;
        
        // Setup category for filter category and item category
        String[][] getCategoryAvailable = new CountChildren().getCountChildren("/oodms/database/category.txt", 0);
        
        // Include a default no category
        inputFilterCat.addItem("");
        
        for(String[] getCategory : getCategoryAvailable) {
            inputFilterCat.addItem(getCategory[0]);
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

        onlineSpeedMallPanel = new javax.swing.JPanel();
        onlineSpeedMallLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchItemLabel = new javax.swing.JLabel();
        inputSearchItem = new javax.swing.JTextField();
        searchItemBtn = new javax.swing.JButton();
        filterCatLabel = new javax.swing.JLabel();
        inputFilterCat = new javax.swing.JComboBox<>();
        detailLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputDescription = new javax.swing.JTextArea();
        inputPrice = new javax.swing.JTextField();
        addToCartBtn = new javax.swing.JButton();
        itemNameLaebl = new javax.swing.JLabel();
        inputItemName = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        inputQuantity = new javax.swing.JSpinner();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayMarketTable = new javax.swing.JTable();
        listLabel = new javax.swing.JLabel();
        captionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Online Speed Mall");

        onlineSpeedMallPanel.setBackground(new java.awt.Color(250, 242, 224));

        onlineSpeedMallLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        onlineSpeedMallLabel.setForeground(new java.awt.Color(76, 43, 24));
        onlineSpeedMallLabel.setText("Online Speed Mall");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputFilterCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(searchItemLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(searchItemBtn)
                        .addGap(16, 16, 16))))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchItemLabel)
                    .addComponent(inputSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchItemBtn))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterCatLabel)
                    .addComponent(inputFilterCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        detailLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(76, 43, 24));
        detailLabel.setText("Details");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

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

        inputPrice.setEditable(false);
        inputPrice.setBackground(new java.awt.Color(184, 145, 104));
        inputPrice.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputPrice.setForeground(new java.awt.Color(76, 43, 24));

        addToCartBtn.setBackground(new java.awt.Color(184, 145, 104));
        addToCartBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        addToCartBtn.setForeground(new java.awt.Color(76, 43, 24));
        addToCartBtn.setText("Add To Cart");
        addToCartBtn.setEnabled(false);
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });

        itemNameLaebl.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        itemNameLaebl.setForeground(new java.awt.Color(76, 43, 24));
        itemNameLaebl.setText("Item Name:");

        inputItemName.setEditable(false);
        inputItemName.setBackground(new java.awt.Color(184, 145, 104));
        inputItemName.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputItemName.setForeground(new java.awt.Color(76, 43, 24));

        quantityLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(76, 43, 24));
        quantityLabel.setText("Quantity:");

        inputQuantity.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputQuantity.setEnabled(false);

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel2Layout.createSequentialGroup()
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addToCartBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(itemNameLaebl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputItemName))
                            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(descriptionLabel)
                                    .addComponent(priceLabel)
                                    .addComponent(quantityLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputPrice)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(inputQuantity))))))
                .addGap(18, 18, 18))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemNameLaebl))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(inputPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantityLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addToCartBtn)
                .addGap(17, 17, 17))
        );

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        displayMarketTable.setBackground(new java.awt.Color(230, 207, 201));
        displayMarketTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayMarketTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayMarketTable.setForeground(new java.awt.Color(76, 43, 24));
        displayMarketTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Item Name", "Price (RM)", "Category", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayMarketTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayMarketTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayMarketTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayMarketTable.setShowVerticalLines(true);
        displayMarketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMarketTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(displayMarketTable);
        // Change Table Header Font
        displayMarketTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayMarketTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(275);

        listLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listLabel.setForeground(new java.awt.Color(76, 43, 24));
        listLabel.setText("List");

        captionLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        captionLabel.setForeground(new java.awt.Color(76, 43, 24));
        captionLabel.setText("Great deals always come with great delivery speed");

        javax.swing.GroupLayout onlineSpeedMallPanelLayout = new javax.swing.GroupLayout(onlineSpeedMallPanel);
        onlineSpeedMallPanel.setLayout(onlineSpeedMallPanelLayout);
        onlineSpeedMallPanelLayout.setHorizontalGroup(
            onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                        .addComponent(captionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                        .addComponent(onlineSpeedMallLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                        .addGroup(onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn)
                                .addComponent(detailLabel))
                            .addComponent(searchLabel)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        onlineSpeedMallPanelLayout.setVerticalGroup(
            onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(onlineSpeedMallLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(captionLabel)
                .addGap(29, 29, 29)
                .addGroup(onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchLabel)
                    .addComponent(listLabel))
                .addGap(18, 18, 18)
                .addGroup(onlineSpeedMallPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(detailLabel)
                        .addGap(18, 18, 18)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(onlineSpeedMallPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onlineSpeedMallPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onlineSpeedMallPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemBtnActionPerformed
        inputQuantity.setEnabled(false);
        addToCartBtn.setEnabled(false);
        
        DefaultTableModel marketTable = (DefaultTableModel) displayMarketTable.getModel();
        marketTable.setRowCount(0);
        
        String getSearchItem = inputSearchItem.getText();
        String getSearchCategory = inputFilterCat.getSelectedItem().toString();
        
        // Search with category
        if((getSearchItem.isBlank()) && (!getSearchCategory.equals(""))) {
            String[][] getSearchAllCategoryArr = new SearchFileData().searchData(getSearchCategory, 2, "/oodms/database/item.txt");
            
            for(String[] getSearchAllCategoryData : getSearchAllCategoryArr) {
                marketTable.addRow(getSearchAllCategoryData);
            } 
            
        // Search with name
        } else if((!getSearchItem.isBlank()) && (getSearchCategory.equals(""))) {
            String[][] getSearchAllItemArr = new SearchFileData().searchData(getSearchItem, 0, "/oodms/database/item.txt");
            
            for(String[] getSearchAllItemData : getSearchAllItemArr) {
                marketTable.addRow(getSearchAllItemData);
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
                marketTable.addRow(getSearchBothData);
            }
            
        // Search all
        } else if((getSearchItem.isBlank()) && (getSearchCategory.equals(""))) {
            String[][] getAllItemArr = new Create3DArray().create3D("/oodms/database/item.txt");
            
            for(String[] getAllItemData : getAllItemArr) {
                marketTable.addRow(getAllItemData);
            }
        }
    }//GEN-LAST:event_searchItemBtnActionPerformed

    private void displayMarketTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMarketTableMouseClicked
        inputQuantity.setEnabled(true);
        addToCartBtn.setEnabled(true);
        
        int selectedRow = displayMarketTable.getSelectedRow();
        
        inputItemName.setText((String) displayMarketTable.getValueAt(selectedRow, 0));
        inputPrice.setText((String) displayMarketTable.getValueAt(selectedRow, 1));
        inputDescription.setText((String) displayMarketTable.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_displayMarketTableMouseClicked

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        if(acceptCustomerUsername != null) {
            // Random generate an order ID
            Random random = new Random();
            int getCartID = random.nextInt(1000000) + 3000000;
            String randomCartID = String.valueOf(getCartID);
            
            String getItem = inputItemName.getText();
            String getPrice = inputPrice.getText();
            String getQuantity = inputQuantity.getValue().toString();
            
            double countPrice = Double.parseDouble(inputPrice.getText());
            double countQuantity = Double.parseDouble(inputQuantity.getValue().toString());
            double countTotalPrice = countPrice * countQuantity;
            
            String getTotalPrice = String.valueOf(countTotalPrice);
            
            if(!getQuantity.equals("0")) {
                AddNewItemToCart newToCart = new AddNewItemToCart(randomCartID, acceptCustomerUsername, getItem, getPrice, getQuantity, getTotalPrice);
            
                JOptionPane.showMessageDialog(null, "Your order has been placed. Please check your dashboard.", "Order placed.", JOptionPane.INFORMATION_MESSAGE);
            
                inputQuantity.setEnabled(false);
                addToCartBtn.setEnabled(false);
                
                inputSearchItem.setText("");
                inputFilterCat.setSelectedIndex(0);
    
                inputItemName.setText("");
                inputPrice.setText("");
                inputDescription.setText("");
                
                DefaultTableModel marketTable = (DefaultTableModel) displayMarketTable.getModel();
                marketTable.setRowCount(0);
            } else {
                String noQuantityMessage = "How many " + getItem + " you want to buy? You didn't state it.";
                
                JOptionPane.showMessageDialog(null, noQuantityMessage, "Unknown quantity.", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            int redirect = JOptionPane.showConfirmDialog(null, "You haven't login yet. Please login to proceed or create a new account to purchase items from Speed Parcel.\nDo you want to be redirected to the login or sign up page?", "You are a guest", JOptionPane.YES_NO_OPTION);
            
            if(redirect == JOptionPane.YES_OPTION) {
                new WelcomePage().setVisible(true);
                dispose();
            } else {
                System.out.println("Remain");
            }
        }
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if(acceptCustomerUsername != null) {
            new CustomerDashboard(acceptCustomerUsername).setVisible(true);
            dispose();
        } else {
            new WelcomePage().setVisible(true);
            dispose();
        }
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
            java.util.logging.Logger.getLogger(MarketStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MarketStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MarketStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MarketStorePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarketStorePage(acceptCustomerUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JLabel captionLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTable displayMarketTable;
    private javax.swing.JLabel filterCatLabel;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JComboBox<String> inputFilterCat;
    private javax.swing.JTextField inputItemName;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JSpinner inputQuantity;
    private javax.swing.JTextField inputSearchItem;
    private javax.swing.JLabel itemNameLaebl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listLabel;
    private javax.swing.JLabel onlineSpeedMallLabel;
    private javax.swing.JPanel onlineSpeedMallPanel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JButton searchItemBtn;
    private javax.swing.JLabel searchItemLabel;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
