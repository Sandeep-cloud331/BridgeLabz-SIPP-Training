import java.util.*;
class Report{
	String name;
	int id;
	static int cnt =0;
	Map<String,List<Integer>> report = new HashMap();
	double max;
	String topper;
	

	
	void addMarks(String name, int marks){
		if(!report.containsKey(name)){
			report.put(name, new ArrayList<>());
		}
		
		report.get(name).add(marks);
		averageMarks(name);		
	}
	
	double averageMarks(String name){
		if(!report.containsKey(name)){
			System.out.println("No such student in database");
			return 0;
		}
		double ttl=0;
		
		for(double i : report.get(name)){
			ttl += i;
		}
		if(topper == null) topper = name;
		if(max < ttl){
			max = ttl;
			topper = name;
		}
		
		return ttl/(double)report.get(name).size();
		
	}
	
	String topper(){
		return topper;
	}
	void displayStudents(){
		for(String i : report.keySet()){
			System.out.println(i + " marks is :" + report.get(i));
		}
	}
	
}


class ReportSystem{
	public static void main(String[] args){
		Report obj = new Report();
		obj.addMarks("Sandeep",40);
		obj.addMarks("Sandeep",20);
		obj.addMarks("Nikki",50);
		
		System.out.println(obj.topper());
		obj.displayStudents();
	}
}