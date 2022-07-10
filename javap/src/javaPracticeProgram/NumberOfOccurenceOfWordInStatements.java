package javaPracticeProgram;

import java.util.LinkedHashSet;

public class NumberOfOccurenceOfWordInStatements {

	public static void main(String[] args) {
		String s = "this is me trying to make up a statement";
		
		String[] sarr = s.split(" ");
		
		LinkedHashSet<String> sset = new LinkedHashSet<String>();
		
		for (String word : sarr) {
			sset.add(word);
		}
		
		for (String word : sset) {
			int count = 0;
//			System.out.println(word);
			for (String sword : sarr) {
				if (word.equals(sword)) {
					count++;
				}
			}
			System.out.println(word+":"+count);
			
		}		

	}

}
