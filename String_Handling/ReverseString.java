import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = reverse(str);
        System.out.println(ans);
        sc.close();
    }
    public static String reverse(String str){
        char[] arr = str.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}
