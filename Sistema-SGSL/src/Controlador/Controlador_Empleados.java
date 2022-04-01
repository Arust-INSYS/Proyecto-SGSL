/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Empleado;
import Modelo.CLASES.Persona;
import Modelo.CLASES.Rol;
import Modelo.Modelo_Empleado;
import Modelo.Modelo_Persona;
import Vista.Vista_Empleado;
import Vista.Vista_Persona;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

/**
 *
 * @author lorena
 */
public class Controlador_Empleados {
    private Modelo_Empleado modelo_emple;
    private Vista_Empleado vista_emple;
    private Modelo_Persona modelPer;
    private JFileChooser jfc;
    private Vista_Persona viewper;
    Controlador_Fecha  conf = new  Controlador_Fecha();

    public Controlador_Empleados(Modelo_Empleado modelo_emple, Vista_Empleado vista_emple, Modelo_Persona modelPer, Vista_Persona viewper) {
        this.modelo_emple = modelo_emple;
        this.vista_emple = vista_emple;
        this.modelPer = modelPer;
        this.viewper = viewper;
        vista_emple.setVisible(true);
        valida();
        CargarEmpleados();
    }

    //Metodo de incremento de id de empleado automatico
    private void IncremetoID() {
        int n = modelo_emple.IncrementoIdEmpleado();
        int metodo = 100 + n;
        vista_emple.getTxtidempleado().setText(String.valueOf(metodo));
    }

    //Metodo de control inicial para llamar a las acciones.
    public void iniciaControl() {
        vista_emple.getBtnActualizar().addActionListener(l -> CargarEmpleados());
        vista_emple.getBtnCrear().addActionListener(l -> abrirDialogo_emple(1));
        vista_emple.getBtnEditar().addActionListener(l -> TipoDialogoAbrirEmpleado());
        vista_emple.getBtnAceptar().addActionListener(l -> crearEditarEmpleado());
        vista_emple.getBtnRemover().addActionListener(l -> EliminarEmpleadoView());
        vista_emple.getBtnCancelar().addActionListener(l -> cancelar_emple());

        //vista.getBtnbuscar_pro().addActionListener(l->Buscarpro());
        vista_emple.getVerper().addActionListener(l -> abrirDialogo(1));
        vista_emple.getBtningresar().addActionListener(l -> modificar_per());
        viewper.getBtnAceptarPer().addActionListener(l->EditarPersona());
//        vista_emple.getLblbuscar().addAncestorListener(l->BuscarEmpleado());
    }
    
//Validaciones para los campos de la interfaz mediante la accion key.
    public void valida() {
        KeyListener vali = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char sul = e.getKeyChar();
                if (sul < '0' || sul > '9') {
                    e.consume();
                }
                if (Character.isLetter(sul)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vista_emple, "Solo acepta valores numericos", "Validación sueldo", JOptionPane.WARNING_MESSAGE);
                }
                if (vista_emple.getTxtsueldo().getText().length() >= 1) {
                    vista_emple.getLblSueldoRojo().setVisible(false);
                } else {
                    vista_emple.getLblSueldoRojo().setVisible(true);
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

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
               String busqueda = vista_emple.getTxtBuscarEmpleado().getText().toLowerCase();
                if (vista_emple.getTxtBuscarEmpleado().getText().trim().isEmpty()) {
                    CargarEmpleados();
                } else {
                   BuscarEmpleado(busqueda);
                }

            
            }
        };
        FocusListener focosuel = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
             if (vista_emple.getTxtsueldo().getText().length() >= 1) {
                    vista_emple.getLblSueldoRojo().setVisible(false);
                } else {
                    vista_emple.getLblSueldoRojo().setVisible(true);
                }
            }
        };
        FocusListener focosesta = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (vista_emple.getBoxEstado().getSelectedItem()== "Seleccionar") {
                    vista_emple.getLblEstadoRojo().setVisible(false);
                } else {
                    vista_emple.getLblEstadoRojo().setVisible(true);
                }
            }
        };
        vista_emple.getTxtBuscarEmpleado().addKeyListener(buscar);
        vista_emple.getTxtsueldo().addKeyListener(vali);
    }

   // Abre el dialogo para crear y editar empleado
    private void abrirDialogo_emple(int ce) {
        String title = null;
        if (ce == 1) {
            title = "Crear nuevo empleado";
            vista_emple.getDialogEmpleado().setName("crear");
            IncremetoID();
            vista_emple.getTxtidempleado().setEditable(false);
            limpiar_emple();
        } else {
            if(ce==2){
            title = "Editar empleado";
            vista_emple.getDialogEmpleado().setName("editar");
            modificar_emple();
            }
        }
        vista_emple.getDialogEmpleado().setLocationRelativeTo(vista_emple);
        vista_emple.getDialogEmpleado().setSize(500, 500);
        vista_emple.getDialogEmpleado().setLocation(600, 80);
        vista_emple.getDialogEmpleado().setTitle(title);
        vista_emple.getDialogEmpleado().setVisible(true);
    }
    
//Abre el dialogo para vizualizar a la persona mediante la tabla de carga de datos.
    private void abrirDialogo(int ce) {
        String title;
        if (ce == 1) {

            title = "Visualizar Persona";
            vista_emple.getDialogPersona().setName("Persona");
            vista_emple.getDialogPersona().setLocationRelativeTo(vista_emple);
            vista_emple.getDialogPersona().setSize(600, 400);
            vista_emple.getDialogPersona().setTitle(title);
            vista_emple.getDialogPersona().setVisible(true);
            CargarPersona();
        } else {
        }
    }
    
    
 // Metodo de opcion, que realiza el llamado al dialogo persona o empleado segun elija.   
    private void TipoDialogoAbrirEmpleado() {

        int i = vista_emple.getTblEmpleado().getSelectedRow();

        if (i != -1) {
            int cod = Integer.parseInt(vista_emple.getTblEmpleado().getValueAt(i, 4).toString());
            System.out.println("Entro tipo de dialogo-->" + cod);
            String[] cade = {"Persona", "Empleado", "Cancelar"};
            int nu = JOptionPane.showOptionDialog(null, "Elija el tipo de edicion que decea realizar.", "Opción de edicion.", 0, JOptionPane.DEFAULT_OPTION, null, cade, "Cancelar");
            if (nu == 0) {
                System.out.println("Persona");
                viewper.getTxt_ID_Persona().setEditable(false);
                EdicionPersonaEmpleCL(cod);
                String titulo = "Editar Persona";
                viewper.getDialogoPersona().setName("Editar");
                viewper.getDialogoPersona().setVisible(true);
                viewper.getDialogoPersona().setLocation(600, 80);
                viewper.getDialogoPersona().setSize(490, 543);
                viewper.getDialogoPersona().setTitle(titulo);
            }
            if (nu == 1) {
                System.out.println("Empleado");
//                CargarEdicionCliente();
                abrirDialogo_emple(2);
//                viewper.getDialogoPersona().setTitle(titulo);
            }
        } else {
            JOptionPane.showMessageDialog(vista_emple, "Error, debe seleccionar una fila para la edición.", "Modificar de persona.", JOptionPane.ERROR_MESSAGE);
        }
    }

    
//Metodo para editar la persona que se llamo al dialogo, desde la vista empleado.
    private void EdicionPersonaEmpleCL(int codigo) {
        System.out.println("Codigoooooooo------------>" + codigo);
        List<Persona> listaBusper = modelPer.listarPersonas();
        for (int i = 0; i < listaBusper.size(); i++) {
            System.out.println("Ingreso al for de edicion persona");
            if (listaBusper.get(i).getId_persona() == codigo) {
                System.out.println("Ingreso al fi de la edicon de persona");
                viewper.getTxt_ID_Persona().setText(String.valueOf(listaBusper.get(i).getId_persona()));
                viewper.getTxtCedulaPersona().setText(listaBusper.get(i).getCedula());
                viewper.getTxtNombrePersona().setText(listaBusper.get(i).getNombre());
                viewper.getTxtApellidoPersona().setText(listaBusper.get(i).getApellido());
                Date fechan = (Date) listaBusper.get(i).getFecha_nacimiento();
                viewper.getFechaNacimientoPer().setDate(fechan);
                if (listaBusper.get(i).getGenero().equals("M")) {
                    viewper.getRadioBtnMasculino().setSelected(true);
                }
                if (listaBusper.get(i).getGenero().equals("F")) {
                    viewper.getRadioBtnFemenino().setSelected(true);
                }
                viewper.getTxtDireccionPersona().setText(listaBusper.get(i).getDireccion());
                if (listaBusper.get(i).getFoto() == null) {
                    viewper.getLblFotoPersona().setIcon(null);
                } else {
                    Image in = listaBusper.get(i).getFoto();
                    Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                    Icon icono = new ImageIcon(img);
                    viewper.getLblFotoPersona().setIcon(icono);
                }
            }
        }
    }
 
    //Metodo Para cargar los cambios hechos en el dialogo de la persona que se llamo.
    public void EditarPersona() {
        Modelo_Persona modelPerE = new Modelo_Persona();
        modelPerE.setId_persona(Integer.parseInt(viewper.getTxt_ID_Persona().getText()));
        modelPerE.setCedula(viewper.getTxtCedulaPersona().getText());
        modelPerE.setNombre(viewper.getTxtNombrePersona().getText());
        modelPerE.setApellido(viewper.getTxtApellidoPersona().getText());
        String fechaNacimiento = ((JTextField) viewper.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        Date fechaN = java.sql.Date.valueOf(fechaNacimiento);
        modelPerE.setFecha_nacimiento((java.sql.Date) fechaN);
        modelPerE.setGenero(GeneroPersona());
        modelPerE.setDireccion(viewper.getTxtDireccionPersona().getText());
        if (jfc == null) {
            if (modelPerE.ModificarPersonaFT()) {
                JOptionPane.showMessageDialog(vista_emple, "La Persona a sido modificado satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(vista_emple, "Error, no se pudo modificar la Persona.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (jfc != null) {
                try {
                    FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                    int largo = (int) jfc.getSelectedFile().length();
                    modelPerE.setImagen(img);
                    modelPerE.setLargo(largo);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Controlador_Persona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (modelPerE.ModificarPersonaBDA()) {
                JOptionPane.showMessageDialog(vista_emple, "La Persona a sido modificado satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(vista_emple, "Error, no se pudo modificar la Persona.");
            }
        }

    }

    //Metodo para validar la creacion y el editar de un empleado mediante el ingreso de datos en el dialog.
    private void crearEditarEmpleado() {
        if (vista_emple.getDialogEmpleado().getName() == "crear") {
            //Insertar
            if (vista_emple.getTxtidempleado().getText().equals("") || vista_emple.getTxtsueldo().getText().equals("")
                    || vista_emple.getBoxEstado().getSelectedItem().equals("") || vista_emple.getBoxrol().getSelectedItem().equals("")|| vista_emple.getTxtid_persona().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
            } else {
                String id_emple = vista_emple.getTxtidempleado().getText().toString();
                String sueldo = vista_emple.getTxtsueldo().getText();
                String estado = vista_emple.getBoxEstado().getSelectedItem().toString();
                String fechacontra = ((JTextField) vista_emple.getContratacion().getDateEditor().getUiComponent()).getText();
                Date contratacion = java.sql.Date.valueOf(fechacontra);
                String id_per = vista_emple.getTxtid_persona().getText().toString();
                String rol = vista_emple.getBoxrol().getSelectedItem().toString();

                Modelo_Empleado emple = new Modelo_Empleado();
                emple.setId_empleado(Integer.parseInt(String.valueOf(id_emple)));
                emple.setSueldo(Double.parseDouble(String.valueOf(sueldo)));
                emple.setEstado_civil(estado);
                emple.setFecha_contrato((java.sql.Date) contratacion);
                emple.setId_persona(Integer.parseInt(String.valueOf(id_per)));
                if(fechacontra.isEmpty() || conf.FechaNacimiento(vista_emple.getContratacion()) == false){
      
                }else{
                int idrol = modelo_emple.IdRol(rol);
                if(ValidaEmpleadoRepetido(Integer.parseInt(vista_emple.getTxtid_persona().getText())) == true){
                    JOptionPane.showMessageDialog(vista_emple, "Empleado Repetido, este id ya existe.", "Empleado Repetido.", JOptionPane.ERROR_MESSAGE);
                }else{
               if (emple.creaEmpleado()) {
                    int id_user = modelo_emple.IncrementoIdUsuario();
                    if (modelo_emple.CrearUser(Integer.parseInt(id_emple), idrol, id_user)) {
                        JOptionPane.showMessageDialog(vista_emple, "Servicio creado satisfactoriamente");
                        vista_emple.getDialogEmpleado().setVisible(false);
                        limpiar_emple();
                        CargarEmpleados();
                    } else {
                        System.out.println("Error al crear al usuario");
                    }

                } else {
                    JOptionPane.showMessageDialog(vista_emple, "No se pudo crear el producto");
                }
                }
            }
            }

        } else if (vista_emple.getDialogEmpleado().getName() == "editar") {
            if (vista_emple.getTxtidempleado().getText().equals("") || vista_emple.getTxtsueldo().getText().equals("")
                    || vista_emple.getBoxEstado().getSelectedItem().equals("Seleccionar") || vista_emple.getContratacion().getDate().equals("") || vista_emple.getTxtid_persona().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "INGRESE TODOS LOS CAMPOS");
            } else {
                String id_emple = vista_emple.getTxtidempleado().getText().toString();
                String sueldo = vista_emple.getTxtsueldo().getText();
                String estado = vista_emple.getBoxEstado().getSelectedItem().toString();
                String fechacontra = ((JTextField) vista_emple.getContratacion().getDateEditor().getUiComponent()).getText();
                Date contratacion = java.sql.Date.valueOf(fechacontra);
                String id_per = vista_emple.getTxtid_persona().getText().toString();
//                    String rol = vista_emple.getBoxRoles().getSelectedItem().toString();

                Modelo_Empleado emple = new Modelo_Empleado();
                emple.setId_empleado(Integer.parseInt(String.valueOf(id_emple)));
                emple.setSueldo(Double.parseDouble(String.valueOf(sueldo)));
                emple.setEstado_civil(estado);
                emple.setFecha_contrato((java.sql.Date) contratacion);
                emple.setId_persona(Integer.parseInt(String.valueOf(id_per)));
//                    emple.setRol(rol);

                if (emple.ModificarEmpleado()) {
                    JOptionPane.showMessageDialog(vista_emple, "Servicio modificado satisfactoriamente");
                    vista_emple.getDialogEmpleado().setVisible(false);
                    CargarEmpleados();
                } else {
                    JOptionPane.showMessageDialog(vista_emple, "No se pudo modificar el servicio");
                }
            }
        }
    }

 //Metodo para llamar al dialogo a la persona que se le selecciono.  
    public void modificar_per() {
        vista_emple.getTxtid_persona().setEditable(false);
        int seleccionado = vista_emple.getTblPersonas().getSelectedRow();
        if (seleccionado != -1) {
            String id = vista_emple.getTblPersonas().getValueAt(seleccionado, 0).toString();
            int cod = Integer.parseInt(id);
            vista_emple.getTxtid_persona().setText(id);
//              vista_emple.getTxtid_persona().setText(vista_emple.getTblPersonas().getValueAt(seleccionado, 0).toString());
        }
        vista_emple.getDialogPersona().setVisible(false);
    }
    
  
    //Metodo para cambiar el estado de empleado de activo a inactivo.
    private void EliminarEmpleadoView() {
        int i = vista_emple.getTblEmpleado().getSelectedRow();
        if (i != -1) {
            String idpersona = vista_emple.getTblEmpleado().getValueAt(i, 0).toString();
            int aux = Integer.parseInt(idpersona);
            String ide = vista_emple.getTblEmpleado().getValueAt(i, 0).toString();
            int result = JOptionPane.showConfirmDialog(vista_emple, "Esta seguro que desea eliminar al empleado con codigo " + ide + "?", "Confirmación .", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (modelo_emple.RemoverEmpleado(aux)) {
                    JOptionPane.showMessageDialog(vista_emple, "El Empleado a sido eliminado correctamente de la base de datos.");
                    CargarEmpleados();
                } else {
                    JOptionPane.showMessageDialog(vista_emple, "Se ha producido un error al rato de eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vista_emple, "Registro cancelado para su eliminación.");
            }
        } else {
            JOptionPane.showMessageDialog(vista_emple, "Error, usted debe seleccionar un registro de la tabla para proceder a su eliminación.", "Eliminar.", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    //Metodo para modificar el empleado que a sido seleccionado
    public void modificar_emple() {
        vista_emple.getTxtidempleado().setEnabled(false);
        int seleccionado = vista_emple.getTblEmpleado().getSelectedRow();
        if (seleccionado != -1) {
            String id = vista_emple.getTblEmpleado().getValueAt(seleccionado, 0).toString();
            int cod = Integer.parseInt(id);
            vista_emple.getTxtidempleado().setText(id);
            vista_emple.getTxtsueldo().setText(vista_emple.getTblEmpleado().getValueAt(seleccionado, 1).toString());
            vista_emple.getBoxEstado().setSelectedItem(vista_emple.getTblEmpleado().getValueAt(seleccionado, 2).toString());
            Date fec = (Date) vista_emple.getTblEmpleado().getValueAt(seleccionado, 3);
            vista_emple.getContratacion().setDate(fec);
            vista_emple.getTxtid_persona().setText(String.valueOf(vista_emple.getTblEmpleado().getValueAt(seleccionado, 4)));

        } else {
            JOptionPane.showMessageDialog(vista_emple, "No a seleccionado a niguna persona");
        }
    }

    //Metodo para limpiar los campos de el dialogo.
    public void limpiar_emple() {

        vista_emple.getTxtsueldo().setText("");
        vista_emple.getBoxEstado().setSelectedIndex(0);
        vista_emple.getContratacion().setDate(null);
        vista_emple.getTxtid_persona().setText("");
    }
    
    //Metodo para cargar los empleados dentro de la tabla de la vista principal.
    private void CargarEmpleados() {

        //Enlazar el modelo de tabla con mi controlador.
        DefaultTableModel tblModel;
        tblModel = (DefaultTableModel) vista_emple.getTblEmpleado().getModel();
        tblModel.setNumRows(0);//limpio filas de la tabla.

        List<Empleado> listap = modelo_emple.listarEmpleados();//Enlazo al Modelo y obtengo los datos
        Holder<Integer> i = new Holder<>(0);//contador para el no. fila
        listap.stream().forEach(pe -> {

            tblModel.addRow(new Object[6]);//Creo una fila vacia/
            vista_emple.getTblEmpleado().setValueAt(pe.getId_empleado(), i.value, 0);
            vista_emple.getTblEmpleado().setValueAt(pe.getSueldo(), i.value, 1);
            vista_emple.getTblEmpleado().setValueAt(pe.getEstado_civil(), i.value, 2);
            vista_emple.getTblEmpleado().setValueAt(pe.getFecha_contrato(), i.value, 3);
            vista_emple.getTblEmpleado().setValueAt(pe.getId_persona(), i.value, 4);
//            vista_emple.getTblEmpleado().setValueAt(pe.getRol(), i.value, 5);

            i.value++;
        });

    }
    
    //Cargar en los datos en la tabla persona, que se llamo a buscar. 
    private void CargarPersona() {
        vista_emple.getTblPersonas().setDefaultRenderer(Object.class, new Imangentabla());
        vista_emple.getTblPersonas().setRowHeight(100);
        DefaultTableModel tb = (DefaultTableModel) vista_emple.getTblPersonas().getModel();
        tb.setNumRows(0);
        List<Persona> listaPersonas = modelo_emple.listarPersonas();
        Holder<Integer> i = new Holder<>(0);
        listaPersonas.stream().forEach(p -> {

            tb.addRow(new Object[5]);
            vista_emple.getTblPersonas().setValueAt(p.getId_persona(), i.value, 0);
            vista_emple.getTblPersonas().setValueAt(p.getCedula(), i.value, 1);
            vista_emple.getTblPersonas().setValueAt(p.getNombre(), i.value, 2);
            vista_emple.getTblPersonas().setValueAt(p.getApellido(), i.value, 3);
            Image foto = p.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vista_emple.getTblPersonas().setValueAt(new JLabel(icono), i.value, 4);
            } else {
                vista_emple.getTblPersonas().setValueAt(null, i.value, 4);
            }
            i.value++;
        });
    }

    //Metodo para el boton de cancelar la opcion dentro del dialogo.
    public void cancelar_emple() {
        int respuesta = 0;
        respuesta = JOptionPane.showConfirmDialog(null, "¿Estas seguro que deseas cancelar?");
        if (respuesta == 0) {
            vista_emple.setVisible(true);
            vista_emple.getDialogEmpleado().setVisible(false);
        } else {

        }
    }

    //
    public void ComboRol() {
        List<Rol> rl = modelo_emple.llenarComboRol();
        vista_emple.getBoxrol().removeAllItems();
        vista_emple.getBoxrol().addItem("Seleccione");
        for (Rol rol : rl) {
            vista_emple.getBoxrol().addItem(rol.getNombre_rol());
        }
    }
    
    //Control del dialogo de persona mediante validaciones de campos
    private void EdicionPersonaControl() {
        boolean verificoED = true;
        String fec = ((JTextField) viewper.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        if (viewper.getDialogoPersona().getName().equals("Editar")) {
            if (viewper.getTxtCedulaPersona().getText().isEmpty()) {
                viewper.getLblCedulaRojo().setVisible(true);
            } else {
                viewper.getLblCedulaRojo().setVisible(false);

                if (viewper.getTxtNombrePersona().getText().isEmpty()) {
                    viewper.getLblNombreRojo().setVisible(true);

                } else {
                    viewper.getLblNombreRojo().setVisible(false);

                    if (viewper.getTxtApellidoPersona().getText().isEmpty()) {

                        viewper.getLblApellido().setVisible(true);
                    } else {
                        viewper.getLblApellido().setVisible(false);
                        if (fec.isEmpty()) {
                            viewper.getLbLFechaRojo().setVisible(true);

                        } else {
                            viewper.getLbLFechaRojo().setVisible(false);
                            if (viewper.getGrupoBotonGenero().isSelected(null)) {
                                viewper.getLblGeneroRojo().setVisible(true);

                            } else {
                                viewper.getLblGeneroRojo().setVisible(false);
                                if (validadorDeCedula(viewper.getTxtCedulaPersona().getText()) == false) {
                                    JOptionPane.showMessageDialog(viewper, "Por favor digite una cedula ecuatoriana valida .", "Cédula Ecuatoriana.", JOptionPane.ERROR_MESSAGE);
                                    viewper.getLblCedulaRojo().setVisible(true);
                                } else {
                                    viewper.getLblCedulaRojo().setVisible(false);
                                    EditarPersona();
                                    verificoED = true;
                                    System.out.println("Ingreso a metodo de la modificasión.");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    public String GeneroPersona() {
        String GeneroPerso = "";
        viewper.getGrupoBotonGenero().add(viewper.getRadioBtnMasculino());
        viewper.getGrupoBotonGenero().add(viewper.getRadioBtnFemenino());
        if (viewper.getRadioBtnMasculino().isSelected()) {
            GeneroPerso = "M";
        }
        if (viewper.getRadioBtnFemenino().isSelected()) {
            GeneroPerso = "F";
        }
        return GeneroPerso;
    }
    
    //Metodo para celda de control de colores de los labels de cada seccion.
    private void ControlLblPrincipalesActivos() {
        viewper.getLblCedulaRojo().setVisible(false);
        viewper.getLblNombreRojo().setVisible(false);
        viewper.getLblApellido().setVisible(false);
        viewper.getLbLFechaRojo().setVisible(false);
        viewper.getLblGeneroRojo().setVisible(false);
    }
    
    
    //Validacion para el ingreso correcto de cedula.
    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    // Coeficientes de validación cédula
                    // El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            System.out.println("Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            System.out.println("La Cédula ingresada es Incorrecta");
        }
        return cedulaCorrecta;
    }
    
    
    //Metodo de busqueda de empleado
    private void BuscarEmpleado(String codigo) {
        DefaultTableModel tb = (DefaultTableModel) vista_emple.getTblEmpleado().getModel();
        tb.setNumRows(0);
        List<Empleado> listaEmpelado = modelo_emple.BuscarEmple(codigo);
        listaEmpelado.stream().forEach(e -> {
            String[] empleado = {String.valueOf(e.getId_empleado()), String.valueOf(e.getSueldo()), e.getEstado_civil(), String.valueOf(e.getFecha_contrato()), String.valueOf(e.getId_persona())};
            tb.addRow(empleado);
        });
    }
    
    //Validacion para no repetir empleado.
     private boolean ValidaEmpleadoRepetido(int idrepetidoC) {
        boolean idreprtido = false;
        List<Empleado> listaE = modelo_emple.listarEmpleados();
        for (int i = 0; i < listaE.size(); i++) {
            if (listaE.get(i).getId_persona() == idrepetidoC) {
                idreprtido = true;
            }
        }
        return idreprtido;
    }

}
