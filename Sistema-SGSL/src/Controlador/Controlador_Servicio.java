/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Empleado;
import Modelo.CLASES.Servicios;
import Modelo.Modelo_Servicio;
import Vista.Vista_Servicio;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author lorena
 */
public class Controlador_Servicio {
    private Modelo_Servicio modelo_servi;
    private Vista_Servicio vista_servi;

    public Controlador_Servicio(Modelo_Servicio modelo_servi, Vista_Servicio vista_servi) {
        this.modelo_servi = modelo_servi;
        this.vista_servi = vista_servi;
        vista_servi.setVisible(true);
        valida();
    }
    
    private void IncremetoID() {
        int n = modelo_servi.IncrementoIdServicio();
        int metodo = 10000+n; 
        vista_servi.getTxtidservicio().setText(String.valueOf(metodo));
    }
    
    public void iniciaControl(){
        vista_servi.getBtnActualizarServicio().addActionListener(l->CargarProductos());
        vista_servi.getBtnCrearServicio().addActionListener(l->abrirDialogo_pro(3));
        vista_servi.getBtnEditarServicio().addActionListener(l->abrirDialogo_pro(4));
        vista_servi.getBtnAceptar_pro1().addActionListener(l-> crearEditarServicio());
        vista_servi.getBtnRemoverServicio().addActionListener(l->EliminarServicio());
        vista_servi.getBtnCancelar_pro1().addActionListener(l->cancelar_pro());
        //vista.getBtnbuscar_pro().addActionListener(l->Buscarpro());
        
        vista_servi.getBtnveremple().addActionListener(l->abrirDialogo(1));
        vista_servi.getIngreemple().addActionListener(l->modificar_emple());
            
    }
    
    public void valida(){
        KeyListener vali = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               char letra = e.getKeyChar();
               if(Character.isDigit(letra)){
               e.consume();
               JOptionPane.showMessageDialog(vista_servi,"Solo acepta valores alfabeticos", "Validación de Letras", JOptionPane.ERROR_MESSAGE);
               }
                if(vista_servi.getTxtnom_servicio().getText().length()<=0){
                vista_servi.getTxtnom_servicio().setBackground(Color.RED);
                }else{
                vista_servi.getTxtnom_servicio().setBackground(Color.white);
                }
                if(vista_servi.getDescri_servicio().getText().length()<=0){
                vista_servi.getDescri_servicio().setBackground(Color.RED);
                }else{
                vista_servi.getDescri_servicio().setBackground(Color.white);
                }
               
               
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
            }
        };
        
         KeyListener vali2 = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               char num = e.getKeyChar();
               if(num<'0'||num>'9'){
               e.consume();
               }
               if(Character.isLetter(num)){
               e.consume();
               JOptionPane.showMessageDialog(vista_servi,"Solo acepta valores numericos", "Validación de Costo", JOptionPane.ERROR_MESSAGE);
               }
                if(vista_servi.getTxtcosto_servicio().getText().length()<=0){   
                vista_servi.getTxtcosto_servicio().setBackground(Color.RED);
                }else{
                vista_servi.getTxtcosto_servicio().setBackground(Color.white);
                }
               
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
               
               
            }
        };
         FocusListener focus = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
               
            }

            @Override
            public void focusLost(FocusEvent e) {
             if(vista_servi.getTxtcosto_servicio().getText().length()<=0){
                   
             vista_servi.getTxtcosto_servicio().setBackground(Color.RED);
             }else{
             vista_servi.getTxtcosto_servicio().setBackground(Color.white);
             }
             if(vista_servi.getTxtnom_servicio().getText().length()<=0){
             vista_servi.getTxtnom_servicio().setBackground(Color.RED);
             }else{
             vista_servi.getTxtnom_servicio().setBackground(Color.white);
             }
             if(vista_servi.getDescri_servicio().getText().length()<=0){
             vista_servi.getDescri_servicio().setBackground(Color.RED);
             }else{
             vista_servi.getDescri_servicio().setBackground(Color.white);
             }
             
            }
         };
        vista_servi.getTxtcosto_servicio().addKeyListener(vali2);
        vista_servi.getDescri_servicio().addKeyListener(vali);
        vista_servi.getTxtnom_servicio().addKeyListener(vali);
        vista_servi.getTxtnom_servicio().addFocusListener(focus);
        vista_servi.getTxtcosto_servicio().addFocusListener(focus);
        vista_servi.getDescri_servicio().addFocusListener(focus);
    }
    
    
    private void abrirDialogo_pro(int ce){
      String title;
        if(ce==3){
            title="Crear nuevo servicio";
            vista_servi.getDialog_Crear().setName("crear");
            IncremetoID();
            vista_servi.getTxtidservicio().setEditable(false);
            limpiar_pro();
        }else{
            title="Editar servicio";
            vista_servi.getDialog_Crear().setName("editar");
            modificar_servi();
        }
        vista_servi.getDialog_Crear().setLocationRelativeTo(vista_servi);
        vista_servi.getDialog_Crear().setSize(500,500);
        vista_servi.getDialog_Crear().setTitle(title);
        vista_servi.getDialog_Crear().setVisible(true); 
    }
     private void abrirDialogo(int ce){
        String title;
        if(ce==1){
            
            title="Visualizar Empleado";
            vista_servi.getDialogEmple().setName("Empleado");
            vista_servi.getDialogEmple().setLocationRelativeTo(vista_servi);
            vista_servi.getDialogEmple().setSize(600,400);
            vista_servi.getDialogEmple().setTitle(title);
            vista_servi.getDialogEmple().setVisible(true);
            CargarEmpleados();
        }else{
        }
    }
    
    private void crearEditarServicio(){
        if(vista_servi.getDialog_Crear().getName()=="crear"){
            //Insertar
              if ( vista_servi.getTxtidservicio().getText().equals("")||vista_servi.getTxtnom_servicio().getText().equals("") ||
                 vista_servi.getDescri_servicio().getText().equals("") ||  vista_servi.getTxtcosto_servicio().getText().equals("")|| vista_servi.getTxtid_empleado().getText().equals("")){
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
              }else{
                    String id_servi = vista_servi.getTxtidservicio().getText().toString();
                    String nombre = vista_servi.getTxtnom_servicio().getText();
                    String descripcion = vista_servi.getDescri_servicio().getText();
                    String costo= vista_servi.getTxtcosto_servicio().getText();
                    String id_emple = vista_servi.getTxtid_empleado().getText().toString();

                    Modelo_Servicio servi = new Modelo_Servicio();
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
                 vista_servi.getDescri_servicio().getText().equals("") ||  vista_servi.getTxtcosto_servicio().getText().equals("")|| vista_servi.getTxtid_empleado().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
              }else{
                    String id_servi = vista_servi.getTxtidservicio().getText().toString();
                    String nombre = vista_servi.getTxtnom_servicio().getText();
                    String descripcion = vista_servi.getDescri_servicio().getText();
                    String costo= vista_servi.getTxtcosto_servicio().getText();
                    String id_emple = vista_servi.getTxtid_empleado().getText().toString();


                    Modelo_Servicio servimod = new Modelo_Servicio();
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
        Modelo_Servicio servieli = new Modelo_Servicio();
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
              vista_servi.getDescri_servicio().setText(vista_servi.getTblServicio().getValueAt(seleccionado, 2).toString());
              vista_servi.getTxtcosto_servicio().setText(vista_servi.getTblServicio().getValueAt(seleccionado, 3).toString());
              vista_servi.getTxtid_empleado().setText(String.valueOf(vista_servi.getTblServicio().getValueAt(seleccionado, 4)));
              
              
    }else{
        JOptionPane.showMessageDialog(vista_servi, "No a seleccionado a niguna persona");
    }
   }
    
    public void limpiar_pro(){
//      vista_servi.getTxtidservicio().setText("");
      vista_servi.getTxtnom_servicio().setText("");
      vista_servi.getTxtcosto_servicio().setText("");
      vista_servi.getDescri_servicio().setText("");
      vista_servi.getTxtid_empleado().setText("");
    }
    
    private void CargarProductos(){
        
        //Enlazar el modelo de tabla con mi controlador.
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista_servi.getTblServicio().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla.

        List<Servicios> listap=modelo_servi.listarServicios();//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listap.stream().forEach(pe->{
            
            tblModel.addRow(new Object[6]);//Creo una fila vacia/
            vista_servi.getTblServicio().setValueAt(pe.getId_empleado(), i.value, 0);
            vista_servi.getTblServicio().setValueAt(pe.getNom_servicio(), i.value, 1);
            vista_servi.getTblServicio().setValueAt(pe.getDescri_servicio(), i.value, 2);
            vista_servi.getTblServicio().setValueAt(pe.getCosto_servicio(), i.value, 3);
            vista_servi.getTblServicio().setValueAt(pe.getId_empleado(), i.value, 4);
            
            i.value++;
        });
        
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
    
    private void CargarEmpleados(){
        
        //Enlazar el modelo de tabla con mi controlador.
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista_servi.getTblempleados().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla.

        List<Empleado> listap=modelo_servi.listarEmpleados();//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listap.stream().forEach(pe->{
            
            tblModel.addRow(new Object[3]);//Creo una fila vacia/
            vista_servi.getTblempleados().setValueAt(pe.getId_empleado(), i.value, 0);
            vista_servi.getTblempleados().setValueAt(pe.getEstado_civil(), i.value, 1);
            vista_servi.getTblempleados().setValueAt(pe.getFecha_contrato(), i.value, 2);
            
            i.value++;
        });
        
    }
    
    public void modificar_emple() {
    vista_servi.getTxtid_empleado().setEditable(false);
     int seleccionado = vista_servi.getTblempleados().getSelectedRow();
      if(seleccionado !=-1){
          String id= vista_servi.getTblempleados().getValueAt(seleccionado, 0).toString();
          int cod = Integer.parseInt(id);
              vista_servi.getTxtid_empleado().setText(id);
              vista_servi.getDialogEmple().setVisible(false);
              
              
    }else{
        JOptionPane.showMessageDialog(vista_servi, "No a seleccionado a niguna persona");
    }
   }
}
