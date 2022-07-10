package javaPracticeProgram;

public class SwapFirstAndLastWordOfString {

	public static void main(String[] args) {
		String str = "Education is the ability to listen to almost anything without losing your temper or self confidence";
		
		String[] strarr = str.split(" ");
		
		
		String temp="";
		
		
		temp = strarr[0];		
	
		strarr[0] = strarr[strarr.length-1];
		
		strarr[strarr.length-1] = temp;

		for (int i = 0; i < strarr.length; i++) {
			System.out.print(strarr[i]+" ");
		}
	}

}
