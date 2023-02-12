/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oodms.deliver;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import oodms.general.WelcomePage;

/**
 *
 * @author asus
 */
public class staffDashboard extends javax.swing.JFrame {

    /**
     * Creates new form staff
     */
    public staffDashboard() {
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

        AdminPanel = new javax.swing.JPanel();
        welcomeBackLabel = new javax.swing.JLabel();
        profileIconLabel = new javax.swing.JLabel();
        functionLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        DeliveryBT = new javax.swing.JLabel();
        HistoryBT = new javax.swing.JLabel();
        infoLB = new javax.swing.JLabel();
        backgroundPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DeliveryTable = new javax.swing.JTable();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        AdminPanel.setBackground(new java.awt.Color(250, 242, 224));

        welcomeBackLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        welcomeBackLabel.setForeground(new java.awt.Color(76, 43, 24));
        welcomeBackLabel.setText("Hi, Deliver!");

        profileIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodms/images/admin.png"))); // NOI18N

        functionLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        functionLabel.setForeground(new java.awt.Color(76, 43, 24));
        functionLabel.setText("Functions");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        DeliveryBT.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        DeliveryBT.setForeground(new java.awt.Color(76, 43, 24));
        DeliveryBT.setText("Delivery Management");
        DeliveryBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeliveryBTMouseClicked(evt);
            }
        });

        HistoryBT.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        HistoryBT.setForeground(new java.awt.Color(76, 43, 24));
        HistoryBT.setText("History Management");
        HistoryBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistoryBTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HistoryBT)
                    .addComponent(DeliveryBT))
                .addGap(35, 35, 35))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(DeliveryBT)
                .addGap(18, 18, 18)
                .addComponent(HistoryBT)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        infoLB.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        infoLB.setForeground(new java.awt.Color(76, 43, 24));
        infoLB.setText("Order Info");

        backgroundPanel3.setBackground(new java.awt.Color(230, 207, 201));

        DeliveryTable.setBackground(new java.awt.Color(230, 207, 201));
        DeliveryTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DeliveryTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        DeliveryTable.setForeground(new java.awt.Color(76, 43, 24));
        DeliveryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Delivery ID", "Username", "Address", "Delivery Status"
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
        DeliveryTable.setGridColor(new java.awt.Color(230, 207, 201));
        DeliveryTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        DeliveryTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        jScrollPane2.setViewportView(DeliveryTable);
        // Change Table Header Font
        DeliveryTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = DeliveryTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(150);
        columnModel.getColumn(1).setPreferredWidth(150);
        columnModel.getColumn(2).setPreferredWidth(150);
        columnModel.getColumn(3).setPreferredWidth(150);

        javax.swing.GroupLayout backgroundPanel3Layout = new javax.swing.GroupLayout(backgroundPanel3);
        backgroundPanel3.setLayout(backgroundPanel3Layout);
        backgroundPanel3Layout.setHorizontalGroup(
            backgroundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        backgroundPanel3Layout.setVerticalGroup(
            backgroundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );

        logoutBtn.setBackground(new java.awt.Color(184, 145, 104));
        logoutBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(76, 43, 24));
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(backgroundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(logoutBtn))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(infoLB))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(profileIconLabel)
                        .addGap(18, 18, 18)
                        .addComponent(welcomeBackLabel)))
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(functionLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileIconLabel)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(welcomeBackLabel)
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(functionLabel)))
                        .addGap(32, 32, 32)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoutBtn)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(infoLB)
                .addGap(18, 18, 18)
                .addComponent(backgroundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        System.out.println("Logout");
        
        // Go back to WelcomePage
        new WelcomePage().setVisible(true);
        dispose();
        
        JOptionPane.showMessageDialog(null, "You have logged out.", "Logout Successful", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void DeliveryBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeliveryBTMouseClicked
        // Delivery Label
        
        // Go to Delivery page
        new DeliveryMgmt().setVisible(true);
        dispose();
    }//GEN-LAST:event_DeliveryBTMouseClicked

    private void HistoryBTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistoryBTMouseClicked
        // History Label
        
        // Go to History page
        new HistoryMgmt().setVisible(true);
        dispose();
    }//GEN-LAST:event_HistoryBTMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // When window open

        // Import text file to table
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staffDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staffDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JLabel DeliveryBT;
    private javax.swing.JTable DeliveryTable;
    private javax.swing.JLabel HistoryBT;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel3;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JLabel infoLB;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel profileIconLabel;
    private javax.swing.JLabel welcomeBackLabel;
    // End of variables declaration//GEN-END:variables
}