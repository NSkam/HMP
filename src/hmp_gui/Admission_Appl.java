package hmp_gui;


import data.Application;
import data.Admission_Application;
import data.Patient;
import java.text.SimpleDateFormat;
/**
 *
 * @author Nikolaos Skamnelos
 */
public class Admission_Appl extends javax.swing.JFrame {

    
    private Admission_Application admission_application = new Admission_Application();
    private Dashboard_Epimelitis dashboard;
    /**
     * Creates new form Admission_Appl
     */
    public Admission_Appl(Admission_Application appl, Dashboard_Epimelitis dashboard) {
        Settings(appl, dashboard);
        initComponents();
    }

    public void Settings(Admission_Application appl, Dashboard_Epimelitis dashboard){
        this.admission_application = appl;
        this.dashboard = dashboard;
        this.dashboard.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Admission_Appl_Panel = new javax.swing.JPanel();
        patient_history_label = new javax.swing.JLabel();
        amka = new javax.swing.JLabel();
        patient_amka = new javax.swing.JTextArea();
        onoma = new javax.swing.JLabel();
        patient_name = new javax.swing.JTextArea();
        age = new javax.swing.JLabel();
        patient_age = new javax.swing.JTextArea();
        patient_history = new javax.swing.JTextArea();
        patient_conditions = new javax.swing.JTextArea();
        patient_cond_label = new javax.swing.JLabel();
        exit_button = new javax.swing.JButton();
        create_appl_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Admission Application Form");
        setLocation(new java.awt.Point(800, 400));

        Admission_Appl_Panel.setBackground(new java.awt.Color(153, 204, 255));

        patient_history_label.setBackground(new java.awt.Color(255, 255, 255));
        patient_history_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        patient_history_label.setForeground(new java.awt.Color(255, 255, 255));
        patient_history_label.setText("Ιστορικό Ασθενή:");

        amka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amka.setForeground(new java.awt.Color(255, 255, 255));
        amka.setText("AMKA:");

        patient_amka.setColumns(20);
        patient_amka.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        patient_amka.setRows(5);

        onoma.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        onoma.setForeground(new java.awt.Color(255, 255, 255));
        onoma.setText("Ονοματεπώνυμο:");

        patient_name.setColumns(20);
        patient_name.setRows(5);

        age.setBackground(new java.awt.Color(255, 255, 255));
        age.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setText("Ηλικία:");

        patient_age.setColumns(20);
        patient_age.setRows(5);

        patient_history.setColumns(20);
        patient_history.setRows(5);

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

        javax.swing.GroupLayout Admission_Appl_PanelLayout = new javax.swing.GroupLayout(Admission_Appl_Panel);
        Admission_Appl_Panel.setLayout(Admission_Appl_PanelLayout);
        Admission_Appl_PanelLayout.setHorizontalGroup(
            Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Admission_Appl_PanelLayout.createSequentialGroup()
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Admission_Appl_PanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Admission_Appl_PanelLayout.createSequentialGroup()
                                .addComponent(exit_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(create_appl_button))
                            .addGroup(Admission_Appl_PanelLayout.createSequentialGroup()
                                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Admission_Appl_PanelLayout.createSequentialGroup()
                                        .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(onoma)
                                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Admission_Appl_PanelLayout.createSequentialGroup()
                                        .addComponent(patient_history, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(patient_conditions, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 21, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Admission_Appl_PanelLayout.createSequentialGroup()
                        .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Admission_Appl_PanelLayout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(amka)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patient_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Admission_Appl_PanelLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(patient_history_label)
                                .addGap(157, 157, 157)
                                .addComponent(patient_cond_label)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        Admission_Appl_PanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {patient_conditions, patient_history});

        Admission_Appl_PanelLayout.setVerticalGroup(
            Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Admission_Appl_PanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(create_appl_button, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit_button))
                .addGap(18, 18, 18)
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amka)
                    .addComponent(patient_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(onoma)
                    .addComponent(patient_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(age)
                    .addComponent(patient_age, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_history_label)
                    .addComponent(patient_cond_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Admission_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_history, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(patient_conditions, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Admission_Appl_PanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {patient_conditions, patient_history});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admission_Appl_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Admission_Appl_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        this.dashboard.setEnabled(true);
        dispose();
    }//GEN-LAST:event_exit_buttonActionPerformed

    //Kalei ton elenxo gia ta fields kai an einai true to check tote kanei set katalhla tis metablhtes tou Admission Application kai save to application
    private void CreateApplication(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateApplication
        SimpleDateFormat date_format = new SimpleDateFormat("dd/MM/yyyy");
        boolean check = checkFieldValues();
        if(check == true){
          save_appl();
          dashboard.Appl_history.updateAppHistory(this.admission_application);
          String application_str = "ID: " + this.admission_application.getID()+ "    " + "Ημερομηνία: " + date_format.format(this.admission_application.getDate()) + "    " + "Υποβλήθηκε από: " + this.admission_application.getDoctor().getName() + "    Κατάστηση: " +this.admission_application.getStatus() + "    Είδος: "+ this.admission_application.getType();
          dashboard.setEnabled(true);
          javax.swing.DefaultListModel<String> application_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getAppl_List().getModel();
          application_jlist_model.addElement(application_str);
          dispose();

        }
        else{
           Conditional_Message display_error_msg = new Conditional_Message(this);
           display_error_msg.triggerMsg("<html>ΣΦΑΛΜΑ: <br> Έχετε βάλει λάθος τιμή σε κάποιο από τα πέδια...</html>");
           display_error_msg.setVisible(true);
           this.setEnabled(false);}
    }//GEN-LAST:event_CreateApplication
    
    //Elenxei tis times sta fields
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
    //Etoimazei to application gia na prosthehei sto istoriko
    public void save_appl(){    
        int amka = Integer.parseInt(patient_amka.getText());
        int age = Integer.parseInt(patient_age.getText());
        Patient.status_enum status = Patient.status_enum.ok;
        this.admission_application.IncID();
        this.admission_application.getPatient().setPatientInfo(amka, patient_name.getText(), age, patient_history.getText(), patient_conditions.getText(), dashboard.epimelitis.getAMKA(), status);
        this.admission_application.setDoctor(dashboard.epimelitis);
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
            java.util.logging.Logger.getLogger(Admission_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admission_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admission_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admission_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admission_Appl_Panel;
    private javax.swing.JLabel age;
    private javax.swing.JLabel amka;
    private javax.swing.JButton create_appl_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JLabel onoma;
    private javax.swing.JTextArea patient_age;
    private javax.swing.JTextArea patient_amka;
    private javax.swing.JLabel patient_cond_label;
    private javax.swing.JTextArea patient_conditions;
    private javax.swing.JTextArea patient_history;
    private javax.swing.JLabel patient_history_label;
    private javax.swing.JTextArea patient_name;
    // End of variables declaration//GEN-END:variables
}
