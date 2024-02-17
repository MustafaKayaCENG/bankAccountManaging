package bankAutomation;

public class main {

	public static void main(String[] args) {
		checkAccount customer = new checkAccount();
		customer.addClient("Ceys", 647, 500);
		customer.addClient("Niel", 235, 120);
		customer.moneyTransfer(235,647,10);
		customer.moneyDeposit(235, 600);
		customer.moneyWithdraw(647, 200);
		customer.checkBalance(235);
		customer.checkBalance(647);
		customer.showClientAccounts();
	}

}
