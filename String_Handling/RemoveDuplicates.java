import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = remove(str);
        System.out.println(ans);
        sc.close();

    }
    public static String remove(String str){
        String ans = "";
        ans+=str.charAt(0);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
}
