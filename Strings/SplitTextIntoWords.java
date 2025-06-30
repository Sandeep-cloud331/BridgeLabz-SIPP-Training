import java.util.*;
public class SplitTextIntoWords {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] ans = split(str);
		for(int i=0; i<ans.length; i++) {
			System.out.println(ans[i]+" "+find(ans[i]));
		}
	
	}
	public static String[] split(String str) {
		List<String> ll = new ArrayList<>();
		int idx = 0;
	    int s = 0;
	    while (idx < str.length()) {
	        if (str.charAt(idx) == ' ') {
	            if (s < idx) {
	                ll.add(str.substring(s, idx));
	            }
	            s = idx + 1;
	        }
	        idx++;
	    }
	    if (s < str.length()) {
	        ll.add(str.substring(s));
	    }
	    String[] arr = new String[ll.size()];
	    int i=0;
	    for(String word : ll) {
	    	arr[i++]=word;
	    }
	    return arr;
	    
	}
	public static int find(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return count;
    }

}
