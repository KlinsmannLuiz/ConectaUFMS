/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vo;

import java.util.List;

public class VoContatos {
    
    private static List<String[]>listaDeContatos;    

    // Lista com o emailDestinatario e com o apelido
   
    public List<String[]> getListaDeContatos() {
        return listaDeContatos;
    }

    public void setListaDeContatos(List<String[]> listaDeContatos) {
        VoContatos.listaDeContatos = listaDeContatos;
    }
    
}
