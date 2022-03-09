package Modelo;

import Modelo.CLASES.Productos;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
    
        Conexion_BD  cpg = new Conexion_BD();

    public Modelo_productos() {
    }
    public Modelo_productos(int id_producto, String nom_producto, double precio_producto, int cantidad_producto, String marcar_producto, Image foto, FileInputStream imagen, int largo, int id_empleado, int id_bodega) {
        super(id_producto, nom_producto, precio_producto, cantidad_producto, marcar_producto, foto, imagen, largo, id_empleado, id_bodega);
    }
        
    public List<Productos> listarproduc() {
        List<Productos> listaprod = new ArrayList<Productos>();
        String sql = "select * from producto";
        ResultSet r = cpg.colsulta(sql);
        byte[] bytes;
        try {
            while (r.next()) {
                Productos producto = new Productos();
                producto.setId_producto(r.getInt("id_producto"));
                producto.setNom_producto(r.getString("nom_producto"));
                producto.setPrecio_producto(r.getDouble("precio_producto"));
                producto.setCantidad_producto(r.getInt("cantidad_producto"));
                producto.setMarcar_producto(r.getString("marca_producto"));
                bytes = r.getBytes("foto_producto");
                producto.setId_empleado(r.getInt("id_empleado"));
                producto.setId_bodega(r.getInt("id_bodega"));

                if (bytes != null) {
                    try {
                        producto.setFoto(obtenerImagen(bytes));
                    } catch (IOException ex) {
                        Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaprod.add(producto);
            }
            r.close();
            return listaprod;
        } catch (SQLException ex) {
          Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        }
        
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
        public boolean crearprocduc() {
        try {
            String sql = "INSERT INTO producto(id_producto,nom_producto,precio_producto,cantidad_producto,marca_producto,foto_producto,id_empleado,id_bodega)\n" + "VALUES(?,?,?,?,?,?,?,?)";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_producto());
            ps.setString(2, getNom_producto());
            ps.setDouble(3, getPrecio_producto());
            ps.setInt(4, getCantidad_producto());
            ps.setString(5, getMarcar_producto());
            ps.setBinaryStream(6, getImagen(), getLargo());
            ps.setInt(7, getId_empleado());
            ps.setInt(8, getId_bodega());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
            public boolean edipro(String id) {
        try {
            String sql = "UPDATE producto SET id_producto=?, nom_producto=?,precio_producto=?,cantidad_producto=?, marca_producto=?, foto_producto=?,id_empleado=?,id_bodega=? WHERE idproducto ='" + id + "'";
            PreparedStatement ps = cpg.getCon().prepareStatement(sql);
            ps.setInt(1, getId_producto());
            ps.setString(2, getNom_producto());
            ps.setDouble(3, getPrecio_producto());
            ps.setInt(4, getCantidad_producto());
            ps.setString(5, getMarcar_producto());
            ps.setBinaryStream(6, getImagen(), getLargo());
            ps.setInt(7, getId_empleado());
            ps.setInt(8, getId_bodega());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        public boolean eliminapro(String id) {
        String sql = "delete from producto WHERE idproducto ='" + id + "'";
        System.out.println("" + sql);
        return cpg.accion(sql);
    }
            public List<Productos> listarperbusqueda(String busqueda) {
        List<Productos> listbus = new ArrayList<Productos>();
        String sql = "";
        String plb = busqueda;
        if (busqueda.equalsIgnoreCase("")) {
            sql = "select *from producto";
        } else if (plb.equalsIgnoreCase(busqueda)) {
            sql = "select * from producto where CAST(id_producto AS TEXT) LIKE '" + busqueda + "%' or lower(nom_producto) like '"+busqueda  + "%'";
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
                producto.setMarcar_producto(r.getString("marca_producto"));
                bytes = r.getBytes("foto_producto");
                producto.setId_empleado(r.getInt("id_empleado"));
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
}