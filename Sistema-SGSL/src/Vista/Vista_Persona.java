/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author lorena
 */
public class Vista_Persona extends javax.swing.JInternalFrame {

    public Vista_Persona() {
        initComponents();
    }

    public JButton getBtnAceptarPer() {
        return BtnAceptarPer;
    }

    public void setBtnAceptarPer(JButton BtnAceptarPer) {
        this.BtnAceptarPer = BtnAceptarPer;
    }

    public JButton getBtnActualizarPersona() {
        return BtnActualizarPersona;
    }

    public void setBtnActualizarPersona(JButton BtnActualizarPersona) {
        this.BtnActualizarPersona = BtnActualizarPersona;
    }

    public JButton getBtnCancelarPer() {
        return BtnCancelarPer;
    }

    public void setBtnCancelarPer(JButton BtnCancelarPer) {
        this.BtnCancelarPer = BtnCancelarPer;
    }

    public JButton getBtnCrearPersona() {
        return BtnCrearPersona;
    }

    public void setBtnCrearPersona(JButton BtnCrearPersona) {
        this.BtnCrearPersona = BtnCrearPersona;
    }

    public JButton getBtnEditarPersona() {
        return BtnEditarPersona;
    }

    public void setBtnEditarPersona(JButton BtnEditarPersona) {
        this.BtnEditarPersona = BtnEditarPersona;
    }


    public JButton getBtnRemoverPersona() {
        return BtnRemoverPersona;
    }

    public void setBtnRemoverPersona(JButton BtnRemoverPersona) {
        this.BtnRemoverPersona = BtnRemoverPersona;
    }

    public JButton getBtnSeleccionarFoto() {
        return BtnSeleccionarFoto;
    }

    public void setBtnSeleccionarFoto(JButton BtnSeleccionarFoto) {
        this.BtnSeleccionarFoto = BtnSeleccionarFoto;
    }

    public JDialog getDialogoPersona() {
        return DialogoPersona;
    }

    public void setDialogoPersona(JDialog DialogoPersona) {
        this.DialogoPersona = DialogoPersona;
    }

    public JLabel getLblFotoPersona() {
        return LblFotoPersona;
    }

    public void setLblFotoPersona(JLabel LblFotoPersona) {
        this.LblFotoPersona = LblFotoPersona;
    }

    public JRadioButton getRadioBtnFemenino() {
        return RadioBtnFemenino;
    }

    public void setRadioBtnFemenino(JRadioButton RadioBtnFemenino) {
        this.RadioBtnFemenino = RadioBtnFemenino;
    }

    public JRadioButton getRadioBtnMasculino() {
        return RadioBtnMasculino;
    }

    public void setRadioBtnMasculino(JRadioButton RadioBtnMasculino) {
        this.RadioBtnMasculino = RadioBtnMasculino;
    }

    public JTable getTblPersonas() {
        return TblPersonas;
    }

    public void setTblPersonas(JTable TblPersonas) {
        this.TblPersonas = TblPersonas;
    }

    public JTextField getTxtApellidoPersona() {
        return TxtApellidoPersona;
    }

    public void setTxtApellidoPersona(JTextField TxtApellidoPersona) {
        this.TxtApellidoPersona = TxtApellidoPersona;
    }

    public JTextField getTxtBuscarPersona() {
        return TxtBuscarPersona;
    }

    public void setTxtBuscarPersona(JTextField TxtBuscarPersona) {
        this.TxtBuscarPersona = TxtBuscarPersona;
    }

    public JTextField getTxtCedulaPersona() {
        return TxtCedulaPersona;
    }

    public void setTxtCedulaPersona(JTextField TxtCedulaPersona) {
        this.TxtCedulaPersona = TxtCedulaPersona;
    }

    public JTextField getTxtDireccionPersona() {
        return TxtDireccionPersona;
    }

    public void setTxtDireccionPersona(JTextField TxtDireccionPersona) {
        this.TxtDireccionPersona = TxtDireccionPersona;
    }

    public JTextField getTxtNombrePersona() {
        return TxtNombrePersona;
    }

    public void setTxtNombrePersona(JTextField TxtNombrePersona) {
        this.TxtNombrePersona = TxtNombrePersona;
    }

    public JDateChooser getFechaNacimientoPer() {
        return FechaNacimientoPer;
    }

    public void setFechaNacimientoPer(JDateChooser FechaNacimientoPer) {
        this.FechaNacimientoPer = FechaNacimientoPer;
    }

    public ButtonGroup getGrupoBotonGenero() {
        return GrupoBotonGenero;
    }

    public void setGrupoBotonGenero(ButtonGroup GrupoBotonGenero) {
        this.GrupoBotonGenero = GrupoBotonGenero;
    }

    public JTextField getTxt_ID_Persona() {
        return Txt_ID_Persona;
    }

    public void setTxt_ID_Persona(JTextField Txt_ID_Persona) {
        this.Txt_ID_Persona = Txt_ID_Persona;
    }

    public JLabel getLbLFechaRojo() {
        return LbLFechaRojo;
    }

    public void setLbLFechaRojo(JLabel LbLFechaRojo) {
        this.LbLFechaRojo = LbLFechaRojo;
    }

    public JLabel getLblApellido() {
        return LblApellido;
    }

    public void setLblApellido(JLabel LblApellido) {
        this.LblApellido = LblApellido;
    }

    public JLabel getLblCedulaRojo() {
        return LblCedulaRojo;
    }

    public void setLblCedulaRojo(JLabel LblCedulaRojo) {
        this.LblCedulaRojo = LblCedulaRojo;
    }

    public JLabel getLblGeneroRojo() {
        return LblGeneroRojo;
    }

    public void setLblGeneroRojo(JLabel LblGeneroRojo) {
        this.LblGeneroRojo = LblGeneroRojo;
    }

    public JLabel getLblNombreRojo() {
        return LblNombreRojo;
    }

    public void setLblNombreRojo(JLabel LblNombreRojo) {
        this.LblNombreRojo = LblNombreRojo;
    }

    public JLabel getLblFechaAcutualVP() {
        return LblFechaAcutualVP;
    }

    public void setLblFechaAcutualVP(JLabel LblFechaAcutualVP) {
        this.LblFechaAcutualVP = LblFechaAcutualVP;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoPersona = new javax.swing.JDialog();
        BtnAceptarPer = new javax.swing.JButton();
        BtnCancelarPer = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RadioBtnMasculino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        LblCedulaRojo = new javax.swing.JLabel();
        TxtDireccionPersona = new javax.swing.JTextField();
        LblGeneroRojo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtnSeleccionarFoto = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TxtApellidoPersona = new javax.swing.JTextField();
        LblFotoPersona = new javax.swing.JLabel();
        RadioBtnFemenino = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        TxtNombrePersona = new javax.swing.JTextField();
        LblNombreRojo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        FechaNacimientoPer = new com.toedter.calendar.JDateChooser();
        Txt_ID_Persona = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtCedulaPersona = new javax.swing.JTextField();
        LblApellido = new javax.swing.JLabel();
        LbLFechaRojo = new javax.swing.JLabel();
        LBLFONDOPERSONA = new javax.swing.JLabel();
        GrupoBotonGenero = new javax.swing.ButtonGroup();
        BtnCrearPersona = new javax.swing.JButton();
        BtnEditarPersona = new javax.swing.JButton();
        BtnRemoverPersona = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPersonas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        TxtBuscarPersona = new javax.swing.JTextField();
        BtnActualizarPersona = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblbuscar = new javax.swing.JLabel();
        LblFechaAcutualVP = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        DialogoPersona.setResizable(false);
        DialogoPersona.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAceptarPer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnAceptarPer.setForeground(new java.awt.Color(0, 102, 51));
        BtnAceptarPer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (2).png"))); // NOI18N
        BtnAceptarPer.setText("ACEPTAR");
        BtnAceptarPer.setBorder(null);
        BtnAceptarPer.setContentAreaFilled(false);
        BtnAceptarPer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DialogoPersona.getContentPane().add(BtnAceptarPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 100, 50));

        BtnCancelarPer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCancelarPer.setForeground(new java.awt.Color(153, 0, 0));
        BtnCancelarPer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-botón-2-80 (1).png"))); // NOI18N
        BtnCancelarPer.setText("CANCELAR");
        BtnCancelarPer.setBorder(null);
        BtnCancelarPer.setContentAreaFilled(false);
        BtnCancelarPer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DialogoPersona.getContentPane().add(BtnCancelarPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Persona");
        DialogoPersona.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -1, -1, 40));

        GrupoBotonGenero.add(RadioBtnMasculino);
        RadioBtnMasculino.setText("M");
        DialogoPersona.getContentPane().add(RadioBtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Dirección:");
        DialogoPersona.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        LblCedulaRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCedulaRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblCedulaRojo.setText("*");
        DialogoPersona.getContentPane().add(LblCedulaRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));
        DialogoPersona.getContentPane().add(TxtDireccionPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 145, -1));

        LblGeneroRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblGeneroRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblGeneroRojo.setText("*");
        DialogoPersona.getContentPane().add(LblGeneroRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Cédula:");
        DialogoPersona.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        BtnSeleccionarFoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnSeleccionarFoto.setForeground(new java.awt.Color(102, 0, 153));
        BtnSeleccionarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Aexaminaicons8-imagen-48.png"))); // NOI18N
        BtnSeleccionarFoto.setText("Seleccionar");
        BtnSeleccionarFoto.setBorder(null);
        BtnSeleccionarFoto.setContentAreaFilled(false);
        DialogoPersona.getContentPane().add(BtnSeleccionarFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Nombre:");
        DialogoPersona.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));
        DialogoPersona.getContentPane().add(TxtApellidoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 145, -1));

        LblFotoPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DialogoPersona.getContentPane().add(LblFotoPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 121, 155));

        GrupoBotonGenero.add(RadioBtnFemenino);
        RadioBtnFemenino.setText("F");
        DialogoPersona.getContentPane().add(RadioBtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Genero:");
        DialogoPersona.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));
        DialogoPersona.getContentPane().add(TxtNombrePersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 145, -1));

        LblNombreRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNombreRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblNombreRojo.setText("*");
        DialogoPersona.getContentPane().add(LblNombreRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Apellido:");
        DialogoPersona.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("Foto");
        DialogoPersona.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, -1));

        FechaNacimientoPer.setDateFormatString("yyyy-MM-dd");
        DialogoPersona.getContentPane().add(FechaNacimientoPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 145, -1));
        DialogoPersona.getContentPane().add(Txt_ID_Persona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 145, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Fecha Nacimiento:");
        DialogoPersona.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Id_Persona:");
        DialogoPersona.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));
        DialogoPersona.getContentPane().add(TxtCedulaPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 145, -1));

        LblApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblApellido.setForeground(new java.awt.Color(255, 0, 0));
        LblApellido.setText("*");
        DialogoPersona.getContentPane().add(LblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        LbLFechaRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbLFechaRojo.setForeground(new java.awt.Color(255, 0, 0));
        LbLFechaRojo.setText("*");
        DialogoPersona.getContentPane().add(LbLFechaRojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        LBLFONDOPERSONA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/APERSONAFONDO.jpg"))); // NOI18N
        DialogoPersona.getContentPane().add(LBLFONDOPERSONA, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCrearPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-añadir-usuario-masculino-48.png"))); // NOI18N
        BtnCrearPersona.setText("Crear");
        BtnCrearPersona.setToolTipText("Cear");
        BtnCrearPersona.setBorder(null);
        BtnCrearPersona.setContentAreaFilled(false);
        BtnCrearPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearPersonaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCrearPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 140, 70));

        BtnEditarPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-persona-de-sexo-masculino-48.png"))); // NOI18N
        BtnEditarPersona.setText("Editar");
        BtnEditarPersona.setBorder(null);
        BtnEditarPersona.setContentAreaFilled(false);
        getContentPane().add(BtnEditarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 60));

        BtnRemoverPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemoverPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-retire-hombre-usuario-48.png"))); // NOI18N
        BtnRemoverPersona.setText("Remover");
        BtnRemoverPersona.setBorder(null);
        BtnRemoverPersona.setContentAreaFilled(false);
        getContentPane().add(BtnRemoverPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 140, 60));

        TblPersonas.setBackground(new java.awt.Color(235, 238, 238));
        TblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_persona", "Cédula ", "Nombre ", "Apellido ", "Fecha_nacimiento ", "Genero ", "Dirección ", "Foto"
            }
        ));
        jScrollPane1.setViewportView(TblPersonas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 820, 300));

        jPanel2.setBackground(new java.awt.Color(78, 199, 229));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 1090, 30));
        getContentPane().add(TxtBuscarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 370, -1));

        BtnActualizarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-actualizar-48.png"))); // NOI18N
        BtnActualizarPersona.setText("Actualizar");
        BtnActualizarPersona.setBorder(null);
        BtnActualizarPersona.setContentAreaFilled(false);
        getContentPane().add(BtnActualizarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 50, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Servicios_Logo_150.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 160, 170));

        jLabel13.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("REGISTRO PERSONA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 340, 40));

        lblbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/icons8-busca-mas-48.png"))); // NOI18N
        getContentPane().add(lblbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, 40));
        getContentPane().add(LblFechaAcutualVP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 80, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 330, 10));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/tabla_eje1.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, 280));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Blancoceleste.jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCrearPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearPersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCrearPersonaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarPer;
    private javax.swing.JButton BtnActualizarPersona;
    private javax.swing.JButton BtnCancelarPer;
    private javax.swing.JButton BtnCrearPersona;
    private javax.swing.JButton BtnEditarPersona;
    private javax.swing.JButton BtnRemoverPersona;
    private javax.swing.JButton BtnSeleccionarFoto;
    private javax.swing.JDialog DialogoPersona;
    private com.toedter.calendar.JDateChooser FechaNacimientoPer;
    private javax.swing.ButtonGroup GrupoBotonGenero;
    private javax.swing.JLabel LBLFONDOPERSONA;
    private javax.swing.JLabel LbLFechaRojo;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCedulaRojo;
    private javax.swing.JLabel LblFechaAcutualVP;
    private javax.swing.JLabel LblFotoPersona;
    private javax.swing.JLabel LblGeneroRojo;
    private javax.swing.JLabel LblNombreRojo;
    private javax.swing.JRadioButton RadioBtnFemenino;
    private javax.swing.JRadioButton RadioBtnMasculino;
    private javax.swing.JTable TblPersonas;
    private javax.swing.JTextField TxtApellidoPersona;
    private javax.swing.JTextField TxtBuscarPersona;
    private javax.swing.JTextField TxtCedulaPersona;
    private javax.swing.JTextField TxtDireccionPersona;
    private javax.swing.JTextField TxtNombrePersona;
    private javax.swing.JTextField Txt_ID_Persona;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblbuscar;
    // End of variables declaration//GEN-END:variables
}
