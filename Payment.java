import java.util.Scanner;

public class Payment {

    private Scanner scanner;

    public Payment() {
        scanner = new Scanner(System.in);
    }

    // Process Payment
    public boolean makePayment(Reservation reservation) {

        System.out.println("\n========== PAYMENT ==========");
        System.out.println("Reservation ID : " + reservation.getReservationId());
        System.out.println("Room Number    : " + reservation.getRoom().getRoomNumber());
        System.out.println("Amount         : ₹" + reservation.getRoom().getPrice());

        System.out.println("\nSelect Payment Method");
        System.out.println("1. Credit/Debit Card");
        System.out.println("2. UPI");
        System.out.println("3. Cash");

        System.out.print("Enter Choice : ");
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                payByCard();
                break;

            case 2:
                payByUPI();
                break;

            case 3:
                payByCash();
                break;

            default:
                System.out.println("Invalid Payment Method.");
                return false;

        }

        reservation.setPaymentStatus("Paid");

        System.out.println("\n================================");
        System.out.println("Payment Successful");
        System.out.println("Booking Confirmed");
        System.out.println("================================");

        return true;
    }

    private void payByCard() {

        scanner.nextLine();

        System.out.print("Enter Card Number : ");
        scanner.nextLine();

        System.out.print("Enter Card Holder Name : ");
        scanner.nextLine();

        System.out.print("Enter CVV : ");
        scanner.nextLine();

        System.out.println("Processing Card Payment...");
    }

    private void payByUPI() {

        scanner.nextLine();

        System.out.print("Enter UPI ID : ");
        scanner.nextLine();

        System.out.println("Processing UPI Payment...");
    }

    private void payByCash() {

        System.out.println("Cash Payment Selected.");
    }

}
