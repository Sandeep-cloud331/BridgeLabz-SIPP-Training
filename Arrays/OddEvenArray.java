import java.util.ArrayList;
import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
        
        System.out.println("\nEven Numbers:");
        for (int x : evenList) {
            System.out.print(x + " ");
        }

        System.out.println("\nOdd Numbers:");
        for (int x : oddList) {
            System.out.print(x + " ");
        }
    }
}
