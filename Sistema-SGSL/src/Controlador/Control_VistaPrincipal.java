/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Servicio;
import Vista.Vista_Servicio;
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
        Vista_Servicio vista_servi = new Vista_Servicio();
        Modelo_Servicio modelo_servi = new Modelo_Servicio();
        vista_menu.getDkp_pane_principal().add(vista_servi);
        Controlador_Servicio controlador = new Controlador_Servicio(modelo_servi, vista_servi);
        controlador.iniciaControl();
    }
}
