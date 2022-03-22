/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Usuario;
import Vista.Vista_Login;
import Vista.Vista_Principal;
import Vista.Vista_Registro_Usuario;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Controlador_Login {

    private Modelo_Usuario modelo_user;
    private Vista_Login vista_login;

    public Controlador_Login(Modelo_Usuario modelo_user, Vista_Login vista_login) {
        this.modelo_user = modelo_user;
        this.vista_login = vista_login;
//        vista_login.setVisible(true);
    }

    public void IniciarBoton() {
    vista_login.getBtnLogin().addActionListener(l-> logeo());
    vista_login.getBtnRegistrar().addActionListener(l-> AbrirVregistro());
    
    }

    public void logeo() {
        String user = vista_login.getTxtUsuarioLogin().getText();
        String password = String.valueOf(vista_login.getTxt_passwordLogin().getPassword());

        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(vista_login, "Campos Vacios ", "", JOptionPane.ERROR_MESSAGE);
        } else {
            if (modelo_user.ValidarCredencial(user, password)) {
                Vista_Principal vp = new Vista_Principal();
                vp.setVisible(true);
                vista_login.setVisible(false);
                Control_VistaPrincipal cvp = new Control_VistaPrincipal(vp);
                cvp.iniciaControl();
                cvp.datosUsuario(user);
            }else{
                vista_login.getTxtUsuarioLogin().setText("");
                vista_login.getTxt_passwordLogin().setText("");
                 JOptionPane.showMessageDialog(vista_login, "Datos Incorrectos", "", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public void AbrirVregistro() {
        Vista_Registro_Usuario vru = new Vista_Registro_Usuario();
        Modelo_Usuario user = new Modelo_Usuario();
        Controlador_Registro_Usuario cru = new Controlador_Registro_Usuario(modelo_user, vru);
        cru.InicaBoton();
        vista_login.setVisible(false);
    }


}
