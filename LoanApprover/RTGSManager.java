package LoanApprover;

public class RTGSManager extends Approver{

	@Override
	public void processRequest(Loan loan) {
		// TODO Auto-generated method stub
		if (loan.getLoanAmount() < 5000000) {
			System.out.println(this.getClass().getSimpleName() + " Approved Laon Request ID ::" + loan.get_loanID() + "for Customer - " + loan.getCustomerName());
			
		}
		else if(successor != null) {
			successor.processRequest(loan);
		}
		
	}

}
