package pl.mongo;

import com.mongodb.MongoClient;

public class MongoConnectionExample {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient();
        for (String databaseName : mongoClient.listDatabaseNames()){
            System.out.println(databaseName);
        }
    }
}
