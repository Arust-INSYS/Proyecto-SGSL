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
    

    public List<Cliente> listarClientesBDA() {
        List<Cliente> listaCli = new ArrayList<Cliente>();
        try {
            String sql = "select * from cliente";
            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_clienteC(rs.getInt("id_cliente"));
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
            String sql = "select * from cliente where CAST(id_cliente AS TEXT) LIKE '" + id_cli + "%' or CAST(id_persona AS TEXT) LIKE '" + id_cli + "%'";
            ResultSet rs = cp.colsulta(sql);
            byte[] bytea;
            while (rs.next()) {
                Cliente client = new Cliente();
                client.setId_clienteC(rs.getInt("id_cliente"));
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
                    + "	id_cliente, telefono, id_persona)\n"
                    + "	VALUES (?, ?, ?);";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getId_clienteC());
            ps.setString(2, getTelefono());
            ps.setInt(3, getId_personaCI());
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
                    + "	WHERE id_cliente ='"+getId_clienteC()+"';";
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
    public int IncrementoIdCliente(){
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