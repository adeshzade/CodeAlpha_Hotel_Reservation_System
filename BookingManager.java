import java.util.ArrayList;

public class BookingManager {

    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;
    private Payment payment;

    public BookingManager() {

        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
        payment = new Payment();

        initializeRooms();

    }

    private void initializeRooms() {

        // Standard Rooms
        rooms.add(new Room(101, "Standard", 1500));
        rooms.add(new Room(102, "Standard", 1500));
        rooms.add(new Room(103, "Standard", 1500));

        // Deluxe Rooms
        rooms.add(new Room(201, "Deluxe", 2500));
        rooms.add(new Room(202, "Deluxe", 2500));
        rooms.add(new Room(203, "Deluxe", 2500));

        // Suite Rooms
        rooms.add(new Room(301, "Suite", 5000));
        rooms.add(new Room(302, "Suite", 5000));

    }

    // Display All Rooms
    public void displayRooms() {

        System.out.println("\n========== ROOM LIST ==========");

        for (Room room : rooms) {

            System.out.println(room);

        }

    }

    // Search Rooms by Category
    public void searchRoom(String category) {

        boolean found = false;

        System.out.println("\nAvailable " + category + " Rooms");

        for (Room room : rooms) {

            if (room.getCategory().equalsIgnoreCase(category)
                    && room.isAvailable()) {

                System.out.println(room);
                found = true;

            }

        }

        if (!found) {

            System.out.println("No Available Rooms Found.");

        }

    }

    // Find Room using Room Number
    private Room findRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                return room;

            }

        }

        return null;

    }
