/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import Vo.VoMensagem;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.or;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class MensagemPersistencia {

    private static MongoCollection<Document> getColecao() {
        MongoDatabase banco = ConectandoMongoDB.getBanco();
        return banco.getCollection("Mensagens");
    }

    public static String salvar(VoMensagem mensagem) {
        try {
            MongoCollection<Document> colecao = getColecao();

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

    public static Object[][] buscar(String emailDono, String emailDestinatario) {

        try {          
            MongoCollection<Document> colecao = getColecao();
            Document filtroDono = new Document("emailDono", emailDono).append("emailDestinatario", emailDestinatario);
            Document filtroDestinatario = new Document("emailDono", emailDestinatario).append("emailDestinatario", emailDono);

            //filtrando e ordenando por hora
            FindIterable<Document> mensagens = colecao.find(or(filtroDono, filtroDestinatario))
                    .sort(new Document("_id", 1)); // 1 = crescente (mais antiga → mais nova)

            List<Object[]> lista = new ArrayList<>();

            for (Document doc : mensagens) {
                String remetente = doc.getString("emailDono");
                String mensagem = doc.getString("mensagem");

                boolean enviadoPeloEmailDono = remetente.equals(emailDono);

                lista.add(new Object[]{mensagem, enviadoPeloEmailDono});

            }
            //converter a lista para Array
            return lista.toArray(Object[][]::new);
            
        } catch (Exception e) {
            return new Object[][]{{"Erro de banco", null}};
        }

    }

}
