/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Persona;
import Modelo.Modelo_Persona;
import Vista.Vista_Persona;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
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

/**
 *
 * @author DELL
 */
public class Controlador_Persona {
    private Modelo_Persona modelPer;
    private Vista_Persona vistaPer;
    private JFileChooser jfc;
    
    public Controlador_Persona(Modelo_Persona modelPer, Vista_Persona vistaPer) {
        this.modelPer = modelPer;
        this.vistaPer = vistaPer;
        vistaPer.setVisible(true);
        //vistaPer.getTxt_ID_Persona().setText(String.valueOf(modelPer.IncrementoIdPersona()));
    }
    
    public void ControlBotonesPrincipales(){
        vistaPer.getBtnCrearPersona().addActionListener(l->DialogoCrearEditarPersona(1));
        vistaPer.getBtnEditarPersona().addActionListener(l->DialogoCrearEditarPersona(2));
        vistaPer.getBtnActualizarPersona().addActionListener(l -> CargarTablaPersona());
        vistaPer.getBtnAceptarPer().addActionListener(l -> crearEditarPersona());
        vistaPer.getBtnSeleccionarFoto().addActionListener(l -> ExaminarFoto());
        
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
    
    private void DialogoCrearEditarPersona(int tipo){
        String titulo = null;
        if(tipo == 1){
            titulo = "Crear nueva Persona";
            vistaPer.getDialogoPersona().setName("Crear");
            vistaPer.getDialogoPersona().setVisible(true);
        }else{
            if(tipo == 2){
                titulo = "Editar Persona";
                vistaPer.getDialogoPersona().setName("Editar");
                vistaPer.getDialogoPersona().setVisible(true);
            }
        }
        vistaPer.getDialogoPersona().setLocation(600, 80);
        vistaPer.getDialogoPersona().setSize(431, 414);
        vistaPer.getDialogoPersona().setTitle(titulo);
    }
    private void crearEditarPersona() {
        String fecha = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        if (vistaPer.getDialogoPersona().getName().equals("Crear")) {
                CrearPersona();            
        } else {
            if(vistaPer.getDialogoPersona().getName().equals("Editar")){
                  EditarPersona();  
            }
  
        }
    }
    
    private void CrearPersona(){
        Modelo_Persona modelPer = new Modelo_Persona();
        modelPer.setId_persona(Integer.parseInt(vistaPer.getTxt_ID_Persona().getText()));
        modelPer.setCedula(vistaPer.getTxtCedulaPersona().getText());
        modelPer.setNombre(vistaPer.getTxtNombrePersona().getText());
        modelPer.setApellido(vistaPer.getTxtApellidoPersona().getText());
        String fechaNacimiento = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        Date fechaN = java.sql.Date.valueOf(fechaNacimiento);
        modelPer.setFecha_nacimiento((java.sql.Date) fechaN);
        modelPer.setGenero(GeneroPersona());
        modelPer.setDireccion(vistaPer.getTxtDireccionPersona().getText());
        try {
            FileInputStream img = new FileInputStream(jfc.getSelectedFile());
            int largo = (int) jfc.getSelectedFile().length();
            modelPer.setImagen(img);
            modelPer.setLargo(largo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador_Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(modelPer.CrearPersonaBDA()){
            CargarTablaPersona();
            JOptionPane.showMessageDialog(vistaPer, "Persona Creada Satisfactoriamente");
        }else{
            JOptionPane.showMessageDialog(vistaPer, "Error no se puedo crear la Persona");
        }
    }
    
    private void EditarPersona(){
        Modelo_Persona modelPerE = new Modelo_Persona();
        modelPer.setId_persona(Integer.parseInt(vistaPer.getTxt_ID_Persona().getText()));
        modelPer.setNombre(vistaPer.getTxtNombrePersona().getText());
        modelPer.setApellido(vistaPer.getTxtApellidoPersona().getText());
        String fechaNacimiento = ((JTextField) vistaPer.getFechaNacimientoPer().getDateEditor().getUiComponent()).getText();
        Date fechaN = java.sql.Date.valueOf(fechaNacimiento);
        modelPer.setFecha_nacimiento((java.sql.Date) fechaN);
        modelPer.setGenero(GeneroPersona());
        modelPer.setDireccion(vistaPer.getTxtDireccionPersona().getText());
        try {
            FileInputStream img = new FileInputStream(jfc.getSelectedFile());
            int largo = (int) jfc.getSelectedFile().length();
            modelPer.setImagen(img);
            modelPer.setLargo(largo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador_Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(modelPer.ModificarPersonaBDA()){
            JOptionPane.showMessageDialog(vistaPer, "La Persona a sido modificado satisfactoriamente.");
        }else{
            JOptionPane.showMessageDialog(vistaPer, "Error, no se pudo modificar la Persona.");
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
    
    private String GeneroPersona(){
        String GeneroPerso = "";
        vistaPer.getGrupoBotonGenero().add(vistaPer.getRadioBtnMasculino());
        vistaPer.getGrupoBotonGenero().add(vistaPer.getRadioBtnFemenino());
        if(vistaPer.getRadioBtnMasculino().isSelected()){
            GeneroPerso = "M";
        }
        if(vistaPer.getRadioBtnFemenino().isSelected()){
             GeneroPerso = "F";
        }
        return GeneroPerso;
    }
    
    private void Limpiar_DatosPersona(){
        vistaPer.getTxtCedulaPersona().setText("");
        vistaPer.getTxtNombrePersona().setText("");
        vistaPer.getTxtApellidoPersona().setText("");
        vistaPer.getFechaNacimientoPer().setDate(null);
        vistaPer.getGrupoBotonGenero().clearSelection();
        vistaPer.getTxtDireccionPersona().setText("");
        vistaPer.getLblFotoPersona().setIcon(null);
    }
    
    private boolean ValidarUsuarioRepetido(String cedula){
        boolean cedulaRepetida = false;
        List<Persona> ValidoListaP = modelPer.listarPersonas();
        for (int i = 0; i < ValidoListaP.size(); i++) {
            if(ValidoListaP.get(i).getCedula().equals(cedula)){
                cedulaRepetida = true;
            } 
        }
        return cedulaRepetida;
    }
    private void CargarEdicionPersona() {

        int i = vistaPer.getTblPersonas().getSelectedRow();
        if (i != -1) {
            String ve = vistaPer.getTblPersonas().getValueAt(i, 0).toString();
            
            
        } else {
            JOptionPane.showMessageDialog(vistaPer, "Error.");
        }
    }
}
