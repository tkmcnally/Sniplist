package util;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import models.*;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import play.Logger;

import java.net.UnknownHostException;

/**
 * Created by Thomas on 5/26/2014.
 */
public class MorphiaUtil {

    private static Datastore datastore;
    private static MongoClient mongoClient;
    private static MongoClientURI mongoClientURI;
    private static Morphia morphia;


    /**
     * Called when the application's Global onStart() method is called.
     * Used to establish a connection to the database.
     */
    public static void start() {
        String configUri = play.Play.application().configuration().getString(Constants.Configuration.MONGO_DB_URI);

        mongoClientURI = new MongoClientURI(configUri);
        morphia = new Morphia();

        mongoClient = null;
        try {
            mongoClient = new MongoClient(mongoClientURI);

            datastore = morphia.createDatastore(mongoClient, mongoClientURI.getDatabase());

            //Gain admin privileges
            datastore.getDB().authenticate(mongoClientURI.getUsername(), mongoClientURI.getPassword());

            mapModels();

            datastore.ensureIndexes();
            datastore.ensureCaps();

            Logger.info("Morphia connection established.");
        } catch (UnknownHostException e) {
            Logger.error("Failed to initialize DB. Could not connect to MongoHQ using:\n '" + mongoClientURI.toString() + "'");
            e.printStackTrace();
        }


    }


    /**
     * Called when the application's Global onStop() method is called.
     * Used to cleanup existing connections.
     */
    public static void shutdown() {
        mongoClient.close();
        Logger.info("Morphia connection closed.");
    }


    /**
     * Maps all classes to the Morphia instance during application initialization,
     * to allow early validation and preparation for the models later in the lifecycle.
     */
    public static void mapModels() {
        //ADD MODELS AS THEY ARE CREATED
        morphia.map(User.class);
        morphia.map(UserPermission.class);
        morphia.map(TokenAction.class);
        morphia.map(SecurityRole.class);
        morphia.map(LinkedAccount.class);
    }

    public static Datastore getDatastore() {
        return datastore;
    }

}
