package string;

import java.util.ArrayList;
import java.util.TreeSet;

public class Substring {

	public static void main(String[] args) {
		String str = "qwqwqwqwqwqw";

		TreeSet<Character> str1 = new TreeSet<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			str1.add(str.charAt(i));
		}

		ArrayList<Character> astr = new ArrayList<Character>(str1);
		
		String a = "";
		String b = "";
		String ab = "";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==astr.get(0)) {
				a+= str.charAt(i);
			}else if(str.charAt(i)==astr.get(1)){
				b+= str.charAt(i);
			}
		}
		
//		System.out.println(a+" "+b);
		
		for (int i = 0; i < a.length(); i++) {
			
			ab += a.substring(i, i+2)+b.substring(i, i+2);
			i++;
			
		}
		
		
		System.out.println(ab);


	}

}
