/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author lorena
 */
public class Vista_Servicio extends javax.swing.JInternalFrame {
    
    public Vista_Servicio() {
        initComponents();
    }

    public JButton getBtnCrearServicio() {
        return BtnCrearServicio;
    }

    public void setBtnCrearServicio(JButton BtnCrearServicio) {
        this.BtnCrearServicio = BtnCrearServicio;
    }


    public JLabel getLblCostoRojo() {
        return LblCostoRojo;
    }

    public void setLblCostoRojo(JLabel LblCostoRojo) {
        this.LblCostoRojo = LblCostoRojo;
    }

    public JLabel getLblDescripcionRojo1() {
        return LblDescripcionRojo1;
    }

    public void setLblDescripcionRojo1(JLabel LblDescripcionRojo1) {
        this.LblDescripcionRojo1 = LblDescripcionRojo1;
    }

    public JLabel getLblNombreRojo() {
        return LblNombreRojo;
    }

    public void setLblNombreRojo(JLabel LblNombreRojo) {
        this.LblNombreRojo = LblNombreRojo;
    }
    
    
    public JDialog getDialogEmple() {
        return DialogEmple;
    }

    public void setDialogEmple(JDialog DialogEmple) {
        this.DialogEmple = DialogEmple;
    }

    public JButton getIngreemple() {
        return ingreemple;
    }

    public void setIngreemple(JButton ingreemple) {
        this.ingreemple = ingreemple;
    }

    public JTable getTblempleados() {
        return tblempleados;
    }

    public void setTblempleados(JTable tblempleados) {
        this.tblempleados = tblempleados;
    }
    

    public JButton getBtnEditarServicio() {
        return BtnEditarServicio;
    }

    public void setBtnEditarServicio(JButton BtnEditarServicio) {
        this.BtnEditarServicio = BtnEditarServicio;
    }

    public JButton getBtnImprimirServicio() {
        return BtnImprimirServicio;
    }

    public void setBtnImprimirServicio(JButton BtnImprimirServicio) {
        this.BtnImprimirServicio = BtnImprimirServicio;
    }

    public JButton getBtnRemoverServicio() {
        return BtnRemoverServicio;
    }

    public void setBtnRemoverServicio(JButton BtnRemoverServicio) {
        this.BtnRemoverServicio = BtnRemoverServicio;
    }

    public JDialog getDialog_Crear() {
        return Dialog_Crear;
    }

    public void setDialog_Crear(JDialog Dialog_Crear) {
        this.Dialog_Crear = Dialog_Crear;
    }

    public JTextField getTxtBuscarServicio() {
        return TxtBuscarServicio;
    }

    public void setTxtBuscarServicio(JTextField TxtBuscarServicio) {
        this.TxtBuscarServicio = TxtBuscarServicio;
    }

    public JTextPane getAreadescripcion() {
        return areadescripcion;
    }

    public JButton getBtnActualizarServicio() {
        return BtnActualizarServicio;
    }

    public void setBtnActualizarServicio(JButton BtnActualizarServicio) {
        this.BtnActualizarServicio = BtnActualizarServicio;
    }
    

    public void setAreadescripcion(JTextPane areadescripcion) {
        this.areadescripcion = areadescripcion;
    }

    public JButton getBtnAceptar_pro1() {
        return btnAceptar_pro1;
    }

    public void setBtnAceptar_pro1(JButton btnAceptar_pro1) {
        this.btnAceptar_pro1 = btnAceptar_pro1;
    }

    public JButton getBtnCancelar_pro1() {
        return btnCancelar_pro1;
    }

    public void setBtnCancelar_pro1(JButton btnCancelar_pro1) {
        this.btnCancelar_pro1 = btnCancelar_pro1;
    }

    public JTextPane getDescri_servicio() {
        return descri_servicio;
    }

    public void setDescri_servicio(JTextPane descri_servicio) {
        this.descri_servicio = descri_servicio;
    }

    public JTable getTblServicio() {
        return tblServicio;
    }

    public void setTblServicio(JTable tblServicio) {
        this.tblServicio = tblServicio;
    }

    public JTextField getTxtcosto_servicio() {
        return txtcosto_servicio;
    }

    public void setTxtcosto_servicio(JTextField txtcosto_servicio) {
        this.txtcosto_servicio = txtcosto_servicio;
    }

    public JTextField getTxtid_empleado() {
        return txtid_empleado;
    }

    public void setTxtid_empleado(JTextField txtid_empleado) {
        this.txtid_empleado = txtid_empleado;
    }

    public JTextField getTxtidservicio() {
        return txtidservicio;
    }

    public void setTxtidservicio(JTextField txtidservicio) {
        this.txtidservicio = txtidservicio;
    }

    public JTextField getTxtnom_servicio() {
        return txtnom_servicio;
    }

    public void setTxtnom_servicio(JTextField txtnom_servicio) {
        this.txtnom_servicio = txtnom_servicio;
    }

    public JButton getBtnveremple() {
        return btnveremple;
    }

    public void setBtnveremple(JButton btnveremple) {
        this.btnveremple = btnveremple;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog_Crear = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        txtidservicio = new javax.swing.JTextField();
        txtnom_servicio = new javax.swing.JTextField();
        txtcosto_servicio = new javax.swing.JTextField();
        btnAceptar_pro1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar_pro1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        descri_servicio = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtid_empleado = new javax.swing.JTextField();
        btnveremple = new javax.swing.JButton();
        LblNombreRojo = new javax.swing.JLabel();
        LblDescripcionRojo1 = new javax.swing.JLabel();
        LblCostoRojo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areadescripcion = new javax.swing.JTextPane();
        DialogEmple = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblempleados = new javax.swing.JTable();
        ingreemple = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscarServicio = new javax.swing.JTextField();
        BtnCrearServicio = new javax.swing.JButton();
        BtnEditarServicio = new javax.swing.JButton();
        BtnRemoverServicio = new javax.swing.JButton();
        BtnImprimirServicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        BtnActualizarServicio = new javax.swing.JButton();

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Descripción:");

        txtidservicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtidservicio.setForeground(new java.awt.Color(51, 51, 255));
        txtidservicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtnom_servicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtcosto_servicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAceptar_pro1.setText("ACEPTAR");

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("Servicio");

        btnCancelar_pro1.setText("CANCELAR");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Id Servicio:");

        descri_servicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(descri_servicio);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Costo:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Id Empleado:");

        txtid_empleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtid_empleado.setForeground(new java.awt.Color(51, 51, 255));
        txtid_empleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnveremple.setText("ver Empledo");

        LblNombreRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNombreRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblNombreRojo.setText("*");

        LblDescripcionRojo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblDescripcionRojo1.setForeground(new java.awt.Color(255, 0, 0));
        LblDescripcionRojo1.setText("*");

        LblCostoRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCostoRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblCostoRojo.setText("*");

        javax.swing.GroupLayout Dialog_CrearLayout = new javax.swing.GroupLayout(Dialog_Crear.getContentPane());
        Dialog_Crear.getContentPane().setLayout(Dialog_CrearLayout);
        Dialog_CrearLayout.setHorizontalGroup(
            Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dialog_CrearLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(Dialog_CrearLayout.createSequentialGroup()
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dialog_CrearLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Dialog_CrearLayout.createSequentialGroup()
                                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Dialog_CrearLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnom_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Dialog_CrearLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtidservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(LblNombreRojo))
                            .addComponent(jLabel12)
                            .addGroup(Dialog_CrearLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtid_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnveremple))))
                    .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(Dialog_CrearLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(btnAceptar_pro1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar_pro1))
                        .addGroup(Dialog_CrearLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Dialog_CrearLayout.createSequentialGroup()
                                    .addComponent(txtcosto_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(LblCostoRojo))
                                .addGroup(Dialog_CrearLayout.createSequentialGroup()
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(LblDescripcionRojo1))))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        Dialog_CrearLayout.setVerticalGroup(
            Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dialog_CrearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtidservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom_servicio, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addComponent(LblNombreRojo))
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Dialog_CrearLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8))
                    .addGroup(Dialog_CrearLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Dialog_CrearLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(LblDescripcionRojo1)))
                .addGap(20, 20, 20)
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtcosto_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCostoRojo))
                .addGap(20, 20, 20)
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtid_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnveremple))
                .addGap(98, 98, 98)
                .addGroup(Dialog_CrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar_pro1)
                    .addComponent(btnCancelar_pro1))
                .addGap(52, 52, 52))
        );

        jScrollPane3.setViewportView(areadescripcion);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Empleado");

        tblempleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Empleado", "Estado civil", "Fecha de contratación"
            }
        ));
        jScrollPane2.setViewportView(tblempleados);

        ingreemple.setText("Ingre");

        javax.swing.GroupLayout DialogEmpleLayout = new javax.swing.GroupLayout(DialogEmple.getContentPane());
        DialogEmple.getContentPane().setLayout(DialogEmpleLayout);
        DialogEmpleLayout.setHorizontalGroup(
            DialogEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEmpleLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(DialogEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogEmpleLayout.createSequentialGroup()
                        .addComponent(ingreemple)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        DialogEmpleLayout.setVerticalGroup(
            DialogEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogEmpleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogEmpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ingreemple))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Buscar");

        BtnCrearServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearServicio.setText("Crear");

        BtnEditarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditarServicio.setText("Editar");

        BtnRemoverServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemoverServicio.setText("Remover");

        BtnImprimirServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnImprimirServicio.setText("Imprimir");

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
                .addComponent(BtnCrearServicio)
                .addGap(33, 33, 33)
                .addComponent(BtnEditarServicio)
                .addGap(34, 34, 34)
                .addComponent(BtnRemoverServicio)
                .addGap(46, 46, 46)
                .addComponent(BtnImprimirServicio)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnImprimirServicio)
                    .addComponent(BtnRemoverServicio)
                    .addComponent(BtnEditarServicio)
                    .addComponent(BtnCrearServicio)
                    .addComponent(TxtBuscarServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 840, -1));

        tblServicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Servicio", "Nombre", "Descripción", "Costo", "Id empleado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblServicio);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 824, 257));

        BtnActualizarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizarServicio.setText("Actualizar");
        getContentPane().add(BtnActualizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarServicio;
    private javax.swing.JButton BtnCrearServicio;
    private javax.swing.JButton BtnEditarServicio;
    private javax.swing.JButton BtnImprimirServicio;
    private javax.swing.JButton BtnRemoverServicio;
    private javax.swing.JDialog DialogEmple;
    private javax.swing.JDialog Dialog_Crear;
    private javax.swing.JLabel LblCostoRojo;
    private javax.swing.JLabel LblDescripcionRojo1;
    private javax.swing.JLabel LblNombreRojo;
    private javax.swing.JTextField TxtBuscarServicio;
    private javax.swing.JTextPane areadescripcion;
    private javax.swing.JButton btnAceptar_pro1;
    private javax.swing.JButton btnCancelar_pro1;
    private javax.swing.JButton btnveremple;
    private javax.swing.JTextPane descri_servicio;
    private javax.swing.JButton ingreemple;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblServicio;
    private javax.swing.JTable tblempleados;
    private javax.swing.JTextField txtcosto_servicio;
    private javax.swing.JTextField txtid_empleado;
    private javax.swing.JTextField txtidservicio;
    private javax.swing.JTextField txtnom_servicio;
    // End of variables declaration//GEN-END:variables
}
