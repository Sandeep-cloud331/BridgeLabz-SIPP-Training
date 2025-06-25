package oops;

public class Circle {
	int radius;
	public double area() {
		double ans = 3.14*radius*radius;
		return ans;
	}
	public double circumference() {
		return 2*3.14*radius;
	}
	
}