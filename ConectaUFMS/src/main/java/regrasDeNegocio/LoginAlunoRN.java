/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regrasDeNegocio;

import Vo.VoLoginAluno;
import persistenciaMongoDB.LoginAlunoPersistencia;

/**
 *
 * @author Usuario
 */
public class LoginAlunoRN {

    private boolean usuarioExistente, senhaUsuarioExiste, conectaBancoExiste;

    public boolean isSenhaUsuarioExiste() {
        return senhaUsuarioExiste;
    }

    public boolean isConectaBancoExiste() {
        return conectaBancoExiste;
    }

    public void setConectaBancoExiste(boolean conectaBancoExiste) {
        this.conectaBancoExiste = conectaBancoExiste;
    }

    public void setSenhaUsuarioExiste(boolean senhaUsuarioExiste) {
        this.senhaUsuarioExiste = senhaUsuarioExiste;
    }

    public boolean isUsuarioExistente() {
        return usuarioExistente;
    }

    public void setUsuarioExistente(boolean usuarioExistente) {
        this.usuarioExistente = usuarioExistente;
    }

    public LoginAlunoRN(VoLoginAluno loginAluno) {
        LoginAlunoPersistencia.loginAluno(loginAluno);
        String[] resultadoLogin = loginAluno.getLoginBanco();
        
        setConectaBancoExiste(false);
        
        if (resultadoLogin != null) {
            if ("Usuario não existente".equals(resultadoLogin[0])) {
                setUsuarioExistente(false);
            } else {
                setUsuarioExistente(true);

                if (resultadoLogin[2].equals(new String(loginAluno.getSenha()))) {
                    setSenhaUsuarioExiste(true);
                } else {

                    setSenhaUsuarioExiste(false);
                }
            }
        }else{
            setConectaBancoExiste(true);
        }

    }

}
