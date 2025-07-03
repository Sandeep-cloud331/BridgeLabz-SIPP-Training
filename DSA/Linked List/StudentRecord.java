class Student {
    int rollNo;
    String name;
    int age;
    char grade;
    Student next;

    Student(int rollNo, String name, int age, char grade) {
		
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
		
    }
}
class ListStudent{
	Student head = null;
	Student tail = null;
	
	void addStudent(int rollNo, String name, int age, char grade){
		Student newStudent = new Student(rollNo, name,age,grade);
		if(head == null){
			head = tail = newStudent;
		}else{
			tail.next = newStudent;
			tail = tail.next;
			
		}
	}
	
	void displayStudent(){
		Student temp = head;
		while(temp != null){
			System.out.println("RollNo: " + temp.rollNo + ", Name: " + temp.name +
                               ", Age: " + temp.age + ", Grade: " + temp.grade);
			temp = temp.next;
		}
	}
}
public class StudentRecord{
	public static void main(String[] args) {
		ListStudent studentList = new ListStudent();
		studentList.addStudent(1, "Sandeep", 20, 'A');
        studentList.addStudent(2, "Riya", 21, 'B');	
		studentList.displayStudent();

	}

}
