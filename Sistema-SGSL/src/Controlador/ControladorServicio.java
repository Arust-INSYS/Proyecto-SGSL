/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Servicios;
import Modelo.ModeloServicio;
import Vista.VistaServicio;
import java.awt.Component;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lorena
 */
public class ControladorServicio {
    private ModeloServicio modelo_servi;
    private VistaServicio vista_servi;

    public ControladorServicio(ModeloServicio modelo_servi, VistaServicio vista_servi) {
        this.modelo_servi = modelo_servi;
        this.vista_servi = vista_servi;
        vista_servi.setVisible(true);
    }
    
    public void iniciaControl(){
        vista_servi.getBtnActualizarServicio().addActionListener(l->CargarProductos());
        vista_servi.getBtnCrearServicio().addActionListener(l->abrirDialogo_pro(3));
        vista_servi.getBtnEditarServicio().addActionListener(l->abrirDialogo_pro(4));
        vista_servi.getBtnAceptar_pro1().addActionListener(l-> crearEditarServicio());
        vista_servi.getBtnRemoverServicio().addActionListener(l->EliminarServicio());
        vista_servi.getBtnCancelar_pro1().addActionListener(l->cancelar_pro());
        //vista.getBtnbuscar_pro().addActionListener(l->Buscarpro());
            
    }
    
    private void abrirDialogo_pro(int ce){
      String title;
        if(ce==3){
            title="Crear nuevo servicio";
            vista_servi.getDialog_Crear().setName("crear");
        }else{
            title="Editar servicio";
            vista_servi.getDialog_Crear().setName("editar");
        }
        vista_servi.getDialog_Crear().setLocationRelativeTo(vista_servi);
        vista_servi.getDialog_Crear().setSize(500,500);
        vista_servi.getDialog_Crear().setTitle(title);
        vista_servi.getDialog_Crear().setVisible(true); 
    }
    
    private void crearEditarServicio(){
        if(vista_servi.getDialog_Crear().getName()=="crear"){
            //Insertar
              if ( vista_servi.getTxtidservicio().getText().equals("")||  vista_servi.getTxtnom_servicio().getText().equals("") ||
                 vista_servi.getAreadescripcion().getText().equals("") ||  vista_servi.getTxtcosto_servicio().getText().equals("")|| vista_servi.getTxtid_empleado().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
              }else{
                    String id_servi = vista_servi.getTxtidservicio().getText().toString();
                    String nombre = vista_servi.getTxtnom_servicio().getText();
                    String descripcion = vista_servi.getAreadescripcion().getText();
                    String costo= vista_servi.getTxtcosto_servicio().getText();
                    String id_emple = vista_servi.getTxtid_empleado().getText().toString();
                    


                    ModeloServicio servi = new ModeloServicio();
                    servi.setId_servicio(Integer.parseInt(String.valueOf(id_servi)));
                    servi.setNom_servicio(nombre);
                    servi.setDescri_servicio(descripcion);
                    servi.setCosto_servicio(Double.parseDouble(String.valueOf(costo)));
                    servi.setId_empleado(Integer.parseInt(String.valueOf(id_emple)));                    

                    if(servi.creaServicio()){
                        JOptionPane.showMessageDialog(vista_servi, "Servicio creado satisfactoriamente");
                        vista_servi.getDialog_Crear().setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(vista_servi, "No se pudo crear el producto");
                    }
                }
           
        }else if (vista_servi.getDialog_Crear().getName()=="editar"){    
               if ( vista_servi.getTxtidservicio().getText().equals("")||  vista_servi.getTxtnom_servicio().getText().equals("") ||
                 vista_servi.getAreadescripcion().getText().equals("") ||  vista_servi.getTxtcosto_servicio().getText().equals("")|| vista_servi.getTxtid_empleado().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
              }else{
                    String id_servi = vista_servi.getTxtidservicio().getText().toString();
                    String nombre = vista_servi.getTxtnom_servicio().getText();
                    String descripcion = vista_servi.getAreadescripcion().getText();
                    String costo= vista_servi.getTxtcosto_servicio().getText();
                    String id_emple = vista_servi.getTxtid_empleado().getText().toString();


                    ModeloServicio servimod = new ModeloServicio();
                    servimod.setId_servicio(Integer.parseInt(String.valueOf(id_servi)));
                    servimod.setNom_servicio(nombre);
                    servimod.setDescri_servicio(descripcion);
                    servimod.setCosto_servicio(Double.parseDouble(String.valueOf(costo)));
                    servimod.setId_empleado(Integer.parseInt(String.valueOf(id_emple)));  
                    
                    if(servimod.ModificarServicio()){
                        JOptionPane.showMessageDialog(vista_servi, "Servicio modificado satisfactoriamente");
                        vista_servi.getDialog_Crear().setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(vista_servi, "No se pudo modificar el servicio");
                    }
                   }
        }
    }
    
    public void EliminarServicio(){
        int seleccionado = vista_servi.getTblServicio().getSelectedRow();
        int respuesta=0;
        Component rootPane = null;
        ModeloServicio servieli = new ModeloServicio();
          if(seleccionado !=-1){
            String idservi = vista_servi.getTblServicio().getValueAt(seleccionado, 0).toString();
            
            respuesta = JOptionPane.showConfirmDialog(rootPane, "¿Estas seguro que deseas eliminar este servicio?");
            if(respuesta==0){
                if(servieli.RemoverServicio(idservi)){
                    JOptionPane.showMessageDialog(rootPane,"El registro del servicio a sido eliminado");        
                }else{
                    JOptionPane.showMessageDialog(rootPane,"Error al eliminar");
                }

                }
            }else{
                JOptionPane.showMessageDialog(rootPane, "No hay datos a eliminar");
            }
    }
    
    
    public void modificar_servi() {
     vista_servi.getTxtidservicio().setEnabled(false);
     int seleccionado = vista_servi.getTblServicio().getSelectedRow();
      if(seleccionado !=-1){
          String id= vista_servi.getTblServicio().getValueAt(seleccionado, 0).toString();
          int cod = Integer.parseInt(id);
              vista_servi.getTxtidservicio().setText(id);
              vista_servi.getTxtnom_servicio().setText(vista_servi.getTblServicio().getValueAt(seleccionado, 1).toString());
              vista_servi.getAreadescripcion().setText(vista_servi.getTblServicio().getValueAt(seleccionado, 2).toString());
              vista_servi.getTxtcosto_servicio().setText(vista_servi.getTblServicio().getValueAt(seleccionado, 3).toString());
              vista_servi.getTxtid_empleado().setText(String.valueOf(vista_servi.getTblServicio().getValueAt(seleccionado, 4)));
              
              
    }else{
        JOptionPane.showMessageDialog(vista_servi, "No a seleccionado a niguna persona");
    }
   }
    
    public void limpiar_pro(){
      vista_servi.getTxtidservicio().setText("");
      vista_servi.getTxtnom_servicio().setText("");
      vista_servi.getTxtcosto_servicio().setText("");
      vista_servi.getAreadescripcion().setText("");
      vista_servi.getTxtid_empleado().setText("");
    }
    
    private void CargarProductos(){
        
//        //Enlazar el modelo de tabla con mi controlador.
//        DefaultTableModel tblModel;
//        tblModel=(DefaultTableModel)vista_servi.getTblServicio().getModel();
//        tblModel.setNumRows(0);//limpio filas de la tabla.
//
//        List<Servicios> listap=modelo_servi.listarServicios();//Enlazo al Modelo y obtengo los datos
//        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
//        listap.stream().forEach(pe->{
//            
//            tblModel.addRow(new Object[6]);//Creo una fila vacia/
//            vista_servi.getTblServicio().setValueAt(pe.getId_empleado(), i.value, 0);
//            vista_servi.getTblServicio().setValueAt(pe.getNom_servicio(), i.value, 1);
//            vista_servi.getTblServicio().setValueAt(pe.getDescri_servicio(), i.value, 2);
//            vista_servi.getTblServicio().setValueAt(pe.getCosto_servicio(), i.value, 3);
//            vista_servi.getTblServicio().setValueAt(pe.getId_empleado(), i.value, 5);
//            
//            i.value++;
//        });
        
    }
    
    public void cancelar_pro(){
        int respuesta = 0;
        respuesta = JOptionPane.showConfirmDialog(null,"¿Estas seguro que deseas cancelar?");
        if(respuesta==0){
            vista_servi.setVisible(true);
            vista_servi.getDialog_Crear().setVisible(false);
            }else{
                
            }
    }
    
}
