/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLASES.Persona;
import Modelo.Modelo_Cliente;
import Modelo.Modelo_Empleado;
import Modelo.Modelo_Pedido;
import Modelo.Modelo_Persona;
import Modelo.Modelo_Servicio;
import Modelo.Modelo_Usuario;
import Modelo.Modelo_bodega;
import Modelo.Modelo_productos;
import Vista.Vista_Cliente;
import Vista.Vista_Empleado;
import Vista.Vista_Login;
import Vista.Vista_Pedidos;
import Vista.Vista_Persona;
import Vista.Vista_Servicio;
import Vista.Vista_Principal;
import Vista.Vista_bodega;
import Vista.Vista_productos;
import java.util.List;

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
        vista_menu.getBtnbodega().addActionListener(l -> Crud_bodega());
        vista_menu.getMenuItem_empleados().addActionListener(l->Crud_empleados());
        vista_menu.getBtnRegresar().addActionListener(l-> Cerrar());
        vista_menu.getSubmenu_Pedidos().addActionListener(l->Crud_pedidos());

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
        Vista_Cliente viweCliente = new Vista_Cliente();
        Modelo_Cliente modelClien = new Modelo_Cliente();
        Vista_Persona vistaPerson = new Vista_Persona();
        Modelo_Persona modelPerson = new Modelo_Persona();
        vista_menu.getDkp_pane_principal().add(viweCliente);
        Controlador_Cliente ControlPerson = new Controlador_Cliente(modelClien, viweCliente, modelPerson, vistaPerson);
        ControlPerson.ControlBotonesCliente();
    }
    private void Crud_bodega(){
        Vista_bodega vista_bo = new Vista_bodega();
        Modelo_bodega modelo_bo = new Modelo_bodega();
        vista_menu.getDkp_pane_principal().add(vista_bo);
        Controlador_bodega conpro= new Controlador_bodega(modelo_bo, vista_bo);
        conpro.iniciaControl();
    }
    
    private void Crud_empleados(){
        Vista_Empleado vista_emple = new Vista_Empleado();
        Modelo_Empleado modelo_emple = new Modelo_Empleado();
        Vista_Persona vistaPerson = new Vista_Persona();
        Modelo_Persona modelPerson = new Modelo_Persona();
        vista_menu.getDkp_pane_principal().add(vista_emple);
        Controlador_Empleados conemple = new Controlador_Empleados(modelo_emple, vista_emple, modelPerson, vistaPerson);
        conemple.iniciaControl();
        conemple.ComboRol();
        
    }
    
    private void Cerrar(){
        vista_menu.setVisible(false);
        Vista_Login visL = new Vista_Login();
        Modelo_Usuario mus = new Modelo_Usuario();
        Controlador_Login cl= new Controlador_Login(mus, visL);
        cl.IniciarBoton();
        visL.setVisible(true);
    }
    
    public void datosUsuario(String user){
        String rol="";
        
        Modelo_Persona mp = new Modelo_Persona();
        List<Persona> listP = mp.DatosUsuario(user);
        for (Persona persona : listP) {
            vista_menu.getLblnombreE().setText(persona.getNombre()+" "+ persona.getApellido());
            vista_menu.getLblrol().setText(persona.getCedula());
            rol=persona.getCedula();
        }
        roles(rol);
        
    }
  
    public void roles(String rol){
        String admin="administrador";
        String empl="Usuario Normal";
        if(empl.equalsIgnoreCase(rol)){
            vista_menu.getMenuItem_empleados().setEnabled(false);
        }
    }
     private void Crud_pedidos(){
        Vista_Pedidos vista = new Vista_Pedidos();
        Modelo_Pedido modelo = new Modelo_Pedido();        
        vista_menu.getDkp_pane_principal().add(vista);
        
        Controlador_Pedido control = new Controlador_Pedido(modelo,vista);
        control.incioControl();
    }
     
    
    
    
}
