package Modelo;

import Modelo.CLASES.Bodega;
import Modelo.CLASES.Servicios;
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

    
    
    
    
}
