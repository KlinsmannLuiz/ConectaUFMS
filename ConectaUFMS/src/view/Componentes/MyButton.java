/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.Componentes;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class MyButton extends JButton {

    public MyButton() {

        setColor(Color.WHITE);
        setRadius(20);
        colorOver = new Color(225, 240, 255);
        colorClick = new Color(200, 230, 255);
        borderColor = new Color(0, 82, 122);
        setForeground(new Color(0, 82, 122));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setContentAreaFilled(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
                over = true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
                over = false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (over) {
                    setBackground(colorOver);
                } else {
                    setBackground(color);
                }
            }

        });

    }

    private boolean over; // sobre
    private Color color; // cor
    private Color colorOver; //sobre a cor
    private Color colorClick; //cor do Click
    private Color borderColor; // cor da borda
    private int radius = 0; // raio // arredondamento

    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;

    }

    public Color getColor() {
        return color;

    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }

    public Color getColorOver() {
        return colorOver;
    }

    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }

    public Color getColorClick() {
        return colorClick;
    }

    public void setColorClick(Color colorClick) {
        this.colorClick = colorClick;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override // Método responsável por desenhar (pintar) o conteúdo visual do componente na tela. 
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; // Converte o objeto Graphics padrão para Graphics2D, permitindo desenhos mais avançados

        // Ativa o antialiasing, suavizando as bordas de formas e textos para um visual mais bonito
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define a cor atual como a cor da borda antes de desenhar o contorno do botão
        g2.setColor(borderColor);

        // Desenha o retângulo arredondado que forma a borda externa do botão
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);

        // Define a cor de fundo atual (a cor do botão) para desenhar o interior
        g2.setColor(getBackground());

        // Desenha o retângulo interno (fundo do botão), um pouco menor que a borda para criar o efeito de contorno
        g2.fillRoundRect(1, 1, getWidth() - 2, getHeight() - 2, radius, radius);

        // Chama o método original do JButton para desenhar o texto e ícones do botão sobre o fundo personalizado
        super.paintComponent(g);

    }
}
