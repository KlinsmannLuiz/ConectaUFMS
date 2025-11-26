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
    private static MongoDatabase banco;
    private static MongoClient client;

    
    public static MongoDatabase getBanco(){
        if (banco == null){
            try {
            client = MongoClients.create(uri);
            banco = client.getDatabase("ConectaUFMS");
            
        } catch (Exception e) {
            banco = null;
        }
    
        }
        return banco;
    }
    
        
   

    public static MongoClient getClient() {
        return client;
    }

}
