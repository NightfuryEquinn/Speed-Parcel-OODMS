package oodms.deliver;

import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oodms.oop.Create3DArray;

public class FeedbackViewDisplay extends javax.swing.JFrame {

    // Accept staff username
    private static String acceptUsername;

    /**
     * Creates new form FeedbackViewDisplay
     * @param acceptUsername
     */
    public FeedbackViewDisplay(String acceptUsername) {
        initComponents();
        
        FeedbackViewDisplay.acceptUsername = acceptUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feedbackViewPanel = new javax.swing.JPanel();
        deliveryFeedbackLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewFeedbackTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivery Feedback");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        feedbackViewPanel.setBackground(new java.awt.Color(250, 242, 224));

        deliveryFeedbackLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        deliveryFeedbackLabel.setForeground(new java.awt.Color(76, 43, 24));
        deliveryFeedbackLabel.setText("Delivery Feedback");

        viewFeedbackTable.setBackground(new java.awt.Color(230, 207, 201));
        viewFeedbackTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        viewFeedbackTable.setForeground(new java.awt.Color(76, 43, 24));
        viewFeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer", "Customer Rating", "Customer Feedback"
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
        jScrollPane2.setViewportView(viewFeedbackTable);
        // Change Table Header Font
        viewFeedbackTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = viewFeedbackTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);;
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(125);
        columnModel.getColumn(3).setPreferredWidth(300);

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout feedbackViewPanelLayout = new javax.swing.GroupLayout(feedbackViewPanel);
        feedbackViewPanel.setLayout(feedbackViewPanelLayout);
        feedbackViewPanelLayout.setHorizontalGroup(
            feedbackViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackViewPanelLayout.createSequentialGroup()
                .addGroup(feedbackViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackViewPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(feedbackViewPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(feedbackViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(deliveryFeedbackLabel))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        feedbackViewPanelLayout.setVerticalGroup(
            feedbackViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackViewPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(deliveryFeedbackLabel)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(feedbackViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(feedbackViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel feedbackTable = (DefaultTableModel) viewFeedbackTable.getModel();
        feedbackTable.setRowCount(0);
        
        String[][] getDeliveryDataArr = new Create3DArray().create3D("/oodms/database/delivery.txt");
        String[][] getFeedbackDataArr = new Create3DArray().create3D("/oodms/database/feedback.txt");
        
        for(int i = 0; i < getDeliveryDataArr.length; i++) {
            if(getDeliveryDataArr[i][0].equals(acceptUsername)) {
                if(getDeliveryDataArr[i][2].equals("Delivered")) {
                    if(getFeedbackDataArr[i][0].equals(getDeliveryDataArr[i][1])) {
                        feedbackTable.addRow(getFeedbackDataArr[i]);
                    }
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new StaffDashboard(acceptUsername).setVisible(true);
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
            java.util.logging.Logger.getLogger(FeedbackViewDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackViewDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackViewDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackViewDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackViewDisplay(acceptUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel deliveryFeedbackLabel;
    private javax.swing.JPanel feedbackViewPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable viewFeedbackTable;
    // End of variables declaration//GEN-END:variables
}
