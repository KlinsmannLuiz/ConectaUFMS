/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vo;

import java.util.List;

public class VoContatos {
    
    private String nome, emailContato;
    private static List<String[]>listaDeContatos;    

    public List<String[]> getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(List<String[]> listaDeContatos) {
        VoContatos.listaDeContatos = listaDeContatos;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }
    
    
    
}
