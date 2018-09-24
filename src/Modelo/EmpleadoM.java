
package Modelo;

import com.sun.rowset.CachedRowSetImpl;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.sql.rowset.CachedRowSet;


public class EmpleadoM {
    
    public CachedRowSet obtenerEmpleados() throws Exception{
        PreparedStatement pst;
        pst =Conexion.open().prepareCall("{call spConsultaEmpleado}");
        ResultSet rs=pst.executeQuery();
        CachedRowSet crs = new CachedRowSetImpl();
        crs.populate(rs);
        Conexion.open().close();
        return  crs;
    }
}
