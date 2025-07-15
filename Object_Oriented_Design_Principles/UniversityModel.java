import java.util.ArrayList;
import java.util.List;

// Faculty class - Aggregation (can exist independently)
class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Faculty: " + name);
    }
}

// Department class - Part of University (Composition)
class Department {
    String deptName;
    List<Faculty> facultyList;

    Department(String deptName) {
        this.deptName = deptName;
        facultyList = new ArrayList<>();
    }

    // Aggregation: Add faculty to this department
    void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Faculty f : facultyList) {
            System.out.println("  - " + f.name); // Faculties linked to this department
        }
    }
}

// University class - Composition with Departments
class University {
    String universityName;
    List<Department> departments;

    University(String name) {
        this.universityName = name;
        departments = new ArrayList<>();
    }

    void addDepartment(Department dept) {
        departments.add(dept);
    }

    void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    void closeUniversity() {
        // Composition: Deleting university deletes its departments
        departments.clear();
        System.out.println("University closed. All departments deleted.");
    }
}

// Main class to demonstrate the relationships
public class UniversityModel {
    public static void main(String[] args) {
        // Faculty can exist independently
        Faculty f1 = new Faculty("Dr. Kriti");
        Faculty f2 = new Faculty("Prof. Ananya");

        // University and departments
        University uni = new University("ABC University");
        Department cs = new Department("Computer Science");
        Department phy = new Department("Physics");

        // Aggregation: Adding faculty to departments
        cs.addFaculty(f1);
        phy.addFaculty(f2);

        // Composition: Adding departments to university
        uni.addDepartment(cs);
        uni.addDepartment(phy);

        // Display structure
        uni.displayUniversity();

        // Faculty can still exist even if not added to any department
        Faculty f3 = new Faculty("Dr. Markram");
        f3.display();

        // Deleting the university (composition: deletes departments)
        uni.closeUniversity();
    }
}
