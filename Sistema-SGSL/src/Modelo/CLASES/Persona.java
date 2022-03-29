/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

import java.awt.Image;
import java.io.FileInputStream;
import java.util.Date;

/**
 *
 * @author DELL
 */
//Creación de la clase persona.
public class Persona {
    //Creación de los atributos de la persona.
    private int id_persona;
    private String cedula;
    private String nombre;
    private String apellido;
    private String genero;
    private Date fecha_nacimiento;
    private String Direccion;
    private Image foto;
    
    //-----Atributos 
    private FileInputStream imagen;
    private int largo;

    //Constructores de la clase persona.
    public Persona() {
    }

    public Persona(int id_persona, String cedula, String nombre, String apellido, String genero, Date fecha_nacimiento, String Direccion, Image foto) {
        this.id_persona = id_persona;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.Direccion = Direccion;
        this.foto = foto;
    }
    //Fin de Constructores de la clase persona.

    //Creación de los getter y setters.
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
}
