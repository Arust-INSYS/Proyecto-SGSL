package Controlador;

import Modelo.Modelo_bodega;
import Modelo.CLASES.Bodega;
import Vista.Vista_bodega;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class Controlador_bodega {

    LocalDate fechahoy = LocalDate.now();
    private Modelo_bodega modelbo;
    private Vista_bodega visbo;

    public Controlador_bodega(Modelo_bodega modelbo, Vista_bodega visbo) {
        this.modelbo = modelbo;
        this.visbo = visbo;
        visbo.getTxtidbodega().setText(String.valueOf(modelbo.Incrementoodega()));
        visbo.getTxtidbodega().setEditable(false);
        visbo.setVisible(true);
        cargarbodegas();
        visbo.getTxtfechahoy().setText(fechahoy + "");
    }

    public void iniciaControl() {
        visbo.getBtnCrearServicio().addActionListener(l -> abrirDialogo_pro(3));
        visbo.getBtnEditarServicio().addActionListener(l -> abrirDialogo_pro(4));
        visbo.getBtnActualizarServicio().addActionListener(l -> cargarbodegas());
        visbo.getBtnAceptar_pro1().addActionListener(l -> guardar());
        visbo.getBtnCancelar_pro1().addActionListener(j-> cancelar());
        visbo.getBtnEditarServicio().addActionListener(l -> editar());
        visbo.getBtnRemoverServicio().addActionListener(l -> eli());
        setEventoKeytyped(visbo.getTxtBuscarServicio());

    }

    private void abrirDialogo_pro(int ce) {
        String title = null;
        if (ce == 3) {
            lim();
            title = "Crear nueva bodega";
            visbo.getDialog_Crearbo().setName("crear");
            visbo.getDialog_Crearbo().setVisible(true);
        visbo.getTxtidbodega().setText(String.valueOf(modelbo.Incrementoodega()));
            
        } else {
            int h = visbo.getTABLABODEGA().getSelectedRow();
            if (h != -1) {
                title = "Editar bodega";
                visbo.getDialog_Crearbo().setName("editar");
                visbo.getDialog_Crearbo().setVisible(true);
            }
        }
        visbo.getDialog_Crearbo().setLocationRelativeTo(visbo);
        visbo.getDialog_Crearbo().setSize(540, 420);
        visbo.getDialog_Crearbo().setTitle(title);
    }

    private void cargarbodegas() {
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
            String num = visbo.getSpinernum().getValue().toString();
            String ca = visbo.getjSpinnercant().getValue().toString();
            String es = visbo.getSpinerespacio().getValue().toString();
            Modelo_bodega mo = new Modelo_bodega();
            mo.setIdbodega(Integer.parseInt(id));
            mo.setNumero(Integer.parseInt(num));
            mo.setCantidad(Integer.parseInt(ca));
            mo.setEspacio(Integer.parseInt(es));
            if (mo.creabodega()) {
                visbo.getDialog_Crearbo().setVisible(false);
                JOptionPane.showMessageDialog(visbo, "creado Satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(visbo, "No se pudo crear");
            }
        } else {
            Modelo_bodega p = new Modelo_bodega();
            String id = visbo.getTxtidbodega().getText();
            String num = visbo.getSpinernum().getValue().toString();
            String ca = visbo.getjSpinnercant().getValue().toString();
            String es = visbo.getSpinerespacio().getValue().toString();
            p.setIdbodega(Integer.parseInt(id));
            p.setNumero(Integer.parseInt(num));
            p.setCantidad(Integer.parseInt(ca));
            p.setEspacio(Integer.parseInt(es));

            if (p.editarbo()) {
                JOptionPane.showMessageDialog(visbo, " MMODIFICADO");
            } else {
                JOptionPane.showMessageDialog(visbo, "Se a producido un error al modificar en la bodega .", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void editar() {
        //List<Bodega> lp = modelbo.listarbodegas();
        int xx = visbo.getTABLABODEGA().getSelectedRow();
        if (xx != -1) {
            String id = visbo.getTABLABODEGA().getValueAt(xx, 0).toString();
            visbo.getTxtidbodega().setText(id);
            visbo.getTxtidbodega().setEditable(false);
            String num = visbo.getTABLABODEGA().getValueAt(xx, 1).toString();
            visbo.getSpinernum().setValue(Integer.parseInt(num));
            String ca = visbo.getTABLABODEGA().getValueAt(xx, 2).toString();
            visbo.getjSpinnercant().setValue(Integer.parseInt(ca));
            String es = visbo.getTABLABODEGA().getValueAt(xx, 3).toString();
            visbo.getSpinerespacio().setValue(Integer.parseInt(es));
        } else {
                        JOptionPane.showMessageDialog(visbo, "Error debe seleccionar una fila ", "Validación.", JOptionPane.WARNING_MESSAGE);
            visbo.getDialog_Crearbo().dispose();
        }
    }

    private void eli() {
        int yy;
        yy = visbo.getTABLABODEGA().getSelectedRow();
        if (yy != -1) {
            String nu = visbo.getTABLABODEGA().getValueAt(yy, 0).toString();
            int result = JOptionPane.showConfirmDialog(visbo, "Esta seguro que desea eliminar la bodega con el ID " + nu + "?", "Confirmación .", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (result == JOptionPane.YES_OPTION) {
                if (modelbo.eliminarbodega(nu)) {
                    JOptionPane.showMessageDialog(visbo, "se elimino correctamente");
                    cargarbodegas();
                } else {
                    JOptionPane.showMessageDialog(visbo, "no se pudo eliminar");
                }
            } else {
                JOptionPane.showMessageDialog(visbo, "Registro cancelado para su eliminación.");
            }
        } else {
            JOptionPane.showMessageDialog(visbo, "Error, usted debe seleccionar un registro de la tabla para proceder a su eliminación.", "Eliminar.", JOptionPane.ERROR_MESSAGE);
        }
    }

    void lim() {
        visbo.getjSpinnercant().setValue(1);
        visbo.getSpinernum().setValue(1);
        visbo.getSpinerespacio().setValue(1);

    }

    void guardar() {
        crear();
        lim();
        visbo.getTxtidbodega().setText(String.valueOf(modelbo.Incrementoodega()));
        visbo.getDialog_Crearbo().setVisible(false);

    }
void cancelar(){
    lim();
    visbo.getDialog_Crearbo().setVisible(false);

}
    private void bus(java.awt.event.KeyEvent evt) {
        DefaultTableModel ta;
        ta = (DefaultTableModel) visbo.getTABLABODEGA().getModel();
        ta.setRowCount(0);
        List<Bodega> lisbo = modelbo.listarperbusquedabodega(visbo.getTxtBuscarServicio().getText());
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

    private void setEventoKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                bus(e);
            }
        });
    }
}
