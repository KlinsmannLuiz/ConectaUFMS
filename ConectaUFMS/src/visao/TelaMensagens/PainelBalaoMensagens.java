/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package visao.TelaMensagens;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class PainelBalaoMensagens extends JPanel {

    public int getArredondandoBordaCimaDireta() {
        return arredondandoBordaCimaDireta;
    }

    public void setArredondandoBordaCimaDireta(int arredondandoBoraCimaDireta) {
        this.arredondandoBordaCimaDireta = arredondandoBoraCimaDireta;
        repaint();
    }

    public int getArredondandoBordaBaixoDireta() {
        return arredondandoBordaBaixoDireta;
    }

    public void setArredondandoBordaBaixoDireta(int arredondandoBoraBaixoDireta) {
        this.arredondandoBordaBaixoDireta = arredondandoBoraBaixoDireta;
        repaint();
    }

    public int getArredondandoBordaCimaEsquerda() {
        return arredondandoBordaCimaEsquerda;
    }

    public void setArredondandoBordaCimaEsquerda(int arredondandoBoraCimaEsquerda) {
        this.arredondandoBordaCimaEsquerda = arredondandoBoraCimaEsquerda;
        repaint();
    }

    public int getArredondandoBordaBaixoEsquerda() {
        return arredondandoBordaBaixoEsquerda;
    }

    public void setArredondandoBordaBaixoEsquerda(int arredondandoBoraBaixoEsquerda) {
        this.arredondandoBordaBaixoEsquerda = arredondandoBoraBaixoEsquerda;
        repaint();
    }

    private int arredondandoBordaCimaDireta = 0;
    private int arredondandoBordaBaixoDireta = 0;
    private int arredondandoBordaCimaEsquerda = 0;
    private int arredondandoBordaBaixoEsquerda = 0;

    public PainelBalaoMensagens() {
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2d.setColor(getBackground());

        Area area = new Area(criandoBordaCimaEsquerda());
        if (arredondandoBordaCimaDireta > 0) {
            area.intersect(new Area(criandoBordaCimaDireta()));
        }
        if (arredondandoBordaBaixoEsquerda > 0) {
            area.intersect(new Area(criandoBordaBaixoEsquerda()));
        }
        if (arredondandoBordaBaixoDireta > 0) {
            area.intersect(new Area(criandoBordaBaixoDireita()));
        }
        
        g2d.fill(area);

        g2d.dispose();
        super.paintComponent(g);
    }

    //Criando uma formato para que a borda fique arredondada, e depois o paintComponent vai desenhar ele na tela
    public Shape criandoBordaCimaDireta() {
        int altura = getHeight();
        int largura = getWidth();
        int redondaX = Math.min(largura, arredondandoBordaCimaDireta);
        int redondaY = Math.min(altura, arredondandoBordaCimaDireta);
        
        //Cria o painel com todos os cantos arredondados
        Area area = new Area(new RoundRectangle2D.Double(0, 0, largura, altura, redondaX, redondaY));
        
        //preenche toda a aparte da esquerda para a direta até a antes da bora direita
        area.add(new Area(new Rectangle2D.Double(0, 0, largura - redondaX / 2, altura)));
        //parametros do metodo Rectangle2D = Rectangle2D.Double(x, y, largura, altura)
        
        //preenche toda a parte de baixo para cima até a borda direita 
        area.add(new Area(new Rectangle2D.Double(0, redondaY / 2, largura, altura - redondaY / 2)));

        return area;
    }

    public Shape criandoBordaCimaEsquerda() {
        int altura = getHeight();
        int largura = getWidth();
        
        int redondaX = Math.min(largura, arredondandoBordaCimaEsquerda);
        int redondaY = Math.min(altura, arredondandoBordaCimaEsquerda);
        
        Area area = new Area(new RoundRectangle2D.Double(0, 0, largura, altura, redondaX, redondaY));
        
        area.add(new Area(new Rectangle2D.Double(redondaX / 2, 0, largura - redondaX / 2, altura)));
       
        area.add(new Area(new Rectangle2D.Double(0, redondaY / 2, largura, altura - redondaY / 2)));

        return area;
    }

    public Shape criandoBordaBaixoDireita() {
        int altura = getHeight();
        int largura = getWidth();
        
        int redondaX = Math.min(largura, arredondandoBordaBaixoDireta);
        int redondaY = Math.min(altura, arredondandoBordaBaixoDireta);
        
        Area area = new Area(new RoundRectangle2D.Double(0, 0, largura, altura, redondaX, redondaY));
       
        area.add(new Area(new Rectangle2D.Double(0, 0, largura - redondaX / 2, altura)));
        
         area.add(new Area(new Rectangle2D.Double(0, 0, largura, altura - redondaY / 2)));

        return area;
    }

    public Shape criandoBordaBaixoEsquerda() {
        int altura = getHeight();
        int largura = getWidth();
        
        int redondaX = Math.min(largura, arredondandoBordaBaixoEsquerda);
        int redondaY = Math.min(altura, arredondandoBordaBaixoEsquerda);
        
        Area area = new Area(new RoundRectangle2D.Double(0, 0, largura, altura, redondaX, redondaY));
        
        area.add(new Area(new Rectangle2D.Double(redondaY / 2, 0, largura - redondaX / 2, altura)));
        
        area.add(new Area(new Rectangle2D.Double(0, 0, largura, altura - redondaY / 2)));

        return area;
    }
}
