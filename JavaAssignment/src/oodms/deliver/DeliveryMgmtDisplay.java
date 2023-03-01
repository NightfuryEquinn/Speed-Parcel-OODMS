package oodms.deliver;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oodms.oop.Create3DArray;
import oodms.oop.FlushAndWrite;
import oodms.oop.SaveSelected;

public class DeliveryMgmtDisplay extends javax.swing.JFrame {

    // Accept staff username
    private static String acceptUsername;

    /**
     * Creates new form DeliveryMgmtDisplay
     * @param acceptUsername
     */
    public DeliveryMgmtDisplay(String acceptUsername) {
        initComponents();
        
        DeliveryMgmtDisplay.acceptUsername = acceptUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deliveryMgmtPanel = new javax.swing.JPanel();
        deliveryOrderLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        acceptOrderTable = new javax.swing.JTable();
        acceptBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivery Orders");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        deliveryMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        deliveryOrderLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        deliveryOrderLabel.setForeground(new java.awt.Color(76, 43, 24));
        deliveryOrderLabel.setText("Delivery Orders");

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        acceptOrderTable.setBackground(new java.awt.Color(230, 207, 201));
        acceptOrderTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        acceptOrderTable.setForeground(new java.awt.Color(76, 43, 24));
        acceptOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Address", "Status"
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
        acceptOrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceptOrderTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(acceptOrderTable);
        // Change Table Header Font
        acceptOrderTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = acceptOrderTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);;
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(75);

        acceptBtn.setBackground(new java.awt.Color(184, 145, 104));
        acceptBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        acceptBtn.setForeground(new java.awt.Color(76, 43, 24));
        acceptBtn.setText("Accept");
        acceptBtn.setEnabled(false);
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        rejectBtn.setBackground(new java.awt.Color(184, 145, 104));
        rejectBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        rejectBtn.setForeground(new java.awt.Color(76, 43, 24));
        rejectBtn.setText("Reject");
        rejectBtn.setEnabled(false);
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });

        refreshBtn.setBackground(new java.awt.Color(184, 145, 104));
        refreshBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        refreshBtn.setForeground(new java.awt.Color(76, 43, 24));
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deliveryMgmtPanelLayout = new javax.swing.GroupLayout(deliveryMgmtPanel);
        deliveryMgmtPanel.setLayout(deliveryMgmtPanelLayout);
        deliveryMgmtPanelLayout.setHorizontalGroup(
            deliveryMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryMgmtPanelLayout.createSequentialGroup()
                .addGroup(deliveryMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deliveryMgmtPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(deliveryMgmtPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(deliveryMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deliveryMgmtPanelLayout.createSequentialGroup()
                                .addComponent(backBtn)
                                .addGap(360, 360, 360)
                                .addComponent(acceptBtn)
                                .addGap(35, 35, 35)
                                .addComponent(rejectBtn)
                                .addGap(32, 32, 32)
                                .addComponent(refreshBtn))
                            .addComponent(deliveryOrderLabel))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        deliveryMgmtPanelLayout.setVerticalGroup(
            deliveryMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryMgmtPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(deliveryOrderLabel)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(deliveryMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(acceptBtn)
                    .addComponent(rejectBtn)
                    .addComponent(refreshBtn))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deliveryMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deliveryMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new StaffDashboard(acceptUsername).setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptOrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceptOrderTableMouseClicked
        acceptBtn.setEnabled(true);
        rejectBtn.setEnabled(true);
    }//GEN-LAST:event_acceptOrderTableMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String[][] getDeliveryDataArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        
        DefaultTableModel acceptTable = (DefaultTableModel) acceptOrderTable.getModel();

        acceptTable.setRowCount(0);

        // Filter unassigned first
        for(String[] getDeliveryData : getDeliveryDataArr) {
            if(getDeliveryData[0].equals(acceptUsername)) {
                if(getDeliveryData[2].equals("Unassigned")) {
                   String[] acceptArr = new String[] {getDeliveryData[1], getDeliveryData[3], getDeliveryData[4], getDeliveryData[2]};
                    acceptTable.addRow(acceptArr);
                }
            }
        }
        
        // Filter ongoing second
        for(String[] getDeliveryData : getDeliveryDataArr) {
            if(getDeliveryData[0].equals(acceptUsername)) {
                if(getDeliveryData[2].equals("Ongoing")) {
                   String[] acceptArr = new String[] {getDeliveryData[1], getDeliveryData[3], getDeliveryData[4], getDeliveryData[2]};
                    acceptTable.addRow(acceptArr);
                }
            }
        }
        
        // Filter delivered last
        for(String[] getDeliveryData : getDeliveryDataArr) {
            if(getDeliveryData[0].equals(acceptUsername)) {
                if(getDeliveryData[2].equals("Delivered")) {
                   String[] acceptArr = new String[] {getDeliveryData[1], getDeliveryData[3], getDeliveryData[4], getDeliveryData[2]};
                    acceptTable.addRow(acceptArr);
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        int selectedRow = acceptOrderTable.getSelectedRow();
        
        String getTheRowOrderID = (String) acceptOrderTable.getValueAt(selectedRow, 0);
        String getTheRowCustomer = (String) acceptOrderTable.getValueAt(selectedRow, 1);
        String getTheRowCustomerAddress = (String) acceptOrderTable.getValueAt(selectedRow, 2);
        String getTheRowOrderStatus = (String) acceptOrderTable.getValueAt(selectedRow, 3);
        
        if((getTheRowOrderStatus.equals("Ongoing")) || (getTheRowOrderStatus.equals("Delivered"))) {
            JOptionPane.showMessageDialog(null, "You has already accepted or delivered this order. It will remain as a part of your delivery history.", "Past Order", JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("Do nothing");
        } else {
            String confirmAcceptMessage = "Are you sure to accept " + getTheRowCustomer + "'s order. The customer address will be " + getTheRowCustomerAddress + ".";
            int confirmAccept = JOptionPane.showConfirmDialog(null, confirmAcceptMessage, "Confirm accept order?", JOptionPane.YES_NO_OPTION);
        
            if(confirmAccept == JOptionPane.YES_OPTION) {
                String[][] newChangesArrToSave = new SaveSelected().saveStatus("Ongoing", acceptUsername, getTheRowOrderID);
                
                FlushAndWrite faw = new FlushAndWrite();
                faw.flushAndWrite(newChangesArrToSave, "src/oodms/database/delivery.txt");
                
                JOptionPane.showMessageDialog(null, "Please proceed to Speed Parcel warehouse to collect the parcel.\nHave a safe journey.", "Order accepted", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                System.out.println("Do nothing");
            }
        }
        
        // Disable button
        acceptBtn.setEnabled(false);
        rejectBtn.setEnabled(false);
        
        // Clear table
        DefaultTableModel acceptTable = (DefaultTableModel) acceptOrderTable.getModel();
        acceptTable.setRowCount(0);
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        int selectedRow = acceptOrderTable.getSelectedRow();
        
        String getTheRowOrderID = (String) acceptOrderTable.getValueAt(selectedRow, 0);
        String getTheRowCustomer = (String) acceptOrderTable.getValueAt(selectedRow, 1);
        String getTheRowOrderStatus = (String) acceptOrderTable.getValueAt(selectedRow, 3);
        
        if(!getTheRowOrderStatus.equals("Delivered")) {
            String confirmRejectMessage = "Are you sure to reject " + getTheRowCustomer + "'s order. The order will be assigned to another delivery staff.";
            int confirmReject = JOptionPane.showConfirmDialog(null, confirmRejectMessage, "Confirm reject order?", JOptionPane.YES_NO_OPTION);
            
            if(confirmReject == JOptionPane.YES_OPTION) {
                String[][] newChangesArrToSave = new SaveSelected().saveStatus("Unassigned", "Unknown", getTheRowOrderID);
            
                FlushAndWrite faw = new FlushAndWrite();
                faw.flushAndWrite(newChangesArrToSave, "src/oodms/database/delivery.txt");
            } else {
                System.out.println("Do nothing");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "You has already accepted or delivered this order. It will remain as a part of your delivery history.", "Past Order", JOptionPane.INFORMATION_MESSAGE);
        
            System.out.println("Do nothing");
        }
        
        // Disable button
        acceptBtn.setEnabled(false);
        rejectBtn.setEnabled(false);
        
        // Clear table
        DefaultTableModel acceptTable = (DefaultTableModel) acceptOrderTable.getModel();
        acceptTable.setRowCount(0);
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // Disable button
        acceptBtn.setEnabled(false);
        rejectBtn.setEnabled(false);
        
        // Refresh table
        String[][] getDeliveryDataArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        
        DefaultTableModel acceptTable = (DefaultTableModel) acceptOrderTable.getModel();

        acceptTable.setRowCount(0);

        // Filter unassigned first
        for(String[] getDeliveryData : getDeliveryDataArr) {
            if(getDeliveryData[0].equals(acceptUsername)) {
                if(getDeliveryData[2].equals("Unassigned")) {
                   String[] acceptArr = new String[] {getDeliveryData[1], getDeliveryData[3], getDeliveryData[4], getDeliveryData[2]};
                    acceptTable.addRow(acceptArr);
                }
            }
        }
        
        // Filter ongoing second
        for(String[] getDeliveryData : getDeliveryDataArr) {
            if(getDeliveryData[0].equals(acceptUsername)) {
                if(getDeliveryData[2].equals("Ongoing")) {
                   String[] acceptArr = new String[] {getDeliveryData[1], getDeliveryData[3], getDeliveryData[4], getDeliveryData[2]};
                    acceptTable.addRow(acceptArr);
                }
            }
        }
        
        // Filter delivered last
        for(String[] getDeliveryData : getDeliveryDataArr) {
            if(getDeliveryData[0].equals(acceptUsername)) {
                if(getDeliveryData[2].equals("Delivered")) {
                   String[] acceptArr = new String[] {getDeliveryData[1], getDeliveryData[3], getDeliveryData[4], getDeliveryData[2]};
                    acceptTable.addRow(acceptArr);
                }
            }
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeliveryMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliveryMgmtDisplay(acceptUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JTable acceptOrderTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel deliveryMgmtPanel;
    private javax.swing.JLabel deliveryOrderLabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton rejectBtn;
    // End of variables declaration//GEN-END:variables
}
