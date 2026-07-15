    // Book Room
    public void bookRoom(int roomNumber, Customer customer) {

        Room room = findRoom(roomNumber);

        if (room == null) {
            System.out.println("Room not found.");
            return;
        }

        if (!room.isAvailable()) {
            System.out.println("Sorry! Room is already booked.");
            return;
        }

        // Create Reservation
        Reservation reservation = new Reservation(customer, room);

        // Process Payment
        boolean paymentStatus = payment.makePayment(reservation);

        if (paymentStatus) {

            room.setAvailable(false);

            reservations.add(reservation);

            System.out.println("\n======================================");
            System.out.println("Reservation Successful");
            System.out.println("Reservation ID : " + reservation.getReservationId());
            System.out.println("Customer Name  : " + customer.getName());
            System.out.println("Room Number    : " + room.getRoomNumber());
            System.out.println("Room Category  : " + room.getCategory());
            System.out.println("Amount Paid    : ₹" + room.getPrice());
            System.out.println("======================================");

        } else {

            System.out.println("Payment Failed.");
            System.out.println("Booking Cancelled.");

        }

    }
