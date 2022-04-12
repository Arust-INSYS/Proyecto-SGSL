/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

/**
 *
 * @author Arust
 */
public class Detalle_Pedido {
    
   private int id_detalle;
   private String nom_servicio;
   private String direccion;
   private int id_pedido;
   private int id_servicio;

    public Detalle_Pedido() {
    }

    public Detalle_Pedido(int id_detalle, String nom_servicio, String direccion, int id_pedido, int id_servicio) {
        this.id_detalle = id_detalle;
        this.nom_servicio = nom_servicio;
        this.direccion = direccion;
        this.id_pedido = id_pedido;
        this.id_servicio = id_servicio;
    }
    
    

    public int getId_detalle() {
        return id_detalle;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public String getNom_servicio() {
        return nom_servicio;
    }

    public void setNom_servicio(String num_servicio) {
        this.nom_servicio = nom_servicio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }
   
   
    
}
