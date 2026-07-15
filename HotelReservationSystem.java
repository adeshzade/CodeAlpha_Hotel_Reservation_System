import java.util.Scanner;

public class HotelReservationSystem {

    private BookingManager bookingManager;
    private Scanner scanner;

    public HotelReservationSystem() {
        bookingManager = new BookingManager();
        scanner = new Scanner(System.in);
    }

    public void start() {

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("     HOTEL RESERVATION SYSTEM");
            System.out.println("====================================");
            System.out.println("1. View All Rooms");
            System.out.println("2. Search Room by Category");
            System.out.println("3. Book Room");
            System.out.println("4. Cancel Reservation");
            System.out.println("5. View Booking Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    bookingManager.displayRooms();
                    break;

                case 2:
                    searchRoom();
                    break;

                case 3:
                    bookRoom();
                    break;

                case 4:
                    cancelReservation();
                    break;

                case 5:
                    bookingManager.displayReservations();
                    break;

                case 6:
                    System.out.println("Thank you for using Hotel Reservation System.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

    }

    private void searchRoom() {

        scanner.nextLine();

        System.out.print("Enter Room Category (Standard/Deluxe/Suite): ");

        String category = scanner.nextLine();

        bookingManager.searchRoom(category);

    }

    private void bookRoom() {

        scanner.nextLine();

        System.out.print("Enter Customer Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Mobile Number : ");
        String mobile = scanner.nextLine();

        System.out.print("Enter Email : ");
        String email = scanner.nextLine();

        System.out.print("Enter Room Number : ");
        int roomNo = scanner.nextInt();

        Customer customer = new Customer(name, mobile, email);

        bookingManager.bookRoom(roomNo, customer);

    }

    private void cancelReservation() {

        System.out.print("Enter Reservation ID : ");

        int reservationId = scanner.nextInt();

        bookingManager.cancelReservation(reservationId);

    }

}
