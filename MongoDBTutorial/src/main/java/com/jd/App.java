package main.java.com.jd;

import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;
import java.util.Set;

import com.mongodb.*;

/**
 * Hello world!
 *
 */
public class App {
	
	private MongoClient mongo;
	private DB db;
	private DBCollection table;
	
	App() {
		try {
			mongo = new MongoClient("localhost", 27017);
		}
		catch (UnknownHostException e) {
			System.err.println("UnknowhHostException: " + e.getMessage());
			
		}
		setDataBase();
		setCollection();
	}
	
	public void setDataBase() {
		DB db = mongo.getDB("myDatabase");
		this.db = db;
	}
	
	public DB getDataBase() {
		return db;
	}
	
	public void setCollection() {
		this.table = db.getCollection("user");
	}
	
	public DBCollection getCollection() {
		return table;
	}
	
	public void getAllCollections() {
	//public Set<String> getAllCollections() {
		Set<String> tables = db.getCollectionNames();
        for(String coll : tables) {
        	System.out.println(coll);
        }
		//return tables;
	}
	
	public void displayDataBase() {
		//DB db = getDataBase();
		List<String> dbs = mongo.getDatabaseNames();
		for (String db : dbs) {
			System.out.println("get Database: " + db);
		}
	}
	
	public void createCollection() {
		//DBCollection table = getCollection();
		BasicDBObject document = new BasicDBObject();
		
		document.put("name", "jd");
		document.put("age", "31");
		document.put("createdDate", new Date());
		table.insert(document);
	}
	
	public void findRecords() {
		this.table.find();
	}
	
    public static void main( String[] args ) {
    	/*
        System.out.println( "Hello World!" );
        App app1 = new App();
        System.out.println("getDataBase: " + app1.getDataBase());
        System.out.println("getCollection: " + app1.getCollection());
        
        System.out.println("Dislpay all collections from app1 database: ");
        //app1.createCollection();
        app1.getAllCollections();
        //for(String coll : app1.getAllCollections()) {
        //	System.out.println(coll);
        //}
        System.out.println("Dislpay all databases: ");
        app1.displayDataBase();
        */
    	
    	
    	/* database name is "myDatabase"
    	 * collection/table is "user"
    	 * 
    	 */
    	
    	try {
    		// Connect to MongoDB
    		MongoClient mongo = new MongoClient("localhost", 27017);

    		//get database
    		DB db = mongo.getDB("myDatabase");

    		// get collection/table from myDatabase
    		DBCollection table = db.getCollection("user");

    		// create a document to store key and value
    		/*
    		BasicDBObject document = new BasicDBObject();
			document.put("name", "jd");
			document.put("age", "31");
			document.put("createdDate", new Date());
			table.insert(document);
    		 */

    		// Find and display
    		BasicDBObject searchQuery = new BasicDBObject();
    		searchQuery.put("name", "jd");

    		DBCursor cursor = table.find(searchQuery);

    		while (cursor.hasNext()) {
    			System.out.println(cursor.next());
    		}
    		
    		// search document where name="jd" and update it with new values
    		BasicDBObject query = new BasicDBObject();
    		query.put("name", "jd");
    		
    		BasicDBObject newDocument = new BasicDBObject();
    		
    	} catch  (UnknownHostException e) {
    		e.printStackTrace();
    	} catch (MongoException e) {
    		e.printStackTrace();
    	}
    	
    }
}
