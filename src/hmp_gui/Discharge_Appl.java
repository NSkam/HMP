package hmp_gui;

import data.Application;
import data.Discharge_Application;
import data.Patient;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Discharge_Appl extends javax.swing.JFrame {

    
    private Discharge_Application discharge_application = new Discharge_Application();
    private Dashboard_Epimelitis dashboard;
    ArrayList<String> Amka_JList_Str = new ArrayList<String>(200);
    ArrayList<String> Name_JList_Str = new ArrayList<String>(200);
    /**
     * Creates new form Admission_Appl
     */
    public Discharge_Appl(Discharge_Application appl, Dashboard_Epimelitis dashboard) {
        Settings(appl, dashboard);
        initComponents();
    }

    public void Settings(Discharge_Application appl, Dashboard_Epimelitis dashboard){
        this.discharge_application = appl;
        this.dashboard = dashboard;
        this.dashboard.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Discharged_Appl_Panel = new javax.swing.JPanel();
        patient_history_label = new javax.swing.JLabel();
        amka = new javax.swing.JLabel();
        onoma = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        patient_age = new javax.swing.JTextArea();
        patient_history = new javax.swing.JTextArea();
        patient_conditions = new javax.swing.JTextArea();
        patient_cond_label = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        create_appl_button = new javax.swing.JButton();
        amka_combo_box = new javax.swing.JComboBox<>();
        name_combo_box = new javax.swing.JComboBox<>();
        this.InitComboBoxes();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Discharge Application Form");
        setLocation(new java.awt.Point(800, 400));

        Discharged_Appl_Panel.setBackground(new java.awt.Color(153, 204, 255));

        patient_history_label.setBackground(new java.awt.Color(255, 255, 255));
        patient_history_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patient_history_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_history_label.setText("Ιστορικό Ασθενή:");

        amka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amka.setForeground(new java.awt.Color(255, 255, 255));
        amka.setText("AMKA:");

        onoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        onoma.setForeground(new java.awt.Color(255, 255, 255));
        onoma.setText("Ονοματεπώνυμο:");

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setText("Ηλικία:");

        patient_age.setEditable(false);
        patient_age.setColumns(20);
        patient_age.setRows(5);

        patient_history.setEditable(false);
        patient_history.setColumns(20);
        patient_history.setRows(5);

        patient_conditions.setEditable(false);
        patient_conditions.setColumns(20);
        patient_conditions.setRows(5);

        patient_cond_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patient_cond_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_cond_label.setText("Παθήσεις Ασθενή:");

        exit_button.setText("Έξοδος");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        create_appl_button.setText("Δημιουργία Αίτησης");
        create_appl_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateApplication(evt);
            }
        });

        amka_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(Amka_JList_Str.toArray(new String[0])));
        amka_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amka_combo_boxActionPerformed(evt);
            }
        });

        name_combo_box.setModel(new javax.swing.DefaultComboBoxModel<>(Name_JList_Str.toArray(new String[0])));
        name_combo_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_combo_boxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Discharged_Appl_PanelLayout = new javax.swing.GroupLayout(Discharged_Appl_Panel);
        Discharged_Appl_Panel.setLayout(Discharged_Appl_PanelLayout);
        Discharged_Appl_PanelLayout.setHorizontalGroup(
            Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Discharged_Appl_PanelLayout.createSequentialGroup()
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Discharged_Appl_PanelLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(amka)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amka_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Discharged_Appl_PanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(patient_history_label)
                        .addGap(157, 157, 157)
                        .addComponent(patient_cond_label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Discharged_Appl_PanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Discharged_Appl_PanelLayout.createSequentialGroup()
                        .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(onoma)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86))
                    .addGroup(Discharged_Appl_PanelLayout.createSequentialGroup()
                        .addComponent(patient_history, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(patient_conditions, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(Discharged_Appl_PanelLayout.createSequentialGroup()
                        .addComponent(exit_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(create_appl_button)
                        .addGap(18, 18, 18))))
        );

        Discharged_Appl_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {patient_conditions, patient_history});

        Discharged_Appl_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {amka_combo_box, name_combo_box, patient_age});

        Discharged_Appl_PanelLayout.setVerticalGroup(
            Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Discharged_Appl_PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Discharged_Appl_PanelLayout.createSequentialGroup()
                        .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(create_appl_button, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exit_button))
                        .addGap(22, 22, 22)
                        .addComponent(amka))
                    .addComponent(amka_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onoma)
                    .addComponent(name_combo_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(age)
                    .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_history_label)
                    .addComponent(patient_cond_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Discharged_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_history, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_conditions, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Discharged_Appl_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {patient_conditions, patient_history});

        Discharged_Appl_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amka_combo_box, name_combo_box, patient_age});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Discharged_Appl_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Discharged_Appl_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        this.dashboard.setEnabled(true);
        dispose();
    }//GEN-LAST:event_exit_buttonActionPerformed
    
    //Kanei save to Application
    private void CreateApplication(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateApplication
            int index = amka_combo_box.getSelectedIndex();
            if(dashboard.epimelitis.getAMKA() == dashboard.epimelitis.getClinic().getPatientList().get(index).getSupervisedBy().getAMKA()){
            save_appl(index);
            dashboard.Appl_history.updateAppHistory(this.discharge_application);
            String application_str = "ID: " + this.discharge_application.getID()+ " " + "Ημερομηνία: " + this.discharge_application.getDate() + " " + "Υποβλήθηκε από: " + this.discharge_application.getDoctor().getName() + " Κατάστηση: " +this.discharge_application.getStatus() + " Είδος: "+ this.discharge_application.getType();
            dashboard.setEnabled(true);
            javax.swing.DefaultListModel<String> application_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getAppl_List().getModel();
            application_jlist_model.addElement(application_str);
            dispose();}
            else{       
           Conditional_Message display_error_msg = new Conditional_Message(this);
           display_error_msg.triggerMsg("<html>ΣΦΑΛΜΑ: <br> Δεν επιτρέπεται η έκδοση εξιτηρίου...</html>");
           display_error_msg.setVisible(true);
           this.dashboard.setEnabled(true);
           dispose();}
    }//GEN-LAST:event_CreateApplication
    
   
    //Allazei automata ta ypoloipa fields analoga me ti epilegete
    private void name_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_combo_boxActionPerformed
        int index = name_combo_box.getSelectedIndex();
        amka_combo_box.setSelectedIndex(index);
        patient_age.setText(Integer.toString(dashboard.epimelitis.getClinic().getPatientList().get(index).getAge()));
        patient_history.setText(dashboard.epimelitis.getClinic().getPatientList().get(index).getHistory());
        patient_conditions.setText(dashboard.epimelitis.getClinic().getPatientList().get(index).getConditions());
    }//GEN-LAST:event_name_combo_boxActionPerformed

    //Allazei automata ta ypoloipa fields analoga me ti epilegete   
    private void amka_combo_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amka_combo_boxActionPerformed
        int index = amka_combo_box.getSelectedIndex();
        name_combo_box.setSelectedIndex(index);
        patient_age.setText(Integer.toString(dashboard.epimelitis.getClinic().getPatientList().get(index).getAge()));
        patient_history.setText(dashboard.epimelitis.getClinic().getPatientList().get(index).getHistory());
        patient_conditions.setText(dashboard.epimelitis.getClinic().getPatientList().get(index).getConditions());                                           
    
    }//GEN-LAST:event_amka_combo_boxActionPerformed
  
    //Etoimazei to application gia na prosthehei sto istoriko
    public void save_appl(int index){    

        int amka = Integer.parseInt(amka_combo_box.getItemAt(index));
        int age = Integer.parseInt(patient_age.getText());
        String status = dashboard.epimelitis.getClinic().getPatientList().get(index).getStatus();
        Patient.status_enum status_var = Patient.status_enum.ok;
        if(status.equals("Excellent")) status_var = Patient.status_enum.excellent;
        if(status.equals("Good")) status_var = Patient.status_enum.good;
        if(status.equals("OK")) status_var = Patient.status_enum.ok;
        if(status.equals("Bad")) status_var = Patient.status_enum.bad;
        if(status.equals("Very Bad")) status_var = Patient.status_enum.very_bad;
        if(status.equals("Life Threatening")) status_var = Patient.status_enum.life_threatening;
        this.discharge_application.IncID();
        this.discharge_application.getPatient().setPatientInfo(amka, name_combo_box.getItemAt(index), age, patient_history.getText(), patient_conditions.getText(), dashboard.epimelitis.getAMKA(), status_var);
        this.discharge_application.setDoctor(dashboard.epimelitis);
    }
    
    //Kanei Initialize tous pinakes gia ta Combo Boxes
    public void InitComboBoxes(){
         //Ftiaxnoume to List pou tha kanei display sto Amka Combo Box 
         Amka_JList_Str.clear();
         for(int i=0 ; i<dashboard.epimelitis.getClinic().getPatientList().size();i++){
         this.Amka_JList_Str.add(Integer.toString(dashboard.epimelitis.getClinic().getPatientList().get(i).getAmka()));
         }
         //Ftiaxnoume to List pou tha kanei display sto Name Combo Box 
         Name_JList_Str.clear();
         for(int i=0 ; i<dashboard.epimelitis.getClinic().getPatientList().size();i++){
         this.Name_JList_Str.add(dashboard.epimelitis.getClinic().getPatientList().get(i).getName());
         }
        //Settaroume ta arxika fields wste na deixoun sto prwto asthenh
        patient_age.setText(Integer.toString(dashboard.epimelitis.getClinic().getPatientList().get(0).getAge()));
        patient_history.setText(dashboard.epimelitis.getClinic().getPatientList().get(0).getHistory());
        patient_conditions.setText(dashboard.epimelitis.getClinic().getPatientList().get(0).getConditions());
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
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Discharged_Appl_Panel;
    private javax.swing.JLabel age;
    private javax.swing.JLabel amka;
    private javax.swing.JComboBox<String> amka_combo_box;
    private javax.swing.JButton create_appl_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JComboBox<String> name_combo_box;
    private javax.swing.JLabel onoma;
    private javax.swing.JTextArea patient_age;
    private javax.swing.JLabel patient_cond_label;
    private javax.swing.JTextArea patient_conditions;
    private javax.swing.JTextArea patient_history;
    private javax.swing.JLabel patient_history_label;
    // End of variables declaration//GEN-END:variables
}
