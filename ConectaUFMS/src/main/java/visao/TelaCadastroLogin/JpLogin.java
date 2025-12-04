package visao.TelaCadastroLogin;

import Vo.VoLoginAluno;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import regrasDeNegocio.LoginAlunoRN;
import visao.TelaMensagens.JpTelaMensagens;

public class JpLogin extends javax.swing.JPanel {

    private VoLoginAluno loginAluno;
    private JpTelaMensagens telaMensagens;
    private static JpTelaLoginRegistro telaPrincipal;

    public JpTelaLoginRegistro getTelaPrincipal() {
        return telaPrincipal;
    }

    public void setTelaPrincipal(JpTelaLoginRegistro telaPrincipal) {
        JpLogin.telaPrincipal = telaPrincipal;
    }

    public JpLogin() {
        initComponents();
        jlCadastrar.setFocusPainted(false);
        jlCadastrar.setBorderPainted(false);
        jlCadastrar.setContentAreaFilled(false);
        jlCadastrar.setOpaque(false);
        jlCadastrar.setBackground(null);
        jlCadastrar.setBorder(null);
    }

    public void addEventoIrCadastrar(ActionListener evt) {
        jlCadastrar.addActionListener(evt);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpPainelCima = new javax.swing.JPanel();
        jlLogin = new javax.swing.JLabel();
        mtfEmailLogin = new visao.Componentes.MyTextField();
        mtfSenhaLogin = new visao.Componentes.MyPasswordField();
        jbBotaoAcessar = new visao.Componentes.MyButton();
        jlSenha = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jpPainelBaixo = new javax.swing.JPanel();
        jlCadastrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(291, 420));

        jpPainelCima.setBackground(new java.awt.Color(255, 255, 255));
        jpPainelCima.setMaximumSize(new java.awt.Dimension(248, 288));
        jpPainelCima.setMinimumSize(new java.awt.Dimension(248, 288));
        jpPainelCima.setPreferredSize(new java.awt.Dimension(291, 288));
        jpPainelCima.setLayout(new java.awt.GridBagLayout());

        jlLogin.setBackground(new java.awt.Color(255, 255, 255));
        jlLogin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jlLogin.setForeground(new java.awt.Color(8, 136, 183));
        jlLogin.setText("Login");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        jpPainelCima.add(jlLogin, gridBagConstraints);

        mtfEmailLogin.setImagem(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Email25px.png"))); // NOI18N
        mtfEmailLogin.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jpPainelCima.add(mtfEmailLogin, gridBagConstraints);

        mtfSenhaLogin.setImagem(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SenhaFechada25px.png"))); // NOI18N
        mtfSenhaLogin.setPreferredSize(new java.awt.Dimension(250, 35));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jpPainelCima.add(mtfSenhaLogin, gridBagConstraints);

        jbBotaoAcessar.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 15, 5, 15));
        jbBotaoAcessar.setText("Acessar");
        jbBotaoAcessar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbBotaoAcessar.setMinimumSize(new java.awt.Dimension(90, 30));
        jbBotaoAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBotaoAcessarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(16, 1, 16, 1);
        jpPainelCima.add(jbBotaoAcessar, gridBagConstraints);

        jlSenha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlSenha.setForeground(new java.awt.Color(8, 136, 183));
        jlSenha.setText("Senha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jpPainelCima.add(jlSenha, gridBagConstraints);

        jlEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlEmail.setForeground(new java.awt.Color(8, 136, 183));
        jlEmail.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 2, 2, 2);
        jpPainelCima.add(jlEmail, gridBagConstraints);

        jpPainelBaixo.setBackground(new java.awt.Color(255, 255, 255));
        jpPainelBaixo.setMaximumSize(new java.awt.Dimension(248, 40));
        jpPainelBaixo.setMinimumSize(new java.awt.Dimension(248, 40));
        jpPainelBaixo.setPreferredSize(new java.awt.Dimension(291, 40));

        jlCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCadastrar.setForeground(new java.awt.Color(8, 136, 183));
        jlCadastrar.setText("Cadastrar");
        jlCadastrar.setBorderPainted(false);
        jlCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPainelBaixoLayout = new javax.swing.GroupLayout(jpPainelBaixo);
        jpPainelBaixo.setLayout(jpPainelBaixoLayout);
        jpPainelBaixoLayout.setHorizontalGroup(
            jpPainelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelBaixoLayout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jlCadastrar)
                .addContainerGap())
        );
        jpPainelBaixoLayout.setVerticalGroup(
            jpPainelBaixoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPainelBaixoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlCadastrar)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPainelCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jpPainelBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpPainelCima, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpPainelBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbBotaoAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBotaoAcessarActionPerformed
        if (!"".equals(mtfEmailLogin.getText()) && !"".equals(String.valueOf(mtfSenhaLogin.getPassword()))) {
            loginAluno = new VoLoginAluno();
            loginAluno.setEmail(mtfEmailLogin.getText());
            loginAluno.setSenha(mtfSenhaLogin.getPassword());

            ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagens/carregando25px.gif"));
            jbBotaoAcessar.setIcon(imagem);
            jbBotaoAcessar.setText("");
            jbBotaoAcessar.setFocusable(false); 
            Color corOver = jbBotaoAcessar.getColorOver();
            Color corClick = jbBotaoAcessar.getColorClick();
            jbBotaoAcessar.setColorOver(Color.WHITE);

            SwingWorker<Void, Void> worker = new SwingWorker<>() {
                LoginAlunoRN loginAlunoRN = new LoginAlunoRN();

                @Override
                protected Void doInBackground() throws Exception {
                    loginAlunoRN.verificandoLoginAlunoRN(loginAluno);
                    return null;
                }

                @Override
                protected void done() {
                    jbBotaoAcessar.setIcon(null);
                    jbBotaoAcessar.setText("Acessar");
                    jbBotaoAcessar.setFocusable(true); 
                    jbBotaoAcessar.setColorOver(corOver);
                    jbBotaoAcessar.setColorClick(corClick);
                    
                    if (!loginAlunoRN.isConectaBancoExiste()) {
                        if (loginAlunoRN.isUsuarioExistente()) {
                            if (loginAlunoRN.isSenhaUsuarioExiste()) {
                                JOptionPane.showMessageDialog(null, "Login Efetuado", "Login", JOptionPane.INFORMATION_MESSAGE);
                                mtfEmailLogin.setText("");
                                mtfSenhaLogin.setText("");
                                
                                loginAluno.setStatus("online");
                                loginAlunoRN.mudarStatus(loginAluno);
                                
                                telaMensagens = new JpTelaMensagens();
                                telaMensagens.setVisible(true);
                                getTelaPrincipal().setVisible(false);

                            } else {
                                JOptionPane.showMessageDialog(null, "Senha Incorreta", "Login", JOptionPane.WARNING_MESSAGE);

                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "Usuario Não Existente", "Login", JOptionPane.ERROR_MESSAGE);

                        }

                    } else {
                        ImageIcon imagem = new ImageIcon(getClass().getResource("/Imagens/wifiFraco30px.png"));
                        JOptionPane.showMessageDialog(null, "Erro de Conexão", "Wifi", JOptionPane.INFORMATION_MESSAGE, imagem);

                    }
                }
            };
            worker.execute();

        }

    }//GEN-LAST:event_jbBotaoAcessarActionPerformed

    private void jlCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlCadastrarActionPerformed

    }//GEN-LAST:event_jlCadastrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private visao.Componentes.MyButton jbBotaoAcessar;
    private javax.swing.JButton jlCadastrar;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JPanel jpPainelBaixo;
    private javax.swing.JPanel jpPainelCima;
    private visao.Componentes.MyTextField mtfEmailLogin;
    private visao.Componentes.MyPasswordField mtfSenhaLogin;
    // End of variables declaration//GEN-END:variables
}
