/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import Vo.VoLoginAluno;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

/**
 *
 * @author Usuario
 */
public class LoginAlunoPersistencia {

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

    private static MongoCollection<Document> getColecao() {
        MongoDatabase banco = ConectandoMongoDB.getBanco();
        return banco.getCollection("Usuarios");
    }

}
