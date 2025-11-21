/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistenciaMongoDB;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author Usuario
 */
public class ConectandoMongoDB {

    private static final String uri = "mongodb+srv://conectaufms:root@cluster0.n4pjldq.mongodb.net/?appName=Cluster0";
    private static  MongoDatabase banco;
    private static MongoClient client;

    public static MongoDatabase conectar(){
        try {
            client = MongoClients.create(uri);
            banco = client.getDatabase("ConectaUFMS");
            return banco;
        } catch (Exception e) {
            return null;
        }
    }
    
}
