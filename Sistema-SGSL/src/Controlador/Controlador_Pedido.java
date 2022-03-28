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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author HP
 */
public class Controlador_Pedido {
    
    private Modelo_Pedido modelo;
    private Vista_Pedidos vista;
    DefaultTableModel modelo_tabla;

    public Controlador_Pedido(Modelo_Pedido modelo, Vista_Pedidos vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        
    }
    
    
    public void incioControl(){
        
//        vista.getBtnActualizar().addActionListener(l->cargarPedido());
        agregar_datos();
        vista.getBtnAgregar().addActionListener(l->agregar_fila());
        vista.getBtnEliminar().addActionListener(l->eliminar());
        
    }
    private void agregar_datos(){
        
        modelo_tabla = (DefaultTableModel) vista.getTablaPedidos().getModel();
        modelo_tabla.addColumn("ID_PEDIDO");
        modelo_tabla.addColumn("DIRECCIÓN");
        modelo_tabla.addColumn("CANTIDAD");
        modelo_tabla.addColumn("TOTAL");
        modelo_tabla.addColumn("ID_CLIENTE");
        modelo_tabla.addColumn("ID_SERVICIO");
        this.vista.getTablaPedidos().setModel(modelo_tabla);
    }
    private void agregar_fila(){
        String [] info = new String[6];
        info[0] = vista.getTxtIdPedido().getText();
        info[1] = vista.getTxtDireccion().getText();
        info[2] = vista.getTxtCantidad().getText();
        info[3] = vista.getTxtValor().getText();
        info[4] = vista.getTxtIdClientes().getText();
        info[5] = vista.getTxtServicio().getText();
        modelo_tabla.addRow(info);
        vista.getTxtIdPedido().setText("");
        vista.getTxtIdClientes().setText("");
        vista.getTxtDireccion().setText("");
        vista.getTxtValor().setText("");
        vista.getTxtServicio().setText("");
          
                
    }
    private void eliminar(){
        int fila=vista.getTablaPedidos().getSelectedRow();
        if(fila>=0){
            modelo_tabla.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }
     
//   private void cargarPedido() {
//        
//        DefaultTableModel tblModel;
//        tblModel = (DefaultTableModel) vista.getTablaPedidos().getModel();
//        tblModel.setNumRows(0);
//        List<Pedidos> listarPedido=modelo.listarPedidos();
//        listarPedido.stream().forEach(ped->{
//            
//            String id_pedido = Integer.toString(ped.getId_pedido());
//            String id_cliente = Integer.toString(ped.getId_cliente());
//            String cantidad_serv = Integer.toString(ped.getCantidad_servicios());
//            String total_serv = Double.toString(ped.getTotal_servicios());
//            String id_serv = Integer.toString(ped.getId_servicio());        
//                String[] filap={
//                id_pedido, ped.getDireccion(), cantidad_serv,total_serv,
//                    id_cliente,id_serv
//                 
//            };
//                tblModel.addRow(filap);
//            
//      });  
//        }
    

    

     public void limpiar_pedido(){
      vista.getTxtIdPedido().setText("");
      vista.getTxtIdClientes().setText("");
      vista.getTxtDireccion().setText("");
//      vista.getFechapedido().setDate(null);
//      vista.getNumeroServicios().setValue(0);
     
    }
}
