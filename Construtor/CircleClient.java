package constructor;

public class CircleClient {
	public static void main(String[] args) {
		Circle cr = new Circle();
		System.out.println(cr.radius);
		
		Circle cr1 = new Circle(10);
		System.out.println(cr1.radius);
	}
}