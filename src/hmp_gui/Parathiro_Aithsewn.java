package hmp_gui;

import data.*;
import java.text.SimpleDateFormat;
/**
 *
 * @author Theodoros Tomadakis
 */
public class Parathiro_Aithsewn extends javax.swing.JFrame {
    
    private int app_index; //index aithshs
    private Application appl = null; //to application poy pernume
    private Dashboard_Headdoc dashboard; //Pairnei meso tou constructor thn timh tou prohgounmenou Dashboard
    /**
     * Creates new form Patient_Profile
     */
    public Parathiro_Aithsewn(Dashboard_Headdoc dashboard, Application application, int appl_index) { //arxikopoihsh toy dashboard twn aithsewn
        this.dashboard = dashboard;
        this.appl = application;
        this.app_index = appl_index;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parath_Aithsewn = new javax.swing.JPanel();
        Stoixeia_Ait = new javax.swing.JPanel();
        IDL = new javax.swing.JLabel();
        SBL = new javax.swing.JLabel();
        history_scroll = new javax.swing.JScrollPane();
        patient_history_panel = new javax.swing.JPanel();
        patient_history = new javax.swing.JTextArea();
        HMNIAL = new javax.swing.JLabel();
        OnAsthL = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        cond_scroll = new javax.swing.JScrollPane();
        patient_conditions_panel = new javax.swing.JPanel();
        patient_conditions = new javax.swing.JTextArea();
        patient_history_label = new javax.swing.JLabel();
        patient_cond_label = new javax.swing.JLabel();
        id = new javax.swing.JTextArea();
        submitted_by = new javax.swing.JTextArea();
        hmnia = new javax.swing.JTextArea();
        name = new javax.swing.JTextArea();
        exit_button = new javax.swing.JButton();
        cond = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        exit_button1 = new javax.swing.JButton();
        exit_button2 = new javax.swing.JButton();
        exit_button3 = new javax.swing.JButton();
        exit_button4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Info");
        setLocation(new java.awt.Point(800, 400));

        Parath_Aithsewn.setBackground(new java.awt.Color(153, 204, 255));

        Stoixeia_Ait.setBackground(new java.awt.Color(153, 204, 255));
        Stoixeia_Ait.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        IDL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        IDL.setForeground(new java.awt.Color(255, 255, 255));
        IDL.setText("ID Αίτησης:");

        SBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SBL.setForeground(new java.awt.Color(255, 255, 255));
        SBL.setText("Υποβλήθηκε από:");

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

        HMNIAL.setBackground(new java.awt.Color(255, 255, 255));
        HMNIAL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        HMNIAL.setForeground(new java.awt.Color(255, 255, 255));
        HMNIAL.setText("Ημ/νία υποβολής:");

        OnAsthL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OnAsthL.setForeground(new java.awt.Color(255, 255, 255));
        OnAsthL.setText("Όνομα ασθενή:");

        status.setBackground(new java.awt.Color(255, 255, 255));
        status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(255, 255, 255));
        status.setText("Κατάσταση Αίτησης:");

        patient_conditions.setEditable(false);
        patient_conditions.setColumns(20);
        patient_conditions.setRows(5);

        javax.swing.GroupLayout patient_conditions_panelLayout = new javax.swing.GroupLayout(patient_conditions_panel);
        patient_conditions_panel.setLayout(patient_conditions_panelLayout);
        patient_conditions_panelLayout.setHorizontalGroup(
            patient_conditions_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_conditions_panelLayout.createSequentialGroup()
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
        patient_cond_label.setText("Κατάσταση Ασθενή:");

        id.setEditable(false);
        id.setColumns(20);
        id.setRows(5);

        submitted_by.setEditable(false);
        submitted_by.setColumns(20);
        submitted_by.setRows(5);

        hmnia.setEditable(false);
        hmnia.setColumns(20);
        hmnia.setRows(5);

        name.setEditable(false);
        name.setColumns(20);
        name.setRows(5);

        exit_button.setText("Έξοδος");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        cond.setEditable(false);
        cond.setColumns(20);
        cond.setRows(5);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Στοιχεία αίτησης");

        exit_button1.setText("Έγκριση");
        exit_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button1ActionPerformed(evt);
            }
        });

        exit_button2.setText("Απόρριψη");
        exit_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button2ActionPerformed(evt);
            }
        });

        exit_button3.setText("Αναίρεση έγκρισης ");
        exit_button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button3ActionPerformed(evt);
            }
        });

        exit_button4.setText("Διόρθωση");
        exit_button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_button4ActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("<html>Αν ο αριθμός των κρεβατιών της κλινικής ενημερώνεται με λάθος τρόπο, πατήστε στο πλήκτρο \"Διόρθωση\" και θα μεταβείτε στην καρτέλα των Αιτήσεων.<br> Για να διορθώσετε το σφάλμα, απλά πληκτρολογήστε τον αριθμο που επιθυμείτε, στο πεδίο των διαθέσιμων κρεβατιών. H τελευταία αίτηση που επιλέξατε<br> θα μεταβεί σε κατάσταση \"In Progress\".</html> ");

        javax.swing.GroupLayout Stoixeia_AitLayout = new javax.swing.GroupLayout(Stoixeia_Ait);
        Stoixeia_Ait.setLayout(Stoixeia_AitLayout);
        Stoixeia_AitLayout.setHorizontalGroup(
            Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stoixeia_AitLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Stoixeia_AitLayout.createSequentialGroup()
                        .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDL)
                            .addComponent(SBL)
                            .addComponent(HMNIAL)
                            .addComponent(OnAsthL)
                            .addComponent(status))
                        .addGap(18, 18, 18)
                        .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(hmnia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submitted_by, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cond, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1)
                    .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Stoixeia_AitLayout.createSequentialGroup()
                            .addComponent(exit_button1)
                            .addGap(18, 18, 18)
                            .addComponent(exit_button2)
                            .addGap(18, 18, 18)
                            .addComponent(exit_button3)
                            .addGap(18, 18, 18)
                            .addComponent(exit_button4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit_button))
                        .addGroup(Stoixeia_AitLayout.createSequentialGroup()
                            .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(history_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patient_history_label))
                            .addGap(58, 58, 58)
                            .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cond_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(patient_cond_label))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Stoixeia_AitLayout.setVerticalGroup(
            Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Stoixeia_AitLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(IDL, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(submitted_by, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(SBL, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hmnia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(HMNIAL, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(OnAsthL, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cond, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Stoixeia_AitLayout.createSequentialGroup()
                        .addComponent(patient_history_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(history_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Stoixeia_AitLayout.createSequentialGroup()
                        .addComponent(patient_cond_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cond_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(Stoixeia_AitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit_button)
                    .addComponent(exit_button1)
                    .addComponent(exit_button2)
                    .addComponent(exit_button3)
                    .addComponent(exit_button4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout Parath_AithsewnLayout = new javax.swing.GroupLayout(Parath_Aithsewn);
        Parath_Aithsewn.setLayout(Parath_AithsewnLayout);
        Parath_AithsewnLayout.setHorizontalGroup(
            Parath_AithsewnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stoixeia_Ait, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Parath_AithsewnLayout.setVerticalGroup(
            Parath_AithsewnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Stoixeia_Ait, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parath_Aithsewn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parath_Aithsewn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Exit button
    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        this.dashboard.setEnabled(true);
        dispose();
    }//GEN-LAST:event_exit_buttonActionPerformed
    
    //gia egkrish aithshs
    private void exit_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button1ActionPerformed
        if (dashboard.returnTabsAit().getSelectedIndex() == 0){ //an to jtabbed pane einai stis aithseis eisitiriou
            if(dashboard.getClinic().getNumOfBeds()>=1 && !(appl.getStatus().equals("Approved"))){ //an ta krevatia tis klinikis einai perissotera toy 1 kai h aithsh den einai approved
                appl.setStatus(Application.Status_enum.approved); //thetume thn katastash ths aithshs ws egkekrimenh
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //formatter gia date 
                String s1 = "ID Αίτησης: " + appl.getID() +"    " + "Υποβλήθηκε από: " + appl.getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(appl.getDate()) + "    " + "Ασθενής: " + dashboard.returnTempAdms().get(app_index).getPatient().getName() + "    " + "Κατάσταση: " + appl.getStatus(); //string gia thn enhmerwsh toy jlist    
                javax.swing.DefaultListModel<String>  admis_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getEisitiria().getModel(); //pernume to modelo ths jlist twn aithsewn eisithrioy toy dashboard_headdoc
                admis_jlist_model.set(this.app_index,s1); //thetume to string pou dhmiourhsame
                String s2 = String.valueOf(Integer.parseInt(dashboard.getDomKlin().getText()) - 1); //string gia ta krevatia 
                dashboard.getClinic().setNumOfBeds(Integer.parseInt(s2)); //enhmerwnoyme ton arithmo twn krevatiwn
                dashboard.getDomKlin().setText(s2); //settarume to kenurio string ston arithmo twn krevatiwn
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία έγκρισης αίτησης!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }else if(appl.getStatus().equals("Approved")){ //an h aithsh einai approved
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>Η αίτηση έχει ήδη εγκριθεί!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }else{ //an den arkrun ta krevatia ths klinikhs 
                appl.setStatus(Application.Status_enum.rejected); //kane thn aithsh rejected
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Αποτυχία έγκρισης αίτησης. Δεν υπάρχουν διαθέσιμες θέσεις στην κλινική!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }
        }else if(dashboard.returnTabsAit().getSelectedIndex() == 1){ //an h aithsh einai eksithrioy
            if(!(appl.getStatus().equals("Approved"))){ //an den einai approved
                appl.setStatus(Application.Status_enum.approved); //thetume thn katastash ths aithshs ws egkekrimenh
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");    
                String s1 = "ID Αίτησης: " + appl.getID() +"    " + "Υποβλήθηκε από: " + appl.getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(appl.getDate()) + "    " + "Ασθενής: " + dashboard.returnTempDis().get(app_index).getPatient().getName() + "    " + "Κατάσταση: " + appl.getStatus();  //string gia thn enhmerwsh toy jlist   
                javax.swing.DefaultListModel<String>  dis_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getEksitiria().getModel(); //pernume to modelo ths jlist twn aithsewn eksithrioy toy dashboard_headdoc
                dis_jlist_model.set(this.app_index,s1); //thetume to string pou dhmiourhsame
                String s2 = String.valueOf(Integer.parseInt(dashboard.getDomKlin().getText()) + 1); //string gia ta krevatia 
                dashboard.getDomKlin().setText(s2); //settarume to kenurio string ston arithmo twn krevatiw
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία έγκρισης αίτησης!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }else if(appl.getStatus().equals("Approved")){ //an h aithsh einai approved
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Η αίτηση έχει ήδη εγκριθεί!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }
        }
    }//GEN-LAST:event_exit_button1ActionPerformed

    //gia aporripsh aithshs
    private void exit_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button2ActionPerformed
        if (dashboard.returnTabsAit().getSelectedIndex() == 0){ //an to jtabbed pane einai stis aithseis eisirioy
            if(!(appl.getStatus().equals("Rejected"))){ //an den einai rejected
                appl.setStatus(Application.Status_enum.rejected); //kanth rejected
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
                String s1 = "ID Αίτησης: " + appl.getID() +"    " + "Υποβλήθηκε από: " + appl.getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(appl.getDate()) + "    " + "Ασθενής: " + dashboard.returnTempAdms().get(app_index).getPatient().getName() + "    " + "Κατάσταση: " + appl.getStatus();  //string gia to jlist   
                javax.swing.DefaultListModel<String>  admis_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getEisitiria().getModel(); //pernume to modelo ths jlist twn aithsewn eisithrioy toy dashboard_headdoc
                admis_jlist_model.set(this.app_index,s1); //thetume to string pou dhmiourhsame
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία απόρριψης αίτησης!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }else{ //an h aithsh eixei hdh aporriftei
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Η αίτηση έχει ήδη απορριφθεί!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }
        }else if (dashboard.returnTabsAit().getSelectedIndex() == 1){ //an to jtabbed pane einai stis aithseis eksitirioy
            if(!(appl.getStatus().equals("Rejected"))){ //an den einai rejected h aithsh 
                appl.setStatus(Application.Status_enum.rejected); //kanth rejected
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
                String s1 = "ID Αίτησης: " + appl.getID() +"    " + "Υποβλήθηκε από: " + appl.getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(appl.getDate()) + "    " + "Ασθενής: " + dashboard.returnTempDis().get(app_index).getPatient().getName() + "    " + "Κατάσταση: " + appl.getStatus();     
                javax.swing.DefaultListModel<String>  dis_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getEksitiria().getModel(); //pernume to modelo ths jlist twn aithsewn eksithrioy toy dashboard_headdoc
                dis_jlist_model.set(this.app_index,s1); //thetume to string pou dhmiourhsame
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία απόρριψης αίτησης!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }else{//an h aithsh einai hdh rejected
                Conditional_Message con1 = new Conditional_Message(this);
                con1.triggerMsg("<html>Η αίτηση έχει ήδη απορριφθεί!</html>");
                con1.setVisible(true);
                this.setEnabled(false);
            }
        }              
    }//GEN-LAST:event_exit_button2ActionPerformed
    
    //gia anairesh egkrishs
    private void exit_button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button3ActionPerformed
        if ((dashboard.returnTabsAit().getSelectedIndex() == 0) && (appl.getStatus().equals("Approved"))){ //an h aithsh einai eisitiriou kai einai approved
            appl.setStatus(Application.Status_enum.in_progress); //kanume thn aithsh in progress pali 
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
            String s1 = "ID Αίτησης: " + appl.getID() +"    " + "Υποβλήθηκε από: " + appl.getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(appl.getDate()) + "    " + "Ασθενής: " + dashboard.returnTempAdms().get(app_index).getPatient().getName() + "    " + "Κατάσταση: " + appl.getStatus();  //string gia to jlist   
            javax.swing.DefaultListModel<String>  admis_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getEisitiria().getModel(); //pernume to modelo ths jlist twn aithsewn eisithrioy toy dashboard_headdoc
            admis_jlist_model.set(this.app_index,s1); //thetume to string pou dhmiourhsame
            String s2 = String.valueOf(Integer.parseInt(dashboard.getDomKlin().getText()) + 1); //string gia ta krevatia 
            dashboard.getDomKlin().setText(s2); //settarume to kenurio string ston arithmo twn krevatiw
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία αναίρεσης έγκρισης!</html>");
            con1.setVisible(true);
            this.setEnabled(false);
        }else if ((dashboard.returnTabsAit().getSelectedIndex() == 1) && (appl.getStatus().equals("Approved"))){ //an h aithsh einai eksitiriou kai einai approved
            appl.setStatus(Application.Status_enum.in_progress); //kanume thn aithsh in progress pali 
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
            String s1 = "ID Αίτησης: " + appl.getID() +"    " + "Υποβλήθηκε από: " + appl.getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(appl.getDate()) + "    " + "Ασθενής: " + dashboard.returnTempDis().get(app_index).getPatient().getName() + "    " + "Κατάσταση: " + appl.getStatus();     
            javax.swing.DefaultListModel<String>  dis_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getEksitiria().getModel(); //pernume to modelo ths jlist twn aithsewn eksithrioy toy dashboard_headdoc
            dis_jlist_model.set(this.app_index,s1); //thetume to string pou dhmiourhsame
            String s2 = String.valueOf(Integer.parseInt(dashboard.getDomKlin().getText()) - 1); //string gia ta krevatia 
            dashboard.getDomKlin().setText(s2); //settarume to kenurio string ston arithmo twn krevatiw
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία αναίρεσης έγκρισης!</html>");
            con1.setVisible(true);
            this.setEnabled(false);
        }else if(!(appl.getStatus().equals("Approved"))){ //an h aithsh den einai egkekrimenh
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Αδυναμία αναίρεσης, η αίτηση δεν είναι εγκεκριμένη!</html>");
            con1.setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_exit_button3ActionPerformed
    
    //diorthwsh krevatiwn klinikhs
    private void exit_button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_button4ActionPerformed
        this.dashboard.setEnabled(true);
        dispose();
        dashboard.getDomKlin().setEditable(true);
    }//GEN-LAST:event_exit_button4ActionPerformed
    
    
    //Methodos pou settarei ta dedomena ths aithshs eisitirioy sta pedia tou parathyrou
    public void ShowAppAdmInfo(Admission_Application app){
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            id.setText(Integer.toString(app.getID()));
            submitted_by.setText(app.getDoctor().getName());
            hmnia.setText(formatter.format(app.getDate()));
            name.setText(app.getPatient().getName());
            cond.setText(app.getStatus());
            patient_history.setText(app.getPatient().getHistory());
            patient_conditions.setText(app.getPatient().getConditions());
    }
    
    //Methodos pou settarei ta dedomena ths aithshs eksitirioy sta pedia tou parathyrou
    public void ShowAppDisInfo(Discharge_Application app){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        id.setText(Integer.toString(app.getID()));
        submitted_by.setText(app.getDoctor().getName());
        hmnia.setText(formatter.format(app.getDate()));
        name.setText(app.getPatient().getName());
        cond.setText(app.getStatus());
        patient_history.setText(app.getPatient().getHistory());
        patient_conditions.setText(app.getPatient().getConditions());
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
            java.util.logging.Logger.getLogger(Parathiro_Aithsewn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Parathiro_Aithsewn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Parathiro_Aithsewn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Parathiro_Aithsewn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel HMNIAL;
    private javax.swing.JLabel IDL;
    private javax.swing.JLabel OnAsthL;
    private javax.swing.JPanel Parath_Aithsewn;
    private javax.swing.JLabel SBL;
    private javax.swing.JPanel Stoixeia_Ait;
    private javax.swing.JTextArea cond;
    private javax.swing.JScrollPane cond_scroll;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton exit_button1;
    private javax.swing.JButton exit_button2;
    private javax.swing.JButton exit_button3;
    private javax.swing.JButton exit_button4;
    private javax.swing.JScrollPane history_scroll;
    private javax.swing.JTextArea hmnia;
    private javax.swing.JTextArea id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextArea name;
    private javax.swing.JLabel patient_cond_label;
    private javax.swing.JTextArea patient_conditions;
    private javax.swing.JPanel patient_conditions_panel;
    private javax.swing.JTextArea patient_history;
    private javax.swing.JLabel patient_history_label;
    private javax.swing.JPanel patient_history_panel;
    private javax.swing.JLabel status;
    private javax.swing.JTextArea submitted_by;
    // End of variables declaration//GEN-END:variables
}
