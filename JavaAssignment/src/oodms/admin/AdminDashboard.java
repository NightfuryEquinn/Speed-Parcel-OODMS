package oodms.admin;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import oodms.general.WelcomePage;
import oodms.oop.MouseHover;

public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();

        // Add mouse hover event
        String[] componentTexts = new String[] {
            "User Management",
            "Item Management",
            "Category Management",
            "Delivery Management",
            "Feedback Management",
            "Order Management",
            "Payment Management",
            "Category Sales Report",
            "User Gender Report",
            "User Age Report"
        };
        
        JPanel[] allJPanel = new JPanel[] {backgroundPanel1, backgroundPanel2, backgroundPanel3};
        
        MouseHover mh = new MouseHover();
        mh.mouseHoverEffect(componentTexts, allJPanel);
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
        userMgmtBtn = new javax.swing.JLabel();
        catMgmtBtn = new javax.swing.JLabel();
        feedbackMgmtBtn = new javax.swing.JLabel();
        itemMgmtBtn = new javax.swing.JLabel();
        deliveryMgmtBtn = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        orderMgmtBtn = new javax.swing.JLabel();
        paymentMgmtBtn = new javax.swing.JLabel();
        reportLabel = new javax.swing.JLabel();
        backgroundPanel3 = new javax.swing.JPanel();
        categorySalesBtn = new javax.swing.JLabel();
        userGenderBtn = new javax.swing.JLabel();
        userAgeBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Dashboard");

        AdminPanel.setBackground(new java.awt.Color(250, 242, 224));

        welcomeBackLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        welcomeBackLabel.setForeground(new java.awt.Color(76, 43, 24));
        welcomeBackLabel.setText("Welcome back, Admin!");

        profileIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/oodms/images/admin.png"))); // NOI18N

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

        userMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        userMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        userMgmtBtn.setText("User Management");
        userMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMgmtBtnMouseClicked(evt);
            }
        });

        catMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        catMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        catMgmtBtn.setText("Category Management");
        catMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catMgmtBtnMouseClicked(evt);
            }
        });

        feedbackMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        feedbackMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        feedbackMgmtBtn.setText("Feedback Management");
        feedbackMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackMgmtBtnMouseClicked(evt);
            }
        });

        itemMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        itemMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        itemMgmtBtn.setText("Item Management");
        itemMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemMgmtBtnMouseClicked(evt);
            }
        });

        deliveryMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        deliveryMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        deliveryMgmtBtn.setText("Delivery Management");
        deliveryMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deliveryMgmtBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deliveryMgmtBtn)
                    .addComponent(itemMgmtBtn)
                    .addComponent(feedbackMgmtBtn)
                    .addComponent(catMgmtBtn)
                    .addComponent(userMgmtBtn))
                .addGap(47, 47, 47))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(userMgmtBtn)
                .addGap(28, 28, 28)
                .addComponent(catMgmtBtn)
                .addGap(28, 28, 28)
                .addComponent(itemMgmtBtn)
                .addGap(27, 27, 27)
                .addComponent(deliveryMgmtBtn)
                .addGap(27, 27, 27)
                .addComponent(feedbackMgmtBtn)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        customerLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        customerLabel.setForeground(new java.awt.Color(76, 43, 24));
        customerLabel.setText("Customer");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

        orderMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        orderMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        orderMgmtBtn.setText("Order Management");
        orderMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMgmtBtnMouseClicked(evt);
            }
        });

        paymentMgmtBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        paymentMgmtBtn.setForeground(new java.awt.Color(76, 43, 24));
        paymentMgmtBtn.setText("Payment Management");
        paymentMgmtBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMgmtBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paymentMgmtBtn)
                    .addComponent(orderMgmtBtn))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(orderMgmtBtn)
                .addGap(28, 28, 28)
                .addComponent(paymentMgmtBtn)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        reportLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        reportLabel.setForeground(new java.awt.Color(76, 43, 24));
        reportLabel.setText("Report");

        backgroundPanel3.setBackground(new java.awt.Color(230, 207, 201));

        categorySalesBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        categorySalesBtn.setForeground(new java.awt.Color(76, 43, 24));
        categorySalesBtn.setText("Category Sales Report");
        categorySalesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categorySalesBtnMouseClicked(evt);
            }
        });

        userGenderBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        userGenderBtn.setForeground(new java.awt.Color(76, 43, 24));
        userGenderBtn.setText("User Gender Report");
        userGenderBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userGenderBtnMouseClicked(evt);
            }
        });

        userAgeBtn.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        userAgeBtn.setForeground(new java.awt.Color(76, 43, 24));
        userAgeBtn.setText("User Age Report");
        userAgeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userAgeBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel3Layout = new javax.swing.GroupLayout(backgroundPanel3);
        backgroundPanel3.setLayout(backgroundPanel3Layout);
        backgroundPanel3Layout.setHorizontalGroup(
            backgroundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(backgroundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userAgeBtn)
                    .addComponent(userGenderBtn)
                    .addComponent(categorySalesBtn))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        backgroundPanel3Layout.setVerticalGroup(
            backgroundPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(categorySalesBtn)
                .addGap(29, 29, 29)
                .addComponent(userGenderBtn)
                .addGap(29, 29, 29)
                .addComponent(userAgeBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                            .addComponent(logoutBtn)
                            .addComponent(welcomeBackLabel)))
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(functionLabel)
                            .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customerLabel)
                            .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reportLabel)
                            .addComponent(backgroundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminPanelLayout.createSequentialGroup()
                        .addComponent(welcomeBackLabel)
                        .addGap(31, 31, 31)
                        .addComponent(logoutBtn))
                    .addComponent(profileIconLabel))
                .addGap(64, 64, 64)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionLabel)
                    .addComponent(customerLabel)
                    .addComponent(reportLabel))
                .addGap(18, 18, 18)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(backgroundPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backgroundPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backgroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void userMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMgmtBtnMouseClicked
        new UserMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_userMgmtBtnMouseClicked

    private void catMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catMgmtBtnMouseClicked
        new CategoryMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_catMgmtBtnMouseClicked

    private void itemMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemMgmtBtnMouseClicked
        new ItemMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_itemMgmtBtnMouseClicked

    private void deliveryMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deliveryMgmtBtnMouseClicked
        new DeliveryMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_deliveryMgmtBtnMouseClicked

    private void feedbackMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackMgmtBtnMouseClicked
        new FeedbackMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_feedbackMgmtBtnMouseClicked

    private void orderMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMgmtBtnMouseClicked
        new OrderMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_orderMgmtBtnMouseClicked

    private void paymentMgmtBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentMgmtBtnMouseClicked
        new PaymentMgmtDisplay().setVisible(true);
        dispose();
    }//GEN-LAST:event_paymentMgmtBtnMouseClicked

    private void categorySalesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categorySalesBtnMouseClicked
        new CategorySalesReport().setVisible(true);
        dispose();
    }//GEN-LAST:event_categorySalesBtnMouseClicked

    private void userGenderBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userGenderBtnMouseClicked
        new GenderReport().setVisible(true);
        dispose();
    }//GEN-LAST:event_userGenderBtnMouseClicked

    private void userAgeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userAgeBtnMouseClicked
        new AgeReport().setVisible(true);
        dispose();
    }//GEN-LAST:event_userAgeBtnMouseClicked

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
        
        // Set Label Image
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JPanel backgroundPanel3;
    private javax.swing.JLabel catMgmtBtn;
    private javax.swing.JLabel categorySalesBtn;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel deliveryMgmtBtn;
    private javax.swing.JLabel feedbackMgmtBtn;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JLabel itemMgmtBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel orderMgmtBtn;
    private javax.swing.JLabel paymentMgmtBtn;
    private javax.swing.JLabel profileIconLabel;
    private javax.swing.JLabel reportLabel;
    private javax.swing.JLabel userAgeBtn;
    private javax.swing.JLabel userGenderBtn;
    private javax.swing.JLabel userMgmtBtn;
    private javax.swing.JLabel welcomeBackLabel;
    // End of variables declaration//GEN-END:variables
}
