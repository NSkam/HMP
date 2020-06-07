/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp_gui;
import data.Doctor;
import data.Patient;
import java.util.ArrayList;
/**
 *
 * @author Nikos
 */
public class Patient_Addition_Gramateia extends javax.swing.JFrame {
private int amka1; 
private String name1;
private int age1;
private String patient_history1;
private String patient_cond1;
private int doc_amka1;

ArrayList<Patient> pat = new ArrayList();
ArrayList<Doctor> doc = new ArrayList();
    /**
     * Creates new form Patient_Addition_Gramateia
     */
    public Patient_Addition_Gramateia(ArrayList<Patient> p,ArrayList<Doctor> d) {
        this.pat = p;
        this.doc = d;
        initComponents();
    }
    public Patient_Addition_Gramateia() {
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

        jPanel1 = new javax.swing.JPanel();
        Label_Patient_Form = new javax.swing.JLabel();
        Label_name = new javax.swing.JLabel();
        Label_amka = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        amka = new javax.swing.JTextField();
        ADD_Patient = new javax.swing.JButton();
        Label_age = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Label_patient_history = new javax.swing.JLabel();
        patient_history = new javax.swing.JTextField();
        Label_condition = new javax.swing.JLabel();
        patient_cond = new javax.swing.JTextField();
        Label_supervised = new javax.swing.JLabel();
        supervised_by = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        Label_Patient_Form.setText("Φόρμα Ασθενή");

        Label_name.setText("Όνομα:");
        Label_name.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_name.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_name.setPreferredSize(new java.awt.Dimension(44, 14));

        Label_amka.setText("ΑΜΚΑ:");

        age.setText("Enter Age...(PRESS ENTER after)");
        age.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ageFocusGained(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        amka.setText("Enter AMKA...(PRESS ENTER after)");
        amka.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amkaFocusGained(evt);
            }
        });
        amka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amkaActionPerformed(evt);
            }
        });

        ADD_Patient.setText("Προσθήκη στοιχείων ασθενή");
        ADD_Patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADD_PatientMouseClicked(evt);
            }
        });
        ADD_Patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADD_PatientActionPerformed(evt);
            }
        });

        Label_age.setText("Ηλικία:");
        Label_age.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_age.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_age.setPreferredSize(new java.awt.Dimension(44, 14));

        name.setText("Enter Name...(PRESS ENTER after)");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        Label_patient_history.setText("Ιστορικό Ασθενή:");
        Label_patient_history.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_patient_history.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_patient_history.setPreferredSize(new java.awt.Dimension(44, 14));

        patient_history.setText("Enter Patient's history...(PRESS ENTER after)");
        patient_history.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                patient_historyFocusGained(evt);
            }
        });
        patient_history.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                patient_historyMouseWheelMoved(evt);
            }
        });
        patient_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_historyActionPerformed(evt);
            }
        });

        Label_condition.setText("Κατάσταση Ασθενή:");
        Label_condition.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_condition.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_condition.setPreferredSize(new java.awt.Dimension(44, 14));

        patient_cond.setText("Enter Patient's status...(PRESS ENTER after)");
        patient_cond.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                patient_condFocusGained(evt);
            }
        });
        patient_cond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patient_condActionPerformed(evt);
            }
        });

        Label_supervised.setText("Υπεύθυνος Ιατρός:");
        Label_supervised.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_supervised.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_supervised.setPreferredSize(new java.awt.Dimension(44, 14));

        supervised_by.setText("Enter supervised doctor...(PRESS ENTER after)");
        supervised_by.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                supervised_byFocusGained(evt);
            }
        });
        supervised_by.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supervised_byActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 203, Short.MAX_VALUE)
                .addComponent(ADD_Patient, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Patient_Form, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_condition, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(patient_cond, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_supervised, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(supervised_by, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_patient_history, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patient_history, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(amka))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Label_Patient_Form, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amka, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_age, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Label_patient_history, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(patient_history))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patient_cond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_condition, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_supervised, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(supervised_by, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(ADD_Patient)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADD_PatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADD_PatientActionPerformed
    Patient patient1 = new Patient();        
        patient1.setPatientInfo(amka1 , name1 , age1 , patient_history1 , patient_cond1 , doc_amka1 , Patient.status_enum.bad);
        pat.add(patient1);
        Dashboard_Gramateia dashboard_gra = new Dashboard_Gramateia(pat,doc);
       // System.out.println(patient1.getName());
        dashboard_gra.setVisible(true);
        dispose();     
// TODO add your handling code here:
    }//GEN-LAST:event_ADD_PatientActionPerformed

    private void ADD_PatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADD_PatientMouseClicked
      //  Patient patient1 = new Patient();        
       // patient1.setPatientInfo(amka1 , name1 , age1 , patient_history1 , patient_cond1 , doc_amka1 , Patient.status_enum.bad);
       // Dashboard_Gramateia dashboard_gra = new Dashboard_Gramateia(patient1);
       // System.out.println(patient1.getAmka());
       // dashboard_gra.setVisible(true);
       // dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD_PatientMouseClicked

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
    this.age1 = Integer.parseInt(age.getText());    
// TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void amkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amkaActionPerformed
       this.amka1 = Integer.parseInt(amka.getText());

        // TODO add your handling code here:
    }//GEN-LAST:event_amkaActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
        this.name1 = name.getText();
    }//GEN-LAST:event_nameActionPerformed

    private void patient_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_historyActionPerformed
        // TODO add your handling code here:
        this.patient_history1 = patient_history.getText();
    }//GEN-LAST:event_patient_historyActionPerformed

    private void patient_condActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patient_condActionPerformed
        this.patient_cond1 = patient_cond.getText();
// TODO add your handling code here:
    }//GEN-LAST:event_patient_condActionPerformed

    private void supervised_byActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supervised_byActionPerformed
       this.doc_amka1 = Integer.parseInt(supervised_by.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_supervised_byActionPerformed

    private void patient_historyMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_patient_historyMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_historyMouseWheelMoved

    private void amkaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amkaFocusGained
       amka.selectAll();
    }//GEN-LAST:event_amkaFocusGained

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
     name.selectAll();
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFocusGained

    private void ageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ageFocusGained
     age.selectAll();    
     // TODO add your handling code here:
    }//GEN-LAST:event_ageFocusGained

    private void patient_historyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patient_historyFocusGained
     patient_history.selectAll();     
        // TODO add your handling code here:
    }//GEN-LAST:event_patient_historyFocusGained

    private void patient_condFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_patient_condFocusGained
     patient_cond.selectAll();  
     // TODO add your handling code here:
    }//GEN-LAST:event_patient_condFocusGained

    private void supervised_byFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_supervised_byFocusGained
     supervised_by.selectAll();
     // TODO add your handling code here:
    }//GEN-LAST:event_supervised_byFocusGained

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
            java.util.logging.Logger.getLogger(Patient_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient_Addition_Gramateia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_Patient;
    private javax.swing.JLabel Label_Patient_Form;
    private javax.swing.JLabel Label_age;
    private javax.swing.JLabel Label_amka;
    private javax.swing.JLabel Label_condition;
    private javax.swing.JLabel Label_name;
    private javax.swing.JLabel Label_patient_history;
    private javax.swing.JLabel Label_supervised;
    private javax.swing.JTextField age;
    private javax.swing.JTextField amka;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField patient_cond;
    private javax.swing.JTextField patient_history;
    private javax.swing.JTextField supervised_by;
    // End of variables declaration//GEN-END:variables
}