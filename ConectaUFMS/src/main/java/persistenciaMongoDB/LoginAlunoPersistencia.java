/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import Vo.VoLoginAluno;
import com.mongodb.MongoException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class LoginAlunoPersistencia {

    private static MongoCollection<Document> getColecao() {
        MongoDatabase banco = ConectandoMongoDB.getBanco();
        return banco.getCollection("Usuarios");
    }

    public static void loginAluno(VoLoginAluno loginAluno) {

        try {
            MongoCollection<Document> colecao = getColecao();

            Document usuario = new Document("email", loginAluno.getEmail());
            Document resultado = colecao.find(usuario).first();

            String[] resultadoString;

            if (resultado != null) {
                resultadoString = new String[]{
                    resultado.getString("nome"),
                    resultado.getString("email"),
                    resultado.getString("senha"),
                    resultado.getString("status")
                };

            } else {
                resultadoString = new String[]{"Usuario não existente"};
            }

            loginAluno.setLoginBanco(resultadoString);
            loginAluno.setNome(resultadoString[0]);

        } catch (Exception e) {
            System.out.println("Erro fazer login no banco");

        }

    }

    public static void atualizarStatus(VoLoginAluno loginAluno) {
        try {
            MongoCollection<Document> colecao = getColecao();

            String emailDono = loginAluno.getEmail();
            String novoStatus = loginAluno.getStatus();
            UpdateResult resultado = colecao.updateOne(
                    Filters.eq("email", emailDono),
                    Updates.set("status", novoStatus)
            );

            System.out.println("Documentos encontrados: " + resultado.getMatchedCount());
            System.out.println("Documentos modificados: " + resultado.getModifiedCount());

        } catch (MongoException e) {
            System.err.println("Erro ao acessar o MongoDB: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }

    }

    public static String verificandoStatus(String emailDestinatario) {
        try {
            MongoCollection<Document> colecao = getColecao();
            Document status = new Document("email", emailDestinatario);
            Document resultado = colecao.find(status).first();

            if (resultado == null){
                return null;
            }
            
            return resultado.getString("status");

        } catch (Exception e) {
            return null;
        }
    }

}
