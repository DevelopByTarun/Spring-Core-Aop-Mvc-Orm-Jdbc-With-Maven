package com.app;

import java.net.UnknownHostException;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class App 
{
	public static void main(String[] args) throws UnknownHostException {
		Mongo mongo = new MongoClient();
		DB db = mongo.getDB("database");
		DBCollection employee = db.getCollection("employees");
		DBObject employeeDetails = new BasicDBObject()
		.append("name", "Joe")
		.append("age", 41)
		.append("company", new BasicDBObject().append("name", "ABC"));
		employee.insert(employeeDetails);
		DBCursor cursor = employee.find();
		try {
			while (cursor.hasNext()) {
				DBObject object = cursor.next();
				System.out.println(object);
				employee.remove(object);
			}
		} finally {
			cursor.close();
		}			
	}
}
