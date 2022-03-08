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
            
    String Conexion ="jdbc:postgresql://localhost:5433/SGSL";
    String pgUser="postgres";
    String pgPass="Arust20#";

    public Conexion_BD() {
        
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            con= DriverManager.getConnection(Conexion,pgUser,pgPass);
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public ResultSet consulta(String sql){
        
        try {
            Statement st = con.createStatement();
            return  st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            
            return null;
        }
       
    }
    
    public boolean accion(String sql){
        boolean correcto;
        try {
            Statement st = con.createStatement();
            correcto=st.execute(sql);            
            st.close();
            correcto = true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
            correcto=false;
        }
        return correcto;
    }

    public Connection getCon() {
        return con;
    }
}
