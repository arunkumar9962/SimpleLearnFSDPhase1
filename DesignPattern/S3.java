package DesignPattern;

public class S3 implements DataBaseConnection {

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connecting to S3 Store::");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Closing the S3 Store Connections:: ");
	}
	

}
