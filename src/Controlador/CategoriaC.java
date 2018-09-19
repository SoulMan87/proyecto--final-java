
package Controlador;

import Modelo.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class CategoriaC {
    private int categoria;
    private String nombre;
    private String descripcion;
//<editor-fold defaultstate="collapsed" desc="Constructores">
    public CategoriaC() {
    }

    public CategoriaC(int categoria, String nombre, String descripcion) {
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
        CategoriaM obj= new CategoriaM();
        return obj.buscarCatregoria();
    }
}
