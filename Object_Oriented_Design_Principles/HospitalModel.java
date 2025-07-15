import java.util.*;

// Patient class
class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

// Doctor class
class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    // Communication method showing consultation
    void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.name);
    }
}

// Hospital class containing doctors and patients
class Hospital {
    List<Doctor> doctors = new ArrayList<>();
    List<Patient> patients = new ArrayList<>();

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }
}

// Main class to demonstrate associations
public class HospitalModel {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Creating doctors and patients
        Doctor d1 = new Doctor("Rahul");
        Doctor d2 = new Doctor("Sneha");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Sara");

        // Adding to hospital (association)
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (many-to-many association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
