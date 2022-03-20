/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Empleado;
import Modelo.CLASES.Persona;
import Modelo.CLASES.Rol;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author lorena
 */
public class Modelo_Empleado extends Empleado {

    Conexion_BD cpg = new Conexion_BD();

    public Modelo_Empleado() {
    }

    public Modelo_Empleado(int id_empleado, double sueldo, String estado_civil, Date fecha_contrato, int id_persona) {
        super(id_empleado, sueldo, estado_civil, fecha_contrato, id_persona);
    }

    public List<Empleado> listarEmpleados() {
        List<Empleado> lista = new ArrayList<Empleado>();
        try {
            String sql = "select id_empleado, sueldo, estado_civil, fecha_contrato, p.id_persona \n"
                    + "from empleado e inner join\n"
                    + "persona p\n"
                    + "on e.id_persona=p.id_persona where e.estado = 'A'";
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                Empleado emple = new Empleado();
                emple.setId_empleado(rs.getInt("id_empleado"));
                emple.setSueldo(rs.getDouble("sueldo"));
                emple.setEstado_civil(rs.getString("estado_civil"));
                emple.setFecha_contrato(rs.getDate("fecha_contrato"));
                emple.setId_persona(rs.getInt("id_persona"));
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

    public boolean creaEmpleado() {
        try {
            String sql;
            sql = "INSERT INTO Empleado (id_empleado, sueldo, estado_civil, fecha_contrato, id_persona, estado)";
            sql += "VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_empleado());
            ps.setDouble(2, getSueldo());
            ps.setString(3, getEstado_civil());
            ps.setDate(4, getFecha_contrato());
            ps.setInt(5, getId_persona());
            ps.setString(6, "A");
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarEmpleado() {
        try {
            String sql;
            sql = "UPDATE producto SET id_empleado=?, sueldo=?, estado_civil=?, fecha_contrato=?, id_persona=? \n"
                    + "WHERE id_empleado = '" + getId_empleado() + "';";
            sql = "UPDATE Empleado SET id_empleado=?, sueldo=?, estado_civil=?, fecha_contrato=?, id_persona=? \n"
                    + "WHERE id_empleado = '" + getId_empleado() + "';";
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

    public boolean RemoverEmpleado(String idemple) {
        String nsql = "DELETE FROM empleado WHERE id_empleado ='" + idemple + "'";
        return cpg.accion(nsql);
    }

    public List<Persona> listarPersonas() {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select *from persona";
            ResultSet rs = cpg.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt("id_persona"));
                persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                bytea = rs.getBytes("foto");
                if (bytea != null) {
                    try {
                        persona.setFoto(obtenerImagen(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                lp.add(persona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private Image obtenerImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }

    public int IncrementoIdEmpleado() {
        int incremento = 1;
        try {
            String sql = "select max(id_empleado) from empleado";
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

    public int IdRol(String nombre_rol) {
        int id_rol = -1;
        String sql = "select id_rol as id from roles where upper(nombre_rol)=upper('" + nombre_rol + "')";

        ResultSet rs = cpg.colsulta(sql);

        try {
            if (rs.next()) {
                id_rol = rs.getInt("id");
            }

            return id_rol;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public List <Rol> llenarComboRol(){
        List<Rol> rl = new ArrayList<Rol>();
        try {
            String sql = "select *from roles";
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                Rol r = new Rol();
                r.setId_rol(rs.getInt("id_rol"));
                r.setNombre_rol(rs.getString("nombre_rol"));
                
                rl.add(r);
            }
            rs.close();
            return rl;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public int IncrementoIdUsuario() {
        int incremento = 1;
        try {
            String sql = "select max(id_usuario) from usuario";
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return incremento;
    }
  
    public boolean CrearUser(int id_empleado, int id_rol, int id_user){
        try {
            String sql;
            sql = "INSERT INTO usuario (id_usuario, pasword, id_empleado, id_rol)";
            sql += "VALUES(?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, id_user);
            ps.setString(2, "Default");
            ps.setInt(3, id_empleado);
            ps.setInt(4, id_rol);
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Empleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
      public List<Empleado> BuscarEmple(String id_cli) {
        List<Empleado> listaEmple = new ArrayList<Empleado>();
        try {
//            String sql = "select * from cliente where estado = 'A' and CAST(id_cliente AS TEXT) LIKE '" + id_cli + "%' or estado = 'A' and CAST(id_persona AS TEXT) LIKE '" + id_cli + "%';";

            String sql = "select * from empleado where "
                    + "from empleado e inner join"
                    + "persona p"
                    + "on c.id_persona=p.id_persona"
                    + "e.estado = 'A' and CAST(id_empleado AS TEXT) LIKE '" + id_cli + "%' or c.estado = 'A' and CAST(id_persona AS TEXT) LIKE '" + id_cli + "%';";
            ResultSet rs = cpg.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Empleado emple = new Empleado();
                emple.setId_empleado(rs.getInt("id_empleado"));
                emple.setSueldo(rs.getDouble("sueldo"));
                emple.setEstado_civil(rs.getString("estado_civil"));
                emple.setFecha_contrato(rs.getDate("fecha_contrato"));
                emple.setId_persona(rs.getInt("id_persona"));
                listaEmple.add(emple);
            }
            rs.close();
            return listaEmple;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
