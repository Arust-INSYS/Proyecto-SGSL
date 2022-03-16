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
            String sql ="select * from bodegas";
            ResultSet rs = cpg.colsulta(sql);
            while(rs.next()){
                Bodega bo = new Bodega();
                bo.setIdbodega(rs.getInt("id_bodega"));
                bo.setNumero(rs.getInt("num_bodega"));
                bo.setCantidad(rs.getInt("cantidad_bodega"));
                bo.setEspacio(rs.getInt("espacio_bo"));
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
            sql= "INSERT INTO bodegas (id_bodega,num_bodega,cantidad_bodega,espacio_bo )VALUES(?,?,?,?)";
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
            sql= "UPDATE bodegas SET id_bodega=?, num_bodega=?, cantidad_bodega=?, espacio_bo=? \n" +
            "WHERE id_bodega = '" +getIdbodega()+ "';";
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
      
    public boolean eliminarbodega(String id){
     String nsql="DELETE FROM bodegas WHERE id_bodega ='" +id+ "'";
     return cpg.accion(nsql);
    }
    public int Incrementoodega(){
        int incremento = 1;
        try {
            String sql = "select max(id_bodega) from bodegas";
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return incremento;
    }
    
            public List<Bodega> listarperbusquedabodega(String busqueda) {
        List<Bodega> listbus = new ArrayList<Bodega>();
        String sql = "";
        String plb = busqueda;
        if (busqueda.equalsIgnoreCase("")) {
            sql = "select *from bodegas";
        } else if (plb.equalsIgnoreCase(busqueda)) {
            sql = "select * from bodegas where CAST(id_bodega AS TEXT) LIKE '" + busqueda + "%' ";
        }
        ResultSet r = cpg.colsulta(sql);
        try {
            while (r.next()) {
                Bodega bo = new Bodega();
                bo.setIdbodega(r.getInt("id_bodega"));
                bo.setNumero(r.getInt("num_bodega"));
                bo.setCantidad(r.getInt("cantidad_bodega"));
                bo.setEspacio(r.getInt("espacio_bo"));
                listbus.add(bo);
            }
            r.close();
            return listbus;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
