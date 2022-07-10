package javaPracticeProgram;

public class ReverseingStringwithOutChangingThePositonOfSpaces {

	public static void main(String[] args) {
		String s = "this is me trying to find logic to this question";
		String rev = "";
		String r = "";

		for (int i = s.length()-1; i >= 0 ; i--) {
			if(!(s.charAt(i)==' ')){
				r=rev=rev+s.charAt(i);
			}
		}

		System.out.println(rev);

		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==' '){
				rev = rev.substring(0, i)+" "+rev.substring(i, rev.length());

			}
		}

	}

}
