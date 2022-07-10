package javaPracticeProgram;

public class ReverseEachWordOfAnStatements {

	public static void main(String[] args) {
		String s = "right now i am learning java programming using java langauge in java session in gc6 training room" ;
		String[] sarr = s.split(" ");
		for (String word : sarr) {
			for (int i = word.length()-1; i >= 0; i--) {
				System.out.print(word.charAt(i));
			}
			System.out.print(" ");
		}
		
		System.out.println();
		
		// prints the entire string in reverse order
		for (int i = s.length()-1; i >= 0 ; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
