package Pritical1;

import java.util.Scanner;

public class ArithameticCalculator {

	public static void main(String[] args) {
		        
	    Scanner num1 = new Scanner(System.in);
	   	Scanner num2 = new Scanner(System.in);
	         	
				System.out.println("Enter Number for Airthmetic Calculators...");
				
				float number1 = num1.nextFloat();
				float number2 = num2.nextFloat();
		        
		        System.out.println("First Enter the Number1 : "+ number1);
		        System.out.println("First Enter the Number2 : "+ number2);
		        
		        ArithameticCalculator arthiCalc = new  ArithameticCalculator();
		        
		        float additionResult = arthiCalc.addition(number1,  number2);
		        
		        float subtractionResult = arthiCalc.subtraction(number1,  number2);
		        
		        float multiplicationResult = arthiCalc.multiplication(number1,  number2);
		        
		        float divisionResult = arthiCalc.division(number1,  number2);
		        
		        System.out.println(number1 +" + "+number2 +" = " + (additionResult));
		        
		        System.out.println(number1 +" - "+number2 +" = " + (subtractionResult));
		        
		        System.out.println(number1 +" * "+number2 +" = " + (multiplicationResult));
		        
		        System.out.println(number1 +" / "+number2 +" = " + (divisionResult));
		        
			}
				// for decimal no: calculation use double/float
				public float addition(float num1, float num2) {
				return num1 + num2;
				}
				public float subtraction(float num1, float num2) {
				return num1 - num2;
				}	
				public float multiplication(float num1, float num2) {
				return num1 * num2;
				}	
				//for division need to use double/float
				public float division(float num1, float num2) {
				return num1 / num2;
					// for decimal no: calculation use double/float
					
				}
			}
				

			
