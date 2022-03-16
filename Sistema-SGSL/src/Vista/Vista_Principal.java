/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
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
        subMenu_Persona = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        subMenu_servicios = new javax.swing.JButton();
        sub_menupro = new javax.swing.JButton();
        btnbodega = new javax.swing.JButton();
        dkp_pane_principal = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menu_principal = new javax.swing.JMenuBar();
        menu_persona = new javax.swing.JMenu();
        menuItem_clientes = new javax.swing.JMenuItem();
        menuItem_empleados = new javax.swing.JMenuItem();
        menu_servicos = new javax.swing.JMenu();
        menu_pedidos = new javax.swing.JMenu();
        menu_productos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        subMenu_Persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-persona-femenina-24.png"))); // NOI18N
        subMenu_Persona.setFocusable(false);
        subMenu_Persona.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subMenu_Persona.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(subMenu_Persona);
        jToolBar1.add(jSeparator1);

        subMenu_servicios.setText("Servicos");
        subMenu_servicios.setFocusable(false);
        subMenu_servicios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        subMenu_servicios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(subMenu_servicios);

        sub_menupro.setText("Productos");
        sub_menupro.setFocusable(false);
        sub_menupro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sub_menupro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(sub_menupro);

        btnbodega.setText("Bodega");
        btnbodega.setFocusable(false);
        btnbodega.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnbodega.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnbodega);

        dkp_pane_principal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/PORTADAORI.jpg"))); // NOI18N

        dkp_pane_principal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkp_pane_principalLayout = new javax.swing.GroupLayout(dkp_pane_principal);
        dkp_pane_principal.setLayout(dkp_pane_principalLayout);
        dkp_pane_principalLayout.setHorizontalGroup(
            dkp_pane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dkp_pane_principalLayout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        dkp_pane_principalLayout.setVerticalGroup(
            dkp_pane_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 602, Short.MAX_VALUE)
        );

        jLabel1.setText("          SGSL.version.1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        menu_principal.setPreferredSize(new java.awt.Dimension(236, 50));

        menu_persona.setText("Persona");

        menuItem_clientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItem_clientes.setText("Clientes");
        menu_persona.add(menuItem_clientes);

        menuItem_empleados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItem_empleados.setText("Empleados");
        menu_persona.add(menuItem_empleados);

        menu_principal.add(menu_persona);

        menu_servicos.setText("Servicios");
        menu_principal.add(menu_servicos);

        menu_pedidos.setText("Pedidos");
        menu_principal.add(menu_pedidos);

        menu_productos.setText("Productos");
        menu_principal.add(menu_productos);

        setJMenuBar(menu_principal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dkp_pane_principal)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dkp_pane_principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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

    public void setSubMenu_servicios(JButton subMenu_servicios) {
        this.subMenu_servicios = subMenu_servicios;
    }

    
    public JDesktopPane getDkp_pane_principal() {
        return dkp_pane_principal;
    }

    public void setDkp_pane_principal(JDesktopPane dkp_pane_principal) {
        this.dkp_pane_principal = dkp_pane_principal;
    }

    public JMenuItem getMenuItem_clientes() {
        return menuItem_clientes;
    }

    public void setMenuItem_clientes(JMenuItem menuItem_clientes) {
        this.menuItem_clientes = menuItem_clientes;
    }

    public JMenuItem getMenuItem_empleados() {
        return menuItem_empleados;
    }

    public void setMenuItem_empleados(JMenuItem menuItem_empleados) {
        this.menuItem_empleados = menuItem_empleados;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbodega;
    private javax.swing.JDesktopPane dkp_pane_principal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuItem_clientes;
    private javax.swing.JMenuItem menuItem_empleados;
    private javax.swing.JMenu menu_pedidos;
    private javax.swing.JMenu menu_persona;
    private javax.swing.JMenuBar menu_principal;
    private javax.swing.JMenu menu_productos;
    private javax.swing.JMenu menu_servicos;
    private javax.swing.JButton subMenu_Persona;
    private javax.swing.JButton subMenu_servicios;
    private javax.swing.JButton sub_menupro;
    // End of variables declaration//GEN-END:variables

    public JButton getSub_menupro() {
        return sub_menupro;
    }

    public void setSub_menupro(JButton sub_menupro) {
        this.sub_menupro = sub_menupro;
    }
}
