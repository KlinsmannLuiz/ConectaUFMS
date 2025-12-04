/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package visao.TelaCadastroLogin;

import Vo.VoCadastrandoUsuario;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import regrasDeNegocio.CadastrandoAlunoRN;

/**
 *
 * @author Usuario
 */
public class JpRegistrar extends javax.swing.JPanel {

    VoCadastrandoUsuario voCadUsu;

    /**
     * Creates new form jpRegistrar
     */
    public JpRegistrar() {
        initComponents();
        configurandoToolLipComponentes();
        jbVoltarLogin.setFocusPainted(false);
        jbVoltarLogin.setBorderPainted(false);
        jbVoltarLogin.setContentAreaFilled(false);
        jbVoltarLogin.setOpaque(false);
        jbVoltarLogin.setBackground(null);
        jbVoltarLogin.setBorder(null);
        
    }

    public void addEventoVoltarLogin(ActionListener acv) {
        jbVoltarLogin.addActionListener(acv);

    }

    private void configurandoToolLipComponentes() {
        mtbtCadastrar.setToolTipText("Cadastrar");
        mtfUsuario.setToolTipText("Seu nome de usuario");
        mtfEmail.setToolTipText("Preencha com o Email institucial da UFMS");
        mtfSenha.setToolTipText("Senha no minimo 6 caracteres");
        mtfConfirSenha.setToolTipText("Repita sua senha");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel2 = new javax.swing.JPanel();
        jlCadastrar = new javax.swing.JLabel();
        mtfUsuario = new visao.Componentes.MyTextField();
        mtfEmail = new visao.Componentes.MyTextField();
        mtfSenha = new visao.Componentes.MyPasswordField();
        mtfConfirSenha = new visao.Componentes.MyPasswordField();
        mtbtCadastrar = new visao.Componentes.MyButton();
        JlNomeDeUsuario = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlSenhaNovamente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jbVoltarLogin = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(291, 420));
        setMinimumSize(new java.awt.Dimension(291, 420));
        setPreferredSize(new java.awt.Dimension(291, 420));
        setRequestFocusEnabled(false);
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(291, 500000));
        jPanel2.setMinimumSize(new java.awt.Dimension(291, 380));
        jPanel2.setPreferredSize(new java.awt.Dimension(291, 380));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jlCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlCadastrar.setForeground(new java.awt.Color(8, 136, 183));
        jlCadastrar.setText("Cadastrar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(jlCadastrar, gridBagConstraints);

        mtfUsuario.setImagem(new javax.swing.ImageIcon(getClass().getResource("/Imagens/usuario25px.png"))); // NOI18N
        mtfUsuario.setMaximumSize(new java.awt.Dimension(200, 35));
        mtfUsuario.setMinimumSize(new java.awt.Dimension(200, 35));
        mtfUsuario.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(mtfUsuario, gridBagConstraints);

        mtfEmail.setImagem(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Email25px.png"))); // NOI18N
        mtfEmail.setMaximumSize(new java.awt.Dimension(200, 35));
        mtfEmail.setMinimumSize(new java.awt.Dimension(200, 35));
        mtfEmail.setPreferredSize(new java.awt.Dimension(250, 35));
        mtfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtfEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(mtfEmail, gridBagConstraints);

        mtfSenha.setImagem(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SenhaFechada25px.png"))); // NOI18N
        mtfSenha.setMaximumSize(new java.awt.Dimension(200, 35));
        mtfSenha.setMinimumSize(new java.awt.Dimension(200, 35));
        mtfSenha.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(mtfSenha, gridBagConstraints);

        mtfConfirSenha.setImagem(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SenhaFechada25px.png"))); // NOI18N
        mtfConfirSenha.setMaximumSize(new java.awt.Dimension(200, 35));
        mtfConfirSenha.setMinimumSize(new java.awt.Dimension(200, 35));
        mtfConfirSenha.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(mtfConfirSenha, gridBagConstraints);

        mtbtCadastrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 15));
        mtbtCadastrar.setText("Cadastrar");
        mtbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtbtCadastrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(mtbtCadastrar, gridBagConstraints);

        JlNomeDeUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JlNomeDeUsuario.setForeground(new java.awt.Color(8, 136, 183));
        JlNomeDeUsuario.setText("Nome de Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(JlNomeDeUsuario, gridBagConstraints);

        jlEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(8, 136, 183));
        jlEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel2.add(jlEmail, gridBagConstraints);

        jlSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(8, 136, 183));
        jlSenha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(jlSenha, gridBagConstraints);

        jlSenhaNovamente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSenhaNovamente.setForeground(new java.awt.Color(8, 136, 183));
        jlSenhaNovamente.setText("Senha Novamente");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        jPanel2.add(jlSenhaNovamente, gridBagConstraints);

        add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setMaximumSize(new java.awt.Dimension(291, 35));
        jPanel1.setMinimumSize(new java.awt.Dimension(291, 35));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(291, 35));

        jbVoltarLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbVoltarLogin.setForeground(new java.awt.Color(8, 136, 183));
        jbVoltarLogin.setText("Login");
        jbVoltarLogin.setBorderPainted(false);
        jbVoltarLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(jbVoltarLogin)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jbVoltarLogin)
                .addGap(7, 7, 7))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void mtfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mtfEmailActionPerformed

    private void mtbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtbtCadastrarActionPerformed
        voCadUsu = new VoCadastrandoUsuario(
                mtfUsuario.getText(),
                mtfEmail.getText(),
                mtfSenha.getPassword(),
                mtfConfirSenha.getPassword()
        );

        ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagens/carregando25px.gif"));
        mtbtCadastrar.setIcon(imagem);
        mtbtCadastrar.setText("");
        mtbtCadastrar.setFocusable(false);
        Color corOver = mtbtCadastrar.getColorOver();
        Color corClick = mtbtCadastrar.getColorClick();
        mtbtCadastrar.setColorOver(Color.WHITE);

        SwingWorker<Void, Void> worker = new SwingWorker<>() {
            CadastrandoAlunoRN cadastroAluno;
            String resultadoBanco;

            @Override
            protected Void doInBackground() throws Exception {
                cadastroAluno = new CadastrandoAlunoRN(voCadUsu);
                resultadoBanco = voCadUsu.getVerificandoCadastroNoBanco();
                return null;
            }

            @Override
            protected void done() {
                mtbtCadastrar.setIcon(null);
                mtbtCadastrar.setText("Cadastrar");
                mtbtCadastrar.setFocusable(true);
                mtbtCadastrar.setColorOver(corOver);
                mtbtCadastrar.setColorClick(corClick);

                if (cadastroAluno.isVerificandoNomeUsuario()) {
                    JOptionPane.showMessageDialog(null, "O Usuario não pode estar vazio, deve ter no minimo 3 caracteres e menos que 20 caracter, deve ter apenas letras e espaços", "Nome Usuario", JOptionPane.INFORMATION_MESSAGE);
                } else if (cadastroAluno.isVerificandoEmail()) {
                    JOptionPane.showMessageDialog(null, "Email incorreto", "Email", JOptionPane.INFORMATION_MESSAGE);
                } else if (cadastroAluno.isVerificandoSenha()) {
                    JOptionPane.showMessageDialog(null, "Senha deve ter no minimo 6 caracter", "Senha", JOptionPane.INFORMATION_MESSAGE);
                } else if (cadastroAluno.isVerificandoConfirmSenha()) {
                    JOptionPane.showMessageDialog(null, "As senhas devem ser igual", "Senha Errada", JOptionPane.WARNING_MESSAGE);
                } else {
                    if ("Email já cadastrado!".equals(resultadoBanco)) {
                        JOptionPane.showMessageDialog(null, "Email já cadastrado!", "Email Erro", JOptionPane.WARNING_MESSAGE);

                    } else if ("Usuário cadastrado".equals(resultadoBanco)) {
                        JOptionPane.showMessageDialog(null, "DADOS CADASTRADOS", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
                        mtfUsuario.setText("");
                        mtfEmail.setText("");
                        mtfSenha.setText("");
                        mtfConfirSenha.setText("");

                    } else if ("Falha na Conexão (verifique a internet)".equals(resultadoBanco)) {
                        ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagens/wifiFraco30px.png"));
                        JOptionPane.showMessageDialog(null, "Falha na Conexão (verifique a internet)", "WiFi", JOptionPane.INFORMATION_MESSAGE, imagem);

                    } else {
                        JOptionPane.showMessageDialog(null, resultadoBanco, "Erro Banco", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }

        };
        worker.execute();

    }//GEN-LAST:event_mtbtCadastrarActionPerformed

    private void jbVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarLoginActionPerformed

    }//GEN-LAST:event_jbVoltarLoginActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlNomeDeUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbVoltarLogin;
    private javax.swing.JLabel jlCadastrar;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSenhaNovamente;
    private visao.Componentes.MyButton mtbtCadastrar;
    private visao.Componentes.MyPasswordField mtfConfirSenha;
    private visao.Componentes.MyTextField mtfEmail;
    private visao.Componentes.MyPasswordField mtfSenha;
    private visao.Componentes.MyTextField mtfUsuario;
    // End of variables declaration//GEN-END:variables
    

}
