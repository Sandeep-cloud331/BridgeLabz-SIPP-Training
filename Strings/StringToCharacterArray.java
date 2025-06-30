import java.util.Scanner;

public class StringToCharacterArray {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] arr1 = find(str);
		char[] arr2 = str.toCharArray();
		boolean ans = compare(arr1,arr2);
		System.out.println(ans);
		
	}
	
	public static boolean compare(char[] arr1, char[] arr2) {
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) return false;
		}
		return true;
	}

	public static char[] find(String str) {
		char[] ans = new char[str.length()];
		for(int i=0; i<ans.length; i++) {
			ans[i]=str.charAt(i);
		}
		return ans;
	}
}
