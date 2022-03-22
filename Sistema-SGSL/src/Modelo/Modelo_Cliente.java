/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Cliente;
import java.awt.Image;
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
 * @author DELL
 */
public class Modelo_Cliente extends Cliente {

    Conexion_BD cp = new Conexion_BD();

    public Modelo_Cliente() {
    }

    public Modelo_Cliente(int id_clienteC, String telefono, int id_personaCI) {
        super(id_clienteC, telefono, id_personaCI);
    }

    public Modelo_Cliente(int id_clienteC, String telefono, int id_personaCI, String apellido, String nombre) {
        super(id_clienteC, telefono, id_personaCI, apellido, nombre);
    }

    public List<Cliente> listarClientesBDA() {
        List<Cliente> listaCli = new ArrayList<Cliente>();
        try {
//            String sql = "select * from cliente where estado = 'A'";
            String sql = "select id_cliente, apellido, nombre, telefono, p.id_persona \n"
                    + "from cliente c inner join\n"
                    + "persona p\n"
                    + "on c.id_persona=p.id_persona where c.estado = 'A'";
            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_clienteC(rs.getInt("id_cliente"));
                client.setApellido(rs.getString("apellido"));
                client.setNombre(rs.getString("nombre"));
                client.setTelefono(rs.getString("telefono"));
                client.setId_personaCI(rs.getInt("id_persona"));
                listaCli.add(client);
            }
            rs.close();
            return listaCli;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Cliente> BuscarCliente(String id_cli) {
        List<Cliente> listaCli = new ArrayList<Cliente>();
        try {
//            String sql = "select * from cliente where estado = 'A' and CAST(id_cliente AS TEXT) LIKE '" + id_cli + "%' or estado = 'A' and CAST(id_persona AS TEXT) LIKE '" + id_cli + "%';";

            //String sql = "select c.id_cliente, p.apellido, p.nombre, c.telefono, c.id_persona from cliente c inner join persona p on c.id_persona = p.id_persona and c.estado = 'A' and CAST(c.id_cliente AS TEXT) LIKE '" + id_cli + "%' or c.estado = 'A' and CAST(c.id_persona AS TEXT) LIKE '" + id_cli + "%';";
            String sql = "select c.id_cliente, p.apellido, p.nombre, c.telefono, c.id_persona from cliente c inner join persona p on c.id_persona = p.id_persona where c.estado = 'A' and CAST(c.id_cliente AS TEXT) LIKE '" + id_cli + "%' or c.estado = 'A' and CAST(c.id_persona AS TEXT) LIKE '" + id_cli + "%';";

            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_clienteC(rs.getInt("id_cliente"));
                client.setApellido(rs.getString("apellido"));
                client.setNombre(rs.getString("nombre"));
                client.setTelefono(rs.getString("telefono"));
                client.setId_personaCI(rs.getInt("id_persona"));
                listaCli.add(client);
            }
            rs.close();
            return listaCli;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public boolean CrearClienteBDA() {
        try {
            String sql = "INSERT INTO public.cliente(\n"
                    + "	id_cliente, telefono, id_persona, estado)\n"
                    + "	VALUES (?, ?, ?, ?);";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getId_clienteC());
            ps.setString(2, getTelefono());
            ps.setInt(3, getId_personaCI());
            ps.setString(4, "A");
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarClienteBDA() {
        try {
            String sql = "UPDATE public.cliente\n"
                    + "	SET telefono=?, id_persona=?\n"
                    + "	WHERE id_cliente ='" + getId_clienteC() + "';";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setString(1, getTelefono());
            ps.setInt(2, getId_personaCI());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Persona.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Eliminado logico de cliente. 
    public boolean EliminarCliente(int idcliente) {
        String sql = "UPDATE cliente SET estado = 'I' WHERE id_cliente = '" + idcliente + "';";
        System.out.println("" + sql);
        return cp.accion(sql);
    }

    //Eliminado logico de persona hacia la tabla de cliente.
    public boolean EliminarPersonaCli(int idperosna) {
        String sql = "UPDATE cliente SET estado = 'I' WHERE id_persona = '" + idperosna + "';";
        System.out.println("" + sql);
        return cp.accion(sql);
    }

    public int IncrementoIdCliente() {
        int incremento = 1;
        try {
            String sql = "select max(id_cliente) from cliente";
            ResultSet rs = cp.colsulta(sql);
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return incremento;
    }
}
