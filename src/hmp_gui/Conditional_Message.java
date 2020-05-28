package hmp_gui;

/**
 *
 * @author Nikolaos Skamnelos
 */
public class Conditional_Message extends javax.swing.JFrame {

     private javax.swing.JFrame dashboard = new javax.swing.JFrame();
    /**
     * Creates new form Conditional_Message
     */
    public Conditional_Message(javax.swing.JFrame dashboard) {
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

        Message_Panel = new javax.swing.JPanel();
        Ok_Button = new javax.swing.JButton();
        Format_Panel = new javax.swing.JPanel();
        Message_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Message_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 153, 255), 4, true));

        Ok_Button.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Ok_Button.setText("OK");
        Ok_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ok_ButtonActionPerformed(evt);
            }
        });

        Format_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Message_Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout Format_PanelLayout = new javax.swing.GroupLayout(Format_Panel);
        Format_Panel.setLayout(Format_PanelLayout);
        Format_PanelLayout.setHorizontalGroup(
            Format_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Format_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Message_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        Format_PanelLayout.setVerticalGroup(
            Format_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Format_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Message_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Message_PanelLayout = new javax.swing.GroupLayout(Message_Panel);
        Message_Panel.setLayout(Message_PanelLayout);
        Message_PanelLayout.setHorizontalGroup(
            Message_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Message_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Message_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Format_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Message_PanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Ok_Button)))
                .addContainerGap())
        );
        Message_PanelLayout.setVerticalGroup(
            Message_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Message_PanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(Format_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ok_Button))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Message_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Message_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Kleinei to parathyro Mynhmatos kai epistrefei to elenxo sthn prohgoumenh othonh
    private void Ok_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ok_ButtonActionPerformed
        this.dashboard.setEnabled(true);
        dispose();
    }//GEN-LAST:event_Ok_ButtonActionPerformed
       
    //Emfanizei to mynhma sto parathyro
    public void triggerMsg(String message){     
        Message_Label.setText(message);
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
            java.util.logging.Logger.getLogger(Conditional_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conditional_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conditional_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conditional_Message.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {}
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Format_Panel;
    private javax.swing.JLabel Message_Label;
    private javax.swing.JPanel Message_Panel;
    private javax.swing.JButton Ok_Button;
    // End of variables declaration//GEN-END:variables
}