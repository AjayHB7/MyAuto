package javaPracticeProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class AfollowedByB {

	public static void main(String[] args) {	
		
		int[] nums = {3,4,6,5,3,5,7,0,4,6,8,9};
		
		for (int i = 0; i < nums.length; i++) {
			int count =0;
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i]==nums[j]) {
					count++;
				}
			}
			if (count==0) {
				System.out.print(nums[i]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "i am a automation engineer";
//		
//		for (int i = 0; i < str.length(); i++) {
//			int count = 0;
//			for (int j = i+1; j < str.length(); j++) {
//				if (str.charAt(i)==str.charAt(j)) {
//					count++;
//				}
//				
//			}
//			if (count==0) {
//				System.out.print(str.charAt(i));
//			}
//		}
		
		
		
		
		
		
		
		
		
		
		
		

		//i am  uton egr
		
//		LinkedHashSet<Character> str1 = new LinkedHashSet<Character>();
//		
//		for (int i = 0; i < str.length(); i++) {
//			str1.add(str.charAt(i));
//		}
//		
//		str1.remove(' ');
//		System.out.println(str1);		
//		boolean flag = false;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)==' ') {
//				System.out.print(' ');
//			}
//			for (Character charact : str1) {
//				if (charact==str.charAt(i)) {
//					System.out.print(str.charAt(i));
//					flag= true;
//				}				
//			}
//			if (flag) {
//				str1.remove(str.charAt(i));
//			}
//		}
//		
		
		
		
		
		
		}
		
	}	
		
		
		
		
		
		
//
//
//		O/P
//		================
//
//		i = 3
//
//		a = 4
//
//		m = 2
//
//		u = 1
//
//		t = 2
//
//		o = 2
//
//		n = 3
//		Unique :>>  ....
//
//		"I am utoin eger"
		
		
		




