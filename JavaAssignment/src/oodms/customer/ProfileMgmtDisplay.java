package oodms.customer;

import java.util.Arrays;
import javax.swing.JOptionPane;
import oodms.oop.FlushAndWrite;
import oodms.oop.SaveSelected;

public class ProfileMgmtDisplay extends javax.swing.JFrame {

    // Accept customer username
    private static String acceptCustomerUsername;
    
    /**
     * Creates new form ProfileMgmtDisplay
     * @param acceptCustomerUsername
     */
    public ProfileMgmtDisplay(String acceptCustomerUsername) {
        initComponents();
        
        ProfileMgmtDisplay.acceptCustomerUsername = acceptCustomerUsername;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        profileMgmtLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        confirmPasswordLabel = new javax.swing.JLabel();
        inputConfirmPassword = new javax.swing.JPasswordField();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        inputContact = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        inputAddressScrollPanel = new javax.swing.JScrollPane();
        inputAddress = new javax.swing.JTextArea();
        ageLabel = new javax.swing.JLabel();
        inputAge = new javax.swing.JSpinner();
        genderLabel = new javax.swing.JLabel();
        inputGender = new javax.swing.JComboBox<>();
        usernameLabel = new javax.swing.JLabel();
        usernameInfoLabel = new javax.swing.JLabel();
        emailAddressLabel = new javax.swing.JLabel();
        confirmBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(250, 242, 224));

        profileMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        profileMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        profileMgmtLabel.setText("Profile Management");

        passwordLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(76, 43, 24));
        passwordLabel.setText("Password:");

        inputPassword.setBackground(new java.awt.Color(230, 207, 201));
        inputPassword.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(76, 43, 24));
        inputPassword.setMinimumSize(new java.awt.Dimension(274, 23));

        confirmPasswordLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        confirmPasswordLabel.setForeground(new java.awt.Color(76, 43, 24));
        confirmPasswordLabel.setText("Confirm Password:");

        inputConfirmPassword.setBackground(new java.awt.Color(230, 207, 201));
        inputConfirmPassword.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputConfirmPassword.setForeground(new java.awt.Color(76, 43, 24));
        inputConfirmPassword.setMinimumSize(new java.awt.Dimension(274, 23));

        emailLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(76, 43, 24));
        emailLabel.setText("Email Address:");

        contactLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(76, 43, 24));
        contactLabel.setText("Contact Number:");

        inputContact.setBackground(new java.awt.Color(230, 207, 201));
        inputContact.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputContact.setForeground(new java.awt.Color(76, 43, 24));
        inputContact.setMinimumSize(new java.awt.Dimension(274, 23));

        addressLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(76, 43, 24));
        addressLabel.setText("Address:");

        inputAddress.setBackground(new java.awt.Color(230, 207, 201));
        inputAddress.setColumns(20);
        inputAddress.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputAddress.setForeground(new java.awt.Color(76, 43, 24));
        inputAddress.setLineWrap(true);
        inputAddress.setRows(5);
        inputAddressScrollPanel.setViewportView(inputAddress);

        ageLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(76, 43, 24));
        ageLabel.setText("Age:");

        inputAge.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N

        genderLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(76, 43, 24));
        genderLabel.setText("Gender:");

        inputGender.setBackground(new java.awt.Color(230, 207, 201));
        inputGender.setForeground(new java.awt.Color(76, 43, 24));
        inputGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));

        usernameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(76, 43, 24));
        usernameLabel.setText("Username:");

        usernameInfoLabel.setBackground(new java.awt.Color(230, 207, 201));
        usernameInfoLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        usernameInfoLabel.setForeground(new java.awt.Color(76, 43, 24));
        usernameInfoLabel.setText("Username can't be changed");

        emailAddressLabel.setBackground(new java.awt.Color(230, 207, 201));
        emailAddressLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        emailAddressLabel.setForeground(new java.awt.Color(76, 43, 24));
        emailAddressLabel.setText("Email address can't be changed");

        confirmBtn.setBackground(new java.awt.Color(184, 145, 104));
        confirmBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(76, 43, 24));
        confirmBtn.setText("Confirm Changes");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(profileMgmtLabel)
                        .addGap(47, 47, 47))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(confirmPasswordLabel)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(contactLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(addressLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel)
                            .addComponent(usernameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputContact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputAddressScrollPanel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameInfoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailAddressLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backBtn)))
                .addGap(319, 319, 319))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(profileMgmtLabel)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameInfoLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordLabel)
                    .addComponent(inputConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailAddressLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(inputContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(inputAddressScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(inputAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(confirmBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int confirmUpdate = JOptionPane.showConfirmDialog(null, "Are you sure to update your profile?", "Update profile?", JOptionPane.YES_NO_OPTION);
        
        if(confirmUpdate == JOptionPane.YES_OPTION) {
            char[] targetPassword = inputPassword.getPassword();
            String getPassword = new String(targetPassword);

            char[] targetConfirmPassword = inputConfirmPassword.getPassword();
            String getConfirmPassword = new String(targetConfirmPassword);

            if(getPassword.equals(getConfirmPassword)) {
                String getCustomerUsername = acceptCustomerUsername;

                String getContact = inputContact.getText();
                String getAddress = inputAddress.getText();
                String getAge = inputAge.getValue().toString();
                String getGender = inputGender.getSelectedItem().toString();

                String[] newChangesArr = new String[] {getPassword, getContact, getAddress, getAge, getGender};
                
                if(!getContact.equals("") && !getAddress.equals("") && !getAge.equals("") && !getGender.equals("")) {
                    SaveSelected ss = new SaveSelected();
                    String[][] newChangesArrToSave = ss.saveCustomerProfile(newChangesArr, getCustomerUsername);

                    FlushAndWrite faw = new FlushAndWrite();
                    faw.flushAndWrite(newChangesArrToSave, "src/oodms/database/credentials.txt");

                    JOptionPane.showMessageDialog(null, "Your personal information has been updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill up the empty fields.", "Empty fields", JOptionPane.ERROR_MESSAGE);
                
                    System.out.println("Do nothing");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Your passowrd and confirm password are not the same.", "Password Incorrect", JOptionPane.ERROR_MESSAGE);

                System.out.println("Password not same");
            }
        } else {
            System.out.println("Do nothing");
        }
            
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new CustomerDashboard(acceptCustomerUsername).setVisible(true);
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
            java.util.logging.Logger.getLogger(ProfileMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileMgmtDisplay(acceptCustomerUsername).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel emailAddressLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextArea inputAddress;
    private javax.swing.JScrollPane inputAddressScrollPanel;
    private javax.swing.JSpinner inputAge;
    private javax.swing.JPasswordField inputConfirmPassword;
    private javax.swing.JTextField inputContact;
    private javax.swing.JComboBox<String> inputGender;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel profileMgmtLabel;
    private javax.swing.JLabel usernameInfoLabel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
