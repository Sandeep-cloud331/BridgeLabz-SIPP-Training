public class LCMAndGCD {
    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int lcm = a*b;
        int gcd;
        while(a>0 && b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        if(a!=0) gcd=a;
        else gcd=b;
        lcm/=gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
