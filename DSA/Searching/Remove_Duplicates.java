package Searching;
import java.util.*;
public class Remove_Duplicates {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		HashSet<Character> set = new HashSet<Character>();
		String str = "abcdabbbcd";
		for(char ch : str.toCharArray()) {
			if(!set.contains(ch)) {
				sb.append(ch);
			}
			set.add(ch);
		}
		System.out.println(sb.toString());
	}
}
