package week3Day2;

import java.util.HashSet;
import java.util.Set;

public class FindFirstInterSection {

	static int[] firstArr = { 3, 2, 11, 4, 6, 7 };
	static int[] secondArr = { 1, 2, 8, 4, 9, 7 };

	static void firstIntersectionNum(int[] a, int[] b) {
        
		// adding to hash set class
		Set<Integer> firstArr = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			firstArr.add(a[i]);
		}
        
		// checking the for first number which is already present
		// if condition it will print first number and 
		// breaks the loop
		for (int i = 0; i < b.length; i++) {
			if (!!firstArr.contains(b[i])) {
				System.out.println("first intersection number is: " + b[i]); 
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       firstIntersectionNum(firstArr,secondArr);
	}

}
