
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CargoM {
    private int IdCargo;
    private String nombre;
    private String descripcion;

    public CargoM() {
    }

    public CargoM(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdCargo() {
        return IdCargo;
    }

    public void setIdCargo(int IdCargo) {
        this.IdCargo = IdCargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String registrarCargo() throws Exception{
        PreparedStatement pst;
        pst= Conexion.open().prepareCall("{call spRegistrarCargo(?,?)}");
        pst.setString(1, nombre);
        pst.setString(2, descripcion);
        ResultSet rs=pst.executeQuery();
        rs.next();
        String rta=rs.getString(1);
        Conexion.open().close();
        return rta;
    }
    
}
