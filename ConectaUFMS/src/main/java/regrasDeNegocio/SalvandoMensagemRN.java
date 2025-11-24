/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regrasDeNegocio;

import Vo.VoMensagem;
import persistenciaMongoDB.SalvandoMensagemPersistencia;


/**
 *
 * @author Usuario
 */
public class SalvandoMensagemRN {
    
    public SalvandoMensagemRN(VoMensagem mensagem){
        String resultado = SalvandoMensagemPersistencia.salvar(mensagem);
        System.out.println(resultado);
    }
}
