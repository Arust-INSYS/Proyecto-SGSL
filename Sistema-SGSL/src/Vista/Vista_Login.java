/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Vista_Login extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Login
     */
    public Vista_Login() {
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

        txt_passwordLogin = new javax.swing.JPasswordField();
        txtUsuarioLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_passwordLogin.setBackground(new java.awt.Color(204, 204, 204));
        txt_passwordLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txt_passwordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 210, 30));

        txtUsuarioLogin.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuarioLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuarioLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtUsuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 210, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/user-100.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, 110));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-vuelva-a-introducir-el-código-pin-30.png"))); // NOI18N
        btnLogin.setText("Ingresar");
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-eliminar-user-group-man-man-30(1).png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OPENLIMP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 80, 128));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 70));

        jPanel3.setBackground(new java.awt.Color(0, 80, 128));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sistema de Gestión para Servicios de Limpieza");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 360, 60));

        jPanel2.setBackground(new java.awt.Color(217, 214, 214));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }

    public void setBtnRegistrar(JButton btnRegistrar) {
        this.btnRegistrar = btnRegistrar;
    }

    
    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JTextField getTxtUsuarioLogin() {
        return txtUsuarioLogin;
    }

    public void setTxtUsuarioLogin(JTextField txtUsuarioLogin) {
        this.txtUsuarioLogin = txtUsuarioLogin;
    }

    public JPasswordField getTxt_passwordLogin() {
        return txt_passwordLogin;
    }

    public void setTxt_passwordLogin(JPasswordField txt_passwordLogin) {
        this.txt_passwordLogin = txt_passwordLogin;
    }
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtUsuarioLogin;
    private javax.swing.JPasswordField txt_passwordLogin;
    // End of variables declaration//GEN-END:variables
}
