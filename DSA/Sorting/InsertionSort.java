package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int[] id = {3,1,5,6,4,8,7,2,9};
		insertionsort(id);
		System.out.println(Arrays.toString(id));
	}

	private static void insertionsort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int j=i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		
	}
}
