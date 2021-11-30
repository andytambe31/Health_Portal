package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Sys;
import model.User;
import model.UserDirectory;

/**
 *
 * @author  Mihir Mehta / Hechen Gao
 */
public class AddUser extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private Sys sys;
    private HomeScreen homeScreen;
    public AddUser(JPanel userProcessContainer,Sys sys,HomeScreen homeScreen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
        
        //Populate entries
        populateTable();
        makeUneditable();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUserDir = new javax.swing.JTable();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtVerifyPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblVerifyPassword = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbRole = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        tblUserDir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Sr.No", "Username", "Password", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblUserDir);
        if (tblUserDir.getColumnModel().getColumnCount() > 0) {
            tblUserDir.getColumnModel().getColumn(1).setResizable(false);
            tblUserDir.getColumnModel().getColumn(2).setResizable(false);
        }

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblVerifyPassword.setText("Verify Password:");

        jLabel1.setText("Role:");

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Admin", "Doctor", "Receptionist" }));

        btnSave.setText("Save");

        btnDelete.setText("Delete");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnNew.setText("New");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 979, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblUsername)
                    .addComponent(lblPassword)
                    .addComponent(lblVerifyPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUsername)
                        .addComponent(txtPassword)
                        .addComponent(txtVerifyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView)
                    .addComponent(btnSave)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnNew))
                .addGap(156, 156, 156))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnNew, btnSave, btnUpdate, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnNew)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnView))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVerifyPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVerifyPassword))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblUserDir.getSelectedRow();
        
        if(selectedRow < 0){
            
            JOptionPane.showMessageDialog(this, "Please select a row");
        
        }else{
            
            //Make them uneditable
            makeUneditable();
                    
            // Populate the fields
            //onlySelectedCar = selectedRow;
            
            //Handle Null pointer for empty values
            try{
                DefaultTableModel model = (DefaultTableModel) tblUserDir.getModel();
                User selectedUser = (User) model.getValueAt(selectedRow, 0);
                
                populateFields(selectedRow);
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Select valid entry");
            }
            
            
        }
    }//GEN-LAST:event_btnViewActionPerformed
    
    public void populateFields(int selectedRow){
        
        
        DefaultTableModel model = (DefaultTableModel) tblUserDir.getModel();
        User selectedUser = (User) model.getValueAt(selectedRow, 0);
        
        txtUsername.setText(selectedUser.getUsername());
        txtPassword.setText("**********");
        txtVerifyPassword.setText("-");
        cmbRole.setSelectedItem(selectedUser.getRole());
    
    }
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblUserDir.getModel();
        
        //Delete empty rows
        model.setRowCount(0);
        
        //Get user directory
        UserDirectory usD = sys.getUserDir();
        
        
        
        for(User user:usD.getUserDir()){
            
            Object[] row = new Object[4]; // Number of elements in the table - 6
            row[0] = user;//.getName();
            row[1] = user.getUsername();
            row[2] = "*******";
            row[3] = user.getRole();
            
            model.addRow(row);
        }
        
        
    }
    
    public void resetValues(){
        txtUsername.setText("");
        txtPassword.setText("");
        txtVerifyPassword.setText("");
        cmbRole.setSelectedIndex(0);
    }
    
    public void makeUneditable(){
         txtUsername.setEditable(false);
         txtPassword.setEditable(false);
         txtVerifyPassword.setEditable(false);
        cmbRole.setEnabled(false);
    }
    
    public void makeEditable(){
         txtUsername.setEditable(true);
         txtPassword.setEditable(true);
         txtVerifyPassword.setEditable(true);
        cmbRole.setEnabled(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblVerifyPassword;
    private javax.swing.JTable tblUserDir;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtVerifyPassword;
    // End of variables declaration//GEN-END:variables
    
}