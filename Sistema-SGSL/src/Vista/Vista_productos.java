package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author lorena
 */
public class Vista_productos extends javax.swing.JInternalFrame {
    
    public Vista_productos() {
        initComponents();
    }

    public JButton getBtnexaminar() {
        return btnexaminar;
    }

    public void setBtnexaminar(JButton btnexaminar) {
        this.btnexaminar = btnexaminar;
    }

    public JButton getBtnCrearServicio() {
        return BtnCrearServicio;
    }

    public void setBtnCrearServicio(JButton BtnCrearServicio) {
        this.BtnCrearServicio = BtnCrearServicio;
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

    public JTable getTblServicio() {
        return tblproduc;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JSpinner getSnipercanti() {
        return snipercanti;
    }

    public void setSnipercanti(JSpinner snipercanti) {
        this.snipercanti = snipercanti;
    }

    public JTable getTblproduc() {
        return tblproduc;
    }

    public void setTblproduc(JTable tblproduc) {
        this.tblproduc = tblproduc;
    }

    public JLabel getTxtfoto() {
        return txtfoto;
    }

    public void setTxtfoto(JLabel txtfoto) {
        this.txtfoto = txtfoto;
    }

    public JTextField getTxtidbodega() {
        return txtidbodega;
    }

    public void setTxtidbodega(JTextField txtidbodega) {
        this.txtidbodega = txtidbodega;
    }

    public JTextField getTxtidproducto() {
        return txtidproducto;
    }

    public void setTxtidproducto(JTextField txtidproducto) {
        this.txtidproducto = txtidproducto;
    }

    public JTextField getTxtmarca() {
        return txtmarca;
    }

    public void setTxtmarca(JTextField txtmarca) {
        this.txtmarca = txtmarca;
    }

    public JTextField getTxtnom_pro() {
        return txtnom_pro;
    }

    public void setTxtnom_pro(JTextField txtnom_pro) {
        this.txtnom_pro = txtnom_pro;
    }

    public JTextField getTxtpreciopro() {
        return txtpreciopro;
    }

    public void setTxtpreciopro(JTextField txtpreciopro) {
        this.txtpreciopro = txtpreciopro;
    }

    public void setTblServicio(JTable tblServicio) {
        this.tblproduc = tblServicio;
    }

    public JTextField getTxtcosto_servicio() {
        return txtpreciopro;
    }

    public void setTxtcosto_servicio(JTextField txtcosto_servicio) {
        this.txtpreciopro = txtcosto_servicio;
    }

    public JTextField getTxtid_empleado() {
        return txtid_empleado;
    }

    public void setTxtid_empleado(JTextField txtid_empleado) {
        this.txtid_empleado = txtid_empleado;
    }

    public JTextField getTxtidservicio() {
        return txtidproducto;
    }

    public void setTxtidservicio(JTextField txtidservicio) {
        this.txtidproducto = txtidservicio;
    }

    public JTextField getTxtnom_servicio() {
        return txtnom_pro;
    }

    public void setTxtnom_servicio(JTextField txtnom_servicio) {
        this.txtnom_pro = txtnom_servicio;
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog_Crear = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        txtidproducto = new javax.swing.JTextField();
        txtnom_pro = new javax.swing.JTextField();
        txtpreciopro = new javax.swing.JTextField();
        btnAceptar_pro1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar_pro1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtid_empleado = new javax.swing.JTextField();
        snipercanti = new javax.swing.JSpinner();
        txtmarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtidbodega = new javax.swing.JTextField();
        txtfoto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnexaminar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areadescripcion = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscarServicio = new javax.swing.JTextField();
        BtnCrearServicio = new javax.swing.JButton();
        BtnEditarServicio = new javax.swing.JButton();
        BtnRemoverServicio = new javax.swing.JButton();
        BtnImprimirServicio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproduc = new javax.swing.JTable();
        BtnActualizarServicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        Dialog_Crear.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Cantidad:");
        Dialog_Crear.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 168, -1, -1));
        Dialog_Crear.getContentPane().add(txtidproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 64, 140, -1));
        Dialog_Crear.getContentPane().add(txtnom_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 116, 140, -1));
        Dialog_Crear.getContentPane().add(txtpreciopro, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 140, -1));

        btnAceptar_pro1.setText("Guardar");
        Dialog_Crear.getContentPane().add(btnAceptar_pro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setText("PRODUCTO");
        Dialog_Crear.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 26, 158, 32));

        btnCancelar_pro1.setText("CANCELAR");
        Dialog_Crear.getContentPane().add(btnCancelar_pro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, -1));

        jLabel10.setText("Id Producto:");
        Dialog_Crear.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, -1, -1));

        jLabel11.setText("Nombre:");
        Dialog_Crear.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, -1, -1));

        jLabel12.setText("PRECIO:");
        Dialog_Crear.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 248, -1, -1));

        jLabel13.setText("Id Empleado:");
        Dialog_Crear.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 30));
        Dialog_Crear.getContentPane().add(txtid_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 140, -1));
        Dialog_Crear.getContentPane().add(snipercanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 163, 88, -1));
        Dialog_Crear.getContentPane().add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 207, 141, -1));

        jLabel3.setText("Marca:");
        Dialog_Crear.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 211, -1, -1));

        jLabel14.setText("Id Bodega:");
        Dialog_Crear.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 326, -1, 30));
        Dialog_Crear.getContentPane().add(txtidbodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 140, -1));

        txtfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Dialog_Crear.getContentPane().add(txtfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 234, 194));

        jLabel5.setText("FOTO");
        Dialog_Crear.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        btnexaminar.setText("Examinar");
        Dialog_Crear.getContentPane().add(btnexaminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jScrollPane3.setViewportView(areadescripcion);

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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, -1));

        tblproduc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id producto", "Nombre", "Precio", "Cantidad", "Marca", "Foto", "id_empleado", "id_bodega"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblproduc);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 824, 257));

        BtnActualizarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizarServicio.setText("Actualizar");
        getContentPane().add(BtnActualizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel2.setText("PRODUCTOS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarServicio;
    private javax.swing.JButton BtnCrearServicio;
    private javax.swing.JButton BtnEditarServicio;
    private javax.swing.JButton BtnImprimirServicio;
    private javax.swing.JButton BtnRemoverServicio;
    private javax.swing.JDialog Dialog_Crear;
    private javax.swing.JTextField TxtBuscarServicio;
    private javax.swing.JTextPane areadescripcion;
    private javax.swing.JButton btnAceptar_pro1;
    private javax.swing.JButton btnCancelar_pro1;
    private javax.swing.JButton btnexaminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner snipercanti;
    private javax.swing.JTable tblproduc;
    private javax.swing.JLabel txtfoto;
    private javax.swing.JTextField txtid_empleado;
    private javax.swing.JTextField txtidbodega;
    private javax.swing.JTextField txtidproducto;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnom_pro;
    private javax.swing.JTextField txtpreciopro;
    // End of variables declaration//GEN-END:variables
}
