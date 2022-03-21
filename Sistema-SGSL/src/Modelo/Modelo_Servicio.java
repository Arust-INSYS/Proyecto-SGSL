/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Empleado;
import Modelo.CLASES.Servicios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lorena
 */
public class Modelo_Servicio extends Servicios{
    Conexion_BD cpg = new Conexion_BD();
    public Modelo_Servicio() {
    }

    public Modelo_Servicio(int id_servicio, String nom_servicio, String descri_servicio, Double costo_servicio, int id_empleado) {
        super(id_servicio, nom_servicio, descri_servicio, costo_servicio, id_empleado);
    }
    
    public List<Servicios> listarServicios(){
        List<Servicios> lista = new  ArrayList<Servicios>();
        try {
            String sql ="select * from servicios";
            ResultSet rs = cpg.colsulta(sql);
            byte[] bytea;
            while(rs.next()){
                Servicios servi = new Servicios();
                servi.setId_servicio(rs.getInt("id_servicio"));
                servi.setNom_servicio(rs.getString("nom_servicio"));
                servi.setDescri_servicio(rs.getString("descri_servicio"));
                servi.setCosto_servicio(rs.getDouble("costo_servicio"));
                servi.setId_empleado(rs.getInt("id_empleado"));
                lista.add(servi);
                
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean creaServicio(){
        try {
            String sql;
            sql= "INSERT INTO Servicios (id_servicio, nom_servicio, descri_servicio, costo_servicio, id_empleado)";
            sql+="VALUES(?,?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_servicio());
            ps.setString(2, getNom_servicio());
            ps.setString(3, getDescri_servicio());
            ps.setDouble(4, getCosto_servicio());
            ps.setInt(5, getId_empleado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }
    
    public boolean ModificarServicio(){
        try {
            String sql;
            sql= "UPDATE servicios SET id_servicio=?, nom_servicio=?, descri_servicio=?, costo_servicio=?, id_empleado=? \n" +
            "WHERE id_servicio = '" +getId_servicio()+ "';";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_servicio());
            ps.setString(2, getNom_servicio());
            ps.setString(3, getDescri_servicio());
            ps.setDouble(4, getCosto_servicio());
            ps.setInt(5, getId_empleado());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
      
    public boolean RemoverServicio(String idservi){
     String nsql="DELETE FROM servicios WHERE id_servicio ='" +idservi+ "'";
     return cpg.accion(nsql);
    }
    
    
        public List<Empleado> listarEmpleados(){
        List<Empleado> lista = new  ArrayList<Empleado>();
        try {
            String sql ="select * from empleado";
            ResultSet rs = cpg.colsulta(sql);
            while(rs.next()){
                Empleado emple = new Empleado();
                emple.setId_empleado(rs.getInt("id_empleado"));
                emple.setEstado_civil(rs.getString("estado_civil"));
                emple.setFecha_contrato(rs.getDate("fecha_contrato"));
//                emple.setRol(rs.getString("rol"));
                lista.add(emple);
                
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
        
    public int IncrementoIdServicio(){
        int incremento = 1;
        try {
            String sql = "select max(id_servicio) from servicios";
            ResultSet rs = cpg.colsulta(sql);
            int aux = 200;
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return incremento;
    }
    
}
