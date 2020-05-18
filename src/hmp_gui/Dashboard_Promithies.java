/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp_gui;

/**
 *
 * @author Alastor
 */
public class Dashboard_Promithies extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Promithies
     */
    public Dashboard_Promithies() {
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
        clinic_info = new javax.swing.JPanel();
        shifts = new javax.swing.JPanel();
        eidik_comments = new javax.swing.JPanel();

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
            .addGap(0, 349, Short.MAX_VALUE)
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
            .addGap(0, 349, Short.MAX_VALUE)
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
            .addGap(0, 349, Short.MAX_VALUE)
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
            .addGap(0, 349, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp;&nbsp; Κλινικής</html>", clinic_info);

        shifts.setBackground(new java.awt.Color(153, 204, 255));
        shifts.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout shiftsLayout = new javax.swing.GroupLayout(shifts);
        shifts.setLayout(shiftsLayout);
        shiftsLayout.setHorizontalGroup(
            shiftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        shiftsLayout.setVerticalGroup(
            shiftsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("Εφημερίες", shifts);

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
            .addGap(0, 349, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Σχόλια<br> Ειδικευόμενων</html>", eidik_comments);

        javax.swing.GroupLayout Tab_PanelLayout = new javax.swing.GroupLayout(Tab_Panel);
        Tab_Panel.setLayout(Tab_PanelLayout);
        Tab_PanelLayout.setHorizontalGroup(
            Tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_tabs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
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
                .addComponent(Button_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 411, Short.MAX_VALUE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tab_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dashboard_LayerLayout.setVerticalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard_LayerLayout.createSequentialGroup()
                .addGap(0, 333, Short.MAX_VALUE)
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
        Login.promithies_counter = false;
    }
    
    //Logout Function
    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed

        clearTokens();
        dispose();
        Login login_page = new Login();
        login_page.setVisible(true);

    }//GEN-LAST:event_logout_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard_Promithies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Promithies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Promithies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Promithies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Promithies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JLayeredPane Dashboard_Layer;
    private javax.swing.JTabbedPane Dashboard_tabs;
    private javax.swing.JPanel Tab_Panel;
    private javax.swing.JPanel applications;
    private javax.swing.JPanel clinic_info;
    private javax.swing.JPanel eidik_comments;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel patient_list;
    private javax.swing.JPanel shifts;
    private javax.swing.JPanel user_info;
    // End of variables declaration//GEN-END:variables
}
