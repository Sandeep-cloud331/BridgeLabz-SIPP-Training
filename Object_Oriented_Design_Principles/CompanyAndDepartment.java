import java.util.ArrayList;
import java.util.List;

public class CompanyAndDepartment {
    public static void main(String[] args) {
        Company company = new Company("TechIT");
        company.addDepartment("HR").addEmployee("Jitesh");
        company.addDepartment("Computer Engineering").addEmployee("Mayank").addEmployee("Ravi");

        company.display();
        company.delete();
    }
}

// Company class strongly owns Department (Composition)
class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    // Add department and return it for chaining
    public Department addDepartment(String deptName) {
        Department dept = new Department(deptName);
        departments.add(dept);
        return dept;
    }

    // Display all departments and their employees
    public void display() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.display();
        }
    }

    // Delete company (and all contained departments & employees)
    public void delete() {
        departments.clear();
        System.out.println("Company '" + name + "' and all data deleted.");
    }

    // Department cannot exist outside Company
    class Department {
        private String name;
        private List<Employee> employees = new ArrayList<>();

        public Department(String name) {
            this.name = name;
        }

        // Add employee and return department for chaining
        public Department addEmployee(String empName) {
            employees.add(new Employee(empName));
            return this;
        }

        public void display() {
            System.out.println("  Department: " + name);
            for (Employee emp : employees) {
                System.out.println("    Employee: " + emp.name);
            }
        }

        // Employee cannot exist outside Department
        class Employee {
            private String name;

            public Employee(String name) {
                this.name = name;
            }
        }
    }
}
