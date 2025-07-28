package Sorting;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {4,5,3,2,1};
		BubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void BubbleSort(int[] arr) {
		for(int turn = 1; turn<arr.length; turn++) {
			for(int i=0; i<arr.length-turn; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				} 
			}
		}
	}
}
