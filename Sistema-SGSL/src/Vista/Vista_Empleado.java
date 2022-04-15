/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author lorena
 */
public class Vista_Empleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Empleado
     */
    public Vista_Empleado() {
        initComponents();
    }

    public JButton getBtnCrear() {
        return BtnCrear;
    }
    
    

    public JButton getBtnActualizar() {
        return BtnActualizar;
    }

    public JLabel getLblFechaRojo() {
        return LblFechaRojo;
    }

    public void setLblFechaRojo(JLabel LblFechaRojo) {
        this.LblFechaRojo = LblFechaRojo;
    }

    public JLabel getLblEstadoRojo() {
        return LblEstadoRojo;
    }

    public void setLblEstadoRojo(JLabel LblEstadoRojo) {
        this.LblEstadoRojo = LblEstadoRojo;
    }

    public JLabel getLblSueldoRojo() {
        return LblSueldoRojo;
    }

    public void setLblSueldoRojo(JLabel LblSueldoRojo) {
        this.LblSueldoRojo = LblSueldoRojo;
    }
    
    

    public void setBtnActualizar(JButton BtnActualizar) {
        this.BtnActualizar = BtnActualizar;
    }

    public JDialog getDialogPersona() {
        return DialogPersona;
    }

    public void setDialogPersona(JDialog DialogPersona) {
        this.DialogPersona = DialogPersona;
    }

    public JButton getBtningresar() {
        return btningresar;
    }

    public void setBtningresar(JButton btningresar) {
        this.btningresar = btningresar;
    }

    public JTable getTblPersonas() {
        return tblPersonas;
    }

    public void setTblPersonas(JTable tblPersonas) {
        this.tblPersonas = tblPersonas;
    }

    public JButton getVerper() {
        return verper;
    }

    public void setVerper(JButton verper) {
        this.verper = verper;
    }

    public JLabel getLblbuscar() {
        return lblbuscar;
    }

    public void setLblbuscar(JLabel lblbuscar) {
        this.lblbuscar = lblbuscar;
    }
    
    
    
    public void setBtnCrear(JButton BtnCrear) {
        this.BtnCrear = BtnCrear;
    }

    public JButton getBtnEditar() {
        return BtnEditar;
    }

    public void setBtnEditar(JButton BtnEditar) {
        this.BtnEditar = BtnEditar;
    }

    public JButton getBtnRemover() {
        return BtnRemover;
    }

    public void setBtnRemover(JButton BtnRemover) {
        this.BtnRemover = BtnRemover;
    }

    public JTextField getTxtBuscarEmpleado() {
        return TxtBuscarEmpleado;
    }

    public void setTxtBuscarEmpleado(JTextField TxtBuscarEmpleado) {
        this.TxtBuscarEmpleado = TxtBuscarEmpleado;
    }

   

    public JLabel getjLabel1() {
        return lblbuscar;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.lblbuscar = jLabel1;
    }


    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTblEmpleado() {
        return tblEmpleado;
    }

    public void setTblEmpleado(JTable tblEmpleado) {
        this.tblEmpleado = tblEmpleado;
    }

    public JDialog getDialogEmpleado() {
        return DialogEmpleado;
    }

    public void setDialogEmpleado(JDialog DialogEmpleado) {
        this.DialogEmpleado = DialogEmpleado;
    }

    public JComboBox<String> getBoxEstado() {
        return boxEstado;
    }

    public void setBoxEstado(JComboBox<String> boxEstado) {
        this.boxEstado = boxEstado;
    }

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JDateChooser getContratacion() {
        return contratacion;
    }

    public void setContratacion(JDateChooser contratacion) {
        this.contratacion = contratacion;
    }

    public JTextField getTxtid_persona() {
        return txtid_persona;
    }

    public void setTxtid_persona(JTextField txtid_persona) {
        this.txtid_persona = txtid_persona;
    }

    public JTextField getTxtidempleado() {
        return txtidempleado;
    }

    public void setTxtidempleado(JTextField txtidempleado) {
        this.txtidempleado = txtidempleado;
    }

    public JTextField getTxtsueldo() {
        return txtsueldo;
    }

    public void setTxtsueldo(JTextField txtsueldo) {
        this.txtsueldo = txtsueldo;
    }

    public JComboBox<String> getBoxrol() {
        return boxrol;
    }

    public void setBoxrol(JComboBox<String> boxrol) {
        this.boxrol = boxrol;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogEmpleado = new javax.swing.JDialog();
        btnAceptar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtsueldo = new javax.swing.JTextField();
        txtid_persona = new javax.swing.JTextField();
        boxEstado = new javax.swing.JComboBox<>();
        contratacion = new com.toedter.calendar.JDateChooser();
        verper = new javax.swing.JButton();
        boxrol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        LblSueldoRojo = new javax.swing.JLabel();
        LblEstadoRojo = new javax.swing.JLabel();
        LblFechaRojo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DialogPersona = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btningresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        TxtBuscarEmpleado = new javax.swing.JTextField();
        lblbuscar = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        BtnCrear = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        DialogEmpleado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 102, 51));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (2).png"))); // NOI18N
        btnAceptar.setText("ACEPTAR");
        btnAceptar.setBorder(null);
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DialogEmpleado.getContentPane().add(btnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 100, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Empleado");
        DialogEmpleado.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 120, 30));

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (1).png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setBorder(null);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DialogEmpleado.getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 80, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Id Empleado:");
        DialogEmpleado.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Sueldo:");
        DialogEmpleado.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Estado Civil:");
        DialogEmpleado.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Fecha de contratación:");
        DialogEmpleado.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        txtidempleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtidempleado.setForeground(new java.awt.Color(51, 51, 255));
        txtidempleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DialogEmpleado.getContentPane().add(txtidempleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, 28));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setText("Id Persona:");
        DialogEmpleado.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        txtsueldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DialogEmpleado.getContentPane().add(txtsueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 140, 27));

        txtid_persona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtid_persona.setForeground(new java.awt.Color(51, 51, 255));
        txtid_persona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DialogEmpleado.getContentPane().add(txtid_persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, 29));

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado", " ", " " }));
        boxEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DialogEmpleado.getContentPane().add(boxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 138, 27));

        contratacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contratacion.setDateFormatString("yyyy-MM-dd");
        DialogEmpleado.getContentPane().add(contratacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, 31));

        verper.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        verper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-búsqueda-de-propiedad-45.png"))); // NOI18N
        verper.setText("Ver Persona");
        verper.setBorder(null);
        verper.setContentAreaFilled(false);
        DialogEmpleado.getContentPane().add(verper, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        boxrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Administrador" }));
        boxrol.setToolTipText("");
        boxrol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DialogEmpleado.getContentPane().add(boxrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 140, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Rol:");
        DialogEmpleado.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        LblSueldoRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblSueldoRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblSueldoRojo.setText("*");
        DialogEmpleado.getContentPane().add(LblSueldoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        LblEstadoRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblEstadoRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblEstadoRojo.setText("*");
        DialogEmpleado.getContentPane().add(LblEstadoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        LblFechaRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblFechaRojo.setText("*");
        DialogEmpleado.getContentPane().add(LblFechaRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/dialogolimpiezaacho.jpg"))); // NOI18N
        DialogEmpleado.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        DialogPersona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Persona");
        DialogPersona.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 100, -1));

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Persona", "Cedula", "Nombre", "Apellido", "Foto"
            }
        ));
        jScrollPane2.setViewportView(tblPersonas);

        DialogPersona.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 330, 260));

        btningresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-agregar bodega-propiedad-48 (1).png"))); // NOI18N
        btningresar.setText("Ingresa Persona");
        btningresar.setBorder(null);
        btningresar.setContentAreaFilled(false);
        DialogPersona.getContentPane().add(btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/tablaemple.jpg"))); // NOI18N
        DialogPersona.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Empleado", "Sueldo", "Estado civil", "Fecha contrato", "Id Persona"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 680, 270));
        getContentPane().add(TxtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 319, 30));

        lblbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-busca-mas-48.png"))); // NOI18N
        getContentPane().add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        BtnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-grupo-de-usuarios-hombre-y-mujer-48 (2).png"))); // NOI18N
        BtnEditar.setText("Editar");
        BtnEditar.setBorder(null);
        BtnEditar.setContentAreaFilled(false);
        getContentPane().add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        BtnRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-grupo-de-usuarios-hombre-y-mujer-48 (1).png"))); // NOI18N
        BtnRemover.setText("Remover");
        BtnRemover.setBorder(null);
        BtnRemover.setContentAreaFilled(false);
        getContentPane().add(BtnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        BtnCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-grupo-de-usuarios-hombre-y-mujer-48.png"))); // NOI18N
        BtnCrear.setText("Crear");
        BtnCrear.setBorder(null);
        BtnCrear.setContentAreaFilled(false);
        BtnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        BtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-actualizar-PRO{-48.png"))); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setBorder(null);
        BtnActualizar.setContentAreaFilled(false);
        getContentPane().add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/EMPLECAP22.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 190));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/tabla_eje1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Blancoceleste.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnRemover;
    private javax.swing.JDialog DialogEmpleado;
    private javax.swing.JDialog DialogPersona;
    private javax.swing.JLabel LblEstadoRojo;
    private javax.swing.JLabel LblFechaRojo;
    private javax.swing.JLabel LblSueldoRojo;
    private javax.swing.JTextField TxtBuscarEmpleado;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxrol;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btningresar;
    private com.toedter.calendar.JDateChooser contratacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtid_persona;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JButton verper;
    // End of variables declaration//GEN-END:variables
}
