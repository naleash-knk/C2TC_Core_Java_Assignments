package assignment4;
import java.util.Scanner;

public class AssignmentFourMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        String csvdata = sc.nextLine();


        int mode = sc.nextInt();
        sc.nextLine(); 

        
        int amnt = 0;
        String walletId;
        String cardHolderName;
        String cardType;
        String ccvNumb;

        
        String[] splittedcsv = csvdata.split(",");

        Payment pay;

        if (splittedcsv.length == 3) {
            TicketBooking.setStageEvent(splittedcsv[0].trim());
            TicketBooking.setCustomer(splittedcsv[1].trim());
            TicketBooking.setNoOfSeats(Integer.parseInt(splittedcsv[2].trim()));

            switch (mode) {
                case 1:
                    System.out.print("Enter amount: ");
                    amnt = sc.nextInt();
                    pay = new CashPayment(amnt);
                    pay.makePayment();
                    break;

                case 2:
                    System.out.print("Enter amount: ");
                    amnt = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter walletId: ");
                    walletId = sc.nextLine();
                    pay = new WalletPayment(amnt, walletId);
                    pay.makePayment();
                    break;

                case 3:
                    System.out.print("Enter card holder name: ");
                    cardHolderName = sc.nextLine();
                    System.out.print("Enter amount: ");
                    amnt = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter card type: ");
                    cardType = sc.nextLine();
                    System.out.print("Enter CCV: ");
                    ccvNumb = sc.nextLine();
                    pay = new CreditCardPayment(cardHolderName, amnt, cardType, ccvNumb);
                    pay.makePayment();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        } else {
            System.out.println("Invalid Form of Data");
        }

        sc.close();
    }
}
