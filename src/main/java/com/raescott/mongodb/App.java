package com.raescott.mongodb;

import com.mongodb.Mongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;
import java.net.UnknownHostException;
import java.util.Set;

/**
 * MongoDB sample application.
 *
 */
public class App {

	public static void main(String[] args) throws UnknownHostException {
		// Create a multi-threaded, thread safe, pool of data connections to a cluster.
		Mongo mongo = new Mongo("localhost", 27017);
		DB db = mongo.getDB("test");

		// Get a list of the collections in the database.
		Set<String> collections = db.getCollectionNames();

		for (String string : collections) {
			System.out.println(string);
		}

		// Clean up resources, dispose of data connections.
		mongo.close();
	}
}
