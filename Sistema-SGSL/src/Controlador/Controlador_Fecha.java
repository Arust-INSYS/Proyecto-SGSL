/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import com.toedter.calendar.JDateChooser;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
//import java.util.Date;

/**
 *
 * @author DELL
 */
public class Controlador_Fecha {
    public boolean FechaNacimiento(JDateChooser fecha) {

        boolean estado = false;

        Date dat = new Date();

        if (fecha.getDate().getTime() >= dat.getTime()) {//Compara si la fecha seleccionada es memor o igual a la fecha actual
            JOptionPane.showMessageDialog(null, "No se ha completado la operación, Fecha Infrige a la fecha Actual");
            estado = false;
        } else {
            //JOptionPane.showMessageDialog(null, "Fecha Correcta");

            estado = true;
        }

        return estado;
    }
}
