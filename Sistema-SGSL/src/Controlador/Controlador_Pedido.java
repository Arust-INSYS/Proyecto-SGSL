/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Cliente;
import Modelo.CLASES.Detalle_Pedido;
import Modelo.CLASES.Pedidos;
import Modelo.CLASES.Servicios;
import Modelo.Conexion_BD;
import Modelo.Modelo_Pedido;
import Modelo.Modelo_detallePedido;
import Vista.Vista_Pedidos;
import Vista.Vista_Principal;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
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
        id_aumento();
        vista.getBtnEnviar().setEnabled(false);
    }
    
    
    public void incioControl(){
        
//        vista.getBtnActualizar().addActionListener(l->cargarPedido());
        agregar_datos();
        vista.getBtnAgregar().addActionListener(l->agregar_fila());
        vista.getBtnEliminar().addActionListener(l->eliminar_fila());
        
        vista.getBtnGuardar2().addActionListener(l->guardar3());
        llenar_comobobox();
        vista.getCmbxServicios().addActionListener(l->seleccion_combo());
        vista.getBtnBuscar().addActionListener(l->dialogo_cliente());
        vista.getBtnCargar().addActionListener(l->seleccion_cliente());
        vista.getBtnEnviar().addActionListener(l->pagos());
//        vista.getBtnCancelar().addActionListener(l->cancelar_pedido());
    }
    
    //------------------VALIDACIONES------------------------------------------
    
    

   
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
    private void keylist_Client() {
        KeyListener buscar = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String busqueda = vista.getTxt_buscarCli().getText().toUpperCase();
                
                buscar_clientes(busqueda);
            }
        };


        vista.getTxt_buscarCli().addKeyListener(buscar);
    }
    public void buscar_clientes(String texto){
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTbl_buscar_cli().getModel();
        tblModel.setNumRows(0);
        List<Cliente>listapedi= modelo.buscar_clientes(texto);
        listapedi.stream().forEach(cl->{
            
            String id = Integer.toString(cl.getId_clienteC());
            
                     
                String[] filap={
                id,cl.getNombre(),cl.getApellido()
                
            };
                tblModel.addRow(filap);
        });
    }
    
    public void lista_clientes(){
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTbl_buscar_cli().getModel();
        tblModel.setNumRows(0);
        List<Cliente>listapedi= modelo.lista_clientes();
        listapedi.stream().forEach(cl->{
            
            String id = Integer.toString(cl.getId_clienteC());
            
                     
                String[] filap={
                id,cl.getNombre(),cl.getApellido()
                
            };
                tblModel.addRow(filap);
        });
    }
    
    //Metodo abrir dialogo
    public void dialogo_cliente(){
        vista.getDlgpersona().setVisible(true);
        vista.getDlgpersona().setSize(460, 390);
        vista.getDlgpersona().setLocationRelativeTo(null);
        lista_clientes();
        keylist_Client();       
    }
    
    //METODO LLENAR COMBOBOX
    
    private void llenar_comobobox(){
        
        JComboBox serlist;
        serlist=vista.getCmbxServicios();
        serlist.removeAllItems();
        List<Servicios>listaser= modelo.combobox();
//        Holder<Integer>  i = new Holder<>(1);
        listaser.stream().forEach(lista->{
            String nom_servicios = lista.getNom_servicio();
            serlist.addItem(nom_servicios);
//            serlist.addItem(i.value+"."+nom_servicios);
//        i.value++;
            
        });
    }
    
    private void seleccion_combo(){
        String servicio = (String) vista.getCmbxServicios().getSelectedItem();
        
        List<Servicios>lista_sr= modelo.selecctionitem(servicio);
        lista_sr.stream().forEach(lista->{
            String id_sr = Integer.toString(lista.getId_servicio());
            vista.getTxtServicio().setText(id_sr);
        });
        System.out.println(servicio);
    }
    private void seleccion_cliente(){
        
        int fila=vista.getTbl_buscar_cli().getSelectedRow();
        if(fila>=0){
            try {
                DefaultTableModel dm=(DefaultTableModel) vista.getTbl_buscar_cli().getModel();
                String id_cli =String.valueOf(dm.getValueAt(vista.getTbl_buscar_cli().getSelectedRow()
                        , 0));
                String nombre =String.valueOf(dm.getValueAt(vista.getTbl_buscar_cli().getSelectedRow()
                        , 1));
                String apellido =String.valueOf(dm.getValueAt(vista.getTbl_buscar_cli().getSelectedRow()
                        , 2));
                vista.getTxtIdClientes().setText(id_cli);
                vista.getLabel_Cliente().setText(nombre+" "+apellido);
            } catch (Exception e) {
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }
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
        
        if(vista.getTxtServicio().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos faltantes, verifique por favor!");
        }else{
            modelo_tabla.addRow(info);
            
        }
                 
                
    }
    private void eliminar_fila(){
        int fila=vista.getTablaPedidos().getSelectedRow();
        if(fila>=0){
            modelo_tabla.removeRow(fila);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccionar Fila");
        }
    }
    
    
    
    private void guardar3(){

        int id_ped =  Integer.parseInt(vista.getTxtIdPedido().getText());
//        double total =  Double.parseDouble(vista.getTxtValor().getText());
//Validacion para comprobar si existe el registro
      try {
            if(modelo.existe_pedido(id_ped)==0){
        int id_cliente = Integer.parseInt(vista.getTxtIdClientes().getText());
        if(id_cliente!=0){
        Modelo_Pedido pedido = new Modelo_Pedido();
        pedido.setCantidad_servicios(0);
        pedido.setTotal_servicios(0);
        pedido.setId_cliente(id_cliente);
        
        if(pedido.Insertar_Pedido()){
               
                JOptionPane.showMessageDialog(vista,"Pedido Creado Correctamente");
               
            }
        }
        
    } else{
        System.out.println("EL REGISTRO YA EXISTE");
    }   
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vista,"No se pudo crear el pedido, campos faltantes!");
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
               vista.getBtnEnviar().setEnabled(true);
            }else{
            
                 JOptionPane.showMessageDialog(vista,"No se pudo crear el pedido");
                 
    };
           Cant_Ser();//Método para mostrar la cantidad y total de a tabla pedido
           
           
//          System.out.println("#Lista: "+i+ //ELIMINAR
//                " "+"Direccion: "+vista.getTablaPedidos().getValueAt(i, 0)+
//                " "+"ID_Pedido: "+vista.getTablaPedidos().getValueAt(i, 1)+
//                " "+"Id_Servicio: "+vista.getTablaPedidos().getValueAt(i, 2));
          
 
          }
        
        
    }
    public void pagos(){
         List<Pedidos>listapedi= modelo.datos_pedido();
        listapedi.stream().forEach(lista->{
            
            double total = lista.getTotal_servicios();
            int id = lista.getId_pedido();
            System.out.println(total);
            System.out.println(id);
            
            Modelo_Pedido pedido = new Modelo_Pedido();
//            
            pedido.setTotal_servicios(total);
            pedido.setId_pedido(id);
            if(pedido.Insertar_Pago()){
               
                JOptionPane.showMessageDialog(vista,"Pago Creado Correctamente");
//               
            }else{
                JOptionPane.showMessageDialog(vista,"No se pudo realizar el pago");
            }
        
        });
        id_aumento();
        vista.getTxtIdClientes().setText("");
        vista.getTxtPane_Dir().setText("");
        vista.getLabelCount().setText("");
        vista.getLabelTotal().setText("");
        vista.getTxtServicio().setText("");
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTablaPedidos().getModel();
        tblModel.setNumRows(0);
        vista.getBtnEnviar().setEnabled(false);
        
        
    }
    
    public void cancelar_pedido(){
        modelo.cancelar_pedido();
        id_aumento();
        vista.getTxtIdClientes().setText("");
        vista.getTxtPane_Dir().setText("");
        
        vista.getTxtServicio().setText("");
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista.getTablaPedidos().getModel();
        tblModel.setNumRows(0);
        vista.getBtnEnviar().setEnabled(false);
    }
    
   


     public void limpiar_pedido(){
      vista.getTxtIdPedido().setText("");
      vista.getTxtIdClientes().setText("");
      vista.getTxtPane_Dir().setText("");
//      vista.getFechapedido().setDate(null);
//      vista.getNumeroServicios().setValue(0);
     
    }
}
