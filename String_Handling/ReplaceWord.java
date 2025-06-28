import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String wordToReplace = sc.next();
        String ReplaceWith = sc.next();
        str = str.replace(wordToReplace, ReplaceWith);
        System.out.println(str);
        sc.close();
    }
}
