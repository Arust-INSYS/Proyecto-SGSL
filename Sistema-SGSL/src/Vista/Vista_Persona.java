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

    public JButton getBtnImprimirPersona() {
        return BtnImprimirPersona;
    }

    public void setBtnImprimirPersona(JButton BtnImprimirPersona) {
        this.BtnImprimirPersona = BtnImprimirPersona;
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

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogoPersona = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        BtnAceptarPer = new javax.swing.JButton();
        BtnCancelarPer = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        TxtCedulaPersona = new javax.swing.JTextField();
        TxtNombrePersona = new javax.swing.JTextField();
        TxtApellidoPersona = new javax.swing.JTextField();
        TxtDireccionPersona = new javax.swing.JTextField();
        RadioBtnMasculino = new javax.swing.JRadioButton();
        RadioBtnFemenino = new javax.swing.JRadioButton();
        LblFotoPersona = new javax.swing.JLabel();
        BtnSeleccionarFoto = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Txt_ID_Persona = new javax.swing.JTextField();
        FechaNacimientoPer = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        LblCedulaRojo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LbLFechaRojo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblApellido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblNombreRojo = new javax.swing.JLabel();
        LblGeneroRojo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        GrupoBotonGenero = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TxtBuscarPersona = new javax.swing.JTextField();
        BtnCrearPersona = new javax.swing.JButton();
        BtnEditarPersona = new javax.swing.JButton();
        BtnRemoverPersona = new javax.swing.JButton();
        BtnImprimirPersona = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblPersonas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblEstado = new javax.swing.JLabel();
        BtnActualizarPersona = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(0, 255, 204));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Persona");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );

        BtnAceptarPer.setText("Aceptar");

        BtnCancelarPer.setText("Cancelar");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        GrupoBotonGenero.add(RadioBtnMasculino);
        RadioBtnMasculino.setText("M");

        GrupoBotonGenero.add(RadioBtnFemenino);
        RadioBtnFemenino.setText("F");

        LblFotoPersona.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnSeleccionarFoto.setText("Seleccionar");

        jLabel10.setText("Id_Persona");

        FechaNacimientoPer.setDateFormatString("yyyy-MM-dd");

        jLabel3.setText("Nombre:");

        LblCedulaRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblCedulaRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblCedulaRojo.setText("*");

        jLabel4.setText("Apellido:");

        LbLFechaRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LbLFechaRojo.setForeground(new java.awt.Color(255, 0, 0));
        LbLFechaRojo.setText("*");

        jLabel5.setText("Fecha Nacimiento:");

        LblApellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblApellido.setForeground(new java.awt.Color(255, 0, 0));
        LblApellido.setText("*");

        jLabel6.setText("Dirección:");

        jLabel2.setText("Cédula:");

        LblNombreRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblNombreRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblNombreRojo.setText("*");

        LblGeneroRojo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LblGeneroRojo.setForeground(new java.awt.Color(255, 0, 0));
        LblGeneroRojo.setText("*");

        jLabel8.setText("Foto");

        jLabel9.setText("Genero:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(276, 276, 276)
                        .addComponent(jLabel8)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(RadioBtnMasculino)
                                        .addGap(18, 18, 18)
                                        .addComponent(RadioBtnFemenino)
                                        .addGap(18, 18, 18)
                                        .addComponent(LblGeneroRojo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(TxtDireccionPersona)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(71, 71, 71)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_ID_Persona, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtCedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FechaNacimientoPer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtApellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblNombreRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblCedulaRojo)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbLFechaRojo))))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(BtnSeleccionarFoto)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblFotoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LbLFechaRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(Txt_ID_Persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(TxtCedulaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblCedulaRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtNombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblNombreRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtApellidoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5)
                                .addComponent(FechaNacimientoPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblFotoPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnSeleccionarFoto)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(RadioBtnMasculino)
                            .addComponent(RadioBtnFemenino)
                            .addComponent(LblGeneroRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtDireccionPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout DialogoPersonaLayout = new javax.swing.GroupLayout(DialogoPersona.getContentPane());
        DialogoPersona.getContentPane().setLayout(DialogoPersonaLayout);
        DialogoPersonaLayout.setHorizontalGroup(
            DialogoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DialogoPersonaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAceptarPer)
                .addGap(94, 94, 94)
                .addComponent(BtnCancelarPer)
                .addGap(111, 111, 111))
            .addGroup(DialogoPersonaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        DialogoPersonaLayout.setVerticalGroup(
            DialogoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogoPersonaLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(DialogoPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnAceptarPer)
                    .addComponent(BtnCancelarPer))
                .addGap(20, 20, 20))
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setText("Buscar");

        BtnCrearPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnCrearPersona.setText("Crear");

        BtnEditarPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnEditarPersona.setText("Editar");

        BtnRemoverPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnRemoverPersona.setText("Remover");

        BtnImprimirPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BtnImprimirPersona.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(BtnCrearPersona)
                .addGap(78, 78, 78)
                .addComponent(BtnEditarPersona)
                .addGap(77, 77, 77)
                .addComponent(BtnRemoverPersona)
                .addGap(77, 77, 77)
                .addComponent(BtnImprimirPersona)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnImprimirPersona)
                    .addComponent(BtnRemoverPersona)
                    .addComponent(BtnEditarPersona)
                    .addComponent(BtnCrearPersona)
                    .addComponent(TxtBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );

        TblPersonas.setBackground(new java.awt.Color(235, 238, 238));
        TblPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_persona", "Cédula ", "Nombre ", "Apellido ", "Fecha_nacimiento ", "Genero ", "Dirección ", "Foto"
            }
        ));
        jScrollPane1.setViewportView(TblPersonas);

        jPanel2.setBackground(new java.awt.Color(220, 220, 220));

        lblEstado.setText("Personas 1.0");

        BtnActualizarPersona.setText("Actualizar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnActualizarPersona)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnActualizarPersona)
                    .addComponent(lblEstado))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1265, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAceptarPer;
    private javax.swing.JButton BtnActualizarPersona;
    private javax.swing.JButton BtnCancelarPer;
    private javax.swing.JButton BtnCrearPersona;
    private javax.swing.JButton BtnEditarPersona;
    private javax.swing.JButton BtnImprimirPersona;
    private javax.swing.JButton BtnRemoverPersona;
    private javax.swing.JButton BtnSeleccionarFoto;
    private javax.swing.JDialog DialogoPersona;
    private com.toedter.calendar.JDateChooser FechaNacimientoPer;
    private javax.swing.ButtonGroup GrupoBotonGenero;
    private javax.swing.JLabel LbLFechaRojo;
    private javax.swing.JLabel LblApellido;
    private javax.swing.JLabel LblCedulaRojo;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstado;
    // End of variables declaration//GEN-END:variables
}
