package javaPracticeProgram;

public class FindMaxWordInTheString {

	public static void main(String[] args) {

		String str = "Education is the ability to listen to almost anything without losing your temper or self-confidence";

		String[] strarr = str.split(" ");
		
		String maxlengthword = strarr[0];
		
		for (int i = 0; i < strarr.length; i++) {
			
			if(maxlengthword.length() < strarr[i].length()){
				
				maxlengthword = strarr[i];  
			}
			
		}
		
		System.out.println(maxlengthword);
	}

}
