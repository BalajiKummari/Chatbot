package controllers.mongoConfiguration;

import PlayMorphia.MongoClientFactory;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.typesafe.config.Config;
import play.Configuration;

public class MyMongoClientFactory  extends MongoClientFactory {

    private Configuration config;

    public MyMongoClientFactory(Configuration config) {
        super(config);
        this.config = config;
    }

    public MongoClient createClient() throws Exception {

        MongoClientURI uri = new MongoClientURI(
                "mongodb://anjana:procastinator123@anjana-shard-00-00-iaw9q.mongodb.net:27017,anjana-shard-00-01-iaw9q.mongodb.net:27017,anjana-shard-00-02-iaw9q.mongodb.net:27017/test?ssl=true&replicaSet=Anjana-shard-0&authSource=admin&retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);
        return mongoClient;
    }

    public String getDBName() {
        return config.getString("playmorphia.database");
    }

}