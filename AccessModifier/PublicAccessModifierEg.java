package fsd1com.simplearn.accessmodifier;

public class PublicAccessModifierEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 int value1 = 10;
	 int value2 = 20;
	 System.out.println("The Sum of Value1 and Valur2 is::" + (value1 + value2));
	 
	 PublicAccessModifierEg pame = new PublicAccessModifierEg();
	 pame.multiplyNumbers();
	}

	public void multiplyNumbers() {
		
		int value1= 20;
		int value2 = 30;
		
		 System.out.println("The Sum of Value1 and Valur2 is::" + (value1 * value2));
		
		
	}
}
