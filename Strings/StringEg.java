package fsd1com.simplearn.Strings;

public class StringEg {

	public static void main(String[] args) {

		String s = "John";
		System.out.println("S ====>" +s);
		
		String s1= new String ("John");
		System.out.println("S1 ====>" +s1);
		
		System.out.println("Comparasion using double equals :: " + (s == s1));
		System.out.println("Comparasion using double equals :: " + (s.equals(s1)));
	
		String a = "Harry";
		a = a.concat("Potter");
		
		System.out.println("a ====>" +a);
				
		String b = "Potter";
		
		String c = "Potter";
		
		System.out.println("Comparasion using double equals :: " + (b == c));
		System.out.println("Comparasion using double equals :: " + (b.equals(c)));
	
		
		}

}
