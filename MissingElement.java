package week3Day2;

public class MissingElement {
	static int[] arr = { 1, 2, 3, 4, 5, 6, 8 };

	static void findMissingNum(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
           if(arr[i] != i+1) {
        	   System.out.println("missing number is " + (i+1));
        	   break;
           }
		}
	}

	public static void main(String[] args) {
		findMissingNum(arr);
	}
}
