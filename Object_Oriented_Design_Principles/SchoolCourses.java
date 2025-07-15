import java.util.*;

// Course class
class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Add a student to this course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    // Display all students in this course
    public void showEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.getName());
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student class
class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll this student in a course
    public void enroll(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this); // update course as well (association)
    }

    // Show all courses this student is enrolled in
    public void viewCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : enrolledCourses) {
            System.out.println("- " + c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}

// School class (aggregates students)
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        students.add(student);
    }

    // Show all students in the school
    public void listStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.getName());
        }
    }
}

// Main class to test the model
public class SchoolCourses {
    public static void main(String[] args) {
        // Create school
        School school = new School("Green Valley School");

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Create students
        Student Ram = new Student("Ram");
        Student Bhavesh = new Student("Bhavesh");

        // Add students to school (Aggregation)
        school.addStudent(Ram);
        school.addStudent(Bhavesh);

        // Students enroll in courses (Association)
        Ram.enroll(math);
        Ram.enroll(science);

        Bhavesh.enroll(math);

        // Display data
        school.listStudents();
        System.out.println();

        Ram.viewCourses();
        Bhavesh.viewCourses();
        System.out.println();

        math.showEnrolledStudents();
        science.showEnrolledStudents();
    }
}
