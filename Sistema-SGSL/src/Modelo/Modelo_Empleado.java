/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Empleado;
import java.sql.Date;
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
public class Modelo_Empleado extends Empleado{
    Conexion_BD cpg = new Conexion_BD();
    
    public Modelo_Empleado() {
    }

    public Modelo_Empleado(int id_empleado, double sueldo, String estado_civil, Date fecha_contrato, int id_persona) {
        super(id_empleado, sueldo, estado_civil, fecha_contrato, id_persona);
    }
    
    
    public List<Empleado> listarEmpleados(){
        List<Empleado> lista = new  ArrayList<Empleado>();
        try {
            String sql ="select * from empleado";
            ResultSet rs = cpg.colsulta(sql);
            while(rs.next()){
                Empleado emple = new Empleado();
                emple.setId_empleado(rs.getInt("id_empleado"));
                emple.setSueldo(rs.getDouble("sueldo"));
                emple.setEstado_civil(rs.getString("estado_civil"));
                emple.setFecha_contrato(rs.getDate("fecha_contrato"));
                emple.setId_persona(rs.getInt("id_persona"));
                lista.add(emple);
                
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public boolean creaEmpleado(){
        try {
            String sql;
            sql= "INSERT INTO Empleado (id_empleado, sueldo, estado_civil, fecha_contrato, id_persona)";
            sql+="VALUES(?,?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_empleado());
            ps.setDouble(2, getSueldo());
            ps.setString(3, getEstado_civil());
            ps.setDate(4, getFecha_contrato());
            ps.setInt(5, getId_persona());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }
    
    public boolean ModificarEmpleado(){
        try {
            String sql;
            sql= "UPDATE producto SET id_empleado=?, sueldo=?, estado_civil=?, fecha_contrato=?, id_persona=? \n" +
            "WHERE id_empleado = '" +getId_empleado()+ "';";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_empleado());
            ps.setDouble(2, getSueldo());
            ps.setString(3, getEstado_civil());
            ps.setDate(4, getFecha_contrato());
            ps.setInt(5, getId_persona());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
      
    public boolean RemoverEmpleado(String idemple){
     String nsql="DELETE FROM empleado WHERE id_empleado ='" +idemple+ "'";
     return cpg.accion(nsql);
    }
    
    //logeo
    public boolean ValidarCredencial(String user, String password){
        String sql = "select p.cedula, e.contrasenia from empleado e join persona p "
                + "on e.id_persona=p.id_persona and p.cedula='"+user+ "' and e.contrasenia='"+password+"'";
            ResultSet rs = cpg.colsulta(sql);
            
        try {
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
            
       
    }
    
}
