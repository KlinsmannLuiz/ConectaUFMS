/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regrasDeNegocio;

import Vo.VoMensagem;
import persistenciaMongoDB.MensagemPersistencia;


/**
 *
 * @author Usuario
 */
public class MensagemRN {
    
    public void salvandoMensagemRN(VoMensagem mensagem){
        String resultado = MensagemPersistencia.salvar(mensagem);
    }
    
    public Object[][] buscandoMensagens(String emailDono, String emailDestinatario){
        
        Object[][] mensagensConversa = MensagemPersistencia.buscar(emailDono, emailDestinatario);

        return mensagensConversa;
        
    }
}
