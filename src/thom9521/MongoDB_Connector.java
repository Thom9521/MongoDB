package thom9521;

import com.mongodb.MongoClient;

public class MongoDB_Connector {

    public void connect(){
        try{
            //create a Mongo client
            MongoClient mongo = new MongoClient("localhost", 27017);
            System.out.println("Connection successful to Mongo :D");

        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
