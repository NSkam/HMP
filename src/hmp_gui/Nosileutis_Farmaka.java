/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hmp_gui;

import java.util.ArrayList;
import data.PatientMedicine;
import data.Patient;
import data.Doctor;
/**
 *
 * @author John
 */
public class Nosileutis_Farmaka extends javax.swing.JFrame {

    /* Creates new form Nosileutis_Farmaka */
    Doctor doc = new Doctor();
    Patient pat = new Patient();
    Dashboard_Nosileutis dn = new Dashboard_Nosileutis();
    public Nosileutis_Farmaka(Dashboard_Nosileutis dash, Patient patient) {
        this.dn = dash;
        this.pat = patient;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        med_info = new javax.swing.JPanel();
        MedsDisp = new javax.swing.JLabel();
        EnumDisp = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enum_list = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        pat_list = new javax.swing.JList<>();
        EditButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        med_info.setBackground(new java.awt.Color(153, 204, 255));
        med_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        MedsDisp.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        MedsDisp.setForeground(new java.awt.Color(255, 255, 255));
        MedsDisp.setText("Φάρμακα Ασθενή");

        EnumDisp.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        EnumDisp.setForeground(new java.awt.Color(255, 255, 255));
        EnumDisp.setText("Ένδειξη λήψης φαρμάκων");

        enum_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(enum_list);

        pat_list.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(pat_list);

        EditButton.setText("Αλλαγή ένδειξης");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout med_infoLayout = new javax.swing.GroupLayout(med_info);
        med_info.setLayout(med_infoLayout);
        med_infoLayout.setHorizontalGroup(
            med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, med_infoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MedsDisp)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addGroup(med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EnumDisp)
                    .addGroup(med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(EditButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(172, 172, 172))
        );
        med_infoLayout.setVerticalGroup(
            med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(med_infoLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MedsDisp)
                    .addComponent(EnumDisp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(med_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(EditButton)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 864, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(med_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(med_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
            System.out.println(pat.getName());        // TODO add your handling code here:
    }//GEN-LAST:event_EditButtonActionPerformed
    public void InitPatientList(){
        ArrayList<Patient> temp = new ArrayList(200);
        
        Patient p1 = new Patient(123456,"Spuros",43,"patient history","Patient cond",doc,Patient.status_enum.ok);
        Patient p2 = new Patient(123457,"Giwrgos",61,"patient history","Patient cond",doc,Patient.status_enum.bad);
        Patient p3 = new Patient(123458,"Giannhs",27,"patient history","Patient cond",doc,Patient.status_enum.good);
        //Patient p4 = new Patient(123459,"Malaka", 1 ,"patient history","Patient cond",doc, Patient.status_enum.very_bad);
        
        temp.add(p1);
        temp.add(p2);
        temp.add(p3);
        //temp.add(p4);
        
        doc.setPatientList(temp);
        patList.clear();
        int i;
        for (i=0; i<temp.size(); i++){
            this.patList.add(temp.get(i).getName());
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
            java.util.logging.Logger.getLogger(Nosileutis_Farmaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nosileutis_Farmaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nosileutis_Farmaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nosileutis_Farmaka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nosileutis_Farmaka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditButton;
    private javax.swing.JLabel EnumDisp;
    private javax.swing.JLabel MedsDisp;
    private javax.swing.JList<String> enum_list;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel med_info;
    private javax.swing.JList<String> pat_list;
    // End of variables declaration//GEN-END:variables

}
