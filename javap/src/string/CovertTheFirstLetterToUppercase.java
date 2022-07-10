package string;

public class CovertTheFirstLetterToUppercase {
	public static void main(String[] args) {
		
		String str = "my name is ajay";
		
		String[] strarry = str.split(" ");
		
		for (int i = 0; i < strarry.length; i++) {
			String word = strarry[i];
			for (int j = 0; j < word.length(); j++) {
				if (j==0) {
					
					System.out.print(Character.toUpperCase(word.charAt(j)));
				}else {
					System.out.print(word.charAt(j));
				}		
				
			}
			System.out.print(" ");
		}
	}
}
