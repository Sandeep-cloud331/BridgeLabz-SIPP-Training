import java.util.Scanner;

public class CountVowelConsonants {
    public static void main(String[] args) {
        // taking input
        Scanner sc = new Scanner(System.in);

        // assuming that string only contains english characters
        String str = sc.nextLine();
        int[] ans = count(str);
        System.out.println("Number of vowels: " + ans[0]);
        System.out.println("Number of consonants: " + ans[1]);
        sc.close();

    }

    // function for counting the number of vowels and consonants
    public static int[] count(String str) {
        int[] ans = new int[2];
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ans[0]++;
                } else {
                    ans[1]++;
                }
            }

        }
        return ans;

    }
}