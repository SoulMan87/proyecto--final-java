package Controlador;

import Modelo.Conexion;
import Modelo.ProductoM;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;

public class ProductoC {

    private int codigo;
    private String descripcion;
    private int precio;
    private int stock;
    private String tipoProducto;
    private Date vencimiento;
    private double descuento;
    private boolean estado;
    private String imagen;

//<editor-fold defaultstate="collapsed" desc="constructor">
    public ProductoC() {
    }

    public ProductoC(int codigo, String descripcion, int precio, int stock, String tipoDocumento, Date vencimiento, double descuento, boolean estado, String imagen) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.tipoProducto = tipoDocumento;
        this.vencimiento = vencimiento;
        this.descuento = descuento;
        this.estado = estado;
        this.imagen = imagen;
        //</editor-fold>
    }
//<editor-fold defaultstate="collapsed" desc="set and get">

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipoDocumento() {
        return tipoProducto;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoProducto = tipoDocumento;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    //</editor-fold>

    public String registrarProducto() throws Exception {
        ProductoM objPM = new ProductoM(codigo, descripcion, precio, stock, tipoProducto, vencimiento, descuento, estado, imagen);
        return objPM.registrarProducto();
    }

    public CachedRowSet BuscarProducto(int cod) throws Exception {
        ProductoM obj = new ProductoM();
        return obj.buscarProducto(cod);
    }
}
