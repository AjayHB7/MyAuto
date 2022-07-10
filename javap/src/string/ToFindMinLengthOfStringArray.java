package string;

public class ToFindMinLengthOfStringArray {
	public static void main(String[] args) {
		String[] sarr = {"asus","vivobook","note", "my"};
		int minlength = sarr[0].length();
		
		for (int i = 0; i < sarr.length; i++) {
			if (minlength>sarr[i].length()) {
				minlength=sarr[i].length();
			}
		}
		
		for (int i = 0; i < sarr.length; i++) {
			if (sarr[i].length()==minlength) {
				System.out.println(sarr[i]);
			}
		}
	}
}
