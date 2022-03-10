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
 * @author DELL
 */
public class Modelo_Persona extends Persona {

    Conexion_BD cp = new Conexion_BD();

    public Modelo_Persona() {
    }

    public Modelo_Persona(int id_persona, String cedula, String nombre, String apellido, String genero, Date fecha_nacimiento, String Direccion, Image foto) {
        super(id_persona, cedula, nombre, apellido, genero, fecha_nacimiento, Direccion, foto);
    }

    public List<Persona> listarPersonas() {
        List<Persona> lp = new ArrayList<Persona>();
        try {
            String sql = "select *from persona";
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

    public boolean CrearPersonaBDA() {
        try {
            String sql = "INSERT INTO public.persona(\n"
                    + "	id_persona, cedula, nombre, apellido, genero, fecha_nacimiento, dirección, foto)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getId_persona());
            ps.setString(2, getCedula());
            ps.setString(3, getNombre());
            ps.setString(4, getApellido());
            ps.setString(5, getGenero());
            ps.setDate(6, getFecha_nacimiento());
            ps.setString(7, getDireccion());
            ps.setBinaryStream(8, getImagen(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarPersonaBDA() {
        try {
            String sql = "UPDATE public.persona\n"
                    + "	SET nombre=?, apellido=?, genero=?, fecha_nacimiento=?, dirección=?, foto=?\n"
                    + "	WHERE <condition>;";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setString(1, getNombre());
            ps.setString(2, getApellido());
            ps.setString(3, getGenero());
            ps.setDate(4, getFecha_nacimiento());
            ps.setString(5, getDireccion());
            ps.setBinaryStream(6, getImagen(), getLargo());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public int IncrementoIdPersona(){
        int incremento = 1;
        try {
            String sql = "select max(id_persona) from persona";
            ResultSet rs = cp.colsulta(sql);
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
                System.out.println("Si in");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error");
        }
        return incremento;
    }

}
