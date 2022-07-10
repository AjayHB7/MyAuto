package javaPracticeProgram;

import java.util.LinkedHashSet;

public class PrintOnlyduplicatesInTheSentence {

	public static void main(String[] args) {
		String sentence = "welcome to the to welcome to the testyantra";
		String[] sentncarry = sentence.split(" ");

		/*
		//without using collections
		for (int i = 0; i < sentncarry.length; i++) {
			int count = 0;
			for (int j = i+1 ; j < sentncarry.length; j++) {
				if (sentncarry[i].equals(sentncarry[j])) {
					count++;
				}
			}
			
	
			if (count==1) {
				System.out.println(sentncarry[i]);
		
			}
		}
		*/
		
		// using collections
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for (int i = 0; i < sentncarry.length; i++) {
			set.add(sentncarry[i]);
		}
		
		for (String str1 : set) {
			int count = 0;
			for (String srt2 : sentncarry) {
				if (str1.equals(srt2)) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(str1);
			}
		}
		
		
		
		
	}

}
