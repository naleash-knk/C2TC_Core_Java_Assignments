package assignment6;

public class Assignment5Main {
	
	public static void main(String args[]){
		BankAccount naleash = new BankAccount(322005,50000);
		
		try {
			naleash.deposit(100000);
			naleash.withdrawal(80000);
			naleash.withdrawal(100000);
			naleash.deposit(-1);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}
		finally {
			naleash.balance();
		}
		
	}

}
