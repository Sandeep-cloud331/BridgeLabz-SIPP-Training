import java.util.Scanner;

public class CalculateSI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int principal = sc.nextInt();
        System.out.println("Enter the rate(in %): ");
        int rate = sc.nextInt();
        System.out.println("Enter time(in years): ");
        int time = sc.nextInt();
        int ans = simpleInterest(principal, rate, time);
        System.out.println("Simple interest is: "+ans);

    }
    public static int simpleInterest(int p, int r, int t){
        int ans = (p*r*t)/100;
        return ans;
    }
}
