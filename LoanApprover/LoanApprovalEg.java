package LoanApprover;

public class LoanApprovalEg {
	public static void main (String[] args) {
		Approver asstMgr, Mgr, rtgsMgr;
		Loan loan;
		
		asstMgr = new AssistantBankManager();
		Mgr = new BankManger();
		rtgsMgr = new RTGSManager();
		
		asstMgr.passToSuccessor(Mgr);
		Mgr.passToSuccessor(rtgsMgr);
		
		loan = new Loan("2021l-1234", 4000000, "ARUN");
	asstMgr.processRequest(loan);
		
		loan = new Loan("2021l-1345", 2000000, "Kumar");
		asstMgr.processRequest(loan);
		
		loan = new Loan("2021l-1235", 500000, "asvl");
		asstMgr.processRequest(loan);
	}

}
