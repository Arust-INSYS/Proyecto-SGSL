/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

import java.awt.Image;
import java.sql.Date;

/**
 *
 * @author DELL
 */
//Creación de la clase Cliente.
public class Cliente{
    //Creación de los atributos de la cliente.
    private int id_clienteC;
    private String telefono;
    private int id_personaCI;
    private String apellido, nombre;

    //Constructores de la clase cliente.
    public Cliente() {
    }    

    public Cliente(int id_clienteC, String telefono, int id_personaCI) {
        this.id_clienteC = id_clienteC;
        this.telefono = telefono;
        this.id_personaCI = id_personaCI;
    }

    public Cliente(int id_clienteC, String telefono, int id_personaCI, String apellido, String nombre) {
        this.id_clienteC = id_clienteC;
        this.telefono = telefono;
        this.id_personaCI = id_personaCI;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    //Creación de los getter y setters.
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getId_personaCI() {
        return id_personaCI;
    }

    public void setId_personaCI(int id_personaCI) {
        this.id_personaCI = id_personaCI;
    }

    


    public int getId_clienteC() {
        return id_clienteC;
    }

    public void setId_clienteC(int id_clienteC) {
        this.id_clienteC = id_clienteC;
    }
    
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
}
