package LoanApprover;

public class AssistantBankManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
		// TODO Auto-generated method stub
		
	if (loan.getLoanAmount() < 1000000) {
		System.out.println(this.getClass().getSimpleName()+ " Approved Load Request ID:: " + loan.get_loanID() + "For Customer :: " + loan.getCustomerName());
		
	}
	else if(successor != null) {
		successor.processRequest(loan);
	}
	}
}
