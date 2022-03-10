package Controlador;
import Modelo.CLASES.Productos;
import Modelo.Modelo_productos;
import Vista.Vista_productos;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;


public class Controlador_productos {
    private Modelo_productos modelpro;
    private Vista_productos vispro;
    private JFileChooser jfch;

    public Controlador_productos(Modelo_productos modelpro, Vista_productos vispro) {
        this.modelpro = modelpro;
        this.vispro = vispro;
            vispro.setVisible(true);
    //        cargarproduc();
    }
    
    public void iniciaControl(){
        vispro.getBtnCrearServicio().addActionListener(l->abrirDialogo_pro(3));
        vispro.getBtnEditarServicio().addActionListener(l->abrirDialogo_pro(4));
        vispro.getBtnexaminar().addActionListener(l->examifoto());
            vispro.getBtnActualizarServicio().addActionListener(l->cargarproductos());
            vispro.getBtnAceptar_pro1().addActionListener(l->crear());

    }
     private void examifoto() {
        jfch = new JFileChooser();
        jfch.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int est = jfch.showOpenDialog(vispro);
        if (est == JFileChooser.APPROVE_OPTION) {
            try {
                Image img = ImageIO.read(jfch.getSelectedFile()).getScaledInstance(vispro.getTxtfoto().getWidth(), vispro.getTxtfoto().getWidth(), Image.SCALE_DEFAULT);
                Icon icon = new ImageIcon(img);
                vispro.getTxtfoto().setIcon(icon);
                vispro.getTxtfoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(Controlador_productos.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
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
    
        private void cargarproductos() {
        vispro.getTblproduc().setDefaultRenderer(Object.class, new Imangentabla());
        vispro.getTblproduc().setRowHeight(100);
        DefaultTableModel ta;
        ta = (DefaultTableModel) vispro.getTblproduc().getModel();
        ta.setNumRows(0);
        List<Productos> lisproduc = modelpro.listarproductos();
        Holder<Integer> i = new Holder<>(0);
        lisproduc.stream().forEach(q -> {
            ta.addRow(new Object[9]);//cantidad de columna
            vispro.getTblproduc().setValueAt(q.getId_producto(), i.value,0);
            vispro.getTblproduc().setValueAt(q.getNom_producto(), i.value,1);
           vispro.getTblproduc().setValueAt(q.getPrecio_producto(), i.value, 2);
            vispro.getTblproduc().setValueAt(q.getCantidad_producto(), i.value,3);
            vispro.getTblproduc().setValueAt(q.getMarcar_producto(), i.value, 4);
           vispro.getTblproduc().setValueAt(q.getId_empleado(), i.value,6);
            vispro.getTblproduc().setValueAt(q.getId_bodega(), i.value,7);
            Image foto = q.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(nimg); 
                DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                render.setIcon(icon);
                vispro.getTblproduc().setValueAt(new JLabel(icon), i.value, 5);
            } else {
                vispro.getTblproduc().setValueAt(null, i.value, 5);
            }
            i.value++;
        });
        
    }

    private void crear() {
        System.out.println("1");
        if (vispro.getDialog_Crear().getName() == "crear") {
            String id = vispro.getTxtidproducto().getText();
            String nom = vispro.getTxtnom_pro().getText();
            String marca= vispro.getTxtmarca().getText();
            String precio = vispro.getTxtpreciopro().getText();
            String cant = vispro.getSnipercanti().getValue().toString();
            String idEM = vispro.getTxtid_empleado().getText();
            String idBO = vispro.getTxtidbodega().getText();

            Modelo_productos mopro = new Modelo_productos();
            mopro.setId_producto(Integer.parseInt(id));
            mopro.setNom_producto(nom);
            mopro.setMarcar_producto(marca);
            mopro.setPrecio_producto(Double.parseDouble(precio));
            mopro.setCantidad_producto(Integer.parseInt(cant));
            mopro.setId_empleado(Integer.parseInt(idEM));
            mopro.setId_bodega(Integer.parseInt(idBO));
            System.out.println("2");
            try {
                //Foto
                FileInputStream img = new FileInputStream(jfch.getSelectedFile());
                int largo = (int) jfch.getSelectedFile().length();
                mopro.setImagen(img);
                mopro.setLargo(largo);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Controlador_productos.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("3");

            if (mopro.crearprocduc()) {
                vispro.getDialog_Crear().setVisible(false);
                JOptionPane.showMessageDialog(vispro, "PRODUCTO Creado Satisfactoriamente");
            } else {
                JOptionPane.showMessageDialog(vispro, "No se pudo crear al producto");
            }
        } else {
            Modelo_productos p = new Modelo_productos();
            String id = vispro.getTxtidproducto().getText();
            String nom = vispro.getTxtnom_pro().getText();
            String descrip = vispro.getTxtmarca().getText();
            String precio = vispro.getTxtpreciopro().getText();
            String cant = vispro.getSnipercanti().getValue().toString();
            String idem = vispro.getTxtid_empleado().getText();
            String idbo = vispro.getTxtidbodega().getText();

            p.setId_producto(Integer.parseInt(id));
            p.setNom_producto(nom);
            p.setMarcar_producto(descrip);
            p.setPrecio_producto(Double.parseDouble(precio));
            p.setCantidad_producto(Integer.parseInt(cant));
            p.setId_empleado(Integer.parseInt(idem));
            p.setId_bodega(Integer.parseInt(idbo));

            if (jfch == null) {
                if (p.editarpro(id)) {
                    JOptionPane.showMessageDialog(vispro, "PRODUCTO MMODIFICADO");
                } else {
                    JOptionPane.showMessageDialog(vispro, "Se a producido un error al modificar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {

                try {
                    //Foto
                    FileInputStream img = new FileInputStream(jfch.getSelectedFile());
                    int largo = (int) jfch.getSelectedFile().length();
                    p.setImagen(img);
                    p.setLargo(largo);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (p.edipro(id)) {
                }

            }
        }
    }

}
