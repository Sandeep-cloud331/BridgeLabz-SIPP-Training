package Sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {100,99,300,276,165};
		System.out.println(Arrays.toString(mergeSort(arr,0,arr.length-1)));
		
	}
	public static int[] mergeSort(int[] arr, int left, int right) {
        if(left==right) {
        	int[] a = new int[1];
        	a[0] = arr[left];
        	return a;
        }
        int mid = (left+right)/2;
		int [] fa = mergeSort(arr,left,mid);
		int [] sa = mergeSort(arr,mid+1,right);
		return Merge(fa,sa);
    }
	private static int[] Merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;
		int[] ans = new int[n+m];
		int i=0,j=0,k=0;
		while(i<n && j<m) {
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
		
	}
	

}
