/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regrasDeNegocio;

import Vo.VoMensagem;
import java.util.List;
import persistenciaMongoDB.MensagemPersistencia;


/**
 *
 * @author Usuario
 */
public class MensagemRN {
    
    public void salvandoMensagemRN(VoMensagem mensagem){
        String resultado = MensagemPersistencia.salvar(mensagem);
    }
    public Object[][] buscandoMensagensAntigas(String emailDono, String emailDestinatario){
        
        //login do usuario e a conversa que ele esta
        
        //definir o retorno
        Object[][] mensagensConversa = MensagemPersistencia.buscar(emailDono, emailDestinatario);
        
        return mensagensConversa;
        
    }
}
