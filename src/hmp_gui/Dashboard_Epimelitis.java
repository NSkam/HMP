package hmp_gui;

import java.sql.*;  
import java.util.ArrayList;
import java.util.Arrays;
import data.Epimelitis;
import data.Clinic;
import data.Patient;
import data.Doctor;
import data.Application;
import data.Application_History;
import java.text.SimpleDateFormat;  



/**
 *
 * @author Nikolaos Skamnelos
 */
public class Dashboard_Epimelitis extends javax.swing.JFrame {
    
    
        Epimelitis epimelitis = new Epimelitis();
        Application_History Appl_history = new Application_History(epimelitis);
        ArrayList<String> Patient_JList_Str = new ArrayList<String>(200);
        ArrayList<String> Application_JList_Str = new ArrayList<String>(200);
    /**
     * Creates new form Dashboard
     */
    public Dashboard_Epimelitis() {
        initComponents();
        Settings();
        this.getAmkaDB();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard_Layer = new javax.swing.JLayeredPane();
        Button_Panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        Tab_Panel = new javax.swing.JPanel();
        Dashboard_tabs = new javax.swing.JTabbedPane();
        user_info = new javax.swing.JPanel();
        applications = new javax.swing.JPanel();
        select_appl_label = new javax.swing.JLabel();
        Appl_Scroll = new javax.swing.JScrollPane();
        Appl_List = new javax.swing.JList<>();
        this.InitApplList();
        select_appl_button = new javax.swing.JButton();
        create_new_appl = new javax.swing.JButton();
        patient_list = new javax.swing.JPanel();
        Patient_Scroll = new javax.swing.JScrollPane();
        Patient_Jlist = new javax.swing.JList<>();
        this.InitPatientList();
        SelectPatButton = new javax.swing.JButton();
        permission_error_msg = new javax.swing.JLabel();
        permission_error_msg.setVisible(false);
        select_patient_label = new javax.swing.JLabel();
        clinic_info = new javax.swing.JPanel();
        eidik_comments = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setLocation(new java.awt.Point(800, 400));

        Dashboard_Layer.setBackground(new java.awt.Color(153, 204, 255));
        Dashboard_Layer.setForeground(new java.awt.Color(153, 204, 255));

        logout_button.setBackground(new java.awt.Color(255, 0, 0));
        logout_button.setText("Logout");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_PanelLayout = new javax.swing.GroupLayout(Button_Panel);
        Button_Panel.setLayout(Button_PanelLayout);
        Button_PanelLayout.setHorizontalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_PanelLayout.createSequentialGroup()
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button_PanelLayout.setVerticalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_button))
        );

        Dashboard_tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        Dashboard_tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Dashboard_tabsStateChanged(evt);
            }
        });

        user_info.setBackground(new java.awt.Color(153, 204, 255));
        user_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout user_infoLayout = new javax.swing.GroupLayout(user_info);
        user_info.setLayout(user_infoLayout);
        user_infoLayout.setHorizontalGroup(
            user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        user_infoLayout.setVerticalGroup(
            user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp; Χρήστη</html>", user_info);

        applications.setBackground(new java.awt.Color(153, 204, 255));
        applications.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        select_appl_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        select_appl_label.setForeground(new java.awt.Color(255, 255, 255));
        select_appl_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select_appl_label.setText("Παρακαλώ επιλέξτε μία Αίτηση:");
        select_appl_label.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        Appl_List.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Appl_List.setModel(new javax.swing.DefaultListModel<String>());
        //Update Default List Model for the Jlist
        javax.swing.DefaultListModel<String> application_jlist_model = (javax.swing.DefaultListModel<String>)Appl_List.getModel();
        for(int x=0;x<Application_JList_Str.size();x++){
            application_jlist_model.addElement(Application_JList_Str.get(x));
        }
        Appl_Scroll.setViewportView(Appl_List);

        select_appl_button.setText("Επιλογή");

        create_new_appl.setText("Δημιουργία Νέας Αίτησης");
        create_new_appl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewAppl(evt);
            }
        });

        javax.swing.GroupLayout applicationsLayout = new javax.swing.GroupLayout(applications);
        applications.setLayout(applicationsLayout);
        applicationsLayout.setHorizontalGroup(
            applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_appl_label)
                    .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(applicationsLayout.createSequentialGroup()
                            .addComponent(create_new_appl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(select_appl_button))
                        .addComponent(Appl_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        applicationsLayout.setVerticalGroup(
            applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, applicationsLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(select_appl_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Appl_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(select_appl_button)
                    .addComponent(create_new_appl))
                .addGap(32, 32, 32))
        );

        Dashboard_tabs.addTab("Αιτήσεις", applications);

        patient_list.setBackground(new java.awt.Color(153, 204, 255));
        patient_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Patient_Jlist.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        Patient_Jlist.setModel(new javax.swing.DefaultListModel<String>());
        //Update Default List Model for the Jlist
        javax.swing.DefaultListModel<String> patient_jlist_model = (javax.swing.DefaultListModel<String>)Patient_Jlist.getModel();
        for(int x=0;x<Patient_JList_Str.size();x++){
            patient_jlist_model.addElement(Patient_JList_Str.get(x));
        }
        Patient_Scroll.setViewportView(Patient_Jlist);

        SelectPatButton.setText("Επιλογή");
        SelectPatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPatButtonActionPerformed(evt);
            }
        });

        permission_error_msg.setBackground(new java.awt.Color(102, 153, 255));
        permission_error_msg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        permission_error_msg.setForeground(new java.awt.Color(255, 0, 0));
        permission_error_msg.setText("<html>Δεν έχετε άδεια να δείτε τα στοιχεία αυτού του Ασθενή... <br>Επιλέξτε κάποιον άλλον.</html>");

        select_patient_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        select_patient_label.setForeground(new java.awt.Color(255, 255, 255));
        select_patient_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        select_patient_label.setText("Παρακαλώ επιλέξτε Ασθενή:");
        select_patient_label.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout patient_listLayout = new javax.swing.GroupLayout(patient_list);
        patient_list.setLayout(patient_listLayout);
        patient_listLayout.setHorizontalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_listLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select_patient_label)
                    .addGroup(patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(patient_listLayout.createSequentialGroup()
                            .addComponent(permission_error_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectPatButton))
                        .addComponent(Patient_Scroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        patient_listLayout.setVerticalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_listLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(select_patient_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Patient_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectPatButton)
                    .addComponent(permission_error_msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        Dashboard_tabs.addTab("Λίστα Ασθενών", patient_list);

        clinic_info.setBackground(new java.awt.Color(153, 204, 255));
        clinic_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout clinic_infoLayout = new javax.swing.GroupLayout(clinic_info);
        clinic_info.setLayout(clinic_infoLayout);
        clinic_infoLayout.setHorizontalGroup(
            clinic_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clinic_infoLayout.setVerticalGroup(
            clinic_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp;&nbsp; Κλινικής</html>", clinic_info);

        eidik_comments.setBackground(new java.awt.Color(153, 204, 255));
        eidik_comments.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout eidik_commentsLayout = new javax.swing.GroupLayout(eidik_comments);
        eidik_comments.setLayout(eidik_commentsLayout);
        eidik_commentsLayout.setHorizontalGroup(
            eidik_commentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        eidik_commentsLayout.setVerticalGroup(
            eidik_commentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Λίστα<br> Ειδικευόμενων</html>", eidik_comments);

        javax.swing.GroupLayout Tab_PanelLayout = new javax.swing.GroupLayout(Tab_Panel);
        Tab_Panel.setLayout(Tab_PanelLayout);
        Tab_PanelLayout.setHorizontalGroup(
            Tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_tabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        Tab_PanelLayout.setVerticalGroup(
            Tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_tabs, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        Dashboard_tabs.getAccessibleContext().setAccessibleParent(Dashboard_tabs);

        Dashboard_Layer.setLayer(Button_Panel, 2);
        Dashboard_Layer.setLayer(Tab_Panel, 1);

        javax.swing.GroupLayout Dashboard_LayerLayout = new javax.swing.GroupLayout(Dashboard_Layer);
        Dashboard_Layer.setLayout(Dashboard_LayerLayout);
        Dashboard_LayerLayout.setHorizontalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dashboard_LayerLayout.createSequentialGroup()
                .addComponent(Button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 600, Short.MAX_VALUE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tab_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dashboard_LayerLayout.setVerticalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard_LayerLayout.createSequentialGroup()
                .addGap(0, 454, Short.MAX_VALUE)
                .addComponent(Button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tab_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_Layer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_Layer)
        );

        getAccessibleContext().setAccessibleName("DashboardEpimelitis");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Otan ginete logout kanei clear to token pou deixnei to eidos xrhsth
    private void clearTokens(){
        Login.epimelitis_counter = false;
    }
    
    //Logout Function
    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
       
        clearTokens();
        dispose();
        Login login_page = new Login();
        login_page.setVisible(true);
        
    }//GEN-LAST:event_logout_buttonActionPerformed

    //An epilektei h 1h h h 2h kartela na kanei diplay
    private void Dashboard_tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Dashboard_tabsStateChanged
        if(Dashboard_tabs.getSelectedIndex()==2) 
            {
                this.displayPatListMenu();
            }
        if(Dashboard_tabs.getSelectedIndex()==1)
        {
                this.displayAppMenu();
        }
    }//GEN-LAST:event_Dashboard_tabsStateChanged

    //Otan patiete to koumpi pairnei to Selected Value apo th lista kai kanei checkDocPermisions()
    private void SelectPatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectPatButtonActionPerformed
       int Pat_Jlist_Index = Patient_Jlist.getSelectedIndex();
       Patient patient = epimelitis.getClinic().getPatientList().get(Pat_Jlist_Index);
       boolean can_check = patient.CheckDocPermissions(patient.getSupervisedBy().getAMKA(),"Check");
       //An isxuei dhmiourgise to parathyro patient_profile, kane set to info tou patient sta pedia
       //kai kane to parathyro visible, alliws kane display error message.
       if (can_check){
           patient = patient.getPatientInfo();//***************************************
           Patient_Profile PatientProfile = new Patient_Profile(epimelitis.getAMKA(),this,patient,Pat_Jlist_Index);
           PatientProfile.ShowPatientInfo(patient);
           PatientProfile.setVisible(true);
           this.setEnabled(false);
       }
       else {
           Conditional_Message display_error_msg = new Conditional_Message(this);
           display_error_msg.triggerMsg("<html>ΣΦΑΛΜΑ: <br> Δεν έχετε άδεια να δείτε τα στοιχεία αυτού του Ασθενή... <br>Επιλέξτε κάποιον άλλον.</html>");
           display_error_msg.setVisible(true);
           this.setEnabled(false);
       }
    }//GEN-LAST:event_SelectPatButtonActionPerformed

    private void createNewAppl(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAppl
           Available_Applications available_applications_window = new Available_Applications(this);
           available_applications_window.setVisible(true);
           this.setEnabled(false);
    }//GEN-LAST:event_createNewAppl
    
    //Gia na paroume to Amka tou giatrou*************************************
    public void getAmkaDB(){
       epimelitis.setAMKA(1234567);
    }
    
    //Gia na paroume to Application List tou giatrou
    public void InitApplList(){
        /////////////Test DATA//////////////
        /**********************************/
        Application appl1 =new Application(epimelitis,Application.Type.admission_appl);
        Application appl2 =new Application(epimelitis,Application.Type.admission_appl);
        Application appl3 =new Application(epimelitis,Application.Type.admission_appl);
        Application appl4 =new Application(epimelitis,Application.Type.admission_appl);
        Application appl5 =new Application(epimelitis,Application.Type.admission_appl);
        Application appl6 =new Application(epimelitis,Application.Type.admission_appl);
        Appl_history.getApplHistory().add(appl1);
        Appl_history.getApplHistory().add(appl2);
        Appl_history.getApplHistory().add(appl3);
        Appl_history.getApplHistory().add(appl4);
        Appl_history.getApplHistory().add(appl5);
        Appl_history.getApplHistory().add(appl6);
        /**********************************/
        //Ftiaxnoume to List pou tha kanei display sto Application Scroll kai List
         Application_JList_Str.clear();
         for(int i=0 ; i<Appl_history.getApplHistory().size();i++){
             this.Application_JList_Str.add("ID: " + Appl_history.getApplHistory().get(i).getID()+ " " + "Ημερομηνία: " + Appl_history.getApplHistory().get(i).getDate() + " " + "Υποβλήθηκε από: " + Appl_history.getApplHistory().get(i).getDoctor().getName() + " Κατάστηση: " +Appl_history.getApplHistory().get(i).getStatus() + " Είδος: "+ Appl_history.getApplHistory().get(i).getType());
         }
    }
    
    //Gia na paroume to Patient List tou giatrou
    public void InitPatientList(){
        //////////////////Test DATA////////////////////
        /********************************************/
        ArrayList<Patient> tempArray= new ArrayList<Patient>(200);
      
        Doctor d1 = new Doctor();
        Patient p1 = new Patient(1, "BOB1", 12, "Thanatos1", "Death1", d1, Patient.status_enum.very_bad);
        Patient p2 = new Patient(2, "BOB2", 13, "Thanatos2", "Death2", d1, Patient.status_enum.very_bad);
        Patient p3 = new Patient(3, "BOB3", 14, "Thanatos3", "Death3", d1, Patient.status_enum.very_bad);
        Patient p4 = new Patient(4, "BOB4", 15, "Thanatos5", "Death4", d1, Patient.status_enum.very_bad);
                
        tempArray.add(p1);
        tempArray.add(p2);
        tempArray.add(p3);
        tempArray.add(p4);
        epimelitis.getClinic().getPatientList().add(p1);
        epimelitis.getClinic().getPatientList().add(p2);
        epimelitis.getClinic().getPatientList().add(p3);
        epimelitis.getClinic().getPatientList().add(p4);
        /************************************************/
        
       epimelitis.setPatientList(tempArray);
       //Ftiaxnoume to List pou tha kanei display sto Patient Scroll kai List
       Patient_JList_Str.clear();
         for(int i=0 ; i<epimelitis.getPatientList().size();i++){
         this.Patient_JList_Str.add("AMKA: " + epimelitis.getClinic().getPatientList().get(i).getAmka()+ "        " + "Name: " + epimelitis.getClinic().getPatientList().get(i).getName());
         }
    }
    
    //Kanei Display to Patient Menu
    public void displayPatListMenu(){
        Patient_Jlist.setVisible(true);
        Patient_Scroll.setVisible(true);
        permission_error_msg.setVisible(false);
        
    }
    
    //Kanei Display to Application Menu
    public void displayAppMenu(){
        Appl_Scroll.setVisible(true);
        Appl_List.setVisible(true);
    }
    
    //Epistrefei thn Appl_List
    public javax.swing.JList<String> getAppl_List(){
        return this.Appl_List;
    }
    //Epistrefei thn Patient_jlist
    public javax.swing.JList<String> getPatient_Jlist(){
        return this.Patient_Jlist;
    }
    //Apokryptei merika Stoixeia tou gui
    public void Settings(){
        Patient_Scroll.setVisible(false);
        Patient_Jlist.setVisible(false);
        permission_error_msg.setVisible(false);
        Appl_Scroll.setVisible(false);
        Appl_List.setVisible(false);
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
            java.util.logging.Logger.getLogger(Dashboard_Epimelitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Epimelitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Epimelitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Epimelitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new Dashboard_Epimelitis().setVisible(true);  
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Appl_List;
    private javax.swing.JScrollPane Appl_Scroll;
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JLayeredPane Dashboard_Layer;
    private javax.swing.JTabbedPane Dashboard_tabs;
    private javax.swing.JList<String> Patient_Jlist;
    private javax.swing.JScrollPane Patient_Scroll;
    private javax.swing.JButton SelectPatButton;
    private javax.swing.JPanel Tab_Panel;
    private javax.swing.JPanel applications;
    private javax.swing.JPanel clinic_info;
    private javax.swing.JButton create_new_appl;
    private javax.swing.JPanel eidik_comments;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel patient_list;
    private javax.swing.JLabel permission_error_msg;
    private javax.swing.JButton select_appl_button;
    private javax.swing.JLabel select_appl_label;
    private javax.swing.JLabel select_patient_label;
    private javax.swing.JPanel user_info;
    // End of variables declaration//GEN-END:variables

}
