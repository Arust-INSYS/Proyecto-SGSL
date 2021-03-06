/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Persona;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
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
 * @author DELL
 */
public class Modelo_Persona extends Persona {

    //Instancia de la clase conexión de la base de datos.
    Conexion_BD cp = new Conexion_BD();

    //Constructores.
    public Modelo_Persona() {
    }

    public Modelo_Persona(int id_persona, String cedula, String nombre, String apellido, String genero, Date fecha_nacimiento, String Direccion, Image foto) {
        super(id_persona, cedula, nombre, apellido, genero, fecha_nacimiento, Direccion, foto);
    }

    //Método que permite traer todos los atributos de la base de todos cuando su estado sea activo.
    public List<Persona> listarPersonas() {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select *from persona where estado = 'A'";
            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt("id_persona"));
                persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setGenero(rs.getString("genero"));
                persona.setFecha_nacimiento(rs.getDate("Fecha_nacimiento"));
                persona.setDireccion(rs.getString("Dirección"));
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
    
    public List<Persona> listarPersonasAC() {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select * from persona";
            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt("id_persona"));
                persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setGenero(rs.getString("genero"));
                persona.setFecha_nacimiento(rs.getDate("Fecha_nacimiento"));
                persona.setDireccion(rs.getString("Dirección"));
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
    
    //Método que permite buscar a una persona mediante diferentes atributos.
    public List<Persona> BuscarPersonas(String busqueda) {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select * from persona where estado = 'A' and CAST(id_persona AS TEXT) LIKE '" + busqueda + "%' or estado = 'A' and cedula like '" + busqueda + "%' or estado = 'A' and lower(nombre) like '" + busqueda + "%' or estado = 'A' and lower(apellido) like '" + busqueda + "%';";
            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setId_persona(rs.getInt("id_persona"));
                persona.setCedula(rs.getString("cedula"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setGenero(rs.getString("genero"));
                persona.setFecha_nacimiento(rs.getDate("Fecha_nacimiento"));
                persona.setDireccion(rs.getString("Dirección"));
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
    
    //Método que permite buscar a una persona.
    public List<Persona> BuscarPersonasCedula(String cedula) {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select id_persona, cedula, nombre, apellido from persona where cedula like '" + cedula + "%' or estado = 'A';";
            ResultSet rs = cp.colsulta(sql);
            while (rs.next()) {
                Persona persona2 = new Persona();
                persona2.setId_persona(rs.getInt("id_persona"));
                persona2.setCedula(rs.getString("cedula"));
                persona2.setNombre(rs.getString("nombre"));
                persona2.setApellido(rs.getString("apellido"));
                lp.add(persona2);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    //Método que permite la renderización una imagen obtenida desde la base de datos.
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

    //Método que permite crear una persona, con una foto.
    public boolean CrearPersonaBDA() {
        try {
            String sql = "INSERT INTO public.persona(\n"
                    + "	id_persona, cedula, nombre, apellido, genero, fecha_nacimiento, dirección, foto, estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getId_persona());
            ps.setString(2, getCedula());
            ps.setString(3, getNombre());
            ps.setString(4, getApellido());
            ps.setString(5, getGenero());
            ps.setDate(6, (java.sql.Date) getFecha_nacimiento());
            ps.setString(7, getDireccion());
            ps.setBinaryStream(8, getImagen(), getLargo());
            ps.setString(9, "A");
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Método que permite modificar una persona, con una foto.
    public boolean CrearPersonaFT() {
        try {
            String sql = "INSERT INTO public.persona(\n"
                    + "	id_persona, cedula, nombre, apellido, genero, fecha_nacimiento, dirección, estado)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getId_persona());
            ps.setString(2, getCedula());
            ps.setString(3, getNombre());
            ps.setString(4, getApellido());
            ps.setString(5, getGenero());
            ps.setDate(6, (java.sql.Date) getFecha_nacimiento());
            ps.setString(7, getDireccion());
            ps.setString(8, "A");
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    

    //Método que permite modificar una persona, sin una foto.
    public boolean ModificarPersonaBDA() {
        try {
            String sql = "UPDATE public.persona\n"
                    + "	SET cedula=?, nombre=?, apellido=?, genero=?, fecha_nacimiento=?, dirección=?, foto=?\n"
                    + "	WHERE id_persona='"+getId_persona()+"';";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4, getGenero());
            ps.setDate(5, (java.sql.Date) getFecha_nacimiento());
            ps.setString(6, getDireccion());
            ps.setBinaryStream(7, getImagen(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public boolean ModificarPersonaFT() {
        try {
            String sql = "UPDATE public.persona\n"
                    + "	SET cedula=?, nombre=?, apellido=?, genero=?, fecha_nacimiento=?, dirección=?\n"
                    + "	WHERE id_persona='"+getId_persona()+"';";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getNombre());
            ps.setString(3, getApellido());
            ps.setString(4, getGenero());
            ps.setDate(5, (java.sql.Date) getFecha_nacimiento());
            ps.setString(6, getDireccion());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Método que permite hacer un eliminado lógico de la base de datos.
    public boolean EliminarPersona(int idperosna) {
        String sql = "UPDATE persona SET estado = 'I' WHERE id_persona = '" + idperosna + "';";
        System.out.println("" + sql);
        return cp.accion(sql);
    }
    
    //Método que permite incrementar el ID del atributo de la entidad Persona.
    public int IncrementoIdPersona(){
        int incremento = 1;
        try {
            String sql = "select max(id_persona) from persona";
            ResultSet rs = cp.colsulta(sql);
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return incremento;
    }
    
      public List<Persona> DatosUsuario(String busqueda) {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select p.nombre as nombre, p.apellido as apellido, r.nombre_rol as rol from persona p "
                    + "join empleado e "
                    + "on p.id_persona=e.id_persona "
                    + "join usuario u "
                    + "on e.id_empleado=u.id_empleado "
                    + "join roles r "
                    + "on u.id_rol=r.id_rol and p.cedula='"+busqueda+"'";
            ResultSet rs = cp.colsulta(sql);
            while (rs.next()) {
                Persona persona = new Persona();
                persona.setCedula(rs.getString("rol"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                lp.add(persona);
            }
            rs.close();
            return lp;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}