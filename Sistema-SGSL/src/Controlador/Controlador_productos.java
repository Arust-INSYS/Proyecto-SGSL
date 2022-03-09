package Controlador;

import Modelo.Modelo_productos;
import Vista.Vista_productos;


public class Controlador_productos {
    private Modelo_productos modelpro;
    private Vista_productos vispro;

    public Controlador_productos(Modelo_productos modelpro, Vista_productos vispro) {
        this.modelpro = modelpro;
        this.vispro = vispro;
    

            vispro.setVisible(true);
    }
    
    public void iniciaControl(){
        vispro.getBtnCrearServicio().addActionListener(l->abrirDialogo_pro(3));
        vispro.getBtnEditarServicio().addActionListener(l->abrirDialogo_pro(4));
            
    }
    
    private void abrirDialogo_pro(int ce){
      String title;
        if(ce==3){
            title="Crear nuevo servicio";
            vispro.getDialog_Crear().setName("crear");
        }else{
            title="Editar servicio";
            vispro.getDialog_Crear().setName("editar");
        }
        vispro.getDialog_Crear().setLocationRelativeTo(vispro);
        vispro.getDialog_Crear().setSize(620,500);
        vispro.getDialog_Crear().setTitle(title);
        vispro.getDialog_Crear().setVisible(true); 
    }
    
}
