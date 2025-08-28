package assignment6;

public class BankAccount {
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber,int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) throws InvalidAmountException {
		if(amount<=0) {
			throw new InvalidAmountException("Enter Proper Amount Value");
		}
		this.balance+=amount;
		System.out.println("Amount: Rs."+amount+"/- is deposited in your account");
		System.out.println("New Balance: Rs."+this.balance+"/-");
	}
	
	public void withdrawal(double amount) throws InsufficientFundsException {
		if(amount>balance) {
			throw new InsufficientFundsException("No Enough Balance");
		}
		this.balance-=amount;
		System.out.println("Amount: Rs."+amount+"/- is Withdrawn from your account");
		System.out.println("New Balance: Rs."+this.balance+"/-");
	}
	
	public void balance() {
		System.out.println("Balance: Rs."+this.balance+"/-");
	}

}



