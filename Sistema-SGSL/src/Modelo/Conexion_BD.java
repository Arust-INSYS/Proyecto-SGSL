/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arust
 */
public class Conexion_BD {
    Connection con;

    String cadConexion = "jdbc:postgresql://localhost:5432/d77vqcomjq39mn";
    String pgUser = "vkixawnamrivic";
    String pgPass = "c9e001aabc86d62df5ceefb07e8859c8c569046a935bb10875c9870d89745b51";

    public Conexion_BD() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection(cadConexion, pgUser, pgPass);
            System.out.println("Conexion OK.");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet colsulta(String sql) {
        try {
            Statement st = con.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean accion(String sql){
        boolean correcto = true;
        try {
            Statement st = con.createStatement();
            st.execute(sql);
            st.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            correcto = false;
        }
        return correcto;
    }

   
    public Connection getCon() {
        return con;
    }
}
