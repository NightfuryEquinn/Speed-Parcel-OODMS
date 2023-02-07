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
public class FeedbackMgmtDisplay extends javax.swing.JFrame {

    /**
     * Creates new form FeedbackMgmtDisplay
     */
    public FeedbackMgmtDisplay() {
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

        feedbackMgmtPanel = new javax.swing.JPanel();
        feedbackMgmtLabel = new javax.swing.JLabel();
        searchFeedbackLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchFeedbackIDLabel = new javax.swing.JLabel();
        inputFeedbackID = new javax.swing.JTextField();
        searchFeedbackIDBtn = new javax.swing.JButton();
        detailLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        customerNameLabel = new javax.swing.JLabel();
        feedbackLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputFeedback = new javax.swing.JTextArea();
        inputCustomerName = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayFeedbackTable = new javax.swing.JTable();
        listFeedbackLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        feedbackMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        feedbackMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        feedbackMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        feedbackMgmtLabel.setText("Feedback Management");

        searchFeedbackLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        searchFeedbackLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchFeedbackLabel.setText("Search");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        searchFeedbackIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchFeedbackIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchFeedbackIDLabel.setText("Enter ID:");

        inputFeedbackID.setBackground(new java.awt.Color(184, 145, 104));
        inputFeedbackID.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputFeedbackID.setForeground(new java.awt.Color(76, 43, 24));

        searchFeedbackIDBtn.setBackground(new java.awt.Color(184, 145, 104));
        searchFeedbackIDBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        searchFeedbackIDBtn.setForeground(new java.awt.Color(76, 43, 24));
        searchFeedbackIDBtn.setText("Search");

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchFeedbackIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputFeedbackID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(searchFeedbackIDBtn)
                .addGap(16, 16, 16))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFeedbackIDLabel)
                    .addComponent(inputFeedbackID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchFeedbackIDBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        detailLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(76, 43, 24));
        detailLabel.setText("Details");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

        customerNameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        customerNameLabel.setForeground(new java.awt.Color(76, 43, 24));
        customerNameLabel.setText("Customer Name:");

        feedbackLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        feedbackLabel.setForeground(new java.awt.Color(76, 43, 24));
        feedbackLabel.setText("Feedback:");

        inputFeedback.setEditable(false);
        inputFeedback.setBackground(new java.awt.Color(184, 145, 104));
        inputFeedback.setColumns(20);
        inputFeedback.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputFeedback.setForeground(new java.awt.Color(76, 43, 24));
        inputFeedback.setLineWrap(true);
        inputFeedback.setRows(5);
        jScrollPane1.setViewportView(inputFeedback);

        inputCustomerName.setEditable(false);
        inputCustomerName.setBackground(new java.awt.Color(184, 145, 104));
        inputCustomerName.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputCustomerName.setForeground(new java.awt.Color(76, 43, 24));

        deleteBtn.setBackground(new java.awt.Color(184, 145, 104));
        deleteBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(76, 43, 24));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(deleteBtn))
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerNameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(feedbackLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(inputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feedbackLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(deleteBtn)
                .addGap(14, 14, 14))
        );

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");

        displayFeedbackTable.setBackground(new java.awt.Color(230, 207, 201));
        displayFeedbackTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayFeedbackTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayFeedbackTable.setForeground(new java.awt.Color(76, 43, 24));
        displayFeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"F0001", "John Doe", "This is epic!"},
                {"F0002", "Alvin Doe", "Sucks... badly delivered."},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Feedback ID", "Customer Name", "Feedback"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        displayFeedbackTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayFeedbackTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayFeedbackTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayFeedbackTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(displayFeedbackTable);
        // Change Table Header Font
        displayFeedbackTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayFeedbackTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(125);
        columnModel.getColumn(2).setPreferredWidth(375);

        listFeedbackLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listFeedbackLabel.setForeground(new java.awt.Color(76, 43, 24));
        listFeedbackLabel.setText("List");

        javax.swing.GroupLayout feedbackMgmtPanelLayout = new javax.swing.GroupLayout(feedbackMgmtPanel);
        feedbackMgmtPanel.setLayout(feedbackMgmtPanelLayout);
        feedbackMgmtPanelLayout.setHorizontalGroup(
            feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backBtn)
                            .addComponent(feedbackMgmtLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailLabel)
                            .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchFeedbackLabel)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
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
                .addGap(18, 18, 18)
                .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(searchFeedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(detailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(listFeedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(20, 20, 20))
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

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(FeedbackMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeedbackMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeedbackMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeedbackMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedbackMgmtDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTable displayFeedbackTable;
    private javax.swing.JLabel feedbackLabel;
    private javax.swing.JLabel feedbackMgmtLabel;
    private javax.swing.JPanel feedbackMgmtPanel;
    private javax.swing.JTextField inputCustomerName;
    private javax.swing.JTextArea inputFeedback;
    private javax.swing.JTextField inputFeedbackID;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listFeedbackLabel;
    private javax.swing.JButton searchFeedbackIDBtn;
    private javax.swing.JLabel searchFeedbackIDLabel;
    private javax.swing.JLabel searchFeedbackLabel;
    // End of variables declaration//GEN-END:variables
}