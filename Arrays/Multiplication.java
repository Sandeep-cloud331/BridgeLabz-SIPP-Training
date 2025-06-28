import java.util.*;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] multiplication_array = new int[10];
        for(int i=1; i<=10; i++){
            multiplication_array[i-1]=i*num;
        }
        for(int i=1; i<=10; i++){
            System.out.println(num +  " X " + i + " -> "+ multiplication_array[i-1]);
        }
    }
}
