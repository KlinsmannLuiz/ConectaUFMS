/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao.Componentes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class MyTextField extends JTextField{
    
   public Color getCorDeFundo() {
        return corDeFundo;
    }

    public void setCorDeFundo(Color corDeFundo) {
        this.corDeFundo = corDeFundo;
    }

    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
        iniciandoBordas();
    }
    
    private Icon imagem;
    private Color corDeFundo = new Color(190, 214, 231);
    
    public MyTextField(){
        setBackground(new Color(200,31,89, 0));
        setOpaque(false);
        setFont(new java.awt.Font("Arial", 0, 14));
        setSelectedTextColor(new Color(242, 248, 252));
        setForeground(new Color(8, 136, 183)); // Cor da Letra
        iniciandoBordas();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        
        int largura = getWidth();
        int altura = getHeight();
        
        Graphics2D g2d = (Graphics2D) g;
        // Tira o serrilhado das bordas
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //melhora a qualidade visual de imagens transformadas no Java
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        
        
        g2d.setColor(getCorDeFundo()); //colocando a cor antes de preencher o retangulo
        g2d.fillRoundRect(0, 0, largura, altura, 10, 10); //preenchendo o retangulo
        
      
        super.paintComponent(g);
        paintIcon(g);
    }
    
    private void paintIcon(Graphics g){
        
        Graphics2D g2d = (Graphics2D) g; 
        
        if(imagem != null){
            Image imagemEmail = ((ImageIcon) imagem).getImage(); 
            int y = (getHeight() - imagem.getIconHeight()) / 2; // centralizando a altura
            g2d.drawImage(imagemEmail, 5, y, this);
        }
        
    }

    private void iniciandoBordas() {
        int esquerda = 5;
        // se não tiver icone, é 5 a borda
        
        if(imagem != null){
            //Colocando imagem
            esquerda = imagem.getIconWidth();
        }
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, esquerda + 10, 5, 5));
    
    }

}
