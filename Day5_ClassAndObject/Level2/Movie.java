class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }
    void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Seat already booked!");
        }
    }
    void displayTicketDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBooked ? "Booked" : "Available"));
    }

    public static void main(String[] args) {
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame", 12, 250);

        ticket1.displayTicketDetails();
        System.out.println("-------------------");

        ticket1.bookTicket();
        ticket1.displayTicketDetails();
    }
}

