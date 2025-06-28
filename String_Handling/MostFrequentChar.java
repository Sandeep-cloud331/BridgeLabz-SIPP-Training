import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = mostFre(str);
        System.out.println(ch);
        sc.close();
    }
    public static char mostFre(String str){
        int[] ans = new int[26];
        for(char ch : str.toCharArray()){
            ans[ch-'a']++;
        }
        int maxI = -1;
        for(int i=0; i<ans.length; i++){
            if(ans[i]>maxI){
                maxI = i;
            }
        }
        return (char)(maxI+97);
    
    }
}
