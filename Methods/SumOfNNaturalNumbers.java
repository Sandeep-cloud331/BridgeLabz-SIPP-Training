import java.util.*;

public class SumOfNNaturalsNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int num = sc.nextInt();
        int ans = sum(num);
        System.out.println("The sum of natural numbers upto " + num + " is " + ans);
    }

    public static int sum(int num) {
        return num * (num + 1) / 2;
    }
}