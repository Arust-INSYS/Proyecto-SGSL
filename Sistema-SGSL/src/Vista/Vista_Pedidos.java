/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author HP
 */
public class Vista_Pedidos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vista_Pedidos
     */
    public Vista_Pedidos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgpersona = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_buscar_cli = new javax.swing.JTable();
        txt_buscarCli = new javax.swing.JTextField();
        btnCargar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        txtIdClientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        label_Cliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtServicio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        labelCount = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPane_Dir = new javax.swing.JTextPane();
        cmbxServicios = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        btnGuardar2 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        dlgpersona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_buscar_cli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_cliente", "Nombre", "Apellido"
            }
        ));
        jScrollPane2.setViewportView(tbl_buscar_cli);

        dlgpersona.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 370, 260));
        dlgpersona.getContentPane().add(txt_buscarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 240, -1));

        btnCargar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/cargar (2).png"))); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.setBorder(null);
        btnCargar.setContentAreaFilled(false);
        dlgpersona.getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/AfondoClientes.jpg"))); // NOI18N
        dlgpersona.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 440, 450));

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(191, 222, 236));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("ID Pedido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("ID Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 60, -1));
        jPanel1.add(txtIdClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Direcci??n:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Pedidos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Ciente:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-eliminar-user-group-man-man-30(1).png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setContentAreaFilled(false);
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        label_Cliente.setText("Nombre");
        jPanel1.add(label_Cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Total:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Serrvicio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));
        jPanel1.add(TxtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 40, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Cantidad:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, 20));

        labelCount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelCount.setText("0");
        jPanel1.add(labelCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 20, 20));

        labelTotal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTotal.setText("0.0");
        jPanel1.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 40, 20));

        jScrollPane4.setViewportView(txtPane_Dir);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 180, 40));

        cmbxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select" }));
        jPanel1.add(cmbxServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 680, -1));

        jPanel4.setBackground(new java.awt.Color(191, 222, 236));

        btnEnviar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/enviar.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(null);
        btnEnviar.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnEnviar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, 680, 30));

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPedidos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 501, 177));

        btnGuardar2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/guardar.png"))); // NOI18N
        btnGuardar2.setText("Guardar");
        btnGuardar2.setBorder(null);
        btnGuardar2.setContentAreaFilled(false);
        getContentPane().add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/remover.png"))); // NOI18N
        btnEliminar.setText("Remover");
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, -1, -1));

        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/agregar.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setBorder(null);
        btnAgregar.setContentAreaFilled(false);
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/tabla_eje1.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 280));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Blancoceleste.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 800, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    public JButton getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(JButton btnActualizar) {
        this.btnEnviar = btnActualizar;
    }

    public JButton getBtnCrear() {
        return btnAgregar;
    }

    public void setBtnCrear(JButton btnCrear) {
        this.btnAgregar = btnCrear;
    }

//    public JButton getBtnCancelar() {
//        return btnCancelar;
//    }
//
//    public void setBtnCancelar(JButton btnCancelar) {
//        this.btnCancelar = btnCancelar;
//    }

    

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnAgregar() {
        return btnAgregar;
    }

    public void setBtnAgregar(JButton btnAgregar) {
        this.btnAgregar = btnAgregar;
    }


 public JTable getTablaPedidos() {
        return tablaPedidos;
    }

    public void setTablaPedidos(JTable tablaPedidos) {
        this.tablaPedidos = tablaPedidos;
    }

    public JTextPane getTxtPane_Dir() {
        return txtPane_Dir;
    }

    public void setTxtPane_Dir(JTextPane txtPane_Dir) {
        this.txtPane_Dir = txtPane_Dir;
    }

    

    public JTextField getTxtIdClientes() {
        return txtIdClientes;
    }

    public void setTxtIdClientes(JTextField txtIdClientes) {
        this.txtIdClientes = txtIdClientes;
    }

    public JTextField getTxtIdPedido() {
        return txtIdPedido;
    }

    public void setTxtIdPedido(JTextField txtIdPedido) {
        this.txtIdPedido = txtIdPedido;
    }

    ///SERVICIOS
    public JTextField getTxtServicio() {
        return TxtServicio;
    }

    public void setTxtServicio(JTextField TxtServicio) {
        this.TxtServicio = TxtServicio;
    }

    public JComboBox<String> getCmbxServicios() {
        return cmbxServicios;
    }

    public void setCmbxServicios(JComboBox<String> cmbxServicios) {
        this.cmbxServicios = cmbxServicios;
    }
    
    
    

    public JLabel getLabelCount() {
        return labelCount;
    }

    public void setLabelCount(JLabel labelCount) {
        this.labelCount = labelCount;
    }

    public JLabel getLabelTotal() {
        return labelTotal;
    }

    public void setLabelTotal(JLabel labelTotal) {
        this.labelTotal = labelTotal;
    }

    

    public JButton getBtnGuardar2() {
        return btnGuardar2;
    }

    public void setBtnGuardar2(JButton btnGuardar2) {
        this.btnGuardar2 = btnGuardar2;
    }

    public JLabel getLabel_Cliente() {
        return label_Cliente;
    }

    public void setLabel_Cliente(JLabel label_Cliente) {
        this.label_Cliente = label_Cliente;
    }
    
    ///VISTA DLG_CLIENTE
    
    public JDialog getDlgpersona() {
        return dlgpersona;
    }

    public void setDlgpersona(JDialog dlgpersona) {
        this.dlgpersona = dlgpersona;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }

    public void setBtnBuscar(JButton btnBuscar) {
        this.btnBuscar = btnBuscar;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JTable getTbl_buscar_cli() {
        return tbl_buscar_cli;
    }

    public void setTbl_buscar_cli(JTable tbl_buscar_cli) {
        this.tbl_buscar_cli = tbl_buscar_cli;
    }

    public JTextField getTxt_buscarCli() {
        return txt_buscarCli;
    }

    public void setTxt_buscarCli(JTextField txt_buscarCli) {
        this.txt_buscarCli = txt_buscarCli;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtServicio;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JComboBox<String> cmbxServicios;
    private javax.swing.JDialog dlgpersona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCount;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel label_Cliente;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tbl_buscar_cli;
    private javax.swing.JTextField txtIdClientes;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextPane txtPane_Dir;
    private javax.swing.JTextField txt_buscarCli;
    // End of variables declaration//GEN-END:variables
}
