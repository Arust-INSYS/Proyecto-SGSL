/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Detalle_Pedido;
import Modelo.CLASES.Pedidos;
import Modelo.Modelo_Pedido;
import Modelo.Modelo_detallePedido;
import Vista.Vista_Pedidos;
import Vista.Vista_Principal;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static void main(String[] args) {
       Vista_Pedidos vista = new Vista_Pedidos();
        Modelo_Pedido modelo = new Modelo_Pedido();        
        
        
        Controlador_Pedido control = new Controlador_Pedido(modelo,vista);
        control.incioControl();
        
        LocalTime hora = LocalTime.now();
        
        System.out.println(
        hora
        );
    }

    public Controlador_Pedido(Modelo_Pedido modelo, Vista_Pedidos vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        id_aumento();
        
    }
    
    
    public void incioControl(){
        
//        vista.getBtnActualizar().addActionListener(l->cargarPedido());
        agregar_datos();
        vista.getBtnAgregar().addActionListener(l->agregar_fila());
        vista.getBtnEliminar().addActionListener(l->eliminar_fila());
        vista.getBtnEnviar().addActionListener(l-> guardar());
        vista.getBtnGuardar2().addActionListener(l->guardar3());
        
    }
    
    //VALIDACIONES
    
    

   
    public void id_aumento(){
        
    List<Pedidos>listapedi= modelo.id_pedido();    
        listapedi.stream().forEach(lista->{
               String id = Integer.toString(lista.getId_pedido()+1);
                
//                String foto = Byte.toString(pr.getFoto());
//                LocalDate fecha_act = LocalDate.now();
//                String fecha_f  = String.valueOf(fecha_act);
                vista.getTxtIdPedido().setEnabled(false);
//                vista.getTxt_fecha().setEnabled(false);
                vista.getTxtIdPedido().setText(id);
//                vista.getTxt_fecha().setText(fecha_f);
                
                
        });
    }
    public void Cant_Ser(){
        List<Pedidos>listapedi= modelo.cargarValores();
        listapedi.stream().forEach(lista->{
            String cantidad = Integer.toString(lista.getCantidad_servicios());
            String total = Double.toString(lista.getTotal_servicios());
            vista.getLabelCount().setText(cantidad);
            vista.getLabelTotal().setText(total);
        });
    }
    //------------------------------------------------------------------------
    private void agregar_datos(){
        
        modelo_tabla = (DefaultTableModel) vista.getTablaPedidos().getModel();   
        modelo_tabla.addColumn("DIRECCIÓN");
        modelo_tabla.addColumn("ID_PEDIDO");
        modelo_tabla.addColumn("ID_SERVICIO");
        this.vista.getTablaPedidos().setModel(modelo_tabla);
    }
    private void agregar_fila(){
        
        String [] info = new String[6];
        
        info[0] = vista.getTxtPane_Dir().getText();
        info[1] = vista.getTxtIdPedido().getText();
        info[2] = vista.getTxtServicio().getText();
        modelo_tabla.addRow(info);
//        vista.getTxtIdPedido().setText("");
        vista.getTxtIdClientes().setText("");
        vista.getTxtPane_Dir().setText("");
//        vista.getTxtValor().setText("");
        vista.getTxtServicio().setText("");
          
                
    }
    private void eliminar_fila(){
        int fila=vista.getTablaPedidos().getSelectedRow();
        if(fila>=0){
            modelo_tabla.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }
    
    private void guardar2(){
        
//        List<Pedidos> ped =new ArrayList<Pedidos>();
//        ped.stream().forEach(pd->{
//        
//            });
        
        
          for (int i = 0; i < vista.getTablaPedidos().getRowCount(); i++) {
          
          System.out.println("#Lista: "+i+
                " "+"ID_Pedido: "+vista.getTablaPedidos().getValueAt(i, 0)+
                " "+"Direccion: "+vista.getTablaPedidos().getValueAt(i, 1)+
                " "+"Cantidad: "+vista.getTablaPedidos().getValueAt(i, 2)+
                " "+"Valor: "+vista.getTablaPedidos().getValueAt(i, 3)+
                " "+"Id_cliente: "+vista.getTablaPedidos().getValueAt(i, 4)+
                " "+"Id_Servicio: "+vista.getTablaPedidos().getValueAt(i, 5));
          
 
          }      
        
    }
    
    
    private void guardar3(){

        int id_ped =  Integer.parseInt(vista.getTxtIdPedido().getText());
//        double total =  Double.parseDouble(vista.getTxtValor().getText());
//Validacion para comprobar si existe el registro
    if(modelo.existe_pedido(id_ped)==0){
        int id_cliente = Integer.parseInt(vista.getTxtIdClientes().getText());
        
        Modelo_Pedido pedido = new Modelo_Pedido();
        pedido.setCantidad_servicios(0);
        pedido.setTotal_servicios(0);
        pedido.setId_cliente(id_cliente);
        if(pedido.Insertar_Pedido()){
               
                JOptionPane.showMessageDialog(vista,"Pedido Creado Correctamente");
               
            }else{
            
                 JOptionPane.showMessageDialog(vista,"No se pudo crear el pedido");
                 
    };
    } else{
        System.out.println("EL REGISTRO YA EXISTE");
    }            
                
        for (int i = 0; i < vista.getTablaPedidos().getRowCount(); i++) {
            //Se pretende leer las filas de la tabla y luego guardarlas en la base
            //el for permite recorrer las filas
//          int id_pedido=Integer.parseInt((String) vista.getTablaPedidos().getValueAt(i, 0));
          String direccion=(String) vista.getTablaPedidos().getValueAt(i, 0);
          int id_pedido_de = Integer.parseInt((String) vista.getTablaPedidos().getValueAt(i, 1));
          int id_servicio = Integer.parseInt((String) vista.getTablaPedidos().getValueAt(i, 2));
          
          
          //Se crea un opbjeto por fila y est recive los datos que se dan
           Modelo_detallePedido detalle = new Modelo_detallePedido();
//           pedido.setId_pedido(id_pedido); //ELIMINAR
            detalle.setDireccion(direccion);
            detalle.setId_pedido(id_pedido_de);
            detalle.setId_servicio(id_servicio);
            
           if(detalle.Insertar_DetPedido()){
               
//                JOptionPane.showMessageDialog(vista,"Pedido Creado Correctamente");
               
            }else{
            
//                 JOptionPane.showMessageDialog(vista,"No se pudo crear el pedido");
                 
    };
           Cant_Ser();//Método para mostrar la cantidad y total de a tabla pedido
           
           
          System.out.println("#Lista: "+i+ //ELIMINAR
                " "+"Direccion: "+vista.getTablaPedidos().getValueAt(i, 0)+
                " "+"ID_Pedido: "+vista.getTablaPedidos().getValueAt(i, 1)+
                " "+"Id_Servicio: "+vista.getTablaPedidos().getValueAt(i, 2));
          
 
          }
        
    }
    
    private void guardar(){
         int id_pedido=Integer.parseInt(vista.getTxtIdPedido().getText());
//            int cantidad = Integer.parseInt(vista.getTxtCantidad().getText());
//            double valor = Double.parseDouble(vista.getTxtValor().getText());
            int id_cliente = Integer.parseInt(vista.getTxtIdClientes().getText());
            
            Modelo_Pedido pedido = new Modelo_Pedido();
              
            pedido.setId_pedido(id_pedido);
//            pedido.setCantidad_servicios(cantidad);
//            pedido.setTotal_servicios((float) valor);
            pedido.setId_cliente(id_cliente);
            
            if(pedido.Insertar_Pedido()){
                JOptionPane.showMessageDialog(vista,"Producto Creada Correctamente");
            }else{
            
                 JOptionPane.showMessageDialog(vista,"No se pudo crear el producto");
    };
     
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
        }
    

    

     public void limpiar_pedido(){
      vista.getTxtIdPedido().setText("");
      vista.getTxtIdClientes().setText("");
      vista.getTxtPane_Dir().setText("");
//      vista.getFechapedido().setDate(null);
//      vista.getNumeroServicios().setValue(0);
     
    }
}
