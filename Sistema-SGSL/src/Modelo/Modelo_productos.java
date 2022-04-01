package Modelo;
import Modelo.CLASES.Bodega;
import Modelo.CLASES.Productos;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

public class Modelo_productos extends Productos{
//conexion    
        Conexion_BD  cpg = new Conexion_BD();
//construtor vacio
    public Modelo_productos() {
    }
//construtor vacio
    public Modelo_productos(int id_producto, String nom_producto, double precio_producto, int cantidad_producto, String marcar_producto, Image foto, FileInputStream imagen, int largo, int id_bodega) {
        super(id_producto, nom_producto, precio_producto, cantidad_producto, marcar_producto, foto, imagen, largo, id_bodega);
    }
//metodo sql para llamar a los productos con foto a la tabla
    public List<Productos> listarproductos() {
        List<Productos> listaprod = new ArrayList<Productos>();
            System.out.println("1m");
        String sql = "select id_producto,nom_producto,precio_producto,cantidad_producto,marcar_producto,foto_producto,id_bodega from productos WHERE estado = 'A'";
        ResultSet r = cpg.colsulta(sql);
        byte[] bytes;
        try {
            while (r.next()) {
                Productos producto = new Productos();
                producto.setId_producto(r.getInt("id_producto"));
                producto.setNom_producto(r.getString("nom_producto"));
                producto.setPrecio_producto(r.getDouble("precio_producto"));
                producto.setCantidad_producto(r.getInt("cantidad_producto"));
                producto.setMarcar_producto(r.getString("marcar_producto"));
                bytes = r.getBytes("foto_producto");
                producto.setId_bodega(r.getInt("id_bodega"));
                        if (bytes != null) {
                    try {
                        producto.setFoto(obtenerImagen(bytes));
                    } catch (IOException ex) {
                        Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                System.out.println("123");
                listaprod.add(producto);
            }
            r.close();
            System.out.println("ass");
            return listaprod;
        } catch (SQLException ex) {
          Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        }
//metodo para obtener la foto de la pc       
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
//metodo sql para crear a los productos con foto 
    public boolean crearprocduc() {
        try {
            String sql = "INSERT INTO productos(id_producto,nom_producto,precio_producto,cantidad_producto,marcar_producto,foto_producto,id_bodega,estado)\n" + "VALUES(?,?,?,?,?,?,?,'A')";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_producto());
            ps.setString(2, getNom_producto());
            ps.setDouble(3, getPrecio_producto());
            ps.setInt(4, getCantidad_producto());
            ps.setString(5, getMarcar_producto());
            ps.setBinaryStream(6, getImagen(), getLargo());
            ps.setInt(7, getId_bodega());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
//metodo sql para crear a los productos sin foto 
    public boolean crearprocducsinfoto() {
        try {
            String sql = "INSERT INTO productos(id_producto,nom_producto,precio_producto,cantidad_producto,marcar_producto,id_bodega,estado)\n" + "VALUES(?,?,?,?,?,?,'A')";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_producto());
            ps.setString(2, getNom_producto());
            ps.setDouble(3, getPrecio_producto());
            ps.setInt(4, getCantidad_producto());
            ps.setString(5, getMarcar_producto());
            ps.setInt(6, getId_bodega());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
//metodo sql para editar a los productos con foto 
            public boolean edipro(String id) {
        try {
            String sql = "UPDATE productos SET id_producto=?, nom_producto=?,precio_producto=?,cantidad_producto=?, marca_producto=?, foto_producto=?,id_bodega=? WHERE id_producto ='" + id + "'";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_producto());
            ps.setString(2, getNom_producto());
            ps.setDouble(3, getPrecio_producto());
            ps.setInt(4, getCantidad_producto());
            ps.setString(5, getMarcar_producto());
            ps.setBinaryStream(6, getImagen(), getLargo());
            ps.setInt(7, getId_bodega());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
//metodo sql para editar a los productos sin foto 
            public boolean editarpro(String id) {
        try {
            String sql = "UPDATE productos SET id_producto=?, nom_producto=?, precio_producto=?, cantidad_producto=?, marcar_producto=?, id_bodega=? WHERE id_producto ='" + id + "'";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_producto());
            ps.setString(2, getNom_producto());
            ps.setDouble(3, getPrecio_producto());
            ps.setInt(4, getCantidad_producto());
            ps.setString(5, getMarcar_producto());
            ps.setInt(6, getId_bodega());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
//metodo sql para eliminar a los productos 
            public boolean eliminapro(String id) {
            String sql= "UPDATE productos SET estado='I' WHERE id_producto='" + id+ "'";
           // String sql = "delete from productos WHERE  id_producto ='" + id + "'";
        System.out.println("" + sql);
        return cpg.accion(sql);
    }
    //metodo sql para buscar a los productos 
            public List<Productos> listarperbusqueda(String busqueda) {
        List<Productos> listbus = new ArrayList<Productos>();
        String sql = "";
        String plb = busqueda;
        if (busqueda.equalsIgnoreCase("")) {
          //  sql = "select *from productos";
      sql="select * from productos WHERE estado = 'A'";
        
        } else if (plb.equalsIgnoreCase(busqueda)) {
            sql = "select * from productos where  estado='A' and CAST(id_producto AS TEXT) LIKE '" + busqueda + "%' or estado='A' and lower(nom_producto) like '"+busqueda  + "%' or estado='A' and lower(marcar_producto) like '" + busqueda + "%'  ";
        }
        ResultSet r = cpg.colsulta(sql);
        byte[] bytes;
        try {
            while (r.next()) {
                Productos producto = new Productos();
                producto.setId_producto(r.getInt("id_producto"));
                producto.setNom_producto(r.getString("nom_producto"));
                producto.setPrecio_producto(r.getDouble("precio_producto"));
                producto.setCantidad_producto(r.getInt("cantidad_producto"));
                producto.setMarcar_producto(r.getString("marcar_producto"));
                bytes = r.getBytes("foto_producto");
                producto.setId_bodega(r.getInt("id_bodega"));
                if (bytes != null) {
                    try {
                        producto.setFoto(obtenerImagen(bytes));
                    } catch (IOException ex) {
                        Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listbus.add(producto);
            }
            r.close();
            return listbus;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     //metodo sql para el id se incremente solo  
            public int IncrementoIdproducto(){
        int incremento = 1;
        try {
            String sql = "select max(id_producto) from productos";
            ResultSet rs = cpg.colsulta(sql);
            while (rs.next()) {
                incremento = rs.getInt(1) + 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return incremento;
    }

//------------bodegas--------------------------------------------------------------
//metodo para listar bodegas en la tabla   
            public List<Bodega> listarbodegas(){
        List<Bodega> lista = new  ArrayList<Bodega>();
        try {
            String sql ="select * from bodegas where estado='A'";
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
       //metodo sql para buscar a todas las bodegas   
            public List<Bodega> listarperbusquedabodega(String busqueda) {
        List<Bodega> listbus = new ArrayList<Bodega>();
        String sql = "";
        String plb = busqueda;
        if (busqueda.equalsIgnoreCase("")) {
            sql = "select *from bodegas where estado='A'";
        } else if (plb.equalsIgnoreCase(busqueda)) {
            sql = "select * from bodegas where estado='A' and CAST(id_bodega AS TEXT) LIKE '" + busqueda + "%' ";
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