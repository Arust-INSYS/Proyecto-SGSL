/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

/**
 *
 * @author HP
 */
public class Usuario {
    private String cedula;
    private String contrasenia;
    private int id_empleado;
    private int id_rol;

    public Usuario() {
    }

    public Usuario(String cedula, String contrasenia, int id_empleado, int id_rol) {
        this.cedula = cedula;
        this.contrasenia = contrasenia;
        this.id_empleado = id_empleado;
        this.id_rol = id_rol;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }
    
    
}
