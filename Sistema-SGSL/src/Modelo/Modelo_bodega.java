package Modelo;

import Modelo.CLASES.Bodega;
import Modelo.CLASES.Servicios;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Modelo_bodega extends Bodega{
        Conexion_BD  cpg = new Conexion_BD();

    public Modelo_bodega() {
    }

    public Modelo_bodega(int idbodega, int numero, int cantidad, int espacio) {
        super(idbodega, numero, cantidad, espacio);
    }
    
    public List<Bodega> listarbodegas(){
        List<Bodega> lista = new  ArrayList<Bodega>();
        try {
            String sql ="select * from bodega";
            ResultSet rs = cpg.colsulta(sql);
            while(rs.next()){
                Bodega bo = new Bodega();
                bo.setIdbodega(rs.getInt("id_bodega"));
                bo.setNumero(rs.getInt("num_bodega"));
                bo.setCantidad(rs.getInt("cantidad_bodega"));
                bo.setEspacio(rs.getInt("Espacio_bodega"));
                lista.add(bo);
                
            }
            rs.close();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public boolean creabodega(){
        try {
            String sql;
            sql= "INSERT INTO bodega (id_bodega, num_bodega,cantidad_bodega,Espacio_bodega)";
            sql+="VALUES(?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getIdbodega());
            ps.setInt(2, getNumero());
            ps.setInt(3, getCantidad());
            ps.setInt(4, getEspacio());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }
    
    public boolean editarbo(){
        try {
            String sql;
            sql= "UPDATE bodega SET id_bodegs=?, num_bodega=?, cantidad_bodega=?, Espacio_bodega=? \n" +
            "WHERE id_bodegs = '" +getIdbodega()+ "';";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getIdbodega());
            ps.setInt(2, getNumero());
            ps.setInt(3, getCantidad());
            ps.setInt(4, getEspacio());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_Servicio.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
      
    public boolean RemoverServicio(String id){
     String nsql="DELETE FROM bodega WHERE id_bodegs ='" +id+ "'";
     return cpg.accion(nsql);
    }
    


    
    
    
    
}
