package string;

public class ReverseEachWordInAString {
	public static void main(String[] args) {
		String str = "Love And Peace";
		
		String[] sarr = str.split(" ");
		
		for (int i = 0; i < sarr.length; i++) {
			for (int j = sarr[i].length()-1 ; j >= 0 ; j--) {
				System.out.print(sarr[i].charAt(j));
			}
			
			System.out.print(" ");
			
		}
		
		
	}
}
