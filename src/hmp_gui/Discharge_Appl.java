package hmp_gui;

import data.Application;
import data.Discharge_Application;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Discharge_Appl extends javax.swing.JFrame {

    
    private Discharge_Application discharge_application = new Discharge_Application();
    private Dashboard_Epimelitis dashboard;
    /**
     * Creates new form Admission_Appl
     */
    public Discharge_Appl(Discharge_Application appl, Dashboard_Epimelitis dashboard) {
        Settings(appl, dashboard);
        initComponents();
    }

    public void Settings(Discharge_Application appl, Dashboard_Epimelitis dashboard){
        this.discharge_application = appl;
        this.dashboard = dashboard;
        this.dashboard.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Discharge_Appl_Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Discharge Application Form");
        setLocation(new java.awt.Point(800, 400));

        Discharge_Appl_Panel.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout Discharge_Appl_PanelLayout = new javax.swing.GroupLayout(Discharge_Appl_Panel);
        Discharge_Appl_Panel.setLayout(Discharge_Appl_PanelLayout);
        Discharge_Appl_PanelLayout.setHorizontalGroup(
            Discharge_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        Discharge_Appl_PanelLayout.setVerticalGroup(
            Discharge_Appl_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Discharge_Appl_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Discharge_Appl_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Discharge_Appl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Discharge_Appl_Panel;
    // End of variables declaration//GEN-END:variables
}
