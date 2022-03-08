/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.CLASES;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Pedidos {
    private int id_pedido;
    private Date fecha_pedido;
    private String direccion;
    private int cantidad_servicios;
     private float total_servicios;
    private int id_cliente;
    private int id_servicio;

    public Pedidos() {
    }

    public Pedidos(int id_pedido, Date fecha_pedido, String direccion, int cantidad_servicios, float total_servicios, int id_cliente, int id_servicio) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.direccion = direccion;
        this.cantidad_servicios = cantidad_servicios;
        this.total_servicios = total_servicios;
        this.id_cliente = id_cliente;
        this.id_servicio = id_servicio;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_pedido() {
        return fecha_pedido;
    }

    public void setFecha_pedido(Date fecha_pedido) {
        this.fecha_pedido = fecha_pedido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantidad_servicios() {
        return cantidad_servicios;
    }

    public void setCantidad_servicios(int cantidad_servicios) {
        this.cantidad_servicios = cantidad_servicios;
    }

    public float getTotal_servicios() {
        return total_servicios;
    }

    public void setTotal_servicios(float total_servicios) {
        this.total_servicios = total_servicios;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

   

}
