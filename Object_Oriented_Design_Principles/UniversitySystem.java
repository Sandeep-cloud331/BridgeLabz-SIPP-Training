import java.util.*;

// Professor class (can exist independently)
class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

// Student class (can enroll in multiple courses)
class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    // Student enrolls in a course (association)
    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(name + " enrolled in " + course.title);
    }
}

// Course class aggregates students and associates with a professor
class Course {
    String title;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String title) {
        this.title = title;
    }

    // Assign professor to the course
    void assignProfessor(Professor prof) {
        this.professor = prof;
        System.out.println("Professor " + prof.name + " assigned to " + title);
    }

    // Add student to the course
    void addStudent(Student student) {
        students.add(student);
    }

    void displayCourseDetails() {
        System.out.println("Course: " + title);
        if (professor != null)
            System.out.println("Taught by: " + professor.name);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}

// Main class to demonstrate system
public class UniversitySystem {
    public static void main(String[] args) {
        // Create students and professors
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Professor p1 = new Professor("Dr. Smith");

        // Create courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Algorithms");

        // Assign professor to course
        c1.assignProfessor(p1);
        c2.assignProfessor(p1);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        // Display course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
