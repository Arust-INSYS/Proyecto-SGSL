/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Clase_Principal;

import Controlador.Control_VistaPrincipal;
import Vista.Vista_Principal;

/**
 *
 * @author Arust
 */
public class Ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        Vista_Principal vista = new Vista_Principal();
        Control_VistaPrincipal controlador = new Control_VistaPrincipal(vista);
        controlador.iniciaControl();
    }
    
}
