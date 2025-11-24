/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regrasDeNegocio;

import Vo.VoCadastrandoUsuario;
import persistenciaMongoDB.CadastroAlunoPersistencia;

/**
 *
 * @author Usuario
 */
public class CadastrandoAlunoRN {

    private boolean verificandoNomeUsuario = false;
    private boolean verificandoEmail = false;
    private boolean verificandoSenha = false;
    private boolean verificandoConfirmSenha = false;
    
    public boolean isVerificandoNomeUsuario() {
        return verificandoNomeUsuario;
    }

    public void setVerificandoNomeUsuario(boolean verificandoNomeUsuario) {
        //Retorna um true caso as condições forem satisfeitas, ser um false para que na logica ele mostre o painel de verificação certo.
        this.verificandoNomeUsuario = !verificandoNomeUsuario;
    }

    public boolean isVerificandoEmail() {
        return verificandoEmail;
    }

    public void setVerificandoEmail(boolean verificandoEmail) {
        //Retorna um true caso as condições forem satisfeitas, ser um false para que na logica ele mostre o painel de verificação certo.
        this.verificandoEmail = !verificandoEmail;
    }

    public boolean isVerificandoSenha() {
        return verificandoSenha;
    }

    public void setVerificandoSenha(boolean verificandoSenha) {
        //Retorna um true caso as condições forem satisfeitas, ser um false para que na logica ele mostre o painel de verificação certo.
        this.verificandoSenha = !verificandoSenha;
    }

    public boolean isVerificandoConfirmSenha() {
        return verificandoConfirmSenha;
    }

    public void setVerificandoConfirmSenha(boolean verificandoConfirmSenha) {
        //Retorna um true caso as condições forem satisfeitas, ser um false para que na logica ele mostre o painel de verificação certo.
        this.verificandoConfirmSenha = !verificandoConfirmSenha;
    }

    public CadastrandoAlunoRN(VoCadastrandoUsuario cadastrandoAluno) {
        verificandoCadastro(cadastrandoAluno);
        verificandoTodasCondicoes(cadastrandoAluno);
    }

    private void verificandoCadastro(VoCadastrandoUsuario cadastrandoAluno) {
        //Verificando Nome de Usuario
        String nome = cadastrandoAluno.getNome().trim(); // Pega o nome e retira os espaços iniciais e finais
        setVerificandoNomeUsuario(
               (nome.length() >= 3)
                && (nome.length() <= 20)
                && (nome.matches("[A-Za-zÁÉÍÓÚÀÈÌÒÙÂÊÎÔÛÃÕÇáéíóúàèìòùâêîôûãõç ]+"))
        );
        // nome.matches("[A-Za-zÁÉÍÓÚÀÈÌÒÙÂÊÎÔÛÃÕÇáéíóúàèìòùâêîôûãõç ]+") esta verificando se o nome tem esses tipos de caracteres, o '+', significa que pode ter mais de um desses caracteres.

        //Verificando Email
        String email = cadastrandoAluno.getEmail().trim();
        setVerificandoEmail(
                (email.length() > 0)
                && (email.matches("^[A-Za-z0-9._%+-]+@ufms.br$"))
        );
        // ^ -> asignifica que a verificação deve começar do primeiro caracter
        // [A-Za-z0-9._%+-]+ -> aceita qual quer um desses caracteres e o '+' no final significa que pode mais de um caracter
        // @[A-Za-z0-9.-]+ -> obrigatoriamente tem que ter o '@'
        // '\\.' o primeiro barra é para permiter o segundo barra para permitir o ponto;
        // [A-Za-z]{2,} -> significa que pode ter no minimo 2 caracteres.
        // $ -> garante que não pode ter nada depois da string.

        //Verificando senha
        String senha = new String(cadastrandoAluno.getSenha()).trim();
        setVerificandoSenha(senha.length() >= 6);
        
        //Verificando A senha Novamente
        String senhaNovamente = new String(cadastrandoAluno.getConfirSenha());
        setVerificandoConfirmSenha(senha.equals(senhaNovamente));
    }
    
    public void verificandoTodasCondicoes(VoCadastrandoUsuario cadastrandoAluno){
        
        if(!isVerificandoNomeUsuario() && !isVerificandoEmail() && !isVerificandoSenha() && !isVerificandoConfirmSenha()){
           String retornoBanco = CadastroAlunoPersistencia.cadastroAluno(cadastrandoAluno);
           cadastrandoAluno.setVerificandoCadastroNoBanco(  retornoBanco );
        }
    }

}
