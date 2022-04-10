package Vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
public class Vista_bodega extends javax.swing.JInternalFrame {
    //SE CREA LOS GETTER Y SETTER  
    public Vista_bodega() {
        initComponents();
    }

    public JLabel getTxtfechahoy() {
        return txtfechahoy;
    }

    public JSpinner getjSpinnercant() {
        return jSpinnercant;
    }

    public void setjSpinnercant(JSpinner jSpinnercant) {
        this.jSpinnercant = jSpinnercant;
    }

    public JSpinner getSpinerespacio() {
        return spinerespacio;
    }

    public void setSpinerespacio(JSpinner spinerespacio) {
        this.spinerespacio = spinerespacio;
    }

    public JSpinner getSpinernum() {
        return spinernum;
    }

    public void setSpinernum(JSpinner spinernum) {
        this.spinernum = spinernum;
    }
    

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getTxtfecha() {
        return txtfecha;
    }

    public void setTxtfecha(JLabel txtfecha) {
        this.txtfecha = txtfecha;
    }

    public void setTxtfechahoy(JLabel txtfechahoy) {
        this.txtfechahoy = txtfechahoy;
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
    public JButton getBtnRemoverServicio() {
        return BtnRemoverServicio;
    }

    public void setBtnRemoverServicio(JButton BtnRemoverServicio) {
        this.BtnRemoverServicio = BtnRemoverServicio;
    }

    public JDialog getDialog_Crearbo() {
        return Dialog_Crearbo;
    }

    public void setDialog_Crearbo(JDialog Dialog_Crearbo) {
        this.Dialog_Crearbo = Dialog_Crearbo;
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
    public JTable getTABLABODEGA() {
        return TABLABODEGA;
    }

    public void setTABLABODEGA(JTable TABLABODEGA) {
        this.TABLABODEGA = TABLABODEGA;
    }

    public JTextField getTxtidbodega() {
        return txtidbodega;
    }

    public void setTxtidbodega(JTextField txtidbodega) {
        this.txtidbodega = txtidbodega;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog_Crearbo = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        btnAceptar_pro1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnCancelar_pro1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JLabel();
        txtidbodega = new javax.swing.JTextField();
        spinernum = new javax.swing.JSpinner();
        jSpinnercant = new javax.swing.JSpinner();
        spinerespacio = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areadescripcion = new javax.swing.JTextPane();
        jSpinner1 = new javax.swing.JSpinner();
        BtnActualizarServicio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TxtBuscarServicio1 = new javax.swing.JTextField();
        BtnCrearServicio1 = new javax.swing.JButton();
        BtnEditarServicio1 = new javax.swing.JButton();
        BtnRemoverServicio1 = new javax.swing.JButton();
        BtnImprimirServicio1 = new javax.swing.JButton();
        BtnActualizarServicio1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablita1 = new javax.swing.JTable();
        txtfechahoy = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLABODEGA = new javax.swing.JTable();
        BtnCrearServicio = new javax.swing.JButton();
        BtnEditarServicio = new javax.swing.JButton();
        BtnRemoverServicio = new javax.swing.JButton();
        TxtBuscarServicio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        Dialog_Crearbo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Cantidad:");
        Dialog_Crearbo.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, 40));

        btnAceptar_pro1.setForeground(new java.awt.Color(0, 102, 51));
        btnAceptar_pro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (2).png"))); // NOI18N
        btnAceptar_pro1.setText("Guardar");
        btnAceptar_pro1.setToolTipText("Guardar");
        btnAceptar_pro1.setBorder(null);
        btnAceptar_pro1.setContentAreaFilled(false);
        btnAceptar_pro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dialog_Crearbo.getContentPane().add(btnAceptar_pro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, 80, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("BODEGA");
        Dialog_Crearbo.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 158, 32));

        btnCancelar_pro1.setForeground(new java.awt.Color(153, 0, 0));
        btnCancelar_pro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (1).png"))); // NOI18N
        btnCancelar_pro1.setText("CANCELAR");
        btnCancelar_pro1.setBorder(null);
        btnCancelar_pro1.setContentAreaFilled(false);
        btnCancelar_pro1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Dialog_Crearbo.getContentPane().add(btnCancelar_pro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 80, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Id bodega:");
        Dialog_Crearbo.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("Numero:");
        Dialog_Crearbo.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Espacio:");
        Dialog_Crearbo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 40));
        Dialog_Crearbo.getContentPane().add(txtfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 110, 30));

        txtidbodega.setBorder(null);
        Dialog_Crearbo.getContentPane().add(txtidbodega, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 50, 30));

        spinernum.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Dialog_Crearbo.getContentPane().add(spinernum, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 100, 40));

        jSpinnercant.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        Dialog_Crearbo.getContentPane().add(jSpinnercant, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 100, 40));

        spinerespacio.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        Dialog_Crearbo.getContentPane().add(spinerespacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 100, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/dialogolimpiezaachoproductos.jpg"))); // NOI18N
        Dialog_Crearbo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        jScrollPane3.setViewportView(areadescripcion);

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnActualizarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizarServicio.setForeground(new java.awt.Color(0, 0, 0));
        BtnActualizarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-actualizar-48.png"))); // NOI18N
        BtnActualizarServicio.setText("Actualizar");
        BtnActualizarServicio.setToolTipText("Actualizar");
        BtnActualizarServicio.setBorder(null);
        BtnActualizarServicio.setContentAreaFilled(false);
        getContentPane().add(BtnActualizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("BODEGAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 260, 30));

        jInternalFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Buscar");

        BtnCrearServicio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearServicio1.setText("Crear");

        BtnEditarServicio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditarServicio1.setText("Editar");

        BtnRemoverServicio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemoverServicio1.setText("Remover");

        BtnImprimirServicio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnImprimirServicio1.setText("Imprimir");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TxtBuscarServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BtnCrearServicio1)
                .addGap(33, 33, 33)
                .addComponent(BtnEditarServicio1)
                .addGap(34, 34, 34)
                .addComponent(BtnRemoverServicio1)
                .addGap(46, 46, 46)
                .addComponent(BtnImprimirServicio1)
                .addGap(194, 194, 194))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnImprimirServicio1)
                    .addComponent(BtnRemoverServicio1)
                    .addComponent(BtnEditarServicio1)
                    .addComponent(BtnCrearServicio1)
                    .addComponent(TxtBuscarServicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19))
        );

        jInternalFrame1.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 840, -1));

        BtnActualizarServicio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnActualizarServicio1.setText("Actualizar");
        jInternalFrame1.getContentPane().add(BtnActualizarServicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 3, 36)); // NOI18N
        jLabel6.setText("PRODUCTOS");
        jInternalFrame1.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 260, 30));

        tablita1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PRODUCTOS", "NOMBRE", "PRECIO", "CANTIDAD", "MARCA ", "FOTO", "ID_Empleafo", "ID_BODEGA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tablita1);

        jInternalFrame1.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 850, 270));

        getContentPane().add(jInternalFrame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(txtfechahoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 110, 20));

        TABLABODEGA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NUMERO", "CANTIDAD", "ESPACIO"
            }
        ));
        jScrollPane1.setViewportView(TABLABODEGA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 770, 270));

        BtnCrearServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearServicio.setForeground(new java.awt.Color(0, 0, 0));
        BtnCrearServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-agregar bodega-propiedad-48 (1).png"))); // NOI18N
        BtnCrearServicio.setText("Crear");
        BtnCrearServicio.setBorder(null);
        BtnCrearServicio.setContentAreaFilled(false);
        getContentPane().add(BtnCrearServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 212, 100, -1));

        BtnEditarServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditarServicio.setForeground(new java.awt.Color(0, 0, 0));
        BtnEditarServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-editar-bodeaspropiedad-48.png"))); // NOI18N
        BtnEditarServicio.setText("Editar");
        BtnEditarServicio.setToolTipText("Editar");
        BtnEditarServicio.setBorder(null);
        BtnEditarServicio.setContentAreaFilled(false);
        getContentPane().add(BtnEditarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 100, 50));

        BtnRemoverServicio.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemoverServicio.setForeground(new java.awt.Color(0, 0, 0));
        BtnRemoverServicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-eliminar-bodega-propiedad-48 (1).png"))); // NOI18N
        BtnRemoverServicio.setText("Eliminar");
        BtnRemoverServicio.setToolTipText("Eliminar");
        BtnRemoverServicio.setBorder(null);
        BtnRemoverServicio.setContentAreaFilled(false);
        getContentPane().add(BtnRemoverServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 110, 50));
        getContentPane().add(TxtBuscarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 144, 319, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-busca-mas-48.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 70, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Servicios_Logo_180.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 190, 190));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Imagen4F.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 180, 280));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Blancoceleste.jpg"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizarServicio;
    private javax.swing.JButton BtnActualizarServicio1;
    private javax.swing.JButton BtnCrearServicio;
    private javax.swing.JButton BtnCrearServicio1;
    private javax.swing.JButton BtnEditarServicio;
    private javax.swing.JButton BtnEditarServicio1;
    private javax.swing.JButton BtnImprimirServicio1;
    private javax.swing.JButton BtnRemoverServicio;
    private javax.swing.JButton BtnRemoverServicio1;
    private javax.swing.JDialog Dialog_Crearbo;
    private javax.swing.JTable TABLABODEGA;
    private javax.swing.JTextField TxtBuscarServicio;
    private javax.swing.JTextField TxtBuscarServicio1;
    private javax.swing.JTextPane areadescripcion;
    private javax.swing.JButton btnAceptar_pro1;
    private javax.swing.JButton btnCancelar_pro1;
    private javax.swing.JInternalFrame jInternalFrame1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinnercant;
    private javax.swing.JSpinner spinerespacio;
    private javax.swing.JSpinner spinernum;
    private javax.swing.JTable tablita1;
    private javax.swing.JLabel txtfecha;
    private javax.swing.JLabel txtfechahoy;
    private javax.swing.JTextField txtidbodega;
    // End of variables declaration//GEN-END:variables
}
