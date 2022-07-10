package javaPracticeProgram;

import java.util.LinkedHashSet;

public class RemovingDuplicatesFromString {

	public static void main(String[] args) {
		String s = 	"TESTYANTRA";
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			
			set.add(s.charAt(i));
			
		}
		
		System.out.println("printing string without duplicate character");
		
		String s2 = "";
		
		for (Character charec : set) {
			s2+= charec;
			
		}
		
		System.out.println(s2);
		
		System.out.println("printing unique character with count");
		
		
		for (Character character : set) {
			
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if(character==s.charAt(i)){
					count++;
				}
			}
			 System.out.print("the count of "+character+" is "+count+"   ");
			
			
		}
		
		
		
		
		
		
	}

}
