package week3Day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
   
	static String s = "We learn java basics as part of java sessions in java week1";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] res = s.split(" ");
		
		// set doesn't allow duplication
		// LinkedHashset will follow the insertion order
		Set<String> s = new LinkedHashSet<String>();
		for (int i = 0; i < res.length; i++) {
			s.add(res[i]);
 		}
		
		System.out.println(s);
		

	}

}
