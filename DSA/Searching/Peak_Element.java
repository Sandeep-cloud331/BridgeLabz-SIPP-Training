package Searching;

public class Peak_Element {
	public static void main(String[] args) {
		int[] arr = {1,2,3,1};
		System.out.println(findPeakElement(arr));
	}

	public static int findPeakElement(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			int mid = (i + j) / 2;
			if (arr[mid] > arr[mid + 1])
				j = mid;
			else
				i = mid + 1;
		}
		return i;
	}

}
