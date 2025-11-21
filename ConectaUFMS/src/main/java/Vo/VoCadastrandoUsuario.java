/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vo;

/**
 *
 * @author Usuario
 */
public class VoCadastrandoUsuario {

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getSenha() {
        return senha;
    }

    public void setSenha(char[] senha) {
        this.senha = senha;
    }

    public char[] getConfirSenha() {
        return confirSenha;
    }

    public void setConfirSenha(char[] confirSenha) {
        this.confirSenha = confirSenha;
    }
 
    
    public String getVerificandoCadastroNoBanco() {
        return VerificandoCadastroNoBanco;
    }

    public void setVerificandoCadastroNoBanco(String VerificandoCadastroNoBanco) {
        this.VerificandoCadastroNoBanco = VerificandoCadastroNoBanco;
    }
    
    private String nome, email, VerificandoCadastroNoBanco;
    private char[] senha,confirSenha;
    
    
    public VoCadastrandoUsuario(String nome, String email, char[] senha, char[] confirSenha){
        setNome(nome);
        setEmail(email);
        setSenha(senha);
        setConfirSenha(confirSenha);
    }
}
