package string;

public class P123112233 {
	public static void main(String[] args) {
		int num = 123;
		int rev = 0;

		while(num>0){
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		int num1=rev;
		int count = 0;

		while(count<2){
			rev=num1;
			while(rev>0){
				
				int rem = rev%10;
				rev = rev/10;
				
				for (int i = 0; i <= count; i++) {
					System.out.print(rem);
				}
				
			}
			count++;


		}



	}
}
