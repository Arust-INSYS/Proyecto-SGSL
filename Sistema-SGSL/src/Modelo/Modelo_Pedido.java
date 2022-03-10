 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Pedidos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Modelo_Pedido extends Pedidos {

    Conexion_BD cpg = new Conexion_BD();

    public Modelo_Pedido() {
    }

    public Modelo_Pedido(int id_pedido, Date fecha_pedido, String direccion, int cantidad_servicios, float total_servicios, int id_cliente, int id_servicio) {
        super(id_pedido, fecha_pedido, direccion, cantidad_servicios, total_servicios, id_cliente, id_servicio);
    }

    public List<Pedidos> listarPedidos() {
        List<Pedidos> lista = new ArrayList<Pedidos>();
        try {
            String sql = "select * from servicios";
            ResultSet rs = cpg.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Pedidos pedido = new Pedidos();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setFecha_pedido(rs.getDate("fecha_pedido"));
                pedido.setDireccion(rs.getString("direccion"));
                pedido.setCantidad_servicios(rs.getInt("cantidad_servicios"));
                pedido.setTotal_servicios(rs.getFloat("total_servicios"));
                pedido.setId_cliente(rs.getInt("id_cliente"));
                pedido.setId_servicio(rs.getInt("id_servicio"));

                lista.add(pedido);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean creaPedido() {
        try {
            String sql;
            sql = "INSERT INTO Pedido (id_pedido, fecha_pedido, direccion, cantida_servicios, total_servicios, id_cliente, id_servicio)";
            sql += "VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_pedido());
//            ps.setDate(2, getFecha_pedido());
            ps.setString(3, getDireccion());
            ps.setDouble(4, getCantidad_servicios());
            ps.setFloat(5, getTotal_servicios());
            ps.setInt(6, getId_cliente());
            ps.setInt(7, getId_servicio());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarPedido() {
        try {
            String sql;
            sql = "UPDATE Pedido SET id_pedido=?, fecha_pedido=?, direccion=?, cantida_servicios=?, total_servicios=?, id_cliente=?, id_servicio=? \n"
                    + "WHERE id_pedido = '" + getId_pedido() + "';";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_pedido());
//            ps.setDate(2, getFecha_pedido());
            ps.setString(3, getDireccion());
            ps.setDouble(4, getCantidad_servicios());
            ps.setFloat(5, getTotal_servicios());
            ps.setInt(6, getId_cliente());
            ps.setInt(7, getId_servicio());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean EliminarPedido(String id_pedido) {
        String nsql = "DELETE FROM Pedido WHERE id_pedido ='" + id_pedido + "'";
        return cpg.accion(nsql);
    }

    public List<Pedidos> listarPedidos(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}