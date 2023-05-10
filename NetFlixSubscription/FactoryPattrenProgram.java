package NetFlixSubscription;

import java.util.Scanner;

public class FactoryPattrenProgram {
private static NetflixPlanFactory planFactory;

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	NetflixPlanFactory planFactory = new NetflixPlanFactory();
	
	System.out.println("Enter the Subscription Plan ? ");
	String user_choice = sc.next();
	
	System.out.println("Enter how many months you want to subscribe the plan for? ");
	int n = sc.nextInt();
	
	NetflixPlan plan = planFactory.getPlan(user_choice);
	
	System.out.println("Monthly bill amount for the plan is:: "+ plan.getPrice());
	System.out.println("Overall bill amount for the plan is ::" + plan.getFinalAmount(n));
	
}
}
