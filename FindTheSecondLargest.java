package week3Day2;

import java.util.Arrays;

public class FindTheSecondLargest {

	static int[] data = { 3, 2, 11, 4, 6, 7 };

	static void findSecondLargestUsingSort(int[] arr) {
		int i = 0;
		int firstHighest = -1;
		int secondHigest = -2;
		while (arr.length > i) {
			if (arr[i] > firstHighest) {
				secondHigest = firstHighest;
				firstHighest = arr[i];	
			} else if (arr[i] > secondHigest) {
				secondHigest = arr[i];
			}
			i++;
		}
		System.out.println("second highest num is  " + secondHigest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findSecondLargestUsingSort(data);

		// using sort
		Arrays.sort(data);
		System.out.println("second largest number is " + data[data.length - 2]);

	}
}

   