import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        boolean ans = anagram(str, str2);
        System.out.println(ans);
        sc.close();
    }
    public static boolean anagram(String str, String str2){
        if(str.length()!=str2.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for(int i=0; i<str.length(); i++){
            arr1[str.charAt(i)-'a']++;
            arr2[str2.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(arr1[i]!=arr2[i]) return false;
        }
        return true;
    }
}
