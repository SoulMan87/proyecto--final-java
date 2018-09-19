package Modelo;

import Controlador.*;
import Modelo.Conexion;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;

public class ProductoM {

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
    public ProductoM() {
    }

    public ProductoM(int codigo, String descripcion, int precio, int stock, String tipoDocumento, Date vencimiento, double descuento, boolean estado, String imagen) {
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
        PreparedStatement pst;
        pst = Conexion.open().prepareCall("{Call spRegistrar(?,?,?,?,?,?,?,?,?)}");
        pst.setInt(1, codigo);
        pst.setString(2, tipoProducto);
        pst.setString(3, descripcion);
        pst.setInt(4, precio);
        pst.setInt(5, stock);
        pst.setDate(6, vencimiento);
        pst.setDouble(7, descuento);
        pst.setString(8, imagen);
        pst.setBoolean(9, estado);
        ResultSet rs = pst.executeQuery();
        rs.next();
        String rta = rs.getString(1);
        Conexion.open().close();
        return rta;
    }

    public CachedRowSet buscarProducto(int cod) throws Exception {
        PreparedStatement pst;
        pst = Conexion.open().prepareCall("{Call spRegistrar(?)}");
        pst.setInt(1, cod);
        ResultSet rta = pst.executeQuery();
        CachedRowSet obj = new CachedRowSetImpl();
        obj.populate(rta);
        Conexion.open().close();

        return obj;
    }
}
