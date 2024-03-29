/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.assignment_project_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author aliza
 */
public class Registration_Form extends javax.swing.JFrame {

    /**
     * Creates new form Registration_Form
     * 
     */

    public Registration_Form() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
    }
    JFrame Global_Admin_Object_5;
    
    public Registration_Form(JFrame Admin_Object5) 
    {
        initComponents();
        
        Global_Admin_Object_5 = Admin_Object5;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pass_txt = new javax.swing.JPasswordField();
        User_txt = new javax.swing.JTextField();
        Ctc_txt = new javax.swing.JTextField();
        Rl_txt = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        REGISTER_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(339, 388));
        setMinimumSize(new java.awt.Dimension(339, 388));
        setResizable(false);

        jLabel1.setText("Enter Username                           :-");

        jLabel4.setText("Contact Number                         :- ");

        jLabel2.setText("Enter Password                            :- ");

        Rl_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer", "Technician", " " }));

        jLabel5.setText("Role                                               :-");

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Unispace", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registration Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel3)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jLabel6.setText("Enter Identification Number      :-");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ID_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pass_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ctc_txt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rl_txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(User_txt))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(User_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ID_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ctc_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Rl_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        REGISTER_Button.setText("REGISTER");
        REGISTER_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTER_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(REGISTER_Button))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(REGISTER_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void REGISTER_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTER_ButtonActionPerformed
      
        if (User_txt.getText().isEmpty() || Ctc_txt.getText().isEmpty() || new String(Pass_txt.getPassword()).isEmpty() || ID_txt.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(null, "No Fields can be left empty!"); 
        } 
        else
        {
            int found = 0;
            String u_ID = ID_txt.getText();    
            String u_id = User_txt.getText();
            String u_ps = new String(Pass_txt.getPassword());
            String u_ct = Ctc_txt.getText();
            Pattern username = Pattern.compile("^[a-zA-Z]{0,10}[_]{1}[a-zA-Z]{0,10}$");
            Pattern ID = Pattern.compile("^[a-zA-Z0-9]{5,15}$");
            Pattern Contact_Number = Pattern.compile("^[0-9]{10,16}$");
            Pattern Password = Pattern.compile("^[\\p{Punct} | \\p{Alnum}]{1,16}$");

            Matcher ID_match = ID.matcher(u_ID);
            Matcher username_match = username.matcher(u_id);
            Matcher Password_match = Password.matcher(u_ps);
            Matcher Contact_match = Contact_Number.matcher(u_ct);
            
            boolean b1 = ID_match.matches();
            boolean b2 = username_match.matches();
            boolean b3 = Password_match.matches();
            boolean b4 = Contact_match.matches();       
            if (!b1 || !b2 || !b3 || !b4)
            {
                JOptionPane.showMessageDialog(null, """
                                                    Invalid details entered, please try again!!
                                                    Username only acceptble in this format:- FirstName_LastName
                                                    Your IC must only contain alphanumerics and be a minimum of 5 characters long
                                                    Your Contact Number must be 10 digits long atleast
                                                    Your Password must only contain alphanumerics""");
                ID_txt.setText(null);
                User_txt.setText(null);
                Pass_txt.setText(null);
                Ctc_txt.setText(null);
            }
            else
            {
                Path p = Paths.get(".", "User_Details.txt");
                try (BufferedReader reader = Files.newBufferedReader(p);)
                {                 
                    String line;
                    while ((line = reader.readLine()) != null)
                    {
                       
                        String[] fields = line.split("[,]");
                        System.out.println(u_ID);
                        System.out.println(fields[0]);
                        if (u_ID.equals(fields[0]))
                        {                                                   
                            found = 1;
                            break;
                        }
                        else
                        {   
                           found = 0; 
                        }
                    }
                }catch (IOException ex){}
                if (found == 1)
                {
                    JOptionPane.showMessageDialog(null, "This IC has already been registered with another account! \n Please try again!");
                    ID_txt.setText(null);
                    User_txt.setText(null);
                    Pass_txt.setText(null);
                    Ctc_txt.setText(null);
                }
                else
                {
                    String u_rl = Rl_txt.getSelectedItem().toString();
                    Registration_Details Obj2 = new Registration_Details();
                    Obj2.register(u_ID, u_id,  u_ct,  u_ps,  u_rl);
                    JOptionPane.showMessageDialog(null, "Registration Successful!");
                    this.dispose();
                    Global_Admin_Object_5.setVisible(true);  
                }             
            }               
        }
    }//GEN-LAST:event_REGISTER_ButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ctc_txt;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JPasswordField Pass_txt;
    private javax.swing.JButton REGISTER_Button;
    private javax.swing.JComboBox<String> Rl_txt;
    private javax.swing.JTextField User_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
