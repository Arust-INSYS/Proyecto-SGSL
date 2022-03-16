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
import java.sql.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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

    public Controlador_Cliente(Modelo_Cliente modeloCli, Vista_Cliente vistaCli, Modelo_Persona modelPer, Vista_Persona viewper) {
        this.modeloCli = modeloCli;
        this.vistaCli = vistaCli;
        this.modelPer = modelPer;
        this.viewper = viewper;
        vistaCli.setVisible(true);
        IncremetoID_Cliente();
        CargarTablaCliente();
    }

    public void ControlBotonesCliente() {
        vistaCli.getBtnCrearCliente().addActionListener(l -> DialogoCrearEditarCliente(1));
        vistaCli.getBtnEditarCliente().addActionListener(l -> TipoDialogoAbrirCliente());
        vistaCli.getBtnActualizarCliente().addActionListener(l -> CargarTablaCliente());
        vistaCli.getBtnAceptarCli().addActionListener(l -> crearEditarPersona());
        System.out.println("SI ESTOY ANTES DEL OYENTE");
        vistaCli.getBtnBuscarPersona().addActionListener(l -> d());
        System.out.println("Pase el oyente");
        EventosComponentesVistaCliente();
    }

    private void d() {
        System.out.println("Si entre");
        JOptionPane.showMessageDialog(vistaCli, "Si valgo");
        System.out.println("Pase");
    }

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
                BuscarCliente(busqueda);
            }
        };
        vistaCli.getTxtBuscarCliente().addKeyListener(buscar);
    }

    private void IncremetoID_Cliente() {
        vistaCli.getTxt_ID_Cliente().setText(String.valueOf(modeloCli.IncrementoIdCliente()));
    }

    private void DialogoCrearEditarCliente(int tipo) {
        String titulo = null;
        if (tipo == 1) {
            titulo = "Crear nuevo Cliente";
            vistaCli.getDialogoCliente().setName("Crear");
            vistaCli.getDialogoCliente().setVisible(true);
        } else {
            if (tipo == 2) {
                System.out.println("Ingreso a dos");
//                int i = vistaCli.getTblCliente().getSelectedRow();
//                if (i != -1) {
                    titulo = "Editar Cliente";

                    vistaCli.getDialogoCliente().setName("Editar");
                    vistaCli.getDialogoCliente().setVisible(true);
                    CargarEdicionCliente();
//                } else {
//                    JOptionPane.showMessageDialog(vistaCli, "Error, debe seleccionar una fila para la edición.", "Modificar de persona.", JOptionPane.ERROR_MESSAGE);
//                }
            }
        }
        vistaCli.getDialogoCliente().setLocation(600, 80);
        vistaCli.getDialogoCliente().setSize(431, 414);
        vistaCli.getDialogoCliente().setTitle(titulo);
    }

    private void TipoDialogoAbrirCliente() {

        int i = vistaCli.getTblCliente().getSelectedRow();

        if (i != -1) {
            int cod = Integer.parseInt(vistaCli.getTblCliente().getValueAt(i, 0).toString());
            System.out.println("Entro tipo de dialogo");
            String[] cade = {"Persona", "Cliente", "Cancelar"};
            int nu = JOptionPane.showOptionDialog(null, "Elija el tipo de edicion que decea realizar.", "Opción de edicion.", 0, JOptionPane.DEFAULT_OPTION, null, cade, "Cancelar");
            if (nu == 0) {
                System.out.println("Persona");
                EdicionPersonaClienteCL(cod);
                String titulo = "Editar Persona";
                viewper.getDialogoPersona().setName("Editar");
                viewper.getDialogoPersona().setVisible(true);
                viewper.getDialogoPersona().setLocation(600, 80);
                viewper.getDialogoPersona().setSize(431, 414);
                viewper.getDialogoPersona().setTitle(titulo);
            }
            if (nu == 1) {
                System.out.println("Cliente");
//                CargarEdicionCliente();
                DialogoCrearEditarCliente(2);
            }
        } else {
            JOptionPane.showMessageDialog(vistaCli, "Error, debe seleccionar una fila para la edición.", "Modificar de persona.", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void EdicionPersonaClienteCL(int codigo) {
        List<Persona> listaBusper = modelPer.listarPersonas();
        for (int i = 0; i < listaBusper.size(); i++) {
            if (listaBusper.get(i).getId_persona() == codigo) {
                viewper.getTxt_ID_Persona().setText(String.valueOf(listaBusper.get(i).getId_persona()));
                viewper.getTxtCedulaPersona().setText(listaBusper.get(i).getCedula());
                viewper.getTxtNombrePersona().setText(listaBusper.get(i).getNombre());
                viewper.getTxtApellidoPersona().setText(listaBusper.get(i).getApellido());
                Date fechan = listaBusper.get(i).getFecha_nacimiento();
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

    private void crearEditarPersona() {
        if (vistaCli.getDialogoCliente().getName().equals("Crear")) {
            CrearCliente();
        } else {
            if (vistaCli.getDialogoCliente().getName().equals("Editar")) {
                EditarCliente();
            }

        }
    }

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
                JOptionPane.showMessageDialog(vistaCli, "Cliente Creado Satisfactoriamente.");
            } else {
                JOptionPane.showMessageDialog(vistaCli, "Error no se puedo crear el Cliente.");
            }
        }
    }

    private void EditarCliente() {
        Modelo_Cliente modelCliED = new Modelo_Cliente();
        modelCliED.setId_clienteC(Integer.parseInt(vistaCli.getTxt_ID_Cliente().getText()));
        modelCliED.setTelefono(vistaCli.getTxtTelefonoCliente().getText());
        modelCliED.setId_personaCI(Integer.parseInt(vistaCli.getTxt_ID_Persona().getText()));
        if (modelCliED.ModificarClienteBDA()) {
            CargarTablaCliente();
            JOptionPane.showMessageDialog(vistaCli, "Cliente Modificado Satisfactoriamente.");
        } else {
            JOptionPane.showMessageDialog(vistaCli, "Error no se puedo Modificar el Cliente.");
        }
    }

    private void CargarEdicionCliente() {
        int i = vistaCli.getTblCliente().getSelectedRow();
        if (i != -1) {
            vistaCli.getTxt_ID_Cliente().setText(vistaCli.getTblCliente().getValueAt(i, 0).toString());
            vistaCli.getTxtTelefonoCliente().setText(vistaCli.getTblCliente().getValueAt(i, 1).toString());
            vistaCli.getTxt_ID_Persona().setText(vistaCli.getTblCliente().getValueAt(i, 2).toString());

        }
    }

    private void CargarTablaCliente() {
        DefaultTableModel tb = (DefaultTableModel) vistaCli.getTblCliente().getModel();
        tb.setNumRows(0);
        List<Cliente> listaCliente = modeloCli.listarClientesBDA();
        listaCliente.stream().forEach(c -> {
            String[] cliente = {String.valueOf(c.getId_clienteC()), c.getTelefono(), String.valueOf(c.getId_personaCI())};
            tb.addRow(cliente);
        });
    }

    private void BuscarCliente(String codigo) {
        DefaultTableModel tb = (DefaultTableModel) vistaCli.getTblCliente().getModel();
        tb.setNumRows(0);
        List<Cliente> listaCliente = modeloCli.BuscarCliente(codigo);
        listaCliente.stream().forEach(c -> {
            String[] cliente = {String.valueOf(c.getId_clienteC()), c.getTelefono(), String.valueOf(c.getId_personaCI())};
            tb.addRow(cliente);
        });
    }

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

}
