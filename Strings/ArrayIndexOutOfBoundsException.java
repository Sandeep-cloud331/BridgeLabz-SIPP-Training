import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for(int i=0; i<n; i++) names[i]=sc.next();
        generateException(names);
        handleException(names);


    }
    public static void generateException(String[] arr){
        for(int i=0; i<=arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void handleException(String[] arr){
        try {
            generateException(arr);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
