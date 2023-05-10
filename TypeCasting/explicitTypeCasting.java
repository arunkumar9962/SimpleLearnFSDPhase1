package fsd1com.simplearn.typecasting;

import java.util.Scanner;

public class explicitTypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("=====================");
		System.out.println("Explicit Type Casting");
		System.out.println("=====================");
		System.out.println("Please Enter Any Number::");
		
		Scanner doubleInput = new Scanner(System.in);
		
		//System.out.println("the data double Input Variable is::"+doubleInput.getClass);
		
		double  doubleValue = doubleInput.nextDouble();
		
		System.out.println("value Taken in input console::" + doubleValue);
		
		float floatValue = (float)doubleValue;
		
		long longValue = (long)doubleValue;
		
		int intValue = (int)doubleValue;
		
		short shortValue = (short)doubleValue;
		
		byte buteValue = (byte)doubleValue;
		
	   System.out.println("Value after explicit typecasting to short::"+ shortValue );
	   System.out.println("Value after typecasting to int::"+ intValue );
	   System.out.println("Value after typecasting to long::"+ longValue );
       System.out.println("Value after typecasting to float::"+ floatValue );
	   System.out.println("Value after typecasting to double::"+ doubleValue );


	}

}
