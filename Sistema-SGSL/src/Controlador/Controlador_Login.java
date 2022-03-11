/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Empleado;
import Vista.Vista_Login;
import Vista.Vista_Principal;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Controlador_Login {

    private Modelo_Empleado modelo_emp;
    private Vista_Login vista_login;

    public Controlador_Login(Modelo_Empleado modelo_emp, Vista_Login vista_login) {
        this.modelo_emp = modelo_emp;
        this.vista_login = vista_login;
        vista_login.setVisible(true);
    }

    public void IniciarBoton() {
    vista_login.getBtnLogin().addActionListener(l-> logeo());
    }

    public void logeo() {
        String user = vista_login.getTxtUsuarioLogin().getText();
        String password = String.valueOf(vista_login.getTxt_passwordLogin().getPassword());

        if (user.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(vista_login, "Campos Vacios ", "", JOptionPane.ERROR_MESSAGE);
        } else {
            if (modelo_emp.ValidarCredencial(user, password)) {
                Vista_Principal vp = new Vista_Principal();
                vp.setVisible(true);
                vista_login.setVisible(false);
            }
        }

    }

    public void registrar() {

    }

}
