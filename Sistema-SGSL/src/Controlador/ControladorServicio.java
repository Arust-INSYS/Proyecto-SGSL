/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ModeloServicio;
import Vista.VistaServicio;

/**
 *
 * @author lorena
 */
public class ControladorServicio {
    private ModeloServicio modelo_servi;
    private VistaServicio vista_servi;

    public ControladorServicio(ModeloServicio modelo_servi, VistaServicio vista_servi) {
        this.modelo_servi = modelo_servi;
        this.vista_servi = vista_servi;
    }

    
}
