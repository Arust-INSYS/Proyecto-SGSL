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
public class Cliente {
    private int id_clienteC;
    private String telefono;
    private int id_personaCI;

    public Cliente() {
    }    

    public Cliente(int id_clienteC, String telefono, int id_personaCI) {
        this.id_clienteC = id_clienteC;
        this.telefono = telefono;
        this.id_personaCI = id_personaCI;
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
