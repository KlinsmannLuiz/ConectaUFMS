/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Usuario
 */
public class VoMensagem {
    
    String emailDono, emailDestinatario, mensagem;

    public String getEmailDono() {
        return emailDono;
    }

    public void setEmailDono(String emailDono) {
        this.emailDono = emailDono;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }
    
    public String getMensagem(){
        return mensagem;
    }
    
    public void setMensagem(String mensagem){
        this.mensagem = mensagem;
    }

    public String getHora() {
        LocalTime tempoExato = LocalTime.now();
        String horario = tempoExato.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        
        return horario;
    }

    
    
    
}
