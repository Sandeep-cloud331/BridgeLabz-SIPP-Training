package Collections;

import java.util.*;

public class ReverseList {
	public static void main(String[] args) {
		List<Integer> ll = new ArrayList<>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
	}
}
