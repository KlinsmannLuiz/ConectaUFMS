/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import Vo.VoContatos;
import Vo.VoLoginAluno;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class ContatosPersistencia {

    public static void buscandoContatos(VoLoginAluno loginAluno, VoContatos contatosVo) {

        try {
            MongoDatabase banco = ConectandoMongoDB.conectar();
            
            MongoCollection<Document> colecao = banco.getCollection("ContatosSalvos");
            Map<String, Object> filtro = new HashMap<>();
            filtro.put("emailDono", loginAluno.getEmail());
            Document filtroDoc = new Document(filtro);

            FindIterable<Document> contatos = colecao.find(filtroDoc);
            
            List<String[]> arrayContatos = new ArrayList<>();
            
            for(Document doc : contatos){
                
                String emailContato = doc.getString("emailContato");
                String apelido = doc.getString("apelido");
                
                String[] valor = {emailContato, apelido};
                
                arrayContatos.add(valor);
                
            }
            contatosVo.setListaDeContatos(arrayContatos);
            
            
        } catch (Exception e) {
            System.out.println("Erro no hora de buscar os dados");
        }

    }

}
