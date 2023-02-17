/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodms.admin;

import java.awt.Font;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author User
 */
public class PaymentMgmtDisplay extends javax.swing.JFrame {

    /**
     * Creates new form PaymentMgmtDisplay
     */
    public PaymentMgmtDisplay() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paymentMgmtPanel = new javax.swing.JPanel();
        paymentMgmtLabel = new javax.swing.JLabel();
        searchPaymentLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchCustomerNameLabel = new javax.swing.JLabel();
        inputSearchCustomerName = new javax.swing.JTextField();
        searchPaymentBtn = new javax.swing.JButton();
        searchFilterPaidLabel = new javax.swing.JLabel();
        inputSearchFilterPaid = new javax.swing.JComboBox<>();
        detailLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        paymentIDLabel = new javax.swing.JLabel();
        inputPaymentID = new javax.swing.JTextField();
        shippingLabel = new javax.swing.JLabel();
        inputShipping = new javax.swing.JTextField();
        totalPriceLabel = new javax.swing.JLabel();
        inputTotalPrice = new javax.swing.JTextField();
        amountPayableLabel = new javax.swing.JLabel();
        inputAmountPayable = new javax.swing.JTextField();
        orderIDLabel = new javax.swing.JLabel();
        inputOrderID = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        inputCustomerName = new javax.swing.JTextField();
        filterPaidLabel = new javax.swing.JLabel();
        inputFilterPaid = new javax.swing.JTextField();
        inputProcessFee = new javax.swing.JTextField();
        processFeeLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        listPaymentLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayPaymentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paymentMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        paymentMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        paymentMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        paymentMgmtLabel.setText("Payment Management");

        searchPaymentLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        searchPaymentLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchPaymentLabel.setText("Search");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        searchCustomerNameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchCustomerNameLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchCustomerNameLabel.setText("Enter Name:");

        inputSearchCustomerName.setBackground(new java.awt.Color(184, 145, 104));
        inputSearchCustomerName.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputSearchCustomerName.setForeground(new java.awt.Color(76, 43, 24));

        searchPaymentBtn.setBackground(new java.awt.Color(184, 145, 104));
        searchPaymentBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        searchPaymentBtn.setForeground(new java.awt.Color(76, 43, 24));
        searchPaymentBtn.setText("Search");
        searchPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPaymentBtnActionPerformed(evt);
            }
        });

        searchFilterPaidLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchFilterPaidLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchFilterPaidLabel.setText("Filter Paid:");

        inputSearchFilterPaid.setBackground(new java.awt.Color(184, 145, 104));
        inputSearchFilterPaid.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputSearchFilterPaid.setForeground(new java.awt.Color(76, 43, 24));
        inputSearchFilterPaid.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(searchCustomerNameLabel)
                    .addComponent(searchFilterPaidLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(inputSearchFilterPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(backgroundPanel1Layout.createSequentialGroup()
                        .addComponent(inputSearchCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(searchPaymentBtn)
                        .addGap(16, 16, 16))))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCustomerNameLabel)
                    .addComponent(inputSearchCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchPaymentBtn))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFilterPaidLabel)
                    .addComponent(inputSearchFilterPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        detailLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(76, 43, 24));
        detailLabel.setText("Details");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

        paymentIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        paymentIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        paymentIDLabel.setText("Payment ID:");

        inputPaymentID.setEditable(false);
        inputPaymentID.setBackground(new java.awt.Color(184, 145, 104));
        inputPaymentID.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputPaymentID.setForeground(new java.awt.Color(76, 43, 24));

        shippingLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        shippingLabel.setForeground(new java.awt.Color(76, 43, 24));
        shippingLabel.setText("Shipment Fees:");

        inputShipping.setEditable(false);
        inputShipping.setBackground(new java.awt.Color(184, 145, 104));
        inputShipping.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputShipping.setForeground(new java.awt.Color(76, 43, 24));
        inputShipping.setText("RM5");

        totalPriceLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        totalPriceLabel.setForeground(new java.awt.Color(76, 43, 24));
        totalPriceLabel.setText("Total Price (RM):");

        inputTotalPrice.setEditable(false);
        inputTotalPrice.setBackground(new java.awt.Color(184, 145, 104));
        inputTotalPrice.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputTotalPrice.setForeground(new java.awt.Color(76, 43, 24));

        amountPayableLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        amountPayableLabel.setForeground(new java.awt.Color(76, 43, 24));
        amountPayableLabel.setText("Amount Payable:");

        inputAmountPayable.setEditable(false);
        inputAmountPayable.setBackground(new java.awt.Color(184, 145, 104));
        inputAmountPayable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputAmountPayable.setForeground(new java.awt.Color(76, 43, 24));

        orderIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        orderIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        orderIDLabel.setText("Order ID:");

        inputOrderID.setEditable(false);
        inputOrderID.setBackground(new java.awt.Color(184, 145, 104));
        inputOrderID.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputOrderID.setForeground(new java.awt.Color(76, 43, 24));

        customerNameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        customerNameLabel.setForeground(new java.awt.Color(76, 43, 24));
        customerNameLabel.setText("Customer Name:");

        inputCustomerName.setEditable(false);
        inputCustomerName.setBackground(new java.awt.Color(184, 145, 104));
        inputCustomerName.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputCustomerName.setForeground(new java.awt.Color(76, 43, 24));

        filterPaidLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        filterPaidLabel.setForeground(new java.awt.Color(76, 43, 24));
        filterPaidLabel.setText("Filter Paid:");

        inputFilterPaid.setEditable(false);
        inputFilterPaid.setBackground(new java.awt.Color(184, 145, 104));
        inputFilterPaid.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputFilterPaid.setForeground(new java.awt.Color(76, 43, 24));

        inputProcessFee.setEditable(false);
        inputProcessFee.setBackground(new java.awt.Color(184, 145, 104));
        inputProcessFee.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputProcessFee.setForeground(new java.awt.Color(76, 43, 24));

        processFeeLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        processFeeLabel.setForeground(new java.awt.Color(76, 43, 24));
        processFeeLabel.setText("Process Fee (4%):");

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(backgroundPanel2Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(amountPayableLabel))
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(shippingLabel)
                            .addComponent(processFeeLabel)
                            .addComponent(customerNameLabel)
                            .addComponent(filterPaidLabel)
                            .addComponent(orderIDLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paymentIDLabel)))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(inputPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(inputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(inputFilterPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(inputProcessFee, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inputShipping, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inputTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inputAmountPayable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentIDLabel)
                    .addComponent(inputPaymentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderIDLabel)
                    .addComponent(inputOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(inputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterPaidLabel)
                    .addComponent(inputFilterPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputProcessFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(processFeeLabel))
                .addGap(12, 12, 12)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputShipping, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shippingLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(inputTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountPayableLabel)
                    .addComponent(inputAmountPayable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        listPaymentLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listPaymentLabel.setForeground(new java.awt.Color(76, 43, 24));
        listPaymentLabel.setText("List");

        displayPaymentTable.setBackground(new java.awt.Color(230, 207, 201));
        displayPaymentTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayPaymentTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayPaymentTable.setForeground(new java.awt.Color(76, 43, 24));
        displayPaymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Payment ID", "Order ID", "Customer Name", "Filter Paid", "Total Price (RM)", "Amount Payable"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayPaymentTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayPaymentTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayPaymentTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayPaymentTable.setShowVerticalLines(true);
        displayPaymentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayPaymentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(displayPaymentTable);
        // Change Table Header Font
        displayPaymentTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayPaymentTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(75);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(75);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);

        javax.swing.GroupLayout paymentMgmtPanelLayout = new javax.swing.GroupLayout(paymentMgmtPanel);
        paymentMgmtPanel.setLayout(paymentMgmtPanelLayout);
        paymentMgmtPanelLayout.setHorizontalGroup(
            paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentMgmtPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentMgmtPanelLayout.createSequentialGroup()
                        .addGroup(paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(paymentMgmtLabel))
                        .addContainerGap(792, Short.MAX_VALUE))
                    .addGroup(paymentMgmtPanelLayout.createSequentialGroup()
                        .addGroup(paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchPaymentLabel)
                            .addComponent(detailLabel)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listPaymentLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        paymentMgmtPanelLayout.setVerticalGroup(
            paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentMgmtPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(paymentMgmtLabel)
                .addGap(18, 18, 18)
                .addGroup(paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchPaymentLabel)
                    .addComponent(listPaymentLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paymentMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentMgmtPanelLayout.createSequentialGroup()
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(detailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(paymentMgmtPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addComponent(backBtn)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPaymentBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchPaymentBtnActionPerformed

    private void displayPaymentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayPaymentTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_displayPaymentTableMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new AdminDashboard().setVisible(true);
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
            java.util.logging.Logger.getLogger(PaymentMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentMgmtDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountPayableLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTable displayPaymentTable;
    private javax.swing.JLabel filterPaidLabel;
    private javax.swing.JTextField inputAmountPayable;
    private javax.swing.JTextField inputCustomerName;
    private javax.swing.JTextField inputFilterPaid;
    private javax.swing.JTextField inputOrderID;
    private javax.swing.JTextField inputPaymentID;
    private javax.swing.JTextField inputProcessFee;
    private javax.swing.JTextField inputSearchCustomerName;
    private javax.swing.JComboBox<String> inputSearchFilterPaid;
    private javax.swing.JTextField inputShipping;
    private javax.swing.JTextField inputTotalPrice;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listPaymentLabel;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel paymentIDLabel;
    private javax.swing.JLabel paymentMgmtLabel;
    private javax.swing.JPanel paymentMgmtPanel;
    private javax.swing.JLabel processFeeLabel;
    private javax.swing.JLabel searchCustomerNameLabel;
    private javax.swing.JLabel searchFilterPaidLabel;
    private javax.swing.JButton searchPaymentBtn;
    private javax.swing.JLabel searchPaymentLabel;
    private javax.swing.JLabel shippingLabel;
    private javax.swing.JLabel totalPriceLabel;
    // End of variables declaration//GEN-END:variables
}
