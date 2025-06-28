import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char charToRemove = sc.next().charAt(0);
        String ans = "";
        for(char ch : str.toCharArray()){
            if(ch==charToRemove) continue;
            ans+=ch;
        }
        System.out.println(ans);
        sc.close();

    }
}
