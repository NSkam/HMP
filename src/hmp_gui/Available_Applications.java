package hmp_gui;

import data.Application;
import data.Admission_Application;
import data.Discharge_Application;
/**
 *
 * @author Skamnelos Nikolaos
 */
public class Available_Applications extends javax.swing.JFrame {

    private Application created_appl = new Application();
    private Admission_Application admission_application= new Admission_Application();
    private Discharge_Application discharge_application= new Discharge_Application();
    private Dashboard_Epimelitis dashboard = new Dashboard_Epimelitis();//Pairnei meso tou constructor thn timh tou prohgounmenou Dashboard
    /**
     * Creates new form Available_Applications
     */
    public Available_Applications(Dashboard_Epimelitis dashboard) {
        this.dashboard = dashboard;
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
        admission_appl = new javax.swing.JButton();
        discharge_appl = new javax.swing.JButton();
        exam_appl = new javax.swing.JButton();
        transfer_appl = new javax.swing.JButton();
        select_appl_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        admission_appl.setText("Αίτηση για Εισιτήριο");
        admission_appl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admission_applActionPerformed(evt);
            }
        });

        discharge_appl.setText("Αίτηση για Εξιιτήριο");
        discharge_appl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discharge_applActionPerformed(evt);
            }
        });

        exam_appl.setText("<html>Αίτηση για εξέταση <br>&nbsp;&nbsp;σε άλλη κλινική</html>");
        exam_appl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exam_applActionPerformed(evt);
            }
        });

        transfer_appl.setText("<html>Αίτηση για μεταφορά <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;σε άλλη κλινική</html>");
        transfer_appl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer_applActionPerformed(evt);
            }
        });

        select_appl_label.setForeground(new java.awt.Color(255, 255, 255));
        select_appl_label.setText("Παρακαλώ, επιλέξτε το είδος της Αίτησης:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admission_appl)
                    .addComponent(discharge_appl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exam_appl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(transfer_appl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(select_appl_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {admission_appl, discharge_appl, exam_appl, transfer_appl});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(select_appl_label)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admission_appl)
                    .addComponent(exam_appl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(discharge_appl)
                    .addComponent(transfer_appl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {admission_appl, discharge_appl, exam_appl, transfer_appl});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //Kanoun set to eidos ths aithshs analoga me to koumpi pou patithike kai meta kaloun thn displayApplForm
    private void admission_applActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admission_applActionPerformed
        this.admission_application.setType(Application.Type.admission_appl);
        displayApplForm(this.admission_application);
    }//GEN-LAST:event_admission_applActionPerformed

    private void discharge_applActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discharge_applActionPerformed
        this.discharge_application.setType(Application.Type.discharge_appl);
        displayApplForm(this.discharge_application);
    }//GEN-LAST:event_discharge_applActionPerformed

    private void exam_applActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exam_applActionPerformed
        this.created_appl.setType(Application.Type.exam_appl);
        displayApplForm(this.created_appl);
    }//GEN-LAST:event_exam_applActionPerformed

    private void transfer_applActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer_applActionPerformed
        this.created_appl.setType(Application.Type.transfer_appl);
        displayApplForm(this.created_appl);
    }//GEN-LAST:event_transfer_applActionPerformed

    //Emfanizei thn katalhlh forma aithshs analoga me to eidos ths aithshs
    public void displayApplForm(Application appl){
        
        if(appl.getType().equals("Αίτηση Εισιτηρίου")){
            Admission_Appl admission_application = new Admission_Appl(this.admission_application,this.dashboard);
            dispose();
            admission_application.setVisible(true);
        }
        if(appl.getType().equals("Αίτηση Εξιτηρίου")){
            Discharge_Appl discharge_application = new Discharge_Appl(this.discharge_application,this.dashboard);
            dispose();
            discharge_application.setVisible(true);
        }
        if(appl.getType().equals("Αίτηση για εξέταση σε άλλη κλινίκη")){
            Exam_Appl exam_application = new Exam_Appl(this.created_appl,this.dashboard);
            dispose();
            exam_application.setVisible(true);
        }
        if(appl.getType().equals("Αίτηση για μεταφορά σε άλλη κλινική")){
            Transfer_Appl transfer_application = new Transfer_Appl(this.created_appl,this.dashboard);
            dispose();
            transfer_application.setVisible(true);
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
            java.util.logging.Logger.getLogger(Available_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Available_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Available_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Available_Applications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admission_appl;
    private javax.swing.JButton discharge_appl;
    private javax.swing.JButton exam_appl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel select_appl_label;
    private javax.swing.JButton transfer_appl;
    // End of variables declaration//GEN-END:variables
}
