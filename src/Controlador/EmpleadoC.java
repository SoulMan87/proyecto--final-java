
package Controlador;

import Modelo.EmpleadoM;
import javax.sql.rowset.CachedRowSet;


public class EmpleadoC {
    
    public CachedRowSet obtenerEmpleado() throws Exception{
        EmpleadoM objEM = new EmpleadoM();
        return objEM.obtenerEmpleados();
        
    }
}
