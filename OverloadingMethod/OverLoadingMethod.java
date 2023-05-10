package Pritical1;

public class OverLoadingMethod {
	

		public static void main(String[] args) {
			
			OverLoadingMethod methodoverloadobj = new OverLoadingMethod ();
			System.out.println(methodoverloadobj.addition(30 , 20));
			System.out.println(methodoverloadobj.addition(30 , 20 , 40));
			
			System.out.println(methodoverloadobj.multiplication(30 , 20));
			System.out.println(methodoverloadobj.multiplication(30.7 , 20.5 , 40.5));
			
			System.out.println(methodoverloadobj.division(30 , 20));
			System.out.println(methodoverloadobj.division(30 , 20 , 40));
			
			System.out.println(methodoverloadobj.subtraction(30 , 20));
			System.out.println(methodoverloadobj.subtraction(30.7 , 20.5 , 40.5));
		}
			public int addition(int a, int b) {
				System.out.println("Inside addition funtion with 2 parameters :");
			return a+b;
			
			}
			public int addition(int a, int b, int c) {
				System.out.println("Inside addition funtion with 3 parameters :");
				return a+b+c;
			
		}

			public int multiplication(int a, int b) {
				System.out.println("Inside multiplication funtion with 2 parameters :");
				return a*b;
				
			}		
				public double multiplication(double a, double b, double c) {
					System.out.println("Inside multiplication funtion with 3 parameters double :");
					return a*b*c;
				
			}

				public int division(int a, int b) {
					System.out.println("Inside division funtion with 2 parameters  :");
				
					return a/b;
					
				}		
					public double division(double a, double b, double c) {
					System.out.println("Inside division funtion with 3 parameters double :");
						return a/b/c;
					}
				
					public int subtraction(int a, int b) {
						System.out.println("Inside multiplication funtion with 2 parameters  :");
						return a-b;
						
					}		
			    	public double subtraction(double a, double b, double c) {
			    		System.out.println("Inside subtraction funtion with 3 parameters double :");
			    		return a-b-c;
						
				}
	}

				
					
					
				



