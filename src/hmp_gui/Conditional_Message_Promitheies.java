/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmp_gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

import java.util.ArrayList;
/**
 *
 * @author Nikos
 */
public class Conditional_Message_Promitheies extends javax.swing.JFrame {

    
    /**
     * Creates new form Conditional_Message_Promitheies
     */
    private int available_space;
    ArrayList<String> medList = new ArrayList();
    ArrayList<String> medQuantityList = new ArrayList();
    ArrayList<String> medEqList = new ArrayList();
    ArrayList<String> medEqQuantityList = new ArrayList();
    public Conditional_Message_Promitheies() {
        //hideAddition();
        initComponents();
    }
    public Conditional_Message_Promitheies(int available_space,ArrayList<String> medList,ArrayList<String> medEqList, ArrayList<String> medQuantityList,ArrayList<String> medEqQuantityList) {
        
        this.available_space = available_space;
        this.medList = medList;
        this.medEqList = medEqList;
        this.medQuantityList = medQuantityList;
        this.medEqQuantityList = medEqQuantityList;
        //hideAddition();
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

        Message_Label = new javax.swing.JLabel();
        condMsg = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        infoTag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));

        Message_Label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        condMsg.setBackground(new java.awt.Color(153, 204, 255));

        addButton.setText("Προσθήκη αναλώσιμων υλικών");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Διαγραφή αναλώσιμων υλικών");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        infoTag.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        infoTag.setForeground(new java.awt.Color(255, 255, 255));
        infoTag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        infoTag.setText("<html>Μπορείτε να προχωρήσετε σε προσθήκη ή<br>&nbsp;&nbsp;&nbsp;&nbsp;διαγραφή των αναλώσιμων υλικών</html>");
        infoTag.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout condMsgLayout = new javax.swing.GroupLayout(condMsg);
        condMsg.setLayout(condMsgLayout);
        condMsgLayout.setHorizontalGroup(
            condMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(condMsgLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(infoTag, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(condMsgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(addButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addGap(55, 55, 55))
        );
        condMsgLayout.setVerticalGroup(
            condMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, condMsgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(infoTag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(condMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(deleteButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(condMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347)
                .addComponent(Message_Label)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Message_Label)
                .addGap(208, 208, 208))
            .addGroup(layout.createSequentialGroup()
                .addComponent(condMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 558, 236);
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Addition_Promithies_Medicine apm = new Addition_Promithies_Medicine(available_space,medList,medEqList,medQuantityList,medEqQuantityList);
        dispose();
        apm.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Deletion_Promithies_Medicine dpm = new Deletion_Promithies_Medicine(available_space,medList,medEqList,medQuantityList,medEqQuantityList);
        dispose();
        dpm.setVisible(true);
    }//GEN-LAST:event_deleteButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conditional_Message_Promitheies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message_Label;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel condMsg;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel infoTag;
    // End of variables declaration//GEN-END:variables
}