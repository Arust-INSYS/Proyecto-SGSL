/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Cliente;
import Modelo.CLASES.Persona;
import Modelo.Modelo_Cliente;
import Modelo.Modelo_Persona;
import Vista.Vista_Cliente;
import Vista.Vista_Persona;
import Vista.Vista_Principal;
import java.awt.Image;
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class Controlador_Cliente {
    
    private Modelo_Cliente modeloCli;
    private Vista_Cliente vistaCli;
    private Modelo_Persona modelPer;
    private Vista_Persona viewper;
    private JFileChooser jfc;
    private String nombres = null;
    private int idperonaClassciente = 0;
    Controlador_Fecha conf = new Controlador_Fecha();
    
    //Constructor de la clase Controlador de cliente.
    public Controlador_Cliente(Modelo_Cliente modeloCli, Vista_Cliente vistaCli, Modelo_Persona modelPer, Vista_Persona viewper) {
        this.modeloCli = modeloCli;
        this.vistaCli = vistaCli;
        this.modelPer = modelPer;
        this.viewper = viewper;
        vistaCli.setVisible(true);
        IncremetoID_Cliente();
        CargarTablaCliente();
        ControlesSecundariosCliente();
        this.vistaCli.getLblFechaAcutualVC().setText(LocalDate.now() + "");
    }
    
    //Método de control de todos los botones iniciales de la vista.
    public void ControlBotonesCliente() {
        vistaCli.getBtnCrearCliente().addActionListener(l -> DialogoCrearEditarCliente(1));
        vistaCli.getBtnEditarCliente().addActionListener(l -> TipoDialogoAbrirCliente());
        vistaCli.getBtnActualizarCliente().addActionListener(l -> CargarTablaCliente());
        vistaCli.getBtnAceptarCli().addActionListener(l -> CrearEditarPersona_Cliente());
        viewper.getBtnAceptarPer().addActionListener(l -> EdicionPersonaControl());
        viewper.getBtnCancelarPer().addActionListener(l -> CacelarEdicionPersona());
        vistaCli.getBtnCancelarCli().addActionListener(l -> CancelarEdicionCliente());
        vistaCli.getBtnRemoverCliente().addActionListener(l -> EliminarClienteView());
        EventosComponentesVistaCliente();
    }
    
    //Método que permite bloquear los campos para que no se ingrese un valor 
    private void ControlesSecundariosCliente() {
        vistaCli.getTxt_ID_Cliente().setEnabled(false);
        vistaCli.getTxt_ID_Persona().setEnabled(false);
        ControlLblPrincipalesActivos();
    }
    
    //Método que controla los eventos de la vista cliente. 
    private void EventosComponentesVistaCliente() {
        KeyListener buscar = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                String busqueda = vistaCli.getTxtBuscarCliente().getText().toLowerCase();
                if (vistaCli.getTxtBuscarCliente().getText().trim().isEmpty()) {
                    CargarTablaCliente();
                } else {
                    BuscarCliente(busqueda);
                }
                
            }
        };
        KeyListener buscaP = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c < '0' || c > '9') {
                    e.consume();
                }
                if (Character.isLetter(c)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaCli, "Por favor, debe ingresar valores numéricos para la busqueda por cédula.", "Cédula.", JOptionPane.WARNING_MESSAGE);
                }
                if (vistaCli.getTxtBuscarCedulaCli().getText().length() == 10) {
                    e.consume();
                }
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                String busquedaI = vistaCli.getTxtBuscarCedulaCli().getText();
                BuscarPersonaCedula(busquedaI);
            }
        };
        
        KeyListener telefono = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c < '0' || c > '9') {
                    e.consume();
                }
                if (Character.isLetter(c)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaCli, "Por favor, debe ingresar valores numéricos.", "Teléfono.", JOptionPane.WARNING_MESSAGE);
                }
                if (vistaCli.getTxtTelefonoCliente().getText().length() == 10) {
                    e.consume();
                }
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
            }
        };
        vistaCli.getTxtBuscarCliente().addKeyListener(buscar);
        vistaCli.getTxtBuscarCedulaCli().addKeyListener(buscaP);
        vistaCli.getTxtTelefonoCliente().addKeyListener(telefono);
    }
 
    //Método que permite ocultar los componentes de la vista cuando El diálogo sea de creación, el cual se haga ocultos . 
    private void ControlOcultarComponetesDLG() {
        vistaCli.getLblNombresClienteBusqueda().setVisible(false);
        vistaCli.getSeparatorCliente().setVisible(false);
        vistaCli.getTxtBuscarCedulaCli().setVisible(false);
        vistaCli.getLblNameBuscar().setVisible(false);
        vistaCli.getSeparatorMedioVC().setVisible(false);
        vistaCli.getSeparatorResultVC().setVisible(false);
    }
    
    //Método que permite Visualizar  los componentes de la vista cuando el diálogo sea de Edicion.
    private void ControlHabilitarComponetesDLG() {
        vistaCli.getLblNombresClienteBusqueda().setVisible(true);
        vistaCli.getSeparatorCliente().setVisible(true);
        vistaCli.getTxtBuscarCedulaCli().setVisible(true);
        vistaCli.getLblNameBuscar().setVisible(true);
        vistaCli.getSeparatorMedioVC().setVisible(true);
        vistaCli.getSeparatorResultVC().setVisible(true);
    }
    
    //Método que permite buscar por cédula para que se carguen los datos de la persona. 
    private void BuscarPersonaCedula(String Cedula) {
        if (Cedula.equals("")) {
            nombres = "";
            idperonaClassciente = 0;
        } else {
            List<Persona> lisP = modelPer.BuscarPersonasCedula(Cedula);
            for (int i = 0; i < lisP.size(); i++) {
                if (lisP.get(i).getCedula().equals(Cedula)) {
                    int idper = lisP.get(i).getId_persona();
                    idperonaClassciente = idper;
                    String nombre = lisP.get(i).getNombre();
                    String apellidop = lisP.get(i).getApellido();
                    nombres = nombre + " " + apellidop;
                }
            }
        }
        if (idperonaClassciente == 0) {
            vistaCli.getTxt_ID_Persona().setText("");
        } else {
            vistaCli.getTxt_ID_Persona().setText(String.valueOf(idperonaClassciente));
        }
        vistaCli.getLblNombresClienteBusqueda().setText(nombres);
        
    }
    
    //Método que permite incrementar el idp para la vista cliente 
    private void IncremetoID_Cliente() {
        vistaCli.getTxt_ID_Cliente().setText(String.valueOf(modeloCli.IncrementoIdCliente()));
    }
    
    //Método que permite abrir el diálogo dependiendo de creación o edición en la vista cliente 
    private void DialogoCrearEditarCliente(int tipo) {
        String titulo = null;
        if (tipo == 1) {
            ControlHabilitarComponetesDLG();
            titulo = "Crear nuevo Cliente";
            IncremetoID_Cliente();
            vistaCli.getTxtBuscarCedulaCli().setText("");
            vistaCli.getLblNombresClienteBusqueda().setText("");
            vistaCli.getTxtTelefonoCliente().setText("");
            vistaCli.getTxt_ID_Persona().setText("");
            vistaCli.getDialogoCliente().setName("Crear");
            vistaCli.getDialogoCliente().setVisible(true);
            
            vistaCli.getDialogoCliente().setLocation(600, 80);
            vistaCli.getDialogoCliente().setSize(528, 389);
            vistaCli.getDialogoCliente().setTitle(titulo);
        } else {
            if (tipo == 2) {
                ControlOcultarComponetesDLG();
                System.out.println("Ingreso a dos");
                titulo = "Editar Cliente";
                vistaCli.getDialogoCliente().setName("Editar");
                vistaCli.getDialogoCliente().setVisible(true);
                
                vistaCli.getDialogoCliente().setLocation(600, 80);
                vistaCli.getDialogoCliente().setSize(528, 389);
                vistaCli.getDialogoCliente().setTitle(titulo);
                CargarEdicionCliente();
                
            }
        }
        
    }
    
    //Método que permite abrir el diálogo de la vista clientes para su edición. 
    private void TipoDialogoAbrirCliente() {
        
        int i = vistaCli.getTblCliente().getSelectedRow();
        
        if (i != -1) {
            int cod = Integer.parseInt(vistaCli.getTblCliente().getValueAt(i, 4).toString());
            System.out.println("Entro tipo de dialogo-->" + cod);
            String[] cade = {"Persona", "Cliente", "Cancelar"};
            int nu = JOptionPane.showOptionDialog(null, "Elija el tipo de edicion que decea realizar.", "Opción de edicion.", 0, JOptionPane.DEFAULT_OPTION, null, cade, "Cancelar");
            if (nu == 0) {
                System.out.println("Persona");
                viewper.getTxt_ID_Persona().setEditable(false);
                EdicionPersonaClienteCL(cod);
                String titulo = "Editar Persona";
                viewper.getDialogoPersona().setName("Editar");
                viewper.getDialogoPersona().setVisible(true);
                viewper.getDialogoPersona().setLocation(600, 80);
                viewper.getDialogoPersona().setSize(700, 469);
                viewper.getDialogoPersona().setTitle(titulo);
            }
            if (nu == 1) {
                System.out.println("Cliente");
//                CargarEdicionCliente();
                DialogoCrearEditarCliente(2);
                viewper.getDialogoPersona().setLocation(600, 80);
                viewper.getDialogoPersona().setSize(490, 543);
//                viewper.getDialogoPersona().setTitle(titulo);
            }
        } else {
            JOptionPane.showMessageDialog(vistaCli, "Error, debe seleccionar una fila para la edición.", "Modificar de persona.", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método que permite modificar los elementos del diálogo de persona cuando esta en la vista de clientes. 
    private void EdicionPersonaClienteCL(int codigo) {
        System.out.println("Codigoooooooo------------>" + codigo);
        List<Persona> listaBusper = modelPer.listarPersonas();
        for (int i = 0; i < listaBusper.size(); i++) {
            System.out.println("Ingreso al for de edicion persona");
            if (listaBusper.get(i).getId_persona() == codigo) {
                System.out.println("Ingreso al if de la edicon de persona-->"+codigo);
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
    
    //Método que permite editar los elementos de la persona estando en la vista de clientes. 
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
                JOptionPane.showMessageDialog(vistaCli, "La Persona a sido modificado satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(vistaCli, "Error, no se pudo modificar la Persona.", "Error", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(vistaCli, "La Persona a sido modificado satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(vistaCli, "Error, no se pudo modificar la Persona.");
            }
        }
        jfc = null;
    }
    
    //Método que cargará el diferente dialogo a partir de la selección de crear o editar 
    private void CrearEditarPersona_Cliente() {
        if (vistaCli.getDialogoCliente().getName().equals("Crear")) {
            if (vistaCli.getTxt_ID_Persona().getText().isEmpty()) {
                JOptionPane.showMessageDialog(viewper, "Por favor ingrese el id de persona para su registro.", "Vacio ID", JOptionPane.WARNING_MESSAGE);
            } else {
                CrearCliente();
            }
        } else {
            if (vistaCli.getDialogoCliente().getName().equals("Editar")) {
                EditarCliente();
            }
            
        }
    }
    
    //Método que permite la creación del cliente 
    private void CrearCliente() {
        Modelo_Cliente modelCli = new Modelo_Cliente();
        modelCli.setId_clienteC(Integer.parseInt(vistaCli.getTxt_ID_Cliente().getText()));
        modelCli.setTelefono(vistaCli.getTxtTelefonoCliente().getText());
        modelCli.setId_personaCI(Integer.parseInt(vistaCli.getTxt_ID_Persona().getText()));
        if (ValidaClienteRepetido(Integer.parseInt(vistaCli.getTxt_ID_Persona().getText())) == true) {
            JOptionPane.showMessageDialog(vistaCli, "Cliente Repetido, este id ya existe.", "Cliente Repetido.", JOptionPane.ERROR_MESSAGE);
        } else {
            if (modelCli.CrearClienteBDA()) {
                CargarTablaCliente();
                LimpiarDatosClienteCrear();
                JOptionPane.showMessageDialog(vistaCli, "Cliente Creado Satisfactoriamente.");
                vistaCli.getDialogoCliente().dispose();
            } else {
                JOptionPane.showMessageDialog(vistaCli, "Error no se puedo crear el Cliente.");
            }
        }
    }
    
    //Limpiar los campos de la vista del diálogo cliente. 
    private void LimpiarDatosClienteCrear() {
        vistaCli.getTxtTelefonoCliente().setText("");
        vistaCli.getTxt_ID_Persona().setText("");
    }
    
    //Método que permite la edición de los comapos del cliente. 
    private void EditarCliente() {
        Modelo_Cliente modelCliED = new Modelo_Cliente();
        modelCliED.setId_clienteC(Integer.parseInt(vistaCli.getTxt_ID_Cliente().getText()));
        modelCliED.setTelefono(vistaCli.getTxtTelefonoCliente().getText());
        modelCliED.setId_personaCI(Integer.parseInt(vistaCli.getTxt_ID_Persona().getText()));
        if (modelCliED.ModificarClienteBDA()) {
            CargarTablaCliente();
            JOptionPane.showMessageDialog(vistaCli, "Cliente Modificado Satisfactoriamente.");
            vistaCli.getDialogoCliente().dispose();
        } else {
            JOptionPane.showMessageDialog(vistaCli, "Error no se puedo Modificar el Cliente.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método que permite cargar los elementos en el diálogo cliente 
    private void CargarEdicionCliente() {
        int i = vistaCli.getTblCliente().getSelectedRow();
        if (i != -1) {
            vistaCli.getTxt_ID_Cliente().setText(vistaCli.getTblCliente().getValueAt(i, 0).toString());
            vistaCli.getTxtTelefonoCliente().setText(vistaCli.getTblCliente().getValueAt(i, 3).toString());
            vistaCli.getTxt_ID_Persona().setText(vistaCli.getTblCliente().getValueAt(i, 4).toString());
            
        }
    }
    
    //Método que permite cargar los datos en la tabla de la vista cliente. 
    private void CargarTablaCliente() {
        DefaultTableModel tb = (DefaultTableModel) vistaCli.getTblCliente().getModel();
        tb.setNumRows(0);
        List<Cliente> listaCliente = modeloCli.listarClientesBDA();
        listaCliente.stream().forEach(c -> {
            String[] cliente = {String.valueOf(c.getId_clienteC()), c.getApellido(), c.getNombre(), c.getTelefono(), String.valueOf(c.getId_personaCI())};
            tb.addRow(cliente);
        });
    }
    
    //Método que permite buscar un cliente. 
    private void BuscarCliente(String codigo) {
        DefaultTableModel tb = (DefaultTableModel) vistaCli.getTblCliente().getModel();
        tb.setNumRows(0);
        List<Cliente> listaCliente = modeloCli.BuscarCliente(codigo);
        listaCliente.stream().forEach(c -> {
            String[] cliente = {String.valueOf(c.getId_clienteC()), c.getApellido(), c.getNombre(), c.getTelefono(), String.valueOf(c.getId_personaCI())};
            tb.addRow(cliente);
        });
    }
    
    //Método que permite validar el idp de un cliente repetido. 
    private boolean ValidaClienteRepetido(int idrepetidoC) {
        boolean idreprtido = false;
        List<Cliente> listaC = modeloCli.listarClientesBDA();
        for (int i = 0; i < listaC.size(); i++) {
            if (listaC.get(i).getId_personaCI() == idrepetidoC) {
                idreprtido = true;
            }
        }
        return idreprtido;
    }

    //Método que controla la edición de la persona estando en la vista cliente. 
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
                        if (fec.isEmpty() || conf.FechaNacimiento(viewper.getFechaNacimientoPer()) == false) {
                            viewper.getLbLFechaRojo().setVisible(true);
                            
                        } else {
                            viewper.getLbLFechaRojo().setVisible(false);
                            if (conf.FechaNacimientoMayor(fec) == false) {
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
        
    }
    
    //Metodo que escoge un género 
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
    
    private void ControlLblPrincipalesActivos() {
        viewper.getLblCedulaRojo().setVisible(false);
        viewper.getLblNombreRojo().setVisible(false);
        viewper.getLblApellido().setVisible(false);
        viewper.getLbLFechaRojo().setVisible(false);
        viewper.getLblGeneroRojo().setVisible(false);
    }
    
    //Método que permite al botón aceptar la cancelación. 
    private void CancelarEdicionCliente() {
        vistaCli.getDialogoCliente().dispose();
    }
    
    //Método que permite la validación de una cédula verdadera. 
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
    
    private void CacelarEdicionPersona() {
        viewper.getDialogoPersona().dispose();
    }
    
    //Método que permite la eliminación de un cliente de manera lógica. 
    private void EliminarClienteView() {
        int i = vistaCli.getTblCliente().getSelectedRow();
        if (i != -1) {
            String idpersona = vistaCli.getTblCliente().getValueAt(i, 0).toString();
            int aux = Integer.parseInt(idpersona);
            String idc = vistaCli.getTblCliente().getValueAt(i, 0).toString();
            int result = JOptionPane.showConfirmDialog(vistaCli, "Esta seguro que desea eliminar al cliente con cédula " + idc + "?", "Confirmación .", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (modeloCli.EliminarCliente(aux)) {
                    JOptionPane.showMessageDialog(vistaCli, "El Cliente a sido eliminado correctamente de la base de datos.");
                    CargarTablaCliente();
                } else {
                    JOptionPane.showMessageDialog(vistaCli, "Se ha producido un error al rato de eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vistaCli, "Registro cancelado para su eliminación.");
            }
        } else {
            JOptionPane.showMessageDialog(vistaCli, "Error, usted debe seleccionar un registro de la tabla para proceder a su eliminación.", "Eliminar.", JOptionPane.ERROR_MESSAGE);
        }
    }
}
