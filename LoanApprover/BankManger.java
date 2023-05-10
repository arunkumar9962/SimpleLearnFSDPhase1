package LoanApprover;

public class BankManger extends Approver {

	@Override
	public void processRequest(Loan loan) {
		// TODO Auto-generated method stub
		if(loan.getLoanAmount() < 3000000) {
			System.out.println(this.getClass().getSimpleName()+ "Approver Loan Request ID:: " + loan.get_loanID() + "For Customer = " + loan.getCustomerName());
			
		}
		else if(successor != null) {
			successor.processRequest(loan);
		}
		
	}
	

}
