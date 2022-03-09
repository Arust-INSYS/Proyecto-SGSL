/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Persona;
import java.awt.Image;
import java.io.FileInputStream;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Modelo_Persona extends Persona{

    public Modelo_Persona() {
    }

    public Modelo_Persona(int id_persona, String nombre, String apellido, char genero, Date fecha_nacimiento, String Direccion, Image foto) {
        super(id_persona, nombre, apellido, genero, fecha_nacimiento, Direccion, foto);
    }

    public Modelo_Persona(int id_persona, String cedula, String nombre, String apellido, char genero, Date fecha_nacimiento, String Direccion, Image foto, FileInputStream imagen, int largo) {
        super(id_persona, cedula, nombre, apellido, genero, fecha_nacimiento, Direccion, foto, imagen, largo);
    }
    
    
}
