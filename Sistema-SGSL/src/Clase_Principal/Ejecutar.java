/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package Clase_Principal;

import Controlador.Control_VistaPrincipal;
import Controlador.Controlador_Carga;
import Controlador.Controlador_Login;
import Modelo.Modelo_Empleado;
import Modelo.Modelo_Usuario;
import Vista.Vista_Carga;
import Vista.Vista_Login;
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
        
        //logeo
//        Vista_Login vl = new Vista_Login();
//        Modelo_Usuario mu = new Modelo_Usuario();
//        Controlador_Login cl = new Controlador_Login(mu, vl);
//        cl.IniciarBoton();
//        //
//        Vista_Carga viewcarga = new Vista_Carga();
//        Controlador_Carga conC = new Controlador_Carga(viewcarga);
//        conC.inicia_Control_Carga();
    }
    
}
