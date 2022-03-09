/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Pedidos;
import Modelo.Modelo_Pedido;
import Vista.Vista_Pedidos;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author HP
 */
public class Controlador_Pedido {

    private Modelo_Pedido modelo_pedido;
    private Vista_Pedidos vista_pedido;

    public Controlador_Pedido(Modelo_Pedido modelo_pedido, Vista_Pedidos vista_pedido) {
        this.modelo_pedido = modelo_pedido;
        this.vista_pedido = vista_pedido;
        vista_pedido.setVisible(true);
    }
    
     
  
    public void cargarPedidos(String id) {
//        vista_pedido.getTablaPedidos().setDefaultRenderer();//La manera de renderizar la tabla.
        vista_pedido.getTablaPedidos().setRowHeight(100);

        //enlazar el modelo de a tabla con mi controlador 
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista_pedido.getTablaPedidos().getModel();
        tblModel.setNumRows(0); // limpio las filas de la tabla
        Modelo_Pedido mp = new Modelo_Pedido();
        List<Pedidos> listap = mp.listarPedidos(id); // enlazo al modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila

        listap.stream().forEach(pe -> {

            tblModel.addRow(new Object[5]);//Creo una fila vacia/
            
            vista_pedido.getTablaPedidos().setValueAt(pe.getId_cliente(), i.value, 0);
            vista_pedido.getTablaPedidos().setValueAt(pe.getDireccion(), i.value, 1);
            vista_pedido.getTablaPedidos().setValueAt(pe.getFecha_pedido(), i.value, 2);
            vista_pedido.getTablaPedidos().setValueAt(pe.getCantidad_servicios(), i.value, 3);
            vista_pedido.getTablaPedidos().setValueAt(pe.getTotal_servicios(), i.value, 4);
          
            i.value++;

        });
    }

    

     public void limpiar_pedido(){
      vista_pedido.getTxtIdPedido().setText("");
      vista_pedido.getTxtIdClientes().setText("");
      vista_pedido.getTxtDirección().setText("");
      vista_pedido.getFechapedido().setDate(null);
      vista_pedido.getNumeroServicios().setValue(0);
     
    }
}
