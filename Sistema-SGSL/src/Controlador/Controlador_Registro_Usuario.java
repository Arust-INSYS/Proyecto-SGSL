/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.Modelo_Usuario;
import Vista.Vista_Login;
import Vista.Vista_Registro_Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Controlador_Registro_Usuario {

    private Modelo_Usuario modelo_user;
    private Vista_Registro_Usuario vista_registroU;

     //Constructor de la clase Controlador de Registo Usuario.
    public Controlador_Registro_Usuario(Modelo_Usuario modelo_user, Vista_Registro_Usuario vista_registroU) {
        this.modelo_user = modelo_user;
        this.vista_registroU = vista_registroU;
        vista_registroU.setVisible(true);
    }
    
//Método de control de todos los botones iniciales.
    public void InicaBoton() {
        vista_registroU.getBtn_registrarUsuario().addActionListener(l -> Registrar());
        vista_registroU.getBtn_cancelarRegistroUsuario().addActionListener(l -> Cancelar());
    }
 //Método de validación de todos los datos ingresados por el usuario.
    public void Registrar() {
        String user = vista_registroU.getTxt_NombreUsuario().getText();
        String password1 = String.valueOf(vista_registroU.getTxt_Contrasenia().getPassword());
        String password2 = String.valueOf(vista_registroU.getTxt_confirmarContra().getPassword());

        if (user.isEmpty() || password1.isEmpty() || password2.isEmpty()) {
            JOptionPane.showMessageDialog(vista_registroU, "Campos Vacios ", "", JOptionPane.ERROR_MESSAGE);

        } else {
            int id_empleado = modelo_user.validarUsuario(user);
            if (-1 != id_empleado) {

                if (modelo_user.VerificarU(id_empleado)) {
                    JOptionPane.showMessageDialog(vista_registroU, "El usuario ya existe", "", JOptionPane.ERROR_MESSAGE);
                } else {
                    if (password1.equals(password2)) {
                        if (modelo_user.GuardarContraseña(password1, id_empleado)) {
                            JOptionPane.showMessageDialog(vista_registroU, "Usuario Creado", "", JOptionPane.INFORMATION_MESSAGE);
                            vista_registroU.setVisible(false);
                            Modelo_Usuario m_us = new Modelo_Usuario();
                            Vista_Login vl = new Vista_Login();
                            Controlador_Login cl = new Controlador_Login(m_us, vl);
                            cl.IniciarBoton();
                        } else {
                            System.out.println("Error al crear el usuario");
                            LimpiarCampos();
                        }

                    } else {

                        JOptionPane.showMessageDialog(vista_registroU, "Contraseñas no Coinciden", "", JOptionPane.INFORMATION_MESSAGE);
                        LimpiarCampos();
                    }

                }

            } else {
                JOptionPane.showMessageDialog(vista_registroU, "El Usuario no pertenece a la empresa", "", JOptionPane.ERROR_MESSAGE);
                LimpiarCampos();
            }

        }

    }
 //Método para cancelar accion.
    public void Cancelar() {
        vista_registroU.setVisible(false);
        Modelo_Usuario m_user = new Modelo_Usuario();
        Vista_Login vl = new Vista_Login();
        Controlador_Login cl = new Controlador_Login(m_user, vl);
        vl.setVisible(true);
        cl.IniciarBoton();
    }
     //Método para limpiar los campos
     public void LimpiarCampos() {
        vista_registroU.getTxt_NombreUsuario().setText("");
        vista_registroU.getTxt_Contrasenia().setText("");
        vista_registroU.getTxt_confirmarContra().setText("");
    }

}
