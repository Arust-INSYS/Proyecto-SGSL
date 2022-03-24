/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Persona;
import Modelo.CLASES.Servicios;
import Modelo.Modelo_Cliente;
import Modelo.Modelo_Empleado;
import Modelo.Modelo_Persona;
import Modelo.Modelo_Servicio;
import Vista.Vista_Persona;
import Vista.Vista_Servicio;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author lorena
 */
public class Controlador_Persona {

    private Modelo_Persona modelPer;
    private Vista_Persona vistaPer;
    private JFileChooser jfc;

    Controlador_Fecha conf = new Controlador_Fecha();

    public Controlador_Persona(Modelo_Persona modelPer, Vista_Persona vistaPer) {
        this.modelPer = modelPer;
        this.vistaPer = vistaPer;
        vistaPer.setVisible(true);
        CargarTablaPersona();
        IncremetoID();
        EventosComponentesVistaPersona();
        ControlesInformacionPrincipal();
        this.vistaPer.getLblFechaAcutualVP().setText(LocalDate.now() + "");
    }

    public Controlador_Persona() {
    }

    private void ControlesInformacionPrincipal() {
        ControlLblPrincipalesActivos();
    }

    private void IncremetoID() {
        vistaPer.getTxt_ID_Persona().setText(String.valueOf(modelPer.IncrementoIdPersona()));
    }

    public void ControlBotonesPrincipales() {
        vistaPer.getBtnCrearPersona().addActionListener(l -> DialogoCrearEditarPersona(1));
        vistaPer.getBtnEditarPersona().addActionListener(l -> DialogoCrearEditarPersona(2));
        vistaPer.getBtnActualizarPersona().addActionListener(l -> CargarTablaPersona());
        vistaPer.getBtnAceptarPer().addActionListener(l -> crearEditarPersona());
        vistaPer.getBtnSeleccionarFoto().addActionListener(l -> ExaminarFoto());
        vistaPer.getBtnRemoverPersona().addActionListener(l -> EliminarPersona());
        vistaPer.getBtnCancelarPer().addActionListener(l -> CancelarViewPersona());
    }

    private void EventosComponentesVistaPersona() {
        KeyListener buscar = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                String busqueda = vistaPer.getTxtBuscarPersona().getText().toLowerCase();
                BuscarPersonaLista(busqueda);
            }
        };

        KeyListener validaCedula = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (c < '0' || c > '9') {
                    e.consume();
                }
                if (Character.isLetter(c)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaPer, "Por favor, debe ingresar solo números en este campo.");
                }
                if (vistaPer.getTxtCedulaPersona().getText().length() == 10) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaPer, "Ya están los 10 dígitos de la cedula.");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //crearEditarPersona();
                if (vistaPer.getTxtCedulaPersona().getText().length() == 10) {
                    vistaPer.getLblCedulaRojo().setVisible(false);
                } else {
                    vistaPer.getLblCedulaRojo().setVisible(true);
                }
            }
        };
        KeyListener nombre = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char vn = e.getKeyChar();
                if (Character.isDigit(vn)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaPer, "No debe ingresar números en este campo.");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // crearEditarPersona();
                if (vistaPer.getTxtNombrePersona().getText().length() >= 3) {
                    vistaPer.getLblNombreRojo().setVisible(false);
                } else {
                    vistaPer.getLblNombreRojo().setVisible(true);
                }
            }
        };

        KeyListener apellido = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char vn = e.getKeyChar();
                if (Character.isDigit(vn)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaPer, "No debe ingresar números en este campo.");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (vistaPer.getTxtApellidoPersona().getText().length() >= 3) {
                    vistaPer.getLblApellido().setVisible(false);
                } else {
                    vistaPer.getLblApellido().setVisible(true);
                }
            }
        };

        KeyListener fnaci = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char vn = e.getKeyChar();
                if (Character.isDigit(vn)) {
                    e.consume();
                    JOptionPane.showMessageDialog(vistaPer, "No debe ingresar números en este campo.");
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                Date n = (Date) vistaPer.getFechaNacimientoPer().getDate();
                if (n == null) {
                    vistaPer.getLbLFechaRojo().setVisible(true);
                } else {
                    vistaPer.getLbLFechaRojo().setVisible(false);
                }
            }
        };

        //Eventos del Focus Listener.
        FocusListener cedp = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (vistaPer.getTxtCedulaPersona().getText().length() == 10) {
                    vistaPer.getLblCedulaRojo().setVisible(false);
                } else {
                    vistaPer.getLblCedulaRojo().setVisible(true);
                }
            }
        };
        FocusListener nomPerson = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (vistaPer.getTxtNombrePersona().getText().length() >= 3) {
                    vistaPer.getLblNombreRojo().setVisible(false);
                } else {
                    vistaPer.getLblNombreRojo().setVisible(true);
                }
            }
        };
        FocusListener aPerson = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (vistaPer.getTxtApellidoPersona().getText().length() >= 3) {
                    vistaPer.getLblApellido().setVisible(false);
                } else {
                    vistaPer.getLblApellido().setVisible(true);
                }
            }
        };

        vistaPer.getTxtBuscarPersona().addKeyListener(buscar);

        vistaPer.getTxtCedulaPersona().addKeyListener(validaCedula);
        vistaPer.getTxtCedulaPersona().addFocusListener(cedp);

        vistaPer.getTxtNombrePersona().addKeyListener(nombre);
        vistaPer.getTxtNombrePersona().addFocusListener(nomPerson);

        vistaPer.getTxtApellidoPersona().addKeyListener(apellido);
        vistaPer.getTxtApellidoPersona().addFocusListener(aPerson);

        vistaPer.getFechaNacimientoPer().addKeyListener(fnaci);
    }

    private void ControlLblPrincipalesActivos() {
        vistaPer.getLblCedulaRojo().setVisible(false);
        vistaPer.getLblNombreRojo().setVisible(false);
        vistaPer.getLblApellido().setVisible(false);
        vistaPer.getLbLFechaRojo().setVisible(false);
        vistaPer.getLblGeneroRojo().setVisible(false);
    }

    private void ExaminarFoto() {
        jfc = new JFileChooser();
        FileNameExtensionFilter tipo = new FileNameExtensionFilter("JPG, JPEG", "jpg", "jpeg");
        jfc.setFileFilter(tipo);
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vistaPer);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vistaPer.getLblFotoPersona().getWidth(),
                        vistaPer.getLblFotoPersona().getHeight(),
                        Image.SCALE_DEFAULT);

                Icon icono = new ImageIcon(imagen);
                vistaPer.getLblFotoPersona().setIcon(icono);
                vistaPer.getLblFotoPersona().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(Controlador_Persona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void DialogoCrearEditarPersona(int tipo) {
        String titulo = null;
        if (tipo == 1) {
            BloqueoTexField();
            Limpiar_DatosPersona();
            ControlLblPrincipalesActivos();
            titulo = "Crear nueva Persona";
            vistaPer.getDialogoPersona().setName("Crear");
            vistaPer.getDialogoPersona().setVisible(true);
        } else {
            if (tipo == 2) {

                int i = vistaPer.getTblPersonas().getSelectedRow();
                if (i != -1) {
                    BloqueoTexField();
                    ControlLblPrincipalesActivos();
                    vistaPer.getTxtCedulaPersona().setBackground(Color.white);
                    titulo = "Editar Persona";
                    vistaPer.getDialogoPersona().setName("Editar");
                    vistaPer.getDialogoPersona().setVisible(true);
                    CargarEdicionPersona();
                } else {
                    JOptionPane.showMessageDialog(vistaPer, "Error, debe seleccionar una fila para la edición.", "Modificar de persona.", JOptionPane.WARNING_MESSAGE);
                }

            }
        }
        vistaPer.getDialogoPersona().setLocation(600, 80);
        vistaPer.getDialogoPersona().setSize(490, 543);
        vistaPer.getDialogoPersona().setTitle(titulo);
    }

    private void BloqueoTexField() {
        vistaPer.getTxt_ID_Persona().setEnabled(false);
    }

    private void crearEditarPersona() {
        boolean verifico = false;
        String fecha = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        if (vistaPer.getDialogoPersona().getName().equals("Crear")) {
            if (vistaPer.getTxtCedulaPersona().getText().isEmpty()) {
                vistaPer.getLblCedulaRojo().setVisible(true);
            } else {
                vistaPer.getLblCedulaRojo().setVisible(false);
                if (validaCedulaNumeros()) {
                    vistaPer.getLblCedulaRojo().setVisible(true);
                } else {
                    vistaPer.getLblCedulaRojo().setVisible(false);
                    if (vistaPer.getTxtNombrePersona().getText().isEmpty()) {
                        vistaPer.getLblNombreRojo().setVisible(true);

                    } else {
                        vistaPer.getLblNombreRojo().setVisible(false);

                        if (vistaPer.getTxtApellidoPersona().getText().isEmpty()) {

                            vistaPer.getLblApellido().setVisible(true);
                        } else {
                            vistaPer.getLblApellido().setVisible(false);
                            if (fecha.isEmpty() || conf.FechaNacimiento(vistaPer.getFechaNacimientoPer()) == false) {
                                vistaPer.getLbLFechaRojo().setVisible(true);
                            } else {
                                vistaPer.getLbLFechaRojo().setVisible(false);
                                if (conf.FechaNacimientoMayor(fecha) == false) {
                                    vistaPer.getLbLFechaRojo().setVisible(true);
                                } else {
                                    vistaPer.getLbLFechaRojo().setVisible(false);
                                    if (vistaPer.getGrupoBotonGenero().isSelected(null)) {
                                        vistaPer.getLblGeneroRojo().setVisible(true);

                                    } else {
                                        vistaPer.getLblGeneroRojo().setVisible(false);
                                        if (validadorDeCedula(vistaPer.getTxtCedulaPersona().getText()) == false) {
                                            JOptionPane.showMessageDialog(vistaPer, "Por favor digite una cedula ecuatoriana valida .", "Cédula Ecuatoriana.", JOptionPane.ERROR_MESSAGE);
                                            vistaPer.getLblCedulaRojo().setVisible(true);
                                        } else {
                                            vistaPer.getLblCedulaRojo().setVisible(false);
                                            if (ValidarUsuarioRepetido(vistaPer.getTxtCedulaPersona().getText()) == true) {
                                                JOptionPane.showMessageDialog(vistaPer, "Error la cédula ya existe en la base de datos.", "Cédula Duplicada.", JOptionPane.ERROR_MESSAGE);
                                                vistaPer.getTxtCedulaPersona().setBackground(Color.red);
                                            } else {
                                                vistaPer.getTxtCedulaPersona().setBackground(Color.white);
                                                CrearPersona();
                                                verifico = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (verifico == false) {
                JOptionPane.showMessageDialog(vistaPer, "Verifique el/los campos marcados con rojo.", "Validar creacion", JOptionPane.WARNING_MESSAGE);
            }

        } else {
            boolean verificoED = true;
            String fec = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
            if (vistaPer.getDialogoPersona().getName().equals("Editar")) {
                if (vistaPer.getTxtCedulaPersona().getText().isEmpty()) {
                    vistaPer.getLblCedulaRojo().setVisible(true);
                } else {
                    vistaPer.getLblCedulaRojo().setVisible(false);
                    if (validaCedulaNumeros()) {
                        vistaPer.getLblCedulaRojo().setVisible(true);
                    } else {
                        vistaPer.getLblCedulaRojo().setVisible(false);
                        if (vistaPer.getTxtNombrePersona().getText().isEmpty()) {
                            vistaPer.getLblNombreRojo().setVisible(true);

                        } else {
                            vistaPer.getLblNombreRojo().setVisible(false);

                            if (vistaPer.getTxtApellidoPersona().getText().isEmpty()) {

                                vistaPer.getLblApellido().setVisible(true);
                            } else {
                                vistaPer.getLblApellido().setVisible(false);
                                if (fecha.isEmpty() || conf.FechaNacimiento(vistaPer.getFechaNacimientoPer()) == false) {
                                    vistaPer.getLbLFechaRojo().setVisible(true);

                                } else {
                                    vistaPer.getLbLFechaRojo().setVisible(false);
                                    if (conf.FechaNacimientoMayor(fecha) == false) {
                                        vistaPer.getLbLFechaRojo().setVisible(true);
                                    } else {
                                         vistaPer.getLbLFechaRojo().setVisible(false);
                                        if (vistaPer.getGrupoBotonGenero().isSelected(null)) {
                                            vistaPer.getLblGeneroRojo().setVisible(true);

                                        } else {
                                            vistaPer.getLblGeneroRojo().setVisible(false);
                                            if (validadorDeCedula(vistaPer.getTxtCedulaPersona().getText()) == false) {
                                                JOptionPane.showMessageDialog(vistaPer, "Por favor digite una cedula ecuatoriana valida .", "Cédula Ecuatoriana.", JOptionPane.ERROR_MESSAGE);
                                                vistaPer.getLblCedulaRojo().setVisible(true);
                                            } else {
                                                vistaPer.getLblCedulaRojo().setVisible(false);
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
            System.out.println("Ingreso antes del if de la verificasion de la modificasion de la persona.");
            if (verificoED == false) {
                JOptionPane.showMessageDialog(vistaPer, "Verifique el/los campos marcados con rojo para su edición.", "Validar edición", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public boolean validaCedulaNumeros() {
        boolean validac = true;
        if (!(vistaPer.getTxtCedulaPersona().getText().matches("^\\d{10}$"))) {
            //JOptionPane.showMessageDialog(null, "Ingresa la cedula.");
            validac = true;
        } else {
            validac = false;
        }
        return validac;
    }

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

    private void CrearPersona() {
        Modelo_Persona modelPer = new Modelo_Persona();
        modelPer.setId_persona(Integer.parseInt(vistaPer.getTxt_ID_Persona().getText()));
        modelPer.setCedula(vistaPer.getTxtCedulaPersona().getText());
        modelPer.setNombre(vistaPer.getTxtNombrePersona().getText());
        modelPer.setApellido(vistaPer.getTxtApellidoPersona().getText());
        String fechaNacimiento = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        Date fechaN = java.sql.Date.valueOf(fechaNacimiento);
        modelPer.setFecha_nacimiento((java.sql.Date) fechaN);
        modelPer.setGenero(GeneroPersona());
        String dire = vistaPer.getTxtDireccionPersona().getText();
        if (dire.equals("")) {
            modelPer.setDireccion(null);
        } else {
            modelPer.setDireccion(dire);
        }
        if (jfc == null) {
            if (modelPer.CrearPersonaFT()) {
                CargarTablaPersona();
                Limpiar_DatosPersona();
                IncremetoID();
                JOptionPane.showMessageDialog(vistaPer, "Persona Creada Satisfactoriamente");
                vistaPer.getDialogoPersona().dispose();
            } else {
                JOptionPane.showMessageDialog(vistaPer, "Error no se puedo crear la Persona.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            if (jfc != null) {
                try {
                    FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                    int largo = (int) jfc.getSelectedFile().length();
                    modelPer.setImagen(img);
                    modelPer.setLargo(largo);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Controlador_Persona.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (modelPer.CrearPersonaBDA()) {
                CargarTablaPersona();
                IncremetoID();
                Limpiar_DatosPersona();
                JOptionPane.showMessageDialog(vistaPer, "Persona Creada Satisfactoriamente.");
                vistaPer.getDialogoPersona().dispose();
            } else {
                JOptionPane.showMessageDialog(vistaPer, "Error no se puedo crear la Persona.");
            }
        }
    }

    public void EditarPersona() {
        Modelo_Persona modelPerE = new Modelo_Persona();
        modelPerE.setId_persona(Integer.parseInt(vistaPer.getTxt_ID_Persona().getText()));
        modelPerE.setCedula(vistaPer.getTxtCedulaPersona().getText());
        modelPerE.setNombre(vistaPer.getTxtNombrePersona().getText());
        modelPerE.setApellido(vistaPer.getTxtApellidoPersona().getText());
        String fechaNacimiento = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        Date fechaN = java.sql.Date.valueOf(fechaNacimiento);
        modelPerE.setFecha_nacimiento((java.sql.Date) fechaN);
        modelPerE.setGenero(GeneroPersona());
        modelPerE.setDireccion(vistaPer.getTxtDireccionPersona().getText());
        if (jfc == null) {
            if (modelPerE.ModificarPersonaFT()) {
                CargarTablaPersona();
                JOptionPane.showMessageDialog(vistaPer, "La Persona a sido modificado satisfactoriamente.");
                vistaPer.getDialogoPersona().dispose();
            } else {
                JOptionPane.showMessageDialog(vistaPer, "Error, no se pudo modificar la Persona.", "Error", JOptionPane.ERROR_MESSAGE);
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
                CargarTablaPersona();
                JOptionPane.showMessageDialog(vistaPer, "La Persona a sido modificado satisfactoriamente.");
                vistaPer.getDialogoPersona().dispose();
            } else {
                JOptionPane.showMessageDialog(vistaPer, "Error, no se pudo modificar la Persona.");
            }
        }

    }

    private void CargarTablaPersona() {
        vistaPer.getTblPersonas().setDefaultRenderer(Object.class, new Imangentabla());
        vistaPer.getTblPersonas().setRowHeight(100);
        DefaultTableModel tb = (DefaultTableModel) vistaPer.getTblPersonas().getModel();
        tb.setNumRows(0);
        List<Persona> listaPersonas = modelPer.listarPersonas();
        Holder<Integer> i = new Holder<>(0);
        listaPersonas.stream().forEach(p -> {

            tb.addRow(new Object[8]);
            vistaPer.getTblPersonas().setValueAt(p.getId_persona(), i.value, 0);
            vistaPer.getTblPersonas().setValueAt(p.getCedula(), i.value, 1);
            vistaPer.getTblPersonas().setValueAt(p.getNombre(), i.value, 2);
            vistaPer.getTblPersonas().setValueAt(p.getApellido(), i.value, 3);
            vistaPer.getTblPersonas().setValueAt(p.getFecha_nacimiento(), i.value, 4);
            vistaPer.getTblPersonas().setValueAt(p.getGenero(), i.value, 5);
            vistaPer.getTblPersonas().setValueAt(p.getDireccion(), i.value, 6);
            Image foto = p.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vistaPer.getTblPersonas().setValueAt(new JLabel(icono), i.value, 7);
            } else {
                vistaPer.getTblPersonas().setValueAt(null, i.value, 7);
            }
            i.value++;
        });
    }

    private void BuscarPersonaLista(String busqueda) {
        vistaPer.getTblPersonas().setDefaultRenderer(Object.class, new Imangentabla());
        vistaPer.getTblPersonas().setRowHeight(100);
        DefaultTableModel tb = (DefaultTableModel) vistaPer.getTblPersonas().getModel();
        tb.setNumRows(0);
        List<Persona> listaBusqueda = modelPer.BuscarPersonas(busqueda);
        Holder<Integer> i = new Holder<>(0);
        listaBusqueda.stream().forEach(p -> {

            tb.addRow(new Object[8]);
            vistaPer.getTblPersonas().setValueAt(p.getId_persona(), i.value, 0);
            vistaPer.getTblPersonas().setValueAt(p.getCedula(), i.value, 1);
            vistaPer.getTblPersonas().setValueAt(p.getNombre(), i.value, 2);
            vistaPer.getTblPersonas().setValueAt(p.getApellido(), i.value, 3);
            vistaPer.getTblPersonas().setValueAt(p.getFecha_nacimiento(), i.value, 4);
            vistaPer.getTblPersonas().setValueAt(p.getGenero(), i.value, 5);
            vistaPer.getTblPersonas().setValueAt(p.getDireccion(), i.value, 6);
            Image foto = p.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(nimg);
                DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
                renderer.setIcon(icono);
                vistaPer.getTblPersonas().setValueAt(new JLabel(icono), i.value, 7);
            } else {
                vistaPer.getTblPersonas().setValueAt(null, i.value, 7);
            }
            i.value++;
        });
    }

    public String GeneroPersona() {
        String GeneroPerso = "";
        vistaPer.getGrupoBotonGenero().add(vistaPer.getRadioBtnMasculino());
        vistaPer.getGrupoBotonGenero().add(vistaPer.getRadioBtnFemenino());
        if (vistaPer.getRadioBtnMasculino().isSelected()) {
            GeneroPerso = "M";
        }
        if (vistaPer.getRadioBtnFemenino().isSelected()) {
            GeneroPerso = "F";
        }
        return GeneroPerso;
    }

    private void Limpiar_DatosPersona() {
        vistaPer.getTxtCedulaPersona().setText("");
        vistaPer.getTxtNombrePersona().setText("");
        vistaPer.getTxtApellidoPersona().setText("");
        vistaPer.getFechaNacimientoPer().setDate(null);
        vistaPer.getGrupoBotonGenero().clearSelection();
        vistaPer.getTxtDireccionPersona().setText("");
        vistaPer.getLblFotoPersona().setIcon(null);
    }

    private boolean ValidarUsuarioRepetido(String cedula) {
        boolean cedulaRepetida = false;
        List<Persona> ValidoListaP = modelPer.listarPersonasAC();
        for (int i = 0; i < ValidoListaP.size(); i++) {
            if (ValidoListaP.get(i).getCedula().equals(cedula)) {
                cedulaRepetida = true;
            }
        }
        return cedulaRepetida;
    }

    public void CargarEdicionPersona() {

        int j = vistaPer.getTblPersonas().getSelectedRow();
        if (j != -1) {
            String ve = vistaPer.getTblPersonas().getValueAt(j, 1).toString();
            System.out.println("Cedula que me sale" + ve);
            List<Persona> listaPerFT = modelPer.listarPersonas();
            for (int i = 0; i < listaPerFT.size(); i++) {
                System.out.println("Ingreso al for");
                if (listaPerFT.get(i).getCedula().equals(ve)) {
                    System.out.println("Ingreso al if");
                    vistaPer.getTxt_ID_Persona().setText(String.valueOf(listaPerFT.get(i).getId_persona()));
                    System.out.println("" + listaPerFT.get(i).getId_persona());
                    vistaPer.getTxtCedulaPersona().setText(listaPerFT.get(i).getCedula());
                    vistaPer.getTxtNombrePersona().setText(listaPerFT.get(i).getNombre());
                    vistaPer.getTxtApellidoPersona().setText(listaPerFT.get(i).getApellido());
                    Date fechan = (Date) listaPerFT.get(i).getFecha_nacimiento();
                    vistaPer.getFechaNacimientoPer().setDate(fechan);
                    if (listaPerFT.get(i).getGenero().equals("M")) {
                        vistaPer.getRadioBtnMasculino().setSelected(true);
                    }
                    if (listaPerFT.get(i).getGenero().equals("F")) {
                        vistaPer.getRadioBtnFemenino().setSelected(true);
                    }
                    vistaPer.getTxtDireccionPersona().setText(listaPerFT.get(i).getDireccion());
                    if (listaPerFT.get(i).getFoto() == null) {
                        vistaPer.getLblFotoPersona().setIcon(null);
                    } else {
                        Image in = listaPerFT.get(i).getFoto();
                        Image img = in.getScaledInstance(133, 147, Image.SCALE_SMOOTH);
                        Icon icono = new ImageIcon(img);
                        vistaPer.getLblFotoPersona().setIcon(icono);
                    }
                }
            }

        } else {
            JOptionPane.showMessageDialog(vistaPer, "Error nu.");
            System.out.println("error");
        }
    }

    private void EliminarPersona() {
        int i = vistaPer.getTblPersonas().getSelectedRow();
        if (i != -1) {
            String idpersona = vistaPer.getTblPersonas().getValueAt(i, 0).toString();
            int aux = Integer.parseInt(idpersona);
            String cedula = vistaPer.getTblPersonas().getValueAt(i, 1).toString();
            int result = JOptionPane.showConfirmDialog(vistaPer, "Esta seguro que desea eliminar a la persona con cédula " + cedula + "?", "Confirmación .", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (modelPer.EliminarPersona(aux)) {
                    Modelo_Cliente mc = new Modelo_Cliente();
                    Modelo_Empleado me = new Modelo_Empleado();
                    if (mc.EliminarPersonaCli(aux)) {
                        System.out.println("Eliminacion correcta, cliente.");
                    }

                    if (me.RemoverEmpleado(aux)) {
                        System.out.println("Eliminacion correcta, empleado.");
                    }
                    JOptionPane.showMessageDialog(vistaPer, "El registro a sido eliminado correctamente de la base de datos.");
                    CargarTablaPersona();

                } else {
                    JOptionPane.showMessageDialog(vistaPer, "Se ha producido un error al rato de eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vistaPer, "Registro cancelado para su eliminación.");
            }
        } else {
            JOptionPane.showMessageDialog(vistaPer, "Debe seleccionar un registro de la tabla para proceder a su eliminación.", "Eliminar.", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void CancelarViewPersona() {
        if (vistaPer.getDialogoPersona().getName().equals("Crear")) {
            int confirmar = JOptionPane.showConfirmDialog(vistaPer, "¿Está seguro que desea cancelar la creación de la persona?", "Cancelar.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) {
                vistaPer.getDialogoPersona().dispose();
            }
        } else {
            int confirmar = JOptionPane.showConfirmDialog(vistaPer, "¿Está seguro que desea cancelar la edición de la persona?", "Cancelar.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) {
                vistaPer.getDialogoPersona().dispose();
            }
        }

    }
}
