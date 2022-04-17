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
import java.time.LocalDate;
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
    LocalDate fechahoy = LocalDate.now();

    public Controlador_Servicio(Modelo_Servicio modelo_servi, Vista_Servicio vista_servi) {
        this.modelo_servi = modelo_servi;
        this.vista_servi = vista_servi;
        vista_servi.setVisible(true);
        valida();
        CargarServicios();
        vista_servi.getTxtfechahoy().setText(fechahoy + "");
    }
    
    //Metodo de incremento de id de empleado automatico
    private void IncremetoID() {
        int n = modelo_servi.IncrementoIdServicio();
        int metodo = 10000+n; 
        vista_servi.getTxtidservicio().setText(String.valueOf(metodo));
    }
    
    //Metodo de control inicial para llamar a las acciones.
    public void iniciaControl(){
        vista_servi.getBtnActualizarServicio().addActionListener(l->CargarServicios());
        vista_servi.getBtnCrearServicio().addActionListener(l->abrirDialogo_servi(3));
        vista_servi.getBtnEditarServicio().addActionListener(l->abrirDialogo_servi(4));
        vista_servi.getBtnAceptar_pro1().addActionListener(l-> crearEditarServicio());
        vista_servi.getBtnRemoverServicio().addActionListener(l->EliminarServicio());
        vista_servi.getBtnCancelar_pro1().addActionListener(l->cancelar_pro());
        //vista.getBtnbuscar_pro().addActionListener(l->Buscarpro());
        
        vista_servi.getBtnveremple().addActionListener(l->abrirDialogo(1));
        vista_servi.getIngreemple().addActionListener(l->modificar_emple());
            
    }
    
    //Validaciones para los campos de la interfaz mediante la accion key.
    public void valida(){
        KeyListener vali = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
               char letra = e.getKeyChar();
               if(Character.isDigit(letra)){
               e.consume();
               JOptionPane.showMessageDialog(vista_servi,"Solo acepta valores alfabeticos", "Validación de Letras", JOptionPane.WARNING_MESSAGE);
               }
                if (vista_servi.getDescri_servicio().getText().length() >= 1) {
                    vista_servi.getLblDescripcionRojo1().setVisible(false);
                } else {
                    vista_servi.getLblDescripcionRojo1().setVisible(true);
                }
                if (vista_servi.getTxtnom_servicio().getText().length() >= 1) {
                    vista_servi.getLblNombreRojo().setVisible(false);
                } else {
                    vista_servi.getLblNombreRojo().setVisible(true);
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
               JOptionPane.showMessageDialog(vista_servi,"Solo acepta valores numericos", "Validación de Costo", JOptionPane.WARNING_MESSAGE);
               }
//                if(vista_servi.getTxtcosto_servicio().getText().length()<=0){   
//                vista_servi.getTxtcosto_servicio().setBackground(Color.RED);
//                }else{
//                vista_servi.getTxtcosto_servicio().setBackground(Color.white);
//                }
                if (vista_servi.getTxtcosto_servicio().getText().length() >= 1) {
                    vista_servi.getLblCostoRojo().setVisible(false);
                } else {
                    vista_servi.getLblCostoRojo().setVisible(true);
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
//             if(vista_servi.getTxtcosto_servicio().getText().length()<=0){
//                   
//             vista_servi.getTxtcosto_servicio().setBackground(Color.RED);
//             }else{
//             vista_servi.getTxtcosto_servicio().setBackground(Color.white);
//             }
//             if(vista_servi.getTxtnom_servicio().getText().length()<=0){
//             vista_servi.getTxtnom_servicio().setBackground(Color.RED);
//             }else{
//             vista_servi.getTxtnom_servicio().setBackground(Color.white);
//             }
//             if(vista_servi.getDescri_servicio().getText().length()<=0){
//             vista_servi.getDescri_servicio().setBackground(Color.RED);
//             }else{
//             vista_servi.getDescri_servicio().setBackground(Color.white);
//             }

                if (vista_servi.getTxtnom_servicio().getText().length() >= 1) {
                    vista_servi.getLblNombreRojo().setVisible(false);
                } else {
                    vista_servi.getLblNombreRojo().setVisible(true);
                }
                
             
            }
         };
         FocusListener focoscosto = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
               
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (vista_servi.getTxtcosto_servicio().getText().length() >= 1) {
                    vista_servi.getLblCostoRojo().setVisible(false);
                } else {
                    vista_servi.getLblCostoRojo().setVisible(true);
                }
            }
         };
         FocusListener focosdescri = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (vista_servi.getDescri_servicio().getText().length() >= 1) {
                    vista_servi.getLblDescripcionRojo1().setVisible(false);
                } else {
                    vista_servi.getLblDescripcionRojo1().setVisible(true);
                }
            }
         };
         KeyListener buscar = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
               String busqueda = vista_servi.getTxtBuscarServicio().getText().toLowerCase();
                if (vista_servi.getTxtBuscarServicio().getText().trim().isEmpty()) {
                    CargarServicios();
                } else {
                   BuscarServicio(busqueda);
                }

            
            }
        };
        vista_servi.getTxtcosto_servicio().addKeyListener(vali2);
        vista_servi.getDescri_servicio().addKeyListener(vali);
        vista_servi.getTxtnom_servicio().addKeyListener(vali);
        vista_servi.getTxtnom_servicio().addFocusListener(focus);
        vista_servi.getTxtcosto_servicio().addFocusListener(focoscosto);
        vista_servi.getDescri_servicio().addFocusListener(focosdescri);
        vista_servi.getTxtBuscarServicio().addKeyListener(buscar);
    }
    
    // Abre el dialogo para crear y editar el servicio
    private void abrirDialogo_servi(int ce){
      String title;
        if(ce==3){
            title="Crear nuevo servicio";
            vista_servi.getDialog_Crear().setName("crear");
            IncremetoID();
            vista_servi.getTxtidservicio().setEditable(false);
            vista_servi.getTxtid_empleado().setEditable(false);
            limpiar_pro();
        }else{
            title="Editar servicio";
            vista_servi.getDialog_Crear().setName("editar");
            modificar_servi();
        }
        vista_servi.getDialog_Crear().setLocationRelativeTo(vista_servi);
        vista_servi.getDialog_Crear().setSize(700, 390);
        vista_servi.getDialog_Crear().setTitle(title);
        vista_servi.getDialog_Crear().setVisible(true); 
    }
    
    //Abre el dialogo para vizualizar al empleado mediante la tabla de carga de datos.
     private void abrirDialogo(int ce){
        String title;
        if(ce==1){
            
            title="Visualizar Empleado";
            vista_servi.getDialogEmple().setName("Empleado");
            vista_servi.getDialogEmple().setLocationRelativeTo(vista_servi);
            vista_servi.getDialogEmple().setSize(700,390);
            vista_servi.getDialogEmple().setTitle(title);
            vista_servi.getDialogEmple().setVisible(true);
            CargarEmpleados();
        }else{
        }
    }
    
    //Metodo para validar la creacion y el editar de un servicio mediante el ingreso de datos en el dialog.
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
                        CargarServicios();
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
                        CargarServicios();
                    }else{
                        JOptionPane.showMessageDialog(vista_servi, "No se pudo modificar el servicio");
                    }
                   }
        }
    }
    
     //Metodo para cambiar el estado de servicio de activo a inactivo.
    public void EliminarServicio(){
        int i = vista_servi.getTblServicio().getSelectedRow();
        if (i != -1) {
            String ide = vista_servi.getTblServicio().getValueAt(i, 0).toString();
            Modelo_Servicio servieli = new Modelo_Servicio();
            int result = JOptionPane.showConfirmDialog(vista_servi, "Esta seguro que desea eliminar al servicio con codigo " + ide + "?", "Confirmación .", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (servieli.RemoverServicio(ide)) {
                    JOptionPane.showMessageDialog(vista_servi, "El Servicio a sido eliminado correctamente de la base de datos.");
                    CargarServicios();
                } else {
                    JOptionPane.showMessageDialog(vista_servi, "Se ha producido un error al rato de eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vista_servi, "Registro cancelado para su eliminación.");
            }
        } else {
            JOptionPane.showMessageDialog(vista_servi, "Error, usted debe seleccionar un registro de la tabla para proceder a su eliminación.", "Eliminar.", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Metodo para modificar el servicio que a sido seleccionado
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
    
    //Metodo para limpiar los campos de el dialogo.
    public void limpiar_pro(){
//      vista_servi.getTxtidservicio().setText("");
      vista_servi.getTxtnom_servicio().setText("");
      vista_servi.getTxtcosto_servicio().setText("");
      vista_servi.getDescri_servicio().setText("");
      vista_servi.getTxtid_empleado().setText("");
    }
    
    //Metodo para cel control de colores de los labels de cada seccion.
    private void ControlLblPrincipalesActivos() {
        vista_servi.getLblCostoRojo().setVisible(false);
        vista_servi.getLblNombreRojo().setVisible(false);
        vista_servi.getLblDescripcionRojo1().setVisible(false);
    }

    //Metodo para cargar los servicios dentro de la tabla de la vista principal.
    private void CargarServicios(){
        
        //Enlazar el modelo de tabla con mi controlador.
        DefaultTableModel tblModel;
        tblModel=(DefaultTableModel)vista_servi.getTblServicio().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla.

        List<Servicios> listap=modelo_servi.listarServicios();//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listap.stream().forEach(pe->{
            
            tblModel.addRow(new Object[6]);//Creo una fila vacia/
            vista_servi.getTblServicio().setValueAt(pe.getId_servicio(), i.value, 0);
            vista_servi.getTblServicio().setValueAt(pe.getNom_servicio(), i.value, 1);
            vista_servi.getTblServicio().setValueAt(pe.getDescri_servicio(), i.value, 2);
            vista_servi.getTblServicio().setValueAt(pe.getCosto_servicio(), i.value, 3);
            vista_servi.getTblServicio().setValueAt(pe.getId_empleado(), i.value, 4);
            
            i.value++;
        });
        
    }
    
    
    //Metodo para el boton de cancelar la opcion dentro del dialogo.
    public void cancelar_pro(){
        int respuesta = 0;
        respuesta = JOptionPane.showConfirmDialog(null,"¿Estas seguro que deseas cancelar?");
        if(respuesta==0){
            vista_servi.setVisible(true);
            vista_servi.getDialog_Crear().setVisible(false);
            }else{
                
            }
    }
    
    //Metodo para cargar los empleados dentro de la tabla de la vista del dialog.
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
    
    //Metodod para llevar el empleado seleccionado al txt correspondiente.
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
    
        private void BuscarServicio(String codigo) {
        DefaultTableModel tb = (DefaultTableModel) vista_servi.getTblServicio().getModel();
        tb.setNumRows(0);
        List<Servicios> listaServicio = modelo_servi.BuscarServi(codigo);
        listaServicio.stream().forEach(e -> {
            String[] servicio = {String.valueOf(e.getId_servicio()), e.getNom_servicio(), e.getDescri_servicio(), String.valueOf(e.getCosto_servicio()), String.valueOf(e.getId_empleado())};
            tb.addRow(servicio);
        });
    }
}
