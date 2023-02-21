package oodms.general;

import java.awt.Font;
import javax.swing.table.TableColumnModel;


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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feedbackMgmtPanel = new javax.swing.JPanel();
        feedbackMgmtLabel = new javax.swing.JLabel();
        searchFeedbackLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchCustomerLabel = new javax.swing.JLabel();
        inputSearchCustomer = new javax.swing.JTextField();
        searchFeedbackBtn = new javax.swing.JButton();
        filterRatingLabel = new javax.swing.JLabel();
        filterRating = new javax.swing.JComboBox<>();
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
        listFeedbackLabel = new javax.swing.JLabel();
        captionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedbackMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        feedbackMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        feedbackMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        feedbackMgmtLabel.setText("Online Speed Mall");

        searchFeedbackLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        searchFeedbackLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchFeedbackLabel.setText("Search");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        searchCustomerLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchCustomerLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchCustomerLabel.setText("Enter Name:");

        inputSearchCustomer.setBackground(new java.awt.Color(184, 145, 104));
        inputSearchCustomer.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputSearchCustomer.setForeground(new java.awt.Color(76, 43, 24));

        searchFeedbackBtn.setBackground(new java.awt.Color(184, 145, 104));
        searchFeedbackBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        searchFeedbackBtn.setForeground(new java.awt.Color(76, 43, 24));
        searchFeedbackBtn.setText("Search");

        filterRatingLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        filterRatingLabel.setForeground(new java.awt.Color(76, 43, 24));
        filterRatingLabel.setText("Filter Category:");

        filterRating.setBackground(new java.awt.Color(184, 145, 104));
        filterRating.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        filterRating.setForeground(new java.awt.Color(76, 43, 24));

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(filterRatingLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(filterRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(searchCustomerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(searchFeedbackBtn)
                        .addGap(16, 16, 16))))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCustomerLabel)
                    .addComponent(inputSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFeedbackBtn))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterRatingLabel)
                    .addComponent(filterRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                "Item Name", "Price (RM)", "Description", "Quantity"
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
        jScrollPane2.setViewportView(displayMarketTable);
        // Change Table Header Font
        displayMarketTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayMarketTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(75);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(275);

        listFeedbackLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listFeedbackLabel.setForeground(new java.awt.Color(76, 43, 24));
        listFeedbackLabel.setText("List");

        captionLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        captionLabel.setForeground(new java.awt.Color(76, 43, 24));
        captionLabel.setText("Great deals always come with great delivery speed");

        javax.swing.GroupLayout feedbackMgmtPanelLayout = new javax.swing.GroupLayout(feedbackMgmtPanel);
        feedbackMgmtPanel.setLayout(feedbackMgmtPanelLayout);
        feedbackMgmtPanelLayout.setHorizontalGroup(
            feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(captionLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(feedbackMgmtLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn)
                                .addComponent(detailLabel))
                            .addComponent(searchFeedbackLabel)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(listFeedbackLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39))))
        );
        feedbackMgmtPanelLayout.setVerticalGroup(
            feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(feedbackMgmtLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(captionLabel)
                .addGap(29, 29, 29)
                .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFeedbackLabel)
                    .addComponent(listFeedbackLabel))
                .addGap(18, 18, 18)
                .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(detailLabel)
                        .addGap(18, 18, 18)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
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
            .addComponent(feedbackMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(feedbackMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel feedbackMgmtLabel;
    private javax.swing.JPanel feedbackMgmtPanel;
    private javax.swing.JComboBox<String> filterRating;
    private javax.swing.JLabel filterRatingLabel;
    private javax.swing.JTextArea inputDescription;
    private javax.swing.JTextField inputItemName;
    private javax.swing.JTextField inputPrice;
    private javax.swing.JSpinner inputQuantity;
    private javax.swing.JTextField inputSearchCustomer;
    private javax.swing.JLabel itemNameLaebl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listFeedbackLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JLabel searchCustomerLabel;
    private javax.swing.JButton searchFeedbackBtn;
    private javax.swing.JLabel searchFeedbackLabel;
    // End of variables declaration//GEN-END:variables
}
