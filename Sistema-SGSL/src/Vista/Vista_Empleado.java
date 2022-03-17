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

    public JDesktopPane getDestokpersona() {
        return destokpersona;
    }

    public void setDestokpersona(JDesktopPane destokpersona) {
        this.destokpersona = destokpersona;
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

    
    
    public void setBtnCrear(JButton BtnCrear) {
        this.BtnCrear = BtnCrear;
    }

    public JButton getBtnEditar() {
        return BtnEditar;
    }

    public void setBtnEditar(JButton BtnEditar) {
        this.BtnEditar = BtnEditar;
    }

    public JButton getBtnImprimir() {
        return BtnImprimir;
    }

    public void setBtnImprimir(JButton BtnImprimir) {
        this.BtnImprimir = BtnImprimir;
    }

    public JButton getBtnRemover() {
        return BtnRemover;
    }

    public void setBtnRemover(JButton BtnRemover) {
        this.BtnRemover = BtnRemover;
    }

    public JTextField getTxtBuscarServicio() {
        return TxtBuscarServicio;
    }

    public void setTxtBuscarServicio(JTextField TxtBuscarServicio) {
        this.TxtBuscarServicio = TxtBuscarServicio;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
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
        destokpersona = new javax.swing.JDesktopPane();
        verper = new javax.swing.JButton();
        boxrol = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        DialogPersona = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btningresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscarServicio = new javax.swing.JTextField();
        BtnCrear = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnRemover = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmpleado = new javax.swing.JTable();
        BtnActualizar = new javax.swing.JButton();

        btnAceptar.setText("ACEPTAR");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Empleado");

        btnCancelar.setText("CANCELAR");

        jLabel10.setText("Id Empleado:");

        jLabel11.setText("Sueldo:");

        jLabel8.setText("Estado Civil:");

        jLabel12.setText("Fecha de contratación:");

        jLabel13.setText("Id Persona:");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Soltero", "Casado", "Divorciado", " ", " " }));

        contratacion.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout destokpersonaLayout = new javax.swing.GroupLayout(destokpersona);
        destokpersona.setLayout(destokpersonaLayout);
        destokpersonaLayout.setHorizontalGroup(
            destokpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );
        destokpersonaLayout.setVerticalGroup(
            destokpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        verper.setText("Ver Persona");

        boxrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Empleado", "Administrador" }));
        boxrol.setToolTipText("");

        jLabel3.setText("Rol:");

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
                                .addComponent(verper)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(destokpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DialogEmpleadoLayout.setVerticalGroup(
            DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(destokpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DialogEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtsueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(contratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(verper))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxrol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(58, 58, 58)
                        .addGroup(DialogEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnAceptar))))
                .addContainerGap(73, Short.MAX_VALUE))
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

        jLabel1.setText("Buscar");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnCrear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrear.setText("Crear");

        BtnEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditar.setText("Editar");

        BtnRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemover.setText("Remover");

        BtnImprimir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnImprimir.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BtnCrear)
                .addGap(33, 33, 33)
                .addComponent(BtnEditar)
                .addGap(34, 34, 34)
                .addComponent(BtnRemover)
                .addGap(46, 46, 46)
                .addComponent(BtnImprimir)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnImprimir)
                    .addComponent(BtnRemover)
                    .addComponent(BtnEditar)
                    .addComponent(BtnCrear)
                    .addComponent(TxtBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );

        tblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Empleado", "Sueldo", "Estado civil", "Fecha contrato", "Id Persona"
            }
        ));
        jScrollPane1.setViewportView(tblEmpleado);

        BtnActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizar.setText("Actualizar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnActualizar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(BtnActualizar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnCrear;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton BtnRemover;
    private javax.swing.JDialog DialogEmpleado;
    private javax.swing.JDialog DialogPersona;
    private javax.swing.JTextField TxtBuscarServicio;
    private javax.swing.JComboBox<String> boxEstado;
    private javax.swing.JComboBox<String> boxrol;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btningresar;
    private com.toedter.calendar.JDateChooser contratacion;
    private javax.swing.JDesktopPane destokpersona;
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
    private javax.swing.JTable tblEmpleado;
    private javax.swing.JTable tblPersonas;
    private javax.swing.JTextField txtid_persona;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtsueldo;
    private javax.swing.JButton verper;
    // End of variables declaration//GEN-END:variables
}
