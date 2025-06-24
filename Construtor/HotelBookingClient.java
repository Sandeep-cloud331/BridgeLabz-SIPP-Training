package constructor;

public class HotelBookingClient {
	public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Alice", "Deluxe", 3);
        HotelBooking booking2 = new HotelBooking(booking1);  // Using copy constructor
        HotelBooking booking3 = new HotelBooking();          // Using default constructor

        booking1.displayBooking();
        booking2.displayBooking();
        booking3.displayBooking();
    }
}