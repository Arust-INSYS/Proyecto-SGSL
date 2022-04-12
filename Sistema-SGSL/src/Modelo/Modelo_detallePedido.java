/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Detalle_Pedido;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arust
 */
public class Modelo_detallePedido extends Detalle_Pedido {
    
    Conexion_BD cpg = new Conexion_BD();

    public Modelo_detallePedido(int id_detalle, String num_servicio, String direccion, int id_pedido, int id_servicio) {
        super(id_detalle, num_servicio, direccion, id_pedido, id_servicio);
    }

    public Modelo_detallePedido() {
    }
    
    
    public boolean Insertar_DetPedido() {
        try {
            String sql;
            sql = "INSERT INTO detalle_pedido (nom_servicio, direccion, id_pedido, id_servicio)";
            sql += "VALUES(?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            
            ps.setString(1, getNom_servicio());
            ps.setString(2, getDireccion());
            ps.setInt(3, getId_pedido());
            ps.setInt(4, getId_servicio());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_detallePedido.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
