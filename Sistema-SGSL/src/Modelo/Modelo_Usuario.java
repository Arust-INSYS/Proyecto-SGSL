/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Modelo_Usuario extends Usuario {

    Conexion_BD cpg = new Conexion_BD();

    public Modelo_Usuario() {
    }

    public Modelo_Usuario(String cedula, String contrasenia, int id_empleado, int id_rol) {
        super(cedula, contrasenia, id_empleado, id_rol);
    }

    public List<Usuario> listarUsuario() {
        List<Usuario> lista = new ArrayList<Usuario>();
        try {
            String sql = "select * from usuario";
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                Usuario user = new Usuario();
                user.setCedula(rs.getString("cedula"));
                user.setContrasenia(rs.getString("contrasenia"));
                user.setId_empleado(rs.getInt("id_empleado"));
                user.setId_rol(rs.getInt("id_persona"));
                lista.add(user);

            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean creaUsuario() {
        try {
            String sql;
            sql = "INSERT INTO usuario (pasword, id_empleado, id_rol, id_usuario)";
            sql += "VALUES(?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setString(1, getCedula());
            ps.setString(2, getContrasenia());
            ps.setInt(3, getId_empleado());
            ps.setInt(4, getId_rol());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //logeo
    public boolean ValidarCredencial(String user, String password) {
        String sql = "select p.id_persona, u.pasword "
                + "from usuario u join empleado e "
                + "on u.id_empleado=e.id_empleado "
                + "join persona p "
                + "on e.id_persona=p.id_persona and p.cedula='" + user + "' and u.pasword='" + password + "'";
        ResultSet rs = cpg.colsulta(sql);

        try {
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    //Registro_Usuario
    //validacion de la cedula del usuario
    public int validarUsuario(String user) {
        int id_empleado = -1;
        String sql = "select e.id_empleado as id from empleado e join persona p "
                + "on e.id_persona=p.id_persona and p.cedula='" + user + "'";
        ResultSet rs = cpg.colsulta(sql);

        try {
            if (rs.next()) {
                id_empleado = rs.getInt("id");
            }

            return id_empleado;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }

    }

    public boolean GuardarContraseña(String password, int id) {
        String sql = "update usuario set pasword ='" + password + "'"
                + " where id_usuario= '" + id + "'";

        return cpg.accion(sql);

    }

//para q no se repita el usuario
    public boolean VerificarU(int id) {
        String pass = "";
        String sql = "select pasword from usuario  where id_empleado = " + id + "";

        ResultSet rs = cpg.colsulta(sql);

        try {
            if (rs.next()) {
                pass=rs.getString("pasword");
            }
            if(pass.equals("contra")){
               return true; 
            }else{
                return false;
            }
            

        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Usuario.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

}
