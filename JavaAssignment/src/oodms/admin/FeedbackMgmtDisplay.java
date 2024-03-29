package oodms.admin;

import java.awt.Font;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import oodms.oop.Create3DArray;
import oodms.oop.DeleteSelected;
import oodms.oop.FlushAndWrite;
import oodms.oop.SearchFileData;

public class FeedbackMgmtDisplay extends javax.swing.JFrame {

    /**
     * Creates new form FeedbackMgmtDisplay
     */
    public FeedbackMgmtDisplay() {
        initComponents();
        
        // Include a default no category
        filterRating.addItem("");
        
        String[] rating = new String[] {"Extremely Poor", "Below Average", "Mediocre", "Good", "Excellent"};
        for(String ratingCount : rating) {
            filterRating.addItem(ratingCount);
        }
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
        customerNameLabel = new javax.swing.JLabel();
        feedbackLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputFeedback = new javax.swing.JTextArea();
        inputCustomerName = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        orderIDLabel = new javax.swing.JLabel();
        inputOrderID = new javax.swing.JTextField();
        ratingLabel = new javax.swing.JLabel();
        inputRating = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        displayFeedbackTable = new javax.swing.JTable();
        listFeedbackLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Feedback Management");

        feedbackMgmtPanel.setBackground(new java.awt.Color(250, 242, 224));

        feedbackMgmtLabel.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        feedbackMgmtLabel.setForeground(new java.awt.Color(76, 43, 24));
        feedbackMgmtLabel.setText("Feedback Management");

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
        searchFeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFeedbackBtnActionPerformed(evt);
            }
        });

        filterRatingLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        filterRatingLabel.setForeground(new java.awt.Color(76, 43, 24));
        filterRatingLabel.setText("Filter Rating:");

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
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        orderIDLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        orderIDLabel.setForeground(new java.awt.Color(76, 43, 24));
        orderIDLabel.setText("Order ID:");

        inputOrderID.setEditable(false);
        inputOrderID.setBackground(new java.awt.Color(184, 145, 104));
        inputOrderID.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputOrderID.setForeground(new java.awt.Color(76, 43, 24));

        ratingLabel.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        ratingLabel.setForeground(new java.awt.Color(76, 43, 24));
        ratingLabel.setText("Rating:");

        inputRating.setEditable(false);
        inputRating.setBackground(new java.awt.Color(184, 145, 104));
        inputRating.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        inputRating.setForeground(new java.awt.Color(76, 43, 24));

        javax.swing.GroupLayout backgroundPanel2Layout = new javax.swing.GroupLayout(backgroundPanel2);
        backgroundPanel2.setLayout(backgroundPanel2Layout);
        backgroundPanel2Layout.setHorizontalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanel2Layout.createSequentialGroup()
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(feedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, backgroundPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(customerNameLabel)
                                    .addComponent(ratingLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputRating)
                                    .addComponent(inputCustomerName)))
                            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(orderIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputOrderID)))))
                .addGap(18, 18, 18))
        );
        backgroundPanel2Layout.setVerticalGroup(
            backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputOrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderIDLabel))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerNameLabel)
                    .addComponent(inputCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ratingLabel))
                .addGap(18, 18, 18)
                .addGroup(backgroundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addGroup(backgroundPanel2Layout.createSequentialGroup()
                        .addComponent(feedbackLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addGap(17, 17, 17))
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

        displayFeedbackTable.setBackground(new java.awt.Color(230, 207, 201));
        displayFeedbackTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        displayFeedbackTable.setFont(new java.awt.Font("Karla", 0, 14)); // NOI18N
        displayFeedbackTable.setForeground(new java.awt.Color(76, 43, 24));
        displayFeedbackTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Order ID", "Customer Name", "Rating", "Feedback"
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
        displayFeedbackTable.setGridColor(new java.awt.Color(230, 207, 201));
        displayFeedbackTable.setSelectionBackground(new java.awt.Color(184, 145, 104));
        displayFeedbackTable.setSelectionForeground(new java.awt.Color(76, 43, 24));
        displayFeedbackTable.setShowVerticalLines(true);
        displayFeedbackTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayFeedbackTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(displayFeedbackTable);
        // Change Table Header Font
        displayFeedbackTable.getTableHeader().setFont(new Font("Karla", Font.PLAIN, 14));

        // Change Table Column Width
        TableColumnModel columnModel = displayFeedbackTable.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(75);
        columnModel.getColumn(1).setPreferredWidth(125);
        columnModel.getColumn(2).setPreferredWidth(75);
        columnModel.getColumn(3).setPreferredWidth(350);

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
                .addGap(18, 18, 18)
                .addGroup(feedbackMgmtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(listFeedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(feedbackMgmtPanelLayout.createSequentialGroup()
                        .addComponent(searchFeedbackLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(detailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(backgroundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backBtn)
                        .addGap(17, 17, 17))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(feedbackMgmtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(feedbackMgmtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int selectedRow = displayFeedbackTable.getSelectedRow();
        
        String selectedOrderID = (String) displayFeedbackTable.getValueAt(selectedRow, 0);

        int confirmDelete = JOptionPane.showConfirmDialog(null, "Are you sure to delete this feedback? This action can't be undone.", "Confirm delete?", JOptionPane.YES_NO_OPTION);
        
        if(confirmDelete == JOptionPane.YES_OPTION) {
            String[][] ds = new DeleteSelected().deleteSelected(selectedOrderID, "/oodms/database/feedback.txt");
        
            FlushAndWrite faw = new FlushAndWrite();
            faw.flushAndWrite(ds, "src/oodms/database/feedback.txt");
            
            JOptionPane.showConfirmDialog(null, "Feedback deleted.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            System.out.println("Do nothing");
        }
        
        // Reset text field and buttons
        inputSearchCustomer.setText("");
        
        inputCustomerName.setText("");
        inputOrderID.setText("");
        inputRating.setText("");
        inputFeedback.setText("");
        
        deleteBtn.setEnabled(false);
        
        DefaultTableModel feedbackTable = (DefaultTableModel) displayFeedbackTable.getModel();
        feedbackTable.setRowCount(0);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchFeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFeedbackBtnActionPerformed
        // Disable button
        deleteBtn.setEnabled(false);
        
        // Clear text field
        inputCustomerName.setText("");
        inputOrderID.setText("");
        inputRating.setText("");
        inputFeedback.setText("");
        
        DefaultTableModel feedbackTable = (DefaultTableModel) displayFeedbackTable.getModel();
        feedbackTable.setRowCount(0);
        
        String getCustomerName = inputSearchCustomer.getText();
        String getFilterRating = filterRating.getSelectedItem().toString();
        
        // Search with rating
        if((getCustomerName.isBlank()) && (!getFilterRating.equals(""))) {
            String[][] getSearchRatingArr = new SearchFileData().searchData(getFilterRating, 2, "/oodms/database/feedback.txt");
            
            for(String[] getSearchRatingData : getSearchRatingArr) {
                feedbackTable.addRow(getSearchRatingData);
            }
            
        // Search with customer name
        } else if((!getCustomerName.isBlank()) && (getFilterRating.equals(""))) {
            String[][] getSearchCustomerArr = new SearchFileData().searchData(getCustomerName, 1, "/oodms/database/feedback.txt");
            
            for(String[] getSearchCustomerData : getSearchCustomerArr) {
                feedbackTable.addRow(getSearchCustomerData);
            }
        // Search both rating and customer name
        } else if((!getCustomerName.isBlank()) && (!getFilterRating.equals(""))) {
            String[][] getSearchBothRatingArr = new SearchFileData().searchData(getFilterRating, 2, "/oodms/database/feedback.txt");
            String[][] getSearchBothCustomerArr = new SearchFileData().searchData(getCustomerName, 1, "/oodms/database/feedback.txt");
            
            int newArrCount = 0;
            
            for(int i = 0; i < getSearchBothRatingArr.length; i++) {
                for(int j = 0; j < getSearchBothCustomerArr.length; j++) {
                    if(Arrays.equals(getSearchBothRatingArr[i], getSearchBothCustomerArr[j])) {
                        newArrCount++;
                    }
                }
            }
            
            String[][] getSearchBothArr = new String[newArrCount][getSearchBothRatingArr[0].length];
            
            int newArrIndex = 0;
            
            for(int i = 0; i < getSearchBothRatingArr.length; i++) {
                for(int j = 0; j < getSearchBothCustomerArr.length; j++) {
                    if(Arrays.equals(getSearchBothRatingArr[i], getSearchBothCustomerArr[j])) {
                        getSearchBothArr[newArrIndex++] = getSearchBothRatingArr[i];
                    }
                }
            }
            
            for(String[] getSearchBothData : getSearchBothArr) {
                feedbackTable.addRow(getSearchBothData);
            }
            
        // Search all
        } else {
            String[][] getAllArr = new Create3DArray().create3D("/oodms/database/feedback.txt");
            
            for(String[] getAllData : getAllArr) {
                feedbackTable.addRow(getAllData);
            }
        }
    }//GEN-LAST:event_searchFeedbackBtnActionPerformed

    private void displayFeedbackTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayFeedbackTableMouseClicked
        // Enable button
        deleteBtn.setEnabled(true);
        
        int selectedRow = displayFeedbackTable.getSelectedRow();
        
        inputOrderID.setText((String) displayFeedbackTable.getValueAt(selectedRow, 0));
        inputCustomerName.setText((String) displayFeedbackTable.getValueAt(selectedRow, 1));
        inputRating.setText((String) displayFeedbackTable.getValueAt(selectedRow, 2));
        inputFeedback.setText((String) displayFeedbackTable.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_displayFeedbackTableMouseClicked

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
    private javax.swing.JComboBox<String> filterRating;
    private javax.swing.JLabel filterRatingLabel;
    private javax.swing.JTextField inputCustomerName;
    private javax.swing.JTextArea inputFeedback;
    private javax.swing.JTextField inputOrderID;
    private javax.swing.JTextField inputRating;
    private javax.swing.JTextField inputSearchCustomer;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel listFeedbackLabel;
    private javax.swing.JLabel orderIDLabel;
    private javax.swing.JLabel ratingLabel;
    private javax.swing.JLabel searchCustomerLabel;
    private javax.swing.JButton searchFeedbackBtn;
    private javax.swing.JLabel searchFeedbackLabel;
    // End of variables declaration//GEN-END:variables
}
