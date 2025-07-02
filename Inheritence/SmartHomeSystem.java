// Superclass: General Smart Device
class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Specific Thermostat Device inherit Device class
class Thermostat extends Device {
    double temperatureSetting;

    Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Initialize superclass attributes
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    void displayStatus() {
        super.displayStatus(); // Show base device info
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Driver Class
public class SmartHomeSystem {
    public static void main(String[] args) {
        Thermostat livingRoomThermostat = new Thermostat("THERMO123", "Online", 23.5);
        livingRoomThermostat.displayStatus();
    }
}
