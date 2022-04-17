/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class Vista_Pedidos extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Pedidos
     */
    public Vista_Pedidos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        txtIdClientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtServicio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnGuardar2 = new javax.swing.JButton();
        labelCount = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtPane_Dir = new javax.swing.JTextPane();
        cmbxServicios = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("Agregar");
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 207, -1, -1));

        btnEditar.setText("Editar");
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 207, -1, -1));

        btnEliminar.setText("Eliminar");
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 207, -1, -1));

        jLabel2.setText("ID Pedido:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setText("ID Cliente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));
        jPanel1.add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 72, -1));
        jPanel1.add(txtIdClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 87, -1));

        jLabel6.setText("Dirección:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setText("Pedidos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 11, -1, -1));

        jLabel8.setText("Ciente:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Nombre");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 87, -1));

        jLabel4.setText("Total:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel5.setText("Serrvicio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));
        jPanel1.add(TxtServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 40, -1));

        jLabel10.setText("Cantidad");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        btnGuardar2.setText("Guardar2");
        jPanel1.add(btnGuardar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        labelCount.setText("0");
        jPanel1.add(labelCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 20, 20));

        labelTotal.setText("0.0");
        jPanel1.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 40, 20));

        jScrollPane4.setViewportView(txtPane_Dir);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 180, 40));

        cmbxServicios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(cmbxServicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, 130, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 560, 230));

        btnEnviar.setText("Enviar");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(497, Short.MAX_VALUE)
                .addComponent(btnEnviar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(btnEnviar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 570, 20));

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaPedidos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 570, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Blancoceleste.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 680, 530));

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

    public JButton getBtnEditar() {
        return btnEditar;
    }

    public void setBtnEditar(JButton btnEditar) {
        this.btnEditar = btnEditar;
    }

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

    public JTextField getTxtServicio() {
        return TxtServicio;
    }

    public void setTxtServicio(JTextField TxtServicio) {
        this.TxtServicio = TxtServicio;
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtServicio;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnGuardar2;
    private javax.swing.JComboBox<String> cmbxServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelCount;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTextField txtIdClientes;
    private javax.swing.JTextField txtIdPedido;
    private javax.swing.JTextPane txtPane_Dir;
    // End of variables declaration//GEN-END:variables
}
