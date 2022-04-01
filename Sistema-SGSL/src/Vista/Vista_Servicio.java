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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areadescripcion = new javax.swing.JTextPane();
        DialogEmple = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblempleados = new javax.swing.JTable();
        ingreemple = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServicio = new javax.swing.JTable();
        BtnActualizarServicio = new javax.swing.JButton();
        TxtBuscarServicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BtnCrearServicio = new javax.swing.JButton();
        BtnEditarServicio = new javax.swing.JButton();
        BtnRemoverServicio = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        Dialog_Crear.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Descripción:");
        Dialog_Crear.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        txtidservicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtidservicio.setForeground(new java.awt.Color(51, 51, 255));
        txtidservicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Dialog_Crear.getContentPane().add(txtidservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 140, 25));

        txtnom_servicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Dialog_Crear.getContentPane().add(txtnom_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 140, 27));

        txtcosto_servicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Dialog_Crear.getContentPane().add(txtcosto_servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 140, 28));

        btnAceptar_pro1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptar_pro1.setForeground(new java.awt.Color(0, 102, 51));
        btnAceptar_pro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (2).png"))); // NOI18N
        btnAceptar_pro1.setText("ACEPTAR");
        btnAceptar_pro1.setBorder(null);
        btnAceptar_pro1.setContentAreaFilled(false);
        btnAceptar_pro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dialog_Crear.getContentPane().add(btnAceptar_pro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("Servicio");
        Dialog_Crear.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 11, 99, 32));

        btnCancelar_pro1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelar_pro1.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_pro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (1).png"))); // NOI18N
        btnCancelar_pro1.setText("CANCELAR");
        btnCancelar_pro1.setBorder(null);
        btnCancelar_pro1.setContentAreaFilled(false);
        btnCancelar_pro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dialog_Crear.getContentPane().add(btnCancelar_pro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("Id Servicio:");
        Dialog_Crear.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        descri_servicio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(descri_servicio);

        Dialog_Crear.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 260, 102));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Nombre:");
        Dialog_Crear.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Costo:");
        Dialog_Crear.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setText("Id Empleado:");
        Dialog_Crear.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        txtid_empleado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtid_empleado.setForeground(new java.awt.Color(51, 51, 255));
        txtid_empleado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Dialog_Crear.getContentPane().add(txtid_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 140, 29));

        btnveremple.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnveremple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-búsqueda-de-propiedad-45.png"))); // NOI18N
        btnveremple.setText("ver Empledo");
        btnveremple.setBorder(null);
        btnveremple.setContentAreaFilled(false);
        Dialog_Crear.getContentPane().add(btnveremple, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        LblNombreRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNombreRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblNombreRojo.setText("*");
        Dialog_Crear.getContentPane().add(LblNombreRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        LblDescripcionRojo1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblDescripcionRojo1.setForeground(new java.awt.Color(255, 0, 0));
        LblDescripcionRojo1.setText("*");
        Dialog_Crear.getContentPane().add(LblDescripcionRojo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        LblCostoRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCostoRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblCostoRojo.setText("*");
        Dialog_Crear.getContentPane().add(LblCostoRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/limpdia3.jpg"))); // NOI18N
        Dialog_Crear.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 470));

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

        jLabel5.setText("jLabel5");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 640, 270));

        BtnActualizarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-actualizar-escudo-48.png"))); // NOI18N
        BtnActualizarServicio.setText("Actualizar");
        BtnActualizarServicio.setBorder(null);
        BtnActualizarServicio.setContentAreaFilled(false);
        getContentPane().add(BtnActualizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 130, 70));
        getContentPane().add(TxtBuscarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 330, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-busca-mas-48.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, -1, -1));

        BtnCrearServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-servicio-de-limpieza-48.png"))); // NOI18N
        BtnCrearServicio.setText("Crear");
        BtnCrearServicio.setBorder(null);
        BtnCrearServicio.setContentAreaFilled(false);
        getContentPane().add(BtnCrearServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        BtnEditarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-servicio-de-limpieza-48 (2).png"))); // NOI18N
        BtnEditarServicio.setText("Editar");
        BtnEditarServicio.setBorder(null);
        BtnEditarServicio.setContentAreaFilled(false);
        getContentPane().add(BtnEditarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        BtnRemoverServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemoverServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-servicio-de-limpieza-48 (1).png"))); // NOI18N
        BtnRemoverServicio.setText("Remover");
        BtnRemoverServicio.setBorder(null);
        BtnRemoverServicio.setContentAreaFilled(false);
        getContentPane().add(BtnRemoverServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/tabla_eje1.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 280));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/SERVICAP22.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 320, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Blancoceleste.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, -6, 860, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarServicio;
    private javax.swing.JButton BtnCrearServicio;
    private javax.swing.JButton BtnEditarServicio;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
