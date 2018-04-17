package thom9521;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB_InsertData {

    MongoClient mongo = new MongoClient("localhost", 27017);
    MongoDatabase database = mongo.getDatabase("users");
    MongoCollection collection = database.getCollection("users");
    Document document = new Document();

    public void insertData(){

        document.put("name", "John Doe");
        document.put("age", 99);
        document.put("gender", "N/A");
        document.put("email", "JohnDoe@email.com");
        document.put("phone", "+45 12 34 56 78");
        document.put("address", "Havnegade 8, 4700 Næstved");

        collection.insertOne(document);


    }
    //Constructor til at indsætte data når constructoren bliver lavet
    public void insertDataEasy(String name, int age, String gender, String email, String phone, String address){
        document.put("name", name);
        document.put("age", age);
        document.put("gender", gender);
        document.put("email", email);
        document.put("phone", phone);
        document.put("address", address);

        collection.insertOne(document);
    }
}
