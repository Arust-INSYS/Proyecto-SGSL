/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author DELL
 */
public class Vista_Carga extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Carga
     */
    public Vista_Carga() {
        initComponents();
    }

    public JLabel getLblLoadingTextVC() {
        return LblLoadingTextVC;
    }

    public void setLblLoadingTextVC(JLabel LblLoadingTextVC) {
        this.LblLoadingTextVC = LblLoadingTextVC;
    }

    public JLabel getLblPorcentajeVC() {
        return LblPorcentajeVC;
    }

    public void setLblPorcentajeVC(JLabel LblPorcentajeVC) {
        this.LblPorcentajeVC = LblPorcentajeVC;
    }

    public JProgressBar getProgressLoadingVC() {
        return ProgressLoadingVC;
    }

    public void setProgressLoadingVC(JProgressBar ProgressLoadingVC) {
        this.ProgressLoadingVC = ProgressLoadingVC;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LblPorcentajeVC = new javax.swing.JLabel();
        ProgressLoadingVC = new javax.swing.JProgressBar();
        LblLoadingTextVC = new javax.swing.JLabel();
        LabelImgLogo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LblPorcentajeVC.setForeground(new java.awt.Color(255, 255, 255));
        LblPorcentajeVC.setText("0 %");
        jPanel1.add(LblPorcentajeVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(658, 360, -1, -1));

        ProgressLoadingVC.setForeground(new java.awt.Color(0, 153, 0));
        jPanel1.add(ProgressLoadingVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 384, 700, 10));

        LblLoadingTextVC.setForeground(new java.awt.Color(255, 255, 255));
        LblLoadingTextVC.setText("Loading...");
        jPanel1.add(LblLoadingTextVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 250, -1));

        LabelImgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Servicios_Logo.png"))); // NOI18N
        jPanel1.add(LabelImgLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 250));

        jLabel4.setFont(new java.awt.Font("Brush Script MT", 0, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Welcome too Open Limp");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 380, -1));

        LabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Iconos/Fondo2.jpg"))); // NOI18N
        jPanel1.add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JLabel LabelImgLogo;
    private javax.swing.JLabel LblLoadingTextVC;
    private javax.swing.JLabel LblPorcentajeVC;
    private javax.swing.JProgressBar ProgressLoadingVC;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
