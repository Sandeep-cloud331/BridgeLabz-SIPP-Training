import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            String[] arr = new String[num+1];
            for(int i=0; i<=num; i++){
                if(i%3==0) arr[i]="Fizz";
                else if(i%5==0) arr[i]="Buzz";
                else arr[i]=Integer.toString(i);
                if(i%3==0 && i%5==0) arr[i]="FizzBuzz";
            }
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Please enter a positive number");
        }
    }
}