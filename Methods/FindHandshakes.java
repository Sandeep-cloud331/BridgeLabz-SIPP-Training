import java.util.Scanner;

public class FindHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans  = handshakes(n);
        System.out.println(ans);
    }
    public static int handshakes(int n){
        return (n*(n-1))/2;
    }
}
