/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Cliente;
import Modelo.Modelo_Persona;
import Modelo.Modelo_Servicio;
import Modelo.Modelo_productos;
import Vista.Vista_Cliente;
import Vista.Vista_Persona;
import Vista.Vista_Servicio;
import Vista.Vista_Principal;
import Vista.Vista_productos;

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
        vista_menu.getSubMenu_Persona().addActionListener(l -> Registro_Persona());
        vista_menu.getMenuItem_clientes().addActionListener(l -> Registro_Cliente());
    }
    private void Crud_Servicios(){
        Vista_Servicio vista_servi = new Vista_Servicio();
        Modelo_Servicio modelo_servi = new Modelo_Servicio();
        vista_menu.getDkp_pane_principal().add(vista_servi);
        Controlador_Servicio controlador = new Controlador_Servicio(modelo_servi, vista_servi);
        controlador.iniciaControl();
    }
    private void Crud_productos(){
        Vista_productos vista_pro = new Vista_productos();
        Modelo_productos modelo_pro = new Modelo_productos();
        vista_menu.getDkp_pane_principal().add(vista_pro);
        Controlador_productos conpro= new Controlador_productos(modelo_pro, vista_pro);
        conpro.iniciaControl();
    }
    
    private void Registro_Persona(){
        Vista_Persona vistaPerson = new Vista_Persona();
        Modelo_Persona modelPerson = new Modelo_Persona();
        vista_menu.getDkp_pane_principal().add(vistaPerson);
        Controlador_Persona ControlPerson = new Controlador_Persona(modelPerson, vistaPerson);
        ControlPerson.ControlBotonesPrincipales();
    }
    private void Registro_Cliente(){
        Vista_Cliente vistaClien = new Vista_Cliente();
        Modelo_Cliente modelClien = new Modelo_Cliente();
        vista_menu.getDkp_pane_principal().add(vistaClien);
        Controlador_Cliente ControlPerson = new Controlador_Cliente(modelClien, vistaClien);
        ControlPerson.ControlBotonesCliente();
    }
    
}
