/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

import java.sql.Date;

/**
 *
 * @author lorena
 */
public class Empleado {
    private int id_empleado;
    private double sueldo;
    private String estado_civil;
    private Date fecha_contrato;
    private int id_persona;
//    private String contrasenia;

    public Empleado() {
    }

    public Empleado(int id_empleado, double sueldo, String estado_civil, Date fecha_contrato, int id_persona) {
        this.id_empleado = id_empleado;
        this.sueldo = sueldo;
        this.estado_civil = estado_civil;
        this.fecha_contrato = fecha_contrato;
        this.id_persona = id_persona;
    }
    
    

   
    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public Date getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(Date fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }
    
    
}
