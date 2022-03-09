package Controlador;

import Modelo.Modelo_productos;
import Vista.vista_producto;

public class Controlador_productos {
private Modelo_productos modelpro;
private vista_producto vispro;

    public Controlador_productos(Modelo_productos modelpro, vista_producto vispro) {
        this.modelpro = modelpro;
        this.vispro = vispro;
      
    }
     public void iniciaControl(){
                 vispro.getBtncrear().addActionListener(j -> abrirdialo(1));
       
    }
    

    private void abrirdialo(int num) {
        String title;
        if (num == 1) {
     //       limm();
            title = "crear nueva producto";
            vispro.getDialogproducto().setName("CREAR");
        } else {
       //     editar();
            title = "editar producto";
            vispro.getDialogproducto().setName("EDITAR");
        }
        vispro.getDialogproducto().setLocationRelativeTo(null);
        vispro.getDialogproducto().setSize(630, 400);
//        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
//        int x = (int) ((dimension.getWidth() - vispro.getDalproduc().getWidth()) / 2);
//        int y = (int) ((dimension.getHeight() -vispro.getDalproduc().getHeight()) / 2);
//        vispro.getDalproduc().setLocation(x, y);
        vispro.getDialogproducto().setTitle(title);
        vispro.getDialogproducto().setVisible(true);
    }
    

}
