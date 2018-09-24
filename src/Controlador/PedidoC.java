
package Controlador;

import Modelo.PedidoM;


public class PedidoC {
    private int idPedido;



    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public int getIdPedido() throws Exception{
        PedidoM objC= new PedidoM();
        idPedido =objC.getIdPedido();
        return idPedido;
    }
}
