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
    private int cantidad_servicios;
    private double total_servicios;
    private int id_cliente;
    private String estado;

    public Pedidos() {
    }

    public Pedidos(int id_pedido, Date fecha_pedido, int cantidad_servicios, double total_servicios, int id_cliente) {
        this.id_pedido = id_pedido;
        this.fecha_pedido = fecha_pedido;
        this.cantidad_servicios = cantidad_servicios;
        this.total_servicios = total_servicios;
        this.id_cliente = id_cliente;
        
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


    public int getCantidad_servicios() {
        return cantidad_servicios;
    }

    public void setCantidad_servicios(int cantidad_servicios) {
        this.cantidad_servicios = cantidad_servicios;
    }

    public double getTotal_servicios() {
        return total_servicios;
    }

    public void setTotal_servicios(double total_servicios) {
        this.total_servicios = total_servicios;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


   

}
