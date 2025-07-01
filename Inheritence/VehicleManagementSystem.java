// Superclass
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void showInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface
interface Refuelable {
    void refuel();  // method with no body
}

// Subclass 1: ElectricVehicle
class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging...");
    }
}

// Subclass 2: PetrolVehicle implements interface
class PetrolVehicle extends Vehicle implements Refuelable {
    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    // Implementing method from Refuelable interface
    public void refuel() {
        System.out.println(model + " is refueling with petrol...");
    }
}

// Main Class
public class VehicleManagementSystem {
    public static void main(String[] args) {
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model 3", 250);
        PetrolVehicle honda = new PetrolVehicle("Honda Civic", 220);

        // Electric Vehicle Info
        System.out.println("=== Electric Vehicle ===");
        tesla.showInfo();
        tesla.charge();

        System.out.println();

        // Petrol Vehicle Info
        System.out.println("=== Petrol Vehicle ===");
        honda.showInfo();
        honda.refuel();
    }
}
