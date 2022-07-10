package string;

public class SwapFirstAndLastString {

	public static void main(String[] args) {
		String str = "love and peace";
		String[] sarr = str.split(" ");
		
		String temp ="";
		
		temp = sarr[0];
		sarr[0]=sarr[sarr.length-1];
		sarr[sarr.length-1] = temp;
		
		
		for (int i = 0; i < sarr.length; i++) {
			
			System.out.print(sarr[i]+" ");
			
		}

	}

}
