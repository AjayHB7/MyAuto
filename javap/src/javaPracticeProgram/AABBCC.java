package javaPracticeProgram;

public class AABBCC {

	public static void main(String[] args) {
		String s1 = "AABBCC"; // 2A2B2C
		
		for (int i = 0; i < s1.length(); i++) {
			int count = 0;
			for (int j = i+1; j < s1.length(); j++) {
				if (s1.charAt(i)==s1.charAt(j)) {
					count++;
				}
			}
			if (count==0) {
				int count1 = 0;
//				System.out.println(s1.charAt(i));
				for (int k = 0; k < s1.length(); k++) {
					if (s1.charAt(i)==s1.charAt(k)) {
						count1++;
					}
					
					
				}
				System.out.println(s1.charAt(i)+"="+count1);
			}
		}
		
//		for (char c = 'A'; c <= 'z';  c++) {
//			int count= 0;
//			for (int i = 0; i < s1.length(); i++) {
//				if (c==s1.charAt(i)) {
//					count++;
//				}
//			}
//			System.out.println(c+"="+count);
//			if (c==s1.charAt(s1.length()-1)) {
//				break;
//			}
//		}
		

	}

}
