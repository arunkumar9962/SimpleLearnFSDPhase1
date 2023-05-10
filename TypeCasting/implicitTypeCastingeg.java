package fsd1com.simplearn.typecasting;

import java.util.Scanner;

public class implicitTypeCastingeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=====================");
		System.out.println("Implicit Type Casting");
		System.out.println("=====================");
		System.out.println("Please Enter Any Number::");
		
		Scanner byteInput = new Scanner(System.in);
		
		byte byteValue = byteInput.nextByte();
		System.out.println("value Taken in input console::" + byteValue);
		
		short shortValue = byteValue;
		
		int intValue = shortValue;
		
		long longValue = intValue;
		
		float floatValue = longValue;
		
		double doubleValue = floatValue;
		
		System.out.println("Value after typecasting to short::"+ shortValue );
		System.out.println("Value after typecasting to short::"+ intValue );
		System.out.println("Value after typecasting to short::"+ longValue );
		System.out.println("Value after typecasting to short::"+ floatValue );
		System.out.println("Value after typecasting to short::"+ doubleValue );

	}

}
