/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Usuario;
import Vista.Vista_Carga;
import Vista.Vista_Login;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Controlador_Carga extends Thread {

    private Vista_Carga viewC;

    public Controlador_Carga(Vista_Carga viewC) {
        this.viewC = viewC;
        viewC.setLocationRelativeTo(viewC);
        viewC.setVisible(true);
    }

    public void inicia_Control_Carga() {
        //Vista y modelo instancias..
        Vista_Login vl = new Vista_Login();
        Modelo_Usuario mu = new Modelo_Usuario();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (ClassNotFoundException ex) {
        } catch (InstantiationException ex) {
        } catch (IllegalAccessException ex) {
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        }

        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(i);
                viewC.getLblPorcentajeVC().setText(i + "%");
                if (i == 30) {
                    viewC.getLblLoadingTextVC().setText("Iniciando sistema SGSL");
                    //Controldador del login con tiempo..
                    Controlador_Login cl = new Controlador_Login(mu, vl);
                    cl.IniciarBoton();
                }
                if (i == 60) {
                    viewC.getLblLoadingTextVC().setText("Procesando datos del sistema.");
                }
                if (i == 90) {
                    viewC.getLblLoadingTextVC().setText("Abriendo sistema.");
                }
                viewC.getProgressLoadingVC().setValue(i);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(viewC, e);
        }
        viewC.dispose();
        vl.setVisible(true);
    }
}
