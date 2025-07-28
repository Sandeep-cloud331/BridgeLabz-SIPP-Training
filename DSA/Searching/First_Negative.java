package Searching;

public class First_Negative {
	public static void main(String[] args) {
		int[] arr = {1,2,3,-4,-5,6,7};
		System.out.println(search(arr));
	}
	public static int search(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]<0) return arr[i];
		}
		return -1;
	}
}
