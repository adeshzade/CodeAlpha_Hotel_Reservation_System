public class Room {

    // Attributes
    private int roomNumber;
    private String category;
    private double price;
    private boolean available;

    // Constructor
    public Room(int roomNumber, String category, double price) {
        this.roomNumber = roomNumber;
        this.category = category;
        this.price = price;
        this.available = true;
    }

    // Getters
    public int getRoomNumber() {
        return roomNumber;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display Room Details
    @Override
    public String toString() {

        String status;

        if (available) {
            status = "Available";
        } else {
            status = "Booked";
        }

        return "\n------------------------------"
                + "\nRoom Number : " + roomNumber
                + "\nCategory    : " + category
                + "\nPrice       : ₹" + price
                + "\nStatus      : " + status
                + "\n------------------------------";
    }
}
