/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package visao.TelaMenu;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;

public class JPainelConectaUFMS extends javax.swing.JPanel {

    
    private Image imagemLogo;
    
    public JPainelConectaUFMS() {
        initComponents();
        setOpaque(false);
        carregarImagem();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Color corCima = new Color(0, 82, 122);
        Color corBaixo = new Color(60, 200, 230);

        // Tira o serrilhado das bordas
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //melhora a qualidade visual de imagens transformadas no Java
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);

        GradientPaint gra = new GradientPaint(0, 0, corCima, 0, getHeight(), corBaixo);
        g2d.setPaint(gra);

        g2d.fillRect(0, 0, getWidth(), getHeight()); // ja ta preeenchido todo com o azul(gra)
        
        super.paintComponent(g);
        redimencionandoTamanho(g);
    }

    public void carregarImagem() {
        try {
            imagemLogo = new ImageIcon(getClass().getResource("../imagens/LogoProjeto350px.png")).getImage();

            if (imagemLogo == null) {
                imagemLogo = new ImageIcon("../imagens/LogoProjeto350px.png").getImage();
            }
        } catch (Exception e) {
            System.err.println("Erro ao carregar imagem: " + e.getMessage());
        }
    }

    public void redimencionandoTamanho(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        if (imagemLogo != null) {
            int x = (getWidth() - imagemLogo.getWidth(this)) / 2;
            int y = (getHeight() - imagemLogo.getHeight(this)) / 2;

            g2d.drawImage(imagemLogo, x, y, this);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
