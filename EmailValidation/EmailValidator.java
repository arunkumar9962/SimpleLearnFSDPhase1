package EmailValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailValidator {

	public static void main(String[] args) {
		
		System.out.println("Please enter your email address::");
		
		Scanner emailInput = new Scanner(System.in);
		
		String inputUserEmail = emailInput.next();
		
		System.out.println("Email Address entered by the user:: " + inputUserEmail);
		
		List<String> emailList = new ArrayList<>();
		emailList.add("abce@gmail.com");
		emailList.add("qwer@hotmail.com");
		emailList.add("asdf@outlook.com");
		emailList.add("zxcv@yahoo.com");
		
		System.out.println("Email Addresses List:: " + emailList);
		
		EmailValidator emailValidator = new EmailValidator();
		
		String emailValidationStatus = emailValidator.checkForValidEmailAddress(inputUserEmail, emailList);
		
		System.out.println(emailValidationStatus);
	}
	
	private String checkForValidEmailAddress(String userEmail, List<String> validEmailList) {
		
		String status;
		for(int index = 0; index < validEmailList.size(); index++) {
		
			if(validEmailList.get(index).equals(userEmail)) {
				
				status = userEmail + " is valid";
				return status;
			}
			
		}
		status = userEmail + " is not valid";
		
		return status;
		
	}
	

}
	
