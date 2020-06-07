/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp_gui;
import java.util.ArrayList;
import data.Doctor;
import data.Clinic;
import data.Patient;

/**
 *
 * @author Nikos
 */
public class Personnel_Addition_Gramateia extends javax.swing.JFrame {
//Orismos metablhtwn
    
    private String name1;
    private String speciality1;
    private int amka1;
    private Clinic c;
    /**
     * Creates new form Personnel_Addition_Gramateia
     */
    ArrayList<Doctor> doc = new ArrayList();
    ArrayList<Patient> pat = new ArrayList();
    
    public Personnel_Addition_Gramateia(ArrayList<Patient> p,ArrayList<Doctor> d) {
        this.doc = d;
        this.pat = p;
        initComponents();
    }
    public Personnel_Addition_Gramateia() {
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
        name = new javax.swing.JTextField();
        amka = new javax.swing.JTextField();
        ADD_Personnel = new javax.swing.JButton();
        Label_speciality = new javax.swing.JLabel();
        speciality = new javax.swing.JTextField();
        Label_clinic = new javax.swing.JLabel();
        clinic = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        Label_Patient_Form.setText("Φόρμα Προσωπικού");

        Label_name.setText("Όνομα:");
        Label_name.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_name.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_name.setPreferredSize(new java.awt.Dimension(44, 14));

        Label_amka.setText("ΑΜΚΑ:");

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

        ADD_Personnel.setText("Προσθήκη Προσωπικού");
        ADD_Personnel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADD_PersonnelMouseClicked(evt);
            }
        });

        Label_speciality.setText("Ειδικότητα:");
        Label_speciality.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_speciality.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_speciality.setPreferredSize(new java.awt.Dimension(44, 14));

        speciality.setText("Enter Speciality...(PRESS ENTER after)");
        speciality.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                specialityFocusGained(evt);
            }
        });
        speciality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialityActionPerformed(evt);
            }
        });

        Label_clinic.setText("Κλινική:");
        Label_clinic.setMaximumSize(new java.awt.Dimension(44, 14));
        Label_clinic.setMinimumSize(new java.awt.Dimension(44, 14));
        Label_clinic.setPreferredSize(new java.awt.Dimension(44, 14));

        clinic.setText("Enter Clinic...(PRESS ENTER after)");
        clinic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clinicFocusGained(evt);
            }
        });
        clinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clinicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ADD_Personnel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Label_Patient_Form, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_clinic, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clinic))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Label_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amka, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(name)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Label_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(speciality, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                .addGap(50, 293, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Label_Patient_Form, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_amka, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_speciality, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clinic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_clinic, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(ADD_Personnel)
                .addGap(0, 32, Short.MAX_VALUE))
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

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        name1 = name.getText();
    }//GEN-LAST:event_nameActionPerformed

    private void specialityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialityActionPerformed
        speciality1 = speciality.getText();
    }//GEN-LAST:event_specialityActionPerformed

    private void clinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clinicActionPerformed
        Clinic cl = new Clinic(clinic.getText(),9999,-9999,9999,9999);
        this.c = cl;
    }//GEN-LAST:event_clinicActionPerformed

    private void ADD_PersonnelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADD_PersonnelMouseClicked
        Doctor dr = new Doctor(amka1,name1,speciality1,c);
        doc.add(dr);
        Dashboard_Gramateia dashboard_gra = new Dashboard_Gramateia(pat,doc);
        dashboard_gra.setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_ADD_PersonnelMouseClicked

    private void amkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amkaActionPerformed
        amka1 = Integer.parseInt(amka.getText());
    }//GEN-LAST:event_amkaActionPerformed

    private void amkaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amkaFocusGained
     amka.selectAll();
        // TODO add your handling code here:
    }//GEN-LAST:event_amkaFocusGained

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
     name.selectAll();
     // TODO add your handling code here:
    }//GEN-LAST:event_nameFocusGained

    private void specialityFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_specialityFocusGained
     speciality.selectAll();   // TODO add your handling code here:
    }//GEN-LAST:event_specialityFocusGained

    private void clinicFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clinicFocusGained
     clinic.selectAll();
     // TODO add your handling code here:
    }//GEN-LAST:event_clinicFocusGained

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
            java.util.logging.Logger.getLogger(Personnel_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personnel_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personnel_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personnel_Addition_Gramateia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personnel_Addition_Gramateia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD_Personnel;
    private javax.swing.JLabel Label_Patient_Form;
    private javax.swing.JLabel Label_amka;
    private javax.swing.JLabel Label_clinic;
    private javax.swing.JLabel Label_name;
    private javax.swing.JLabel Label_speciality;
    private javax.swing.JTextField amka;
    private javax.swing.JTextField clinic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField speciality;
    // End of variables declaration//GEN-END:variables
}
