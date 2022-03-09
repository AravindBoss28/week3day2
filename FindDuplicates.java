package week3Day2;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {

	static int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };

	static ArrayList<Integer> findDuplicate(int[] arr) {
		// create 2 array list
		// al to store array values
		// dupparr to return the dup values
		ArrayList<Integer> dupArr = new ArrayList<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();

		// adding all array values in array list
		for (int i = 0; i < arr.length; i++) {
			al.add(arr[i]);
		}

		// since we have the arraylist in sorted format -->
		// [12,13,14,14,15,16,16,17,18,19,20]

		for (int i = 0; i < al.size(); i++) {

			// i stores the current index
			// sample output for duplicate value
			// i index is 2 and while using al.lastIndexOf(14) it will return 3
			// condition matches
			if (i != al.lastIndexOf(al.get(i))) {

				// storing the duplicate in dup arraylist
				dupArr.add(al.get(i));

				// changing i value to 3 doing this to reduce the loop count and as well as to
				// avoid duplication storage
				i = al.lastIndexOf(al.get(i));
			}
		}

		return dupArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// sort the array first
		Arrays.sort(arr);

		System.out.println(findDuplicate(arr));
	}

}
