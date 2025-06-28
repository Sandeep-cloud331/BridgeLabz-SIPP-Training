import java.util.Scanner;

public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int ans = compare(s1,s2);
        System.out.println(ans);
        sc.close();
    }
    public static int compare(String s1, String s2){
        if(s1==s2) return 0;
        int len = Math.min(s1.length(), s2.length());
		for(int i=0; i<len; i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();
    }
}
