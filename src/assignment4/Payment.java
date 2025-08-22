package assignment4;

public class Payment extends TicketBooking {
	private int amount;
	public Payment(int amount) {
		super(getStageEvent(),getCustomer(),getNoOfSeats());
		this.setAmount(amount);
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void makePayment() {
		System.out.println("Stage Event: "+ getStageEvent());
		System.out.println("Customer: "+getCustomer());
		System.out.println("Number of seats: "+getNoOfSeats());
		System.out.println("Amount Rs."+getAmount()+"/- Paid in Cash");
	}
	

}
