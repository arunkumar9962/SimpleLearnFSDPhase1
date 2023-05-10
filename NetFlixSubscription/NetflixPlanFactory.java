package NetFlixSubscription;

public class NetflixPlanFactory {
	
	public NetflixPlan getPlan(String plan) {
		if(plan ==null) {
			return null;
			
		}
		if(plan.equalsIgnoreCase("basic")) {
			return new Basic();
			
		}
		else if(plan.equalsIgnoreCase("Standard")) {
		return new Standard();
		
		}
		else if (plan.equalsIgnoreCase("Premium")) {
			return new Premium();
			
		}
		return null;
		
	}

}
