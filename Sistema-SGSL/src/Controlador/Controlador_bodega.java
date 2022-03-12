package Controlador;

import Modelo.Modelo_bodega;
import Modelo.CLASES.Bodega;

import Vista.Vista_bodega;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class Controlador_bodega {

    private Modelo_bodega modelbo;
    private Vista_bodega visbo;
  //  private JFileChooser jfch;

    public Controlador_bodega(Modelo_bodega modelbo, Vista_bodega visbo) {
        this.modelbo = modelbo;
        this.visbo = visbo;
        visbo.setVisible(true);
       // cargarbodegas();
    }


    public void iniciaControl() {
        visbo.getBtnCrearServicio().addActionListener(l -> abrirDialogo_pro(3));
       visbo.getBtnEditarServicio().addActionListener(l -> abrirDialogo_pro(4));
           visbo.getBtnActualizarServicio().addActionListener(l ->cargarbodegas());

    }

    private void abrirDialogo_pro(int ce) {
        String title;
        if (ce == 3) {
            //limpiardatos();
            title = "Crear nueva bodega";
            visbo.getDialog_Crear().setName("crear");
        } else {
            title = "Editar bodega";
            visbo.getDialog_Crear().setName("editar");
        }
        visbo.getDialog_Crear().setLocationRelativeTo(visbo);
        visbo.getDialog_Crear().setSize(620, 500);
        visbo.getDialog_Crear().setTitle(title);
        visbo.getDialog_Crear().setVisible(true);
    }
 private void cargarbodegas() {
        visbo.getTABLABODEGA().setDefaultRenderer(Object.class, new Imangentabla());
        visbo.getTABLABODEGA().setRowHeight(100);
        DefaultTableModel ta;
        ta = (DefaultTableModel) visbo.getTABLABODEGA().getModel();
        ta.setNumRows(0);
        List<Bodega> lisbo = modelbo.listarbodegas();
        Holder<Integer> i = new Holder<>(0);
        lisbo.stream().forEach(q -> {
            ta.addRow(new Object[5]);//cantidad de columna
            visbo.getTABLABODEGA().setValueAt(q.getIdbodega(), i.value, 0);
            visbo.getTABLABODEGA().setValueAt(q.getNumero(), i.value, 1);
            visbo.getTABLABODEGA().setValueAt(q.getCantidad(), i.value, 2);
            visbo.getTABLABODEGA().setValueAt(q.getEspacio(), i.value, 3);
            i.value++;
        });

    }


}
