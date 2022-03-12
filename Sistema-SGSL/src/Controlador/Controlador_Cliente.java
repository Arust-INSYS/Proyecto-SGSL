/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Cliente;
import Modelo.Modelo_Cliente;
import Vista.Vista_Cliente;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
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

    public Controlador_Cliente(Modelo_Cliente modeloCli, Vista_Cliente vistaCli) {
        this.modeloCli = modeloCli;
        this.vistaCli = vistaCli;
        vistaCli.setVisible(true);
        IncremetoID_Cliente();
        CargarTablaCliente();
    }

    public void ControlBotonesCliente() {
        vistaCli.getBtnCrearCliente().addActionListener(l -> DialogoCrearEditarCliente(1));
        vistaCli.getBtnEditarCliente().addActionListener(l -> DialogoCrearEditarCliente(2));
        vistaCli.getBtnActualizarCliente().addActionListener(l -> CargarTablaCliente());
        vistaCli.getBtnAceptarCli().addActionListener(l -> crearEditarPersona());
        EventosComponentesVistaCliente();
    }
    private void EventosComponentesVistaCliente(){
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
                int i = vistaCli.getTblCliente().getSelectedRow();
                if (i != -1) {
                    titulo = "Editar Cliente";
                    vistaCli.getDialogoCliente().setName("Editar");
                    vistaCli.getDialogoCliente().setVisible(true);
                    CargarEdicionCliente();
                } else {
                    JOptionPane.showMessageDialog(vistaCli, "Error, debe seleccionar una fila para la edición.", "Modificar de persona.", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        vistaCli.getDialogoCliente().setLocation(600, 80);
        vistaCli.getDialogoCliente().setSize(431, 414);
        vistaCli.getDialogoCliente().setTitle(titulo);
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
        if (modelCli.CrearClienteBDA()) {
            CargarTablaCliente();
            JOptionPane.showMessageDialog(vistaCli, "Cliente Creado Satisfactoriamente.");
        } else {
            JOptionPane.showMessageDialog(vistaCli, "Error no se puedo crear el Cliente.");
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
    private void CargarEdicionCliente(){
        int i = vistaCli.getTblCliente().getSelectedRow();
        if(i != -1){
            vistaCli.getTxt_ID_Cliente().setText(vistaCli.getTblCliente().getValueAt(i, 0).toString());
            vistaCli.getTxtTelefonoCliente().setText(vistaCli.getTblCliente().getValueAt(i, 1).toString());
            vistaCli.getTxt_ID_Persona().setText(vistaCli.getTblCliente().getValueAt(i, 2).toString());
            
        }
    }
    private void CargarTablaCliente(){
        DefaultTableModel tb = (DefaultTableModel) vistaCli.getTblCliente().getModel();
        tb.setNumRows(0);
        List<Cliente> listaCliente = modeloCli.listarClientesBDA();
        listaCliente.stream().forEach(c ->{
            String[] cliente = {String.valueOf(c.getId_clienteC()),c.getTelefono(),String.valueOf(c.getId_personaCI())};
            tb.addRow(cliente);
        });
    }
    private void BuscarCliente(String codigo){
        DefaultTableModel tb = (DefaultTableModel) vistaCli.getTblCliente().getModel();
        tb.setNumRows(0);
        List<Cliente> listaCliente = modeloCli.BuscarCliente(codigo);
        listaCliente.stream().forEach(c ->{
            String[] cliente = {String.valueOf(c.getId_clienteC()),c.getTelefono(),String.valueOf(c.getId_personaCI())};
            tb.addRow(cliente);
        });
    }
}
