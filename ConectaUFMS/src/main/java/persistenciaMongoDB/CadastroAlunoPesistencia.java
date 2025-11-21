/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import Vo.VoCadastrandoUsuario;
import com.mongodb.MongoWriteException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class CadastroAlunoPesistencia {
    
    public static String cadastroAluno(VoCadastrandoUsuario cadastrandoAluno) {
        try {

            MongoDatabase banco = ConectandoMongoDB.conectar();

            if (banco == null) {
                return "Erro de conexão com o banco";
            }

            MongoCollection<Document> colecao = banco.getCollection("Usuarios");

            Document usuario = new Document("nome", cadastrandoAluno.getNome())
                    .append("email", cadastrandoAluno.getEmail())
                    .append("senha", new String(cadastrandoAluno.getSenha()))
                    .append("status", "offline");

            colecao.insertOne(usuario);
            return "Usuário cadastrado";

        } catch (MongoWriteException e) {
            if (e.getError() != null && e.getError().getCode() == 11000) {
                return "Email já cadastrado!";
            }
            return "Erro ao gravar no banco (WriteException).";

        } catch (Exception e) {
            return "Erro geral no cadastro.";
        }
    }
    
}
    
