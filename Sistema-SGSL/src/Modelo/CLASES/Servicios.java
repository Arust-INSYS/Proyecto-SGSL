/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

/**
 *
 * @author lorena
 */
public class Servicios {
    private int id_servicio;
    private String nom_servicio;
    private String descri_servicio;
    private Double costo_servicio;
    private int id_empleado;

    public Servicios() {
    }

    public Servicios(int id_servicio, String nom_servicio, String descri_servicio, Double costo_servicio, int id_empleado) {
        this.id_servicio = id_servicio;
        this.nom_servicio = nom_servicio;
        this.descri_servicio = descri_servicio;
        this.costo_servicio = costo_servicio;
        this.id_empleado = id_empleado;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNom_servicio() {
        return nom_servicio;
    }

    public void setNom_servicio(String nom_servicio) {
        this.nom_servicio = nom_servicio;
    }

    public String getDescri_servicio() {
        return descri_servicio;
    }

    public void setDescri_servicio(String descri_servicio) {
        this.descri_servicio = descri_servicio;
    }

    public Double getCosto_servicio() {
        return costo_servicio;
    }

    public void setCosto_servicio(Double costo_servicio) {
        this.costo_servicio = costo_servicio;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }
    
    
}
