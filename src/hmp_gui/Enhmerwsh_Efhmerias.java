/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp_gui;
import java.util.ArrayList;
import data.*;
import java.text.ParseException;
import java.util.Calendar;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Thodoris Tomadakis
 */
public class Enhmerwsh_Efhmerias extends javax.swing.JFrame{

    
    private Dashboard_Headdoc dashboard; //pernw stigmuotypo tou dashboard toy headdoc_dashboard
    ArrayList<String> JComboList = new ArrayList<String>(200); //prosorini lista gia to jcombo
    
    public Enhmerwsh_Efhmerias(Dashboard_Headdoc dashboard) {
        this.dashboard = dashboard;
        initComponents();
    }
    
    //emfanisei tis efhmeries sto jcombo
    public void InitPersonList(){ 
        ArrayList<OnCall> TempOCList = dashboard.returnOnCalls(); //pernw tis efhmeries apo to dashboard headdoc
        jComboBox1.removeAllItems(); // kanw remove ola ta items sta jcombo
        ArrayList<String>tempOnomaList = new ArrayList<String>(10); //prosorinoi pinakes gia na diasfalisw oti to amka
        ArrayList<String>tempAmkaList = new ArrayList<String>(10); //kai to onoma tha einai unique
        String amka = String.valueOf(TempOCList.get(0).getAMKAOnCall()); //pernw to prwto amka 
        String onoma = TempOCList.get(0).getOnCallDoc(); //kai to prwto onoma 
        tempOnomaList.add(onoma); // ta prosthetw stous antistoixous pinakes
        tempAmkaList.add(amka);
        this.JComboList.add("Όνομα: " + onoma + "    " + "AMKA: " + amka); //to prosthetw sto jcombo
        for (int i = 1; i<TempOCList.size(); i++){
            amka = String.valueOf(TempOCList.get(i).getAMKAOnCall()); //pernume to epomeno amka kai
            onoma = TempOCList.get(i).getOnCallDoc(); //onoma twn efhmeriwn 
            if ((!tempOnomaList.contains(onoma)) && (!tempAmkaList.contains(amka))){ // elegxoyme an yparxoun ston proswrino pinaka
                tempOnomaList.add(onoma); //an oxi ta prosthetume 
                tempAmkaList.add(amka);
                this.JComboList.add("Όνομα: " + onoma + "    " + "AMKA: " + amka); //ta prosthetume kai sto jcombo
            }
        }                    
    }
    
    public String Spinner1(){// pairnei thn timh toy jspinner1, epistrefei 01 an bei mh egkurh timh (pros to paron)
        try {
            jSpinner1.commitEdit();
        } catch (ParseException e) {e.printStackTrace();}
        javax.swing.SpinnerNumberModel s11 = (javax.swing.SpinnerNumberModel)this.jSpinner1.getModel();
        int tempValue = (Integer)s11.getValue();
        if (tempValue <=0 || tempValue > 30){
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("Η ημέρα που επιλέξατε δεν είναι έγκυρη");
            con1.setVisible(true);
            this.setEnabled(false);
        }
        String temp=" ";
        if (tempValue>0 && tempValue <=30){
            switch (tempValue){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                  String s1 = String.valueOf(0);
                  String s2 = String.valueOf(tempValue);
                  temp = s1.concat(s2);
                  break;
                default:
                  temp = String.valueOf(tempValue);
            }
            return temp;
        }else return "error";
    }
    
    public String Spinner2(){ //pairnei thn timh toy jspinner2
        try {
            jSpinner2.commitEdit();
        } catch (ParseException e) {e.printStackTrace();}
        javax.swing.SpinnerNumberModel s12 = (javax.swing.SpinnerNumberModel)this.jSpinner2.getModel();
        int tempValue = (Integer)s12.getValue();
        if (tempValue <=0 || tempValue > 12){
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("O μήνας που επιλέξατε δεν είναι έγκυρος");
            con1.setVisible(true);
            this.setEnabled(false);
        }
        String temp=" ";
        if (tempValue>0 && tempValue <=12){
            switch (tempValue){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                  String s1 = String.valueOf(0);
                  String s2 = String.valueOf(tempValue);
                  temp = s1.concat(s2);
                  break;
                default:
                  temp = String.valueOf(tempValue);
            }
            return temp;
        }else return "error";
    }
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Enhmerwsh_Efhmerias = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        this.InitPersonList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        change_value_msg = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        SpinnerNumberModel s11 = new SpinnerNumberModel(1, 1, 30, 1);
        jSpinner1 = new JSpinner(s11);
        change_value_msg1 = new javax.swing.JLabel();
        change_value_msg2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        SpinnerNumberModel s12 = new SpinnerNumberModel(1, 1, 12, 1);
        jSpinner2 = new JSpinner(s12);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Enhmerwsh_Efhmerias.setBackground(new java.awt.Color(153, 204, 255));
        Enhmerwsh_Efhmerias.setBorder(javax.swing.BorderFactory.createTitledBorder("Ενημέρωση εφημερίας"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Επιλέξτε άτομο:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ορίστε νέα ημ/νια:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>());
        javax.swing.DefaultComboBoxModel<String> person_list_model = (javax.swing.DefaultComboBoxModel<String>)jComboBox1.getModel();
        for(int x=0; x<JComboList.size();x++){
            person_list_model.addElement(JComboList.get(x));
        }
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Ορισμός Εφημερίας");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Έξοδος");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        change_value_msg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        change_value_msg.setText("Ημέρα:");

        change_value_msg1.setText("Επιλέξτε τα στοιχεία που επιθυμείτε:");

        change_value_msg2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        change_value_msg2.setText("Μήνας:");

        javax.swing.GroupLayout Enhmerwsh_EfhmeriasLayout = new javax.swing.GroupLayout(Enhmerwsh_Efhmerias);
        Enhmerwsh_Efhmerias.setLayout(Enhmerwsh_EfhmeriasLayout);
        Enhmerwsh_EfhmeriasLayout.setHorizontalGroup(
            Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Enhmerwsh_EfhmeriasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(change_value_msg1)
                    .addGroup(Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Enhmerwsh_EfhmeriasLayout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Enhmerwsh_EfhmeriasLayout.createSequentialGroup()
                            .addComponent(change_value_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(change_value_msg2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        Enhmerwsh_EfhmeriasLayout.setVerticalGroup(
            Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Enhmerwsh_EfhmeriasLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(change_value_msg1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(change_value_msg)
                    .addComponent(change_value_msg2)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addGroup(Enhmerwsh_EfhmeriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Enhmerwsh_Efhmerias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Enhmerwsh_Efhmerias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //eksodos sth lista efhmeriwn tou arxikou parathirou
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dashboard.setEnabled(true);
        dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

public boolean addToHDJList(ArrayList<OnCall> e, int amka, String cdate){ //kanei update ton pinaka tou HeadDoc_Dashboard
    boolean bool = false;
    e = dashboard.Clinic1.getOnCallList();
    int k = 0;
    int j = 0;
    for (int i = 0; i<e.size(); i++){
        if (dashboard.Clinic1.checkOnCallDate(e.get(i).getOnCallDate(),cdate)){
            k++;
        }
        if (amka == e.get(i).getAMKAOnCall()){
            j++;
        }
    }
    
    ArrayList<Doctor> tempDocList = dashboard.returnDocList();
    String name =" ";
    Doctor d1 = null;
    for (int i = 0; i < tempDocList.size(); i++){
        if (amka == tempDocList.get(i).getAMKA()){
            name = tempDocList.get(i).getName();
            d1 = new Doctor (amka, name, tempDocList.get(i).getSpeciality(), dashboard.Clinic1);
        }
    }
    if (k == (e.size())){
        bool = true;
        if (j==0){
            OnCall tempOC = new OnCall(cdate, amka, dashboard.Clinic1.getClinicName(), j, d1); 
            e.add(tempOC);
            dashboard.JOnCall_list_str.add("Ημερομηνία: " + cdate + "   " + "Όνομα Γιατρού: " + name + "    " +  "ΑΜΚΑ Γιατρού: " + amka + "   " + "Κλινική: " + dashboard.Clinic1.getClinicName() + "   " + "Αριθμός Εφημερίας: " + 1);
        }else{
            OnCall tempOC = new OnCall(cdate, amka, dashboard.Clinic1.getClinicName(), j+1 , d1); 
            e.add(tempOC);
            dashboard.JOnCall_list_str.add("Ημερομηνία: " + cdate + "   " + "Όνομα Γιατρού: " + name + "    " +  "ΑΜΚΑ Γιατρού: " + amka + "   " + "Κλινική: " + dashboard.Clinic1.getClinicName() + "   " + "Αριθμός Εφημερίας: " + (j+1));
        }
        return bool;
    }else return bool;
}

    //
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String temp1 = this.Spinner1(); // pairnoyme tis times twn jspinners
        String temp2 = this.Spinner2();
        int year = Calendar.getInstance().get(Calendar.YEAR); //pairnoyme to xrono
        String tempDate = temp1 + "/" + temp2 + "/" + String.valueOf(year); //thetume tin imeromhnia opws tin exoume sto formatter tou cli
        
        //oi times tha einai panta egkures giati to periorizei to model
        String tempS = jComboBox1.getItemAt(jComboBox1.getSelectedIndex()); //briskoyme to amka tis epiloghs toy jcombo
        String tempAMKA = tempS.substring(tempS.lastIndexOf(":")+2, (tempS.length()));//dhmiourgoume substring gia na to kanume auto
        int intAMKA = Integer.parseInt(tempAMKA); //kanume to amka int 
        if (this.addToHDJList(dashboard.returnOnCalls(), intAMKA, tempDate)){//kalume gia to update toy pinaka 
            javax.swing.DefaultListModel<String>  oncall_jlist_model = (javax.swing.DefaultListModel<String>)dashboard.getOnCall_list().getModel(); //pernume to modelo ths jlist toy dashboard_headdoc
            oncall_jlist_model.addElement(dashboard.JOnCall_list_str.get(dashboard.JOnCall_list_str.size()-1));//edw ginetai h orath enhmerwsh tis listas 
        } else{
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("Δώστε νέα ημερομήνια, η εφημερία υπάρχει ήδη στη λίστα");
            con1.setVisible(true);
            this.setEnabled(false);
        }       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Enhmerwsh_Efhmerias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Enhmerwsh_Efhmerias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Enhmerwsh_Efhmerias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Enhmerwsh_Efhmerias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Enhmerwsh_Efhmerias;
    private javax.swing.JLabel change_value_msg;
    private javax.swing.JLabel change_value_msg1;
    private javax.swing.JLabel change_value_msg2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    // End of variables declaration//GEN-END:variables
}
