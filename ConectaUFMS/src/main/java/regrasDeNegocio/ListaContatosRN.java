/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regrasDeNegocio;

import Vo.VoContatos;
import Vo.VoLoginAluno;
import persistenciaMongoDB.ContatosPersistencia;

/**
 *
 * @author Usuario
 */
public class ListaContatosRN {
    
    public ListaContatosRN(){
        
        VoContatos contatosVo = new VoContatos();
        VoLoginAluno loginAlunoVo = new VoLoginAluno();
        ContatosPersistencia.buscandoContatos(loginAlunoVo, contatosVo);
        
    }
    
}
