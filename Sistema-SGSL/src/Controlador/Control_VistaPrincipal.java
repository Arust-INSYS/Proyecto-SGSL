/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloServicio;
import Vista.VistaServicio;
import Vista.Vista_Principal;

/**
 *
 * @author Arust
 */
public class Control_VistaPrincipal {
    Vista_Principal vista_menu;
    
    public Control_VistaPrincipal(Vista_Principal vista_menu){
        this.vista_menu=vista_menu;
        vista_menu.setVisible(true);
    }
    
    public void iniciaControl(){
        vista_menu.getSubMenu_servicios().addActionListener(l->Crud_Servicios());
        
    }
    private void Crud_Servicios(){
        VistaServicio vista = new VistaServicio();
        ModeloServicio modelo = new ModeloServicio();
        vista_menu.getDkp_pane_principal().add(vista);
        ControladorServicio controlador = new ControladorServicio(modelo, vista);
        controlador.iniciaControl();
    }
}
