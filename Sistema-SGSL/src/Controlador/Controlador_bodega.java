package Controlador;

import Modelo.Modelo_bodega;
import Modelo.CLASES.Bodega;
import Modelo.CLASES.Productos;
import Modelo.Modelo_productos;

import Vista.Vista_bodega;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class Controlador_bodega {

    LocalDate fechahoy = LocalDate.now();
    private Modelo_bodega modelbo;
    private Vista_bodega visbo;

    public Controlador_bodega(Modelo_bodega modelbo, Vista_bodega visbo) {
        this.modelbo = modelbo;
        this.visbo = visbo;
        visbo.setVisible(true);
       cargarbodegas();
       visbo.getTxtfechahoy().setText(fechahoy + "");

    }


    public void iniciaControl() {
        visbo.getBtnCrearServicio().addActionListener(l -> abrirDialogo_pro(3));
       visbo.getBtnEditarServicio().addActionListener(l -> abrirDialogo_pro(4));
           visbo.getBtnActualizarServicio().addActionListener(l ->cargarbodegas());
           visbo.getBtnAceptar_pro1().addActionListener(l ->crear());
           visbo.getBtnEditarServicio().addActionListener(l ->editar());

    }

    private void abrirDialogo_pro(int ce) {
        String title;
        if (ce == 3) {
            //limpiardatos();
            title = "Crear nueva bodega";
            visbo.getDialog_Crearbo().setName("crear");
        } else {
            title = "Editar bodega";
            visbo.getDialog_Crearbo().setName("editar");
        }
        visbo.getDialog_Crearbo().setLocationRelativeTo(visbo);
        visbo.getDialog_Crearbo().setSize(620, 500);
        visbo.getDialog_Crearbo().setTitle(title);
        visbo.getDialog_Crearbo().setVisible(true);
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

    private void crear() {
        System.out.println("1");
        if (visbo.getDialog_Crearbo().getName() == "crear") {
            String id = visbo.getTxtidbodega().getText();
            System.out.println(id);
            String num = visbo.getTxtnumero().getText();
            String ca = visbo.getTxtcantidad().getText();
            String es= visbo.getTxtespacio().getText();
            Modelo_bodega mo = new Modelo_bodega();
            mo.setIdbodega(Integer.parseInt(id));
            mo.setNumero(Integer.parseInt(num));
            mo.setCantidad(Integer.parseInt(ca));
            mo.setEspacio(Integer.parseInt(es));        
            if (modelbo.creabodega()) {
                visbo.getDialog_Crearbo().setVisible(false);
                JOptionPane.showMessageDialog(visbo, "creado Satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(visbo, "No se pudo crear");
            }
        } else {
            Modelo_bodega p = new Modelo_bodega();
            String id = visbo.getTxtidbodega().getText();
            String num = visbo.getTxtnumero().getText();
            String ca = visbo.getTxtcantidad().getText();
            String es = visbo.getTxtespacio().getText();  
            p.setIdbodega(Integer.parseInt(id));
            p.setNumero(Integer.parseInt(num));
            p.setCantidad(Integer.parseInt(ca));
            p.setEspacio(Integer.parseInt(es));
            
                if (p.editarbo()) {
                    JOptionPane.showMessageDialog(visbo, " MMODIFICADO");
                } else {
                    JOptionPane.showMessageDialog(visbo, "Se a producido un error al modificar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
     private void editar() {
        List<Bodega> lp = modelbo.listarbodegas();
        int xx = visbo.getTABLABODEGA().getSelectedRow();
        if (xx != -1) {
            String id = visbo.getTABLABODEGA().getValueAt(xx, 0).toString();
            visbo.getTxtidbodega().setText(id);
            String num =visbo.getTABLABODEGA().getValueAt(xx, 1).toString();
            visbo.getTxtnumero().setText(num);
            String ca = visbo.getTABLABODEGA().getValueAt(xx, 2).toString();
            visbo.getTxtcantidad().setText(ca);
        String es = visbo.getTABLABODEGA().getValueAt(xx, 3).toString();
            visbo.getTxtespacio().setText(es);
                
            
        } else {
            JOptionPane.showMessageDialog(visbo, "error seleccione una fila");
            visbo.getDialog_Crearbo().dispose();
        }
    }
   

}

