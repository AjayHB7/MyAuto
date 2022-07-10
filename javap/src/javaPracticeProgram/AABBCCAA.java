package javaPracticeProgram;

import java.util.LinkedList;

import org.w3c.dom.stylesheets.LinkStyle;

public class AABBCCAA {

	public static void main(String[] args) {
		
		String str = "my name is ajay"; //2A2B2C2A
		String[] sstr = str.split(" ");
//		System.out.println(sstr);
		
		for (int i = sstr.length-1 ; i >= 0; i--) {
			
			String s = sstr[i].substring(0, 1).toUpperCase()+sstr[i].substring(1, sstr[i].length());
			
			System.out.print(s+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		String str = "aabbabbababa"; //aabbaabbaabb
//		String a="";
//		String b="";
//		String c= a;
//		
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i)=='a') {
//				a+=str.charAt(i);
//			}else{
//				b+=str.charAt(i);
//			}
//			
//		}
//		
//		
//		
////		System.out.println(a.substring(2, a.length()));
//		
//		int j = 0;
//		for (int i = 0; i < str.length() ; i++) {
//			
//			if (i%2==0) {
//				
//			a = a.substring(0, i)+b.substring(0, i)+a.substring(i,a.length());
//			j+=2;
//			}			
//		}
//		
//		System.out.println(a);
		



		
//		LinkedList<Character> sstr = new LinkedList<Character>();
//		
//		for (int i = 0; i < str.length(); i++) {
//			sstr.add(str.charAt(i));
//		}
//		
//		for (Character character : sstr) {
//			if (character=='a') {
//				
//			}
//		}
		


	}

}
