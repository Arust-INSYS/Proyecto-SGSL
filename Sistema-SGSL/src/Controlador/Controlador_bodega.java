package Controlador;

import Modelo.Modelo_bodega;
import Vista.Vista_bodega;

public class Controlador_bodega {

    private Modelo_bodega modelbo;
    private Vista_bodega visbo;
  //  private JFileChooser jfch;

    public Controlador_bodega(Modelo_bodega modelbo, Vista_bodega visbo) {
        this.modelbo = modelbo;
        this.visbo = visbo;
        visbo.setVisible(true);
    }


    public void iniciaControl() {
        visbo.getBtnCrearServicio().addActionListener(l -> abrirDialogo_pro(3));
       visbo.getBtnEditarServicio().addActionListener(l -> abrirDialogo_pro(4));
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

//    private void cargarproductos() {
//        vispro.getTablita().setDefaultRenderer(Object.class, new Imangentabla());
//        vispro.getTablita().setRowHeight(100);
//        DefaultTableModel ta;
//        ta = (DefaultTableModel) vispro.getTablita().getModel();
//        ta.setNumRows(0);
//        List<Productos> lisproduc = modelpro.listarproductos();
//        Holder<Integer> i = new Holder<>(0);
//        lisproduc.stream().forEach(q -> {
//            ta.addRow(new Object[9]);//cantidad de columna
//            vispro.getTablita().setValueAt(q.getId_producto(), i.value, 0);
//            vispro.getTablita().setValueAt(q.getNom_producto(), i.value, 1);
//            vispro.getTablita().setValueAt(q.getPrecio_producto(), i.value, 2);
//            vispro.getTablita().setValueAt(q.getCantidad_producto(), i.value, 3);
//            vispro.getTablita().setValueAt(q.getMarcar_producto(), i.value, 4);
//            vispro.getTablita().setValueAt(q.getId_empleado(), i.value, 6);
//            vispro.getTablita().setValueAt(q.getId_bodega(), i.value, 7);
//            Image foto = q.getFoto();
//            if (foto != null) {
//                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//                ImageIcon icon = new ImageIcon(nimg);
//                DefaultTableCellRenderer render = new DefaultTableCellRenderer();
//                render.setIcon(icon);
//                vispro.getTablita().setValueAt(new JLabel(icon), i.value, 5);
//            } else {
//                vispro.getTablita().setValueAt(null, i.value, 5);
//            }
//            i.value++;
//        });
//
//    }
//
//    private void crear() {
//        System.out.println("1");
//        if (vispro.getDialog_Crear().getName() == "crear") {
//            String id = vispro.getTxtidproducto().getText();
//            String nom = vispro.getTxtnom_pro().getText();
//            String marca = vispro.getTxtmarca().getText();
//            String precio = vispro.getTxtpreciopro().getText();
//            String cant = vispro.getSnipercanti().getValue().toString();
//            String idEM = vispro.getTxtid_empleado().getText();
//            String idBO = vispro.getTxtidbodega().getText();
//
//            Modelo_productos mopro = new Modelo_productos();
//            mopro.setId_producto(Integer.parseInt(id));
//            mopro.setNom_producto(nom);
//            mopro.setMarcar_producto(marca);
//            mopro.setPrecio_producto(Double.parseDouble(precio));
//            mopro.setCantidad_producto(Integer.parseInt(cant));
//            mopro.setId_empleado(Integer.parseInt(idEM));
//            mopro.setId_bodega(Integer.parseInt(idBO));
//            System.out.println("2");
//            try {
//                //Foto
//                FileInputStream img = new FileInputStream(jfch.getSelectedFile());
//                int largo = (int) jfch.getSelectedFile().length();
//                mopro.setImagen(img);
//                mopro.setLargo(largo);
//            } catch (FileNotFoundException ex) {
//                Logger.getLogger(Controlador_bodega.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            System.out.println("3");
//
//            if (mopro.crearprocduc()) {
//                vispro.getDialog_Crear().setVisible(false);
//                JOptionPane.showMessageDialog(vispro, "PRODUCTO Creado Satisfactoriamente");
//            } else {
//                JOptionPane.showMessageDialog(vispro, "No se pudo crear al producto");
//            }
//        } else {
//            Modelo_productos p = new Modelo_productos();
//            String id = vispro.getTxtidproducto().getText();
//            String nom = vispro.getTxtnom_pro().getText();
//            String descrip = vispro.getTxtmarca().getText();
//            String precio = vispro.getTxtpreciopro().getText();
//            String cant = vispro.getSnipercanti().getValue().toString();
//            String idem = vispro.getTxtid_empleado().getText();
//            String idbo = vispro.getTxtidbodega().getText();
//
//            p.setId_producto(Integer.parseInt(id));
//            p.setNom_producto(nom);
//            p.setMarcar_producto(descrip);
//            p.setPrecio_producto(Double.parseDouble(precio));
//            p.setCantidad_producto(Integer.parseInt(cant));
//            p.setId_empleado(Integer.parseInt(idem));
//            p.setId_bodega(Integer.parseInt(idbo));
//
//            if (jfch == null) {
//                if (p.editarpro(id)) {
//                    JOptionPane.showMessageDialog(vispro, "PRODUCTO MMODIFICADO");
//                } else {
//                    JOptionPane.showMessageDialog(vispro, "Se a producido un error al modificar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            } else {
//
//                try {
//                    //Foto
//                    FileInputStream img = new FileInputStream(jfch.getSelectedFile());
//                    int largo = (int) jfch.getSelectedFile().length();
//                    p.setImagen(img);
//                    p.setLargo(largo);
//                } catch (FileNotFoundException ex) {
//                    Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//                if (p.edipro(id)) {
//                }
//
//            }
//        }
//    }
//
//    private void editar() {
//        List<Productos> lp = modelpro.listarproductos();
//        int xx = vispro.getTablita().getSelectedRow();
//        if (xx != -1) {
//            String id = vispro.getTablita().getValueAt(xx, 0).toString();
//            int pro = Integer.parseInt(id);
//            vispro.getTxtidproducto().setText(id);
//            String nom = vispro.getTablita().getValueAt(xx, 1).toString();
//            vispro.getTxtnom_pro().setText(nom);
//            String precio = vispro.getTablita().getValueAt(xx, 2).toString();
//            vispro.getTxtpreciopro().setText(precio);
//            String cant = vispro.getTablita().getValueAt(xx, 3).toString();
//            vispro.getSnipercanti().setValue(Integer.parseInt(cant));
//  String marca = vispro.getTablita().getValueAt(xx, 4).toString();
//            vispro.getTxtmarca().setText(marca);          
//            String idem = vispro.getTablita().getValueAt(xx, 6).toString();
//            vispro.getTxtid_empleado().setText(idem);
//            String idbo = vispro.getTablita().getValueAt(xx, 7).toString();
//            vispro.getTxtidbodega().setText(idbo);
//            for (int i = 0; i < lp.size(); i++) {
//                if (lp.get(i).getId_producto() == pro) {
//                    Image ft = lp.get(i).getFoto();
//                    Image j = ft.getScaledInstance(196, 136, Image.SCALE_SMOOTH);
//                    Icon ic = new ImageIcon(j);
//                    vispro.getTxtfoto().setIcon(ic);
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(vispro, "error seleccione una fila");
//            vispro.getDialog_Crear().dispose();
//        }
//    }
//    private void eli() {
//        int yy;
//        yy = vispro.getTablita().getSelectedRow();
//        if (yy != -1) {
//            String nu = vispro.getTablita().getValueAt(yy, 0).toString();
//            if (modelpro.eliminapro(nu)) {
//                JOptionPane.showMessageDialog(vispro, "se elimino correctamente");
//                cargarproductos();
//            } else {
//                JOptionPane.showMessageDialog(vispro, "no se pudo eliminar");
//            }
//
//        } else {
//            JOptionPane.showMessageDialog(vispro, "error seleccione una fila");
//            vispro.getDialog_Crear().dispose();
//        }
//    }
//    private void cancelar() {
//        vispro.getDialog_Crear().setVisible(false);
//    }
//        private void limpiardatos() {
//        vispro.getTxtidbodega().setText("");
//        vispro.getTxtid_empleado().setText("");
//        vispro.getTxtnom_pro().setText("");
//        vispro.getSnipercanti().setValue(1);
//        vispro.getTxtfechahoy().setIcon(null);
//        vispro.getTxtpreciopro().setText("");
//        vispro.getTxtmarca().setText("");
//
//        }
//        
//    void guardar() {
//    crear();
//    vispro.getTxtidproducto().setText(String.valueOf(modelpro.IncrementoIdproducto()));
//
//    
//    }
//
//    private void bus(java.awt.event.KeyEvent evt) {
//        vispro.getTablita().setDefaultRenderer(Object.class, new Imangentabla());
//        vispro.getTablita().setRowHeight(100);
//        DefaultTableModel ta;
//        ta = (DefaultTableModel) vispro.getTablita().getModel();
//        ta.setRowCount(0);
//
//        List<Productos> lisproduc = modelpro.listarperbusqueda(vispro.getTxtBuscarServicio().getText());
//        Holder<Integer> i = new Holder<>(0);
//        lisproduc.stream().forEach(q -> {
//            ta.addRow(new Object[9]);//cantidad de columna
//            vispro.getTablita().setValueAt(q.getId_producto(), i.value, 0);
//            vispro.getTablita().setValueAt(q.getNom_producto(), i.value, 1);
//            vispro.getTablita().setValueAt(q.getPrecio_producto(), i.value, 2);
//            vispro.getTablita().setValueAt(q.getCantidad_producto(), i.value, 3);
//            vispro.getTablita().setValueAt(q.getMarcar_producto(), i.value, 4);
//            vispro.getTablita().setValueAt(q.getId_empleado(), i.value, 6);
//            vispro.getTablita().setValueAt(q.getId_bodega(), i.value, 7);
//            Image foto = q.getFoto();
//            if (foto != null) {
//                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
//                ImageIcon icon = new ImageIcon(nimg);
//                
//                DefaultTableCellRenderer render = new DefaultTableCellRenderer();
//                render.setIcon(icon);
//                vispro.getTablita().setValueAt(new JLabel(icon), i.value, 5);
//            } else {
//                vispro.getTablita().setValueAt(null, i.value, 5);
//            }
//            i.value++;
//        });
//
//
//    }
//    private void setEventoKeytyped(JTextField txt) {
//        txt.addKeyListener(new java.awt.event.KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent e) {
//                bus(e);
//            }
//        });
//    }


}
