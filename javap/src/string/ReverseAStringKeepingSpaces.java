package string;

public class ReverseAStringKeepingSpaces {
	public static void main(String[] args) {
		String str = "i am learning java programing";
		String rev = "";
		
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) != ' ') {
				rev += str.charAt(i);
			}
		}
		System.out.println(rev);
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)==' ') {
				rev=rev.substring(0, i)+" "+rev.substring(i, rev.length()-1);
			}
		}
		System.out.println(rev);		
	}
}
