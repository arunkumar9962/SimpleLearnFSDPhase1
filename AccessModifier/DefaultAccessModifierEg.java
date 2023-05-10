package fsd1com.simplearn.accessmodifier;

public class DefaultAccessModifierEg {
	
	public static void main(String[] args) { 
		DefaultAccessModifierEg defaultClassobject = new DefaultAccessModifierEg();
		
		System.out.println("Accessing the default Divide numbers function fromwith in samethe same Package...");
		defaultClassobject.divideNumber()	;
		}
	void divideNumber() {
		int value1 = 10;
		int value2 = 2;
		
		System.out.println("The division of value1 & value2:: " + (value1/value2));
	}
	}


