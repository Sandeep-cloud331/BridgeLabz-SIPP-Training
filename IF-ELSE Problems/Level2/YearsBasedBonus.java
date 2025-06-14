import java.util.Scanner;

public class YearsBasedBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Salary Amount :");
        double salary = input.nextInt();

        System.out.println("Years of service :");
        int serviceYears = input.nextInt();

        double bonus = (5*salary)/100;

        if(serviceYears >5){
            System.out.println("your bonus is :"+ bonus);
        }
        else{
            System.out.println("No! bonus for you");
        }
        input.close();
    }
}
