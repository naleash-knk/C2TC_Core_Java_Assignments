package assignment4;

public class TicketBooking {
	
	private static String stageEvent;
	private static String customer;
	private static  int noOfSeats;
	
	
	public TicketBooking(String stageEvent, String customer, int noOfSeats) {
		TicketBooking.setStageEvent(stageEvent);
		TicketBooking.setCustomer(customer);
		TicketBooking.setNoOfSeats(noOfSeats);
		
	}
	
	public static void setStageEvent(String stageEvent) {
		TicketBooking.stageEvent = stageEvent;
	}
	
	static public String getStageEvent() {
		return stageEvent;
	}
	
	public static void setCustomer(String customer) {
		TicketBooking.customer = customer;
	}
	
	static public String getCustomer() {
		return customer;
	}
	
	public static void setNoOfSeats(int noOfSeats) {
		TicketBooking.noOfSeats=noOfSeats;
	}
	
	static public int getNoOfSeats() {
		return noOfSeats;
	}
	

}
