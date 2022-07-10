package string;

public class AAABBB {

	public static void main(String[] args) {
		String str = "cccccccccvvvvvvvvv";
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		
		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i)==str.charAt(i+1)) {
				count1++;
			}else{
				count2++;
				count3=count1;
				count1=0;
			}
		}
		
		if(count1==count3 && count2==1){
			System.out.println("string is valid");
		}else{
			System.out.println("string is invalid");
		}

	}

}
