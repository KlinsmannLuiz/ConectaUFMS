/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vo;

/**
 *
 * @author Usuario
 */
public class VoLoginAluno {

    private static String email, nome, status = "offline";
    private char[] senha;
    private String[] LoginBanco;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        VoLoginAluno.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        VoLoginAluno.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        VoLoginAluno.email = email;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public String[] getLoginBanco() {
        return LoginBanco;
    }

    public void setLoginBanco(String[] LoginBanco) {
        this.LoginBanco = LoginBanco;
    }

}
