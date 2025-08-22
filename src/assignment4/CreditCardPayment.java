package assignment4;

public class CreditCardPayment extends Payment {
    private String cardHolderName;
    private String cardType;
    private String ccv;

    public CreditCardPayment(String cardHolderName, int amount, String cardType, String ccv) {
        super(amount);
        this.cardHolderName = cardHolderName;
        this.cardType = cardType;
        this.ccv = ccv;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardType() {
        return cardType;
    }

    public String getCCV() {
        return ccv;
    }

    @Override
    public void makePayment() {
        System.out.println("Stage Event: " + getStageEvent());
        System.out.println("Customer: " + getCustomer());
        System.out.println("Number of seats: " + getNoOfSeats());
        System.out.println("Holder Name: " + getCardHolderName());
        System.out.println("Amount Rs." + getAmount() + "/- Paid Using " + getCardType() + " Card");
        System.out.println("CCV: " + getCCV());
    }
}
