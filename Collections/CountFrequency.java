package Collections;

import java.util.*;

public class CountFrequency {
	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
		HashMap<String, Integer> map = new HashMap<>();
		for (String s : fruits) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println(map);
	}
}
