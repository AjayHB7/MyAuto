package string;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		String str = "Hi My Name Is Ajay";
		String[] sstr = str.split(" ");
		
		for (int i = 0; i < sstr.length; i++) {
			
			for (int j = sstr[i].length()-1 ; j >= 0 ; j--) {
				System.out.print(sstr[i].charAt(j));
			}
			System.out.print(" ");
		}
		
		
	}
}
