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
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
    
    public boolean FechaNacimientoMayor(String fecha) {
        boolean estado = false;
//        String formatoFecha = fecha;
//        System.out.println("F1->"+formatoFecha);
//        String[] arrayFecha = formatoFecha.split("-");
//        String anioPosicion = arrayFecha[0];
//        System.out.println("s-->"+anioPosicion);
//        
//        int numerAnio = Integer.parseInt(anioPosicion);
//        LocalDate fechaActual = LocalDate.now();
//        int anioLocal = fechaActual.getYear();
//        
//        int auxAnio = anioLocal - numerAnio;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechanaci = LocalDate.parse(fecha, formato);
        LocalDate fechaAhora = LocalDate.now();
        Period periodo = Period.between(fechanaci, fechaAhora);
        double edadP = periodo.toTotalMonths();
        if (edadP < 18) {
            JOptionPane.showMessageDialog(null, "No se ha completado la operación, Fecha La fecha del cliente es menor a 18 años");
            estado = false;
        } else {
            estado = true;
        }

        return estado;
    }
}
