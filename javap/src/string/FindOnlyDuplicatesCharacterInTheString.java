package string;

public class FindOnlyDuplicatesCharacterInTheString {

	public static void main(String[] args) {
		String str = "jdkjhdksk";
		
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			for (int j = i+1; j < str.length(); j++) {
				if (str.charAt(i)==str.charAt(j)) {
					count++;
				}
			}
			
			if (count==1) {
				int count1 = 0;
				for (int k = 0; k < str.length(); k++) {
					if (str.charAt(i)==str.charAt(k)) {
						count1++;
					}
				}
				System.out.print(str.charAt(i)+"="+count1+" "); //j=1 a=2 y=1 
			}
		}

	}

}
