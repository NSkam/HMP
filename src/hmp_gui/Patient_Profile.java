package hmp_gui;

import data.Patient;
/**
 *
 * @author Nikolaos Skamnelos
 */
public class Patient_Profile extends javax.swing.JFrame {
    
    private int patient_index;
    private Patient patient = new Patient();//O patient
    private Dashboard_Epimelitis dashboard;//Pairnei meso tou constructor thn timh tou prohgounmenou Dashboard
    /**
     * Creates new form Patient_Profile
     */
    public Patient_Profile(Dashboard_Epimelitis dashboard, Patient patient, int Patient_Index) {
        this.dashboard = dashboard;
        this.patient = patient;
        this.patient_index = Patient_Index;
        initComponents();
        change_value_msg.setVisible(false);
        Ok_button.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Patient_Profile = new javax.swing.JPanel();
        patient_info_panel = new javax.swing.JPanel();
        amka = new javax.swing.JLabel();
        onoma = new javax.swing.JLabel();
        history_scroll = new javax.swing.JScrollPane();
        patient_history_panel = new javax.swing.JPanel();
        patient_history = new javax.swing.JTextArea();
        age = new javax.swing.JLabel();
        supervised_by = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        cond_scroll = new javax.swing.JScrollPane();
        patient_conditions_panel = new javax.swing.JPanel();
        patient_conditions = new javax.swing.JTextArea();
        patient_history_label = new javax.swing.JLabel();
        patient_cond_label = new javax.swing.JLabel();
        patient_amka = new javax.swing.JTextArea();
        patient_name = new javax.swing.JTextArea();
        patient_age = new javax.swing.JTextArea();
        patient_doctor = new javax.swing.JTextArea();
        change_info_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        change_value_msg = new javax.swing.JLabel();
        Ok_button = new javax.swing.JButton();
        patient_status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Info");
        setLocation(new java.awt.Point(800, 400));

        Patient_Profile.setBackground(new java.awt.Color(153, 204, 255));

        patient_info_panel.setBackground(new java.awt.Color(153, 204, 255));
        patient_info_panel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "Στοιχεία Ασθενή", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        amka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amka.setForeground(new java.awt.Color(255, 255, 255));
        amka.setText("AMKA:");

        onoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        onoma.setForeground(new java.awt.Color(255, 255, 255));
        onoma.setText("Ονοματεπώνυμο:");

        patient_history.setEditable(false);
        patient_history.setColumns(20);
        patient_history.setRows(5);

        javax.swing.GroupLayout patient_history_panelLayout = new javax.swing.GroupLayout(patient_history_panel);
        patient_history_panel.setLayout(patient_history_panelLayout);
        patient_history_panelLayout.setHorizontalGroup(
            patient_history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_history_panelLayout.createSequentialGroup()
                .addComponent(patient_history, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        patient_history_panelLayout.setVerticalGroup(
            patient_history_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patient_history, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        history_scroll.setViewportView(patient_history_panel);

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setText("Ηλικία:");

        supervised_by.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        supervised_by.setForeground(new java.awt.Color(255, 255, 255));
        supervised_by.setText("Υπεύθυνος Ιατρός:");

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Κατάσταση:");

        patient_conditions.setEditable(false);
        patient_conditions.setColumns(20);
        patient_conditions.setRows(5);

        javax.swing.GroupLayout patient_conditions_panelLayout = new javax.swing.GroupLayout(patient_conditions_panel);
        patient_conditions_panel.setLayout(patient_conditions_panelLayout);
        patient_conditions_panelLayout.setHorizontalGroup(
            patient_conditions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_conditions_panelLayout.createSequentialGroup()
                .addComponent(patient_conditions, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        patient_conditions_panelLayout.setVerticalGroup(
            patient_conditions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(patient_conditions, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        cond_scroll.setViewportView(patient_conditions_panel);

        patient_history_label.setBackground(new java.awt.Color(255, 255, 255));
        patient_history_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patient_history_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_history_label.setText("Ιστορικό Ασθενή:");

        patient_cond_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patient_cond_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_cond_label.setText("Παθήσεις Ασθενή:");

        patient_amka.setEditable(false);
        patient_amka.setColumns(20);
        patient_amka.setRows(5);

        patient_name.setEditable(false);
        patient_name.setColumns(20);
        patient_name.setRows(5);

        patient_age.setEditable(false);
        patient_age.setColumns(20);
        patient_age.setRows(5);

        patient_doctor.setEditable(false);
        patient_doctor.setColumns(20);
        patient_doctor.setRows(5);

        change_info_button.setText("Αλλαγή Στοιχείων Ασθενή");
        change_info_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNewVal(evt);
            }
        });

        exit_button.setText("Έξοδος");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        change_value_msg.setText("Παρακαλώ, επιλέξτε στοιχείο για αλλαγή");

        Ok_button.setText("OK");
        Ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_buttonActionPerformed(evt);
            }
        });

        patient_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Excellent", "Good", "OK", "Bad", "Very Bad", "Life Threatening" }));
        patient_status.setEnabled(false);

        javax.swing.GroupLayout patient_info_panelLayout = new javax.swing.GroupLayout(patient_info_panel);
        patient_info_panel.setLayout(patient_info_panelLayout);
        patient_info_panelLayout.setHorizontalGroup(
            patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_info_panelLayout.createSequentialGroup()
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(history_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(patient_history_label)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cond_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_info_panelLayout.createSequentialGroup()
                        .addComponent(patient_cond_label)
                        .addGap(70, 70, 70)))
                .addGap(38, 38, 38))
            .addGroup(patient_info_panelLayout.createSequentialGroup()
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(status)
                                .addComponent(amka)
                                .addComponent(supervised_by)
                                .addComponent(onoma))))
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(exit_button)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addComponent(change_value_msg, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(change_info_button, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(patient_doctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(patient_age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_amka, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_status, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        patient_info_panelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {patient_doctor, patient_status});

        patient_info_panelLayout.setVerticalGroup(
            patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_info_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patient_info_panelLayout.createSequentialGroup()
                        .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(change_info_button)
                            .addComponent(exit_button))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_info_panelLayout.createSequentialGroup()
                        .addComponent(change_value_msg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amka)
                    .addComponent(patient_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onoma)
                    .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age)
                    .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(supervised_by)
                    .addComponent(patient_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(status)
                    .addComponent(patient_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(Ok_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_history_label)
                    .addComponent(patient_cond_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_info_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(history_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cond_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        patient_info_panelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {patient_doctor, patient_status});

        javax.swing.GroupLayout Patient_ProfileLayout = new javax.swing.GroupLayout(Patient_Profile);
        Patient_Profile.setLayout(Patient_ProfileLayout);
        Patient_ProfileLayout.setHorizontalGroup(
            Patient_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Patient_ProfileLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(patient_info_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        Patient_ProfileLayout.setVerticalGroup(
            Patient_ProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Patient_ProfileLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(patient_info_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Patient_Profile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Patient_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Exit button
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        this.dashboard.setEnabled(true);
        dispose();
    }//GEN-LAST:event_exit_buttonActionPerformed

    //Energopiei afou elen3ei an epitrepete thn allagh twn stoixeiwn tou xrhsth 
    //alliws kanei display error message.
    private void displayNewVal(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayNewVal
        
        boolean check_change = patient.CheckDocPermissions(dashboard.epimelitis.getAMKA(), "Change");
        if(check_change == true){
            patient_amka.setEditable(true);
            patient_name.setEditable(true);
            patient_age.setEditable(true);
            patient_doctor.setEditable(true);
            patient_status.setEnabled(true);
            patient_history.setEditable(true);
            patient_conditions.setEditable(true);
            change_info_button.setVisible(false);
            Ok_button.setVisible(true);
            change_value_msg.setVisible(true);
        }else{
           Conditional_Message display_error_msg = new Conditional_Message(this);
           display_error_msg.triggerMsg("<html>ΣΦΑΛΜΑ: <br> Δεν έχετε άδεια να αλλάξετε τα στοιχεία αυτού του Ασθενή... <br>Επιλέξτε κάποιον άλλον.</html>");
           display_error_msg.setVisible(true);
           this.setEnabled(false);
        }
    }//GEN-LAST:event_displayNewVal
    
    //Elenxei an epitrepetai h eisagwmenes times kai epeita kanei update ta fields kai tis plhrofories tou asthenh
    private void Ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_buttonActionPerformed
        //Kaleite Elenxos gia tis Times
        boolean check =  checkFieldValues();   
        //Kaleite h setPatientInfo(); afou settaroume tis times apo ta fields
        if(check == true){
            
            int amka = Integer.parseInt(patient_amka.getText());
            int age = Integer.parseInt(patient_age.getText());
            int doc_amka = Integer.parseInt(patient_doctor.getText());
            Patient.status_enum status = Patient.status_enum.ok;
            String patient_status_str  = patient_status.getSelectedItem().toString();
            switch (patient_status_str){
                case "Excellent":
                    status = Patient.status_enum.excellent;
                    break;
                case "Good":
                    status = Patient.status_enum.good;
                    break;
                case "OK":
                    status = Patient.status_enum.ok;
                    break;
                case "Bad":
                    status = Patient.status_enum.bad;
                    break;
                case "Very Bad":
                    status = Patient.status_enum.very_bad;
                    break;
                case "Life Threatening":
                    status = Patient.status_enum.life_threatening; 
                    break;
            }
            patient.setPatientInfo(amka, patient_name.getText(), age, patient_history.getText(), patient_conditions.getText(), doc_amka, status);
            this.dashboard.epimelitis.getClinic().getPatientList().set(patient_index,patient);
            //Prosthetoumne ton Asthenh sth lista
            String patient_str = "AMKA: " + patient.getAmka()+ "        " + "Name: " + patient.getName();
            javax.swing.DefaultListModel<String>  patient_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getPatient_Jlist().getModel();
            patient_jlist_model.set(this.patient_index,patient_str);
           
            //Epistrefoume sthn prohgoumenh katasthash
            patient_amka.setEditable(false);
            patient_name.setEditable(false);
            patient_age.setEditable(false);
            patient_doctor.setEditable(false);
            patient_status.setEnabled(false);
            patient_history.setEditable(false);
            patient_conditions.setEditable(false);
            change_info_button.setVisible(true);
            Ok_button.setVisible(false);
            change_value_msg.setVisible(false);
        }
        else{
           Conditional_Message display_error_msg = new Conditional_Message(this);
           display_error_msg.triggerMsg("<html>ΣΦΑΛΜΑ: <br> Έχετε βάλει λάθος τιμή...</html>");
           display_error_msg.setVisible(true);
           this.setEnabled(false);}
    }//GEN-LAST:event_Ok_buttonActionPerformed

     //H synarthsh pou kanei ton elenxo
    public boolean checkFieldValues(){
     try{
        //Elenxos gia kathe field
        if(!(patient_amka.getText().matches("[0-9]+")) || patient_amka.getText().length()>12){return false;}//Prepei na einai arithmos me ligotera apo 12 psifia
        if(!(patient_name.getText().matches("[\\p{L}\\p{Z}]+")) || patient_name.getText().length()>=30){return false;}//Matches Unicode Letters and Whitespaces
        if(!(patient_age.getText().matches("[0-9]+"))){return false;}//Prepei na einai arithmos mikroteros tous 120
        if(patient_history.getText().length()>1000){return false;}//Elenxos gia to Istoriko
        if(patient_conditions.getText().length()>1000){return false;}//Elenxos gia ta Conditions
        return true;}
     catch(java.lang.NumberFormatException e){return false;}
    }
    
    //Methodo pou settarei ta dedomena tou asthenh sta pedia tou parathyrou
    public void ShowPatientInfo(Patient patient){
            
            String amka = Integer.toString(patient.getAmka());
            String age = Integer.toString(patient.getAge());
            patient_amka.setText(amka);
            patient_name.setText(patient.getName());
            patient_age.setText(age);
            patient_doctor.setText(Integer.toString(patient.getSupervisedBy().getAMKA()));
            patient_status.setSelectedItem(patient.getStatus());
            patient_history.setText(patient.getHistory());
            patient_conditions.setText(patient.getConditions());
    }
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
            java.util.logging.Logger.getLogger(Patient_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ok_button;
    private javax.swing.JPanel Patient_Profile;
    private javax.swing.JLabel age;
    private javax.swing.JLabel amka;
    private javax.swing.JButton change_info_button;
    private javax.swing.JLabel change_value_msg;
    private javax.swing.JScrollPane cond_scroll;
    private javax.swing.JButton exit_button;
    private javax.swing.JScrollPane history_scroll;
    private javax.swing.JLabel onoma;
    private javax.swing.JTextArea patient_age;
    private javax.swing.JTextArea patient_amka;
    private javax.swing.JLabel patient_cond_label;
    private javax.swing.JTextArea patient_conditions;
    private javax.swing.JPanel patient_conditions_panel;
    private javax.swing.JTextArea patient_doctor;
    private javax.swing.JTextArea patient_history;
    private javax.swing.JLabel patient_history_label;
    private javax.swing.JPanel patient_history_panel;
    private javax.swing.JPanel patient_info_panel;
    private javax.swing.JTextArea patient_name;
    private javax.swing.JComboBox<String> patient_status;
    private javax.swing.JLabel status;
    private javax.swing.JLabel supervised_by;
    // End of variables declaration//GEN-END:variables
}
