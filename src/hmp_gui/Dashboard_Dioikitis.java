/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp_gui;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Dashboard_Dioikitis extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard_Dioikitis
     */
    public Dashboard_Dioikitis() {
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
        synallages = new javax.swing.JPanel();
        supplie_req_list = new javax.swing.JPanel();
        hosp_rules = new javax.swing.JPanel();
        legal_issues = new javax.swing.JPanel();

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
            .addGap(0, 362, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp; Χρήστη</html>", user_info);

        synallages.setBackground(new java.awt.Color(153, 204, 255));
        synallages.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout synallagesLayout = new javax.swing.GroupLayout(synallages);
        synallages.setLayout(synallagesLayout);
        synallagesLayout.setHorizontalGroup(
            synallagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        synallagesLayout.setVerticalGroup(
            synallagesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("Συναλλαγές", synallages);

        supplie_req_list.setBackground(new java.awt.Color(153, 204, 255));
        supplie_req_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout supplie_req_listLayout = new javax.swing.GroupLayout(supplie_req_list);
        supplie_req_list.setLayout(supplie_req_listLayout);
        supplie_req_listLayout.setHorizontalGroup(
            supplie_req_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        supplie_req_listLayout.setVerticalGroup(
            supplie_req_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("Λίστα Ελλείψεων", supplie_req_list);

        hosp_rules.setBackground(new java.awt.Color(153, 204, 255));
        hosp_rules.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout hosp_rulesLayout = new javax.swing.GroupLayout(hosp_rules);
        hosp_rules.setLayout(hosp_rulesLayout);
        hosp_rulesLayout.setHorizontalGroup(
            hosp_rulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        hosp_rulesLayout.setVerticalGroup(
            hosp_rulesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>&nbsp;Κανονισμοί<br>Νοσοκομείου</html>", hosp_rules);

        legal_issues.setBackground(new java.awt.Color(153, 204, 255));
        legal_issues.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout legal_issuesLayout = new javax.swing.GroupLayout(legal_issues);
        legal_issues.setLayout(legal_issuesLayout);
        legal_issuesLayout.setHorizontalGroup(
            legal_issuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        legal_issuesLayout.setVerticalGroup(
            legal_issuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>&nbsp;&nbsp;Νομικά<br> Ζητήματα</html>", legal_issues);

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
                .addGap(0, 459, Short.MAX_VALUE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Tab_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Dashboard_LayerLayout.setVerticalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard_LayerLayout.createSequentialGroup()
                .addGap(0, 346, Short.MAX_VALUE)
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
        Login.dioikitis_counter = false;
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
            java.util.logging.Logger.getLogger(Dashboard_Dioikitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Dioikitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Dioikitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Dioikitis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Dioikitis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JLayeredPane Dashboard_Layer;
    private javax.swing.JTabbedPane Dashboard_tabs;
    private javax.swing.JPanel Tab_Panel;
    private javax.swing.JPanel hosp_rules;
    private javax.swing.JPanel legal_issues;
    private javax.swing.JButton logout_button;
    private javax.swing.JPanel supplie_req_list;
    private javax.swing.JPanel synallages;
    private javax.swing.JPanel user_info;
    // End of variables declaration//GEN-END:variables
}
