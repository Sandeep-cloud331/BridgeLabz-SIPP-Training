import java.util.*;
class Student{
	String name;
	int id;
	int ttlMarks;
	static int cnt =0; 
	Map<String,Integer> sMarks = new HashMap<>();
	
	Student(String name){
		this.name = name;
		this.id = ++cnt;
		this.ttlMarks =0;
	}
	
	void addMarks(String subject, int marks){
		sMarks.put(subject,marks);
		ttlMarks+= marks;
	}
	
	void displayMarks(){
		System.out.println(ttlMarks);
	}
}

class StudentData{
	List<Student> studentsList= new ArrayList<>();

	void addStudent(String name){
		Student s = new Student(name);
		studentsList.add(s);
	}
	
	void addMarks(int id,String subject, int mark){
		for(Student i : studentsList){
			if(i.id == id){
				i.addMarks(subject,mark);
				MergeSort.mergeSort(studentsList, 0, studentsList.size() - 1);
				break;
			}
		}
	}
	void displayStudent(){
		for(Student i : studentsList){
			System.out.println("Id : "+i.id+" Name : "+i.name);
		}
	}
	void displayMarksOfStudent(int id){
		for(Student i : studentsList){
			if(i.id == id){
				i.displayMarks();
			}	
		}
	}
	
	void displayRankings(){
		for(int i=1;i<=3;i++){
			System.out.println("Rank "+i + ",Marks :"+ studentsList.get(i-1).ttlMarks + " : "+studentsList.get(i-1).name );
		}
	}
}

class MergeSort {
    static void mergeSort(List<Student> arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    static void merge(List<Student> arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        List<Student> left = new ArrayList<>();
        List<Student> right = new ArrayList<>();

        for (int i = 0; i < n1; i++) left.add(arr.get(start + i));
        for (int j = 0; j < n2; j++) right.add(arr.get(mid + 1 + j));

        int i = 0, j = 0, k = start;

        while (i < n1 && j < n2) {
            if (left.get(i).ttlMarks >= right.get(j).ttlMarks) {
                arr.set(k++, left.get(i++));
            } else {
                arr.set(k++, right.get(j++));
            }
        }

        while (i < n1) arr.set(k++, left.get(i++));
        while (j < n2) arr.set(k++, right.get(j++));
    }
}





class EducationPlatforn{
	public static void main(String[] args){
		StudentData school = new StudentData();
		school.addStudent("Sandeep");
		school.addStudent("Nikhil");
		school.addStudent("Aman");
		school.addStudent("Vishal");

		school.addMarks(1, "Physics", 80);
		school.addMarks(1, "Chemistry", 85);
		school.addMarks(1, "Maths", 90);

		school.addMarks(2, "Physics", 60);
		school.addMarks(2, "Chemistry", 70);
		school.addMarks(2, "Maths", 75);

		school.addMarks(3, "Physics", 95);
		school.addMarks(3, "Chemistry", 85);
		school.addMarks(3, "Maths", 90);

		school.addMarks(4, "Physics", 55);
		school.addMarks(4, "Chemistry", 65);
		school.addMarks(4, "Maths", 60);
		
		
		school.displayRankings();
	}
}