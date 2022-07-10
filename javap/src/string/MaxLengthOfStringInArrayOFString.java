package string;

public class MaxLengthOfStringInArrayOFString {

	public static void main(String[] args) {
		String[] sarr = {"hiii","hello","hey"};
		
		int maxlength = sarr[0].length();
		
		for (int i = 0; i < sarr.length; i++) {
			if (maxlength<sarr[i].length()) {
				maxlength=sarr[i].length();
			}
			
		}
		
		for (int i = 0; i < sarr.length; i++) {
			if (sarr[i].length()==maxlength) {
				System.out.println(sarr[i]);
			}
		}
		
		
		
		
		
	}

}
