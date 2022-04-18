 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Cliente;
import Modelo.CLASES.Pedidos;
import Modelo.CLASES.Servicios;
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
    
    //METODO PARA CARGAR LOS NOMBRE SE LOS SERVICIOS EN UN COMBO BOX
    
    public List<Servicios> combobox(){ 
        List<Servicios> lista = new ArrayList<Servicios>();
        
        try {
            String sql = "select nom_servicio from servicios";
            ResultSet rs = cpg.colsulta(sql);
            
            while (rs.next()) {
                Servicios ser = new Servicios();
                ser.setNom_servicio(rs.getString("nom_servicio"));
                
                lista.add(ser);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    } //en uso
    public List<Cliente> lista_clientes(){
        List<Cliente> lista = new ArrayList<Cliente>();
        ResultSet rs;
        String sql="";
        try {
           
               sql = "SELECT* FROM vista_cliente";
           
            
             rs = cpg.colsulta(sql);
            while (rs.next()) {
                Cliente cl = new Cliente();
//                ser.setId_servicio(rs.getInt("id_servicio"));
                  cl.setId_clienteC(rs.getInt("id_cliente"));
                  cl.setNombre(rs.getString("nombre"));
                  cl.setApellido(rs.getString("apellido"));
                lista.add(cl);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    //  
    public List<Pedidos> datos_pedido(){
        List<Pedidos> lista = new ArrayList<Pedidos>();
        ResultSet rs;
        String sql="";
        try {
           
               sql = "SELECT* FROM vista_ultimopedido";
           
            
             rs = cpg.colsulta(sql);
            while (rs.next()) {
                Pedidos pd = new Pedidos();
//                ser.setId_servicio(rs.getInt("id_servicio"));
                  pd.setTotal_servicios(rs.getDouble("pago"));
                  pd.setId_pedido(rs.getInt("id_pedido"));
                lista.add(pd);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<Cliente> buscar_clientes(String texto){
        List<Cliente> lista = new ArrayList<Cliente>();
        ResultSet rs;
        String sql="";
        try {
           
               sql = "SELECT* FROM vista_cliente WHERE UPPER(nombre) LIKE '"+texto+"%' OR "
                       + " UPPER(apellido) LIKE '"+texto+"%'";
           
            
             rs = cpg.colsulta(sql);
            while (rs.next()) {
                Cliente cl = new Cliente();
//                ser.setId_servicio(rs.getInt("id_servicio"));
                  cl.setId_clienteC(rs.getInt("id_cliente"));
                  cl.setNombre(rs.getString("nombre"));
                  cl.setApellido(rs.getString("apellido"));
                lista.add(cl);
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public List<Servicios> selecctionitem(String nom_serv){
         List<Servicios> lista = new ArrayList<Servicios>();
        try {
           
            String sql = "SELECT id_servicio FROM servicios WHERE nom_servicio='"+nom_serv+"'";
            
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                Servicios ser = new Servicios();
                ser.setId_servicio(rs.getInt("id_servicio"));
                
                lista.add(ser);
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
    } //en uso
    

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
            
    } //permite cargar el id en la vista_pedido //en uso
    
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
    }//en uso
    

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
    } //en uso
    
    public boolean Insertar_Pago() {
        try {
            String sql;
            sql = "INSERT INTO comprobante_pago (valor_cancelar, id_pedido)";
            sql += "VALUES(?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setDouble(1, getTotal_servicios());
            ps.setInt(2, getId_pedido());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Pedido.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    } //en uso
    public boolean cancelar_pedido(){
        try {
            String sql;
            sql = "UPDATE Pedido SET estado=UPPER('cancelado') WHERE id_pedido = (SELECT MAX(id_pedido) from pedido)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(1, getEstado());
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


}
