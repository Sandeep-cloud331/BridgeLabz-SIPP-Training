package constructor;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    final double pricePerDay = 50.0;

    // Default constructor
    public CarRental() {
        customerName = "Unknown";
        carModel = "Sedan";
        rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Copy constructor
    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * pricePerDay;
    }

    public void displayRentalDetails() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel +
            ", Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }
}