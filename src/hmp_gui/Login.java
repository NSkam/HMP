package hmp_gui;

/**
  * @author Nikolaos Skamnelos
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }
    protected static boolean headdoc_counter = false;
    protected static boolean epimelitis_counter = false;
    protected static boolean eidik_counter = false;
    protected static boolean nosileutis_counter = false;
    protected static boolean dioikitis_counter = false;
    protected static boolean gramateia_counter = false;
    protected static boolean promithies_counter = false;
       
       
    /*Generated code gia thn dhmiourgia twn diaforwn parathyrwn/koumpiwn ths login
    page
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        Please_Enter = new javax.swing.JPanel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Login_Button = new javax.swing.JButton();
        login_password_field = new javax.swing.JPasswordField();
        login_username_field = new javax.swing.JTextField();
        recover_password = new javax.swing.JButton();
        create_account_button = new javax.swing.JButton();
        login_error_msg = new javax.swing.JLabel();
        login_error_msg.setVisible(false);
        HMP_logo = new javax.swing.JLabel();
        Greetings = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HMP - Log-in");
        setBackground(new java.awt.Color(153, 204, 255));
        setLocationByPlatform(true);
        setResizable(false);

        Login.setBackground(new java.awt.Color(153, 204, 255));
        Login.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Please_Enter.setBackground(new java.awt.Color(153, 204, 255));
        Please_Enter.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), "Παρακαλώ Εισάγετε", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 2, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        Please_Enter.setOpaque(false);

        Username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("Username:");

        Password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("Password:");

        Login_Button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Login_Button.setText("Sign-in");
        Login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login_ButtonActionPerformed(evt);
            }
        });

        login_password_field.setText(" password");
        login_password_field.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        login_password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_password_fieldFocusGained(evt);
            }
        });

        login_username_field.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        login_username_field.setText(" Enter Username...");
        login_username_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        login_username_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                login_username_fieldFocusGained(evt);
            }
        });

        recover_password.setBackground(new java.awt.Color(153, 204, 255));
        recover_password.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        recover_password.setForeground(new java.awt.Color(255, 255, 255));
        recover_password.setText("Forgot Password?");
        recover_password.setBorder(null);
        recover_password.setBorderPainted(false);
        recover_password.setContentAreaFilled(false);
        recover_password.setOpaque(true);
        recover_password.setRolloverEnabled(false);
        recover_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                recover_passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                recover_passwordMouseExited(evt);
            }
        });

        create_account_button.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        create_account_button.setText("Sign-up");

        login_error_msg.setBackground(new java.awt.Color(102, 153, 255));
        login_error_msg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        login_error_msg.setForeground(new java.awt.Color(255, 0, 0));
        login_error_msg.setText("Wrong Username or Password. Please try again...");

        javax.swing.GroupLayout Please_EnterLayout = new javax.swing.GroupLayout(Please_Enter);
        Please_Enter.setLayout(Please_EnterLayout);
        Please_EnterLayout.setHorizontalGroup(
            Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Please_EnterLayout.createSequentialGroup()
                .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Please_EnterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(recover_password, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Please_EnterLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Please_EnterLayout.createSequentialGroup()
                                .addComponent(create_account_button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                                .addComponent(Login_Button)
                                .addGap(15, 15, 15))
                            .addGroup(Please_EnterLayout.createSequentialGroup()
                                .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                    .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(login_error_msg, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(login_password_field)
                                        .addComponent(login_username_field, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Please_EnterLayout.setVerticalGroup(
            Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Please_EnterLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(login_error_msg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_username_field))
                .addGap(34, 34, 34)
                .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password)
                    .addComponent(login_password_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recover_password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Please_EnterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_Button)
                    .addComponent(create_account_button))
                .addContainerGap())
        );

        Please_EnterLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {login_password_field, login_username_field});

        HMP_logo.setBackground(new java.awt.Color(255, 255, 255));
        HMP_logo.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N
        HMP_logo.setForeground(new java.awt.Color(255, 255, 255));
        HMP_logo.setText("HMP");

        Greetings.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Greetings.setForeground(new java.awt.Color(255, 255, 255));
        Greetings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Greetings.setText("<html>Καλώς Ορίσατε στο Πρόγραμμα<br>&nbsp;&nbsp;&nbsp;&nbsp;Διαχείρισης Νοσοκομείων!</html>");
        Greetings.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Greetings)
                            .addComponent(Please_Enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(HMP_logo))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addComponent(HMP_logo)
                .addGap(26, 26, 26)
                .addComponent(Greetings, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Please_Enter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Otan to password field pairnei to focus kanei select olous tous xarakthres
    private void login_password_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_password_fieldFocusGained
        login_password_field.selectAll();
    }//GEN-LAST:event_login_password_fieldFocusGained
    //Otan to username field pairnei to focus kanei select olous tous xarakthres
    private void login_username_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_login_username_fieldFocusGained
        login_username_field.selectAll();
    }//GEN-LAST:event_login_username_fieldFocusGained
    //Otan pairnaei to mouse panw apo to recover_password field to kanei highlight
    private void recover_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recover_passwordMouseEntered
       recover_password.setFont(new java.awt.Font("Tahoma", 1, 12));
    }//GEN-LAST:event_recover_passwordMouseEntered

    private void recover_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recover_passwordMouseExited
         recover_password.setFont(new java.awt.Font("Tahoma", 0, 12));
    }//GEN-LAST:event_recover_passwordMouseExited

    
    /*Ypo kanonikes synthikes edw tha pairname thn timh tou username kai tou password
    kai tha anatrexame sthn database gia na doume an exoume match xrhsth gia login.
    Gia aplothta edw apla tha exoume default usernames kai passwords gia ta eidh twn xrhstwn
    ws e3hs:
    headdoc --> Dieuthintis Klinikis
    epimelitis --> Epimelitis A/B/C
    eidik --> Eidikeuomenos giatros
    nosileutis --> Nosileutis
    dioikitis --> Dioikitis Nosokomeiou
    gramateia --> Gramateia Nosokomeiou
    promithies --> Tmhma Promuthiwn
    */
    private void Login_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login_ButtonActionPerformed

        
       switch(login_username_field.getText()){
        
           case "headdoc":
               headdoc_counter = true;  
               Dashboard_Headdoc dashboard_hd = new Dashboard_Headdoc(); 
               dispose();
               dashboard_hd.setVisible(true);
               break;
           case "epimelitis":
               epimelitis_counter = true;
               Dashboard_Epimelitis dashboard_ep = new Dashboard_Epimelitis(); 
               dispose();
               dashboard_ep.setVisible(true);
               break;
           case "eidik":
               eidik_counter = true;
               Dashboard_Eidik dashboard_eid = new Dashboard_Eidik(); 
               dispose();
               dashboard_eid.setVisible(true);
               break;
           case "nosileutis":
               nosileutis_counter = true;
               Dashboard_Nosileutis dashboard_nos = new Dashboard_Nosileutis(); 
               dispose();
               dashboard_nos.setVisible(true);
               break;
           case "dioikitis":
               dioikitis_counter = true;
               Dashboard_Dioikitis dashboard_dioi = new Dashboard_Dioikitis(); 
               dispose();
               dashboard_dioi.setVisible(true);
               break;
           case "gramateia":
               gramateia_counter = true;
               Dashboard_Gramateia dashboard_gra = new Dashboard_Gramateia(); 
               dispose();
               dashboard_gra.setVisible(true);
               break;
           case "promithies":
               promithies_counter = true;
               Dashboard_Promithies dashboard_pro = new Dashboard_Promithies(); 
               dispose();
               dashboard_pro.setVisible(true);
               break;
           default:
               System.out.println("Wrong Username/Passsword");
               login_error_msg.setVisible(true);
               break;
        }
               
               
    }//GEN-LAST:event_Login_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Greetings;
    private javax.swing.JLabel HMP_logo;
    private javax.swing.JPanel Login;
    private javax.swing.JButton Login_Button;
    private javax.swing.JLabel Password;
    private javax.swing.JPanel Please_Enter;
    private javax.swing.JLabel Username;
    private javax.swing.JButton create_account_button;
    private javax.swing.JLabel login_error_msg;
    private javax.swing.JPasswordField login_password_field;
    private javax.swing.JTextField login_username_field;
    private javax.swing.JButton recover_password;
    // End of variables declaration//GEN-END:variables
}
