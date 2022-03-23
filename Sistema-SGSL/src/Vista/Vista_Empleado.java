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

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
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
        DialogPersona = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btningresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BtnCrear = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        BtnActualizar = new javax.swing.JButton();
        TxtBuscarEmpleado = new javax.swing.JTextField();
        lblbuscar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnAceptar.setText("ACEPTAR");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Empleado");

        btnCancelar.setText("CANCELAR");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Id Empleado:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Sueldo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Estado Civil:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Fecha de contratación:");

        txtidempleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtidempleado.setForeground(new java.awt.Color(51, 51, 255));
        txtidempleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Id Persona:");

        txtsueldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtid_persona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtid_persona.setForeground(new java.awt.Color(51, 51, 255));
        txtid_persona.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado", " ", " " }));
        boxEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        contratacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        contratacion.setDateFormatString("yyyy-MM-dd");

        verper.setText("Ver Persona");

        boxrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Administrador" }));
        boxrol.setToolTipText("");
        boxrol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Rol:");

        LblSueldoRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblSueldoRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblSueldoRojo.setText("*");

        LblEstadoRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblEstadoRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblEstadoRojo.setText("*");

        LblFechaRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblFechaRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblFechaRojo.setText("*");

        javax.swing.GroupLayout DialogEmpleadoLayout = new javax.swing.GroupLayout(DialogEmpleado.getContentPane());
        DialogEmpleado.getContentPane().setLayout(DialogEmpleadoLayout);
        DialogEmpleadoLayout.setHorizontalGroup(
            DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnAceptar)
                        .addGap(80, 80, 80)
                        .addComponent(btnCancelar))
                    .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DialogEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(boxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DialogEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, DialogEmpleadoLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSueldoRojo)
                                    .addComponent(LblEstadoRojo)))
                            .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel13))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(boxrol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtid_persona, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                            .addComponent(contratacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(verper)
                                    .addComponent(LblFechaRojo))))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        DialogEmpleadoLayout.setVerticalGroup(
            DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(LblSueldoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(LblEstadoRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblFechaRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel12))
                        .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(verper))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxrol, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(58, 58, 58)
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Persona");

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Persona", "Cedula", "Nombre", "Apellido", "Foto"
            }
        ));
        jScrollPane2.setViewportView(tblPersonas);

        btningresar.setText("Ingre");

        javax.swing.GroupLayout DialogPersonaLayout = new javax.swing.GroupLayout(DialogPersona.getContentPane());
        DialogPersona.getContentPane().setLayout(DialogPersonaLayout);
        DialogPersonaLayout.setHorizontalGroup(
            DialogPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogPersonaLayout.createSequentialGroup()
                .addGroup(DialogPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogPersonaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btningresar)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogPersonaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        DialogPersonaLayout.setVerticalGroup(
            DialogPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogPersonaLayout.createSequentialGroup()
                .addGroup(DialogPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogPersonaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(DialogPersonaLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btningresar)))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrear.setText("Crear");
        jPanel1.add(BtnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        BtnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditar.setText("Editar");
        jPanel1.add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        BtnRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemover.setText("Remover");
        jPanel1.add(BtnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 230));

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Empleado", "Sueldo", "Estado civil", "Fecha contrato", "Id Persona"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 824, 229));

        BtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizar.setText("Actualizar");
        getContentPane().add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, -1, -1));
        getContentPane().add(TxtBuscarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 319, -1));

        lblbuscar.setText("Buscar");
        lblbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 4, 1010, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
