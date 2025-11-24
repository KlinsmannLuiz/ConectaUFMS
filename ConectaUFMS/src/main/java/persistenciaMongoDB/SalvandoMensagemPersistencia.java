/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import Vo.VoMensagem;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class SalvandoMensagemPersistencia {

    public static String salvar(VoMensagem mensagem) {
        try {
            MongoDatabase banco = ConectandoMongoDB.conectar();

            if (banco == null) {
                return "Erro: banco não conectado";
            }

            MongoCollection<Document> colecao = banco.getCollection("Mensagens");

            Document mensagemDoc = new Document("emailDono", mensagem.getEmailDono())
                    .append("emailDestinatario", mensagem.getEmailDestinatario())
                    .append("mensagem", mensagem.getMensagem())
                    .append("hora", mensagem.getHora());

            colecao.insertOne(mensagemDoc);
            return "Mensagem Cadastrada";

        } catch (Exception e) {
            return "Erro ao inserir no banco";
        }

    }

}
