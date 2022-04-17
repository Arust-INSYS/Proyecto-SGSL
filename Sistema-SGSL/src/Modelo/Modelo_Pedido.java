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

    public Modelo_Pedido(int id_pedido, Date fecha_pedido, int cantidad_servicios, double total_servicios, int id_cliente) {
        super(id_pedido, fecha_pedido, cantidad_servicios, total_servicios, id_cliente);
    }

    public List<Pedidos> listarPedidos() {
        List<Pedidos> lista = new ArrayList<Pedidos>();
        try {
            String sql = "select * from pedido";
            ResultSet rs = cpg.colsulta(sql);
            
            while (rs.next()) {
                Pedidos pedido = new Pedidos();
                pedido.setId_pedido(rs.getInt("id_pedido"));
                pedido.setFecha_pedido(rs.getDate("fecha_pedido"));
//                pedido.setDireccion(rs.getString("direccion"));
                pedido.setCantidad_servicios(rs.getInt("cantidad_servicios"));
//                pedido.setTotal_servicios(rs.getDouble("total_servicios"));
                pedido.setId_cliente(rs.getInt("id_cliente"));
//                pedido.setId_servicio(rs.getInt("id_servicio"));

                lista.add(pedido);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Pedidos> cargarValores(){
        List<Pedidos> lista = new ArrayList<Pedidos>();
         try {
            String sql = "select cantidad_servicios,total_servicios  from pedido";
            ResultSet rs = cpg.colsulta(sql);
            
            while (rs.next()) {
                Pedidos pedido = new Pedidos();                
                
                pedido.setCantidad_servicios(rs.getInt("cantidad_servicios"));
                pedido.setTotal_servicios(rs.getDouble("total_servicios"));

                lista.add(pedido);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    

    public List<Pedidos>  id_pedido(){
        
        List<Pedidos> lista = new ArrayList<Pedidos>();
        String sql = "select id_pedido from pedido";
            ResultSet rs = cpg.colsulta(sql);
            
        try {
            while (rs.next()) {
                Pedidos pedido = new Pedidos();
                pedido.setId_pedido(rs.getInt("id_pedido"));

                lista.add(pedido);

            }
            rs.close();
            
            return lista;
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
            
    } //permite cargar el id en la vista_pedido
    
    ////////////////////////////////////////////////////////////////////////////////////////////
    //VALIDACIÓN DE EXISTENCIA
    public int existe_pedido(int id_pedido){
        String sql = "SELECT COUNT(id_pedido) FROM pedido WHERE id_pedido=?";
        
        
        try {
            
            ResultSet rs = null;
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, id_pedido);
            
            rs=ps.executeQuery();
            
           
            if(rs.next()){
                
               return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    

    public boolean Insertar_Pedido() {
        try {
            String sql;
            sql = "INSERT INTO Pedido (cantidad_servicios, total_servicios, id_cliente)";
            sql += "VALUES(?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getCantidad_servicios());
            ps.setDouble(2, getTotal_servicios());
            ps.setInt(3, getId_cliente());
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
//            ps.setString(3, getDireccion());
            ps.setInt(4, getCantidad_servicios());
            ps.setDouble(5, getTotal_servicios());
            ps.setInt(6, getId_cliente());
//            ps.setInt(7, getId_servicio());
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
