package Modelo.CLASES;
public class Bodega {
private int  idbodega;
private int  numero;
private int  cantidad;
private int  espacio;

    public Bodega() {
    }

    public Bodega(int idbodega, int numero, int cantidad, int espacio) {
        this.idbodega = idbodega;
        this.numero = numero;
        this.cantidad = cantidad;
        this.espacio = espacio;
    }

    public int getIdbodega() {
        return idbodega;
    }

    public void setIdbodega(int idbodega) {
        this.idbodega = idbodega;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }




}
