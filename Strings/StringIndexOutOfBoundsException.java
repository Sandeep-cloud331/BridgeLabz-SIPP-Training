import java.util.*;
public class StringIndexOutOfBoundsException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		try {
			for(int i=0; i<=str.length(); i++) {
				System.out.print(str.charAt(i)+ " ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}