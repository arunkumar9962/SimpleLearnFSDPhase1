package DesignPattern;

public class DynamoDB implements DataBaseConnection {
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to DynamoDB Store::");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the DynamoDB Store Connections:: ");

	}

}
