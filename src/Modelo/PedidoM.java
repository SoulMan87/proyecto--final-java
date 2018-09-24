
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class PedidoM {
    private int idPedido;



    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    public  int getIdPedido () throws Exception{
        PreparedStatement pst;
        pst=Conexion.open().prepareCall("{call spConsultarMaxId}");
        ResultSet rs=pst.executeQuery();
        rs.next();
        idPedido =rs.getInt(1);
        Conexion.open().close();
        return idPedido;
    }
}
