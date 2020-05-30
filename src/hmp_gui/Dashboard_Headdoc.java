package hmp_gui;
import data.*;
import java.util.ArrayList;

/**
 *
 * @author Nikolaos Skamnelos & Thodoris Tomadakis
 */

public class Dashboard_Headdoc extends javax.swing.JFrame {
    HeadDoctor HeadDoctor = new HeadDoctor();
    ArrayList<String> JOnCall_list_str = new ArrayList<String>(200);
    ArrayList<String> Application_JList_Str = new ArrayList<String>(200);
    Clinic Clinic1 = new Clinic("Αιματολογική", 200, 1234567, 200); //dummy dedomena
    
    
    
    /**
     * Creates new form Dashboard_Headdoc
     */
    public Dashboard_Headdoc() {
        //Settings();
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

        Dashboard_Layer = new javax.swing.JLayeredPane();
        Button_Panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        Tab_Panel = new javax.swing.JPanel();
        Dashboard_tabs = new javax.swing.JTabbedPane();
        user_info = new javax.swing.JPanel();
        applications = new javax.swing.JPanel();
        patient_list = new javax.swing.JPanel();
        day_offs = new javax.swing.JPanel();
        supplies = new javax.swing.JPanel();
        clinic_info = new javax.swing.JPanel();
        on_call = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OnCallList_J_Pane = new javax.swing.JScrollPane();
        OnCallList_J = new javax.swing.JList<>();
        this.InitOnCalllList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(695, 477));

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
            .addComponent(logout_button, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        Button_PanelLayout.setVerticalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_button))
        );

        Dashboard_tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);

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
            .addGap(0, 731, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp; Χρήστη</html>", user_info);

        applications.setBackground(new java.awt.Color(153, 204, 255));
        applications.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout applicationsLayout = new javax.swing.GroupLayout(applications);
        applications.setLayout(applicationsLayout);
        applicationsLayout.setHorizontalGroup(
            applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        applicationsLayout.setVerticalGroup(
            applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("Αιτήσεις", applications);

        patient_list.setBackground(new java.awt.Color(153, 204, 255));
        patient_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout patient_listLayout = new javax.swing.GroupLayout(patient_list);
        patient_list.setLayout(patient_listLayout);
        patient_listLayout.setHorizontalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        patient_listLayout.setVerticalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp; Ασθενών</html>", patient_list);

        day_offs.setBackground(new java.awt.Color(153, 204, 255));
        day_offs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout day_offsLayout = new javax.swing.GroupLayout(day_offs);
        day_offs.setLayout(day_offsLayout);
        day_offsLayout.setHorizontalGroup(
            day_offsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        day_offsLayout.setVerticalGroup(
            day_offsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Διαχείριση<br>&nbsp;&nbsp;Άδειων</html>", day_offs);

        supplies.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout suppliesLayout = new javax.swing.GroupLayout(supplies);
        supplies.setLayout(suppliesLayout);
        suppliesLayout.setHorizontalGroup(
            suppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        suppliesLayout.setVerticalGroup(
            suppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Διαχείριση <br>Ιατρικών<br> Προμηθειών</hmtl>", supplies);

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
            .addGap(0, 731, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp;&nbsp; Κλινικής</html>", clinic_info);

        on_call.setBackground(new java.awt.Color(153, 204, 255));
        on_call.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Εφημερίες Κλινικής ");

        OnCallList_J.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        OnCallList_J.setModel(new javax.swing.DefaultListModel<String>());
        //Update Default List Model for the Jlist
        javax.swing.DefaultListModel<String> oncall_jlist_model = (javax.swing.DefaultListModel<String>)OnCallList_J.getModel();
        for(int x=0; x<JOnCall_list_str.size();x++){
            oncall_jlist_model.addElement(JOnCall_list_str.get(x));
        }
        OnCallList_J_Pane.setViewportView(OnCallList_J);

        jButton1.setText("Ορισμός Εφημερίας");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Έξοδος");

        javax.swing.GroupLayout on_callLayout = new javax.swing.GroupLayout(on_call);
        on_call.setLayout(on_callLayout);
        on_callLayout.setHorizontalGroup(
            on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(on_callLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, on_callLayout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(OnCallList_J_Pane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(446, Short.MAX_VALUE))
        );
        on_callLayout.setVerticalGroup(
            on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(on_callLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(OnCallList_J_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(413, Short.MAX_VALUE))
        );

        Dashboard_tabs.addTab("<html>Διαχείριση<br> Εφημεριών</html>", on_call);

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

        Dashboard_Layer.setLayer(Button_Panel, 2);
        Dashboard_Layer.setLayer(Tab_Panel, 1);

        javax.swing.GroupLayout Dashboard_LayerLayout = new javax.swing.GroupLayout(Dashboard_Layer);
        Dashboard_Layer.setLayout(Dashboard_LayerLayout);
        Dashboard_LayerLayout.setHorizontalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dashboard_LayerLayout.createSequentialGroup()
                .addComponent(Button_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1008, Short.MAX_VALUE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tab_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dashboard_LayerLayout.setVerticalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard_LayerLayout.createSequentialGroup()
                .addGap(0, 715, Short.MAX_VALUE)
                .addComponent(Button_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Otan ginete logout kanei clear to token pou deixnei to eidos xrhsth
    private void clearTokens(){ 
        Login.headdoc_counter = false;
    }
    
    //Logout Function
    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        clearTokens();
        dispose();
        Login login_page = new Login();
        login_page.setVisible(true);
    }//GEN-LAST:event_logout_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void Dashboard_tabsStateChanged(javax.swing.event.ChangeEvent evt) {                                            
        if(Dashboard_tabs.getSelectedIndex()==6) 
            {
                this.displayOnCallList();
            }
    }  
    
    /*****
    private void createNewAppl(java.awt.event.ActionEvent evt) {                               
           Available_Applications available_applications_window = new Available_Applications(this);
           available_applications_window.setVisible(true);
           this.setEnabled(false);
    }
    *****/
    
    //Kanei display tis efhmeries
    public void displayOnCallList(){
        OnCallList_J_Pane.setVisible(true);
        OnCallList_J.setVisible(true);
    }
    
    //Epistrefei thn OnCallList
    public javax.swing.JList<String> getOnCall_list(){
        return this.OnCallList_J;
    }
    
    /******
    public void Settings(){
        OnCallList_J_Pane.setVisible(false);
        OnCallList_J.setVisible(false);
    }
    ******/
    
    //Gia na paroume tis efhmeries ths klinikhs
    public void InitOnCalllList(){
        
        OnCall OnCall_1 = new OnCall("01/02/2020", 1234, Clinic1.getClinicName(), 1);//Dhmiourgia 5 dummy efhmeriwn
        OnCall OnCall_2 = new OnCall("01/03/2020", 1235,Clinic1.getClinicName(), 1);
        OnCall OnCall_3 = new OnCall("02/03/2020", 1234, Clinic1.getClinicName(), 2);
        OnCall OnCall_4 = new OnCall("20/02/2020", 1235,Clinic1.getClinicName(), 2);
        OnCall OnCall_5 = new OnCall("03/04/2020", 1237,Clinic1.getClinicName(), 1);   
        ArrayList<OnCall> TempOnCall = new ArrayList <OnCall>(10);//prosorini lista gia efhmeries
        TempOnCall.add(OnCall_1); //prostheotume sth prosorini lista tis efhemeries
        TempOnCall.add(OnCall_2);
        TempOnCall.add(OnCall_3);
        TempOnCall.add(OnCall_4);
        TempOnCall.add(OnCall_5);
        int j = 0 ;//counter
        for (int i = 0; i<TempOnCall.size(); i++){//checkarume an oi efhmeries sumpeftoun kai an oxi tis prosthetume sth lista ths klinikhs
            if (i<(TempOnCall.size()-1)){
                if (Clinic1.checkOnCallDate(TempOnCall.get(i).getOnCallDate(),TempOnCall.get(i+1).getOnCallDate())){
                        Clinic1.getOnCallList().add(TempOnCall.get(i));
                        j++;
                }
            }else{
                Clinic1.getOnCallList().add(TempOnCall.get(i)); //gia thn teleutaia efhmeria
                j++;
            }
        }
        /**********************************/
        //Ftiaxnoume to List pou tha kanei display tis Efhmeries sto JList twn Aithsewn
         JOnCall_list_str .clear();
         for(int i=0 ; i<j; i++){
             this.JOnCall_list_str.add("Ημερομηνία: " + Clinic1.getOnCallList().get(i).getOnCallDate()+ "   " + "ΑΜΚΑ Γιατρού: " + Clinic1.getOnCallList().get(i).getAMKAOnCall() + "   " + "Κλινική: " + Clinic1.getClinicName() + "   " + "Αριθμός Εφημερίας: " + Clinic1.getOnCallList().get(i).getNum_OnCall());
         }
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
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Headdoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JLayeredPane Dashboard_Layer;
    private javax.swing.JTabbedPane Dashboard_tabs;
    private javax.swing.JList<String> OnCallList_J;
    private javax.swing.JScrollPane OnCallList_J_Pane;
    private javax.swing.JPanel Tab_Panel;
    private javax.swing.JPanel applications;
    private javax.swing.JPanel clinic_info;
    private javax.swing.JPanel day_offs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel on_call;
    private javax.swing.JPanel patient_list;
    private javax.swing.JPanel supplies;
    private javax.swing.JPanel user_info;
    // End of variables declaration//GEN-END:variables
}
