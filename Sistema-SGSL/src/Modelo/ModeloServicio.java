/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.CLASES.Servicios;
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
public class ModeloServicio extends Servicios{
    Conexion_BD cpg = new Conexion_BD();
    public ModeloServicio() {
    }

    public ModeloServicio(int id_servicio, String nom_servicio, String descri_servicio, Double costo_servicio, int id_empleado) {
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
            Logger.getLogger(ModeloServicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
