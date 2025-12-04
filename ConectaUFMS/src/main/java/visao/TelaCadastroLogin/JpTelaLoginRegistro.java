/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao.TelaCadastroLogin;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ToolTipManager;
import javax.swing.UIManager;

/**
 *
 * @author Usuario
 */
public class JpTelaLoginRegistro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(JpTelaLoginRegistro.class.getName());

    /**
     * Creates new form TelaPrincipalLoginRegistro
     */
    public JpTelaLoginRegistro() {
        initComponents();
        configurandoToolTip();
        setLocationRelativeTo(null);
        setTitle("Login");

        JpLogin login = new JpLogin();
        login.setTelaPrincipal(this);

        JpRegistrar registrar = new JpRegistrar();
        jpPainelSlide.setAnimate(5);

        jpPainelSlide.init(login, registrar);
        login.addEventoIrCadastrar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpPainelSlide.show(1);
                setTitle("Cadastrar");
            }

        });

        registrar.addEventoVoltarLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jpPainelSlide.show(0);
                setTitle("Login");
            }

        });
    }

    private void configurandoToolTip() {
        UIManager.put("ToolTip.background", Color.WHITE); // fundo
        UIManager.put("ToolTip.font", new Font("Arial", Font.PLAIN, 12)); // tamanho do texto
        UIManager.put("ToolTip.foreground", new Color(0, 82, 122));             // texto
        UIManager.put("ToolTip.border", BorderFactory.createLineBorder(Color.GRAY)); //Cor da Borda
        ToolTipManager.sharedInstance().setInitialDelay(2000);  // tempo para aparecer
        ToolTipManager.sharedInstance().setDismissDelay(8000); // tempo na tela
        ToolTipManager.sharedInstance().setReshowDelay(1000);   // rapidez ao trocar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        JPainelConectaUFMS = new visao.TelaCadastroLogin.JPainelConectaUFMS();
        JPainelAjuste = new javax.swing.JPanel();
        jPainelBorda = new visao.TelaCadastroLogin.JPainelBorda();
        jpPainelSlide = new visao.TelaCadastroLogin.JPainelSlide();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 600));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        JPainelConectaUFMS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 50, 1, 1));
        JPainelConectaUFMS.setPreferredSize(new java.awt.Dimension(378, 0));

        javax.swing.GroupLayout JPainelConectaUFMSLayout = new javax.swing.GroupLayout(JPainelConectaUFMS);
        JPainelConectaUFMS.setLayout(JPainelConectaUFMSLayout);
        JPainelConectaUFMSLayout.setHorizontalGroup(
            JPainelConectaUFMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );
        JPainelConectaUFMSLayout.setVerticalGroup(
            JPainelConectaUFMSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jPanel1.add(JPainelConectaUFMS);

        JPainelAjuste.setBackground(new java.awt.Color(255, 255, 255));
        JPainelAjuste.setBorder(javax.swing.BorderFactory.createEmptyBorder(60, 50, 60, 50));
        JPainelAjuste.setLayout(new java.awt.BorderLayout());

        jPainelBorda.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 1, 1));
        jPainelBorda.setMaximumSize(new java.awt.Dimension(291, 450));
        jPainelBorda.setMinimumSize(new java.awt.Dimension(291, 450));
        jPainelBorda.setPreferredSize(new java.awt.Dimension(291, 450));
        jPainelBorda.setLayout(new javax.swing.BoxLayout(jPainelBorda, javax.swing.BoxLayout.Y_AXIS));

        jpPainelSlide.setMaximumSize(new java.awt.Dimension(309, 425));
        jpPainelSlide.setMinimumSize(new java.awt.Dimension(309, 425));
        jpPainelSlide.setPreferredSize(new java.awt.Dimension(309, 425));

        javax.swing.GroupLayout jpPainelSlideLayout = new javax.swing.GroupLayout(jpPainelSlide);
        jpPainelSlide.setLayout(jpPainelSlideLayout);
        jpPainelSlideLayout.setHorizontalGroup(
            jpPainelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );
        jpPainelSlideLayout.setVerticalGroup(
            jpPainelSlideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
        );

        jPainelBorda.add(jpPainelSlide);

        JPainelAjuste.add(jPainelBorda, java.awt.BorderLayout.CENTER);

        jPanel1.add(JPainelAjuste);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new JpTelaLoginRegistro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPainelAjuste;
    private visao.TelaCadastroLogin.JPainelConectaUFMS JPainelConectaUFMS;
    private javax.swing.JLayeredPane jLayeredPane1;
    private visao.TelaCadastroLogin.JPainelBorda jPainelBorda;
    private javax.swing.JPanel jPanel1;
    private visao.TelaCadastroLogin.JPainelSlide jpPainelSlide;
    // End of variables declaration//GEN-END:variables

}
