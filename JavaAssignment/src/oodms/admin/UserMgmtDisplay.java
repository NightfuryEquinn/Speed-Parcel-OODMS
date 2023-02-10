package oodms.admin;

import java.awt.Font;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oodms.oop.Create3DArray;
import oodms.oop.SearchFileData;

public class UserMgmtDisplay extends javax.swing.JFrame {

    /**
     * Creates new form UserMgmtDisplayPage
     */
    public UserMgmtDisplay() {
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

        userMgmtPanel = new javax.swing.JPanel();
        userMgmtLabel = new javax.swing.JLabel();
        searchUserLabel = new javax.swing.JLabel();
        backgroundPanel1 = new javax.swing.JPanel();
        searchUserIDLabel = new javax.swing.JLabel();
        inputSearchUsername = new javax.swing.JTextField();
        searchUserBtn = new javax.swing.JButton();
        detailLabel = new javax.swing.JLabel();
        backgroundPanel2 = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputAddress = new javax.swing.JTextArea();
        inputUsername = new javax.swing.JTextField();
        inputEmail = new javax.swing.JTextField();
        inputContact = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        listUserLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayUserTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        userMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        userMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        userMgmtLabel.setText("User Management");

        searchUserLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        searchUserLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchUserLabel.setText("Search");

        backgroundPanel1.setBackground(new java.awt.Color(230, 207, 201));

        searchUserIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        searchUserIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        searchUserIDLabel.setText("Enter Name:");

        inputSearchUsername.setBackground(new java.awt.Color(184, 145, 104));
        inputSearchUsername.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputSearchUsername.setForeground(new java.awt.Color(76, 43, 24));

        searchUserBtn.setBackground(new java.awt.Color(184, 145, 104));
        searchUserBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        searchUserBtn.setForeground(new java.awt.Color(76, 43, 24));
        searchUserBtn.setText("Search");
        searchUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanel1Layout = new javax.swing.GroupLayout(backgroundPanel1);
        backgroundPanel1.setLayout(backgroundPanel1Layout);
        backgroundPanel1Layout.setHorizontalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(searchUserIDLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchUserBtn)
                .addGap(16, 16, 16))
        );
        backgroundPanel1Layout.setVerticalGroup(
            backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchUserIDLabel)
                    .addComponent(inputSearchUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUserBtn))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        detailLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        detailLabel.setForeground(new java.awt.Color(76, 43, 24));
        detailLabel.setText("Details");

        backgroundPanel2.setBackground(new java.awt.Color(230, 207, 201));

        usernameLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(76, 43, 24));
        usernameLabel.setText("Username:");

        emailLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(76, 43, 24));
        emailLabel.setText("Email Address:");

        contactLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        contactLabel.setForeground(new java.awt.Color(76, 43, 24));
        contactLabel.setText("Contact Number:");

        addressLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(76, 43, 24));
        addressLabel.setText("Address:");

        inputAddress.setBackground(new java.awt.Color(184, 145, 104));
        inputAddress.setColumns(20);
        inputAddress.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputAddress.setForeground(new java.awt.Color(76, 43, 24));
        inputAddress.setLineWrap(true);
        inputAddress.setRows(5);
        jScrollPane1.setViewportView(inputAddress);

        inputUsername.setBackground(new java.awt.Color(184, 145, 104));
        inputUsername.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(76, 43, 24));

        inputEmail.setBackground(new java.awt.Color(184, 145, 104));
        inputEmail.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputEmail.setForeground(new java.awt.Color(76, 43, 24));

        inputContact.setBackground(new java.awt.Color(184, 145, 104));
        inputContact.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputContact.setForeground(new java.awt.Color(76, 43, 24));

        addBtn.setBackground(new java.awt.Color(184, 145, 104));
        addBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        addBtn.setForeground(new java.awt.Color(76, 43, 24));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(184, 145, 104));
        editBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(76, 43, 24));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(184, 145, 104));
        saveBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(76, 43, 24));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

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
                .addGap(14, 14, 14)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteBtn))
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contactLabel)
                            .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputUsername)
                            .addComponent(inputEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(inputContact)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactLabel)
                    .addComponent(inputContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(saveBtn)
                    .addComponent(deleteBtn))
                .addGap(14, 14, 14))
        );

        listUserLabel.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        listUserLabel.setForeground(new java.awt.Color(76, 43, 24));
        listUserLabel.setText("List");

        backBtn.setBackground(new java.awt.Color(184, 145, 104));
        backBtn.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(76, 43, 24));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        displayUserTable.setBackground(new java.awt.Color(230, 207, 201));
        displayUserTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayUserTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayUserTable.setForeground(new java.awt.Color(76, 43, 24));
        displayUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Email Address", "Contact Number", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        displayUserTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayUserTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayUserTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayUserTable.setShowVerticalLines(true);
        jScrollPane2.setViewportView(displayUserTable);
        // Change Table Header Font
        displayUserTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayUserTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(125);
        columnModel.getColumn(1).setPreferredWidth(125);
        columnModel.getColumn(2).setPreferredWidth(175);
        columnModel.getColumn(3).setPreferredWidth(250);

        javax.swing.GroupLayout userMgmtPanelLayout = new javax.swing.GroupLayout(userMgmtPanel);
        userMgmtPanel.setLayout(userMgmtPanelLayout);
        userMgmtPanelLayout.setHorizontalGroup(
            userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMgmtPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(detailLabel)
                        .addComponent(searchUserLabel)
                        .addComponent(userMgmtLabel)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(backBtn))
                .addGap(39, 39, 39)
                .addGroup(userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listUserLabel)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        userMgmtPanelLayout.setVerticalGroup(
            userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMgmtPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(userMgmtLabel)
                .addGap(18, 18, 18)
                .addGroup(userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchUserLabel)
                    .addComponent(listUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userMgmtPanelLayout.createSequentialGroup()
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(detailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(userMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new AdminDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserBtnActionPerformed
        // Get Table Model
        DefaultTableModel userTable = (DefaultTableModel) displayUserTable.getModel();
        userTable.setRowCount(0);
        
        // Loop all data except password to the table
        // Get Search Input
        String getKeyword = inputSearchUsername.getText()
                ;
        if(getKeyword.isBlank()) {
            // OOP Method - Get User Data into Multidimensional Array
            String[][] allUserArr = new Create3DArray().create3D("/oodms/database/credentials.txt");
            
            // Loop all data
            for (String[] userArr : allUserArr) {
                String[] userDataArr = new String[] {userArr[0], userArr[2], userArr[3], userArr[4]};
                userTable.addRow(userDataArr);
            }
        } else {
            // OOP Method - Get Searched User Data into Multidimensional Array
            String[][] searchedAllUserArr = new SearchFileData().searchUsername(getKeyword, "/oodms/database/credentials.txt");
            
            // Loop all data
            for (String[] searchedUserArr : searchedAllUserArr) {
                String[] searchedUserDataArr = new String[] {searchedUserArr[0], searchedUserArr[2], searchedUserArr[3], searchedUserArr[4]};
                userTable.addRow(searchedUserDataArr);
            }
        }
        
    }//GEN-LAST:event_searchUserBtnActionPerformed

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
            java.util.logging.Logger.getLogger(UserMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMgmtDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMgmtDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel backgroundPanel1;
    private javax.swing.JPanel backgroundPanel2;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel detailLabel;
    private javax.swing.JTable displayUserTable;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextArea inputAddress;
    private javax.swing.JTextField inputContact;
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputSearchUsername;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listUserLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchUserBtn;
    private javax.swing.JLabel searchUserIDLabel;
    private javax.swing.JLabel searchUserLabel;
    private javax.swing.JLabel userMgmtLabel;
    private javax.swing.JPanel userMgmtPanel;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
