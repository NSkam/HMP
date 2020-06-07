package hmp_gui;

import java.util.ArrayList;
import data.Epimelitis;
import data.Patient;
import data.Doctor;
import data.Application;
import data.Application_History;


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
     * @param epimelitis
     */
    public Dashboard_Epimelitis(Epimelitis epimelitis) {
        this.epimelitis=epimelitis;
        initComponents();
        Settings();     
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
        ep_name = new javax.swing.JLabel();
        ep_amka = new javax.swing.JLabel();
        ep_speciality = new javax.swing.JLabel();
        ep_clinic = new javax.swing.JLabel();
        ep_rank = new javax.swing.JLabel();
        amka_field = new javax.swing.JTextArea();
        name_field = new javax.swing.JTextArea();
        speciality_field = new javax.swing.JTextArea();
        clinic_field = new javax.swing.JTextArea();
        rank_field = new javax.swing.JTextArea();
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
        select_patient_msg = new javax.swing.JLabel();
        select_patient_msg.setVisible(false);
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

        ep_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ep_name.setForeground(new java.awt.Color(255, 255, 255));
        ep_name.setText("Ονοματεπώνυμο:");

        ep_amka.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ep_amka.setForeground(new java.awt.Color(255, 255, 255));
        ep_amka.setText("AMKA:");

        ep_speciality.setBackground(new java.awt.Color(255, 255, 255));
        ep_speciality.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ep_speciality.setForeground(new java.awt.Color(255, 255, 255));
        ep_speciality.setText("Ειδικότητα:");

        ep_clinic.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ep_clinic.setForeground(new java.awt.Color(255, 255, 255));
        ep_clinic.setText("Κλινική:");

        ep_rank.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ep_rank.setForeground(new java.awt.Color(255, 255, 255));
        ep_rank.setText("Βαθμός:");

        amka_field.setEditable(false);
        amka_field.setColumns(20);
        amka_field.setRows(5);

        name_field.setEditable(false);
        name_field.setColumns(20);
        name_field.setRows(5);

        speciality_field.setEditable(false);
        speciality_field.setColumns(20);
        speciality_field.setRows(5);

        clinic_field.setEditable(false);
        clinic_field.setColumns(20);
        clinic_field.setRows(5);

        rank_field.setEditable(false);
        rank_field.setColumns(20);
        rank_field.setRows(5);

        javax.swing.GroupLayout user_infoLayout = new javax.swing.GroupLayout(user_info);
        user_info.setLayout(user_infoLayout);
        user_infoLayout.setHorizontalGroup(
            user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_infoLayout.createSequentialGroup()
                .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(user_infoLayout.createSequentialGroup()
                        .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ep_speciality)
                            .addComponent(ep_amka)
                            .addComponent(ep_name))
                        .addGap(18, 18, 18)
                        .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(speciality_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amka_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(user_infoLayout.createSequentialGroup()
                        .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(user_infoLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(ep_rank))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_infoLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(ep_clinic)))
                        .addGap(18, 18, 18)
                        .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clinic_field)
                            .addComponent(rank_field, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        user_infoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {amka_field, clinic_field, name_field, rank_field, speciality_field});

        user_infoLayout.setVerticalGroup(
            user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_infoLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ep_amka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ep_name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amka_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(speciality_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ep_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ep_clinic, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clinic_field, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rank_field, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(ep_rank, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(173, 173, 173))
        );

        user_infoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {amka_field, clinic_field, name_field, rank_field, speciality_field});

        user_infoLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ep_amka, ep_clinic, ep_name, ep_rank, ep_speciality});

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
                .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(select_appl_label)
                    .addGroup(applicationsLayout.createSequentialGroup()
                        .addComponent(create_new_appl)
                        .addGap(281, 281, 281)
                        .addComponent(select_appl_button))
                    .addComponent(Appl_Scroll))
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
        Patient_Scroll.setViewportView(Patient_Jlist);

        SelectPatButton.setText("Επιλογή");
        SelectPatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPatButtonActionPerformed(evt);
            }
        });

        select_patient_msg.setBackground(new java.awt.Color(102, 153, 255));
        select_patient_msg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        select_patient_msg.setForeground(new java.awt.Color(255, 0, 0));
        select_patient_msg.setText("<html>Παρακαλώ επιλέξτε κάποιον Ασθενή.</html>");

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
                            .addComponent(select_patient_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SelectPatButton))
                        .addComponent(Patient_Scroll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        patient_listLayout.setVerticalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_listLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(select_patient_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Patient_Scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectPatButton)
                    .addComponent(select_patient_msg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    try{
       int Pat_Jlist_Index = Patient_Jlist.getSelectedIndex();
       Patient patient = epimelitis.getClinic().getPatientList().get(Pat_Jlist_Index);
       boolean can_check = patient.CheckDocPermissions(epimelitis.getAMKA(),"Check");
       //An isxuei dhmiourgise to parathyro patient_profile, kane set to info tou patient sta pedia
       //kai kane to parathyro visible, alliws kane display error message.
       if (can_check){
           patient = patient.getPatientInfo();
           Patient_Profile PatientProfile = new Patient_Profile(this,patient,Pat_Jlist_Index);
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
    }
    catch(java.lang.ArrayIndexOutOfBoundsException e){
        select_patient_msg.setVisible(true);
        }
    }//GEN-LAST:event_SelectPatButtonActionPerformed

    private void createNewAppl(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewAppl
           Available_Applications available_applications_window = new Available_Applications(this);
           available_applications_window.setVisible(true);
           this.setEnabled(false);
    }//GEN-LAST:event_createNewAppl

    
    //Test DATA
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
    }
    
    //Test DATA
    public void InitPatientList(){
        //////////////////Test DATA////////////////////
        /********************************************/
        ArrayList<Patient> tempArray= new ArrayList<Patient>(200);
        
        Doctor d1 = new Doctor();
        Doctor d2 = new Doctor(123, "Κωστής", "Ψυχίατρος", epimelitis.getClinic());
        epimelitis.getClinic().getPersonnel().add(d2);
        Patient p1 = new Patient(1, "BOB A", 12, "Thanatos1", "Death1", epimelitis, Patient.status_enum.very_bad);
        Patient p2 = new Patient(2, "BOB B", 13, "Thanatos2", "Death2", epimelitis, Patient.status_enum.very_bad);
        Patient p3 = new Patient(3, "BOB C", 14, "Thanatos3", "Death3", d2, Patient.status_enum.very_bad);
        Patient p4 = new Patient(4, "BOB D", 15, "Thanatos5", "Death4", d1, Patient.status_enum.very_bad);
                
        tempArray.add(p1);
        tempArray.add(p2);
        tempArray.add(p3);
        tempArray.add(p4);
        epimelitis.getClinic().getPatientList().add(p1);
        epimelitis.getClinic().getPatientList().add(p2);
        epimelitis.getClinic().getPatientList().add(p3);
        epimelitis.getClinic().getPatientList().add(p4);
        
       epimelitis.setPatientList(tempArray);
       /************************************************/

    }
    
    //Kanei Display to Patient Menu kai ti lista asthenwn tis klinikhs
    public void displayPatListMenu(){
        //Prosthetoume ta stoixeia sto model tis patient_list
        javax.swing.DefaultListModel<String> patient_jlist_model = (javax.swing.DefaultListModel<String>)this.Patient_Jlist.getModel();
        patient_jlist_model.clear();
         for(int i=0 ; i<epimelitis.getClinic().getPatientList().size();i++){
         patient_jlist_model.addElement("AMKA: " + epimelitis.getClinic().getPatientList().get(i).getAmka()+ "        " + "Name: " + epimelitis.getClinic().getPatientList().get(i).getName());
         }
        
         //Emfanizoume ta stoixeia
        Patient_Jlist.setVisible(true);
        Patient_Scroll.setVisible(true);
        select_patient_msg.setVisible(false);
        
    }
    
    //Kanei Display to Application Menu
    public void displayAppMenu(){
        //Prosthetoume ta stoixeia sto model tis Appl_List
        javax.swing.DefaultListModel<String> application_jlist_model = (javax.swing.DefaultListModel<String>)this.getAppl_List().getModel();
         application_jlist_model.clear();
         for(int i=0 ; i<Appl_history.getApplHistory().size();i++){
             application_jlist_model.addElement("ID: " + Appl_history.getApplHistory().get(i).getID()+ " " + "Ημερομηνία: " + Appl_history.getApplHistory().get(i).getDate() + " " + "Υποβλήθηκε από: " + Appl_history.getApplHistory().get(i).getDoctor().getName() + " Κατάστηση: " +Appl_history.getApplHistory().get(i).getStatus() + " Είδος: "+ Appl_history.getApplHistory().get(i).getType());
         }
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
        select_patient_msg.setVisible(false);
        Appl_Scroll.setVisible(false);
        Appl_List.setVisible(false);
        amka_field.setText(Integer.toString(this.epimelitis.getAMKA()));
        name_field.setText(this.epimelitis.getName());
        speciality_field.setText(this.epimelitis.getSpeciality());
        clinic_field.setText((this.epimelitis.getClinicName()));
        rank_field.setText(Character.toString(this.epimelitis.getRank()));
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
            public void run() {}
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
    private javax.swing.JTextArea amka_field;
    private javax.swing.JPanel applications;
    private javax.swing.JTextArea clinic_field;
    private javax.swing.JPanel clinic_info;
    private javax.swing.JButton create_new_appl;
    private javax.swing.JPanel eidik_comments;
    private javax.swing.JLabel ep_amka;
    private javax.swing.JLabel ep_clinic;
    private javax.swing.JLabel ep_name;
    private javax.swing.JLabel ep_rank;
    private javax.swing.JLabel ep_speciality;
    private javax.swing.JButton logout_button;
    private javax.swing.JTextArea name_field;
    private javax.swing.JPanel patient_list;
    private javax.swing.JTextArea rank_field;
    private javax.swing.JButton select_appl_button;
    private javax.swing.JLabel select_appl_label;
    private javax.swing.JLabel select_patient_label;
    private javax.swing.JLabel select_patient_msg;
    private javax.swing.JTextArea speciality_field;
    private javax.swing.JPanel user_info;
    // End of variables declaration//GEN-END:variables

}
