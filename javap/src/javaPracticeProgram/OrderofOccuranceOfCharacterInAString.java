package javaPracticeProgram;

public class OrderofOccuranceOfCharacterInAString {

	public static void main(String[] args) {
		String s = "aabbbbbccdbbbhfzhjsdichosijaijcdlahoichihachadhvclszlckjld";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = i+1; j < s.length(); j++) {
				if (s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			
			if (count==0) {
				int count1 = 0;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(i)==s.charAt(j)) {
						count1++;
					}
				}
				
				System.out.print(count1+""+s.charAt(i)+" ");
			}
		}

	}

}
