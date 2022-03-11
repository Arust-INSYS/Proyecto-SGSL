/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Empleado;
import Modelo.Modelo_Empleado;
import Vista.Vista_Empleado;
import java.awt.Component;
import java.sql.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author lorena
 */
public class Controlador_Empleados {
    private Modelo_Empleado modelo_emple;
    private Vista_Empleado vista_emple;

    public Controlador_Empleados(Modelo_Empleado modelo_emple, Vista_Empleado vista_emple) {
        this.modelo_emple = modelo_emple;
        this.vista_emple = vista_emple;
        vista_emple.setVisible(true);
    }
    
    public void iniciaControl(){
        vista_emple.getBtnActualizar().addActionListener(l->CargarEmpleados());
        vista_emple.getBtnCrear().addActionListener(l->abrirDialogo_pro(3));
        vista_emple.getBtnEditar().addActionListener(l->abrirDialogo_pro(4));
        vista_emple.getBtnAceptar().addActionListener(l-> crearEditarEmpleado());
        vista_emple.getBtnRemover().addActionListener(l->EliminarEmpleado());
        vista_emple.getBtnCancelar().addActionListener(l->cancelar_emple());
        //vista.getBtnbuscar_pro().addActionListener(l->Buscarpro());
            
    }
    
    private void abrirDialogo_pro(int ce){
      String title;
        if(ce==3){
            title="Crear nuevo servicio";
            vista_emple.getDialogEmpleado().setName("crear");
        }else{
            title="Editar servicio";
            vista_emple.getDialogEmpleado().setName("editar");
        }
        vista_emple.getDialogEmpleado().setLocationRelativeTo(vista_emple);
        vista_emple.getDialogEmpleado().setSize(500,500);
        vista_emple.getDialogEmpleado().setTitle(title);
        vista_emple.getDialogEmpleado().setVisible(true); 
    }
    
    private void crearEditarEmpleado(){
        if(vista_emple.getDialogEmpleado().getName()=="crear"){
            //Insertar
              if ( vista_emple.getTxtidempleado().getText().equals("")||vista_emple.getTxtsueldo().getText().equals("") ||
                 vista_emple.getBoxEstado().getSelectedItem().equals("") || vista_emple.getContratacion().getDate().equals("") || vista_emple.getTxtid_persona().getText().equals("")){
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
              }else{
                    String id_emple = vista_emple.getTxtidempleado().getText().toString();
                    String sueldo = vista_emple.getTxtsueldo().getText();
                    String estado = vista_emple.getBoxEstado().getSelectedItem().toString();
                    String fechacontra = ((JTextField)vista_emple.getContratacion().getDateEditor().getUiComponent()).getText();
                    Date contratacion = java.sql.Date.valueOf(fechacontra);
                    String id_per = vista_emple.getTxtid_persona().getText().toString();
                    


                    Modelo_Empleado emple = new Modelo_Empleado();
                    emple.setId_empleado(Integer.parseInt(String.valueOf(id_emple)));
                    emple.setSueldo(Double.parseDouble(String.valueOf(sueldo)));
                    emple.setEstado_civil(estado);
                    emple.setFecha_contrato((java.sql.Date)contratacion);
                    emple.setId_persona(Integer.parseInt(String.valueOf(id_per)));                    

                    if(emple.creaEmpleado()){
                        JOptionPane.showMessageDialog(vista_emple, "Servicio creado satisfactoriamente");
                        vista_emple.getDialogEmpleado().setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(vista_emple, "No se pudo crear el producto");
                    }
                }
           
        }else if (vista_emple.getDialogEmpleado().getName()=="editar"){    
               if( vista_emple.getTxtidempleado().getText().equals("")||vista_emple.getTxtsueldo().getText().equals("") ||
                 vista_emple.getBoxEstado().getSelectedItem().equals("") || vista_emple.getContratacion().getDate().equals("") || vista_emple.getTxtid_persona().getText().equals("")){
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
              }else{
                    String id_emple = vista_emple.getTxtidempleado().getText().toString();
                    String sueldo = vista_emple.getTxtsueldo().getText();
                    String estado = vista_emple.getBoxEstado().getSelectedItem().toString();
                    String fechacontra = ((JTextField)vista_emple.getContratacion().getDateEditor().getUiComponent()).getText();
                    Date contratacion = java.sql.Date.valueOf(fechacontra);
                    String id_per = vista_emple.getTxtid_persona().getText().toString();
                    


                    Modelo_Empleado emple = new Modelo_Empleado();
                    emple.setId_empleado(Integer.parseInt(String.valueOf(id_emple)));
                    emple.setSueldo(Double.parseDouble(String.valueOf(sueldo)));
                    emple.setEstado_civil(estado);
                    emple.setFecha_contrato((java.sql.Date)contratacion);
                    emple.setId_persona(Integer.parseInt(String.valueOf(id_per))); 
                      
                    if(emple.ModificarEmpleado()){
                        JOptionPane.showMessageDialog(vista_emple, "Servicio modificado satisfactoriamente");
                        vista_emple.getDialogEmpleado().setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(vista_emple, "No se pudo modificar el servicio");
                    }
                   }
        }
    }
    
    public void EliminarEmpleado(){
        int seleccionado = vista_emple.getTblEmpleado().getSelectedRow();
        int respuesta=0;
        Component rootPane = null;
        Modelo_Empleado empleli = new Modelo_Empleado();
          if(seleccionado !=-1){
            String idemple = vista_emple.getTblEmpleado().getValueAt(seleccionado, 0).toString();
            
            respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que deseas eliminar este servicio?");
            if(respuesta==0){
                if(empleli.RemoverEmpleado(idemple)){
                    JOptionPane.showMessageDialog(rootPane,"El registro del servicio a sido eliminado");        
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Error al eliminar");
                }

                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "No hay datos a eliminar");
            }
    }
    
    
    public void modificar_emple() {
     vista_emple.getTxtidempleado().setEnabled(false);
     int seleccionado = vista_emple.getTblEmpleado().getSelectedRow();
      if(seleccionado !=-1){
          String id= vista_emple.getTblEmpleado().getValueAt(seleccionado, 0).toString();
          int cod = Integer.parseInt(id);
              vista_emple.getTxtidempleado().setText(id);
              vista_emple.getTxtsueldo().setText(vista_emple.getTblEmpleado().getValueAt(seleccionado, 1).toString());
              vista_emple.getBoxEstado().setSelectedItem(vista_emple.getTblEmpleado().getValueAt(seleccionado, 2).toString());
              Date fec = (Date) vista_emple.getTblEmpleado().getValueAt(seleccionado, 3);
              vista_emple.getContratacion().setDate(fec);
              vista_emple.getTxtid_persona().setText(String.valueOf(vista_emple.getTblEmpleado().getValueAt(seleccionado, 4)));
              
              
    }else{
        JOptionPane.showMessageDialog(vista_emple, "No a seleccionado a niguna persona");
    }
   }
    
    public void limpiar_emple(){
      vista_emple.getTxtidempleado().setText("");
      vista_emple.getTxtsueldo().setText("");
      vista_emple.getBoxEstado().setSelectedIndex(0);
      vista_emple.getContratacion().setDate(null);
      vista_emple.getTxtid_persona().setText("");
    }
    
    private void CargarEmpleados(){
        
        //Enlazar el modelo de tabla con mi controlador.
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista_emple.getTblEmpleado().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla.

        List<Empleado> listap=modelo_emple.listarEmpleados();//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listap.stream().forEach(pe->{
            
            tblModel.addRow(new Object[6]);//Creo una fila vacia/
            vista_emple.getTblEmpleado().setValueAt(pe.getId_empleado(), i.value, 0);
            vista_emple.getTblEmpleado().setValueAt(pe.getSueldo(), i.value, 1);
            vista_emple.getTblEmpleado().setValueAt(pe.getEstado_civil(), i.value, 2);
            vista_emple.getTblEmpleado().setValueAt(pe.getFecha_contrato(), i.value, 3);
            vista_emple.getTblEmpleado().setValueAt(pe.getId_persona(), i.value, 5);
            
            i.value++;
        });
        
    }
    
    public void cancelar_emple(){
        int respuesta = 0;
        respuesta = JOptionPane.showConfirmDialog(null,"¿Estas seguro que deseas cancelar?");
        if(respuesta==0){
            vista_emple.setVisible(true);
            vista_emple.getDialogEmpleado().setVisible(false);
            }else{
                
            }
    }

}
