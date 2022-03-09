/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo_productos;
import Vista.Vista_productos;

/**
 *
 * @author LENOVO
 */
public class controlador_productos {
    private Modelo_productos modelpro;
    private Vista_productos vispro;

    public controlador_productos(Modelo_productos modelpro, Vista_productos vispro) {
        this.modelpro = modelpro;
        this.vispro = vispro;
    }
    public void controlpro(){
    vispro.getBntcrear().addActionListener(j -> mostrar(1));
    }
    private void mostrar(int n){
    String titulo;
    if(n==1){
    titulo="CREAR";
    vispro.getDialogproduc().setName(titulo);
    }else {
    titulo="EDITAR";
    vispro.getDialogproduc().setName(titulo);
    }
    vispro.getDialogproduc().setLocationRelativeTo(vispro);
    vispro.getDialogproduc().setSize(300,300);        
    }
}
