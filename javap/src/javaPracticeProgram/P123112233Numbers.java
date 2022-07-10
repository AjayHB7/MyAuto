package javaPracticeProgram;

public class P123112233Numbers {

	public static void main(String[] args) {


		int num = 456;
		int rev = 0;

		while(num>0){
			int rem = num%10;
			rev=rev*10+rem;
			num=num/10;
		}

		int num1 = rev;
		
		int count = 1;
		
		for(;;){		

			while(rev>0){
				int rem = rev%10;
				rev=rev/10;
				for (int i = 0; i < count; i++) {
					System.out.print(rem);
				}
			}
			
			count++;
			rev=num1;
			
			if (count>2) break;
			
			
		}












































//
//		int number = 123;
//		int num = 0;
//
//		while(number>0){
//			int rem = number%10;
//			num = num*10+rem;
//			number = number/10;
//		}
//		int num1=num;
//
//		//		System.out.println(num);
//		int count = 1;
//		//		boolean flag=true;
//
//		while(count<=2){
//
//			while(num>0){
//
//				int rem = num%10;
//				num = num/10;
//				for (int i = 0; i < count; i++) {
//					System.out.print(rem);
//				}
//
//			}
//
//			count++;
//			num=num1;
//			//			if (count==4) {
//			//				flag=false;
//			//			}
//		}
//
	}

}
