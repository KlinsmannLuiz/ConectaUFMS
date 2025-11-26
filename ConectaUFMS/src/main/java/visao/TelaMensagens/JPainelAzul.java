/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package visao.TelaMensagens;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author Usuario
 */
public class JPainelAzul extends javax.swing.JPanel {

    /**
     * Creates new form panelAzul
     */
    public JPainelAzul() {
        initComponents();
        setOpaque(false);
    }

    @Override
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        Color corCima = new Color(0, 82, 122);
        Color corBaixo = new Color(60, 200, 230);
        // Tira o serrilhado das bordas
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //melhora a qualidade visual de imagens transformadas no Java
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        GradientPaint gra = new GradientPaint(0, getHeight()/2, corCima, 0, getHeight(), corBaixo);
        g2d.setPaint(gra);

        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 0, 0);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelCapivara1 = new visao.TelaMensagens.JPainelCapivara();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.GridBagLayout());

        jPainelCapivara1.setMaximumSize(new java.awt.Dimension(520, 540));
        jPainelCapivara1.setMinimumSize(new java.awt.Dimension(520, 540));
        jPainelCapivara1.setPreferredSize(new java.awt.Dimension(520, 540));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(8, 136, 183));
        jLabel1.setText("<html><div style='width:250px;'>Bem Vindo ao ConectaUFMS!</div></html>");
        jLabel1.setMaximumSize(new java.awt.Dimension(200, 50));
        jLabel1.setMinimumSize(new java.awt.Dimension(200, 50));
        jLabel1.setPreferredSize(new java.awt.Dimension(200, 50));

        javax.swing.GroupLayout jPainelCapivara1Layout = new javax.swing.GroupLayout(jPainelCapivara1);
        jPainelCapivara1.setLayout(jPainelCapivara1Layout);
        jPainelCapivara1Layout.setHorizontalGroup(
            jPainelCapivara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelCapivara1Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );
        jPainelCapivara1Layout.setVerticalGroup(
            jPainelCapivara1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelCapivara1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        add(jPainelCapivara1, new java.awt.GridBagConstraints());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private visao.TelaMensagens.JPainelCapivara jPainelCapivara1;
    // End of variables declaration//GEN-END:variables
}
