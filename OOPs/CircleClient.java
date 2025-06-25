
package oops;

public class CircleClient {
	public static void main(String[] args) {
		Circle cr = new Circle();
		cr.radius = 4;
		System.out.println(cr.area());
		System.out.println(cr.circumference());
	}
}
