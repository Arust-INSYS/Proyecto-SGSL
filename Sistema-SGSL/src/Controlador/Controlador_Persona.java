/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Persona;
import Vista.Vista_Persona;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

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
    }
    
    public void ControlBotonesPrincipales(){
        vistaPer.getBtnCrearPersona().addActionListener(l->DialogoCrearEditarPersona(1));
        vistaPer.getBtnEditarPersona().addActionListener(l->DialogoCrearEditarPersona(2));
        
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
                //CrearPersona();            
        } else {
               //EditarPersona();    
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
    private String GeneroPersona(){
        String GeneroPerso = null;
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
}
