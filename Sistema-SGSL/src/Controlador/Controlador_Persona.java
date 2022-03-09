/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_Persona;
import Vista.Vista_Persona;

/**
 *
 * @author DELL
 */
public class Controlador_Persona {
    private Modelo_Persona modelPer;
    private Vista_Persona vistaPer;

    public Controlador_Persona(Modelo_Persona modelPer, Vista_Persona vistaPer) {
        this.modelPer = modelPer;
        this.vistaPer = vistaPer;
        vistaPer.setVisible(true);
    }
    
    
}
