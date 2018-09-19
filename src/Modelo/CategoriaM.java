
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CategoriaM {
    private int categoria;
    private String nombre;
    private String descripcion;
//<editor-fold defaultstate="collapsed" desc="Constructores">
    public CategoriaM() {
    }

    public CategoriaM(int categoria, String nombre, String descripcion) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
//</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Set&Get">
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //</editor-fold>
    
    public List<String> buscarCatregoria() throws Exception{
        PreparedStatement pst;
        pst=Conexion.open().prepareCall("{call spCategoria}");
        ResultSet rs=pst.executeQuery();
        List<String> lista= new ArrayList<String>();
        while (rs.next()) {
            lista.add(rs.getString("Nombre"));
            
        }
        return  lista;
    }
}
