    // Cancel Reservation
    public void cancelReservation(int reservationId) {

        Reservation reservationToRemove = null;

        for (Reservation reservation : reservations) {

            if (reservation.getReservationId() == reservationId) {

                reservation.getRoom().setAvailable(true);
                reservationToRemove = reservation;
                break;

            }

        }

        if (reservationToRemove != null) {

            reservations.remove(reservationToRemove);

            System.out.println("\nReservation cancelled successfully.");
            System.out.println("Room is now available for booking.");

        } else {

            System.out.println("Reservation ID not found.");

        }

    }

    // Display All Reservations
    public void displayReservations() {

        if (reservations.isEmpty()) {

            System.out.println("\nNo reservations found.");
            return;

        }

        System.out.println("\n========== RESERVATION DETAILS ==========");

        for (Reservation reservation : reservations) {

            System.out.println(reservation);

        }

    }

    // Return Reservation List
    public ArrayList<Reservation> getReservations() {

        return reservations;

    }

    // Return Room List
    public ArrayList<Room> getRooms() {

        return rooms;

    }

}
