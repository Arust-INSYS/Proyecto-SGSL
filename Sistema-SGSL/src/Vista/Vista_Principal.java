/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Arust
 */
public class Vista_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Principal
     */
    public Vista_Principal() {
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

        jToolBar1 = new javax.swing.JToolBar();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        jSeparator9 = new javax.swing.JToolBar.Separator();
        subMenu_Persona = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        subMenu_servicios = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        submenu_Pedidos = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        jSeparator17 = new javax.swing.JToolBar.Separator();
        sub_menupro = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        jSeparator19 = new javax.swing.JToolBar.Separator();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        jSeparator20 = new javax.swing.JToolBar.Separator();
        btnbodega = new javax.swing.JButton();
        jSeparator22 = new javax.swing.JToolBar.Separator();
        jSeparator24 = new javax.swing.JToolBar.Separator();
        jSeparator21 = new javax.swing.JToolBar.Separator();
        jSeparator23 = new javax.swing.JToolBar.Separator();
        btnRegresar = new javax.swing.JButton();
        jSeparator18 = new javax.swing.JToolBar.Separator();
        jSeparator25 = new javax.swing.JToolBar.Separator();
        jSeparator26 = new javax.swing.JToolBar.Separator();
        jSeparator27 = new javax.swing.JToolBar.Separator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblnombreE = new javax.swing.JLabel();
        lblrol = new javax.swing.JLabel();
        dkp_pane_principal = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        menu_principal = new javax.swing.JMenuBar();
        menu_persona = new javax.swing.JMenu();
        menuItem_clientes = new javax.swing.JMenuItem();
        menuItem_empleados = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        JmenuPersonasVP = new javax.swing.JMenuItem();
        MnEmpleado = new javax.swing.JMenuItem();
        MnServicio = new javax.swing.JMenuItem();
        JmenuClientesVP = new javax.swing.JMenuItem();
        jMenuproductosvp = new javax.swing.JMenuItem();
        jMenubodegvb = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        JmenuPersonasGeneroVP = new javax.swing.JMenuItem();
        JmenuClientesMorePedidoVP = new javax.swing.JMenuItem();
        JmenuProductosTopCVP = new javax.swing.JMenuItem();
        JmenuBodegaEpacioCVP = new javax.swing.JMenuItem();
        mncostoservi = new javax.swing.JMenuItem();
        mnsueldoemple = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenu();
        JmenuSalirSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(0, 80, 128));
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);
        jToolBar1.setBorderPainted(false);
        jToolBar1.add(jSeparator5);
        jToolBar1.add(jSeparator11);
        jToolBar1.add(jSeparator9);

        subMenu_Persona.setForeground(new java.awt.Color(255, 255, 255));
        subMenu_Persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-a??adir-grupo-de-usuarios-hombre-hombre-34.png"))); // NOI18N
        subMenu_Persona.setText("Personas");
        subMenu_Persona.setBorder(null);
        subMenu_Persona.setContentAreaFilled(false);
        subMenu_Persona.setFocusable(false);
        subMenu_Persona.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subMenu_Persona.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(subMenu_Persona);
        jToolBar1.add(jSeparator12);
        jToolBar1.add(jSeparator8);
        jToolBar1.add(jSeparator6);
        jToolBar1.add(jSeparator1);

        subMenu_servicios.setForeground(new java.awt.Color(255, 255, 255));
        subMenu_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-campana-de-servicio-34.png"))); // NOI18N
        subMenu_servicios.setText("Servicos");
        subMenu_servicios.setBorder(null);
        subMenu_servicios.setContentAreaFilled(false);
        subMenu_servicios.setFocusable(false);
        subMenu_servicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subMenu_servicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(subMenu_servicios);
        jToolBar1.add(jSeparator4);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator7);

        submenu_Pedidos.setForeground(new java.awt.Color(255, 255, 255));
        submenu_Pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-historial-de-pedidos-34.png"))); // NOI18N
        submenu_Pedidos.setText("Pedidos");
        submenu_Pedidos.setBorder(null);
        submenu_Pedidos.setContentAreaFilled(false);
        submenu_Pedidos.setFocusable(false);
        submenu_Pedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submenu_Pedidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(submenu_Pedidos);
        jToolBar1.add(jSeparator10);
        jToolBar1.add(jSeparator16);
        jToolBar1.add(jSeparator13);
        jToolBar1.add(jSeparator17);

        sub_menupro.setForeground(new java.awt.Color(255, 255, 255));
        sub_menupro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-servicio-de-limpieza-34.png"))); // NOI18N
        sub_menupro.setText("Productos");
        sub_menupro.setBorder(null);
        sub_menupro.setContentAreaFilled(false);
        sub_menupro.setFocusable(false);
        sub_menupro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sub_menupro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(sub_menupro);
        jToolBar1.add(jSeparator15);
        jToolBar1.add(jSeparator19);
        jToolBar1.add(jSeparator14);
        jToolBar1.add(jSeparator20);

        btnbodega.setForeground(new java.awt.Color(255, 255, 255));
        btnbodega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-almac??n-34.png"))); // NOI18N
        btnbodega.setText("Bodega");
        btnbodega.setBorder(null);
        btnbodega.setContentAreaFilled(false);
        btnbodega.setFocusable(false);
        btnbodega.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbodega.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnbodega);
        jToolBar1.add(jSeparator22);
        jToolBar1.add(jSeparator24);
        jToolBar1.add(jSeparator21);
        jToolBar1.add(jSeparator23);

        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-logout-rounded-left-30.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(null);
        btnRegresar.setContentAreaFilled(false);
        btnRegresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegresar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnRegresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnRegresar);
        jToolBar1.add(jSeparator18);
        jToolBar1.add(jSeparator25);
        jToolBar1.add(jSeparator26);
        jToolBar1.add(jSeparator27);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 570));

        jPanel2.setBackground(new java.awt.Color(0, 80, 128));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          SGSL.version.1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 220, 20));

        lblnombreE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblnombreE.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblnombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 160, 30));

        lblrol.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblrol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lblrol, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 140, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1220, 50));

        dkp_pane_principal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/PORTADAORfondo-removebg-preview.png"))); // NOI18N

        dkp_pane_principal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkp_pane_principalLayout = new javax.swing.GroupLayout(dkp_pane_principal);
        dkp_pane_principal.setLayout(dkp_pane_principalLayout);
        dkp_pane_principalLayout.setHorizontalGroup(
            dkp_pane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkp_pane_principalLayout.createSequentialGroup()
                .addContainerGap(323, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(316, 316, 316))
        );
        dkp_pane_principalLayout.setVerticalGroup(
            dkp_pane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkp_pane_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        getContentPane().add(dkp_pane_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 1130, 570));

        menu_principal.setBackground(new java.awt.Color(0, 80, 128));
        menu_principal.setPreferredSize(new java.awt.Dimension(236, 50));

        menu_persona.setForeground(new java.awt.Color(255, 255, 255));
        menu_persona.setText("Persona");
        menu_persona.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        menuItem_clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuItem_clientes.setText("Clientes");
        menu_persona.add(menuItem_clientes);

        menuItem_empleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        menuItem_empleados.setText("Empleados");
        menu_persona.add(menuItem_empleados);

        menu_principal.add(menu_persona);

        menuReportes.setForeground(new java.awt.Color(255, 255, 255));
        menuReportes.setText("Reportes");
        menuReportes.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N

        jMenu2.setText("Reportes Generales");

        JmenuPersonasVP.setText("Personas");
        jMenu2.add(JmenuPersonasVP);

        MnEmpleado.setText("Empleado");
        jMenu2.add(MnEmpleado);

        MnServicio.setText("Servicios");
        jMenu2.add(MnServicio);

        JmenuClientesVP.setText("Clientes");
        jMenu2.add(JmenuClientesVP);

        jMenuproductosvp.setText("Productos");
        jMenu2.add(jMenuproductosvp);

        jMenubodegvb.setText("Bodegas");
        jMenu2.add(jMenubodegvb);

        menuReportes.add(jMenu2);

        jMenu1.setText("Reportes Gr??ficos");

        JmenuPersonasGeneroVP.setText("Genero");
        jMenu1.add(JmenuPersonasGeneroVP);

        JmenuClientesMorePedidoVP.setText("More Pedidos");
        jMenu1.add(JmenuClientesMorePedidoVP);

        JmenuProductosTopCVP.setText("Productos");
        jMenu1.add(JmenuProductosTopCVP);

        JmenuBodegaEpacioCVP.setText("Bodega");
        jMenu1.add(JmenuBodegaEpacioCVP);

        mncostoservi.setText("Costo Servicios");
        jMenu1.add(mncostoservi);

        mnsueldoemple.setText("Sueldo Empleados");
        jMenu1.add(mnsueldoemple);

        menuReportes.add(jMenu1);

        menu_principal.add(menuReportes);

        mnSalir.setForeground(new java.awt.Color(255, 255, 255));
        mnSalir.setText("Salir");
        mnSalir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        JmenuSalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-exit-25.png"))); // NOI18N
        JmenuSalirSistema.setText("Salir del Sistema");
        mnSalir.add(JmenuSalirSistema);

        menu_principal.add(mnSalir);

        setJMenuBar(menu_principal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getSubMenu_Persona() {
        return subMenu_Persona;
    }

    public void setSubMenu_Persona(JButton subMenu_Persona) {
        this.subMenu_Persona = subMenu_Persona;
    }

    public JButton getSubMenu_servicios() {
        return subMenu_servicios;
    }

    public JButton getBtnbodega() {
        return btnbodega;
    }

    public void setBtnbodega(JButton btnbodega) {
        this.btnbodega = btnbodega;
    }

    public JDesktopPane getDkp_pane_principal() {
        return dkp_pane_principal;
    }

    public void setDkp_pane_principal(JDesktopPane dkp_pane_principal) {
        this.dkp_pane_principal = dkp_pane_principal;
    }
    public void setSubMenu_servicios(JButton subMenu_servicios) {
        this.subMenu_servicios = subMenu_servicios;
    }



    public JMenuItem getMenuItem_clientes() {
        return menuItem_clientes;
    }

    public void setMenuItem_clientes(JMenuItem menuItem_clientes) {
        this.menuItem_clientes = menuItem_clientes;
    }

    public JMenu getMnSalir() {
        return mnSalir;
    }

    public void setMnSalir(JMenu mnSalir) {
        this.mnSalir = mnSalir;
    }
    
    
    public JMenuItem getMenuItem_empleados() {
        return menuItem_empleados;
    }

    public JMenuItem getjMenubodegvb() {
        return jMenubodegvb;
    }

    public void setjMenubodegvb(JMenuItem jMenubodegvb) {
        this.jMenubodegvb = jMenubodegvb;
    }

    public JMenuItem getjMenuproductosvp() {
        return jMenuproductosvp;
    }

    public void setjMenuproductosvp(JMenuItem jMenuproductosvp) {
        this.jMenuproductosvp = jMenuproductosvp;
    }

    public void setMenuItem_empleados(JMenuItem menuItem_empleados) {
        this.menuItem_empleados = menuItem_empleados;
    }

    public JLabel getLblnombreE() {
        return lblnombreE;
    }

    public void setLblnombreE(JLabel lblnombreE) {
        this.lblnombreE = lblnombreE;
    }

    public JLabel getLblrol() {
        return lblrol;
    }

    public void setLblrol(JLabel lblrol) {
        this.lblrol = lblrol;
    }

    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public void setBtnRegresar(JButton btnRegresar) {
        this.btnRegresar = btnRegresar;
    }

    public JButton getSubmenu_Pedidos() {
        return submenu_Pedidos;
    }

    public void setSubmenu_Pedidos(JButton submenu_Pedidos) {
        this.submenu_Pedidos = submenu_Pedidos;
    }

    public JMenuItem getJmenuPersonasGeneroVP() {
        return JmenuPersonasGeneroVP;
    }

    public void setJmenuPersonasGeneroVP(JMenuItem JmenuPersonasGeneroVP) {
        this.JmenuPersonasGeneroVP = JmenuPersonasGeneroVP;
    }

    public JMenuItem getJmenuPersonasVP() {
        return JmenuPersonasVP;
    }

    public JMenuItem getMncostoservi() {
        return mncostoservi;
    }

    public void setMncostoservi(JMenuItem mncostoservi) {
        this.mncostoservi = mncostoservi;
    }

    public JMenuItem getMnsueldoemple() {
        return mnsueldoemple;
    }

    public void setMnsueldoemple(JMenuItem mnsueldoemple) {
        this.mnsueldoemple = mnsueldoemple;
    }
    
    
    public void setJmenuPersonasVP(JMenuItem JmenuPersonasVP) {
        this.JmenuPersonasVP = JmenuPersonasVP;
    }

    public JMenuItem getMnEmpleado() {
        return MnEmpleado;
    }

    public void setMnEmpleado(JMenuItem MnEmpleado) {
        this.MnEmpleado = MnEmpleado;
    }

    public JMenuItem getMnServicio() {
        return MnServicio;
    }

    public void setMnServicio(JMenuItem MnServicio) {
        this.MnServicio = MnServicio;
    }

    public JMenuItem getJmenuClientesMorePedidoVP() {
        return JmenuClientesMorePedidoVP;
    }

    public void setJmenuClientesMorePedidoVP(JMenuItem JmenuClientesMorePedidoVP) {
        this.JmenuClientesMorePedidoVP = JmenuClientesMorePedidoVP;
    }

    public JMenuItem getJmenuClientesVP() {
        return JmenuClientesVP;
    }

    public void setJmenuClientesVP(JMenuItem JmenuClientesVP) {
        this.JmenuClientesVP = JmenuClientesVP;
    }

    public JMenuItem getJmenuProductosTopCVP() {
        return JmenuProductosTopCVP;
    }

    public void setJmenuProductosTopCVP(JMenuItem JmenuProductosTopCVP) {
        this.JmenuProductosTopCVP = JmenuProductosTopCVP;
    }

    public JMenuItem getJmenuBodegaEpacioCVP() {
        return JmenuBodegaEpacioCVP;
    }

    public void setJmenuBodegaEpacioCVP(JMenuItem JmenuBodegaEpacioCVP) {
        this.JmenuBodegaEpacioCVP = JmenuBodegaEpacioCVP;
    }

    public JMenuItem getJmenuSalirSistema() {
        return JmenuSalirSistema;
    }

    public void setJmenuSalirSistema(JMenuItem JmenuSalirSistema) {
        this.JmenuSalirSistema = JmenuSalirSistema;
    }

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JmenuBodegaEpacioCVP;
    private javax.swing.JMenuItem JmenuClientesMorePedidoVP;
    private javax.swing.JMenuItem JmenuClientesVP;
    private javax.swing.JMenuItem JmenuPersonasGeneroVP;
    private javax.swing.JMenuItem JmenuPersonasVP;
    private javax.swing.JMenuItem JmenuProductosTopCVP;
    private javax.swing.JMenuItem JmenuSalirSistema;
    private javax.swing.JMenuItem MnEmpleado;
    private javax.swing.JMenuItem MnServicio;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnbodega;
    private javax.swing.JDesktopPane dkp_pane_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenubodegvb;
    private javax.swing.JMenuItem jMenuproductosvp;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator17;
    private javax.swing.JToolBar.Separator jSeparator18;
    private javax.swing.JToolBar.Separator jSeparator19;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator20;
    private javax.swing.JToolBar.Separator jSeparator21;
    private javax.swing.JToolBar.Separator jSeparator22;
    private javax.swing.JToolBar.Separator jSeparator23;
    private javax.swing.JToolBar.Separator jSeparator24;
    private javax.swing.JToolBar.Separator jSeparator25;
    private javax.swing.JToolBar.Separator jSeparator26;
    private javax.swing.JToolBar.Separator jSeparator27;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblnombreE;
    private javax.swing.JLabel lblrol;
    private javax.swing.JMenuItem menuItem_clientes;
    private javax.swing.JMenuItem menuItem_empleados;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu menu_persona;
    private javax.swing.JMenuBar menu_principal;
    private javax.swing.JMenu mnSalir;
    private javax.swing.JMenuItem mncostoservi;
    private javax.swing.JMenuItem mnsueldoemple;
    private javax.swing.JButton subMenu_Persona;
    private javax.swing.JButton subMenu_servicios;
    private javax.swing.JButton sub_menupro;
    private javax.swing.JButton submenu_Pedidos;
    // End of variables declaration//GEN-END:variables

    public JButton getSub_menupro() {
        return sub_menupro;
    }

    public void setSub_menupro(JButton sub_menupro) {
        this.sub_menupro = sub_menupro;
    }
}
