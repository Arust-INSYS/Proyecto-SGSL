/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Servicio;
import Modelo.Modelo_productos;
import Vista.Vista_Servicio;
import Vista.Vista_Principal;
import Vista.vista_producto;

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
        vista_menu.getSub_menupro().addActionListener(l->Crud_productos());
    }
    private void Crud_Servicios(){
        Vista_Servicio vista_servi = new Vista_Servicio();
        Modelo_Servicio modelo_servi = new Modelo_Servicio();
        vista_menu.getDkp_pane_principal().add(vista_servi);
        Controlador_Servicio controlador = new Controlador_Servicio(modelo_servi, vista_servi);
        controlador.iniciaControl();
    }
    private void Crud_productos(){
        vista_producto vista_pro = new vista_producto();
        Modelo_productos modelo_pro = new Modelo_productos();
        vista_menu.getDkp_pane_principal().add(vista_pro);
        Controlador_productos conpro= new Controlador_productos(modelo_pro, vista_pro);
        conpro.iniciaControl();
    }
    
}
