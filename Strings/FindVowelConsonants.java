import java.util.Arrays;
import java.util.Scanner;

public class FindVowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int[] ans = find(str);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] find(String str) {
        int[] ans = new int[3];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ans[0]++;
                } else {
                    ans[1]++;
                }
            } else {
                ans[2]++;
            }

        }
        return ans;
    }
}
