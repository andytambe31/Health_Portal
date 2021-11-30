package ui;

import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.time.LocalDate;
import java.util.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.Person;
import model.Sys;
import utility.UtilityFunctions;

/**
 *
 * @author  user
 */
public class AddWorkforce extends javax.swing.JPanel {
  
    private JPanel userProcessContainer;
    private Sys sys;
    private HomeScreen homeScreen;
    City selectedCity;
    String imageDir = "";
    boolean patFound = false;
    
    public AddWorkforce(JPanel userProcessContainer,Sys sys,HomeScreen homeScreen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.sys = sys;
        this.homeScreen = homeScreen;
        setSize(1040, 544);
        clearFields();
        loadCity();
        emptyCommunityComboBox();
        
    }
    
   
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        btnProfilePic = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        popupMenu1 = new java.awt.PopupMenu();
        txtAddr = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        lblEncounterHist1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblDOB1 = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        txtHouseNum = new javax.swing.JTextField();
        lblHouseNum = new javax.swing.JLabel();
        lblDOB2 = new javax.swing.JLabel();
        cmbCommunity = new javax.swing.JComboBox<>();
        lblDOB3 = new javax.swing.JLabel();
        cmbCity = new javax.swing.JComboBox<>();
        lblDOB = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        lblPatientId = new javax.swing.JLabel();
        btnPatientSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        btnProfilePic.setText("Attach");
        btnProfilePic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProfilePicMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProfilePicMouseExited(evt);
            }
        });
        btnProfilePic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfilePicActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/AED_ASS_4_logo.png"))); // NOI18N

        popupMenu1.setLabel("popupMenu1");

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(650, 600));

        txtAddr.setWheelScrollingEnabled(false);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtAddr.setViewportView(jTextArea1);

        jPanel1.setBackground(new java.awt.Color(17, 125, 161));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblEncounterHist1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        lblEncounterHist1.setForeground(new java.awt.Color(255, 255, 255));
        lblEncounterHist1.setText("Person Information");

        txtName.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        lblDOB1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblDOB1.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB1.setText("Name:");

        txtStreetName.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        lblStreet.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblStreet.setForeground(new java.awt.Color(255, 255, 255));
        lblStreet.setText("Street");

        txtHouseNum.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        lblHouseNum.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblHouseNum.setForeground(new java.awt.Color(255, 255, 255));
        lblHouseNum.setText("House #");

        lblDOB2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblDOB2.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB2.setText("Community:");

        cmbCommunity.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        cmbCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        lblDOB3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblDOB3.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB3.setText("City:");

        cmbCity.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCity.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCityItemStateChanged(evt);
            }
        });

        lblDOB.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblDOB.setForeground(new java.awt.Color(255, 255, 255));
        lblDOB.setText("DOB:");

        txtDOB.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        txtTel.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        lblTel.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblTel.setForeground(new java.awt.Color(255, 255, 255));
        lblTel.setText("Tel:");

        txtPatientID.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N

        lblPatientId.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        lblPatientId.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientId.setText("ID:");

        btnPatientSave.setText("Update/Save");
        btnPatientSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientSaveActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Attach");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(lblDOB1)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDOB)
                                .addGap(18, 18, 18)
                                .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblTel)
                                .addGap(18, 18, 18)
                                .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPatientSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblDOB2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblHouseNum)
                                        .addGap(34, 34, 34)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(lblDOB3)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCity, 0, 143, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtHouseNum, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEncounterHist1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPatientId)))
                .addGap(18, 18, 18)
                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClear, btnDelete, btnPatientSave, btnSearch, jButton1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbCity, txtStreetName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEncounterHist1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientId))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB1))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStreet)
                    .addComponent(txtHouseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseNum))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB2)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB3))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTel))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPatientSave)
                    .addComponent(btnSearch)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtAddr, 0, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(txtAddr, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void makeUneditable(){
        cmbCity.setEnabled(false);
        cmbCommunity.setEnabled(false);
        txtPatientID.setEditable(false);
        txtName.setEditable(false);
        txtHouseNum.setEditable(false);
        txtStreetName.setEditable(false);
        txtDOB.setEditable(false);
        txtTel.setEditable(false);
    }
    private void btnProfilePicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfilePicMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnProfilePicMouseClicked

    private void btnProfilePicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProfilePicMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnProfilePicMouseExited

    private void btnProfilePicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfilePicActionPerformed

       

    }//GEN-LAST:event_btnProfilePicActionPerformed

    public void loadCity(){
    
    cmbCity.removeAllItems();
    cmbCity.addItem("-");
    
    for(City city: sys.getCityList()){

        cmbCity.addItem(city.getCitName());
        }   
    }
    
    private void btnPatientSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientSaveActionPerformed
        // TODO add your handling code here:
        
        UtilityFunctions util = new UtilityFunctions();
        
        if(!validation()){
            return;
        }
        
        String name = txtName.getText();
        String house = txtHouseNum.getText();
        String streetName = txtStreetName.getText();
        String DOB = txtDOB.getText();
        String tel = txtTel.getText();
        
        //Create person
        Person newPerson;
        if(patFound && !txtPatientID.getText().equals("")){
            
            //Exsiting patient
            newPerson = sys.getPerDir().getPersonById(Integer.parseInt(txtPatientID.getText()));
            newPerson.setContactNo(util.convertToLong(tel));
            newPerson.setName(name);
            newPerson.setDob(util.convertToDate(DOB));
            
            //Update house;
            House sameHouse = sys.findHouseInCity(newPerson);
            sameHouse.setHouseNum(Integer.parseInt(txtHouseNum.getText()));
            sameHouse.setStreetName(streetName);
            sameHouse.setCommunity((String)cmbCommunity.getSelectedItem());
            sameHouse.setCity((String)cmbCity.getSelectedItem());
            
            //Update profile pic
            if(!imageDir.equals("")){
                newPerson.setImagePath(imageDir);
                imageDir = "";
            }else 
                newPerson.setImagePath("");
            
            //Show message
            JOptionPane.showMessageDialog(this, "Worker updated");
        
            //Show id
            txtPatientID.setText(newPerson.getId()+"");
            
        }else{
            
            //Create new person
             newPerson = sys.getPerDir().createPerson(util.convertToLong(tel), name, util.convertToDate(DOB));
             
             //Create new house
             try{
             Community community = sys.getCity((String)cmbCity.getSelectedItem()).getCommunityByName((String)cmbCommunity.getSelectedItem());
             House newHouse = community.createHouse(Integer.parseInt(txtHouseNum.getText()), txtStreetName.getText(), (String)cmbCommunity.getSelectedItem(), (String)cmbCity.getSelectedItem());
             newHouse.addPersonToHouse(newPerson);
             }catch(Exception e){
                 JOptionPane.showMessageDialog(this, "City or community missing");
             }
             
            //Add image if uploaded
            if(!imageDir.equals("")){
                newPerson.setImagePath(imageDir);
                imageDir = "";
            }else newPerson.setImagePath("");

            //Show Message
            JOptionPane.showMessageDialog(this, "Worker added");

            //Show id
            txtPatientID.setText(newPerson.getId()+"");
        }
        txtPatientID.setEnabled(true);
        
    }//GEN-LAST:event_btnPatientSaveActionPerformed

    private void cmbCityItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCityItemStateChanged
        // TODO add your handling code here:
        
        try{
        if(!cmbCity.getSelectedItem().equals("-")){
            
            City city = sys.getCity((String)cmbCity.getSelectedItem());
            
            loadCommunities(city);
        }
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_cmbCityItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            JFileChooser chooser = new JFileChooser();
            chooser.showOpenDialog(null);

            File f = chooser.getSelectedFile();
            imageDir = f.getAbsolutePath();
        } catch(Exception e){
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        if(!txtPatientID.getText().equals("")){
            
            //Perform search
            populatePersonDetails();
            
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    public void populatePersonDetails(){
    
        UtilityFunctions util = new UtilityFunctions();
        
        //Populate fields
        String personId = txtPatientID.getText();
        
        // Search patients
        Person person = null;
        try{
            person = sys.getPerDir().getPersonById(Integer.parseInt(personId));
            txtName.setText(person.getName());
            txtHouseNum.setText(sys.findHouseInCity(person).getHouseNum()+"");
            txtStreetName.setText(sys.findHouseInCity(person).getStreetName());
            txtDOB.setText(util.covertDateToString(person.getDob()));
            txtTel.setText(person.getContactNo()+"");
            cmbCity.setSelectedItem(sys.findHouseInCity(person).getCity());
            cmbCommunity.setSelectedItem(sys.findHouseInCity(person).getCommunity());
            txtPatientID.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Worker found");
            patFound = true;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Worker not found");
            txtPatientID.setText("");
            return;
        }
        
        //Populate fields
        
        
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
       clear();
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        if(!txtPatientID.getText().equals("")){
            
            //Get ID
            String patientID = txtPatientID.getText();
            
            //Get person
            Person person = sys.getPerDir().getPersonById(Integer.parseInt(patientID));
            
            //Check for patient
            try{
            if(!sys.getPatDir().getPatientByPerson(person).equals(null)){
                JOptionPane.showMessageDialog(this, "Worker is patient!! Cannot delete.");
                return;
            }
            }catch(Exception e){
                
            }
            
            //Delete person
            sys.getPerDir().getPersonList().remove(person);
            
            JOptionPane.showMessageDialog(this, "Worker deleted");
            
            clearFields();
        }
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    public void clear(){
    patFound = false;
        cmbCity.setSelectedIndex(0);
        cmbCommunity.setSelectedIndex(0);
        txtPatientID.setText("");
        txtName.setText("");
        txtHouseNum.setText("");
        txtStreetName.setText("");
        txtDOB.setText("");
        txtTel.setText("");
        
        btnPatientSave.setEnabled(true);
        txtPatientID.setEnabled(true);
        txtPatientID.setText("");
        btnSearch.setEnabled(true);
    }
    public void populatePatientDetails(){
    
        UtilityFunctions util = new UtilityFunctions();
        
        //Populate fields
        String patientId = txtPatientID.getText();
        
        // Search patients
        Patient pat = null;
        try{
            pat = sys.getPatDir().getPatientById(Integer.parseInt(patientId));
            txtName.setText(pat.getPerson().getName());
            txtHouseNum.setText(sys.findHouseInCity(pat.getPerson()).getHouseNum()+"");
            txtStreetName.setText(sys.findHouseInCity(pat.getPerson()).getStreetName());
            txtDOB.setText(util.covertDateToString(pat.getPerson().getDob()));
            txtTel.setText(pat.getPerson().getContactNo()+"");
            cmbCity.setSelectedItem(sys.findHouseInCity(pat.getPerson()).getCity());
            cmbCommunity.setSelectedItem(sys.findHouseInCity(pat.getPerson()).getCommunity());
            txtPatientID.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Patient found");
            patFound = true;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Patient not found");
            txtPatientID.setText("");
            return;
        }
        
        //Populate fields
        
        
    }
    
    public void loadCommunities(City city){
    
        cmbCommunity.removeAllItems();
        cmbCommunity.addItem("-");
    
        for(Community comm: city.getCommList()){

            cmbCommunity.addItem(comm.getCommName());
        } 
    
    }
    
    public void emptyCommunityComboBox(){
    
        cmbCommunity.removeAllItems();
        cmbCommunity.addItem("-");
        
    }
    public void clearFields(){
        
        cmbCity.setSelectedIndex(0);
        cmbCommunity.setSelectedIndex(0);
        txtPatientID.setText("");
        txtName.setText("");
        txtHouseNum.setText("");
        txtStreetName.setText("");
        txtDOB.setText("");
        txtTel.setText("");
        
    }
    
    
    public boolean validation(){

        UtilityFunctions utility = new UtilityFunctions();

        //Field validations
        boolean valFlag = true;
        int misCounter = 0;
        int temp = 0;

        //Error Message
        String errorMessage = "";

        //1. Name ***************************************************************************

        // TC.1 - No Null value
        temp = misCounter;
        misCounter = misCounter + utility.runValidation(".+",txtName.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Name is blank"+"\n";
        }

        //TC.2 - Only Alphabets
        temp = misCounter;
        misCounter = misCounter + utility.runValidation("^[a-zA-Z]+ *[a-zA-Z]*$",txtName.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Invalid name!"+"\n";
        }

        //2. Contact Number ***************************************************************************

        // TC.1 - No Null value
        temp = misCounter;
        misCounter = misCounter + utility.runValidation(".+",txtTel.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Tel is blank"+"\n";
        }

        //TC.2 - Only numbers
        temp = misCounter;
        misCounter = misCounter + utility.runValidation("^[0-9]{10}$",txtTel.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Please enter 10 digit Tel"+"\n";
        }

        //3. DOB ***************************************************************************

        // TC.1 - No Null value
        temp = misCounter;
        misCounter = misCounter + utility.runValidation(".+",txtDOB.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "DOB is blank"+"\n";
        }

        //TC.2 - Date Format
        temp = misCounter;
        misCounter = misCounter + utility.runValidation("^(([0-9])|([0-2][0-9])|([3][0-1]))\\-(Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec)\\-\\d{4}$",txtDOB.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Date format invalid"+"\n";
        }

        //
        //4. Street ***************************************************************************

        // TC.1 - No Null value
        temp = misCounter;
        misCounter = misCounter + utility.runValidation(".+",txtStreetName.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Street is blank"+"\n";
        }

        //TC.2 - Only characters
        temp = misCounter;
        misCounter = misCounter + utility.runValidation("^[a-zA-Z]+ *[a-zA-Z]*+$",txtStreetName.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "Street should be characters"+"\n";
        }
        
        //5. House Number ***************************************************************************

        // TC.1 - No Null value
        temp = misCounter;
        misCounter = misCounter + utility.runValidation(".+",txtHouseNum.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "House Number is blank"+"\n";
        }

        //TC.2 - Only characters
        temp = misCounter;
        misCounter = misCounter + utility.runValidation("^[0-9]+$",txtHouseNum.getText());

        //Add message
        if(temp != misCounter){
        errorMessage = errorMessage + "House Number should be numeric"+"\n";
        }
        
        // ********************************************************************************************
        // Check validations
        if(misCounter > 0){
        JOptionPane.showMessageDialog(this, errorMessage);
        valFlag = false;
        }
        // ********************************************************************************************


        return valFlag;
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPatientSave;
    private javax.swing.JButton btnProfilePic;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JComboBox<String> cmbCommunity;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDOB1;
    private javax.swing.JLabel lblDOB2;
    private javax.swing.JLabel lblDOB3;
    private javax.swing.JLabel lblEncounterHist1;
    private javax.swing.JLabel lblHouseNum;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblTel;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.TextArea textArea1;
    private javax.swing.JScrollPane txtAddr;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtHouseNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

    
}
