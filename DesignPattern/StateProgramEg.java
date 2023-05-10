package DesignPattern;

import java.util.Scanner;

public class StateProgramEg {

	Controller controller;
	
	StateProgramEg(String conn){
		controller = new Controller();
		
		if (conn.equalsIgnoreCase("mongodb")) {
			controller.setMongoDBConnection();
			
		}
		
		else if (conn.equalsIgnoreCase("s3")) {
			controller.setS3Connection();
		}
		
		else if (conn.equalsIgnoreCase("DyanomoDB")) {
			controller.setDynamoDB();
		}
		
		controller.connect();
		controller.close();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the database you want to connect? ");
		String dbName = sc.next();
		new StateProgramEg(dbName);
			
		
	}
}
