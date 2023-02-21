package oodms.customer;

import java.awt.Font;
import javax.swing.JOptionPane;
import oodms.general.MarketStorePage;
import oodms.general.WelcomePage;

public class CustomerDashboard extends javax.swing.JFrame {

    // Accept customer username
    private static String acceptCustomerUsername;
    
    /**
     * Creates new form AdminDashboard
     * @param acceptCustomerUsername
     */
    public CustomerDashboard(String acceptCustomerUsername) {
        initComponents();
        
        CustomerDashboard.acceptCustomerUsername = acceptCustomerUsername;
        
        customerUsernameLabel.setText(acceptCustomerUsername);
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
        logoutBtn = new javax.swing.JButton();
        functionLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        profileMgmtBtn = new javax.swing.JLabel();
        cartMgmtBtn = new javax.swing.JLabel();
        orderHistoryBtn = new javax.swing.JLabel();
        feedbackHistoryBtn = new javax.swing.JLabel();
        shippingLabel = new javax.swing.JLabel();
        deliveringLabel = new javax.swing.JLabel();
        browseBtn = new javax.swing.JButton();
        customerUsernameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayDeliveringTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayShippingTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AdminPanel.setBackground(new java.awt.Color(250, 242, 224));

        welcomeBackLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        welcomeBackLabel.setForeground(new java.awt.Color(76, 43, 24));
        welcomeBackLabel.setText("Welcome back!");

        profileIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodms/images/customer.png"))); // NOI18N

        logoutBtn.setBackground(new java.awt.Color(184, 145, 104));
        logoutBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(76, 43, 24));
        logoutBtn.setText("Log Out");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        functionLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        functionLabel.setForeground(new java.awt.Color(76, 43, 24));
        functionLabel.setText("Functions");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        profileMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        profileMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        profileMgmtBtn.setText("Profile Management");
        profileMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMgmtBtnMouseClicked(evt);
            }
        });

        cartMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        cartMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        cartMgmtBtn.setText("Cart Management");
        cartMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMgmtBtnMouseClicked(evt);
            }
        });

        orderHistoryBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        orderHistoryBtn.setForeground(new java.awt.Color(76, 43, 24));
        orderHistoryBtn.setText("Order History");
        orderHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderHistoryBtnMouseClicked(evt);
            }
        });

        feedbackHistoryBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        feedbackHistoryBtn.setForeground(new java.awt.Color(76, 43, 24));
        feedbackHistoryBtn.setText("Feedback History");
        feedbackHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackHistoryBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feedbackHistoryBtn)
                    .addComponent(orderHistoryBtn)
                    .addComponent(cartMgmtBtn)
                    .addComponent(profileMgmtBtn))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(profileMgmtBtn)
                .addGap(30, 30, 30)
                .addComponent(cartMgmtBtn)
                .addGap(30, 30, 30)
                .addComponent(orderHistoryBtn)
                .addGap(31, 31, 31)
                .addComponent(feedbackHistoryBtn)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        shippingLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        shippingLabel.setForeground(new java.awt.Color(76, 43, 24));
        shippingLabel.setText("Shipping");

        deliveringLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        deliveringLabel.setForeground(new java.awt.Color(76, 43, 24));
        deliveringLabel.setText("Delivering");

        browseBtn.setBackground(new java.awt.Color(184, 145, 104));
        browseBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        browseBtn.setForeground(new java.awt.Color(76, 43, 24));
        browseBtn.setText("Browse");
        browseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtnActionPerformed(evt);
            }
        });

        customerUsernameLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        customerUsernameLabel.setForeground(new java.awt.Color(76, 43, 24));
        customerUsernameLabel.setText("Username");

        displayDeliveringTable.setBackground(new java.awt.Color(230, 207, 201));
        displayDeliveringTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayDeliveringTable.setForeground(new java.awt.Color(76, 43, 24));
        displayDeliveringTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(displayDeliveringTable);
        // Change Table Header Font
        displayDeliveringTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        displayShippingTable.setBackground(new java.awt.Color(230, 207, 201));
        displayShippingTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayShippingTable.setForeground(new java.awt.Color(76, 43, 24));
        displayShippingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(displayShippingTable);
        // Change Table Header Font
        displayShippingTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(profileIconLabel)
                        .addGap(39, 39, 39)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addComponent(logoutBtn)
                                .addGap(27, 27, 27)
                                .addComponent(browseBtn))
                            .addGroup(AdminPanelLayout.createSequentialGroup()
                                .addComponent(welcomeBackLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customerUsernameLabel))))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(functionLabel)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shippingLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deliveringLabel)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(welcomeBackLabel)
                            .addComponent(customerUsernameLabel))
                        .addGap(31, 31, 31)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logoutBtn)
                            .addComponent(browseBtn)))
                    .addComponent(profileIconLabel))
                .addGap(64, 64, 64)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionLabel)
                    .addComponent(shippingLabel))
                .addGap(18, 18, 18)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deliveringLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void browseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtnActionPerformed
        new MarketStorePage(acceptCustomerUsername).setVisible(true);
        dispose();
    }//GEN-LAST:event_browseBtnActionPerformed

    private void profileMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMgmtBtnMouseClicked
        new ProfileMgmtDisplay(acceptCustomerUsername).setVisible(true);
        dispose();
    }//GEN-LAST:event_profileMgmtBtnMouseClicked

    private void cartMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMgmtBtnMouseClicked
        new CartMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_cartMgmtBtnMouseClicked

    private void orderHistoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderHistoryBtnMouseClicked
        new OrderHistoryDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_orderHistoryBtnMouseClicked

    private void feedbackHistoryBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackHistoryBtnMouseClicked
        new FeedbackHistoryDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_feedbackHistoryBtnMouseClicked

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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard(acceptCustomerUsername).setVisible(true);
            }
        });
        
        // Set Label Image
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JButton browseBtn;
    private javax.swing.JLabel cartMgmtBtn;
    private javax.swing.JLabel customerUsernameLabel;
    private javax.swing.JLabel deliveringLabel;
    private javax.swing.JTable displayDeliveringTable;
    private javax.swing.JTable displayShippingTable;
    private javax.swing.JLabel feedbackHistoryBtn;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel orderHistoryBtn;
    private javax.swing.JLabel profileIconLabel;
    private javax.swing.JLabel profileMgmtBtn;
    private javax.swing.JLabel shippingLabel;
    private javax.swing.JLabel welcomeBackLabel;
    // End of variables declaration//GEN-END:variables
}
