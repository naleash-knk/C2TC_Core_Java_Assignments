package assignment4;

public class WalletPayment extends Payment{
	private String walletId;
	
	public WalletPayment(int amount, String walletId) {
		super(amount);
		this.setWalletId(walletId);
	}
	
	public void setWalletId(String walletId) {
		this.walletId=walletId;
	}

	public String getWalletId() {
		return walletId;
	}
	
	@Override
	public void makePayment() {
		System.out.println("Stage Event: "+ getStageEvent());
		System.out.println("Customer: "+getCustomer());
		System.out.println("Number of seats: "+getNoOfSeats());
		System.out.println("Amount Rs."+getAmount()+"/- Paid Using Wallet");
		System.out.println("Wallet Number: "+getWalletId());
		
	}
}
