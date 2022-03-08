package Modelo.CLASES;

import java.awt.Image;
import java.io.FileInputStream;
public class Productos {
  private int  id_producto; 
  private String nom_producto; 
  private double precio_producto;
  private int cantidad_producto; 
  private String marcar_producto;
  private Image foto;
    //Guardar la foto
    private FileInputStream imagen;
    private int largo;
  private int id_empleado; 
  private int id_bodega;

    public Productos() {
    }

    public Productos(int id_producto, String nom_producto, double precio_producto, int cantidad_producto, String marcar_producto, Image foto, FileInputStream imagen, int largo, int id_empleado, int id_bodega) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.precio_producto = precio_producto;
        this.cantidad_producto = cantidad_producto;
        this.marcar_producto = marcar_producto;
        this.foto = foto;
        this.imagen = imagen;
        this.largo = largo;
        this.id_empleado = id_empleado;
        this.id_bodega = id_bodega;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public String getMarcar_producto() {
        return marcar_producto;
    }

    public void setMarcar_producto(String marcar_producto) {
        this.marcar_producto = marcar_producto;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(int id_bodega) {
        this.id_bodega = id_bodega;
    }
  
  
}
