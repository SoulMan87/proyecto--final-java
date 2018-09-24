
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ClienteM {
    private int idCliente;
    private String tipoIdentificacion;
    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;
    private String direccion;
    private boolean estado;
//<editor-fold defaultstate="collapsed" desc="Constructores">
    

    public ClienteM() {
    }

    public ClienteM(int idCliente, String tipoIdentificacion, String nombre, String apellidos, int telefono, String email, String direccion, boolean estado) {
        this.idCliente = idCliente;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.estado = estado;
    }
//</editor-fold>
    public boolean isEstado() {
        return estado;
    }
//<editor-fold defaultstate="collapsed" desc="Sette&Getter">
    

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //</editor-fold>
    
    public void getCliente() throws Exception{
        PreparedStatement pst;
        pst=Conexion.open().prepareCall("{call spConsultarCliente(?)}");
        pst.setInt(1, idCliente);
        ResultSet rs =pst.executeQuery();
        rs.next();
        this.nombre=rs.getString("Nombres");
        this.telefono=rs.getInt("Telefono");
        this.direccion=rs.getString("direccion");
        Conexion.open().close();
    }
}
