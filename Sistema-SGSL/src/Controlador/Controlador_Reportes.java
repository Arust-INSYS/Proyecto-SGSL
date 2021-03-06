/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion_BD;
import Vista.Vista_Principal;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DELL
 */
public class Controlador_Reportes {

    private Vista_Principal viewP;

    public Controlador_Reportes() {
    }

    public Controlador_Reportes(Vista_Principal viewP) {
        this.viewP = viewP;
    }

    public void IniciarControlReportes() {
        viewP.getJmenuPersonasVP().addActionListener(l -> ImprimirPersonasActivasInactivas());
        viewP.getJmenuPersonasGeneroVP().addActionListener(l -> ImprimirGeneroCantidad());
        viewP.getJmenuClientesVP().addActionListener(l -> ImprimirClientesActivosInactivos());
        viewP.getJmenuClientesMorePedidoVP().addActionListener(l -> ImprimirClienteMorePedidos());
        viewP.getMnEmpleado().addActionListener(l -> ImprimirEmpleadosActivosInactivos());
        viewP.getMnServicio().addActionListener(l -> ImprimirServicios());
        viewP.getjMenuproductosvp().addActionListener(l -> ImprimiPRODUCTOS());
        viewP.getjMenubodegvb().addActionListener(l -> ImprimiBODEGA());
        viewP.getJmenuProductosTopCVP().addActionListener(l -> ImprimirProductosMascaros());
        viewP.getJmenuBodegaEpacioCVP().addActionListener(l -> ImprimirBodegaMasEspacio());
        viewP.getMnsueldoemple().addActionListener(l->ImprimirSueldoEmpleados());
        viewP.getMncostoservi().addActionListener(l->ImprimirCostoServicio());
        viewP.getMnSalir().addActionListener(l->salir());
    }

    //M??todos que nos permiten hacer los reportes de persona general y gr??ficos.
    private void ImprimirPersonasActivasInactivas() {
        String sexo = null;
        String estado = null;
        String[] cade = {"Activos", "Inactivos"};
        String seccion = (String) JOptionPane.showInputDialog(null, "Selecciones el tipo de estado que desea filtrar\n", "ESTADO", JOptionPane.DEFAULT_OPTION, null, cade, cade[0]);
        System.out.println("-->" + seccion);
        if (seccion == null) {

        } else {
            if (seccion.equals("Activos")) {
                estado = "A";
            } else {
                estado = "I";
            }
            Conexion_BD cp = new Conexion_BD();
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/ReportePersonaSGSL.jasper"));
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("EstadoPersona", estado);
                map.put("foto", "Servlog.png");
                JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void ImprimirGeneroCantidad() {

        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/ReporteGeneroSGSL.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //M??todos que nos permiten hacer los reportes de clientes activos e inactivos y los gr??ficos.
    private void ImprimirClientesActivosInactivos() {
        String estado = null;
        String[] cade = {"Activos", "Inactivos"};
        String tipos = (String) JOptionPane.showInputDialog(null, "Selecciones el tipo de estado que desea filtrar\n", "ESTADO", JOptionPane.DEFAULT_OPTION, null, cade, cade[0]);
        System.out.println("-->" + tipos);
        if (tipos == null) {

        } else {
            if (tipos.equals("Activos")) {
                estado = "A";
            } else {
                estado = "I";
            }
            Conexion_BD cp = new Conexion_BD();
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/ReporteClientesSGSL.jasper"));
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("logo", "Servlog.png");
                map.put("estado", estado);
                JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void ImprimirClienteMorePedidos() {

        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/ReporteClientesPedidosSGSL.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //M??todos que nos permiten hacer los reportes de empleados activos e inactivos y los gr??ficos.
    private void ImprimirEmpleadosActivosInactivos() {
        String estado = null;
        String[] cade = {"Activos", "Inactivos"};
        String tipos = (String) JOptionPane.showInputDialog(null, "Selecciones el tipo de estado que desea filtrar\n", "ESTADO", JOptionPane.DEFAULT_OPTION, null, cade, cade[0]);
        System.out.println("-->" + tipos);
        if (tipos == null) {

        } else {
            if (tipos.equals("Activos")) {
                estado = "A";
            } else {
                estado = "I";
            }
            Conexion_BD cp = new Conexion_BD();
            try {
                JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/Repo_emple.jasper"));
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("logo", "Servlog.png");
                map.put("estado", estado);
                JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
                JasperViewer jv = new JasperViewer(jp, false);
                jv.setVisible(true);
            } catch (JRException ex) {
                Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private void ImprimirServicios() {

        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/Repo_Servi.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ImprimiPRODUCTOS() {
        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/reportepro.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void ImprimiBODEGA() {
        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/reportebodega.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private void ImprimirProductosMascaros() {
        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/ReporteProductosGraficoSGSL.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ImprimirBodegaMasEspacio() {
        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/ReporteBodegaMasEspacioSGSL.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ImprimirCostoServicio() {

        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/Rempo_grafico_costoservicio.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void ImprimirSueldoEmpleados() {

        Conexion_BD cp = new Conexion_BD();
        try {
            JasperReport jr = (JasperReport) JRLoader.loadObject(getClass().getResource("/Vista/Reportes/Repo_grafico_sueldoemple.jasper"));
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("logo", "Servlog.png");
            JasperPrint jp = JasperFillManager.fillReport(jr, map, cp.getCon());
            JasperViewer jv = new JasperViewer(jp, false);
            jv.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(Controlador_Reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void salir(){
    System.exit(0);
    }
}
