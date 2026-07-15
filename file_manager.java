import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private static final String FILE_NAME = "bookings.txt";

    // Save all reservations to file
    public void saveBookings(ArrayList<Reservation> reservations) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));

            for (Reservation reservation : reservations) {

                writer.write("========================================");
                writer.newLine();

                writer.write("Reservation ID : "
                        + reservation.getReservationId());
                writer.newLine();

                writer.write("Customer Name  : "
                        + reservation.getCustomer().getName());
                writer.newLine();

                writer.write("Mobile         : "
                        + reservation.getCustomer().getMobile());
                writer.newLine();

                writer.write("Email          : "
                        + reservation.getCustomer().getEmail());
                writer.newLine();

                writer.write("Room Number    : "
                        + reservation.getRoom().getRoomNumber());
                writer.newLine();

                writer.write("Room Category  : "
                        + reservation.getRoom().getCategory());
                writer.newLine();

                writer.write("Room Price     : ₹"
                        + reservation.getRoom().getPrice());
                writer.newLine();

                writer.write("Booking Date   : "
                        + reservation.getBookingDate());
                writer.newLine();

                writer.write("Payment Status : "
                        + reservation.getPaymentStatus());
                writer.newLine();

                writer.write("========================================");
                writer.newLine();
                writer.newLine();

            }

            writer.close();

            System.out.println("Booking data saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving bookings: " + e.getMessage());

        }

    }

}
