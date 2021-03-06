package Controlador;
import Modelo.CLASES.Bodega;
import Modelo.CLASES.Productos;
import Modelo.Modelo_bodega;
import Modelo.Modelo_productos;
import Vista.Vista_productos;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class Controlador_productos {
//se crea un objeto para la fecha, el modelo y vista
    LocalDate fechahoy = LocalDate.now();
    private Modelo_productos modelpro;
    private Vista_productos vispro;
    private JFileChooser jfch;
//constructor
    public Controlador_productos(Modelo_productos modelpro, Vista_productos vispro) {
        this.modelpro = modelpro;
        this.vispro = vispro;
        vispro.setVisible(true);
        cargarproductos();
        vispro.getTxtidproducto().setText(String.valueOf(modelpro.IncrementoIdproducto()));
        vispro.getTxtidproducto().setEditable(false);
        vispro.getTxtidbodega().setEditable(false);
        vispro.getTxtfechahoy().setText(fechahoy + "");
        vispro.getTxtfecha().setText(fechahoy + "");
    }
//metodo pára los botones
    public void iniciaControl() {
        vispro.getBtnCrearServicio().addActionListener(l -> abrirDialogo_pro(3));
        vispro.getBtnEditarServicio().addActionListener(l -> abrirDialogo_pro(4));
        vispro.getBtnexaminar().addActionListener(l -> examifoto());
        vispro.getBtnActualizarServicio().addActionListener(l -> cargarproductos());
        vispro.getBtnAceptar_pro1().addActionListener(l -> guardar());
        vispro.getBtnEditarServicio().addActionListener(l -> editar());
        vispro.getBtnRemoverServicio().addActionListener(l -> eli());
        vispro.getBtnCancelar_pro1().addActionListener(l -> cancelar());
        setEventoKeytyped(vispro.getTxtBuscarServicio());
        vispro.getBtnbuscaridbodega().addActionListener(j -> abrirdialobodega());
        vispro.getBtnacepidbodega().addActionListener(j -> acep());
        sedbucao(vispro.getTxbuscaidbo());
        validarsololetras(vispro.getTxtnom_pro());
        validarsololetras(vispro.getTxtmarca());
        validarsolonumeros(vispro.getTxtpreciopro());
        valicomas(vispro.getTxtpreciopro());

    }
//metodo para buscar una foto en la computadora
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
//metodo para abrir el dialog
    private void abrirDialogo_pro(int ce) {
        String title = null;
        if (ce == 3) {
            limpiardatos();
            title = "Crear nuevo producto";
            vispro.getDialog_Crear().setName("crear");
               vispro.getTxtidproducto().setText(String.valueOf(modelpro.IncrementoIdproducto()));
            vispro.getDialog_Crear().setVisible(true);
        } else {
            int r = vispro.getTablita().getSelectedRow();
            if (r != -1) {
                title = "Editar producto";
                vispro.getDialog_Crear().setName("editar");
                vispro.getDialog_Crear().setVisible(true);
            } else {
            }
        }
        vispro.getDialog_Crear().setLocation(600, 80);
        vispro.getDialog_Crear().setSize(730, 568);
        vispro.getDialog_Crear().setTitle(title);
    }
//metodo para cargar los productos en la tabla
    private void cargarproductos() {
        vispro.getTablita().setDefaultRenderer(Object.class, new Imangentabla());
        vispro.getTablita().setRowHeight(100);
        DefaultTableModel ta;
        ta = (DefaultTableModel) vispro.getTablita().getModel();
        ta.setNumRows(0);
        List<Productos> lisproduc = modelpro.listarproductos();
        Holder<Integer> i = new Holder<>(0);
        lisproduc.stream().forEach(q -> {
            ta.addRow(new Object[9]);//cantidad de columna
            vispro.getTablita().setValueAt(q.getId_producto(), i.value, 0);
            vispro.getTablita().setValueAt(q.getNom_producto(), i.value, 1);
            vispro.getTablita().setValueAt(q.getPrecio_producto(), i.value, 2);
            vispro.getTablita().setValueAt(q.getCantidad_producto(), i.value, 3);
            vispro.getTablita().setValueAt(q.getMarcar_producto(), i.value, 4);
            vispro.getTablita().setValueAt(q.getId_bodega(), i.value, 6);
            Image foto = q.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(nimg);
                DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                render.setIcon(icon);
                vispro.getTablita().setValueAt(new JLabel(icon), i.value, 5);
            } else {
                vispro.getTablita().setValueAt(null, i.value, 5);
            }
            i.value++;
        });

    }
//metodo para crear y editar productos
    private void crear() {
        if (vispro.getDialog_Crear().getName() == "crear") {
            String id = vispro.getTxtidproducto().getText();
            String nom = vispro.getTxtnom_pro().getText();
            String marca = vispro.getTxtmarca().getText();
            String precio = vispro.getTxtpreciopro().getText();
            String cant = vispro.getSnipercanti().getValue().toString();
            String idBO = vispro.getTxtidbodega().getText();
            Modelo_productos mopro = new Modelo_productos();
            mopro.setId_producto(Integer.parseInt(id));
            mopro.setNom_producto(nom);
            mopro.setMarcar_producto(marca);
            mopro.setPrecio_producto(Double.parseDouble(precio));
            mopro.setCantidad_producto(Integer.parseInt(cant));
            mopro.setId_bodega(Integer.parseInt(idBO));
            if (jfch == null) {
                if (mopro.crearprocducsinfoto()) {
                      INCREMENTOCANTIDA(Integer.parseInt(idBO));
                DescargarCantidad(Integer.parseInt(idBO));
                    JOptionPane.showMessageDialog(vispro, "PRODUCTO CREADO");
                  
                } else {
                    JOptionPane.showMessageDialog(vispro, "Se a producido un error al crear  el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                try {
                    //Foto
                    FileInputStream img = new FileInputStream(jfch.getSelectedFile());
                    int largo = (int) jfch.getSelectedFile().length();
                    mopro.setImagen(img);
                    mopro.setLargo(largo);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (mopro.crearprocduc()) {
                INCREMENTOCANTIDA(Integer.parseInt(idBO));
                DescargarCantidad(Integer.parseInt(idBO));    
                vispro.getDialog_Crear().setVisible(false);
                    JOptionPane.showMessageDialog(vispro, "PRODUCTO Creado Satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vispro, "Se a producido un error al crear  el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
              jfch = null;//jfc null
        } else {
            Modelo_productos p = new Modelo_productos();
            String id = vispro.getTxtidproducto().getText();
            String nom = vispro.getTxtnom_pro().getText();
            String descrip = vispro.getTxtmarca().getText();
            String precio = vispro.getTxtpreciopro().getText();
            String cant = vispro.getSnipercanti().getValue().toString();
            String idbo = vispro.getTxtidbodega().getText();
            p.setId_producto(Integer.parseInt(id));
            p.setNom_producto(nom);
            p.setMarcar_producto(descrip);
            p.setPrecio_producto(Double.parseDouble(precio));
            p.setCantidad_producto(Integer.parseInt(cant));
            p.setId_bodega(Integer.parseInt(idbo));
            if (jfch == null) {
                if (p.editarpro(id)) {
                    INCREMENTOCANTIDA(Integer.parseInt(idbo));
                  DescargarCantidad(Integer.parseInt(idbo));
                    JOptionPane.showMessageDialog(vispro, "PRODUCTO MMODIFICADO");
                } else {
                    JOptionPane.showMessageDialog(vispro, "Se a producido un error al modificar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (jfch != null) {
                    try {
                        //Foto
                        FileInputStream img = new FileInputStream(jfch.getSelectedFile());
                        int largo = (int) jfch.getSelectedFile().length();
                        p.setImagen(img);
                        p.setLargo(largo);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Modelo_productos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if (p.edipro(id)) {
                  INCREMENTOCANTIDA(Integer.parseInt(idbo));
     DescargarCantidad(Integer.parseInt(idbo));
                  limpiardatos();
                    vispro.getDialog_Crear().setVisible(false);
                    JOptionPane.showMessageDialog(vispro, "PRODUCTO MMODIFICADO");

                } else {
                    JOptionPane.showMessageDialog(vispro, "Se a producido un error al modificar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
     jfch = null;//jfc null
    }
//metodo para editar y pasar los datos a su componente correspondiete 
    private void editar() {
        List<Productos> lp = modelpro.listarproductos();
        int xx = vispro.getTablita().getSelectedRow();
        if (xx != -1) {
            String id = vispro.getTablita().getValueAt(xx, 0).toString();
            int pro = Integer.parseInt(id);
            vispro.getTxtidproducto().setText(id);
            String nom = vispro.getTablita().getValueAt(xx, 1).toString();
            vispro.getTxtnom_pro().setText(nom);
            String precio = vispro.getTablita().getValueAt(xx, 2).toString();
            vispro.getTxtpreciopro().setText(precio);
            String cant = vispro.getTablita().getValueAt(xx, 3).toString();
            vispro.getSnipercanti().setValue(Integer.parseInt(cant));
            String marca = vispro.getTablita().getValueAt(xx, 4).toString();
            vispro.getTxtmarca().setText(marca);
            String idbo = vispro.getTablita().getValueAt(xx, 6).toString();
            vispro.getTxtidbodega().setText(idbo);
            vispro.getTxtidbodega().setEditable(false);

            for (int i = 0; i < lp.size(); i++) {
                if (lp.get(i).getId_producto() == pro) {
                    if (lp.get(i).getFoto() == null) {
                        vispro.getTxtfoto().setIcon(null);
                    } else {
                        Image ft = lp.get(i).getFoto();
                        Image j = ft.getScaledInstance(234, 194, Image.SCALE_SMOOTH);
                        Icon ic = new ImageIcon(j);
                        vispro.getTxtfoto().setIcon(ic);
                    }
                }
            }

        } else {
                        JOptionPane.showMessageDialog(vispro, "Error debe seleccionar una fila ", "Validación.", JOptionPane.WARNING_MESSAGE);
            vispro.getDialog_Crear().dispose();
        }
    }
//metodo eliminar productos
    private void eli() {
        int i = vispro.getTablita().getSelectedRow();
        if (i != -1) {
            String idpersona = vispro.getTablita().getValueAt(i, 0).toString();
            String cedula = vispro.getTablita().getValueAt(i, 1).toString();
            int result = JOptionPane.showConfirmDialog(vispro, "Esta seguro que desea eliminar al producto con el nombre " + cedula + "?", "ERROR", JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE );
            if (result == JOptionPane.YES_OPTION) {
                if (modelpro.eliminapro(idpersona)) {
                    JOptionPane.showMessageDialog(vispro, "El registro a sido eliminado correctamente de la base de datos.");
                    cargarproductos();
                } else {
                    JOptionPane.showMessageDialog(vispro, "Se ha producido un error al rato de eliminar el registro.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vispro, "Registro cancelado para su eliminación.");
            }
        } else {
            JOptionPane.showMessageDialog(vispro, "Error, usted debe seleccionar un registro de la tabla para proceder a su eliminación.", "Eliminar.", JOptionPane.ERROR_MESSAGE);
        }

    }
//metodo para el boton cancelar si se crea o se edita 
    private void cancelar() {
        limpiardatos();
        vispro.getDialog_Crear().setVisible(false);
    }
//metodo limpiar los componentes 
    private void limpiardatos() {
        vispro.getTxtidbodega().setText("");
        vispro.getTxtnom_pro().setText("");
        vispro.getSnipercanti().setValue(1);
        vispro.getTxtfoto().setIcon(null);
        vispro.getTxtpreciopro().setText("");
        vispro.getTxtmarca().setText("");
    }
//metodo para el boton guardar si se crea o se edita 
    void guardar() {
        if (vispro.getTxtnom_pro().getText().isEmpty() || vispro.getTxtmarca().getText().isEmpty() || vispro.getTxtpreciopro().getText().isEmpty() || vispro.getTxtidbodega().getText().isEmpty()) {
            JOptionPane.showMessageDialog(vispro, "NO SE PUEDE GUARDAR SI NO SE LLENA TODOS LOS CAMPOS");
        } else {
            crear();
            limpiardatos();
            vispro.getTxtidproducto().setText(String.valueOf(modelpro.IncrementoIdproducto()));
            vispro.getDialog_Crear().setVisible(false);
        }
    }
//metodo para buscar productos en la tabla
    private void bus(java.awt.event.KeyEvent evt) {
        vispro.getTablita().setDefaultRenderer(Object.class, new Imangentabla());
        vispro.getTablita().setRowHeight(100);
        DefaultTableModel ta;
        ta = (DefaultTableModel) vispro.getTablita().getModel();
        ta.setRowCount(0);

        List<Productos> lisproduc = modelpro.listarperbusqueda(vispro.getTxtBuscarServicio().getText());
        Holder<Integer> i = new Holder<>(0);
        lisproduc.stream().forEach(q -> {
            ta.addRow(new Object[9]);//cantidad de columna
            vispro.getTablita().setValueAt(q.getId_producto(), i.value, 0);
            vispro.getTablita().setValueAt(q.getNom_producto(), i.value, 1);
            vispro.getTablita().setValueAt(q.getPrecio_producto(), i.value, 2);
            vispro.getTablita().setValueAt(q.getCantidad_producto(), i.value, 3);
            vispro.getTablita().setValueAt(q.getMarcar_producto(), i.value, 4);
            vispro.getTablita().setValueAt(q.getId_bodega(), i.value, 6);
            Image foto = q.getFoto();
            if (foto != null) {
                Image nimg = foto.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                ImageIcon icon = new ImageIcon(nimg);

                DefaultTableCellRenderer render = new DefaultTableCellRenderer();
                render.setIcon(icon);
                vispro.getTablita().setValueAt(new JLabel(icon), i.value, 5);
            } else {
                vispro.getTablita().setValueAt(null, i.value, 5);
            }
            i.value++;
        });

    }
//aqui se llama al metodo buscar para el evento keytype
    private void setEventoKeytyped(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                bus(e);
            }
        });
    }
//-----------separacion de bodegas -----------------------------------------------------------------------------
//carga todas las bodegas en la tabla
    private void cargarbodegas() {
        DefaultTableModel ta;
        ta = (DefaultTableModel) vispro.getTblabodega().getModel();
        ta.setNumRows(0);
        List<Bodega> lisbo = modelpro.listarbodegas();
        Holder<Integer> i = new Holder<>(0);
        lisbo.stream().forEach(q -> {
            ta.addRow(new Object[5]);//cantidad de columna
            vispro.getTblabodega().setValueAt(q.getIdbodega(), i.value, 0);
            vispro.getTblabodega().setValueAt(q.getNumero(), i.value, 1);
            vispro.getTblabodega().setValueAt(q.getCantidad(), i.value, 2);
            vispro.getTblabodega().setValueAt(q.getEspacio(), i.value, 3);
            i.value++;
        });
    }
//abre el dialog de bodegas 
    private void abrirdialobodega() {
        vispro.getDialogbodega().setLocationRelativeTo(vispro);
        vispro.getDialogbodega().setSize(730, 560);
        vispro.getDialogbodega().setLocation(600, 80);
        vispro.getDialogbodega().setTitle("BODEGAS");
        vispro.getDialogbodega().setVisible(true);
        cargarbodegas();
    }
//pasa los datos necesarios para la creacion de productos 
    private void datospasar() {
        List<Bodega> lp = modelpro.listarbodegas();
        int xx = vispro.getTblabodega().getSelectedRow();
        if (xx != -1) {
            String id = vispro.getTblabodega().getValueAt(xx, 0).toString();
            //int pro = Integer.parseInt(id);
            vispro.getTxtidbodega().setText(id);
            int m = Integer.parseInt(vispro.getTblabodega().getValueAt(xx, 3).toString());
            SpinnerNumberModel n = new SpinnerNumberModel();
            n.setMaximum(m);
            vispro.getSnipercanti().setModel(n);

            vispro.getTxtidbodega().setEditable(false);
        } else {
            JOptionPane.showMessageDialog(vispro, "Error debe seleccionar una fila ", "Validación.", JOptionPane.WARNING_MESSAGE);
            vispro.getDialogbodega().dispose();
        }
        vispro.getDialogbodega().setVisible(false);
    }
//metodo para el boton aceptar 
    void acep() {
        datospasar();
    }
//metodo buscar bodegas 
private void busbo(java.awt.event.KeyEvent evt) {
        DefaultTableModel ta;
        ta = (DefaultTableModel) vispro.getTblabodega().getModel();
        ta.setRowCount(0);
        List<Bodega> lisbo = modelpro.listarperbusquedabodega(vispro.getTxbuscaidbo().getText());
        Holder<Integer> i = new Holder<>(0);
        lisbo.stream().forEach(q -> {
            ta.addRow(new Object[5]);//cantidad de colu¿mna
            vispro.getTblabodega().setValueAt(q.getIdbodega(), i.value, 0);
            vispro.getTblabodega().setValueAt(q.getNumero(), i.value, 1);
            vispro.getTblabodega().setValueAt(q.getCantidad(), i.value, 2);
            vispro.getTblabodega().setValueAt(q.getEspacio(), i.value, 3);
            i.value++;
        });
    }
//aqui se llama al metodo buscar para el evento keytype
    private void sedbucao(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                busbo(e);
            }
        });
    }
//----------------VALIDACIONES----------------
// metodo validacion solo letras
    private void txletras(java.awt.event.KeyEvent evt) {
        char vali = evt.getKeyChar();
        if (Character.isDigit(vali)) {
            vispro.getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, " ingrese solo letras  ");
        }
    }
//evento para poner la validacion
    private void validarsololetras(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                txletras(e);
            }
        });
    }
// metodo validacion solo numeros
    private void validarnum(java.awt.event.KeyEvent evt) {
        //Validarcedtamaño(visper.getIdper().getText(),10, evt);
        char vali = evt.getKeyChar();
        if (Character.isLetter(vali)) {
            vispro.getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, " ingrese solo numeros  ");
        }
    }
//evento para poner la validacion
    private void validarsolonumeros(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                validarnum(e);
            }
        });
    }
    
    private void validarnocomas(java.awt.event.KeyEvent evt) {
        char vali = evt.getKeyChar();
        if(vali == ','){
            vispro.getToolkit().beep();
            evt.consume();  
            JOptionPane.showMessageDialog(null, "NO SE PUEDE PONER COMAS");
        }
    }
        private void valicomas(JTextField txt) {
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                validarnocomas(e);
            }
        });
    }
//-------------------------------------------------
     //METODO PARA SUBIR LA CANTIDAD DE PRODUCTOS
     private void INCREMENTOCANTIDA(int idbo){
        Modelo_bodega modb = new Modelo_bodega();
        List<Bodega> listbod = modb.listarbodegas();
        for (int i = 0; i < listbod.size(); i++) {
            if(listbod.get(i).getIdbodega() == idbo){
                int cantidad = listbod.get(i).getCantidad();
                int cantv = Integer.parseInt(vispro.getSnipercanti().getValue().toString());
                int nuevac = cantidad+cantv;
                modb.setCantidad(nuevac);
                if(modb.modificarBodegaCant(idbo)){
                    System.out.println("positivo");
                }
            }
            
        }
    }
 //METODO PARA BAJAR LA CANTIDAD DE ESPACIO
   private void DescargarCantidad(int idbo){
        Modelo_bodega modbo = new Modelo_bodega();
        List<Bodega> listbod = modbo.listarbodegas();
        for (int i = 0; i < listbod.size(); i++) {
            if(listbod.get(i).getIdbodega() == idbo){
                int espacioBG = listbod.get(i).getEspacio();
                System.out.println("-->"+espacioBG);
                int cantsp = Integer.parseInt(vispro.getSnipercanti().getValue().toString());
                int nuevac = espacioBG - cantsp;
                System.out.println("final-->"+nuevac);
                modbo.setEspacio(nuevac);
                if(modbo.modificarBodegaAlmacenamiento(idbo)){
                    System.out.println("positivo");
                }
            }
            
        }
    }
}
